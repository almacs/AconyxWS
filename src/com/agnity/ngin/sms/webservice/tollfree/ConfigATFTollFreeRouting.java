
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configATFTollFreeRouting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configATFTollFreeRouting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TollFreeRouting" type="{http://tollfree.webservice.sms.ngin.agnity.com/}tollFreeRouting" minOccurs="0"/>
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
@XmlType(name = "configATFTollFreeRouting", propOrder = {
    "tollFreeRouting",
    "sessionId"
})
public class ConfigATFTollFreeRouting {

    @XmlElement(name = "TollFreeRouting")
    protected TollFreeRouting tollFreeRouting;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the tollFreeRouting property.
     * 
     * @return
     *     possible object is
     *     {@link TollFreeRouting }
     *     
     */
    public TollFreeRouting getTollFreeRouting() {
        return tollFreeRouting;
    }

    /**
     * Sets the value of the tollFreeRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link TollFreeRouting }
     *     
     */
    public void setTollFreeRouting(TollFreeRouting value) {
        this.tollFreeRouting = value;
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
