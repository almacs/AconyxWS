package com.acc.tibco.interfaceAconyx.VO;

/**
 * Represents the data type of the operations to be executed in the process 
 * with a detailed of its web service.
 * <br>
 * Each VODataToProcess details one parameter in a Operations, so by example 
 * there will be three VODataToProcess for an operation with three parameters.  
 * 
 * @author  ACCENTURE
 * @version 1.0
 */
public class VODataToProcess {
	
	private String nameWebService,
				   namePort,
				   endPointAddress,
				   targetNamespace,
				   operation,
				   paramSeq,
				   parameter,
				   value;
	
	/**	
     * Constructor by default.
     */
	public VODataToProcess()
	{}

    /**
     * Gets the name of the web service of the operation.
     * 
     * @return string indicating the name of the web service
     * 		   of the operation.
     */
	public String getNameWebService() {
		return nameWebService;
	}
	
    /**
     * Sets the name of the web service of the operation.
     * 
     * @param 	nameWebService		string indicating the name of the web service
     * 		   						of the operation.
     */
	public void setNameWebService(String nameWebService) {
		this.nameWebService = nameWebService;
	}

    /**
     * Gets the name port of the web service of the operation.
     * 
     * @return string indicating the name port of the web service
     * 		   		  of the operation.
     */
	public String getNamePort() {
		return namePort;
	}

    /**
     * Sets the name port of the web service of the operation.
     * 
     * @param 	namePort		string indicating the name port of the web service
     * 		   					of the operation.
     */
	public void setNamePort(String namePort) {
		this.namePort = namePort;
	}

    /**
     * Gets the end point address of the web service of the operation.
     * 
     * @return string 	indicating the end point address of the web service
     * 		   		  	of the operation.
     */
	public String getEndPointAddress() {
		return endPointAddress;
	}

    /**
     * Sets the end point address of the web service of the operation.
     * 
     * @param 	endPointAddress		string indicating the end point address of the web service
     * 		   						of the operation.
     */
	public void setEndPointAddress(String endPointAddress) {
		this.endPointAddress = endPointAddress;
	}

    /**
     * Gets the target name space of the web service of the operation.
     * 
     * @return string 	indicating the target name space of the web service
     * 		   		  	of the operation.
     */
	public String getTargetNamespace() {
		return targetNamespace;
	}

    /**
     * Sets the target name space of the web service of the operation.
     * 
     * @param 	targetNamespace		string indicating the target name space of the web service
     * 		   						of the operation.
     */
	public void setTargetNamespace(String targetNamespace) {
		this.targetNamespace = targetNamespace;
	}

    /**
     * Gets the description of the operation.
     * 
     * @return string 	indicating the description of the operation.
     */
	public String getOperation() {
		return operation;
	}

    /**
     * Sets the description of the operation.
     * 
     * @param 	operation		string indicating the description of the operation.
     */
	public void setOperation(String operation) {
		this.operation = operation;
	}

    /**
     * Gets the description of a parameter of the operation.
     * 
     * @return string 	indicating the description of a parameter.
     */
	public String getParameter() {
		return parameter;
	}

    /**
     * Sets the description of a parameter of the operation.
     * 
     * @param 	parameter		string indicating the description of a parameter.
     */
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

    /**
     * Gets the value of a parameter of the operation.
     * 
     * @return string 	indicating the value of a parameter.
     */
	public String getValue() {
		return value;
	}

    /**
     * Sets the value of a parameter of the operation.
     * 
     * @param 	value		string indicating the value of a parameter.
     */
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getParamSeq() {
		return paramSeq;
	}

	public void setParamSeq(String paramSeq) {
		this.paramSeq = paramSeq;
	}
}