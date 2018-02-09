/**
 * UowStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.acc.tibco.interfaceAconyx.ws;

public class UowStatus  extends com.acc.tibco.interfaceAconyx.ws.WSGenericObject  implements java.io.Serializable {
    private java.lang.Long uowId;

    private java.lang.String loginUserAccountNo;

    public UowStatus() {
    }

    public UowStatus(
           java.lang.Long uowId,
           java.lang.String loginUserAccountNo) {
        this.uowId = uowId;
        this.loginUserAccountNo = loginUserAccountNo;
    }


    /**
     * Gets the uowId value for this UowStatus.
     * 
     * @return uowId
     */
    public java.lang.Long getUowId() {
        return uowId;
    }


    /**
     * Sets the uowId value for this UowStatus.
     * 
     * @param uowId
     */
    public void setUowId(java.lang.Long uowId) {
        this.uowId = uowId;
    }


    /**
     * Gets the loginUserAccountNo value for this UowStatus.
     * 
     * @return loginUserAccountNo
     */
    public java.lang.String getLoginUserAccountNo() {
        return loginUserAccountNo;
    }


    /**
     * Sets the loginUserAccountNo value for this UowStatus.
     * 
     * @param loginUserAccountNo
     */
    public void setLoginUserAccountNo(java.lang.String loginUserAccountNo) {
        this.loginUserAccountNo = loginUserAccountNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UowStatus)) return false;
        UowStatus other = (UowStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.uowId==null && other.getUowId()==null) || 
             (this.uowId!=null &&
              this.uowId.equals(other.getUowId()))) &&
            ((this.loginUserAccountNo==null && other.getLoginUserAccountNo()==null) || 
             (this.loginUserAccountNo!=null &&
              this.loginUserAccountNo.equals(other.getLoginUserAccountNo())));
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
        if (getUowId() != null) {
            _hashCode += getUowId().hashCode();
        }
        if (getLoginUserAccountNo() != null) {
            _hashCode += getLoginUserAccountNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UowStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "uowStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uowId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UowId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginUserAccountNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LoginUserAccountNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
