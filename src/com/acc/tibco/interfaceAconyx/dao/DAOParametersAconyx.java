package com.acc.tibco.interfaceAconyx.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

import org.apache.log4j.Logger;

import com.acc.tibco.interfaceAconyx.VO.VOOutParameters;
import com.acc.tibco.interfaceAconyx.exception.InternalErrorException;
import com.acc.tibco.interfaceAconyx.util.ConnectionLocator;
import com.acc.tibco.interfaceAconyx.util.GeneralOperations;
import com.acc.tibco.interfaceAconyx.util.TibcoBWLog;

/**
 * This class represents the Data Access Object 
 * to obtain the Parameters to be processed during the process.
 *
 * @author  ACCENTURE
 * @version 1.0
 */
public class DAOParametersAconyx {

    private static Logger log = TibcoBWLog.getLogger(DAOParametersAconyx.class);

    /**
     * Indicates if necessary to retain the parameters 
     * in the process as a result of the execution of an operation. 
     *
     * @param   	sOperation   			String indicating the description of the 
     * 										transaction executed.
     * @return  	Vector with all the VOOutParameters to be processed.
     * @exception	InternalErrorException	Exception occurred during the execution of the method.
     */
	public static Vector<VOOutParameters> getOutParametersByOperation(String sOperation)
															throws InternalErrorException {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		VOOutParameters voOutParams = null;
		Vector<VOOutParameters>  vector = new Vector<VOOutParameters>();
		
		StringBuffer sQuery = new StringBuffer();
   	    try {
			sQuery.append("SELECT RV.OPERATION_ID, CP.PARAMETER, RV.TAG1, RV.TAG2 "); 
			sQuery.append("FROM RETURNED_VALUES_OPERATION RV, ");
			sQuery.append(      "CAT_PARAMS_ACONYX CP, ");
			sQuery.append(      "CAT_OPERATION_ACONYX CO ");
			sQuery.append("WHERE RV.PARAMETER_ID = CP.PARAMETERID ");
			sQuery.append(  "AND RV.OPERATION_ID = CO.OPERATIONID ");
			sQuery.append(  "AND CO.OPERATION = '" + sOperation + "'");
			
   	    	con = ConnectionLocator.getConexion();
			stmt = con.createStatement();
			log.debug("DAOParametersAconyx: running sentence " + sQuery.toString());
			rset =  stmt.executeQuery(sQuery.toString());

			if(rset != null){
				log.debug("DAOParametersAconyx: parameters to retrieve in pool_var");
				while(rset.next()){
					voOutParams = new VOOutParameters();
					voOutParams.setOperation(rset.getString("OPERATION_ID"));
					voOutParams.setParameter(rset.getString("PARAMETER"));
					voOutParams.setTagBegin(rset.getString("TAG1"));
					voOutParams.setTagEnd(rset.getString("TAG2"));
					vector.addElement(voOutParams);
					voOutParams=null;
				};
			} else
				log.debug("DAOParametersAconyx: parameters does not need to retrieve in pool_var");

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

    /**
     * Gets the parameters which value are represented by a SQL.
     *
     * @return  	Hash table representing the parameter and 
     * 				a SQL value.
     * @exception	InternalErrorException	Exception occurred during the execution of the method.
     */
	public static Hashtable<String, String> getSQLParameters()
															throws InternalErrorException {
		
		Hashtable<String, String> result = new Hashtable<String, String>();
		Connection con = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		StringBuffer sQuery = new StringBuffer();
   	    try {
			sQuery.append("SELECT CP.PARAMETER PARAMETER, CP.VALUE VALUE "); 
			sQuery.append("FROM CAT_PARAMS_ACONYX CP ");
			sQuery.append("WHERE UPPER(DBMS_LOB.SUBSTR(CP.VALUE, 6)) = 'SELECT'"); 
			
   	    	con = ConnectionLocator.getConexion();
			stmt = con.createStatement();
			log.debug("DAOParametersAconyx: running sentence " + sQuery.toString());
			rset =  stmt.executeQuery(sQuery.toString());

			if(rset != null){
				while(rset.next()){
					result.put(rset.getString("PARAMETER"), 
							(rset.getClob("VALUE")).getSubString(1, (int)rset.getClob("VALUE").length()));
				};
			} else
				log.debug("There are not SQL Parameters to be inizialized in the process");

		} catch (SQLException e) {
			log.debug("DAOParametersAconyx: A SQLExeption has occurred " + e.getMessage());
			throw new InternalErrorException (e.getMessage());
		} catch (Exception e) {
			log.debug("DAOParametersAconyx: An exception has occurred " + e.getMessage());
			throw new InternalErrorException (e.getMessage());
		}
    	finally {
			GeneralOperations.closeResultSet(rset);
			GeneralOperations.closeStatement(stmt);
			GeneralOperations.closeConnection(con);
    	}
    	return result;
	}
	
    /**
     * Gets the value for a SQL defined parameter.   
     *
     * @param   	sQuery   			    Indicates the SQL to execute for obtain a
     * 										parameter value. 
     * @return  	Array list of String with the value of the indicated
     * 				SQL parameter.
     * @exception	InternalErrorException	Exception occurred during the execution of the method.
     */
	public static ArrayList<String> getSQLValue (String sQuery)
																throws InternalErrorException{
		
	    Connection con = null;
	    Statement stmt = null;
	    ResultSet rset = null;
	    
		ArrayList<String> aList = null;
		
   	    try {
   			con = ConnectionLocator.getConexion();
   	    	stmt = con.createStatement();
   			log.debug("DAODataToProcess: running sentence " + sQuery.toString());
			rset =  stmt.executeQuery(sQuery.toString());

			if(rset != null){
				aList = new ArrayList<String>();
				while(rset.next()){
					aList.add(rset.getString(1));
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
    	return aList;
	}
}