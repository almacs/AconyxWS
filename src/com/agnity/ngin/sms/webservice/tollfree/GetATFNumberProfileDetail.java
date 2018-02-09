
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getATFNumberProfileDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getATFNumberProfileDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberProfileDetail" type="{http://tollfree.webservice.sms.ngin.agnity.com/}numberProfileDetail" minOccurs="0"/>
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
@XmlType(name = "getATFNumberProfileDetail", propOrder = {
    "numberProfileDetail",
    "sessionId"
})
public class GetATFNumberProfileDetail {

    @XmlElement(name = "NumberProfileDetail")
    protected NumberProfileDetail numberProfileDetail;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the numberProfileDetail property.
     * 
     * @return
     *     possible object is
     *     {@link NumberProfileDetail }
     *     
     */
    public NumberProfileDetail getNumberProfileDetail() {
        return numberProfileDetail;
    }

    /**
     * Sets the value of the numberProfileDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberProfileDetail }
     *     
     */
    public void setNumberProfileDetail(NumberProfileDetail value) {
        this.numberProfileDetail = value;
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
