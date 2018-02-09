/**
 * Success.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.acc.tibco.interfaceAconyx.ws;

public class Success  implements java.io.Serializable {
    private java.lang.String successMessage;

    public Success() {
    }

    public Success(
           java.lang.String successMessage) {
           this.successMessage = successMessage;
    }


    /**
     * Gets the successMessage value for this Success.
     * 
     * @return successMessage
     */
    public java.lang.String getSuccessMessage() {
        return successMessage;
    }


    /**
     * Sets the successMessage value for this Success.
     * 
     * @param successMessage
     */
    public void setSuccessMessage(java.lang.String successMessage) {
        this.successMessage = successMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Success)) return false;
        Success other = (Success) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.successMessage==null && other.getSuccessMessage()==null) || 
             (this.successMessage!=null &&
              this.successMessage.equals(other.getSuccessMessage())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSuccessMessage() != null) {
            _hashCode += getSuccessMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Success.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "success"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SuccessMessage"));
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

    @Override
    public String toString(){
    	StringBuffer result = new StringBuffer();
    	
    	result.append("<Success>");
    	result.append("   <SuccessMessage>"+this.getSuccessMessage()+"</SuccessMessage>");
		result.append("</Success>");
		
		return result.toString();
    }
}
