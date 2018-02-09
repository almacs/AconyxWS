/**
 * UnitOfWork.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.acc.tibco.interfaceAconyx.ws;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class UnitOfWork  implements java.io.Serializable {
    private java.lang.Long uowId;

    private java.lang.Long accountNumber;

    private java.lang.String uowName;

    private java.lang.String uowDesc;

    private java.lang.Long status;

    private java.lang.String scheduleTime;

    private java.lang.String type;

    public UnitOfWork() {
    }

    public UnitOfWork(String xml) {
    	/**
    	 * <UnitOfWork>
    	 * 	  <!--Optional:-->
    	 * 		<UowId>?</UowId>
    	 *      <!--Optional:-->
    	 *      <AccountNumber>?</AccountNumber>
    	 *      <!--Optional:-->
    	 *      <UowName>?</UowName>
    	 *      <!--Optional:-->
    	 *      <UowDesc>?</UowDesc>
    	 *      <!--Optional:-->
    	 *      <Status>?</Status>
    	 *      <!--Optional:-->
    	 *      <ScheduleTime>?</ScheduleTime>
    	 *      <!--Optional:-->
    	 *      <type>?</type>
    	 *   </UnitOfWork>
    	 */
    	
    	if(xml.contains("<UowId>")){
    		this.setUowId(Long.parseLong(xml.substring(xml.indexOf("<UowId>")+ 7, xml.indexOf("</UowId>"))));    		 
    	}
    	if(xml.contains("<AccountNumber>")){
    		this.setAccountNumber((Long.parseLong(xml.substring(xml.indexOf("<AccountNumber>")+ 15, xml.indexOf("</AccountNumber>")))));    		
    	}
    	if(xml.contains("<UowName>")){
    		this.setUowName(xml.substring(xml.indexOf("<UowName>")+ 9, xml.indexOf("</UowName>")));    		
    	}
    	if(xml.contains("<UowDesc>")){
    		this.setUowDesc(xml.substring(xml.indexOf("<UowDesc>")+ 9, xml.indexOf("</UowDesc>")));    		
    	}    	
    	if(xml.contains("<Status>")){
    		this.setUowDesc(xml.substring(xml.indexOf("<Status>")+ 8, xml.indexOf("</Status>")));    		
    	}
    	if(xml.contains("<ScheduleTime>")){
    		this.setScheduleTime(xml.substring(xml.indexOf("<ScheduleTime>")+ 14, xml.indexOf("</ScheduleTime>")));    		
    	}
    	if(xml.contains("<type>")){
    		this.setScheduleTime(xml.substring(xml.indexOf("<type>")+ 6, xml.indexOf("</type>")));    		
    	}
    }
    
    @Override 
    public String toString(){
    	StringBuffer result = new StringBuffer();
    	     
    	
    	result.append(this.getUowId()!= null ? "<UowId>"+this.getUowId()+"</UowId>":"");
    	result.append(this.getAccountNumber() != null?"<AccountNumber>"+this.getAccountNumber()+"</AccountNumber>": "");
    	result.append(this.getUowName() != null?"<UowName>"+this.uowName+"</UowName>":"");
    	result.append(this.getUowDesc()!=null?"<UowDesc>"+this.getUowDesc()+"</UowDesc>":"");
    	result.append(this.getStatus() != null? "<Status>"+this.getStatus()+"</Status>":"");
    	result.append(this.getScheduleTime() != null? "<ScheduleTime>"+this.getScheduleTime()+"</ScheduleTime>":"");
    	result.append(this.getType() != null?"<type>"+this.getType()+"</type>":"" );
    	 
    	return result.toString();
    }

    public UnitOfWork(
           java.lang.Long uowId,
           java.lang.Long accountNumber,
           java.lang.String uowName,
           java.lang.String uowDesc,
           java.lang.Long status,
           java.lang.String scheduleTime,
           java.lang.String type) {
        this.uowId = uowId;
        this.accountNumber = accountNumber;
        this.uowName = uowName;
        this.uowDesc = uowDesc;
        this.status = status;
        this.scheduleTime = scheduleTime;
        this.type = type;
    }


    /**
     * Gets the uowId value for this UnitOfWork.
     * 
     * @return uowId
     */
    public java.lang.Long getUowId() {
        return uowId;
    }


    /**
     * Sets the uowId value for this UnitOfWork.
     * 
     * @param uowId
     */
    @XmlElement
    public void setUowId(java.lang.Long uowId) {
        this.uowId = uowId;
    }


    /**
     * Gets the accountNumber value for this UnitOfWork.
     * 
     * @return accountNumber
     */
    @XmlElement(name="AccountNumber")
    public java.lang.Long getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this UnitOfWork.
     * 
     * @param accountNumber
     */
    @XmlElement(name="AccountNumber")
    public void setAccountNumber(java.lang.Long accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the uowName value for this UnitOfWork.
     * 
     * @return uowName
     */
    public java.lang.String getUowName() {
        return uowName;
    }


    /**
     * Sets the uowName value for this UnitOfWork.
     * 
     * @param uowName
     */
    @XmlElement
    public void setUowName(java.lang.String uowName) {
        this.uowName = uowName;
    }


    /**
     * Gets the uowDesc value for this UnitOfWork.
     * 
     * @return uowDesc
     */
    public java.lang.String getUowDesc() {
        return uowDesc;
    }


    /**
     * Sets the uowDesc value for this UnitOfWork.
     * 
     * @param uowDesc
     */
    @XmlElement
    public void setUowDesc(java.lang.String uowDesc) {
        this.uowDesc = uowDesc;
    }


    /**
     * Gets the status value for this UnitOfWork.
     * 
     * @return status
     */
    public java.lang.Long getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UnitOfWork.
     * 
     * @param status
     */
    @XmlElement
    public void setStatus(java.lang.Long status) {
        this.status = status;
    }


    /**
     * Gets the scheduleTime value for this UnitOfWork.
     * 
     * @return scheduleTime
     */
    public java.lang.String getScheduleTime() {
        return scheduleTime;
    }


    /**
     * Sets the scheduleTime value for this UnitOfWork.
     * 
     * @param scheduleTime
     */
    @XmlElement
    public void setScheduleTime(java.lang.String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }


    /**
     * Gets the type value for this UnitOfWork.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this UnitOfWork.
     * 
     * @param type
     */
    @XmlElement
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnitOfWork)) return false;
        UnitOfWork other = (UnitOfWork) obj;
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
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.uowName==null && other.getUowName()==null) || 
             (this.uowName!=null &&
              this.uowName.equals(other.getUowName()))) &&
            ((this.uowDesc==null && other.getUowDesc()==null) || 
             (this.uowDesc!=null &&
              this.uowDesc.equals(other.getUowDesc()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.scheduleTime==null && other.getScheduleTime()==null) || 
             (this.scheduleTime!=null &&
              this.scheduleTime.equals(other.getScheduleTime()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getUowName() != null) {
            _hashCode += getUowName().hashCode();
        }
        if (getUowDesc() != null) {
            _hashCode += getUowDesc().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getScheduleTime() != null) {
            _hashCode += getScheduleTime().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnitOfWork.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "unitOfWork"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uowId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UowId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uowName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UowName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uowDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UowDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("scheduleTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ScheduleTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
