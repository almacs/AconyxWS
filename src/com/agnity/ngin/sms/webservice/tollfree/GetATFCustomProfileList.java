
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getATFCustomProfileList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getATFCustomProfileList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomProfileList" type="{http://tollfree.webservice.sms.ngin.agnity.com/}customProfileList" minOccurs="0"/>
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
@XmlType(name = "getATFCustomProfileList", propOrder = {
    "customProfileList",
    "sessionId"
})
public class GetATFCustomProfileList {

    @XmlElement(name = "CustomProfileList")
    protected CustomProfileList customProfileList;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the customProfileList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomProfileList }
     *     
     */
    public CustomProfileList getCustomProfileList() {
        return customProfileList;
    }

    /**
     * Sets the value of the customProfileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomProfileList }
     *     
     */
    public void setCustomProfileList(CustomProfileList value) {
        this.customProfileList = value;
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
