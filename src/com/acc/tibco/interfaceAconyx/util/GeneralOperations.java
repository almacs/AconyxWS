package com.acc.tibco.interfaceAconyx.util;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

import com.acc.tibco.interfaceAconyx.exception.InternalErrorException;

/**
 * This class represents the methods to manage the data base connections.
 *
 * @author  ACCENTURE
 * @version 1.0
 */
public final class GeneralOperations{

	/**	
     * Constructor by default.
     */
    public GeneralOperations() {}

    /**
     * Closes a <code>ResultSet</code> if not <code>null</code>.
     * 
     * @param      resultSet   				ResultSet to be closed if not null.
     * @exception  InternalErrorException   InternalErrorException occurred during the execution of 
     * 										the method.
     */
    public static void closeResultSet(ResultSet resultSet)
        										 throws InternalErrorException {
        if (resultSet != null) {
            try {
                resultSet.close();
            }catch (SQLException e) {
                throw new InternalErrorException(e.getMessage());
            }
        }
    }

    /**
     * Closes a <code>Statement</code> if not <code>null</code>.
     * 
     * @param      statement   				Statement to be closed if not null.
     * @exception  InternalErrorException   InternalErrorException occurred during the execution of 
     * 										the method.
     */
    public static void closeStatement(Statement statement)
    											 throws InternalErrorException {
        if (statement != null) {
            try {
                statement.close();
            }catch (SQLException e) {
                throw new InternalErrorException(e.getMessage());
            }
        }
    }

    /**
     * Closes a <code>Connection</code> if not <code>null</code>.
     * 
     * @param      connection   			Connection to be closed if not null.
     * @exception  InternalErrorException   InternalErrorException occurred during the execution of 
     * 										the method.
     */
    public static void closeConnection(Connection connection)
    											   throws InternalErrorException {
        if (connection != null) {
            try {
                connection.close();
            }catch (SQLException e) {
                throw new InternalErrorException(e.getMessage());
            }
        }
    }
}