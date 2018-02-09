
package com.agnity.ngin.sms.webservice.vpn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePbxPhone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePbxPhone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PbxPnInfoDetails" type="{http://vpn.webservice.sms.ngin.agnity.com/}pbxPnInfoDetails" minOccurs="0"/>
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
@XmlType(name = "updatePbxPhone", propOrder = {
    "pbxPnInfoDetails",
    "sessionId"
})
public class UpdatePbxPhone {

    @XmlElement(name = "PbxPnInfoDetails")
    protected PbxPnInfoDetails pbxPnInfoDetails;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the pbxPnInfoDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PbxPnInfoDetails }
     *     
     */
    public PbxPnInfoDetails getPbxPnInfoDetails() {
        return pbxPnInfoDetails;
    }

    /**
     * Sets the value of the pbxPnInfoDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PbxPnInfoDetails }
     *     
     */
    public void setPbxPnInfoDetails(PbxPnInfoDetails value) {
        this.pbxPnInfoDetails = value;
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
