package com.acc.tibco.interfaceAconyx.VO;

import java.io.Serializable;

/**
 * Represents the definition of the result when the process has finished.
 * 
 * @author  ACCENTURE
 * @version 1.0
 */
public class VOReturnValue implements Serializable{
	
	/**
	 * Default serial version ID.
	 */
	private static final long serialVersionUID = 1L;
	private String uowId;
	private String accountNo;
	private String status;
	private String description;
	
	/**	
     * Constructor by default.
     */
	public VOReturnValue ()
	{}
	
    /**
     * Gets the identifier of Unit Of Work if exists in the process.
     * 
     * @return string indicating the Unit Of Work.
     */
	public String getUowId() {
		return uowId;
	}
	
    /**
     * Sets the identifier of Unit Of Work.
     * 
     * @param	uowId	string indicating the Unit Of Work.
     */
	public void setUowId(String uowId) {
		this.uowId = uowId;
	}
	
    /**
     * Gets the identifier of the Account Number.
     * 
     * @return string indicating the Account Number.
     */
	public String getAccountNo() {
		return accountNo;
	}

    /**
     * Sets the identifier of the Account Number.
     * 
     * @param	accountNo	string indicating the Account Number.
     */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
    /**
     * Gets the status when the process has finished.
     * This status could be:
     * <list>
     * Success
     * Error
     * </list>
     * @return string indicating the status of the process.
     */
	public String getStatus() {
		return status;
	}
	
    /**
     * Sets the status when the process has finished.
     * 
     * @param		status		string indicating the status of the process.
     */
	public void setStatus(String status) {
		this.status = status;
	}
	
    /**
     * Gets a description when the process has finished. 
     * This description is a detailed message of the success 
     * or the error happened in the process.
     * @return string indicating the description of the status of the process.
     */
	public String getDescription() {
		return description;
	}

    /**
     * Sets a description when the process has finished. 
     * This description is a detailed message of the success 
     * or the error happened in the process.
     * @param		description		string indicating the description of the status of the process.
     */
	public void setDescription(String description) {
		this.description = description;
	}
}