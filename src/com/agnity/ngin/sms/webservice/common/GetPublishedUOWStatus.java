
package com.agnity.ngin.sms.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPublishedUOWStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPublishedUOWStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UowStatus" type="{http://common.webservice.sms.ngin.agnity.com/}uowStatus" minOccurs="0"/>
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPublishedUOWStatus", propOrder = {
    "uowStatus",
    "sessionId"
})
public class GetPublishedUOWStatus {

    @XmlElement(name = "UowStatus")
    protected UowStatus uowStatus;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the uowStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UowStatus }
     *     
     */
    public UowStatus getUowStatus() {
        return uowStatus;
    }

    /**
     * Sets the value of the uowStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UowStatus }
     *     
     */
    public void setUowStatus(UowStatus value) {
        this.uowStatus = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

}
