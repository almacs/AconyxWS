/**
 * Subscription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.acc.tibco.interfaceAconyx.ws;

public class Subscription  extends com.acc.tibco.interfaceAconyx.ws.WSGenericObject  implements java.io.Serializable {
    private java.lang.Long accountNumber;

    private java.lang.Long serviceId;

    private java.lang.Long status;

    private java.lang.Long parentStatus;

    private java.lang.String chargeNumber;

    private java.lang.String activationDate;

    private java.lang.String expirationDate;

    private java.lang.String serviceName;

    private java.lang.Long uowId;

    public Subscription() {
    }

    public Subscription(
           java.lang.Long accountNumber,
           java.lang.Long serviceId,
           java.lang.Long status,
           java.lang.Long parentStatus,
           java.lang.String chargeNumber,
           java.lang.String activationDate,
           java.lang.String expirationDate,
           java.lang.String serviceName,
           java.lang.Long uowId) {
        this.accountNumber = accountNumber;
        this.serviceId = serviceId;
        this.status = status;
        this.parentStatus = parentStatus;
        this.chargeNumber = chargeNumber;
        this.activationDate = activationDate;
        this.expirationDate = expirationDate;
        this.serviceName = serviceName;
        this.uowId = uowId;
    }


    /**
     * Gets the accountNumber value for this Subscription.
     * 
     * @return accountNumber
     */
    public java.lang.Long getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this Subscription.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.Long accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the serviceId value for this Subscription.
     * 
     * @return serviceId
     */
    public java.lang.Long getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this Subscription.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.Long serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the status value for this Subscription.
     * 
     * @return status
     */
    public java.lang.Long getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Subscription.
     * 
     * @param status
     */
    public void setStatus(java.lang.Long status) {
        this.status = status;
    }


    /**
     * Gets the parentStatus value for this Subscription.
     * 
     * @return parentStatus
     */
    public java.lang.Long getParentStatus() {
        return parentStatus;
    }


    /**
     * Sets the parentStatus value for this Subscription.
     * 
     * @param parentStatus
     */
    public void setParentStatus(java.lang.Long parentStatus) {
        this.parentStatus = parentStatus;
    }


    /**
     * Gets the chargeNumber value for this Subscription.
     * 
     * @return chargeNumber
     */
    public java.lang.String getChargeNumber() {
        return chargeNumber;
    }


    /**
     * Sets the chargeNumber value for this Subscription.
     * 
     * @param chargeNumber
     */
    public void setChargeNumber(java.lang.String chargeNumber) {
        this.chargeNumber = chargeNumber;
    }


    /**
     * Gets the activationDate value for this Subscription.
     * 
     * @return activationDate
     */
    public java.lang.String getActivationDate() {
        return activationDate;
    }


    /**
     * Sets the activationDate value for this Subscription.
     * 
     * @param activationDate
     */
    public void setActivationDate(java.lang.String activationDate) {
        this.activationDate = activationDate;
    }


    /**
     * Gets the expirationDate value for this Subscription.
     * 
     * @return expirationDate
     */
    public java.lang.String getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this Subscription.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.lang.String expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the serviceName value for this Subscription.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this Subscription.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the uowId value for this Subscription.
     * 
     * @return uowId
     */
    public java.lang.Long getUowId() {
        return uowId;
    }


    /**
     * Sets the uowId value for this Subscription.
     * 
     * @param uowId
     */
    public void setUowId(java.lang.Long uowId) {
        this.uowId = uowId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Subscription)) return false;
        Subscription other = (Subscription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.parentStatus==null && other.getParentStatus()==null) || 
             (this.parentStatus!=null &&
              this.parentStatus.equals(other.getParentStatus()))) &&
            ((this.chargeNumber==null && other.getChargeNumber()==null) || 
             (this.chargeNumber!=null &&
              this.chargeNumber.equals(other.getChargeNumber()))) &&
            ((this.activationDate==null && other.getActivationDate()==null) || 
             (this.activationDate!=null &&
              this.activationDate.equals(other.getActivationDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.uowId==null && other.getUowId()==null) || 
             (this.uowId!=null &&
              this.uowId.equals(other.getUowId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getParentStatus() != null) {
            _hashCode += getParentStatus().hashCode();
        }
        if (getChargeNumber() != null) {
            _hashCode += getChargeNumber().hashCode();
        }
        if (getActivationDate() != null) {
            _hashCode += getActivationDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getUowId() != null) {
            _hashCode += getUowId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Subscription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "subscription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ParentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChargeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ActivationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uowId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UowId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
