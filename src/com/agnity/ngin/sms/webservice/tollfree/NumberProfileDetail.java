
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for numberProfileDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="numberProfileDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tollfree.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProfileDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DNIS" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PayPhoneScreening" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PayPhoneIdentification" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CallAreaScreening" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CRERouting" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CallingPartyOverride" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CallTransfer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AlternateRouting" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MessageReferalFeature" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AccesssCodeFeature" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OriginBasedRouting" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TimeBasedRouting" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ExtensionBasedRouting" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PinBasedRouting" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DialledPatternBasedRouting" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IVRMenuBasedRouting" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PercentageRouting" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AccountCodeFeature" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AuthCodeFeature" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AniScreening" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CallQueuing" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AlternateDNISNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PlayAnnouncementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvalidInputAnnouncementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoInputAnnouncementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallAreaScreeningAnnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NormalQueueAnnouncementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QueueWaitTimeoutAnnouncementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NormalQueueOverflowAnnouncementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriorityQueueAnnouncementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriorityQueueOverflowAnnouncementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncorrectPINAnnouncementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MoveToPriorityQueueAnnouncementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriorityQueuePINAnnouncementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxRetriesFailedAnnouncementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultAnnouncementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerminateRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RouteToNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FailureAnnouncementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfPromptsForDigitCollection" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "numberProfileDetail", propOrder = {
    "accountNumber",
    "profileName",
    "profileType",
    "profileDescription",
    "dnis",
    "payPhoneScreening",
    "payPhoneIdentification",
    "callAreaScreening",
    "creRouting",
    "callingPartyOverride",
    "callTransfer",
    "alternateRouting",
    "messageReferalFeature",
    "accesssCodeFeature",
    "originBasedRouting",
    "timeBasedRouting",
    "extensionBasedRouting",
    "pinBasedRouting",
    "dialledPatternBasedRouting",
    "ivrMenuBasedRouting",
    "percentageRouting",
    "accountCodeFeature",
    "authCodeFeature",
    "aniScreening",
    "callQueuing",
    "alternateDNISNumber",
    "playAnnouncementName",
    "invalidInputAnnouncementName",
    "noInputAnnouncementName",
    "callAreaScreeningAnnName",
    "normalQueueAnnouncementName",
    "queueWaitTimeoutAnnouncementName",
    "normalQueueOverflowAnnouncementName",
    "priorityQueueAnnouncementName",
    "priorityQueueOverflowAnnouncementName",
    "incorrectPINAnnouncementName",
    "moveToPriorityQueueAnnouncementName",
    "priorityQueuePINAnnouncementName",
    "maxRetriesFailedAnnouncementName",
    "defaultAnnouncementName",
    "terminateRoute",
    "routeToNumber",
    "failureAnnouncementName",
    "numberOfPromptsForDigitCollection",
    "uowId"
})
public class NumberProfileDetail
    extends WsGenericObject
{

    @XmlElement(name = "AccountNumber")
    protected Long accountNumber;
    @XmlElement(name = "ProfileName")
    protected String profileName;
    @XmlElement(name = "ProfileType")
    protected Long profileType;
    @XmlElement(name = "ProfileDescription")
    protected String profileDescription;
    @XmlElement(name = "DNIS")
    protected Long dnis;
    @XmlElement(name = "PayPhoneScreening")
    protected Long payPhoneScreening;
    @XmlElement(name = "PayPhoneIdentification")
    protected Long payPhoneIdentification;
    @XmlElement(name = "CallAreaScreening")
    protected Long callAreaScreening;
    @XmlElement(name = "CRERouting")
    protected Long creRouting;
    @XmlElement(name = "CallingPartyOverride")
    protected Long callingPartyOverride;
    @XmlElement(name = "CallTransfer")
    protected Long callTransfer;
    @XmlElement(name = "AlternateRouting")
    protected Long alternateRouting;
    @XmlElement(name = "MessageReferalFeature")
    protected Long messageReferalFeature;
    @XmlElement(name = "AccesssCodeFeature")
    protected Long accesssCodeFeature;
    @XmlElement(name = "OriginBasedRouting")
    protected Long originBasedRouting;
    @XmlElement(name = "TimeBasedRouting")
    protected Long timeBasedRouting;
    @XmlElement(name = "ExtensionBasedRouting")
    protected Long extensionBasedRouting;
    @XmlElement(name = "PinBasedRouting")
    protected Long pinBasedRouting;
    @XmlElement(name = "DialledPatternBasedRouting")
    protected Long dialledPatternBasedRouting;
    @XmlElement(name = "IVRMenuBasedRouting")
    protected Long ivrMenuBasedRouting;
    @XmlElement(name = "PercentageRouting")
    protected Long percentageRouting;
    @XmlElement(name = "AccountCodeFeature")
    protected Long accountCodeFeature;
    @XmlElement(name = "AuthCodeFeature")
    protected Long authCodeFeature;
    @XmlElement(name = "AniScreening")
    protected Long aniScreening;
    @XmlElement(name = "CallQueuing")
    protected Long callQueuing;
    @XmlElement(name = "AlternateDNISNumber")
    protected Long alternateDNISNumber;
    @XmlElement(name = "PlayAnnouncementName")
    protected String playAnnouncementName;
    @XmlElement(name = "InvalidInputAnnouncementName")
    protected String invalidInputAnnouncementName;
    @XmlElement(name = "NoInputAnnouncementName")
    protected String noInputAnnouncementName;
    @XmlElement(name = "CallAreaScreeningAnnName")
    protected String callAreaScreeningAnnName;
    @XmlElement(name = "NormalQueueAnnouncementName")
    protected String normalQueueAnnouncementName;
    @XmlElement(name = "QueueWaitTimeoutAnnouncementName")
    protected String queueWaitTimeoutAnnouncementName;
    @XmlElement(name = "NormalQueueOverflowAnnouncementName")
    protected String normalQueueOverflowAnnouncementName;
    @XmlElement(name = "PriorityQueueAnnouncementName")
    protected String priorityQueueAnnouncementName;
    @XmlElement(name = "PriorityQueueOverflowAnnouncementName")
    protected String priorityQueueOverflowAnnouncementName;
    @XmlElement(name = "IncorrectPINAnnouncementName")
    protected String incorrectPINAnnouncementName;
    @XmlElement(name = "MoveToPriorityQueueAnnouncementName")
    protected String moveToPriorityQueueAnnouncementName;
    @XmlElement(name = "PriorityQueuePINAnnouncementName")
    protected String priorityQueuePINAnnouncementName;
    @XmlElement(name = "MaxRetriesFailedAnnouncementName")
    protected String maxRetriesFailedAnnouncementName;
    @XmlElement(name = "DefaultAnnouncementName")
    protected String defaultAnnouncementName;
    @XmlElement(name = "TerminateRoute")
    protected String terminateRoute;
    @XmlElement(name = "RouteToNumber")
    protected String routeToNumber;
    @XmlElement(name = "FailureAnnouncementName")
    protected String failureAnnouncementName;
    @XmlElement(name = "NumberOfPromptsForDigitCollection")
    protected Long numberOfPromptsForDigitCollection;
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
     * Gets the value of the profileType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProfileType() {
        return profileType;
    }

    /**
     * Sets the value of the profileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProfileType(Long value) {
        this.profileType = value;
    }

    /**
     * Gets the value of the profileDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileDescription() {
        return profileDescription;
    }

    /**
     * Sets the value of the profileDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileDescription(String value) {
        this.profileDescription = value;
    }

    /**
     * Gets the value of the dnis property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDNIS() {
        return dnis;
    }

    /**
     * Sets the value of the dnis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDNIS(Long value) {
        this.dnis = value;
    }

    /**
     * Gets the value of the payPhoneScreening property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayPhoneScreening() {
        return payPhoneScreening;
    }

    /**
     * Sets the value of the payPhoneScreening property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayPhoneScreening(Long value) {
        this.payPhoneScreening = value;
    }

    /**
     * Gets the value of the payPhoneIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayPhoneIdentification() {
        return payPhoneIdentification;
    }

    /**
     * Sets the value of the payPhoneIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayPhoneIdentification(Long value) {
        this.payPhoneIdentification = value;
    }

    /**
     * Gets the value of the callAreaScreening property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCallAreaScreening() {
        return callAreaScreening;
    }

    /**
     * Sets the value of the callAreaScreening property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCallAreaScreening(Long value) {
        this.callAreaScreening = value;
    }

    /**
     * Gets the value of the creRouting property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCRERouting() {
        return creRouting;
    }

    /**
     * Sets the value of the creRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCRERouting(Long value) {
        this.creRouting = value;
    }

    /**
     * Gets the value of the callingPartyOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCallingPartyOverride() {
        return callingPartyOverride;
    }

    /**
     * Sets the value of the callingPartyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCallingPartyOverride(Long value) {
        this.callingPartyOverride = value;
    }

    /**
     * Gets the value of the callTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCallTransfer() {
        return callTransfer;
    }

    /**
     * Sets the value of the callTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCallTransfer(Long value) {
        this.callTransfer = value;
    }

    /**
     * Gets the value of the alternateRouting property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAlternateRouting() {
        return alternateRouting;
    }

    /**
     * Sets the value of the alternateRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAlternateRouting(Long value) {
        this.alternateRouting = value;
    }

    /**
     * Gets the value of the messageReferalFeature property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMessageReferalFeature() {
        return messageReferalFeature;
    }

    /**
     * Sets the value of the messageReferalFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMessageReferalFeature(Long value) {
        this.messageReferalFeature = value;
    }

    /**
     * Gets the value of the accesssCodeFeature property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccesssCodeFeature() {
        return accesssCodeFeature;
    }

    /**
     * Sets the value of the accesssCodeFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccesssCodeFeature(Long value) {
        this.accesssCodeFeature = value;
    }

    /**
     * Gets the value of the originBasedRouting property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginBasedRouting() {
        return originBasedRouting;
    }

    /**
     * Sets the value of the originBasedRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginBasedRouting(Long value) {
        this.originBasedRouting = value;
    }

    /**
     * Gets the value of the timeBasedRouting property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeBasedRouting() {
        return timeBasedRouting;
    }

    /**
     * Sets the value of the timeBasedRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeBasedRouting(Long value) {
        this.timeBasedRouting = value;
    }

    /**
     * Gets the value of the extensionBasedRouting property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExtensionBasedRouting() {
        return extensionBasedRouting;
    }

    /**
     * Sets the value of the extensionBasedRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExtensionBasedRouting(Long value) {
        this.extensionBasedRouting = value;
    }

    /**
     * Gets the value of the pinBasedRouting property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPinBasedRouting() {
        return pinBasedRouting;
    }

    /**
     * Sets the value of the pinBasedRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPinBasedRouting(Long value) {
        this.pinBasedRouting = value;
    }

    /**
     * Gets the value of the dialledPatternBasedRouting property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDialledPatternBasedRouting() {
        return dialledPatternBasedRouting;
    }

    /**
     * Sets the value of the dialledPatternBasedRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDialledPatternBasedRouting(Long value) {
        this.dialledPatternBasedRouting = value;
    }

    /**
     * Gets the value of the ivrMenuBasedRouting property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIVRMenuBasedRouting() {
        return ivrMenuBasedRouting;
    }

    /**
     * Sets the value of the ivrMenuBasedRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIVRMenuBasedRouting(Long value) {
        this.ivrMenuBasedRouting = value;
    }

    /**
     * Gets the value of the percentageRouting property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPercentageRouting() {
        return percentageRouting;
    }

    /**
     * Sets the value of the percentageRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPercentageRouting(Long value) {
        this.percentageRouting = value;
    }

    /**
     * Gets the value of the accountCodeFeature property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountCodeFeature() {
        return accountCodeFeature;
    }

    /**
     * Sets the value of the accountCodeFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountCodeFeature(Long value) {
        this.accountCodeFeature = value;
    }

    /**
     * Gets the value of the authCodeFeature property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuthCodeFeature() {
        return authCodeFeature;
    }

    /**
     * Sets the value of the authCodeFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuthCodeFeature(Long value) {
        this.authCodeFeature = value;
    }

    /**
     * Gets the value of the aniScreening property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAniScreening() {
        return aniScreening;
    }

    /**
     * Sets the value of the aniScreening property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAniScreening(Long value) {
        this.aniScreening = value;
    }

    /**
     * Gets the value of the callQueuing property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCallQueuing() {
        return callQueuing;
    }

    /**
     * Sets the value of the callQueuing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCallQueuing(Long value) {
        this.callQueuing = value;
    }

    /**
     * Gets the value of the alternateDNISNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAlternateDNISNumber() {
        return alternateDNISNumber;
    }

    /**
     * Sets the value of the alternateDNISNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAlternateDNISNumber(Long value) {
        this.alternateDNISNumber = value;
    }

    /**
     * Gets the value of the playAnnouncementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayAnnouncementName() {
        return playAnnouncementName;
    }

    /**
     * Sets the value of the playAnnouncementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayAnnouncementName(String value) {
        this.playAnnouncementName = value;
    }

    /**
     * Gets the value of the invalidInputAnnouncementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvalidInputAnnouncementName() {
        return invalidInputAnnouncementName;
    }

    /**
     * Sets the value of the invalidInputAnnouncementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvalidInputAnnouncementName(String value) {
        this.invalidInputAnnouncementName = value;
    }

    /**
     * Gets the value of the noInputAnnouncementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoInputAnnouncementName() {
        return noInputAnnouncementName;
    }

    /**
     * Sets the value of the noInputAnnouncementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoInputAnnouncementName(String value) {
        this.noInputAnnouncementName = value;
    }

    /**
     * Gets the value of the callAreaScreeningAnnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallAreaScreeningAnnName() {
        return callAreaScreeningAnnName;
    }

    /**
     * Sets the value of the callAreaScreeningAnnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallAreaScreeningAnnName(String value) {
        this.callAreaScreeningAnnName = value;
    }

    /**
     * Gets the value of the normalQueueAnnouncementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalQueueAnnouncementName() {
        return normalQueueAnnouncementName;
    }

    /**
     * Sets the value of the normalQueueAnnouncementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalQueueAnnouncementName(String value) {
        this.normalQueueAnnouncementName = value;
    }

    /**
     * Gets the value of the queueWaitTimeoutAnnouncementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueWaitTimeoutAnnouncementName() {
        return queueWaitTimeoutAnnouncementName;
    }

    /**
     * Sets the value of the queueWaitTimeoutAnnouncementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueWaitTimeoutAnnouncementName(String value) {
        this.queueWaitTimeoutAnnouncementName = value;
    }

    /**
     * Gets the value of the normalQueueOverflowAnnouncementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalQueueOverflowAnnouncementName() {
        return normalQueueOverflowAnnouncementName;
    }

    /**
     * Sets the value of the normalQueueOverflowAnnouncementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalQueueOverflowAnnouncementName(String value) {
        this.normalQueueOverflowAnnouncementName = value;
    }

    /**
     * Gets the value of the priorityQueueAnnouncementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityQueueAnnouncementName() {
        return priorityQueueAnnouncementName;
    }

    /**
     * Sets the value of the priorityQueueAnnouncementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityQueueAnnouncementName(String value) {
        this.priorityQueueAnnouncementName = value;
    }

    /**
     * Gets the value of the priorityQueueOverflowAnnouncementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityQueueOverflowAnnouncementName() {
        return priorityQueueOverflowAnnouncementName;
    }

    /**
     * Sets the value of the priorityQueueOverflowAnnouncementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityQueueOverflowAnnouncementName(String value) {
        this.priorityQueueOverflowAnnouncementName = value;
    }

    /**
     * Gets the value of the incorrectPINAnnouncementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncorrectPINAnnouncementName() {
        return incorrectPINAnnouncementName;
    }

    /**
     * Sets the value of the incorrectPINAnnouncementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncorrectPINAnnouncementName(String value) {
        this.incorrectPINAnnouncementName = value;
    }

    /**
     * Gets the value of the moveToPriorityQueueAnnouncementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoveToPriorityQueueAnnouncementName() {
        return moveToPriorityQueueAnnouncementName;
    }

    /**
     * Sets the value of the moveToPriorityQueueAnnouncementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoveToPriorityQueueAnnouncementName(String value) {
        this.moveToPriorityQueueAnnouncementName = value;
    }

    /**
     * Gets the value of the priorityQueuePINAnnouncementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityQueuePINAnnouncementName() {
        return priorityQueuePINAnnouncementName;
    }

    /**
     * Sets the value of the priorityQueuePINAnnouncementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityQueuePINAnnouncementName(String value) {
        this.priorityQueuePINAnnouncementName = value;
    }

    /**
     * Gets the value of the maxRetriesFailedAnnouncementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxRetriesFailedAnnouncementName() {
        return maxRetriesFailedAnnouncementName;
    }

    /**
     * Sets the value of the maxRetriesFailedAnnouncementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxRetriesFailedAnnouncementName(String value) {
        this.maxRetriesFailedAnnouncementName = value;
    }

    /**
     * Gets the value of the defaultAnnouncementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAnnouncementName() {
        return defaultAnnouncementName;
    }

    /**
     * Sets the value of the defaultAnnouncementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAnnouncementName(String value) {
        this.defaultAnnouncementName = value;
    }

    /**
     * Gets the value of the terminateRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminateRoute() {
        return terminateRoute;
    }

    /**
     * Sets the value of the terminateRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminateRoute(String value) {
        this.terminateRoute = value;
    }

    /**
     * Gets the value of the routeToNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteToNumber() {
        return routeToNumber;
    }

    /**
     * Sets the value of the routeToNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteToNumber(String value) {
        this.routeToNumber = value;
    }

    /**
     * Gets the value of the failureAnnouncementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureAnnouncementName() {
        return failureAnnouncementName;
    }

    /**
     * Sets the value of the failureAnnouncementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureAnnouncementName(String value) {
        this.failureAnnouncementName = value;
    }

    /**
     * Gets the value of the numberOfPromptsForDigitCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfPromptsForDigitCollection() {
        return numberOfPromptsForDigitCollection;
    }

    /**
     * Sets the value of the numberOfPromptsForDigitCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfPromptsForDigitCollection(Long value) {
        this.numberOfPromptsForDigitCollection = value;
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
