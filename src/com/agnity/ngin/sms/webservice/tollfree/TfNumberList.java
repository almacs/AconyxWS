
package com.agnity.ngin.sms.webservice.tollfree;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tfNumberList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tfNumberList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tollfree.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TollFreeNumberDetail" type="{http://tollfree.webservice.sms.ngin.agnity.com/}tfNumberListAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssignStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TollFreeNumberSearch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OnlyCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BlockNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "tfNumberList", propOrder = {
    "accountNumber",
    "tollFreeNumberDetail",
    "assignStatus",
    "tollFreeNumberSearch",
    "totalCount",
    "onlyCount",
    "blockNumber",
    "uowId"
})
public class TfNumberList
    extends WsGenericObject
{

    @XmlElement(name = "AccountNumber")
    protected Long accountNumber;
    @XmlElement(name = "TollFreeNumberDetail")
    protected List<TfNumberListAttribute> tollFreeNumberDetail;
    @XmlElement(name = "AssignStatus")
    protected String assignStatus;
    @XmlElement(name = "TollFreeNumberSearch")
    protected String tollFreeNumberSearch;
    @XmlElement(name = "TotalCount")
    protected Long totalCount;
    @XmlElement(name = "OnlyCount")
    protected Long onlyCount;
    @XmlElement(name = "BlockNumber")
    protected Long blockNumber;
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
     * Gets the value of the tollFreeNumberDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tollFreeNumberDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTollFreeNumberDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TfNumberListAttribute }
     * 
     * 
     */
    public List<TfNumberListAttribute> getTollFreeNumberDetail() {
        if (tollFreeNumberDetail == null) {
            tollFreeNumberDetail = new ArrayList<TfNumberListAttribute>();
        }
        return this.tollFreeNumberDetail;
    }

    /**
     * Gets the value of the assignStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignStatus() {
        return assignStatus;
    }

    /**
     * Sets the value of the assignStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignStatus(String value) {
        this.assignStatus = value;
    }

    /**
     * Gets the value of the tollFreeNumberSearch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFreeNumberSearch() {
        return tollFreeNumberSearch;
    }

    /**
     * Sets the value of the tollFreeNumberSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollFreeNumberSearch(String value) {
        this.tollFreeNumberSearch = value;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalCount(Long value) {
        this.totalCount = value;
    }

    /**
     * Gets the value of the onlyCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOnlyCount() {
        return onlyCount;
    }

    /**
     * Sets the value of the onlyCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOnlyCount(Long value) {
        this.onlyCount = value;
    }

    /**
     * Gets the value of the blockNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBlockNumber() {
        return blockNumber;
    }

    /**
     * Sets the value of the blockNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBlockNumber(Long value) {
        this.blockNumber = value;
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
