package com.acc.tibco.interfaceAconyx.util;

import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

import javax.xml.bind.*;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;
//import org.apache.axis.client.Call;
//import org.apache.axis.client.Service; 
import javax.xml.rpc.Service;
import javax.xml.rpc.Call;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;
import javax.xml.rpc.encoding.XMLType;
import javax.xml.bind.UnmarshalException;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.log4j.Logger;

import com.acc.tibco.interfaceAconyx.VO.VOOperationAconyx;
import com.acc.tibco.interfaceAconyx.VO.VOParametersAconyx;
import com.acc.tibco.interfaceAconyx.dao.DAOParametersAconyx;
import com.acc.tibco.interfaceAconyx.exception.InternalErrorException;
import com.acc.tibco.interfaceAconyx.exception.ProcessingOperationException;
import com.acc.tibco.interfaceAconyx.ws.AuthInfo;
import com.acc.tibco.interfaceAconyx.ws.UnitOfWork;
//import com.acc.tibco.interfaceAconyx.ws.JAXBContext;
//import com.acc.tibco.interfaceAconyx.ws.Unmarshaller;
import com.acc.tibco.interfaceAconyx.ws.WSResponse;

/**
 * This class deals with the executing of operations in the Web Service specified.
 *
 * @author  ACCENTURE
 * @version 1.0
 */
public class ExecuteApi {

    private static Logger log = TibcoBWLog.getLogger(ExecuteApi.class);

