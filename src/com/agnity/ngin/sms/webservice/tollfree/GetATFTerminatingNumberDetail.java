
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getATFTerminatingNumberDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getATFTerminatingNumberDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TerminatingNumber" type="{http://tollfree.webservice.sms.ngin.agnity.com/}terminatingNumber" minOccurs="0"/>
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
@XmlType(name = "getATFTerminatingNumberDetail", propOrder = {
    "terminatingNumber",
    "sessionId"
})
public class GetATFTerminatingNumberDetail {

    @XmlElement(name = "TerminatingNumber")
    protected TerminatingNumber terminatingNumber;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the terminatingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TerminatingNumber }
     *     
     */
    public TerminatingNumber getTerminatingNumber() {
        return terminatingNumber;
    }

    /**
     * Sets the value of the terminatingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminatingNumber }
     *     
     */
    public void setTerminatingNumber(TerminatingNumber value) {
        this.terminatingNumber = value;
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
