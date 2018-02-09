package com.acc.tibco.interfaceAconyx.dao;

import java.sql.Clob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import org.apache.log4j.Logger;

import com.acc.tibco.interfaceAconyx.VO.VODataToBeReturned;
import com.acc.tibco.interfaceAconyx.VO.VODataToProcess;
import com.acc.tibco.interfaceAconyx.exception.InternalErrorException;
import com.acc.tibco.interfaceAconyx.util.GeneralOperations;
import com.acc.tibco.interfaceAconyx.util.TibcoBWLog;
import com.acc.tibco.interfaceAconyx.util.ConnectionLocator;

/**
 * This class represents the Data Access Object 
 * to obtain the Operations to be processed during the process.
 *
 * @author  ACCENTURE
 * @version 1.0
 */
public class DAOOperationAconyx {

    private static Logger log = TibcoBWLog.getLogger(DAOOperationAconyx.class);

    /**
     * Gets the sequence of operations to be executed for returning 
     * the changes in previous operations.
     * These operations are represented by the VODataToProcess object 
     * and the operations needed to be executed after an Error happen in the process.
     *
     * @param   	sExecOper   			String indicating the operations executed
     * 										before an error happen.
     * @return  	Vector of operations to be processed and represented by VODataToProcess.
     * @exception	InternalErrorException	Exception occurred during the execution of the method.
     */
	public static Vector<VODataToProcess> getOperationsToReturnChanges (String sExecOper)
															throws InternalErrorException{
		
	    Connection con = null;
	    Statement stmt = null;
	    ResultSet rset = null;

	    StringBuffer sQuery = new StringBuffer();
   	    String sOper = null;
		VODataToProcess voDataToProcess = null;
		VODataToBeReturned voDataToBeReturned = null;
	    Vector<VODataToBeReturned>  vector = new Vector<VODataToBeReturned>();
	    VODataToProcess dataToProcess = null;
		Vector<VODataToProcess>  vectorOrd = new Vector<VODataToProcess>();
		
		Clob clob;
		long  v_len;   
   	    String v_clob_string;
   	    
   	    try {
   		    sExecOper = sExecOper.substring(0, sExecOper.length() - 2);

   		    sQuery.append("SELECT WDSL.NAME_WS, WDSL.NAME_PORT, WDSL.END_POINT_ADDRESS, ");
   		    sQuery.append(        "WDSL.TARGET_NAMESPACE, OPERATION.OPERATION, operation_params.SEQUENCE, PARAMS.PARAMETER, ");
   		    sQuery.append(        "PARAMS.VALUE, EXECTED_OPER.OPERATION EXECTED_OPER ");
   		    sQuery.append("FROM OPERATION_SEQPARAMS_ACONYX OPERATION_PARAMS, ");
   		    sQuery.append(      "CAT_OPERATION_ACONYX OPERATION, ");
   		    sQuery.append(      "CAT_PARAMS_ACONYX PARAMS, ");
   		    sQuery.append(      "CAT_PARAMS_WEBSERVICE_ACONYX WDSL, ");
   		    sQuery.append(      "CAT_OPERATION_ACONYX EXECTED_OPER, ");
   		    sQuery.append(      "OPERATION_TO_RETURN_CHANGES RC ");
   		    sQuery.append("WHERE OPERATION_PARAMS.OPERATION_ID = OPERATION.OPERATIONID ");
   		    sQuery.append(  "AND OPERATION_PARAMS.PARAMETER_ID = PARAMS.PARAMETERID ");
   		    sQuery.append(  "AND OPERATION.WEBSERVICE_ID = WDSL.WEBSERVICEID ");
   		    sQuery.append(  "AND OPERATION.OPERATIONID = RC.OPERATION_TO_RETURN_CHANGES ");
   		    sQuery.append(  "AND RC.PROCESSED_OPERATION = EXECTED_OPER.OPERATIONID ");
   		    sQuery.append(  "AND EXECTED_OPER.OPERATION IN (" + sExecOper + ") " );
   		    sQuery.append("ORDER BY RC.PROCESSED_OPERATION ASC, OPERATION_PARAMS.SEQUENCE ASC");

   			con = ConnectionLocator.getConexion();
   	    	stmt = con.createStatement();
   			log.debug("DAOOperationAconyx: running sentence " + sQuery.toString());
			rset =  stmt.executeQuery(sQuery.toString());

			if(rset != null){
				while(rset.next()){
					voDataToProcess = new VODataToProcess();
					voDataToBeReturned = new VODataToBeReturned();
					voDataToProcess.setEndPointAddress(rset.getString("END_POINT_ADDRESS"));
					voDataToProcess.setNamePort(rset.getString("NAME_PORT"));
					voDataToProcess.setNameWebService(rset.getString("NAME_WS"));
					voDataToProcess.setTargetNamespace(rset.getString("TARGET_NAMESPACE"));
					voDataToProcess.setOperation(rset.getString("OPERATION"));
					voDataToProcess.setParameter(rset.getString("PARAMETER"));
					voDataToProcess.setParamSeq(rset.getString("SEQUENCE"));
					clob = rset.getClob("VALUE");
	        	    v_len      = clob.length();
		    	    v_clob_string = clob.getSubString(1,(int)v_len);
		    	    voDataToProcess.setValue(v_clob_string);
		    	    
		    	    voDataToBeReturned.setOperation(rset.getString("EXECTED_OPER"));
		    	    voDataToBeReturned.setOperToBeReturned(voDataToProcess);
		    	    vector.addElement(voDataToBeReturned);
					
		    	    voDataToProcess=null;
					voDataToBeReturned = null;
				};

				for (int j = 0; j < sExecOper.length(); j++){
					if (sExecOper.contains(", ")){
						sOper = sExecOper.substring(sExecOper.lastIndexOf(", ")+1, sExecOper.length());
						sExecOper = sExecOper.substring(0, sExecOper.lastIndexOf(", "));
					}else {
						sOper = sExecOper;
					}
					sOper = sOper.substring(1, sOper.length()-1);
					for (int i = 0; i < vector.size(); i++) {
						dataToProcess = (VODataToProcess) vector.get(i).getOperToBeReturned();
						if (vector.get(i).getOperation().equals(sOper)){
							vectorOrd.add(dataToProcess);
							vector.remove(i);   // ***************
						}
					}
				}
				
			}
		} catch (SQLException e) {
			log.debug("DAODataToProcess: A SQLExeption has occurred " + e.getMessage());
			throw new InternalErrorException (e.getMessage());
		} catch (Exception e) {
			log.debug("DAODataToProcess: An exception has occurred " + e.getMessage());
			throw new InternalErrorException (e.getMessage());
		}
    	finally {
			GeneralOperations.closeResultSet(rset);
			GeneralOperations.closeStatement(stmt);
			GeneralOperations.closeConnection(con);
    	}
    	return vectorOrd;
	}
	
