package com.acc.tibco.interfaceAconyx.VO;

/**
 * Represents the parameters to be retained after the execution of an operation.
 * <br>
 * The response of executing an operation is a XML format, so a tag begin and
 * a tag end are considered to know the specific location of the parameter
 * in the response.    
 * 
 * @author  ACCENTURE
 * @version 1.0
 */
public class VOOutParameters {
	
	private String operation;
	private String parameter;
	private String tagBegin;
	private String tagEnd;
	
	/**	
     * Constructor by default.
     */
	public VOOutParameters ()
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
     * @param    operation      string indicating the description of the executed operation.
     */
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	/**
     * Gets the description of the parameter to be retained in the process.
     * 
     * @return string indicating the description of parameter.
     */
	public String getParameter() {
		return parameter;
	}
	
	/**
     * Sets the description of the parameter to be retained in the process.
     * 
     * @param     parameter   string indicating the description of parameter.
     */
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	
	/**
     * Gets the tag begin of the parameter to be retained in the process.
     * 
     * @return string indicating the tag begin of parameter.
     */	
	public String getTagBegin() {
		return tagBegin;
	}
	
	/**
     * Sets the tag begin of the parameter to be retained in the process.
     * 
     * @param     tagBegin    string indicating the tag begin of parameter.
     */	
	public void setTagBegin(String tagBegin) {
		this.tagBegin = tagBegin;
	}
	
	/**
     * Gets the tag end of the parameter to be retained in the process.
     * 
     * @return string indicating the tag end of parameter.
     */	
	public String getTagEnd() {
		return tagEnd;
	}
	
	/**
     * Sets the tag end of the parameter to be retained in the process.
     * 
     * @param     tagEnd    string indicating the tag end of parameter.
     */	
	public void setTagEnd(String tagEnd) {
		this.tagEnd = tagEnd;
	}
}