
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tollFreeSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tollFreeSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tollfree.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TollFreeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallAreaSelection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConcurrentCallBarring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConcurrentCallLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriorityQueueSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QueuePin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriorityQueueTimeOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NormalQueueSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NormalQueueTimeOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallQueueCallLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxCallDurationFlag" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MaxCallDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "tollFreeSetting", propOrder = {
    "accountNumber",
    "tollFreeNumber",
    "homeCountry",
    "profileType",
    "profileName",
    "description",
    "callAreaSelection",
    "concurrentCallBarring",
    "concurrentCallLimit",
    "accessCode",
    "useAccessCode",
    "priorityQueueSize",
    "queuePin",
    "priorityQueueTimeOut",
    "normalQueueSize",
    "normalQueueTimeOut",
    "callQueueCallLimit",
    "maxCallDurationFlag",
    "maxCallDuration",
    "uowId"
})
public class TollFreeSetting
    extends WsGenericObject
{

    @XmlElement(name = "AccountNumber")
    protected Long accountNumber;
    @XmlElement(name = "TollFreeNumber")
    protected String tollFreeNumber;
    @XmlElement(name = "HomeCountry")
    protected String homeCountry;
    @XmlElement(name = "ProfileType")
    protected String profileType;
    @XmlElement(name = "ProfileName")
    protected String profileName;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "CallAreaSelection")
    protected String callAreaSelection;
    @XmlElement(name = "ConcurrentCallBarring")
    protected String concurrentCallBarring;
    @XmlElement(name = "ConcurrentCallLimit")
    protected String concurrentCallLimit;
    @XmlElement(name = "AccessCode")
    protected String accessCode;
    @XmlElement(name = "UseAccessCode")
    protected String useAccessCode;
    @XmlElement(name = "PriorityQueueSize")
    protected String priorityQueueSize;
    @XmlElement(name = "QueuePin")
    protected String queuePin;
    @XmlElement(name = "PriorityQueueTimeOut")
    protected String priorityQueueTimeOut;
    @XmlElement(name = "NormalQueueSize")
    protected String normalQueueSize;
    @XmlElement(name = "NormalQueueTimeOut")
    protected String normalQueueTimeOut;
    @XmlElement(name = "CallQueueCallLimit")
    protected String callQueueCallLimit;
    @XmlElement(name = "MaxCallDurationFlag")
    protected Long maxCallDurationFlag;
    @XmlElement(name = "MaxCallDuration")
    protected Long maxCallDuration;
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
     * Gets the value of the tollFreeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFreeNumber() {
        return tollFreeNumber;
    }

    /**
     * Sets the value of the tollFreeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollFreeNumber(String value) {
        this.tollFreeNumber = value;
    }

    /**
     * Gets the value of the homeCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeCountry() {
        return homeCountry;
    }

    /**
     * Sets the value of the homeCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeCountry(String value) {
        this.homeCountry = value;
    }

    /**
     * Gets the value of the profileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileType() {
        return profileType;
    }

    /**
     * Sets the value of the profileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileType(String value) {
        this.profileType = value;
    }

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the callAreaSelection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallAreaSelection() {
        return callAreaSelection;
    }

    /**
     * Sets the value of the callAreaSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallAreaSelection(String value) {
        this.callAreaSelection = value;
    }

    /**
     * Gets the value of the concurrentCallBarring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcurrentCallBarring() {
        return concurrentCallBarring;
    }

    /**
     * Sets the value of the concurrentCallBarring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcurrentCallBarring(String value) {
        this.concurrentCallBarring = value;
    }

    /**
     * Gets the value of the concurrentCallLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcurrentCallLimit() {
        return concurrentCallLimit;
    }

    /**
     * Sets the value of the concurrentCallLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcurrentCallLimit(String value) {
        this.concurrentCallLimit = value;
    }

    /**
     * Gets the value of the accessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessCode() {
        return accessCode;
    }

    /**
     * Sets the value of the accessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessCode(String value) {
        this.accessCode = value;
    }

    /**
     * Gets the value of the useAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseAccessCode() {
        return useAccessCode;
    }

    /**
     * Sets the value of the useAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseAccessCode(String value) {
        this.useAccessCode = value;
    }

    /**
     * Gets the value of the priorityQueueSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityQueueSize() {
        return priorityQueueSize;
    }

    /**
     * Sets the value of the priorityQueueSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityQueueSize(String value) {
        this.priorityQueueSize = value;
    }

    /**
     * Gets the value of the queuePin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueuePin() {
        return queuePin;
    }

    /**
     * Sets the value of the queuePin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueuePin(String value) {
        this.queuePin = value;
    }

    /**
     * Gets the value of the priorityQueueTimeOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityQueueTimeOut() {
        return priorityQueueTimeOut;
    }

    /**
     * Sets the value of the priorityQueueTimeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityQueueTimeOut(String value) {
        this.priorityQueueTimeOut = value;
    }

    /**
     * Gets the value of the normalQueueSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalQueueSize() {
        return normalQueueSize;
    }

    /**
     * Sets the value of the normalQueueSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalQueueSize(String value) {
        this.normalQueueSize = value;
    }

    /**
     * Gets the value of the normalQueueTimeOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalQueueTimeOut() {
        return normalQueueTimeOut;
    }

    /**
     * Sets the value of the normalQueueTimeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalQueueTimeOut(String value) {
        this.normalQueueTimeOut = value;
    }

    /**
     * Gets the value of the callQueueCallLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallQueueCallLimit() {
        return callQueueCallLimit;
    }

    /**
     * Sets the value of the callQueueCallLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallQueueCallLimit(String value) {
        this.callQueueCallLimit = value;
    }

    /**
     * Gets the value of the maxCallDurationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxCallDurationFlag() {
        return maxCallDurationFlag;
    }

    /**
     * Sets the value of the maxCallDurationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxCallDurationFlag(Long value) {
        this.maxCallDurationFlag = value;
    }

    /**
     * Gets the value of the maxCallDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxCallDuration() {
        return maxCallDuration;
    }

    /**
     * Sets the value of the maxCallDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxCallDuration(Long value) {
        this.maxCallDuration = value;
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
