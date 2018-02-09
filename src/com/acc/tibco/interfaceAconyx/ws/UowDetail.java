/**
 * UowDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.acc.tibco.interfaceAconyx.ws;

public class UowDetail  extends com.acc.tibco.interfaceAconyx.ws.WSGenericObject  implements java.io.Serializable {
    private java.lang.String provisioningKey;

    private java.lang.String GCClusterId;

    private java.lang.String publishTime;

    private java.lang.Long uowId;

    public UowDetail() {
    }

    public UowDetail(
           java.lang.String provisioningKey,
           java.lang.String GCClusterId,
           java.lang.String publishTime,
           java.lang.Long uowId) {
        this.provisioningKey = provisioningKey;
        this.GCClusterId = GCClusterId;
        this.publishTime = publishTime;
        this.uowId = uowId;
    }


    /**
     * Gets the provisioningKey value for this UowDetail.
     * 
     * @return provisioningKey
     */
    public java.lang.String getProvisioningKey() {
        return provisioningKey;
    }


    /**
     * Sets the provisioningKey value for this UowDetail.
     * 
     * @param provisioningKey
     */
    public void setProvisioningKey(java.lang.String provisioningKey) {
        this.provisioningKey = provisioningKey;
    }


    /**
     * Gets the GCClusterId value for this UowDetail.
     * 
     * @return GCClusterId
     */
    public java.lang.String getGCClusterId() {
        return GCClusterId;
    }


    /**
     * Sets the GCClusterId value for this UowDetail.
     * 
     * @param GCClusterId
     */
    public void setGCClusterId(java.lang.String GCClusterId) {
        this.GCClusterId = GCClusterId;
    }


    /**
     * Gets the publishTime value for this UowDetail.
     * 
     * @return publishTime
     */
    public java.lang.String getPublishTime() {
        return publishTime;
    }


    /**
     * Sets the publishTime value for this UowDetail.
     * 
     * @param publishTime
     */
    public void setPublishTime(java.lang.String publishTime) {
        this.publishTime = publishTime;
    }


    /**
     * Gets the uowId value for this UowDetail.
     * 
     * @return uowId
     */
    public java.lang.Long getUowId() {
        return uowId;
    }


    /**
     * Sets the uowId value for this UowDetail.
     * 
     * @param uowId
     */
    public void setUowId(java.lang.Long uowId) {
        this.uowId = uowId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UowDetail)) return false;
        UowDetail other = (UowDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.provisioningKey==null && other.getProvisioningKey()==null) || 
             (this.provisioningKey!=null &&
              this.provisioningKey.equals(other.getProvisioningKey()))) &&
            ((this.GCClusterId==null && other.getGCClusterId()==null) || 
             (this.GCClusterId!=null &&
              this.GCClusterId.equals(other.getGCClusterId()))) &&
            ((this.publishTime==null && other.getPublishTime()==null) || 
             (this.publishTime!=null &&
              this.publishTime.equals(other.getPublishTime()))) &&
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
        if (getProvisioningKey() != null) {
            _hashCode += getProvisioningKey().hashCode();
        }
        if (getGCClusterId() != null) {
            _hashCode += getGCClusterId().hashCode();
        }
        if (getPublishTime() != null) {
            _hashCode += getPublishTime().hashCode();
        }
        if (getUowId() != null) {
            _hashCode += getUowId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UowDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "uowDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisioningKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProvisioningKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GCClusterId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GCClusterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PublishTime"));
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
