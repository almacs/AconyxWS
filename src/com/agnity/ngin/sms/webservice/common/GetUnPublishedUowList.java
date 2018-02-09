
package com.agnity.ngin.sms.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUnPublishedUowList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUnPublishedUowList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnPublishedUowList" type="{http://common.webservice.sms.ngin.agnity.com/}unPublishedUowList" minOccurs="0"/>
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
@XmlType(name = "getUnPublishedUowList", propOrder = {
    "unPublishedUowList",
    "sessionId"
})
public class GetUnPublishedUowList {

    @XmlElement(name = "UnPublishedUowList")
    protected UnPublishedUowList unPublishedUowList;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the unPublishedUowList property.
     * 
     * @return
     *     possible object is
     *     {@link UnPublishedUowList }
     *     
     */
    public UnPublishedUowList getUnPublishedUowList() {
        return unPublishedUowList;
    }

    /**
     * Sets the value of the unPublishedUowList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnPublishedUowList }
     *     
     */
    public void setUnPublishedUowList(UnPublishedUowList value) {
        this.unPublishedUowList = value;
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
