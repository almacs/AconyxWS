
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createATFCustomProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createATFCustomProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomProfile" type="{http://tollfree.webservice.sms.ngin.agnity.com/}customProfile" minOccurs="0"/>
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
@XmlType(name = "createATFCustomProfile", propOrder = {
    "customProfile",
    "sessionId"
})
public class CreateATFCustomProfile {

    @XmlElement(name = "CustomProfile")
    protected CustomProfile customProfile;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the customProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CustomProfile }
     *     
     */
    public CustomProfile getCustomProfile() {
        return customProfile;
    }

    /**
     * Sets the value of the customProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomProfile }
     *     
     */
    public void setCustomProfile(CustomProfile value) {
        this.customProfile = value;
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
