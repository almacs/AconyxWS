package com.acc.tibco.interfaceAconyx.exception;

/**
 * This class represents an internal error or exception
 * which happened during the execution of the process.
 * <br>
 * This error or exception is not part of resolving
 * an operation or parameter. 
 *
 * @author  ACCENTURE
 * @version 1.0
 */

public class InternalErrorException  extends Exception {

	/**
	 * Default serial version ID.
	 */
	private static final long serialVersionUID = 1L;

	/**	
     * Constructs a new exception with a detail message.
     * 
     * @param   msg       Indicates the message of the error happened.
     */
    public InternalErrorException(String msg) {
        super(msg);
    }
}