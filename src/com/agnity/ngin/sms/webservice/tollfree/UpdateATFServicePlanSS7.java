
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateATFServicePlanSS7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateATFServicePlanSS7">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServicePlanSS7" type="{http://tollfree.webservice.sms.ngin.agnity.com/}servicePlanSS7" minOccurs="0"/>
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
@XmlType(name = "updateATFServicePlanSS7", propOrder = {
    "servicePlanSS7",
    "sessionId"
})
public class UpdateATFServicePlanSS7 {

    @XmlElement(name = "ServicePlanSS7")
    protected ServicePlanSS7 servicePlanSS7;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the servicePlanSS7 property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePlanSS7 }
     *     
     */
    public ServicePlanSS7 getServicePlanSS7() {
        return servicePlanSS7;
    }

    /**
     * Sets the value of the servicePlanSS7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePlanSS7 }
     *     
     */
    public void setServicePlanSS7(ServicePlanSS7 value) {
        this.servicePlanSS7 = value;
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
