package com.acc.tibco.interfaceAconyx.VO;

/**
 * Represents the definition of an operation where it is necessary 
 * returning changes after an error in the process.
 * 
 * @author  ACCENTURE
 * @version 1.0
 */
public class VODataToBeReturned {

	/**
	 * Represents the description of the executed operation. 
	 */
	private String operation;
	
	/**
	 * Represents the operation to return changes due to the execution of other operation. 
	 */
	private VODataToProcess operToBeReturned;

	/**	
     * Constructor by default.
     */
	public VODataToBeReturned()
	{}

    /**
     * Gets the description of the executed operation.
     * 
     * @return string indicating the description of the executed operation.
     */
	public String getOperation() {
		return operation;
	}

    /**
     * Sets the description of the executed operation.
     * 
     * @param  operation    string indicating the description of 
     * 						the executed operation.
     */
	public void setOperation(String operation) {
		this.operation = operation;
	}

    /**
     * Gets the operation to return changes due to the execution of an operation.
     * 
     * @return an operation to return changes by the execution of the operation;
     *         this is represented by the object VODataToProcess.
     */
	public VODataToProcess getOperToBeReturned() {
		return operToBeReturned;
	}
	
    /**
     * Sets the operation to return changes due to the execution of an operation.
     * 
     * @param	operToBeReturned		operation to return changes due to the execution 
     * 									of a operation with error; 
     * 									this operation is represented by the object VODataToProcess.
     */
	public void setOperToBeReturned(VODataToProcess operToBeReturned) {
		this.operToBeReturned = operToBeReturned;
	}
}