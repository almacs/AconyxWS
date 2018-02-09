
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configATFTollFreeSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configATFTollFreeSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TollFreeSetting" type="{http://tollfree.webservice.sms.ngin.agnity.com/}tollFreeSetting" minOccurs="0"/>
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
@XmlType(name = "configATFTollFreeSetting", propOrder = {
    "tollFreeSetting",
    "sessionId"
})
public class ConfigATFTollFreeSetting {

    @XmlElement(name = "TollFreeSetting")
    protected TollFreeSetting tollFreeSetting;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the tollFreeSetting property.
     * 
     * @return
     *     possible object is
     *     {@link TollFreeSetting }
     *     
     */
    public TollFreeSetting getTollFreeSetting() {
        return tollFreeSetting;
    }

    /**
     * Sets the value of the tollFreeSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link TollFreeSetting }
     *     
     */
    public void setTollFreeSetting(TollFreeSetting value) {
        this.tollFreeSetting = value;
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
