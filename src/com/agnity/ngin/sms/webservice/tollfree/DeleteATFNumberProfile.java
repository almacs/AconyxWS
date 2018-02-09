
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteATFNumberProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteATFNumberProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberProfile" type="{http://tollfree.webservice.sms.ngin.agnity.com/}numberProfile" minOccurs="0"/>
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
@XmlType(name = "deleteATFNumberProfile", propOrder = {
    "numberProfile",
    "sessionId"
})
public class DeleteATFNumberProfile {

    @XmlElement(name = "NumberProfile")
    protected NumberProfile numberProfile;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the numberProfile property.
     * 
     * @return
     *     possible object is
     *     {@link NumberProfile }
     *     
     */
    public NumberProfile getNumberProfile() {
        return numberProfile;
    }

    /**
     * Sets the value of the numberProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberProfile }
     *     
     */
    public void setNumberProfile(NumberProfile value) {
        this.numberProfile = value;
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
