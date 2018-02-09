
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateATFSuperRoutePlanGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateATFSuperRoutePlanGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuperRoutePlanGroup" type="{http://tollfree.webservice.sms.ngin.agnity.com/}superRoutePlanGroup" minOccurs="0"/>
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
@XmlType(name = "updateATFSuperRoutePlanGroup", propOrder = {
    "superRoutePlanGroup",
    "sessionId"
})
public class UpdateATFSuperRoutePlanGroup {

    @XmlElement(name = "SuperRoutePlanGroup")
    protected SuperRoutePlanGroup superRoutePlanGroup;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the superRoutePlanGroup property.
     * 
     * @return
     *     possible object is
     *     {@link SuperRoutePlanGroup }
     *     
     */
    public SuperRoutePlanGroup getSuperRoutePlanGroup() {
        return superRoutePlanGroup;
    }

    /**
     * Sets the value of the superRoutePlanGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuperRoutePlanGroup }
     *     
     */
    public void setSuperRoutePlanGroup(SuperRoutePlanGroup value) {
        this.superRoutePlanGroup = value;
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
