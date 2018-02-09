/**
 * CommonSmsServicesSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.acc.tibco.interfaceAconyx.ws;

public class CommonSmsServicesSoapBindingSkeleton implements com.acc.tibco.interfaceAconyx.ws.CommonSmsServices_PortType, org.apache.axis.wsdl.Skeleton {
    private com.acc.tibco.interfaceAconyx.ws.CommonSmsServices_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AuthInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "authInfo"), com.acc.tibco.interfaceAconyx.ws.AuthInfo.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("authenticateUser", _params, new javax.xml.namespace.QName("", "WSResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "authenticateUser"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("authenticateUser") == null) {
            _myOperations.put("authenticateUser", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("authenticateUser")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UowJob"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "uowJob"), com.acc.tibco.interfaceAconyx.ws.UowJob.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("publishUnitOfWork", _params, new javax.xml.namespace.QName("", "WSResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "publishUnitOfWork"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("publishUnitOfWork") == null) {
            _myOperations.put("publishUnitOfWork", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("publishUnitOfWork")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UnPublishedUowList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "unPublishedUowList"), com.acc.tibco.interfaceAconyx.ws.UnPublishedUowList.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getUnPublishedUowList", _params, new javax.xml.namespace.QName("", "WSResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "getUnPublishedUowList"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getUnPublishedUowList") == null) {
            _myOperations.put("getUnPublishedUowList", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getUnPublishedUowList")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UnitOfWork"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "unitOfWork"), com.acc.tibco.interfaceAconyx.ws.UnitOfWork.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteUnitOfWork", _params, new javax.xml.namespace.QName("", "WSResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "deleteUnitOfWork"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteUnitOfWork") == null) {
            _myOperations.put("deleteUnitOfWork", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteUnitOfWork")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UowStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "uowStatus"), com.acc.tibco.interfaceAconyx.ws.UowStatus.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getPublishedUOWStatus", _params, new javax.xml.namespace.QName("", "WSResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "getPublishedUOWStatus"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getPublishedUOWStatus") == null) {
            _myOperations.put("getPublishedUOWStatus", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getPublishedUOWStatus")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AccountInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "accountInfo"), com.acc.tibco.interfaceAconyx.ws.AccountInfo.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createOrganizationAccount", _params, new javax.xml.namespace.QName("", "WSResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "createOrganizationAccount"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createOrganizationAccount") == null) {
            _myOperations.put("createOrganizationAccount", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createOrganizationAccount")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UnitOfWork"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "unitOfWork"), com.acc.tibco.interfaceAconyx.ws.UnitOfWork.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("releaseUOWFromSession", _params, new javax.xml.namespace.QName("", "WSResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "releaseUOWFromSession"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("releaseUOWFromSession") == null) {
            _myOperations.put("releaseUOWFromSession", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("releaseUOWFromSession")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UnitOfWork"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "unitOfWork"), com.acc.tibco.interfaceAconyx.ws.UnitOfWork.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createUnitOfWork", _params, new javax.xml.namespace.QName("", "WSResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "createUnitOfWork"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createUnitOfWork") == null) {
            _myOperations.put("createUnitOfWork", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createUnitOfWork")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AccountInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "accountInfo"), com.acc.tibco.interfaceAconyx.ws.AccountInfo.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteOrganizationAccount", _params, new javax.xml.namespace.QName("", "WSResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "deleteOrganizationAccount"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteOrganizationAccount") == null) {
            _myOperations.put("deleteOrganizationAccount", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteOrganizationAccount")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AuthInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "authInfo"), com.acc.tibco.interfaceAconyx.ws.AuthInfo.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("logoutUser", _params, new javax.xml.namespace.QName("", "WSResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "logoutUser"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("logoutUser") == null) {
            _myOperations.put("logoutUser", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("logoutUser")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AccountInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "accountInfo"), com.acc.tibco.interfaceAconyx.ws.AccountInfo.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getOrganizationAccount", _params, new javax.xml.namespace.QName("", "WSResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "getOrganizationAccount"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getOrganizationAccount") == null) {
            _myOperations.put("getOrganizationAccount", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getOrganizationAccount")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OrganizationAccountList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "organizationAccountList"), com.acc.tibco.interfaceAconyx.ws.OrganizationAccountList.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getOrganizationList", _params, new javax.xml.namespace.QName("", "WSResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "getOrganizationList"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getOrganizationList") == null) {
            _myOperations.put("getOrganizationList", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getOrganizationList")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Subscription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "subscription"), com.acc.tibco.interfaceAconyx.ws.Subscription.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("subscribeService", _params, new javax.xml.namespace.QName("", "WSResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "subscribeService"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("subscribeService") == null) {
            _myOperations.put("subscribeService", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("subscribeService")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UOWDetailList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "uowDetailList"), com.acc.tibco.interfaceAconyx.ws.UowDetailList.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getUOWStatusOnGC", _params, new javax.xml.namespace.QName("", "WSResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "getUOWStatusOnGC"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getUOWStatusOnGC") == null) {
            _myOperations.put("getUOWStatusOnGC", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getUOWStatusOnGC")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AccountInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "accountInfo"), com.acc.tibco.interfaceAconyx.ws.AccountInfo.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateOrganizationAccount", _params, new javax.xml.namespace.QName("", "WSResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "updateOrganizationAccount"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateOrganizationAccount") == null) {
            _myOperations.put("updateOrganizationAccount", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateOrganizationAccount")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UnitOfWork"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "unitOfWork"), com.acc.tibco.interfaceAconyx.ws.UnitOfWork.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("selectUnitOfWork", _params, new javax.xml.namespace.QName("", "WSResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "selectUnitOfWork"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("selectUnitOfWork") == null) {
            _myOperations.put("selectUnitOfWork", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("selectUnitOfWork")).add(_oper);
    }

    public CommonSmsServicesSoapBindingSkeleton() {
        this.impl = new com.acc.tibco.interfaceAconyx.ws.CommonSmsServicesSoapBindingImpl();
    }

    public CommonSmsServicesSoapBindingSkeleton(com.acc.tibco.interfaceAconyx.ws.CommonSmsServices_PortType impl) {
        this.impl = impl;
    }
    public com.acc.tibco.interfaceAconyx.ws.WSResponse authenticateUser(com.acc.tibco.interfaceAconyx.ws.AuthInfo authInfo, java.lang.String sessionId) throws java.rmi.RemoteException
    {
        com.acc.tibco.interfaceAconyx.ws.WSResponse ret = impl.authenticateUser(authInfo, sessionId);
        return ret;
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse publishUnitOfWork(com.acc.tibco.interfaceAconyx.ws.UowJob uowJob, java.lang.String sessionId) throws java.rmi.RemoteException
    {
        com.acc.tibco.interfaceAconyx.ws.WSResponse ret = impl.publishUnitOfWork(uowJob, sessionId);
        return ret;
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse getUnPublishedUowList(com.acc.tibco.interfaceAconyx.ws.UnPublishedUowList unPublishedUowList, java.lang.String sessionId) throws java.rmi.RemoteException
    {
        com.acc.tibco.interfaceAconyx.ws.WSResponse ret = impl.getUnPublishedUowList(unPublishedUowList, sessionId);
        return ret;
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse deleteUnitOfWork(com.acc.tibco.interfaceAconyx.ws.UnitOfWork unitOfWork, java.lang.String sessionId) throws java.rmi.RemoteException
    {
        com.acc.tibco.interfaceAconyx.ws.WSResponse ret = impl.deleteUnitOfWork(unitOfWork, sessionId);
        return ret;
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse getPublishedUOWStatus(com.acc.tibco.interfaceAconyx.ws.UowStatus uowStatus, java.lang.String sessionId) throws java.rmi.RemoteException
    {
        com.acc.tibco.interfaceAconyx.ws.WSResponse ret = impl.getPublishedUOWStatus(uowStatus, sessionId);
        return ret;
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse createOrganizationAccount(com.acc.tibco.interfaceAconyx.ws.AccountInfo accountInfo, java.lang.String sessionId) throws java.rmi.RemoteException
    {
        com.acc.tibco.interfaceAconyx.ws.WSResponse ret = impl.createOrganizationAccount(accountInfo, sessionId);
        return ret;
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse releaseUOWFromSession(com.acc.tibco.interfaceAconyx.ws.UnitOfWork unitOfWork, java.lang.String sessionId) throws java.rmi.RemoteException
    {
        com.acc.tibco.interfaceAconyx.ws.WSResponse ret = impl.releaseUOWFromSession(unitOfWork, sessionId);
        return ret;
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse createUnitOfWork(com.acc.tibco.interfaceAconyx.ws.UnitOfWork unitOfWork, java.lang.String sessionId) throws java.rmi.RemoteException
    {
        com.acc.tibco.interfaceAconyx.ws.WSResponse ret = impl.createUnitOfWork(unitOfWork, sessionId);
        return ret;
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse deleteOrganizationAccount(com.acc.tibco.interfaceAconyx.ws.AccountInfo accountInfo, java.lang.String sessionId) throws java.rmi.RemoteException
    {
        com.acc.tibco.interfaceAconyx.ws.WSResponse ret = impl.deleteOrganizationAccount(accountInfo, sessionId);
        return ret;
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse logoutUser(com.acc.tibco.interfaceAconyx.ws.AuthInfo authInfo, java.lang.String sessionId) throws java.rmi.RemoteException
    {
        com.acc.tibco.interfaceAconyx.ws.WSResponse ret = impl.logoutUser(authInfo, sessionId);
        return ret;
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse getOrganizationAccount(com.acc.tibco.interfaceAconyx.ws.AccountInfo accountInfo, java.lang.String sessionId) throws java.rmi.RemoteException
    {
        com.acc.tibco.interfaceAconyx.ws.WSResponse ret = impl.getOrganizationAccount(accountInfo, sessionId);
        return ret;
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse getOrganizationList(com.acc.tibco.interfaceAconyx.ws.OrganizationAccountList organizationAccountList, java.lang.String sessionId) throws java.rmi.RemoteException
    {
        com.acc.tibco.interfaceAconyx.ws.WSResponse ret = impl.getOrganizationList(organizationAccountList, sessionId);
        return ret;
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse subscribeService(com.acc.tibco.interfaceAconyx.ws.Subscription subscription, java.lang.String sessionId) throws java.rmi.RemoteException
    {
        com.acc.tibco.interfaceAconyx.ws.WSResponse ret = impl.subscribeService(subscription, sessionId);
        return ret;
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse getUOWStatusOnGC(com.acc.tibco.interfaceAconyx.ws.UowDetailList UOWDetailList, java.lang.String sessionId) throws java.rmi.RemoteException
    {
        com.acc.tibco.interfaceAconyx.ws.WSResponse ret = impl.getUOWStatusOnGC(UOWDetailList, sessionId);
        return ret;
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse updateOrganizationAccount(com.acc.tibco.interfaceAconyx.ws.AccountInfo accountInfo, java.lang.String sessionId) throws java.rmi.RemoteException
    {
        com.acc.tibco.interfaceAconyx.ws.WSResponse ret = impl.updateOrganizationAccount(accountInfo, sessionId);
        return ret;
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse selectUnitOfWork(com.acc.tibco.interfaceAconyx.ws.UnitOfWork unitOfWork, java.lang.String sessionId) throws java.rmi.RemoteException
    {
        com.acc.tibco.interfaceAconyx.ws.WSResponse ret = impl.selectUnitOfWork(unitOfWork, sessionId);
        return ret;
    }

}
