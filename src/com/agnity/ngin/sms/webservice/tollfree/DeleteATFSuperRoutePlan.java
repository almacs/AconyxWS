
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteATFSuperRoutePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteATFSuperRoutePlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuperRoutePlanDelete" type="{http://tollfree.webservice.sms.ngin.agnity.com/}superRoutePlanDelete" minOccurs="0"/>
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
@XmlType(name = "deleteATFSuperRoutePlan", propOrder = {
    "superRoutePlanDelete",
    "sessionId"
})
public class DeleteATFSuperRoutePlan {

    @XmlElement(name = "SuperRoutePlanDelete")
    protected SuperRoutePlanDelete superRoutePlanDelete;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the superRoutePlanDelete property.
     * 
     * @return
     *     possible object is
     *     {@link SuperRoutePlanDelete }
     *     
     */
    public SuperRoutePlanDelete getSuperRoutePlanDelete() {
        return superRoutePlanDelete;
    }

    /**
     * Sets the value of the superRoutePlanDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuperRoutePlanDelete }
     *     
     */
    public void setSuperRoutePlanDelete(SuperRoutePlanDelete value) {
        this.superRoutePlanDelete = value;
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
