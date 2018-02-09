/**
 * WsGenericObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.acc.tibco.interfaceAconyx.ws;

import java.lang.reflect.InvocationTargetException;
import java.rmi.RemoteException;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name="wsGenericObject")
@XmlSeeAlso({UnitOfWork.class, AccountInfo.class})
public abstract class WSGenericObject implements java.io.Serializable {
 
	//UnitOfWork
	private java.lang.Long accountNumber;
	private java.lang.String uowName; 
    private java.lang.String uowDesc; 
    private java.lang.Long status; 
    private java.lang.String scheduleTime; 
    private java.lang.String type;

    //AccountInfo
    private com.acc.tibco.interfaceAconyx.ws.Account account;
    private com.acc.tibco.interfaceAconyx.ws.Address[] addressList;
    private java.lang.Long uowId;
     
    public com.acc.tibco.interfaceAconyx.ws.Account getAccount() {
		return account;
	}

	public void setAccount(com.acc.tibco.interfaceAconyx.ws.Account account) {
		this.account = account;
	}

	public com.acc.tibco.interfaceAconyx.ws.Address[] getAddressList() {
		return addressList;
	}

	public void setAddressList(com.acc.tibco.interfaceAconyx.ws.Address[] addressList) {
		this.addressList = addressList;
	}

	public java.lang.Long getUowId() {
		return uowId;
	}

	public void setUowId(java.lang.Long uowId) {
		this.uowId = uowId;
	}

	public java.lang.Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(java.lang.Long accountNumber) {
		this.accountNumber = accountNumber;
	}

    public java.lang.String getUowName() {
		return uowName;
	}

	public void setUowName(java.lang.String uowName) {
		this.uowName = uowName;
	}

	public java.lang.String getUowDesc() {
		return uowDesc;
	}

	public void setUowDesc(java.lang.String uowDesc) {
		this.uowDesc = uowDesc;
	}

	public java.lang.Long getStatus() {
		return status;
	}

	public void setStatus(java.lang.Long status) {
		this.status = status;
	}

	public java.lang.String getScheduleTime() {
		return scheduleTime;
	}

	public void setScheduleTime(java.lang.String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	public java.lang.String getType() {
		return type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public static void setTypeDesc(org.apache.axis.description.TypeDesc typeDesc) {
		WSGenericObject.typeDesc = typeDesc;
	}

	private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSGenericObject)) return false;
        WSGenericObject other = (WSGenericObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true;
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSGenericObject.class, true);

    static { 
    	typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "wsGenericObject"));    	
    	org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
     
    	for (org.apache.axis.description.FieldDesc elem : UnitOfWork.getTypeDesc().getFields()){
	    	 elemField = new org.apache.axis.description.ElementDesc();
	    	 elemField.setFieldName(elem.getFieldName());
	    	 elemField.setXmlName(elem.getXmlName());
	    	 elemField.setXmlType(elem.getXmlType());
	    	 elemField.setMinOccurs(0);
	    	 elemField.setNillable(true);
	    	 typeDesc.addFieldDesc(elemField);        	 
         }
    	
         for (org.apache.axis.description.FieldDesc elem : AccountInfo.getTypeDesc().getFields()){
	    	 elemField = new org.apache.axis.description.ElementDesc();
	    	 elemField.setFieldName(elem.getFieldName());
	    	 elemField.setXmlName(elem.getXmlName());
	    	 elemField.setXmlType(elem.getXmlType());
	    	 elemField.setMinOccurs(0);
	    	 elemField.setNillable(true);
	    	 typeDesc.addFieldDesc(elemField);        	 
         } 
        
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
     * 
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
		
		result.append("<Response>" + this.toString()+"</Response>");
		
		return result.toString();
	}

	public static String upperFirstChar(String text){
		
		String result = 
				text.substring(0,1).toUpperCase() + text.substring(1);
		
		return result;
	}
}
