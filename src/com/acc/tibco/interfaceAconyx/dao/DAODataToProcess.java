package com.acc.tibco.interfaceAconyx.dao;

import java.sql.Clob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import org.apache.log4j.Logger;

import com.acc.tibco.interfaceAconyx.VO.VODataToProcess;
import com.acc.tibco.interfaceAconyx.exception.InternalErrorException;
import com.acc.tibco.interfaceAconyx.util.ConnectionLocator;
import com.acc.tibco.interfaceAconyx.util.GeneralOperations;
import com.acc.tibco.interfaceAconyx.util.TibcoBWLog;

/**
 * This class represents the Data Access Object to obtain 
 * the data that in the process is required.
 * <br>
 * Represents the Value Object VODataToProcess and others primitive data types 
 * which represent the data needed to be processed and which not represents a specific Value Object.
 * 
 * @author  ACCENTURE
 * @version 1.0
 */
public class DAODataToProcess{

    private static Logger log = TibcoBWLog.getLogger(DAODataToProcess.class);
    
    /**
     * Gets the sequence of operations to be executed 
     * by a Transaction, this operation is represented by the 
     * VODataToProcess object.
     *
     * @param   	sTransaction   			String indicating the description of the transaction.
     * @return  	Vector of VODataToProcess to be processed.
     * @exception	InternalErrorException	Exception occurred during the execution of the method.
     */
	public static Vector<VODataToProcess> getDataToProcessByTransaction (String sTransaction)
																throws InternalErrorException{
		
	    Connection con = null;
	    Statement stmt = null;
	    ResultSet rset = null;
	    
	    StringBuffer sQuery = new StringBuffer();
		VODataToProcess voDataToProcess = null;
		Vector<VODataToProcess>  vector = new Vector<VODataToProcess>();
		
		Clob clob;
		long  v_len;   
   	    String v_clob_string;
   	    
   	    try {
   	    	
   			sQuery.append("SELECT WDSL.NAME_WS, WDSL.NAME_PORT, WDSL.END_POINT_ADDRESS, ");
   			sQuery.append(        "WDSL.TARGET_NAMESPACE, OPERATION.OPERATION, OPERATION_PARAMS.SEQUENCE, PARAMS.PARAMETER, ");
   			sQuery.append(        "PARAMS.VALUE ");
   			sQuery.append("FROM VOICESERV_SEQOPERATION_ACONYX VOICESERVICE_OPERATION, ");
   			sQuery.append(      "OPERATION_SEQPARAMS_ACONYX OPERATION_PARAMS, ");
   			sQuery.append(      "CAT_OPERATION_ACONYX OPERATION, ");
   			sQuery.append(      "CAT_PARAMS_ACONYX PARAMS, ");
   			sQuery.append(      "CAT_PARAMS_WEBSERVICE_ACONYX WDSL ");
   			sQuery.append("WHERE VOICESERVICE_OPERATION.OPERATION_ID = OPERATION_PARAMS.OPERATION_ID ");
   			sQuery.append(  "AND VOICESERVICE_OPERATION.OPERATION_ID = OPERATION.OPERATIONID ");
   			sQuery.append(  "AND OPERATION_PARAMS.PARAMETER_ID = PARAMS.PARAMETERID ");
   			sQuery.append(  "AND OPERATION.WEBSERVICE_ID = WDSL.WEBSERVICEID ");
   			sQuery.append(  "AND VOICESERVICE_OPERATION.TRANSACTION = '" + sTransaction + "' ");
   			sQuery.append("ORDER BY VOICESERVICE_OPERATION.SEQUENCE, OPERATION_PARAMS.SEQUENCE ASC");

   			con = ConnectionLocator.getConexion();
   	    	stmt = con.createStatement();
   			log.debug("DAODataToProcess: running sentence " + sQuery.toString());
			rset =  stmt.executeQuery(sQuery.toString());

			if(rset != null){
				while(rset.next()){
					voDataToProcess = new VODataToProcess();
					voDataToProcess.setEndPointAddress(rset.getString("END_POINT_ADDRESS"));
					voDataToProcess.setNamePort(rset.getString("NAME_PORT"));
					voDataToProcess.setNameWebService(rset.getString("NAME_WS"));
					voDataToProcess.setTargetNamespace(rset.getString("TARGET_NAMESPACE"));
					voDataToProcess.setOperation(rset.getString("OPERATION"));
					voDataToProcess.setParamSeq(rset.getString("SEQUENCE"));
					voDataToProcess.setParameter(rset.getString("PARAMETER"));
					clob = rset.getClob("VALUE");
	        	    v_len      = clob.length();
		    	    v_clob_string = clob.getSubString(1,(int)v_len);
		    	    voDataToProcess.setValue(v_clob_string);
					vector.addElement(voDataToProcess);
					voDataToProcess=null;
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
	
	
	
    public static Vector<VODataToProcess> getDataToProcessByQuery ()
	throws InternalErrorException{
    	  Connection con = null;
  	    Statement stmt = null;
  	    ResultSet rset = null;
  	    
  	    StringBuffer sQuery = new StringBuffer();
  		VODataToProcess voDataToProcess = null;
  		Vector<VODataToProcess>  vector = new Vector<VODataToProcess>();
  		
  		Clob clob;
  		long  v_len;   
     	    String v_clob_string;
     	    
     	    try {
       			sQuery.append("SELECT WDSL.NAME_WS, WDSL.NAME_PORT, WDSL.END_POINT_ADDRESS, ");
       			sQuery.append(        "WDSL.TARGET_NAMESPACE, OPERATION.OPERATION, OPERATION_PARAMS.SEQUENCE, PARAMS.PARAMETER, ");
       			sQuery.append(        "PARAMS.VALUE ");
       			sQuery.append("FROM VOICESERV_SEQOPERATION_ACONYX VOICESERVICE_OPERATION, ");
       			sQuery.append(      "OPERATION_SEQPARAMS_ACONYX OPERATION_PARAMS, ");
       			sQuery.append(      "CAT_OPERATION_ACONYX OPERATION, ");
       			sQuery.append(      "CAT_PARAMS_ACONYX PARAMS, ");
       			sQuery.append(      "CAT_PARAMS_WEBSERVICE_ACONYX WDSL ");
       			sQuery.append("WHERE VOICESERVICE_OPERATION.OPERATION_ID = OPERATION_PARAMS.OPERATION_ID ");
       			sQuery.append(  "AND VOICESERVICE_OPERATION.OPERATION_ID = OPERATION.OPERATIONID ");
       			sQuery.append(  "AND OPERATION_PARAMS.PARAMETER_ID = PARAMS.PARAMETERID ");
       			sQuery.append(  "AND OPERATION.WEBSERVICE_ID = WDSL.WEBSERVICEID ");
       			sQuery.append(  "AND VOICESERVICE_OPERATION.TRANSACTION = 'PreLoadVA'");
       			sQuery.append(  "AND VOICESERVICE_OPERATION.ACTION = 'Add'");
       			sQuery.append(  "AND VOICESERVICE_OPERATION.SERVICE_ID = 'SI-0004'");       			
       			sQuery.append("ORDER BY VOICESERVICE_OPERATION.SEQUENCE, OPERATION_PARAMS.SEQUENCE ASC");     	    	
     			
//	   			sQuery.append("SELECT WDSL.NAME_WS, WDSL.NAME_PORT, WDSL.END_POINT_ADDRESS, ");
//	   		    sQuery.append("WDSL.TARGET_NAMESPACE, OPERATION.OPERATION, OPERATION_PARAMS.SEQUENCE, PARAMS.PARAMETER, "); 
//	   		   	sQuery.append("PARAMS.VALUE ");
//	   		   	sQuery.append("FROM  OPERATION_SEQPARAMS_ACONYX OPERATION_PARAMS, "); 
//	   		   	sQuery.append("CAT_OPERATION_ACONYX OPERATION, ");
//	   		   	sQuery.append("CAT_PARAMS_ACONYX PARAMS, ");
//	   		   	sQuery.append("CAT_PARAMS_WEBSERVICE_ACONYX WDSL ");
//	   		   	sQuery.append("WHERE OPERATION_PARAMS.PARAMETER_ID = PARAMS.PARAMETERID "); 
//	   		   	sQuery.append("AND OPERATION.WEBSERVICE_ID = WDSL.WEBSERVICEID ");
//	   		   	sQuery.append("AND OPERATION_PARAMS.OPERATION_ID = OPERATION.OPERATIONID ");
//	   		   	sQuery.append("AND OPERATION_PARAMS.OPERATION_ID = 'C0011' ");
//	   		   	sQuery.append("ORDER BY OPERATION_PARAMS.SEQUENCE ASC");       			
     			
//       			sQuery.append("SELECT WDSL.NAME_WS, WDSL.NAME_PORT, WDSL.END_POINT_ADDRESS, ");
//       			sQuery.append(        "WDSL.TARGET_NAMESPACE, OPERATION.OPERATION, OPERATION_PARAMS.SEQUENCE, PARAMS.PARAMETER, ");
//       			sQuery.append(        "PARAMS.VALUE ");
//       			sQuery.append("FROM VOICESERV_SEQOPERATION_ACONYX VOICESERVICE_OPERATION, ");
//       			sQuery.append(      "OPERATION_SEQPARAMS_ACONYX OPERATION_PARAMS, ");
//       			sQuery.append(      "CAT_OPERATION_ACONYX OPERATION, ");
//       			sQuery.append(      "CAT_PARAMS_ACONYX PARAMS, ");
//       			sQuery.append(      "CAT_PARAMS_WEBSERVICE_ACONYX WDSL ");
//       			sQuery.append("WHERE VOICESERVICE_OPERATION.OPERATION_ID = OPERATION_PARAMS.OPERATION_ID ");
//       			sQuery.append(  "AND VOICESERVICE_OPERATION.OPERATION_ID = OPERATION.OPERATIONID ");
//       			sQuery.append(  "AND OPERATION_PARAMS.PARAMETER_ID = PARAMS.PARAMETERID ");
//       			sQuery.append(  "AND OPERATION.WEBSERVICE_ID = WDSL.WEBSERVICEID ");
//       			sQuery.append(  "AND VOICESERVICE_OPERATION.ACTION = 'BlockUnblockResi' ");
//       			sQuery.append(	"AND VOICESERVICE_OPERATION.SERVICE_ID = 'SI-01250' "); 
//       			sQuery.append("ORDER BY VOICESERVICE_OPERATION.SEQUENCE, OPERATION_PARAMS.SEQUENCE ASC");
       			
       			con = ConnectionLocator.getConexion();
     	    	stmt = con.createStatement();
     			log.debug("DAODataToProcess: running sentence " + sQuery.toString());
  			rset =  stmt.executeQuery(sQuery.toString());

  			if(rset != null){
  				while(rset.next()){
  					voDataToProcess = new VODataToProcess();
  					voDataToProcess.setEndPointAddress(rset.getString("END_POINT_ADDRESS"));
  					voDataToProcess.setNamePort(rset.getString("NAME_PORT"));
  					voDataToProcess.setNameWebService(rset.getString("NAME_WS"));
  					voDataToProcess.setTargetNamespace(rset.getString("TARGET_NAMESPACE"));
  					voDataToProcess.setOperation(rset.getString("OPERATION"));
					voDataToProcess.setParamSeq(rset.getString("SEQUENCE"));
  					voDataToProcess.setParameter(rset.getString("PARAMETER"));
  					clob = rset.getClob("VALUE");
  	        	    v_len      = clob.length();
  		    	    v_clob_string = clob.getSubString(1,(int)v_len);
  		    	    voDataToProcess.setValue(v_clob_string);
  					vector.addElement(voDataToProcess);
  					voDataToProcess=null;
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