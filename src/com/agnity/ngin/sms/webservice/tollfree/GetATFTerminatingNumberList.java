
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getATFTerminatingNumberList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getATFTerminatingNumberList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TerminatingNumberList" type="{http://tollfree.webservice.sms.ngin.agnity.com/}terminatingNumberList" minOccurs="0"/>
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
@XmlType(name = "getATFTerminatingNumberList", propOrder = {
    "terminatingNumberList",
    "sessionId"
})
public class GetATFTerminatingNumberList {

    @XmlElement(name = "TerminatingNumberList")
    protected TerminatingNumberList terminatingNumberList;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the terminatingNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link TerminatingNumberList }
     *     
     */
    public TerminatingNumberList getTerminatingNumberList() {
        return terminatingNumberList;
    }

    /**
     * Sets the value of the terminatingNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminatingNumberList }
     *     
     */
    public void setTerminatingNumberList(TerminatingNumberList value) {
        this.terminatingNumberList = value;
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
