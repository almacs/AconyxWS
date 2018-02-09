
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getATFNumberProfileList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getATFNumberProfileList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberProfileList" type="{http://tollfree.webservice.sms.ngin.agnity.com/}numberProfileList" minOccurs="0"/>
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
@XmlType(name = "getATFNumberProfileList", propOrder = {
    "numberProfileList",
    "sessionId"
})
public class GetATFNumberProfileList {

    @XmlElement(name = "NumberProfileList")
    protected NumberProfileList numberProfileList;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the numberProfileList property.
     * 
     * @return
     *     possible object is
     *     {@link NumberProfileList }
     *     
     */
    public NumberProfileList getNumberProfileList() {
        return numberProfileList;
    }

    /**
     * Sets the value of the numberProfileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberProfileList }
     *     
     */
    public void setNumberProfileList(NumberProfileList value) {
        this.numberProfileList = value;
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
