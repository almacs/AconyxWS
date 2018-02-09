/*
 * Created on July, 2009.
 * Project: Integration TIBCO – M5
 * 			Provisioning and service activation.
 */

package com.acc.tibco.interfaceAconyx.motor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

import org.apache.log4j.Logger;

import com.acc.tibco.interfaceAconyx.VO.VOLoadData;
import com.acc.tibco.interfaceAconyx.VO.VOBuildHashProperties;
import com.acc.tibco.interfaceAconyx.VO.VOBuildHashTable;
import com.acc.tibco.interfaceAconyx.VO.VODataToProcess;
import com.acc.tibco.interfaceAconyx.VO.VOOperationAconyx;
import com.acc.tibco.interfaceAconyx.VO.VOOutParameters;
import com.acc.tibco.interfaceAconyx.VO.VOParametersAconyx;
import com.acc.tibco.interfaceAconyx.VO.VOReturnValue;
import com.acc.tibco.interfaceAconyx.dao.DAODataToProcess;
import com.acc.tibco.interfaceAconyx.dao.DAOOperationAconyx;
import com.acc.tibco.interfaceAconyx.dao.DAOParametersAconyx;
import com.acc.tibco.interfaceAconyx.exception.ProcessingOperationException;
import com.acc.tibco.interfaceAconyx.exception.ResolvingParametersException;
import com.acc.tibco.interfaceAconyx.exception.InternalErrorException;
import com.acc.tibco.interfaceAconyx.util.TibcoBWLog;
import com.acc.tibco.interfaceAconyx.util.ExecuteApi;

/**
 * This class are called for initializing the process
 * which happened resolving a parameter.
 *
 * @author  ACCENTURE
 * @version 1.0
 */
public class SequencesProvisioningManager implements Serializable{
	
	private static final long serialVersionUID = 1L;
    private static Logger log = TibcoBWLog.getLogger(SequencesProvisioningManager.class);

	/**	
     * Constructor by default.
     */
    public SequencesProvisioningManager (){
    	
    }
    
	/**	
     * Method called to start the process of execution of operations of a specified web service.
     * 
     * @param 	initialProperTable  Indicates the initial parameters of the process.
     * 		    <code>VOBuildHashTable</code>
     * @param	loadData			Indicates all operations to be executed in the process.
     * 		 	<code>VOLoadData</code>
     * @return	The result of the process.
     * 			<code>VOReturnValue</code>
     */
	public static VOReturnValue provisioningProcess(VOBuildHashTable initialProperTable,
													VOLoadData  loadData ){
		
		log.debug("****************************************************************************");
		log.debug("***************** - initializing execution of operations - *****************");
		log.debug("************************** - in Aconyx Interface - *************************");
		log.debug("****************************************************************************");

		Hashtable<String, Object> pool_var  = new Hashtable<String, Object>();
		Hashtable<String, String> pool_varList  = new Hashtable<String, String>();
		int retryExecOper = 1; 
		StringBuffer sExecOper = new StringBuffer();

		VOReturnValue result = null;
		Boolean logOK = false;
		VODataToProcess[] arrprovisioningOperations = null;
		Vector<VODataToProcess> provisioningOperations = new Vector<VODataToProcess>();
		
		try {
			log.debug("Initializing Variables");

			arrprovisioningOperations = loadData.getVODataToProcess();		

			for (int i = 0; i < arrprovisioningOperations.length; i++) {
				provisioningOperations.add(arrprovisioningOperations[i]);
			}
			
			initialValues(initialProperTable, pool_var);
			pool_varList = DAOParametersAconyx.getSQLParameters();
			
			retryExecOper =2;
			//retryExecOper = Integer.parseInt(com.tibco.pe.plugin.PluginProperties.getProperty( 
			//								 "tibco.clientVar.GVJavaProcess/retryExecOper"));
			
			log.debug("Authenticate users");
			startProcess(retryExecOper, sExecOper, pool_var, pool_varList);
			
			logOK = true;
			log.debug("Executing the sequence of Transactions");
			executionSequence(provisioningOperations, retryExecOper, sExecOper, pool_var, pool_varList);

			result = generatingResponse("Success", "Successful operation", pool_var);
			log.debug("Result: " + result);
			log.debug("  ------------------------------ End Of The Process ------------------------------");

		} catch (ProcessingOperationException e) {
			result = generatingResponse("Error", e.getMessage(), pool_var);
			log.debug("It happened ProcessingOperationException in Operation " + e.getOperation()
					  + " with error: " + e.getMessage());
		} catch (ResolvingParametersException e){
			result = generatingResponse("Error", e.getMessage(), pool_var);
			log.debug("It happened ResolvingParametersException in Parameter " + e.getParameter()
					  + " with error: " + e.getMessage());
		} catch (InternalErrorException e){
			result = generatingResponse("Error", e.getMessage(), pool_var);
			log.debug("It happened InternalErrorException "+ e.getMessage());
		}finally{
			try {
				if (logOK == true){
					endProcess(retryExecOper, sExecOper, pool_var, pool_varList);
				}
			}catch (ProcessingOperationException e) {
				result = generatingResponse("Error", e.getMessage(), pool_var);
				log.debug("It happened ProcessingOperationException in Operation " + e.getOperation()
						  + " with error: " + e.getMessage());
			} catch (ResolvingParametersException e){
				result = generatingResponse("Error", e.getMessage(), pool_var);
				log.debug("It happened ResolvingParametersException in Parameter " + e.getParameter()
						  + " with error: " + e.getMessage());
			} catch (InternalErrorException e){
				result = generatingResponse("Error", e.getMessage(), pool_var);
				log.debug("It happened InternalErrorException "+ e.getMessage());
			}
		}
		return result;
	}

