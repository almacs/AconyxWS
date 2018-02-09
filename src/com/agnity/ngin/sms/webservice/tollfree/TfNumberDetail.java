
package com.agnity.ngin.sms.webservice.tollfree;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tfNumberDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tfNumberDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tollfree.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="ParentAccountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TollFreeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Profile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallQueueCallLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriorityQueueSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QueuePin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriorityQueueTimeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NormalQueueSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NormalQueueTimeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallAreaSelection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConcurrentCallBarring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConcurrentCallLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PseudoANI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusChangeReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageReferralSettings" type="{http://tollfree.webservice.sms.ngin.agnity.com/}messageReferralSettings" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoutingSetting" type="{http://tollfree.webservice.sms.ngin.agnity.com/}routingSetting" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HomeCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "tfNumberDetail", propOrder = {
    "parentAccountNumber",
    "accountNumber",
    "tollFreeNumber",
    "description",
    "assignStatus",
    "activationDate",
    "expirationDate",
    "status",
    "profile",
    "profileType",
    "callQueueCallLimit",
    "priorityQueueSize",
    "queuePin",
    "priorityQueueTimeout",
    "normalQueueSize",
    "normalQueueTimeout",
    "callAreaSelection",
    "accessCode",
    "concurrentCallBarring",
    "concurrentCallLimit",
    "pseudoANI",
    "statusChangeReasonCode",
    "messageReferralSettings",
    "routingSetting",
    "homeCountry",
    "uowId"
})
public class TfNumberDetail
    extends WsGenericObject
{

    @XmlElement(name = "ParentAccountNumber")
    protected Long parentAccountNumber;
    @XmlElement(name = "AccountNumber")
    protected Long accountNumber;
    @XmlElement(name = "TollFreeNumber")
    protected String tollFreeNumber;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "AssignStatus")
    protected String assignStatus;
    @XmlElement(name = "ActivationDate")
    protected String activationDate;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Profile")
    protected String profile;
    @XmlElement(name = "ProfileType")
    protected String profileType;
    @XmlElement(name = "CallQueueCallLimit")
    protected String callQueueCallLimit;
    @XmlElement(name = "PriorityQueueSize")
    protected String priorityQueueSize;
    @XmlElement(name = "QueuePin")
    protected String queuePin;
    @XmlElement(name = "PriorityQueueTimeout")
    protected String priorityQueueTimeout;
    @XmlElement(name = "NormalQueueSize")
    protected String normalQueueSize;
    @XmlElement(name = "NormalQueueTimeout")
    protected String normalQueueTimeout;
    @XmlElement(name = "CallAreaSelection")
    protected String callAreaSelection;
    @XmlElement(name = "AccessCode")
    protected String accessCode;
    @XmlElement(name = "ConcurrentCallBarring")
    protected String concurrentCallBarring;
    @XmlElement(name = "ConcurrentCallLimit")
    protected String concurrentCallLimit;
    @XmlElement(name = "PseudoANI")
    protected String pseudoANI;
    @XmlElement(name = "StatusChangeReasonCode")
    protected String statusChangeReasonCode;
    @XmlElement(name = "MessageReferralSettings")
    protected List<MessageReferralSettings> messageReferralSettings;
    @XmlElement(name = "RoutingSetting")
    protected List<RoutingSetting> routingSetting;
    @XmlElement(name = "HomeCountry")
    protected String homeCountry;
    @XmlElement(name = "UowId")
    protected Long uowId;

    /**
     * Gets the value of the parentAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentAccountNumber() {
        return parentAccountNumber;
    }

    /**
     * Sets the value of the parentAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentAccountNumber(Long value) {
        this.parentAccountNumber = value;
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
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationDate(String value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
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
     * Gets the value of the priorityQueueTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityQueueTimeout() {
        return priorityQueueTimeout;
    }

    /**
     * Sets the value of the priorityQueueTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityQueueTimeout(String value) {
        this.priorityQueueTimeout = value;
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
     * Gets the value of the normalQueueTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalQueueTimeout() {
        return normalQueueTimeout;
    }

    /**
     * Sets the value of the normalQueueTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalQueueTimeout(String value) {
        this.normalQueueTimeout = value;
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
     * Gets the value of the pseudoANI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoANI() {
        return pseudoANI;
    }

    /**
     * Sets the value of the pseudoANI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudoANI(String value) {
        this.pseudoANI = value;
    }

    /**
     * Gets the value of the statusChangeReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusChangeReasonCode() {
        return statusChangeReasonCode;
    }

    /**
     * Sets the value of the statusChangeReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusChangeReasonCode(String value) {
        this.statusChangeReasonCode = value;
    }

    /**
     * Gets the value of the messageReferralSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageReferralSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageReferralSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageReferralSettings }
     * 
     * 
     */
    public List<MessageReferralSettings> getMessageReferralSettings() {
        if (messageReferralSettings == null) {
            messageReferralSettings = new ArrayList<MessageReferralSettings>();
        }
        return this.messageReferralSettings;
    }

    /**
     * Gets the value of the routingSetting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingSetting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingSetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingSetting }
     * 
     * 
     */
    public List<RoutingSetting> getRoutingSetting() {
        if (routingSetting == null) {
            routingSetting = new ArrayList<RoutingSetting>();
        }
        return this.routingSetting;
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
