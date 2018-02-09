package com.acc.tibco.interfaceAconyx.VO;

/**
 * Represents the definition of parameters to get the process 
 * and are considered as the initial parameters.
 * 
 * @author  ACCENTURE
 * @version 1.0
 */
public class VOBuildHashProperties 
{
	private String Key,
	               Value;

	/**	
     * Constructor by default.
     */
	public VOBuildHashProperties ()
	{}
	
    /**
     * Gets the description of the initial parameter.
     * 
     * @return string indicating the description of the initial parameter.
     */
	public String getKey()
	{
		return Key;
	}
	
    /**
     * Sets the description of the initial parameter.
     * 
     * @param key     string indicating the description of the initial parameter.
     */
	public void setKey(String key)
	{
		this.Key = key;
	}
	
    /**
     * Gets the value of the initial parameter.
     * 
     * @return string indicating the value of the initial parameter.
     */
	public String getValue()
	{
		return Value;
	}
	
    /**
     * Sets the value of the initial parameter.
     * 
     * @param value     string indicating the value of the initial parameter.
     */
	public void setValue(String value)
	{
		this.Value = value;
	}
}