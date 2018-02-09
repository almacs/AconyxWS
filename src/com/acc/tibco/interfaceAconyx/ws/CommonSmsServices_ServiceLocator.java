/**
 * CommonSmsServices_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.acc.tibco.interfaceAconyx.ws;

public class CommonSmsServices_ServiceLocator extends org.apache.axis.client.Service implements com.acc.tibco.interfaceAconyx.ws.CommonSmsServices_Service {

    public CommonSmsServices_ServiceLocator() {
    }


    public CommonSmsServices_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CommonSmsServices_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CommonSmsServicesPort
    private java.lang.String CommonSmsServicesPort_address = "http://labserver1:8003/common-ws/CommonSmsServices/CommonSmsServices";

    public java.lang.String getCommonSmsServicesPortAddress() {
        return CommonSmsServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CommonSmsServicesPortWSDDServiceName = "CommonSmsServicesPort";

    public java.lang.String getCommonSmsServicesPortWSDDServiceName() {
        return CommonSmsServicesPortWSDDServiceName;
    }

    public void setCommonSmsServicesPortWSDDServiceName(java.lang.String name) {
        CommonSmsServicesPortWSDDServiceName = name;
    }

    public com.acc.tibco.interfaceAconyx.ws.CommonSmsServices_PortType getCommonSmsServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CommonSmsServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCommonSmsServicesPort(endpoint);
    }

    public com.acc.tibco.interfaceAconyx.ws.CommonSmsServices_PortType getCommonSmsServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.acc.tibco.interfaceAconyx.ws.CommonSmsServicesSoapBindingStub _stub = new com.acc.tibco.interfaceAconyx.ws.CommonSmsServicesSoapBindingStub(portAddress, this);
            _stub.setPortName(getCommonSmsServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCommonSmsServicesPortEndpointAddress(java.lang.String address) {
        CommonSmsServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.acc.tibco.interfaceAconyx.ws.CommonSmsServices_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.acc.tibco.interfaceAconyx.ws.CommonSmsServicesSoapBindingStub _stub = new com.acc.tibco.interfaceAconyx.ws.CommonSmsServicesSoapBindingStub(new java.net.URL(CommonSmsServicesPort_address), this);
                _stub.setPortName(getCommonSmsServicesPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CommonSmsServicesPort".equals(inputPortName)) {
            return getCommonSmsServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "CommonSmsServices");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "CommonSmsServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CommonSmsServicesPort".equals(portName)) {
            setCommonSmsServicesPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