	/**	
     * Initializing the input parameters of the process in a hash table.
     * 
     * @param 		initialProperTable  	Indicates the initial parameters of the process.
     * @param		pool_var				Indicates the variable of the process which
     * 										store the resolved parameters.
     * @exception	InternalErrorException	Exception occurred during the execution of the method.
     */
	private static void initialValues(VOBuildHashTable initialProperTable,
									  						Hashtable<String, Object> pool_var) 
									  									throws InternalErrorException{
		log.debug("Initializing Input Parameter");
		try{
			VOBuildHashProperties []initialProperties = null;
			initialProperties = initialProperTable.getBuildHashPropeties();
			for (int i = 0; i < initialProperties.length; i++) {
				if (initialProperties[i].getValue() != null){
					log.debug("                   Parameter " + i + ": key = " + initialProperties[i].getKey()
																+ ", value = " + initialProperties[i].getValue());
					pool_var.put(initialProperties[i].getKey(), initialProperties[i].getValue());
				}
			}
		} catch (Exception e){
			throw new InternalErrorException(e.getMessage());
		}
	}

	/**	
     * Executes the operations for starting the process.
     * <br>
     * Basically represents the operations of login in the external interface.
     * 
     * @param 		retryExecOper  			Indicates attempts to reprocess the execution of operations 
     * 										where the external interface generates an error.
     * @param		sExecOper				contains the record of the transactions executed.
     * @param		pool_var				Indicates the variable of the process which
     * 										store the resolved parameters.
     * @param		pool_varList			Indicates all variables whose value is represented by a SQL.
     * @exception	ProcessingOperationException	Exception occurred during the execution of the sequence
     * 												of operation.
     * @exception	ResolvingParametersException	Exception occurred during the resolution of parameters.
     * @exception	InternalErrorException			Exception occurred during the execution of the method;
     * 												This error or exception is not part of resolving
     * 												an operation or parameter.. 
     */	
	private static void startProcess(int retryExecOper, StringBuffer sExecOper,
									 Hashtable<String, Object> pool_var, 
									 Hashtable<String, String> pool_varList) 
														throws ProcessingOperationException, 
															   ResolvingParametersException, 
															   InternalErrorException{
		log.debug("Initializing StartProcess");
		Vector<VODataToProcess> voDataToProcess = new Vector<VODataToProcess>();
		voDataToProcess = DAODataToProcess.getDataToProcessByTransaction("StartProcess");
		if (voDataToProcess.size()!= 0){
			executionSequence(voDataToProcess, retryExecOper, sExecOper, pool_var, pool_varList);
		}
	}
	
