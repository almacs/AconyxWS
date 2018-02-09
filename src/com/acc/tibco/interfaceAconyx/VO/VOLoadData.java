package com.acc.tibco.interfaceAconyx.VO;

import java.io.Serializable;

/**
 * Data type that receives the array of VODataToProcess 
 * representing the operations to be executed in the process.
 * 
 * @author  ACCENTURE
 * @version 1.0
 */
public class VOLoadData implements Serializable{
	
	/**
	 * Default serial version ID.
	 */
	private static final long serialVersionUID = 1L;
	private VODataToProcess[] VODataToProcess;

	/**	
     * Constructor by default.
     */
	public VOLoadData ()
	{}

    /**
     * Gets the array of data to process.
     * 
     * @return an array of VODataToProcess indicating the 
     * 		   operation to be executed in the process.
     */
	public VODataToProcess[] getVODataToProcess() {
		return VODataToProcess;
	}

    /**
     * Sets the array of data to process.
     * 
     * @param  VODataToProcess    an array of VODataToProcess indicating the 
     * 		   					  operation to be executed in the process.
     */
	public void setVODataToProcess(VODataToProcess[] VODataToProcess) {
		this.VODataToProcess = VODataToProcess;
	}
}