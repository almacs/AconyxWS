
package com.agnity.ngin.sms.webservice.vpn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configureServicePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configureServicePlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServicePlan" type="{http://vpn.webservice.sms.ngin.agnity.com/}servicePlan" minOccurs="0"/>
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
@XmlType(name = "configureServicePlan", propOrder = {
    "servicePlan",
    "sessionId"
})
public class ConfigureServicePlan {

    @XmlElement(name = "ServicePlan")
    protected ServicePlan servicePlan;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the servicePlan property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePlan }
     *     
     */
    public ServicePlan getServicePlan() {
        return servicePlan;
    }

    /**
     * Sets the value of the servicePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePlan }
     *     
     */
    public void setServicePlan(ServicePlan value) {
        this.servicePlan = value;
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
