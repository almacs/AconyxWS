/**
 * CommonSmsServicesSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.acc.tibco.interfaceAconyx.ws;

public class CommonSmsServicesSoapBindingStub extends org.apache.axis.client.Stub implements com.acc.tibco.interfaceAconyx.ws.CommonSmsServices_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[16];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("authenticateUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AuthInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "authInfo"), com.acc.tibco.interfaceAconyx.ws.AuthInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        oper.setReturnClass(com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("publishUnitOfWork");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UowJob"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "uowJob"), com.acc.tibco.interfaceAconyx.ws.UowJob.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        oper.setReturnClass(com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUnPublishedUowList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UnPublishedUowList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "unPublishedUowList"), com.acc.tibco.interfaceAconyx.ws.UnPublishedUowList.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        oper.setReturnClass(com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteUnitOfWork");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UnitOfWork"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "unitOfWork"), com.acc.tibco.interfaceAconyx.ws.UnitOfWork.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        oper.setReturnClass(com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPublishedUOWStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UowStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "uowStatus"), com.acc.tibco.interfaceAconyx.ws.UowStatus.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        oper.setReturnClass(com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createOrganizationAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AccountInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "accountInfo"), com.acc.tibco.interfaceAconyx.ws.AccountInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        oper.setReturnClass(com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("releaseUOWFromSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UnitOfWork"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "unitOfWork"), com.acc.tibco.interfaceAconyx.ws.UnitOfWork.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        oper.setReturnClass(com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createUnitOfWork");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UnitOfWork"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "unitOfWork"), com.acc.tibco.interfaceAconyx.ws.UnitOfWork.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        oper.setReturnClass(com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteOrganizationAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AccountInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "accountInfo"), com.acc.tibco.interfaceAconyx.ws.AccountInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        oper.setReturnClass(com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logoutUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AuthInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "authInfo"), com.acc.tibco.interfaceAconyx.ws.AuthInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        oper.setReturnClass(com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrganizationAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AccountInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "accountInfo"), com.acc.tibco.interfaceAconyx.ws.AccountInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        oper.setReturnClass(com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrganizationList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OrganizationAccountList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "organizationAccountList"), com.acc.tibco.interfaceAconyx.ws.OrganizationAccountList.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        oper.setReturnClass(com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("subscribeService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Subscription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "subscription"), com.acc.tibco.interfaceAconyx.ws.Subscription.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        oper.setReturnClass(com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUOWStatusOnGC");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UOWDetailList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "uowDetailList"), com.acc.tibco.interfaceAconyx.ws.UowDetailList.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        oper.setReturnClass(com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateOrganizationAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AccountInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "accountInfo"), com.acc.tibco.interfaceAconyx.ws.AccountInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        oper.setReturnClass(com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("selectUnitOfWork");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UnitOfWork"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "unitOfWork"), com.acc.tibco.interfaceAconyx.ws.UnitOfWork.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse"));
        oper.setReturnClass(com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

    }

    public CommonSmsServicesSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CommonSmsServicesSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CommonSmsServicesSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", ">accountInfo>AddressList");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.Address[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "address");
            qName2 = new javax.xml.namespace.QName("", "Address");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", ">organizationAccountList>OrganizationAccList");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.Organization[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "organization");
            qName2 = new javax.xml.namespace.QName("", "Organization");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", ">unPublishedUowList>NonPublishedUowList");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.Uow[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "uow");
            qName2 = new javax.xml.namespace.QName("", "Uow");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", ">WSResponse>PartialFailure");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.Failed[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "failed");
            qName2 = new javax.xml.namespace.QName("", "Failed");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "account");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.Account.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "accountInfo");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.AccountInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "address");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "authInfo");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.AuthInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "error");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.Error.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "failed");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.Failed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "organization");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.Organization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "organizationAccountList");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.OrganizationAccountList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "subscription");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.Subscription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "success");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.Success.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "unitOfWork");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.UnitOfWork.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "unPublishedUowList");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.UnPublishedUowList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "uow");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.Uow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "uowDetail");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.UowDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "uowDetailList");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.UowDetailList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "uowJob");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.UowJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "uowStatus");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.UowStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "wsGenericObject");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.WSGenericObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "WSResponse");
            cachedSerQNames.add(qName);
            cls = com.acc.tibco.interfaceAconyx.ws.WSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse authenticateUser(com.acc.tibco.interfaceAconyx.ws.AuthInfo authInfo, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "authenticateUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authInfo, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse publishUnitOfWork(com.acc.tibco.interfaceAconyx.ws.UowJob uowJob, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "publishUnitOfWork"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uowJob, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse getUnPublishedUowList(com.acc.tibco.interfaceAconyx.ws.UnPublishedUowList unPublishedUowList, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "getUnPublishedUowList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unPublishedUowList, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse deleteUnitOfWork(com.acc.tibco.interfaceAconyx.ws.UnitOfWork unitOfWork, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "deleteUnitOfWork"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unitOfWork, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse getPublishedUOWStatus(com.acc.tibco.interfaceAconyx.ws.UowStatus uowStatus, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "getPublishedUOWStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uowStatus, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse createOrganizationAccount(com.acc.tibco.interfaceAconyx.ws.AccountInfo accountInfo, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "createOrganizationAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accountInfo, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse releaseUOWFromSession(com.acc.tibco.interfaceAconyx.ws.UnitOfWork unitOfWork, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "releaseUOWFromSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unitOfWork, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse createUnitOfWork(com.acc.tibco.interfaceAconyx.ws.UnitOfWork unitOfWork, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "createUnitOfWork"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unitOfWork, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse deleteOrganizationAccount(com.acc.tibco.interfaceAconyx.ws.AccountInfo accountInfo, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "deleteOrganizationAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accountInfo, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse logoutUser(com.acc.tibco.interfaceAconyx.ws.AuthInfo authInfo, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "logoutUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authInfo, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse getOrganizationAccount(com.acc.tibco.interfaceAconyx.ws.AccountInfo accountInfo, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "getOrganizationAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accountInfo, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse getOrganizationList(com.acc.tibco.interfaceAconyx.ws.OrganizationAccountList organizationAccountList, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "getOrganizationList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {organizationAccountList, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse subscribeService(com.acc.tibco.interfaceAconyx.ws.Subscription subscription, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "subscribeService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subscription, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse getUOWStatusOnGC(com.acc.tibco.interfaceAconyx.ws.UowDetailList UOWDetailList, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "getUOWStatusOnGC"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {UOWDetailList, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse updateOrganizationAccount(com.acc.tibco.interfaceAconyx.ws.AccountInfo accountInfo, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "updateOrganizationAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accountInfo, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.acc.tibco.interfaceAconyx.ws.WSResponse selectUnitOfWork(com.acc.tibco.interfaceAconyx.ws.UnitOfWork unitOfWork, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "selectUnitOfWork"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unitOfWork, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.acc.tibco.interfaceAconyx.ws.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.acc.tibco.interfaceAconyx.ws.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
