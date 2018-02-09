
package com.agnity.ngin.sms.webservice.vpn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createAccountDefaults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createAccountDefaults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnterpriseDetail" type="{http://vpn.webservice.sms.ngin.agnity.com/}enterpriseDetail" minOccurs="0"/>
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
@XmlType(name = "createAccountDefaults", propOrder = {
    "enterpriseDetail",
    "sessionId"
})
public class CreateAccountDefaults {

    @XmlElement(name = "EnterpriseDetail")
    protected EnterpriseDetail enterpriseDetail;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the enterpriseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link EnterpriseDetail }
     *     
     */
    public EnterpriseDetail getEnterpriseDetail() {
        return enterpriseDetail;
    }

    /**
     * Sets the value of the enterpriseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterpriseDetail }
     *     
     */
    public void setEnterpriseDetail(EnterpriseDetail value) {
        this.enterpriseDetail = value;
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
