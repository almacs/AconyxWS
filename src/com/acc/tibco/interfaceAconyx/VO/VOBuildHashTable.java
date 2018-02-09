package com.acc.tibco.interfaceAconyx.VO;

import java.io.Serializable;

/**
 * Represents the data type that receives the initial set of 
 * parameters in the process.
 * 
 * @author  ACCENTURE
 * @version 1.0
 */
public class VOBuildHashTable implements Serializable
{
	/**
	 * Default serial version ID.
	 */
	private static final long serialVersionUID = 1L;
	private VOBuildHashProperties[] BuildHashPropeties;
		
	/**	
     * Constructor by default.
     */
	public VOBuildHashTable() 
	{}

    /**
     * Gets an array of VOBuildHashProperties, these values objects
     * represent a parameter.
     * 
     * @return an array of VOBuildHashProperties.
     */
	public VOBuildHashProperties[] getBuildHashPropeties()
	{
		return BuildHashPropeties;
	}
		
    /**
     * Sets an array of VOBuildHashProperties, these values objects
     * represent a parameter.
     * 
     * @param BuildHashPropeties   an array of VOBuildHashProperties.
     */
	public void setBuildHashPropeties(VOBuildHashProperties[] BuildHashPropeties)
	{
		this.BuildHashPropeties = BuildHashPropeties;
	}
 }