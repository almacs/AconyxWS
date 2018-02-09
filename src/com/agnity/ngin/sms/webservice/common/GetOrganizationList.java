
package com.agnity.ngin.sms.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOrganizationList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOrganizationList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationAccountList" type="{http://common.webservice.sms.ngin.agnity.com/}organizationAccountList" minOccurs="0"/>
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
@XmlType(name = "getOrganizationList", propOrder = {
    "organizationAccountList",
    "sessionId"
})
public class GetOrganizationList {

    @XmlElement(name = "OrganizationAccountList")
    protected OrganizationAccountList organizationAccountList;
    @XmlElement(name = "SessionId")
    protected String sessionId;

    /**
     * Gets the value of the organizationAccountList property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAccountList }
     *     
     */
    public OrganizationAccountList getOrganizationAccountList() {
        return organizationAccountList;
    }

    /**
     * Sets the value of the organizationAccountList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAccountList }
     *     
     */
    public void setOrganizationAccountList(OrganizationAccountList value) {
        this.organizationAccountList = value;
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
