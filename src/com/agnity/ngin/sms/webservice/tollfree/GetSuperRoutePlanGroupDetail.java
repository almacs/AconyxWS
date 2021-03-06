
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSuperRoutePlanGroupDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSuperRoutePlanGroupDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuperRoutePlanGroupDetail" type="{http://tollfree.webservice.sms.ngin.agnity.com/}superRoutePlanGroupDetail" minOccurs="0"/>
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
@XmlType(name = "getSuperRoutePlanGroupDetail", propOrder = {
    "superRoutePlanGroupDetail",
    "sessionId"
})
public class GetSuperRoutePlanGroupDetail {

    @XmlElement(name = "SuperRoutePlanGroupDetail")
    protected SuperRoutePlanGroupDetail superRoutePlanGroupDetail;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the superRoutePlanGroupDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SuperRoutePlanGroupDetail }
     *     
     */
    public SuperRoutePlanGroupDetail getSuperRoutePlanGroupDetail() {
        return superRoutePlanGroupDetail;
    }

    /**
     * Sets the value of the superRoutePlanGroupDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuperRoutePlanGroupDetail }
     *     
     */
    public void setSuperRoutePlanGroupDetail(SuperRoutePlanGroupDetail value) {
        this.superRoutePlanGroupDetail = value;
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
