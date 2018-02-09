
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tollfree.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllStandardFeature" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DNIS" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PayPhoneScreening" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PayPhoneIdentification" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CallAreaScreening" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CRERouting" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CallingPartyOverride" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CallTransfer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AllStandardPlusFeature" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AlternateRouting" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MessageReferalFeature" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AccessCodeFeature" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AllAdvancedFeature" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "customProfile", propOrder = {
    "accountNumber",
    "profileName",
    "profileDescription",
    "allStandardFeature",
    "dnis",
    "payPhoneScreening",
    "payPhoneIdentification",
    "callAreaScreening",
    "creRouting",
    "callingPartyOverride",
    "callTransfer",
    "allStandardPlusFeature",
    "alternateRouting",
    "messageReferalFeature",
    "accessCodeFeature",
    "allAdvancedFeature",
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
    "uowId"
})
public class CustomProfile
    extends WsGenericObject
{

    @XmlElement(name = "AccountNumber")
    protected Long accountNumber;
    @XmlElement(name = "ProfileName")
    protected String profileName;
    @XmlElement(name = "ProfileDescription")
    protected String profileDescription;
    @XmlElement(name = "AllStandardFeature")
    protected Long allStandardFeature;
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
    @XmlElement(name = "AllStandardPlusFeature")
    protected Long allStandardPlusFeature;
    @XmlElement(name = "AlternateRouting")
    protected Long alternateRouting;
    @XmlElement(name = "MessageReferalFeature")
    protected Long messageReferalFeature;
    @XmlElement(name = "AccessCodeFeature")
    protected Long accessCodeFeature;
    @XmlElement(name = "AllAdvancedFeature")
    protected Long allAdvancedFeature;
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
     * Gets the value of the allStandardFeature property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAllStandardFeature() {
        return allStandardFeature;
    }

    /**
     * Sets the value of the allStandardFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAllStandardFeature(Long value) {
        this.allStandardFeature = value;
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
     * Gets the value of the allStandardPlusFeature property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAllStandardPlusFeature() {
        return allStandardPlusFeature;
    }

    /**
     * Sets the value of the allStandardPlusFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAllStandardPlusFeature(Long value) {
        this.allStandardPlusFeature = value;
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
     * Gets the value of the accessCodeFeature property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccessCodeFeature() {
        return accessCodeFeature;
    }

    /**
     * Sets the value of the accessCodeFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccessCodeFeature(Long value) {
        this.accessCodeFeature = value;
    }

    /**
     * Gets the value of the allAdvancedFeature property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAllAdvancedFeature() {
        return allAdvancedFeature;
    }

    /**
     * Sets the value of the allAdvancedFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAllAdvancedFeature(Long value) {
        this.allAdvancedFeature = value;
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
