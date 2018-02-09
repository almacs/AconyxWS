
package com.agnity.ngin.sms.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for publishUnitOfWork complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="publishUnitOfWork">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UowJob" type="{http://common.webservice.sms.ngin.agnity.com/}uowJob" minOccurs="0"/>
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
@XmlType(name = "publishUnitOfWork", propOrder = {
    "uowJob",
    "sessionId"
})
public class PublishUnitOfWork {

    @XmlElement(name = "UowJob")
    protected UowJob uowJob;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the uowJob property.
     * 
     * @return
     *     possible object is
     *     {@link UowJob }
     *     
     */
    public UowJob getUowJob() {
        return uowJob;
    }

    /**
     * Sets the value of the uowJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link UowJob }
     *     
     */
    public void setUowJob(UowJob value) {
        this.uowJob = value;
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
