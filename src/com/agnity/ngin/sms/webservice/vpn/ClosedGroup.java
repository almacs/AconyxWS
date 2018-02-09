
package com.agnity.ngin.sms.webservice.vpn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for closedGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="closedGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vpn.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="EnterpriseAccountNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UowId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrivateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CugType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "closedGroup", propOrder = {
    "enterpriseAccountNo",
    "uowId",
    "groupName",
    "groupDescription",
    "privateNumber",
    "cugType"
})
public class ClosedGroup
    extends WsGenericObject
{

    @XmlElement(name = "EnterpriseAccountNo")
    protected Long enterpriseAccountNo;
    @XmlElement(name = "UowId")
    protected Long uowId;
    @XmlElement(name = "GroupName")
    protected String groupName;
    @XmlElement(name = "GroupDescription")
    protected String groupDescription;
    @XmlElement(name = "PrivateNumber")
    protected String privateNumber;
    @XmlElement(name = "CugType")
    protected String cugType;

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
     * Gets the value of the groupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupDescription() {
        return groupDescription;
    }

    /**
     * Sets the value of the groupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupDescription(String value) {
        this.groupDescription = value;
    }

    /**
     * Gets the value of the privateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateNumber() {
        return privateNumber;
    }

    /**
     * Sets the value of the privateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateNumber(String value) {
        this.privateNumber = value;
    }

    /**
     * Gets the value of the cugType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCugType() {
        return cugType;
    }

    /**
     * Sets the value of the cugType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCugType(String value) {
        this.cugType = value;
    }

}
