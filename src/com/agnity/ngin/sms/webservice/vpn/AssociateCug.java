
package com.agnity.ngin.sms.webservice.vpn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for associateCug complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="associateCug">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClosedGroupAssociation" type="{http://vpn.webservice.sms.ngin.agnity.com/}closedGroupAssociation" minOccurs="0"/>
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
@XmlType(name = "associateCug", propOrder = {
    "closedGroupAssociation",
    "sessionId"
})
public class AssociateCug {

    @XmlElement(name = "ClosedGroupAssociation")
    protected ClosedGroupAssociation closedGroupAssociation;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the closedGroupAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link ClosedGroupAssociation }
     *     
     */
    public ClosedGroupAssociation getClosedGroupAssociation() {
        return closedGroupAssociation;
    }

    /**
     * Sets the value of the closedGroupAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosedGroupAssociation }
     *     
     */
    public void setClosedGroupAssociation(ClosedGroupAssociation value) {
        this.closedGroupAssociation = value;
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
