
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminatingNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="terminatingNumber">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tollfree.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="UowId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TerminateRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerminatingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberingPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NatureOfAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBoundAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoAnswerTimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrunkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SwitchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalCalledNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConcurrentCallBarring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terminatingNumber", propOrder = {
    "uowId",
    "accountNumber",
    "terminateRoute",
    "terminatingNumber",
    "numberingPlan",
    "natureOfAddress",
    "outBoundAddress",
    "noAnswerTimer",
    "activationDate",
    "expirationDate",
    "accessType",
    "trunkId",
    "switchId",
    "originalCalledNumber",
    "concurrentCallBarring",
    "domainName",
    "callLimit"
})
public class TerminatingNumber
    extends WsGenericObject
{

    @XmlElement(name = "UowId")
    protected Long uowId;
    @XmlElement(name = "AccountNumber")
    protected Long accountNumber;
    @XmlElement(name = "TerminateRoute")
    protected String terminateRoute;
    @XmlElement(name = "TerminatingNumber")
    protected String terminatingNumber;
    @XmlElement(name = "NumberingPlan")
    protected String numberingPlan;
    @XmlElement(name = "NatureOfAddress")
    protected String natureOfAddress;
    @XmlElement(name = "OutBoundAddress")
    protected String outBoundAddress;
    @XmlElement(name = "NoAnswerTimer")
    protected String noAnswerTimer;
    @XmlElement(name = "ActivationDate")
    protected String activationDate;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "AccessType")
    protected String accessType;
    @XmlElement(name = "TrunkId")
    protected String trunkId;
    @XmlElement(name = "SwitchId")
    protected String switchId;
    @XmlElement(name = "OriginalCalledNumber")
    protected String originalCalledNumber;
    @XmlElement(name = "ConcurrentCallBarring")
    protected String concurrentCallBarring;
    @XmlElement(name = "DomainName")
    protected String domainName;
    @XmlElement(name = "CallLimit")
    protected String callLimit;

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
     * Gets the value of the terminatingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminatingNumber() {
        return terminatingNumber;
    }

    /**
     * Sets the value of the terminatingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminatingNumber(String value) {
        this.terminatingNumber = value;
    }

    /**
     * Gets the value of the numberingPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberingPlan() {
        return numberingPlan;
    }

    /**
     * Sets the value of the numberingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberingPlan(String value) {
        this.numberingPlan = value;
    }

    /**
     * Gets the value of the natureOfAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatureOfAddress() {
        return natureOfAddress;
    }

    /**
     * Sets the value of the natureOfAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatureOfAddress(String value) {
        this.natureOfAddress = value;
    }

    /**
     * Gets the value of the outBoundAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBoundAddress() {
        return outBoundAddress;
    }

    /**
     * Sets the value of the outBoundAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBoundAddress(String value) {
        this.outBoundAddress = value;
    }

    /**
     * Gets the value of the noAnswerTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoAnswerTimer() {
        return noAnswerTimer;
    }

    /**
     * Sets the value of the noAnswerTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoAnswerTimer(String value) {
        this.noAnswerTimer = value;
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
     * Gets the value of the accessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessType() {
        return accessType;
    }

    /**
     * Sets the value of the accessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessType(String value) {
        this.accessType = value;
    }

    /**
     * Gets the value of the trunkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkId() {
        return trunkId;
    }

    /**
     * Sets the value of the trunkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkId(String value) {
        this.trunkId = value;
    }

    /**
     * Gets the value of the switchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchId() {
        return switchId;
    }

    /**
     * Sets the value of the switchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchId(String value) {
        this.switchId = value;
    }

    /**
     * Gets the value of the originalCalledNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalCalledNumber() {
        return originalCalledNumber;
    }

    /**
     * Sets the value of the originalCalledNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalCalledNumber(String value) {
        this.originalCalledNumber = value;
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
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the callLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallLimit() {
        return callLimit;
    }

    /**
     * Sets the value of the callLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallLimit(String value) {
        this.callLimit = value;
    }

}
