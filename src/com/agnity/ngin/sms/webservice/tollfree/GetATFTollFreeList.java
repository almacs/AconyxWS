
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getATFTollFreeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getATFTollFreeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TFNumberList" type="{http://tollfree.webservice.sms.ngin.agnity.com/}tfNumberList" minOccurs="0"/>
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
@XmlType(name = "getATFTollFreeList", propOrder = {
    "tfNumberList",
    "sessionId"
})
public class GetATFTollFreeList {

    @XmlElement(name = "TFNumberList")
    protected TfNumberList tfNumberList;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the tfNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link TfNumberList }
     *     
     */
    public TfNumberList getTFNumberList() {
        return tfNumberList;
    }

    /**
     * Sets the value of the tfNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TfNumberList }
     *     
     */
    public void setTFNumberList(TfNumberList value) {
        this.tfNumberList = value;
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
