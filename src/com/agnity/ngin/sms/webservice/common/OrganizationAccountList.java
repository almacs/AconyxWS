
package com.agnity.ngin.sms.webservice.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organizationAccountList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organizationAccountList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://common.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="OrganizationAccList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Organization" type="{http://common.webservice.sms.ngin.agnity.com/}organization" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UowId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organizationAccountList", propOrder = {
    "organizationAccList",
    "accountNumber",
    "uowId"
})
public class OrganizationAccountList
    extends WsGenericObject
{

    @XmlElement(name = "OrganizationAccList")
    protected OrganizationAccountList.OrganizationAccList organizationAccList;
    @XmlElement(name = "AccountNumber")
    protected Long accountNumber;
    @XmlElement(name = "UowId")
    protected Long uowId;

    /**
     * Gets the value of the organizationAccList property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAccountList.OrganizationAccList }
     *     
     */
    public OrganizationAccountList.OrganizationAccList getOrganizationAccList() {
        return organizationAccList;
    }

    /**
     * Sets the value of the organizationAccList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAccountList.OrganizationAccList }
     *     
     */
    public void setOrganizationAccList(OrganizationAccountList.OrganizationAccList value) {
        this.organizationAccList = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountNumber(Long value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the uowId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUowId() {
        return uowId;
    }

    /**
     * Sets the value of the uowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUowId(Long value) {
        this.uowId = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Organization" type="{http://common.webservice.sms.ngin.agnity.com/}organization" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "organization"
    })
    public static class OrganizationAccList {

        @XmlElement(name = "Organization")
        protected List<Organization> organization;

        /**
         * Gets the value of the organization property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the organization property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrganization().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Organization }
         * 
         * 
         */
        public List<Organization> getOrganization() {
            if (organization == null) {
                organization = new ArrayList<Organization>();
            }
            return this.organization;
        }

    }

}
