
package com.agnity.ngin.sms.webservice.vpn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteCug complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteCug">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClosedGroup" type="{http://vpn.webservice.sms.ngin.agnity.com/}closedGroup" minOccurs="0"/>
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
@XmlType(name = "deleteCug", propOrder = {
    "closedGroup",
    "sessionId"
})
public class DeleteCug {

    @XmlElement(name = "ClosedGroup")
    protected ClosedGroup closedGroup;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the closedGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ClosedGroup }
     *     
     */
    public ClosedGroup getClosedGroup() {
        return closedGroup;
    }

    /**
     * Sets the value of the closedGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosedGroup }
     *     
     */
    public void setClosedGroup(ClosedGroup value) {
        this.closedGroup = value;
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
