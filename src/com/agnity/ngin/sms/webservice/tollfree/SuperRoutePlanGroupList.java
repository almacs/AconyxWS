
package com.agnity.ngin.sms.webservice.tollfree;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for superRoutePlanGroupList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="superRoutePlanGroupList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tollfree.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "superRoutePlanGroupList", propOrder = {
    "accountNumber",
    "groupName",
    "uowId"
})
public class SuperRoutePlanGroupList
    extends WsGenericObject
{

    @XmlElement(name = "AccountNumber")
    protected Long accountNumber;
    @XmlElement(name = "GroupName")
    protected List<String> groupName;
    @XmlElement(name = "UowId")
    protected Long uowId;

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
     * Gets the value of the groupName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGroupName() {
        if (groupName == null) {
            groupName = new ArrayList<String>();
        }
        return this.groupName;
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

}
