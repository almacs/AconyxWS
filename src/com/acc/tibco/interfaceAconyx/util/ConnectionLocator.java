package com.acc.tibco.interfaceAconyx.util;

import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import org.apache.log4j.Logger;

import com.acc.tibco.interfaceAconyx.VO.VODataToBeReturned;
import com.acc.tibco.interfaceAconyx.VO.VODataToProcess;
import com.acc.tibco.interfaceAconyx.exception.InternalErrorException;

/**
 * This class allows to get a data base connection.
 * 
 * @author  ACCENTURE
 * @version 1.0
 */
public class ConnectionLocator {

	private static Logger log = TibcoBWLog.getLogger(ConnectionLocator.class);
	
	/**	
     * Gets a data base connection based on a JDBC driver.
     * The parameters to get the connection are specified by Global Variables
     * of TIBCO.
     * 
     * @return		Connection to a Oracle Data Base.
     * @exception	InternalErrorException   InternalErrorException occurred during the execution of 
     * 										 the method.
     */
	public static Connection getConexion ()
									throws InternalErrorException{
		Connection conn = null;
		
        String driverName = null;
        String serverName = null;
        String portNumber = null;
        String sid = null;
        String url = null;
        String sUserName = null; 
        String sPassword = null;
        
        try {
          driverName = "oracle.jdbc.driver.OracleDriver";
            
          serverName = com.tibco.pe.plugin.PluginProperties.getProperty( 
  	    			 "tibco.clientVar.GVJavaProcess/serverName");
          
          portNumber = com.tibco.pe.plugin.PluginProperties.getProperty( 
  					 "tibco.clientVar.GVJavaProcess/portNumber");

          sid = 		 com.tibco.pe.plugin.PluginProperties.getProperty( 
  					 "tibco.clientVar.GVJavaProcess/sid");

          url = 		 "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;

          sUserName =  com.tibco.pe.plugin.PluginProperties.getProperty( 
  					 "tibco.clientVar.GVJavaProcess/dataBaseUser");

          sPassword =  com.tibco.pe.plugin.PluginProperties.getProperty( 
  					 "tibco.clientVar.GVJavaProcess/dataBasePass");

          log.debug("Creating connection with URL : " + url + "user: " + sUserName + ", " +
          		  											"pass: " + sPassword);
          Class.forName(driverName);
	      //conn = DriverManager.getConnection(url, sUserName, sPassword);
        //conn = DriverManager.getConnection("jdbc:oracle:thin:@172.26.50.85:1531:UTIBBW01", "BWSERV", "BWSERV");
          conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/ORCL", "BWSERV", "BWSERV");
          
		} catch (ClassNotFoundException e) {
			log.debug("ConnectionLocator: A ClassNotFound has ocurred " + e.toString());
			throw new InternalErrorException (e.getMessage());
			
		} catch (SQLException e) {
			log.debug("ConnectionLocator: A SQLException has ocurred " + e.toString());
			throw new InternalErrorException (e.getMessage());
			
		} catch (Exception e){
			log.debug("ConnectionLocator: A Exception has ocurred " + e.toString());
			throw new InternalErrorException (e.getMessage());
		}
		return conn;
	}
}