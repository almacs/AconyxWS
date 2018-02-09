
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getATFTollFreeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getATFTollFreeDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TFNumberDetail" type="{http://tollfree.webservice.sms.ngin.agnity.com/}tfNumberDetail" minOccurs="0"/>
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
@XmlType(name = "getATFTollFreeDetail", propOrder = {
    "tfNumberDetail",
    "sessionId"
})
public class GetATFTollFreeDetail {

    @XmlElement(name = "TFNumberDetail")
    protected TfNumberDetail tfNumberDetail;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the tfNumberDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TfNumberDetail }
     *     
     */
    public TfNumberDetail getTFNumberDetail() {
        return tfNumberDetail;
    }

    /**
     * Sets the value of the tfNumberDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TfNumberDetail }
     *     
     */
    public void setTFNumberDetail(TfNumberDetail value) {
        this.tfNumberDetail = value;
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