	/**	
     * Public method of the class for indicating the execution of an operation 
     * in a web service specified in it.
     * 
     * @param     operation      	operation to be executed and indicated by the type VOOperationAconyx.
     * @param	  pool_var		    Hash table that contents the resolved parameters before of 
     * 							    indicating the execution of the parameter.
     * @param     retryExecOper     Indicates the number of attempts to execute an operation after registered 
     * 							    an error on the external interface.
     * @return    String with the response of executing the external interface.
     * @exception ProcessingOperationException  ProcessingOperationException occurred during the execution of the method.
     * @exception InternalErrorException		InternalErrorException occurred during the execution of the method.
     * 
     */
	@SuppressWarnings("unchecked")
	public static String executeAPI (VOOperationAconyx operation,
									  Hashtable<String, Object> pool_var,
									  int retryExecOper) throws ProcessingOperationException, InternalErrorException{
    	String resultString = null;
		
    	VOParametersAconyx [] parameters = operation.getParameters();
		
		VOOperationAconyx operationAux = null;
		VOParametersAconyx[] aux = null;
		String value = null;
		Vector <VOOperationAconyx> vExecOperAux = new Vector<VOOperationAconyx>();
		
		Vector <VOOperationAconyx> vExecOperList = new Vector<VOOperationAconyx>();
			
//		Loop each parameter of the operation
		for (int i = 0; i < parameters.length; i ++) {
			Object object = parameters[i].getParameterValue();
			if (object instanceof ArrayList){
				ArrayList<String> lParams = (ArrayList<String>)object;
					if (vExecOperList.size() > 0){
						// This case is never being used.
						for (Iterator<VOOperationAconyx> iterator2 = vExecOperList.iterator(); iterator2.hasNext();) {
							 operationAux = iterator2.next();
							aux = new VOParametersAconyx[operationAux.getParameters().length + 1];
							for (int j = 0; j < operationAux.getParameters().length; j++) {
								aux[j] = operationAux.getParameters()[j];
							}
							VOParametersAconyx params = new VOParametersAconyx();
							params.setParameterName(parameters[i].getparameterName());
							params.setParameterValue(value);
							aux[aux.length -1] = params;
							params = null;
							operationAux.setParameters(aux);
							vExecOperAux.add(operationAux);
						}
					}else{
						for (Iterator<String> iterator = lParams.iterator(); iterator.hasNext();) {
							value = iterator.next();
							operationAux = new VOOperationAconyx(); 
							operationAux.setEndPointAddrWebService(operation.getEndPointAddrWebService());
							operationAux.setName(operation.getName());
							operationAux.setNamePortWebService(operation.getNamePortWebService());
							operationAux.setNameWebService(operation.getNameWebService());
							operationAux.setTargetNamespaceWebService(operation.getTargetNamespaceWebService());	
	
							aux = new VOParametersAconyx[1];
							VOParametersAconyx params = new VOParametersAconyx();
							params.setParameterName(parameters[i].getparameterName());
							params.setParameterValue(value);
							aux[0] = params;
							params = null;
	
							operationAux.setParameters(aux);
						
							vExecOperAux.add(operationAux);
							aux = null;
							operationAux = null;
						}						
					}
				
				vExecOperList.removeAllElements();
				for (Iterator<VOOperationAconyx> iterator = vExecOperAux.iterator(); iterator.hasNext();) {
					vExecOperList.add(iterator.next());
				}
				vExecOperAux.removeAllElements();
			}else{
				value = (String)object;
				if (value.contains("#")){ // value.startsWith("SELECT")
					   int index1 = value.indexOf("#")+1;
					   int index2 = value.indexOf("#", index1);
					   ArrayList auxVars = new ArrayList();
					   ArrayList iterableVars = (ArrayList)pool_var.get(value.substring(index1, index2));
					   
					   if (value.startsWith("SELECT")){
						   for (Iterator iterator = iterableVars.iterator(); iterator.hasNext();) {
							   ArrayList<String> aList = DAOParametersAconyx.getSQLValue(value.replace("#" + value.substring(index1, index2) + "#",
                                        (String)iterator.next()));
							   // Si no hay valor a obtener del parámetro SQL iterable se considerará cadena vacía  
								 if (aList != null)
									auxVars.add(aList);
								 else
									 auxVars.add("");
							   }
					   }else{
						   for (Iterator iterator = iterableVars.iterator(); iterator.hasNext();) {
								 auxVars.add(value.replace("#" + value.substring(index1, index2) + "#",
										 	                                                        (String)iterator.next()));
							   }
					   }
					   
					   if (vExecOperList.size() > 0){
						    Iterator<String> iterator = auxVars.iterator();
						    
						    // number of parameters to be integrated in each operation in the list 'vExecOperList'
						    int l = auxVars.size();
						    // operation in the list 'vExecOperList'
						    int k = vExecOperList.size();
						    
					    	for (int f = 0; f<k; f++){
						    		Object objectInList = vExecOperList.get(f);
								    for (int j= 1; j<l; j++){
								    	vExecOperList.add((VOOperationAconyx) objectInList);
								    }
								    objectInList = null;
						    }
					    	
					    	// number of operation which will be getting each of the parameters 
					    	k = vExecOperList.size();
					    	
							for (int f = 0; f< k; f++){
								operationAux = new VOOperationAconyx(); 
								operationAux.setEndPointAddrWebService(
										((VOOperationAconyx) vExecOperList.elementAt(f)).getEndPointAddrWebService());
								operationAux.setName(
										((VOOperationAconyx) vExecOperList.elementAt(f)).getName());
								operationAux.setNamePortWebService(
										((VOOperationAconyx) vExecOperList.elementAt(f)).getNamePortWebService());
								operationAux.setNameWebService(
										((VOOperationAconyx) vExecOperList.elementAt(f)).getNameWebService());
								operationAux.setTargetNamespaceWebService(
										((VOOperationAconyx) vExecOperList.elementAt(f)).getTargetNamespaceWebService());								
								aux = new VOParametersAconyx[((VOOperationAconyx) vExecOperList.elementAt(f)).getParameters().length + 1];
								for (int j = 0; j < ((VOOperationAconyx) vExecOperList.elementAt(f)).getParameters().length; j++) {
									aux[j] = ((VOOperationAconyx) vExecOperList.elementAt(f)).getParameters()[j];
								}
								VOParametersAconyx params = new VOParametersAconyx();
								params.setParameterName(parameters[i].getparameterName());
								params.setParameterValue(iterator.next());
								aux[aux.length -1] = params;
								params = null;
								operationAux.setParameters(aux);
								vExecOperAux.add(operationAux);
								operationAux = null;
							}
							l = 0;
							k = 0;
						}else{
							// Se presume que para un iterable con value = SELECT (SQL)
							// no será el primer parámetro de la API a ejecutar; sin embargo se 
							// considera este caso.
							if (value.startsWith("SELECT")){
								operationAux = operation;
								aux = new VOParametersAconyx[auxVars.size()];
								for (int k = 0; k < auxVars.size(); k++) {
									VOParametersAconyx params = new VOParametersAconyx();
									params.setParameterName(parameters[i].getparameterName());
									params.setParameterValue((String)auxVars.get(k));
									aux[k] = params;
									params = null;
								}
								operationAux.setParameters(aux);
								vExecOperAux.add(operationAux);
							}else{
								// XML Paramters to be iterabled
								for (int k = 0; k < auxVars.size(); k++) {
									operationAux = new VOOperationAconyx(); 
									operationAux.setEndPointAddrWebService(operation.getEndPointAddrWebService());
									operationAux.setName(operation.getName());
									operationAux.setNamePortWebService(operation.getNamePortWebService());
									operationAux.setNameWebService(operation.getNameWebService());
									operationAux.setTargetNamespaceWebService(operation.getTargetNamespaceWebService());	

									aux = new VOParametersAconyx[1];
									VOParametersAconyx params = new VOParametersAconyx();
									params.setParameterName(parameters[i].getparameterName());
									params.setParameterValue((String)auxVars.get(k));
									aux[0] = params;
									params = null;

									operationAux.setParameters(aux);
									
									vExecOperAux.add(operationAux);
									aux = null;
									operationAux = null;
								}
							}
						}
						vExecOperList.removeAllElements();
						for (Iterator iterator3 = vExecOperAux.iterator(); iterator3.hasNext();) {
							vExecOperList.add((VOOperationAconyx) iterator3.next());
						}
						aux = null;
						vExecOperAux.removeAllElements();
						auxVars = null;
						iterableVars = null;
//					   
				}else{
					   if (!vExecOperList.isEmpty()){
							for (Iterator iterator2 = vExecOperList.iterator(); iterator2.hasNext();) {
								operationAux = (VOOperationAconyx) iterator2.next();
								aux = new VOParametersAconyx[operationAux.getParameters().length + 1];
								for (int j = 0; j < operationAux.getParameters().length; j++) {
									aux[j] = operationAux.getParameters()[j];
								}
								VOParametersAconyx params = new VOParametersAconyx();
								params.setParameterName(parameters[i].getparameterName());
								params.setParameterValue(value);
								aux[aux.length -1] = params;
								params = null;
								operationAux.setParameters(aux);
								vExecOperAux.add(operationAux);
							}
							
						}else{
							operationAux = operation;
							aux = new VOParametersAconyx[1];
							VOParametersAconyx params = new VOParametersAconyx();
							params.setParameterName(parameters[i].getparameterName());
							params.setParameterValue(value);
							aux[0] = params;
							params = null;
							operationAux.setParameters(aux);
							vExecOperAux.add(operationAux);
						}
						aux = null;
						vExecOperList.removeAllElements();
						for (Iterator iterator = vExecOperAux.iterator(); iterator.hasNext();) {
							vExecOperList.add((VOOperationAconyx) iterator.next());
						}
						vExecOperAux.removeAllElements();
			    }
			}
			operationAux = null;
			vExecOperAux.removeAllElements();
		}
		
		for (Iterator iterator = vExecOperList.iterator(); iterator.hasNext();) {
			resultString = executeAPI((VOOperationAconyx) iterator.next(), retryExecOper);
		}
		return resultString;
	}
    
