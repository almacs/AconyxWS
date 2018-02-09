package com.acc.tibco.interfaceAconyx.VO;

/**
 * Represents the definition of a parameter in the process.
 * 
 * @author  ACCENTURE
 * @version 1.0
 */
public class VOParametersAconyx {
	
	private String parameterName;
	private Object parameterValue;
	
	/**	
     * Constructor by default.
     */
	public VOParametersAconyx()
	{}
	
	/**	
     * Constructor with parameters.
     * 
     * @param     	sName      	Indicates the description of a parameter.
     * @param		sValue		Indicates the value of a parameter.
     */
	public VOParametersAconyx(String sName, Object sValue){
		this.parameterName = sName;
		this.parameterValue = sValue;
	}

    /**
     * Gets the description of the parameter.
     * 
     * @return string indicating the description of the parameter.
     */
	public String getparameterName() {
		return parameterName;
	}

    /**
     * Sets the description of the parameter.
     * 
     * @param	sParameterName		string indicating the description of the parameter.
     */
	public void setParameterName(String sParameterName) {
		this.parameterName = sParameterName;
	}

    /**
     * Gets the value of the parameter.
     * 
     * @return string indicating the value of the parameter.
     */
	public Object getParameterValue() {
		return this.parameterValue;
	}

    /**
     * Sets the value of the parameter.
     * 
     * @param	sParameterValue		string indicating the value of the parameter.
     */
	public void setParameterValue(Object sParameterValue) {
		this.parameterValue = sParameterValue;
	}
}