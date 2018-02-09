
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createATFSuperRoutePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createATFSuperRoutePlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuperRoutePlanDetail" type="{http://tollfree.webservice.sms.ngin.agnity.com/}superRoutePlanDetail" minOccurs="0"/>
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
@XmlType(name = "createATFSuperRoutePlan", propOrder = {
    "superRoutePlanDetail",
    "sessionId"
})
public class CreateATFSuperRoutePlan {

    @XmlElement(name = "SuperRoutePlanDetail")
    protected SuperRoutePlanDetail superRoutePlanDetail;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the superRoutePlanDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SuperRoutePlanDetail }
     *     
     */
    public SuperRoutePlanDetail getSuperRoutePlanDetail() {
        return superRoutePlanDetail;
    }

    /**
     * Sets the value of the superRoutePlanDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuperRoutePlanDetail }
     *     
     */
    public void setSuperRoutePlanDetail(SuperRoutePlanDetail value) {
        this.superRoutePlanDetail = value;
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