	/**	
     * Private method of the class for indicating the execution of an operation 
     * in a web service specified in it.
     * 
     * @param     operation      	operation to be executed and indicated by the type VOOperationAconyx.
     * @param     retryExecOper     Indicates the number of attempts to execute an operation after registered 
     * 							    an error on the external interface.
     * @return    String with the response of executing the external interface.
     * @exception ProcessingOperationException  ProcessingOperationException occurred during the execution of the method.
     * 
     */
    private static String executeAPI (VOOperationAconyx operationAconyx,
   									   int retryExecOper) throws ProcessingOperationException{
       	String response = null;
   		Call oCall = null;
		Service	oService  = null;
		QName port = null;
		QName  operation = null;
		Object [] parametersValues = null;

       	try {
			QName qname = new QName(operationAconyx.getTargetNamespaceWebService(), 
									operationAconyx.getNameWebService());
  			URL url = new URL(operationAconyx.getEndPointAddrWebService());
   			ServiceFactory oFactory = ServiceFactory.newInstance();
   			oService = oFactory.createService(url, qname);
   			port = new QName(operationAconyx.getTargetNamespaceWebService(), 
   							 operationAconyx.getNamePortWebService());
   			operation = new QName(operationAconyx.getTargetNamespaceWebService(), 
   								  operationAconyx.getName());
   			
   			log.debug("<-->operation:      " + operationAconyx.getName());
   			log.debug("<-->wsEndPointAddr: " + operationAconyx.getEndPointAddrWebService());
   			log.debug("<-->targetNamespace:" + operationAconyx.getTargetNamespaceWebService());
   			log.debug("<-->webServices:    " + operationAconyx.getNameWebService());
   			log.debug("<-->puerto:         " + operationAconyx.getNamePortWebService());
   			log.debug("<-->secuencia:      " + operationAconyx.getName());
			log.debug("<-->parameters:     ");
   			
   			parametersValues = new Object[operationAconyx.getParameters().length];
   			for(int i =0; i<operationAconyx.getParameters().length; i++){
   				//log.debug("parameter name: "+ operationAconyx.getParameters()[i].getparameterName());
   				parametersValues[i] = ((VOParametersAconyx)operationAconyx.getParameters()[i]).getParameterValue();
   				log.debug("                    " + parametersValues[i]);
   			}
   			 
   			oCall = oService.createCall(port, operation);

   			QName q = new QName(operationAconyx.getTargetNamespaceWebService(), "WSResponse");
   			QName q2 = null;
   			oCall.removeAllParameters();
   			
   			String paramName = "";
   			String classResponse = "";
   			//Add the parameters in the call
   			for(int y=0; y< parametersValues.length; y++){
   				paramName = ((VOParametersAconyx)operationAconyx.getParameters()[y]).getparameterName();
   				
   				if(parametersValues[y].toString().contains("<")){
   					//It is complex parameter
   					
   					q2 = new QName(operationAconyx.getTargetNamespaceWebService(), paramName);
 	   				oCall.addParameter(paramName, q2, ParameterMode.IN); 
 	   			 
 	   				///create the parameter object type 
 	   				GenericObject gObj = new GenericObject (paramName, parametersValues[y].toString());
 	   				
 	   				parametersValues[y]=  gObj.getResult();  

 	   				
   				}else{
   					//It is normal parameter	
   					oCall.addParameter(paramName, XMLType.XSD_STRING, ParameterMode.IN);
   				}   				 
   			
   			} 
   			 
   			oCall.setReturnType(q, WSResponse.class);

   			Object result =  oCall.invoke(parametersValues);
   			response = result.toString(); 
   			log.debug("The result of the Operation: " + response);
   		} catch (ServiceException e){
       		retryExecOper--;
       		
       		if (retryExecOper == 0){
       			throw new ProcessingOperationException(e.getMessage(), operationAconyx.getName());
       		} else {
       			executeAPI(operationAconyx,retryExecOper);
      		}
        } catch (Exception e){
   				log.debug(response);
   				log.debug(e.getMessage());
       		throw new ProcessingOperationException(e.getMessage(), operationAconyx.getName());
       	}
    	return response;
    }
    
   
}