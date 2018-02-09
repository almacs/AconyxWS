/**
 * OrganizationAccountList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.acc.tibco.interfaceAconyx.ws;

public class OrganizationAccountList  extends com.acc.tibco.interfaceAconyx.ws.WSGenericObject  implements java.io.Serializable {
    private com.acc.tibco.interfaceAconyx.ws.Organization[] organizationAccList;

    private java.lang.Long accountNumber;

    private java.lang.Long uowId;

    public OrganizationAccountList() {
    }

    public OrganizationAccountList(
           com.acc.tibco.interfaceAconyx.ws.Organization[] organizationAccList,
           java.lang.Long accountNumber,
           java.lang.Long uowId) {
        this.organizationAccList = organizationAccList;
        this.accountNumber = accountNumber;
        this.uowId = uowId;
    }


    /**
     * Gets the organizationAccList value for this OrganizationAccountList.
     * 
     * @return organizationAccList
     */
    public com.acc.tibco.interfaceAconyx.ws.Organization[] getOrganizationAccList() {
        return organizationAccList;
    }


    /**
     * Sets the organizationAccList value for this OrganizationAccountList.
     * 
     * @param organizationAccList
     */
    public void setOrganizationAccList(com.acc.tibco.interfaceAconyx.ws.Organization[] organizationAccList) {
        this.organizationAccList = organizationAccList;
    }


    /**
     * Gets the accountNumber value for this OrganizationAccountList.
     * 
     * @return accountNumber
     */
    public java.lang.Long getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this OrganizationAccountList.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.Long accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the uowId value for this OrganizationAccountList.
     * 
     * @return uowId
     */
    public java.lang.Long getUowId() {
        return uowId;
    }


    /**
     * Sets the uowId value for this OrganizationAccountList.
     * 
     * @param uowId
     */
    public void setUowId(java.lang.Long uowId) {
        this.uowId = uowId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrganizationAccountList)) return false;
        OrganizationAccountList other = (OrganizationAccountList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.organizationAccList==null && other.getOrganizationAccList()==null) || 
             (this.organizationAccList!=null &&
              java.util.Arrays.equals(this.organizationAccList, other.getOrganizationAccList()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
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
        if (getOrganizationAccList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrganizationAccList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrganizationAccList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getUowId() != null) {
            _hashCode += getUowId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrganizationAccountList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "organizationAccountList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationAccList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrganizationAccList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "organization"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Organization"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
