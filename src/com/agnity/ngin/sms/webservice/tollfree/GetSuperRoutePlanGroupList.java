
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSuperRoutePlanGroupList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSuperRoutePlanGroupList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuperRoutePlanGroupList" type="{http://tollfree.webservice.sms.ngin.agnity.com/}superRoutePlanGroupList" minOccurs="0"/>
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
@XmlType(name = "getSuperRoutePlanGroupList", propOrder = {
    "superRoutePlanGroupList",
    "sessionId"
})
public class GetSuperRoutePlanGroupList {

    @XmlElement(name = "SuperRoutePlanGroupList")
    protected SuperRoutePlanGroupList superRoutePlanGroupList;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the superRoutePlanGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link SuperRoutePlanGroupList }
     *     
     */
    public SuperRoutePlanGroupList getSuperRoutePlanGroupList() {
        return superRoutePlanGroupList;
    }

    /**
     * Sets the value of the superRoutePlanGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuperRoutePlanGroupList }
     *     
     */
    public void setSuperRoutePlanGroupList(SuperRoutePlanGroupList value) {
        this.superRoutePlanGroupList = value;
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