	/**	
     * Executes the operations for ending the process.
     * <br>
     * Basically represents the operations of logout in the external interface.
     * 
     * @param 		retryExecOper  			Indicates attempts to reprocess the execution of operations 
     * 										where the external interface generates an error.
     * @param		sExecOper				contains the record of the transactions executed.
     * @param		pool_var				Indicates the variable of the process which
     * 										store the resolved parameters.
     * @param		pool_varList			Indicates all variables whose value is represented by a SQL.
     * @exception	ProcessingOperationException	Exception occurred during the execution of the sequence
     * 												of operation.
     * @exception	ResolvingParametersException	Exception occurred during the resolution of parameters.
     * @exception	InternalErrorException			Exception occurred during the execution of the method;
     * 												This error or exception is not part of resolving
     * 												an operation or parameter.. 
     */	
	private static void endProcess(int retryExecOper, StringBuffer sExecOper, 
								   Hashtable<String, Object> pool_var, 
								   Hashtable<String, String> pool_varList) 
														throws ProcessingOperationException, 
															   ResolvingParametersException, 
															   InternalErrorException{
		log.debug("Initializing EndProcess");
		Vector<VODataToProcess> voDataToProcess = new Vector<VODataToProcess>();
		voDataToProcess = DAODataToProcess.getDataToProcessByTransaction("EndProcess");
		if (voDataToProcess.size()!= 0){
			executionSequence(voDataToProcess, retryExecOper, sExecOper, pool_var, pool_varList);
		}
	}

