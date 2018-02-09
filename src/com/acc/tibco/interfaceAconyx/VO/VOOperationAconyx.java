package com.acc.tibco.interfaceAconyx.VO;

/**
 * Represents the definition of an operation.
 * 
 * @author  ACCENTURE
 * @version 1.0
 */
public class VOOperationAconyx {
	
	private String name;
	private VOParametersAconyx []parameters;
	private String nameWebService,
				   namePortWebService,
				   endPointAddrWebService,
				   targetNamespaceWebService;
	
	/**	
     * Constructor by default.
     */
	public VOOperationAconyx()
	{}

    /**
     * Gets the description of the operation.
     * 
     * @return string indicating the description of the operation.
     */
	public String getName() {
		return this.name;
	}

    /**
     * Sets the description of the operation.
     * 
     * @param  sName    	string indicating the description of 
     * 						the operation.
     */
	public void setName(String sName) {
		this.name = sName;
	}

    /**
     * Gets the set of parameters to solve for the execution of Operation.
     * 
     * @return an array of objects indicating the set of parameters
     * 		   of the operation.
     */
	public VOParametersAconyx[] getParameters() {
		return this.parameters;
	}

    /**
     * Sets the set of parameters to solve for the execution of Operation.
     * 
     * @param	parameters  	an array of objects indicating the set of parameters
     * 		   					of the operation.
     */
	public void setParameters(VOParametersAconyx[] parameters) {
		this.parameters = parameters;
	}

    /**
     * Gets the name of the web service of the Operation.
     * 
     * @return the string indicating the name of the
     *         web service of the operation.
     */
	public String getNameWebService() {
		return this.nameWebService;
	}

    /**
     * Sets the name of the web service of the Operation.
     * 
     * @param   sNameWebService     the string indicating the name of the
     *         						web service of the operation.
     */
	public void setNameWebService(String sNameWebService) {
		this.nameWebService = sNameWebService;
	}

    /**
     * Gets the name port of the web service of the Operation.
     * 
     * @return the string indicating the name port of the
     *         web service of the operation.
     */
	public String getNamePortWebService() {
		return this.namePortWebService;
	}

    /**
     * Sets the name port of the web service of the Operation.
     * 
     * @param   sNamePortWebService   	the string indicating the name port of the
     *         						  	web service of the operation.
     */
	public void setNamePortWebService(String sNamePortWebService) {
		this.namePortWebService = sNamePortWebService;
	}

    /**
     * Gets the end point address of the web service of the Operation.
     * 
     * @return the string indicating the end point address of the
     *         web service of the operation.
     */
	public String getEndPointAddrWebService() {
		return this.endPointAddrWebService;
	}

    /**
     * Sets the end point address of the web service of the Operation.
     * 
     * @param    sEndPointAddrWebService	the string indicating the end point address of the
     *         								web service of the operation.
     */
	public void setEndPointAddrWebService(String sEndPointAddrWebService) {
		this.endPointAddrWebService = sEndPointAddrWebService;
	}

    /**
     * Gets the target name space of the web service of the Operation.
     * 
     * @return the string indicating the target name space of the
     *         web service of the operation.
     */
	public String getTargetNamespaceWebService() {
		return this.targetNamespaceWebService;
	}

    /**
     * Sets the target name space of the web service of the Operation.
     * 
     * @param    sTargetNamespaceWebService     the string indicating the target name space of the
     *         									web service of the operation.
     */
	public void setTargetNamespaceWebService(String sTargetNamespaceWebService) {
		this.targetNamespaceWebService = sTargetNamespaceWebService;
	}
}