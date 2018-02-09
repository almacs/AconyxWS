
package com.agnity.ngin.sms.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for releaseUOWFromSession complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="releaseUOWFromSession">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitOfWork" type="{http://common.webservice.sms.ngin.agnity.com/}unitOfWork" minOccurs="0"/>
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
@XmlType(name = "releaseUOWFromSession", propOrder = {
    "unitOfWork",
    "sessionId"
})
public class ReleaseUOWFromSession {

    @XmlElement(name = "UnitOfWork")
    protected UnitOfWork unitOfWork;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the unitOfWork property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfWork }
     *     
     */
    public UnitOfWork getUnitOfWork() {
        return unitOfWork;
    }

    /**
     * Sets the value of the unitOfWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfWork }
     *     
     */
    public void setUnitOfWork(UnitOfWork value) {
        this.unitOfWork = value;
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
