
package com.agnity.ngin.sms.webservice.tollfree;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuccessFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Success" type="{http://tollfree.webservice.sms.ngin.agnity.com/}success" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://tollfree.webservice.sms.ngin.agnity.com/}error" minOccurs="0"/>
 *         &lt;element name="PartialFailure" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Failed" type="{http://tollfree.webservice.sms.ngin.agnity.com/}failed" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Response" type="{http://tollfree.webservice.sms.ngin.agnity.com/}wsGenericObject" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsResponse", propOrder = {
    "successFlag",
    "success",
    "error",
    "partialFailure",
    "response"
})
public class WsResponse {

    @XmlElement(name = "SuccessFlag")
    protected int successFlag;
    @XmlElement(name = "Success")
    protected Success success;
    @XmlElement(name = "Error")
    protected Error error;
    @XmlElement(name = "PartialFailure")
    protected WsResponse.PartialFailure partialFailure;
    @XmlElement(name = "Response")
    protected WsGenericObject response;

    /**
     * Gets the value of the successFlag property.
     * 
     */
    public int getSuccessFlag() {
        return successFlag;
    }

    /**
     * Sets the value of the successFlag property.
     * 
     */
    public void setSuccessFlag(int value) {
        this.successFlag = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link Success }
     *     
     */
    public Success getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link Success }
     *     
     */
    public void setSuccess(Success value) {
        this.success = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

    /**
     * Gets the value of the partialFailure property.
     * 
     * @return
     *     possible object is
     *     {@link WsResponse.PartialFailure }
     *     
     */
    public WsResponse.PartialFailure getPartialFailure() {
        return partialFailure;
    }

    /**
     * Sets the value of the partialFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsResponse.PartialFailure }
     *     
     */
    public void setPartialFailure(WsResponse.PartialFailure value) {
        this.partialFailure = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link WsGenericObject }
     *     
     */
    public WsGenericObject getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsGenericObject }
     *     
     */
    public void setResponse(WsGenericObject value) {
        this.response = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Failed" type="{http://tollfree.webservice.sms.ngin.agnity.com/}failed" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "failed"
    })
    public static class PartialFailure {

        @XmlElement(name = "Failed")
        protected List<Failed> failed;

        /**
         * Gets the value of the failed property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the failed property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFailed().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Failed }
         * 
         * 
         */
        public List<Failed> getFailed() {
            if (failed == null) {
                failed = new ArrayList<Failed>();
            }
            return this.failed;
        }

    }

}
