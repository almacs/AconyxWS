/**
 * UowDetailList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.acc.tibco.interfaceAconyx.ws;

public class UowDetailList  extends com.acc.tibco.interfaceAconyx.ws.WSGenericObject  implements java.io.Serializable {
    private java.lang.Long accountNumber;

    private java.lang.Long uowId;

    private java.lang.String GCClusterId;

    private com.acc.tibco.interfaceAconyx.ws.UowDetail[] UOWDetail;

    public UowDetailList() {
    }

    public UowDetailList(
           java.lang.Long accountNumber,
           java.lang.Long uowId,
           java.lang.String GCClusterId,
           com.acc.tibco.interfaceAconyx.ws.UowDetail[] UOWDetail) {
        this.accountNumber = accountNumber;
        this.uowId = uowId;
        this.GCClusterId = GCClusterId;
        this.UOWDetail = UOWDetail;
    }


    /**
     * Gets the accountNumber value for this UowDetailList.
     * 
     * @return accountNumber
     */
    public java.lang.Long getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this UowDetailList.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.Long accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the uowId value for this UowDetailList.
     * 
     * @return uowId
     */
    public java.lang.Long getUowId() {
        return uowId;
    }


    /**
     * Sets the uowId value for this UowDetailList.
     * 
     * @param uowId
     */
    public void setUowId(java.lang.Long uowId) {
        this.uowId = uowId;
    }


    /**
     * Gets the GCClusterId value for this UowDetailList.
     * 
     * @return GCClusterId
     */
    public java.lang.String getGCClusterId() {
        return GCClusterId;
    }


    /**
     * Sets the GCClusterId value for this UowDetailList.
     * 
     * @param GCClusterId
     */
    public void setGCClusterId(java.lang.String GCClusterId) {
        this.GCClusterId = GCClusterId;
    }


    /**
     * Gets the UOWDetail value for this UowDetailList.
     * 
     * @return UOWDetail
     */
    public com.acc.tibco.interfaceAconyx.ws.UowDetail[] getUOWDetail() {
        return UOWDetail;
    }


    /**
     * Sets the UOWDetail value for this UowDetailList.
     * 
     * @param UOWDetail
     */
    public void setUOWDetail(com.acc.tibco.interfaceAconyx.ws.UowDetail[] UOWDetail) {
        this.UOWDetail = UOWDetail;
    }

    public com.acc.tibco.interfaceAconyx.ws.UowDetail getUOWDetail(int i) {
        return this.UOWDetail[i];
    }

    public void setUOWDetail(int i, com.acc.tibco.interfaceAconyx.ws.UowDetail _value) {
        this.UOWDetail[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UowDetailList)) return false;
        UowDetailList other = (UowDetailList) obj;
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
            ((this.uowId==null && other.getUowId()==null) || 
             (this.uowId!=null &&
              this.uowId.equals(other.getUowId()))) &&
            ((this.GCClusterId==null && other.getGCClusterId()==null) || 
             (this.GCClusterId!=null &&
              this.GCClusterId.equals(other.getGCClusterId()))) &&
            ((this.UOWDetail==null && other.getUOWDetail()==null) || 
             (this.UOWDetail!=null &&
              java.util.Arrays.equals(this.UOWDetail, other.getUOWDetail())));
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
        if (getUowId() != null) {
            _hashCode += getUowId().hashCode();
        }
        if (getGCClusterId() != null) {
            _hashCode += getGCClusterId().hashCode();
        }
        if (getUOWDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUOWDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUOWDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UowDetailList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "uowDetailList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GCClusterId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GCClusterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UOWDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UOWDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "uowDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