	/**	
     * Executes the sequence of operations for which the process were called.
     * 
     * @param 		voDataToProcess  		Indicates the operations to process. 
     * @param 		retryExecOper  			Indicates attempts to re process the execution of operations 
     * 										where the external interface generates an error.
     * @param		sExecOper				contains the record of the transactions executed.
     * @param		pool_var				Indicates the variable of the process which
     * 										store the resolved parameters.
     * @param		pool_varList			Indicates all variables whose value is represented by a SQL.
     * @exception	ProcessingOperationException	Exception occurred during the execution of the sequence
     * 												of operation.
     * @exception	ResolvingParametersException	Exception occurred during the resolution of parameters.
     * @exception	InternalErrorException			Exception occurred during the execution of the method;
     * 												This error or exception is not part of resolving
     * 												an operation or parameter.. 
     */	
	private static void executionSequence(Vector<VODataToProcess> voDataToProcess, 
										  int retryExecOper, StringBuffer sExecOper,
										  Hashtable<String, Object> pool_var, 
										  Hashtable<String, String> pool_varList) 
															throws ProcessingOperationException, 
																   ResolvingParametersException,
																   InternalErrorException{
		log.debug("Initializing executionSequence");
		String operation= "";
		int paramSeq = 0;
		String resultString ="";
		Vector<VOParametersAconyx> vParam = new Vector<VOParametersAconyx>();
		VOOperationAconyx VOOperation = new VOOperationAconyx();

		if(voDataToProcess.size()!= 0){
			operation = voDataToProcess.elementAt(0).getOperation();
			
			for (int i = 0; i < voDataToProcess.size(); i++) {
				if(!operation.equals(voDataToProcess.elementAt(i).getOperation()) || 
					Integer.parseInt(voDataToProcess.elementAt(i).getParamSeq()) < paramSeq){
						
					VOOperation.setName(operation);
					VOOperation.setNameWebService(voDataToProcess.elementAt(i-1).getNameWebService());
					VOOperation.setNamePortWebService(voDataToProcess.elementAt(i-1).getNamePort());
					VOOperation.setTargetNamespaceWebService(voDataToProcess.elementAt(i-1).getTargetNamespace());
					VOOperation.setEndPointAddrWebService(voDataToProcess.elementAt(i-1).getEndPointAddress());
					
					VOParametersAconyx[] params= new VOParametersAconyx[vParam.size()];
					for (int k= 0; k< vParam.size(); k++) {
						params[k] = (VOParametersAconyx) vParam.get(k);
						
					}
					VOOperation.setParameters(params);
					params = null;

					log.debug("Executing Operation: " + operation);
					resultString = ExecuteApi.executeAPI(VOOperation, pool_var, retryExecOper);

					log.debug(resultString);
					
					log.debug("Processing the results of Operation");
					processResult(operation, resultString, retryExecOper, sExecOper, pool_var, pool_varList);
					
					// the operation is recorded after of validating that the result was not 'Error'
					sExecOper.append("'" + operation + "'" + ", ");
					
					vParam.removeAllElements();
				}
				vParam.add(processParameter(voDataToProcess.elementAt(i).getParameter(),
	   					voDataToProcess.elementAt(i).getValue(),
	   					pool_var,
						pool_varList));
				operation = voDataToProcess.elementAt(i).getOperation();
				paramSeq = Integer.parseInt(voDataToProcess.elementAt(i).getParamSeq());
			}
			// Executing the last Operation
			VOOperation.setName(operation);
			VOOperation.setNameWebService(voDataToProcess.elementAt(voDataToProcess.size()-1).getNameWebService());
			VOOperation.setNamePortWebService(voDataToProcess.elementAt(voDataToProcess.size()-1).getNamePort());
			VOOperation.setTargetNamespaceWebService(voDataToProcess.elementAt(voDataToProcess.size()-1).getTargetNamespace());
			VOOperation.setEndPointAddrWebService(voDataToProcess.elementAt(voDataToProcess.size()-1).getEndPointAddress());
			VOParametersAconyx[] params= new VOParametersAconyx[vParam.size()];
			for (int i= 0; i< vParam.size(); i++) {
				params[i] = (VOParametersAconyx) vParam.get(i);
				
			}
			VOOperation.setParameters(params);
			params = null;
			log.debug("Executing Operation: " + operation);
			resultString = ExecuteApi.executeAPI(VOOperation, pool_var, retryExecOper);
			
			log.debug(resultString);

			log.debug("Processing the results of Operation");
			processResult(operation, resultString, retryExecOper, sExecOper, pool_var, pool_varList);
			
		}else log.debug("There's no operations to execute");
	}
	
