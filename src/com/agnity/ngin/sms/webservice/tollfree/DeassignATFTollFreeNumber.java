
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deassignATFTollFreeNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deassignATFTollFreeNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TollFreeNumberDeassign" type="{http://tollfree.webservice.sms.ngin.agnity.com/}tollFreeNumber" minOccurs="0"/>
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
@XmlType(name = "deassignATFTollFreeNumber", propOrder = {
    "tollFreeNumberDeassign",
    "sessionId"
})
public class DeassignATFTollFreeNumber {

    @XmlElement(name = "TollFreeNumberDeassign")
    protected TollFreeNumber tollFreeNumberDeassign;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the tollFreeNumberDeassign property.
     * 
     * @return
     *     possible object is
     *     {@link TollFreeNumber }
     *     
     */
    public TollFreeNumber getTollFreeNumberDeassign() {
        return tollFreeNumberDeassign;
    }

    /**
     * Sets the value of the tollFreeNumberDeassign property.
     * 
     * @param value
     *     allowed object is
     *     {@link TollFreeNumber }
     *     
     */
    public void setTollFreeNumberDeassign(TollFreeNumber value) {
        this.tollFreeNumberDeassign = value;
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
