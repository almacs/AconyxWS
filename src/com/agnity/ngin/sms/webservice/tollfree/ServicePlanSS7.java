
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servicePlanSS7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicePlanSS7">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tollfree.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ServiceBillingID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallingPartyCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ServicePackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxCallDurationFlag" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MaxCallDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LNPlookupForTollfree" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LNPlookupForTranslatedNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OperatorPrefixes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StayinCallPath" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ServiceKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseSIPbasedMRF" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FCIType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContinueAfterLNPLookupFailure" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "servicePlanSS7", propOrder = {
    "accountNumber",
    "serviceBillingID",
    "callingPartyCategory",
    "status",
    "servicePackage",
    "customProfileName",
    "activationDate",
    "expirationDate",
    "maxCallDurationFlag",
    "maxCallDuration",
    "lnPlookupForTollfree",
    "lnPlookupForTranslatedNumber",
    "operatorPrefixes",
    "stayinCallPath",
    "serviceKey",
    "useSIPbasedMRF",
    "fciType",
    "continueAfterLNPLookupFailure",
    "uowId"
})
public class ServicePlanSS7
    extends WsGenericObject
{

    @XmlElement(name = "AccountNumber")
    protected Long accountNumber;
    @XmlElement(name = "ServiceBillingID")
    protected String serviceBillingID;
    @XmlElement(name = "CallingPartyCategory")
    protected String callingPartyCategory;
    @XmlElement(name = "Status")
    protected Long status;
    @XmlElement(name = "ServicePackage")
    protected String servicePackage;
    @XmlElement(name = "CustomProfileName")
    protected String customProfileName;
    @XmlElement(name = "ActivationDate")
    protected String activationDate;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "MaxCallDurationFlag")
    protected Long maxCallDurationFlag;
    @XmlElement(name = "MaxCallDuration")
    protected Long maxCallDuration;
    @XmlElement(name = "LNPlookupForTollfree")
    protected Long lnPlookupForTollfree;
    @XmlElement(name = "LNPlookupForTranslatedNumber")
    protected Long lnPlookupForTranslatedNumber;
    @XmlElement(name = "OperatorPrefixes")
    protected String operatorPrefixes;
    @XmlElement(name = "StayinCallPath")
    protected Long stayinCallPath;
    @XmlElement(name = "ServiceKey")
    protected String serviceKey;
    @XmlElement(name = "UseSIPbasedMRF")
    protected Long useSIPbasedMRF;
    @XmlElement(name = "FCIType")
    protected Long fciType;
    @XmlElement(name = "ContinueAfterLNPLookupFailure")
    protected Long continueAfterLNPLookupFailure;
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
     * Gets the value of the serviceBillingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceBillingID() {
        return serviceBillingID;
    }

    /**
     * Sets the value of the serviceBillingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceBillingID(String value) {
        this.serviceBillingID = value;
    }

    /**
     * Gets the value of the callingPartyCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPartyCategory() {
        return callingPartyCategory;
    }

    /**
     * Sets the value of the callingPartyCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPartyCategory(String value) {
        this.callingPartyCategory = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatus(Long value) {
        this.status = value;
    }

    /**
     * Gets the value of the servicePackage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePackage() {
        return servicePackage;
    }

    /**
     * Sets the value of the servicePackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePackage(String value) {
        this.servicePackage = value;
    }

    /**
     * Gets the value of the customProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomProfileName() {
        return customProfileName;
    }

    /**
     * Sets the value of the customProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomProfileName(String value) {
        this.customProfileName = value;
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
     * Gets the value of the lnPlookupForTollfree property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLNPlookupForTollfree() {
        return lnPlookupForTollfree;
    }

    /**
     * Sets the value of the lnPlookupForTollfree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLNPlookupForTollfree(Long value) {
        this.lnPlookupForTollfree = value;
    }

    /**
     * Gets the value of the lnPlookupForTranslatedNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLNPlookupForTranslatedNumber() {
        return lnPlookupForTranslatedNumber;
    }

    /**
     * Sets the value of the lnPlookupForTranslatedNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLNPlookupForTranslatedNumber(Long value) {
        this.lnPlookupForTranslatedNumber = value;
    }

    /**
     * Gets the value of the operatorPrefixes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorPrefixes() {
        return operatorPrefixes;
    }

    /**
     * Sets the value of the operatorPrefixes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorPrefixes(String value) {
        this.operatorPrefixes = value;
    }

    /**
     * Gets the value of the stayinCallPath property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStayinCallPath() {
        return stayinCallPath;
    }

    /**
     * Sets the value of the stayinCallPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStayinCallPath(Long value) {
        this.stayinCallPath = value;
    }

    /**
     * Gets the value of the serviceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceKey() {
        return serviceKey;
    }

    /**
     * Sets the value of the serviceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceKey(String value) {
        this.serviceKey = value;
    }

    /**
     * Gets the value of the useSIPbasedMRF property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUseSIPbasedMRF() {
        return useSIPbasedMRF;
    }

    /**
     * Sets the value of the useSIPbasedMRF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUseSIPbasedMRF(Long value) {
        this.useSIPbasedMRF = value;
    }

    /**
     * Gets the value of the fciType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFCIType() {
        return fciType;
    }

    /**
     * Sets the value of the fciType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFCIType(Long value) {
        this.fciType = value;
    }

    /**
     * Gets the value of the continueAfterLNPLookupFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContinueAfterLNPLookupFailure() {
        return continueAfterLNPLookupFailure;
    }

    /**
     * Sets the value of the continueAfterLNPLookupFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContinueAfterLNPLookupFailure(Long value) {
        this.continueAfterLNPLookupFailure = value;
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