	/**	
     * Method to solve a parameter.
     * 
     * @param 		sParamName  			Indicates the name of the parameter. 
     * @param 		sParamValue  			Indicates the value to resolved.
     * @param		pool_var				Indicates the variable of the process which
     * 										store the resolved parameters.
     * @param		pool_varList			Indicates all variables whose value is represented by a SQL.
     * @return		VOParametersAconyx		Parameter with a  resolved value.
     * @exception	ResolvingParametersException	Exception occurred during the resolution of parameters.
     * @exception	InternalErrorException			Exception occurred during the execution of the method.
     */	
	@SuppressWarnings("unchecked")
	private static VOParametersAconyx processParameter(String sParamName, String sParamValue, 
																			   Hashtable<String, Object> pool_var,
																			   Hashtable<String, String> pool_varList) 
																							throws ResolvingParametersException, 
																				  			   	   InternalErrorException{
		log.debug("Initializing the process of a Parameter");
		log.debug("             Parameter : key = " + sParamName
								     + ", value = " + sParamValue);
		String var = null;
	    Object oValue = null;
		ArrayList<String> aList = null;
		// Look for the linear parameters whose value is a Global Variable in Tibco BW
			if(sParamValue.contains("~")){
				   if (pool_var.get(sParamName) != null){
					   if (pool_var.get(sParamName) instanceof ArrayList){
						   aList = (ArrayList<String>) pool_var.get(sParamName);
					   } else{
						   sParamValue = (String)pool_var.get(sParamName);
					   }
				   }else{
						   log.debug("It's a Variable " + sParamName);
						   
						   while (sParamValue.contains("~~")){
								log.debug("It's a Global Variable");
								log.debug("                      " + sParamName);
								// Look for the linear parameters whose value is a Global Variable in Tibco BW
								int index1 = sParamValue.indexOf("~~")+2;
								int index2 = sParamValue.indexOf("~~", index1);
								var = sParamValue.substring(index1, index2);
								if (pool_var.get(var) != null){
									sParamValue = sParamValue.replaceAll("~~" + var + "~~", (String)pool_var.get(var));
								}else{
									String sGV = processGlobalVariable(var);
									pool_var.put(var, sGV);
									sParamValue = sParamValue.replaceAll("~~" + var + "~~", sGV);
								}
						   }
		
						   while (sParamValue.contains("~")){
							   int index1 = sParamValue.indexOf("~")+1;
							   int index2 = sParamValue.indexOf("~", index1);
							   var = sParamValue.substring(index1, index2);
							   log.debug("It's a Variable " + var);
							   if (pool_var.get(var) != null){
								   oValue = pool_var.get(var);
							   }else{
								   oValue = processListVariable(var, pool_var, pool_varList); 
								   if (((ArrayList)oValue).size() > 0){
									   if (((ArrayList<String>) oValue).size()== 1){
										   oValue = (String)((ArrayList)oValue).get(0);
									   }
								   }else{
										throw new ResolvingParametersException("There's no possible to retrieve the value for the parameter ",
												sParamName, " variable " + var + " with no value"); 
								   }
								   pool_var.put(var, oValue);
								   pool_varList.remove(var);
							   }
								   // The parameter consists on a ArrayList
							   if (oValue instanceof ArrayList){
								   if (sParamValue.toUpperCase().startsWith("SELECT")){
										   sParamValue = sParamValue.replaceAll("~" + var + "~", "#" + var + "#");
								   }else {
									       if(index2 == sParamValue.length()){
											   //sParamValue = sParamValue.replaceAll("~" + var + "~", ((ArrayList)pool_var.get(var)).get(1).toString());
									    	   sParamValue = sParamValue.substring(1, sParamValue.length());
											   aList = (ArrayList)oValue;
									       }else{
											   log.debug("It's an iterable Parameter ~*");
											   
											   if (sParamValue.substring(index1-2,index1-1).equals("/")){
												   log.debug("The XML value will be iterable n API's");
												   sParamValue = sParamValue.replaceAll("/~" + var + "~", "#" + var + "#");
											   }else{
												   int index3 = sParamValue.substring(0, index1).lastIndexOf("<");
												   String tag1 = sParamValue.substring(index3, index1-1);
												   int index4 = sParamValue.indexOf(">", index2);
												   String tag2 = sParamValue.substring(index2+1, index4+1);
												   StringBuffer sElements = new StringBuffer();
												   for (Iterator iterator = ((ArrayList)oValue).iterator(); iterator.hasNext();) {
														sElements.append(tag1);
														sElements.append((String) iterator.next());
														sElements.append(tag2);
													   }
												   if (sElements.length()==0){
													   sElements.append(sParamValue.substring(index3, index1));
													   sElements.append(sParamValue.substring(index2, index4));
												   }
												   sParamValue = sParamValue.substring(0, index3-1) + sElements + sParamValue.substring(index4+1);
											   }
									       }											    	   
								   }
							   }else {
								   if (index1 > 1 && sParamValue.substring(index1-2,index1-1).equals("/")){
									   log.debug("The XML value with iterable form has one element to iterate, " +
									   		"so this is manages like a string value");
									   sParamValue = sParamValue.replaceAll("/~" + var + "~", (String)oValue);
								   }else{
									   sParamValue = sParamValue.replaceAll("~" + var + "~", (String)oValue);
								   }
							   }
						   }
		   }
	   }
			
	   //The parameter consists on a SQL 
	   if(sParamValue.toUpperCase().startsWith("SELECT") && !sParamValue.contains("#")){
		   oValue = DAOParametersAconyx.getSQLValue(sParamValue);
		   if (((ArrayList)oValue).size() > 0){
			   if (((ArrayList)oValue).size() == 1){
				   //for a String value
				   sParamValue = (String)((ArrayList<String>) oValue).get(0);
			   }else{
				   //for an ArrayList
				   pool_var.put(sParamName, oValue);
				   return new VOParametersAconyx(sParamName ,oValue);
			   }
		   }else{
//					throw new ResolvingParametersException("There's no possible to retrieve the value for the parameter ",
//							sParamName, " with no value");
			   return new VOParametersAconyx(sParamName ," ");
		   }
		   pool_varList.remove(sParamName);
	   }

	   if (aList != null){
		   log.debug("Parameter Value: Array with " + aList.size() + " rows");
		   pool_var.put(sParamName, aList);
		   aList = null;
		   return new VOParametersAconyx(sParamName ,aList);
	   } else{
		   log.debug("Parameter Value: " + sParamValue);
		   pool_var.put(sParamName, sParamValue);
		   return new VOParametersAconyx(sParamName ,sParamValue);
	   }
	}

