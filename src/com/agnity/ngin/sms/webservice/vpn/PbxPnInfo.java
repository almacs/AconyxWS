
package com.agnity.ngin.sms.webservice.vpn;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pbxPnInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pbxPnInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VirtualOnNet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LnpLookup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrivateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncomingCliList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PbxCliDetails" type="{http://vpn.webservice.sms.ngin.agnity.com/}cliDetails" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OutgoingCliList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PbxCliDetails" type="{http://vpn.webservice.sms.ngin.agnity.com/}cliDetails" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DigitsToAppend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtensionFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtensionTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoutingCliNumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoutingCliNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pbxPnInfo", propOrder = {
    "areaCode",
    "countryCode",
    "virtualOnNet",
    "lnpLookup",
    "locationId",
    "groupId",
    "profileId",
    "status",
    "privateNumber",
    "inRecordType",
    "outRecordType",
    "incomingCliList",
    "outgoingCliList",
    "digitsToAppend",
    "extensionFrom",
    "extensionTo",
    "routingCliNumberType",
    "routingCliNumber"
})
public class PbxPnInfo {

    @XmlElement(name = "AreaCode")
    protected String areaCode;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "VirtualOnNet")
    protected String virtualOnNet;
    @XmlElement(name = "LnpLookup")
    protected String lnpLookup;
    @XmlElement(name = "LocationId")
    protected String locationId;
    @XmlElement(name = "GroupId")
    protected String groupId;
    @XmlElement(name = "ProfileId")
    protected String profileId;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "PrivateNumber")
    protected String privateNumber;
    @XmlElement(name = "InRecordType")
    protected String inRecordType;
    @XmlElement(name = "OutRecordType")
    protected String outRecordType;
    @XmlElement(name = "IncomingCliList")
    protected PbxPnInfo.IncomingCliList incomingCliList;
    @XmlElement(name = "OutgoingCliList")
    protected PbxPnInfo.OutgoingCliList outgoingCliList;
    @XmlElement(name = "DigitsToAppend")
    protected String digitsToAppend;
    @XmlElement(name = "ExtensionFrom")
    protected String extensionFrom;
    @XmlElement(name = "ExtensionTo")
    protected String extensionTo;
    @XmlElement(name = "RoutingCliNumberType")
    protected String routingCliNumberType;
    @XmlElement(name = "RoutingCliNumber")
    protected String routingCliNumber;

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the virtualOnNet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualOnNet() {
        return virtualOnNet;
    }

    /**
     * Sets the value of the virtualOnNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualOnNet(String value) {
        this.virtualOnNet = value;
    }

    /**
     * Gets the value of the lnpLookup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnpLookup() {
        return lnpLookup;
    }

    /**
     * Sets the value of the lnpLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnpLookup(String value) {
        this.lnpLookup = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationId(String value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the profileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileId(String value) {
        this.profileId = value;
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
     * Gets the value of the inRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRecordType() {
        return inRecordType;
    }

    /**
     * Sets the value of the inRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRecordType(String value) {
        this.inRecordType = value;
    }

    /**
     * Gets the value of the outRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRecordType() {
        return outRecordType;
    }

    /**
     * Sets the value of the outRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRecordType(String value) {
        this.outRecordType = value;
    }

    /**
     * Gets the value of the incomingCliList property.
     * 
     * @return
     *     possible object is
     *     {@link PbxPnInfo.IncomingCliList }
     *     
     */
    public PbxPnInfo.IncomingCliList getIncomingCliList() {
        return incomingCliList;
    }

    /**
     * Sets the value of the incomingCliList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PbxPnInfo.IncomingCliList }
     *     
     */
    public void setIncomingCliList(PbxPnInfo.IncomingCliList value) {
        this.incomingCliList = value;
    }

    /**
     * Gets the value of the outgoingCliList property.
     * 
     * @return
     *     possible object is
     *     {@link PbxPnInfo.OutgoingCliList }
     *     
     */
    public PbxPnInfo.OutgoingCliList getOutgoingCliList() {
        return outgoingCliList;
    }

    /**
     * Sets the value of the outgoingCliList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PbxPnInfo.OutgoingCliList }
     *     
     */
    public void setOutgoingCliList(PbxPnInfo.OutgoingCliList value) {
        this.outgoingCliList = value;
    }

    /**
     * Gets the value of the digitsToAppend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitsToAppend() {
        return digitsToAppend;
    }

    /**
     * Sets the value of the digitsToAppend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitsToAppend(String value) {
        this.digitsToAppend = value;
    }

    /**
     * Gets the value of the extensionFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionFrom() {
        return extensionFrom;
    }

    /**
     * Sets the value of the extensionFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionFrom(String value) {
        this.extensionFrom = value;
    }

    /**
     * Gets the value of the extensionTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionTo() {
        return extensionTo;
    }

    /**
     * Sets the value of the extensionTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionTo(String value) {
        this.extensionTo = value;
    }

    /**
     * Gets the value of the routingCliNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingCliNumberType() {
        return routingCliNumberType;
    }

    /**
     * Sets the value of the routingCliNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingCliNumberType(String value) {
        this.routingCliNumberType = value;
    }

    /**
     * Gets the value of the routingCliNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingCliNumber() {
        return routingCliNumber;
    }

    /**
     * Sets the value of the routingCliNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingCliNumber(String value) {
        this.routingCliNumber = value;
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
     *         &lt;element name="PbxCliDetails" type="{http://vpn.webservice.sms.ngin.agnity.com/}cliDetails" maxOccurs="unbounded" minOccurs="0"/>
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
        "pbxCliDetails"
    })
    public static class IncomingCliList {

        @XmlElement(name = "PbxCliDetails")
        protected List<CliDetails> pbxCliDetails;

        /**
         * Gets the value of the pbxCliDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pbxCliDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPbxCliDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CliDetails }
         * 
         * 
         */
        public List<CliDetails> getPbxCliDetails() {
            if (pbxCliDetails == null) {
                pbxCliDetails = new ArrayList<CliDetails>();
            }
            return this.pbxCliDetails;
        }

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
     *         &lt;element name="PbxCliDetails" type="{http://vpn.webservice.sms.ngin.agnity.com/}cliDetails" maxOccurs="unbounded" minOccurs="0"/>
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
        "pbxCliDetails"
    })
    public static class OutgoingCliList {

        @XmlElement(name = "PbxCliDetails")
        protected List<CliDetails> pbxCliDetails;

        /**
         * Gets the value of the pbxCliDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pbxCliDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPbxCliDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CliDetails }
         * 
         * 
         */
        public List<CliDetails> getPbxCliDetails() {
            if (pbxCliDetails == null) {
                pbxCliDetails = new ArrayList<CliDetails>();
            }
            return this.pbxCliDetails;
        }

    }

}
