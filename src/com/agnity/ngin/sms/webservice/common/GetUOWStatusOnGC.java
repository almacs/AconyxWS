
package com.agnity.ngin.sms.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUOWStatusOnGC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUOWStatusOnGC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UOWDetailList" type="{http://common.webservice.sms.ngin.agnity.com/}uowDetailList" minOccurs="0"/>
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
@XmlType(name = "getUOWStatusOnGC", propOrder = {
    "uowDetailList",
    "sessionId"
})
public class GetUOWStatusOnGC {

    @XmlElement(name = "UOWDetailList")
    protected UowDetailList uowDetailList;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the uowDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link UowDetailList }
     *     
     */
    public UowDetailList getUOWDetailList() {
        return uowDetailList;
    }

    /**
     * Sets the value of the uowDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UowDetailList }
     *     
     */
    public void setUOWDetailList(UowDetailList value) {
        this.uowDetailList = value;
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