	/**	
     * Method to process the result of executing an operation.
     * 
     * @param 		api  					Indicates the name of the operation. 
     * @param 		OutputString  			Indicates the result of executing an operation.
     * @param 		retryExecOper  			Indicates attempts to re process the execution of operations 
     * 										where the external interface generates an error.
     * @param		sExecOper				contains the record of the transactions executed.
     * @param		pool_var				Indicates the variable of the process which
     * 										store the resolved parameters.
     * @param		pool_varList			Indicates all variables whose value is represented by a SQL.
     * @exception	ProcessingOperationException	Exception occurred during the execution of the sequence
     * 												of operation.
     * @exception	ResolvingParametersException	Exception occurred during the resolution of parameters.
     * @exception	InternalErrorException			Exception occurred during the execution of the method.
     */	
	private static void processResult (String api, String OutputString, 
									   int retryExecOper, StringBuffer sExecOper,
			  						   Hashtable<String, Object> pool_var, 
			  						   Hashtable<String, String> pool_varList)
													throws ProcessingOperationException, 
														   ResolvingParametersException, 
														   InternalErrorException{
		log.debug("Initializing processResult");
		Vector<Integer> vErrorCodes = new Vector<Integer>(); 
		
		// Enterprise variables for partialFailure validation
		
		String badAccountEnterprise = "4000000003";//com.tibco.pe.plugin.PluginProperties.getProperty("tibco.clientVar.GVJavaProcess/netBadAccount");
        String consumerTFEnterprise = "4000000005";//com.tibco.pe.plugin.PluginProperties.getProperty("tibco.clientVar.GVJavaProcess/netResTF");
        String abortPartialBusCLI = "40000";//com.tibco.pe.plugin.PluginProperties.getProperty("tibco.clientVar.GVJavaProcess/abortPartialAddCLI");
        String requestEnterprise = (String)pool_var.get("customerId");
         	
		log.debug("GRAM-" + pool_var.get("customerId"));							 
			
		if(OutputString == null){
			log.debug("The result was null");
			
			// Due to the lack of changes in M5, we consider the roll back of the latter operation 
			sExecOper.append("'" + api +"'");
			Vector <VODataToProcess> returnedChanges = DAOOperationAconyx.getOperationsToReturnChanges(sExecOper.toString());
			if (returnedChanges.size() > 0 ){
				executionSequence(returnedChanges, retryExecOper, sExecOper, pool_var, pool_varList);
			}
			throw new ProcessingOperationException("No response was received in the execution of Operation", api);
		}else{ 
			if((!OutputString.contains("<Error>")) || (OutputString.contains("<PartialFailure>"))){
				
				if (OutputString.contains("<PartialFailure>")){
					vErrorCodes = DAOOperationAconyx.getErrorCodeInPartialFailure(api);
					for (Iterator<Integer> iterator = vErrorCodes.iterator(); iterator.hasNext();) {
					// Added an "AND" condition so, ALL nonBadAccount 
					if (OutputString.contains("<Code>" + iterator.next().toString() + "</Code>")
							&&  !requestEnterprise.equals(badAccountEnterprise) && !requestEnterprise.equals(consumerTFEnterprise)){
							log.debug("The result has an <PartialFailure> considered like an Error");
							log.debug(OutputString);
							if (sExecOper.length() > 0){
								Vector <VODataToProcess> returnedChanges = DAOOperationAconyx.getOperationsToReturnChanges(sExecOper.toString());
								if (returnedChanges.size() > 0 ){
									executionSequence(returnedChanges, retryExecOper, sExecOper, pool_var, pool_varList);
								}
							}
							throw new ProcessingOperationException(OutputString, api);
						}
					}
					log.debug("The result has an <PartialFailure>");
					log.debug(OutputString);
				}

				log.debug("The result was sucessful");

				Vector<VOOutParameters>  vector = new Vector<VOOutParameters>();
				vector = DAOParametersAconyx.getOutParametersByOperation(api);
				String getTagBegin = "";
				String getTagEnd = "";
				int indexTag = 0;
				String subCadena = "";
				if(!vector.isEmpty()){
					for (int i = 0; i < vector.size(); i++) {
						vector.elementAt(i).getOperation();
						vector.elementAt(i).getParameter();
						getTagBegin = vector.elementAt(i).getTagBegin();
						getTagEnd = vector.elementAt(i).getTagEnd();
						if(OutputString.contains(getTagBegin)){
							if(OutputString.contains(getTagEnd)){
								indexTag = OutputString.indexOf(getTagBegin)+ getTagBegin.length();
								subCadena = OutputString.substring(indexTag);
								indexTag = subCadena.indexOf(getTagEnd);
								subCadena = subCadena.substring(0,indexTag);
								subCadena= subCadena.trim();
								if(pool_var.containsKey(vector.elementAt(i).getParameter())){
									pool_var.remove(pool_var.containsKey(vector.elementAt(i).getParameter()));
								} 
								pool_var.put(vector.elementAt(i).getParameter(), subCadena);
							}
						}
					}
				}				
		    }else{
				log.debug("The result has an <Error>");
				if (sExecOper.length() > 0){
					Vector <VODataToProcess> returnedChanges = DAOOperationAconyx.getOperationsToReturnChanges(sExecOper.toString());
					if (returnedChanges.size() > 0 ){
						executionSequence(returnedChanges, retryExecOper, sExecOper, pool_var, pool_varList);
					}
				}
				throw new ProcessingOperationException(OutputString, api);
			}
		}
	}
	