    /**
     * Gets the error codes to indicate 
     * an error after an execution of the Operation 
     * when this has just indicated a Partial Failure.
     *
     * @param   	sOperation   			String indicating the description of the Operation executed.
     * @return  	Vector of Integer representing the codes 
     * 				to indicate an Error.
     * @exception	InternalErrorException	Exception occurred during the execution of the method.
     */
	public static Vector<Integer> getErrorCodeInPartialFailure (String sOperation)
																throws InternalErrorException{
		
	    Connection con = null;
	    Statement stmt = null;
	    ResultSet rset = null;
	    
	    StringBuffer sQuery = new StringBuffer();
		Vector<Integer>  vector = new Vector<Integer>();
		
   	    try {
   	    	
   			sQuery.append("SELECT CODE.ERROR_CODE");
   		   	sQuery.append(" FROM   CAT_OPERATION_ACONYX OPER,");
   		   	sQuery.append("        CODE_PARTIAL_FAILURE CODE");
   		   	sQuery.append(" WHERE  CODE.OPERATION_ID = OPER.OPERATIONID");
   		   	sQuery.append(" AND    OPER.OPERATION = '" + sOperation + "' ");

   			con = ConnectionLocator.getConexion();
   	    	stmt = con.createStatement();
   			log.debug("DAODataToProcess: running sentence " + sQuery.toString());
			rset =  stmt.executeQuery(sQuery.toString());

			if(rset != null){
				while(rset.next()){
					vector.addElement(rset.getInt(1));
				};
			}
		} catch (SQLException e) {
			log.debug("DAODataToProcess: A SQLExeption has occurred " + e.getMessage());
			throw new InternalErrorException (e.getMessage());
		} catch (Exception e) {
			log.debug("DAODataToProcess: An exception has occurred " + e.getMessage());
			throw new InternalErrorException (e.getMessage());
		}
    	finally {
			GeneralOperations.closeResultSet(rset);
			GeneralOperations.closeStatement(stmt);
			GeneralOperations.closeConnection(con);
    	}
    	return vector;
	}
}