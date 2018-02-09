
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configATFTollFreeSettingSS7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configATFTollFreeSettingSS7">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TollFreeSettingSS7" type="{http://tollfree.webservice.sms.ngin.agnity.com/}tollFreeSettingSS7" minOccurs="0"/>
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
@XmlType(name = "configATFTollFreeSettingSS7", propOrder = {
    "tollFreeSettingSS7",
    "sessionId"
})
public class ConfigATFTollFreeSettingSS7 {

    @XmlElement(name = "TollFreeSettingSS7")
    protected TollFreeSettingSS7 tollFreeSettingSS7;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the tollFreeSettingSS7 property.
     * 
     * @return
     *     possible object is
     *     {@link TollFreeSettingSS7 }
     *     
     */
    public TollFreeSettingSS7 getTollFreeSettingSS7() {
        return tollFreeSettingSS7;
    }

    /**
     * Sets the value of the tollFreeSettingSS7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TollFreeSettingSS7 }
     *     
     */
    public void setTollFreeSettingSS7(TollFreeSettingSS7 value) {
        this.tollFreeSettingSS7 = value;
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