	/**	
     * Method to process the result of executing an operation.
     * 
     * @param 		sStatus  				Indicates the status of the process. 
     * @param 		sDescription  			Indicates the description of the status.
     * @param		pool_var				Indicates the variable of the process which
     * 										store the resolved parameters.
     */	
	private static VOReturnValue generatingResponse (String sStatus, String sDescription, Hashtable<String, Object> pool_var){
		VOReturnValue voResult = new VOReturnValue();
		
		if (pool_var.containsKey("uowId")){
			voResult.setUowId((String)pool_var.get("uowId"));
		}
		voResult.setStatus(sStatus);
		voResult.setDescription(sDescription);
		if (pool_var.containsKey("accountNo")){
			voResult.setAccountNo((String)pool_var.get("accountNo"));
		}
		return voResult;
	}
	
	/**	
     * Method to process the global variable parameter defined in TIBCO.
     * 
     * @param 		var  					Indicates the name of the operation.
     * @return		result of the global variable 
     * @exception	ResolvingParametersException	Exception occurred during the resolution of parameters.
     * @exception	InternalErrorException			Exception occurred during the execution of the method.
     */	
	private static String processGlobalVariable (String var) throws ResolvingParametersException,
																	InternalErrorException{
		log.debug("Executing method processGlobalVariable");		
		String sGlobalVar = null;
		try{
			sGlobalVar = com.tibco.pe.plugin.PluginProperties.getProperty( 
								"tibco.clientVar.GVJavaProcess/" + var);
			if (sGlobalVar == null){
				throw new ResolvingParametersException("There's no a defined global variable for the parameter ",
						var, "with no value"); 
			}
		} catch(Exception e){
			throw new InternalErrorException(e.getMessage());
		} catch(Error e){
			throw new InternalErrorException(e.getMessage());
		}
		return sGlobalVar;
	}
	
