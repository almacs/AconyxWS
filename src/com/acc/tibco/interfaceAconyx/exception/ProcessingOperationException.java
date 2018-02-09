package com.acc.tibco.interfaceAconyx.exception;

/**
 * This class represents an exception
 * which happened resolving an operation. 
 *
 * @author  ACCENTURE
 * @version 1.0
 */
public class ProcessingOperationException  extends Exception {

	/**
	 * Default serial version ID.
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * Description of the operation
	 */
	private String operation;

	/**	
     * Constructs a new ProcessingOperationException.
     * 
     * @param   sSpecificMessage    Indicates the message of the error happened.
     * @param	sOperation			Indicates the description of the operation. 
     */
    public ProcessingOperationException (String sSpecificMessage, String sOperation){
    	super("(Operation = '" + sOperation + "') :" + sSpecificMessage);
    	this.operation = sOperation;
    }

    /**
     * Get the description of the operation
     * 
     * @return string indicating the description of the operation.
     */
	public String getOperation() {
		return operation;
	}

    /**
     * Set the description of the operation
     * 
     * @param operation     string indicating the description of the operation.
     */
	public void setOperation(String operation) {
		this.operation = operation;
	}
}