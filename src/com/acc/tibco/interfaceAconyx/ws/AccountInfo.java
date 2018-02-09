/**
 * AccountInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.acc.tibco.interfaceAconyx.ws;

public class AccountInfo  implements java.io.Serializable {
    private com.acc.tibco.interfaceAconyx.ws.Account account;

    private com.acc.tibco.interfaceAconyx.ws.Address[] addressList;

    private java.lang.Long uowId;

    public AccountInfo() {
    }
    
    public AccountInfo(String xml) {
    	if(xml.contains("<UowId>")){
    		this.setUowId(Long.parseLong(xml.substring(xml.indexOf("<UowId>")+7,xml.indexOf("</UowId>"))));
    	}
    	if(xml.contains("<Account>")){
    		this.setAccount(new Account(xml.substring(xml.indexOf("<Account>")+9,xml.indexOf("</Account>"))));
    	}

    }

    public AccountInfo(
           com.acc.tibco.interfaceAconyx.ws.Account account,
           com.acc.tibco.interfaceAconyx.ws.Address[] addressList,
           java.lang.Long uowId) {
        this.account = account;
        this.addressList = addressList;
        this.uowId = uowId;
    }


    /**
     * Gets the account value for this AccountInfo.
     * 
     * @return account
     */
    public com.acc.tibco.interfaceAconyx.ws.Account getAccount() {
        return account;
    }


    /**
     * Sets the account value for this AccountInfo.
     * 
     * @param account
     */
    public void setAccount(com.acc.tibco.interfaceAconyx.ws.Account account) {
        this.account = account;
    }


    /**
     * Gets the addressList value for this AccountInfo.
     * 
     * @return addressList
     */
    public com.acc.tibco.interfaceAconyx.ws.Address[] getAddressList() {
        return addressList;
    }


    /**
     * Sets the addressList value for this AccountInfo.
     * 
     * @param addressList
     */
    public void setAddressList(com.acc.tibco.interfaceAconyx.ws.Address[] addressList) {
        this.addressList = addressList;
    }


    /**
     * Gets the uowId value for this AccountInfo.
     * 
     * @return uowId
     */
    public java.lang.Long getUowId() {
        return uowId;
    }


    /**
     * Sets the uowId value for this AccountInfo.
     * 
     * @param uowId
     */
    public void setUowId(java.lang.Long uowId) {
        this.uowId = uowId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountInfo)) return false;
        AccountInfo other = (AccountInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.addressList==null && other.getAddressList()==null) || 
             (this.addressList!=null &&
              java.util.Arrays.equals(this.addressList, other.getAddressList()))) &&
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAddressList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUowId() != null) {
            _hashCode += getUowId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "accountInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Address"));
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