	/**	
     * Method to resolve the variables of a parameter; this variable has a SQL value.
     * 
     * @param 		sParamName  					Indicates the name of the parameter,
     * 												this parameters is a variable SQL of the method who
     * 												called it.
     * @param		pool_var						Indicates the variable of the process which
     * 												store the resolved parameters.
     * @param		pool_varList					Indicates all variables whose value is represented by a SQL.
     * @return		result of executing the SQL value. 
     * @exception	ResolvingParametersException	Exception occurred during the resolution of parameters.
     * @exception	InternalErrorException			Exception occurred during the execution of the method.
     */	
	private static ArrayList<String> processListVariable(String sParamName,
												 		 Hashtable<String, Object> pool_var,
												 		 Hashtable<String, String> pool_varList) 
												 		 			throws ResolvingParametersException, InternalErrorException{
		log.debug("Executing method processListVariable");
		ArrayList<String> aList = null;			//new ArrayList<String>();
		String sQuery = pool_varList.get(sParamName);
		String var = null;
		if (sQuery != null){
			if (sQuery.contains("~")){

				   while (sQuery.contains("~~")){
						log.debug("The SQL parameter constains Global Variables");
						log.debug("                      " + sParamName);
						// Look for the linear parameters whose value is a Global Variable in Tibco BW
						int index1 = sQuery.indexOf("~~")+2;
						int index2 = sQuery.indexOf("~~", index1);
						var = sQuery.substring(index1, index2);
						if (pool_var.get(var) != null){
							sQuery = sQuery.replaceAll("~~" + var + "~~", (String)pool_var.get(var));
						}else{
							sQuery = sQuery.replaceAll("~~" + var + "~~", processGlobalVariable(var));
						}
				   }
				
				   while (sQuery.contains("~")){
					   log.debug("The SQL parameter constains variables " + sParamName);
					   int index1 = sQuery.indexOf("~")+1;
					   int index2 = sQuery.indexOf("~", index1);
					   var = sQuery.substring(index1, index2);
					   if (pool_var.get(var) != null){
						   if (pool_var.get(var) instanceof ArrayList){
							   sQuery = sQuery.replaceAll("~" + var + "~", ((ArrayList)pool_var.get(var)).get(0).toString());
						   } else{
							   sQuery = sQuery.replaceAll("~" + var + "~", (String)pool_var.get(var));
						   }
					   }else{
							throw new ResolvingParametersException("There's no possible to retrieve the value for a variable in a parameter",
										sParamName, " with no value"); 
					   }
				   }
			}
			aList = DAOParametersAconyx.getSQLValue(sQuery);
		}else{
			throw new ResolvingParametersException("There's no possible to retrieve the SQL sentence to resolve the parameter",
													sParamName, "with no value"); 
		}
		return aList;
	}
}