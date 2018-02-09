
package com.agnity.ngin.sms.webservice.vpn;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for closedGroupAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="closedGroupAssociation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vpn.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="EnterpriseAccountNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UowId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrivateNumberList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PrivateNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "closedGroupAssociation", propOrder = {
    "enterpriseAccountNo",
    "uowId",
    "groupName",
    "privateNumberList"
})
public class ClosedGroupAssociation
    extends WsGenericObject
{

    @XmlElement(name = "EnterpriseAccountNo")
    protected Long enterpriseAccountNo;
    @XmlElement(name = "UowId")
    protected Long uowId;
    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(name = "PrivateNumberList")
    protected ClosedGroupAssociation.PrivateNumberList privateNumberList;

    /**
     * Gets the value of the enterpriseAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEnterpriseAccountNo() {
        return enterpriseAccountNo;
    }

    /**
     * Sets the value of the enterpriseAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEnterpriseAccountNo(Long value) {
        this.enterpriseAccountNo = value;
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
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the privateNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link ClosedGroupAssociation.PrivateNumberList }
     *     
     */
    public ClosedGroupAssociation.PrivateNumberList getPrivateNumberList() {
        return privateNumberList;
    }

    /**
     * Sets the value of the privateNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosedGroupAssociation.PrivateNumberList }
     *     
     */
    public void setPrivateNumberList(ClosedGroupAssociation.PrivateNumberList value) {
        this.privateNumberList = value;
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
     *         &lt;element name="PrivateNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "privateNumber"
    })
    public static class PrivateNumberList {

        @XmlElement(name = "PrivateNumber")
        protected List<String> privateNumber;

        /**
         * Gets the value of the privateNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the privateNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrivateNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPrivateNumber() {
            if (privateNumber == null) {
                privateNumber = new ArrayList<String>();
            }
            return this.privateNumber;
        }

    }

}
