/**
 * WsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.acc.tibco.interfaceAconyx.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WSResponse extends WSGenericObject implements java.io.Serializable {
    private int successFlag;

    private com.acc.tibco.interfaceAconyx.ws.Success success;

    private com.acc.tibco.interfaceAconyx.ws.Error error;

    private com.acc.tibco.interfaceAconyx.ws.Failed[] partialFailure;

    private com.acc.tibco.interfaceAconyx.ws.WSGenericObject response;

    
    
    public WSResponse() {
    
    }

    public WSResponse(
           int successFlag,
           com.acc.tibco.interfaceAconyx.ws.Success success,
           com.acc.tibco.interfaceAconyx.ws.Error error,
           com.acc.tibco.interfaceAconyx.ws.Failed[] partialFailure,
           com.acc.tibco.interfaceAconyx.ws.WSGenericObject response) {
           this.successFlag = successFlag;
           this.success = success;
           this.error = error;
           this.partialFailure = partialFailure;
           this.response = response;
    }

   @Override
   public String toString(){
	   StringBuffer result = new StringBuffer();
	   
	   result.append(" <WSResponse>");
			   
	   result.append("<SuccessFlag>"+ this.getSuccessFlag()+"</SuccessFlag>");

	   result.append(this.getError() != null? this.getError().toString():"");
	   result.append(this.getSuccess() != null? this.getSuccess().toString():"");

	   if(this.getResponse() != null){
		   result.append("<Response>");
           result.append(this.getResponse().toString());
           result.append("</Response>");
         }
       result.append("</WSResponse>");

	   return result.toString();
   }

    /**
     * Gets the successFlag value for this WsResponse.
     * 
     * @return successFlag
     */
    public int getSuccessFlag() {
        return successFlag;
    }


    /**
     * Sets the successFlag value for this WsResponse.
     * 
     * @param successFlag
     */
    public void setSuccessFlag(int successFlag) {
        this.successFlag = successFlag;
    }


    /**
     * Gets the success value for this WsResponse.
     * 
     * @return success
     */
    public com.acc.tibco.interfaceAconyx.ws.Success getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this WsResponse.
     * 
     * @param success
     */
    public void setSuccess(com.acc.tibco.interfaceAconyx.ws.Success success) {
        this.success = success;
    }


    /**
     * Gets the error value for this WsResponse.
     * 
     * @return error
     */
    public com.acc.tibco.interfaceAconyx.ws.Error getError() {
        return error;
    }


    /**
     * Sets the error value for this WsResponse.
     * 
     * @param error
     */
    public void setError(com.acc.tibco.interfaceAconyx.ws.Error error) {
        this.error = error;
    }


    /**
     * Gets the partialFailure value for this WsResponse.
     * 
     * @return partialFailure
     */
    public com.acc.tibco.interfaceAconyx.ws.Failed[] getPartialFailure() {
        return partialFailure;
    }


    /**
     * Sets the partialFailure value for this WsResponse.
     * 
     * @param partialFailure
     */
    public void setPartialFailure(com.acc.tibco.interfaceAconyx.ws.Failed[] partialFailure) {
        this.partialFailure = partialFailure;
    }


    /**
     * Gets the response value for this WsResponse.
     * 
     * @return response
     */
    public com.acc.tibco.interfaceAconyx.ws.WSGenericObject getResponse() {
        return response;
    }


    /**
     * Sets the response value for this WsResponse.
     * 
     * @param response
     */
    public void setResponse(com.acc.tibco.interfaceAconyx.ws.WSGenericObject response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSResponse)) return false;
        WSResponse other = (WSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.successFlag == other.getSuccessFlag() &&
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              this.success.equals(other.getSuccess()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.partialFailure==null && other.getPartialFailure()==null) || 
             (this.partialFailure!=null &&
              java.util.Arrays.equals(this.partialFailure, other.getPartialFailure()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse())));
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
        _hashCode += getSuccessFlag();
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getPartialFailure() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartialFailure());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartialFailure(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "wsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SuccessFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "success"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "error"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partialFailure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PartialFailure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "failed"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Failed"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.webservice.sms.ngin.agnity.com/", "wsGenericObject"));
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
