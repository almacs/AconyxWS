package com.acc.tibco.interfaceAconyx.exception;

/**
 * This class represents an ResolvingParametersException exception
 * which happened resolving a parameter.
 *
 * @author  ACCENTURE
 * @version 1.0
 */

public class ResolvingParametersException extends Exception {

	/**
	 * Default serial version ID.
	 */
	private static final long serialVersionUID = 1L;
	private String parameter;
    private String value;
    private String message;

	/**	
     * Constructs a new exception.
     * 
     * @param   sSpecificMessage      	Indicates the message of the error happened.
     * @param	sParam					Indicates the description of the parameter.
     * @param	sValue					Indicates the value of the parameter.
     */
	public ResolvingParametersException(String sSpecificMessage, String sParam, String sValue) {
    	super("(Parameter = '" + sParam + "', with value = '" + sValue + "') :" + sSpecificMessage);
    	
    	this.parameter = sParam;
    	this.value = sValue;
    	this.message = sSpecificMessage;
    }

	/**	
     * Gets the name of the parameter when an error happened.
     * 
     * @return	The string indicating the description of the parameter.
     */
	public String getParameter() {
		return parameter;
	}

	/**	
     * Sets the name of the parameter when an error happened.
     * 
     * @param 	parameter   Indicates the description of the parameter.
     */
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	/**	
     * Gets the value of the parameter when an error happened.
     * 
     * @return	The string indicating the value of the parameter.
     */
	public String getValue() {
		return value;
	}

	/**	
     * Sets the value of the parameter when an error happened.
     * 
     * @param 	value   Indicates the description of the parameter value.
     */
	public void setValue(String value) {
		this.value = value;
	}

	/**	
     * Gets the message of the error when it happened.
     * 
     * @return	The string indicating the message of the error.
     */
	public String getMessage() {
		return message;
	}

	/**	
     * Sets the message of the error when it happened.
     * 
     * @param 	message   Indicates the message of the error.
     */
	public void setMessage(String message) {
		this.message = message;
	}
}