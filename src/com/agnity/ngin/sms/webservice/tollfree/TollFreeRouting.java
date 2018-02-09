
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tollFreeRouting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tollFreeRouting">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tollfree.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="TollFreeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProfileType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryTerminateRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StandardPlus" type="{http://tollfree.webservice.sms.ngin.agnity.com/}standardPlus" minOccurs="0"/>
 *         &lt;element name="Advance" type="{http://tollfree.webservice.sms.ngin.agnity.com/}advance" minOccurs="0"/>
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
@XmlType(name = "tollFreeRouting", propOrder = {
    "tollFreeNumber",
    "accountNumber",
    "profileType",
    "primaryTerminateRoute",
    "standardPlus",
    "advance",
    "uowId"
})
public class TollFreeRouting
    extends WsGenericObject
{

    @XmlElement(name = "TollFreeNumber")
    protected String tollFreeNumber;
    @XmlElement(name = "AccountNumber")
    protected Long accountNumber;
    @XmlElement(name = "ProfileType")
    protected Long profileType;
    @XmlElement(name = "PrimaryTerminateRoute")
    protected String primaryTerminateRoute;
    @XmlElement(name = "StandardPlus")
    protected StandardPlus standardPlus;
    @XmlElement(name = "Advance")
    protected Advance advance;
    @XmlElement(name = "UowId")
    protected Long uowId;

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
     * Gets the value of the primaryTerminateRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryTerminateRoute() {
        return primaryTerminateRoute;
    }

    /**
     * Sets the value of the primaryTerminateRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryTerminateRoute(String value) {
        this.primaryTerminateRoute = value;
    }

    /**
     * Gets the value of the standardPlus property.
     * 
     * @return
     *     possible object is
     *     {@link StandardPlus }
     *     
     */
    public StandardPlus getStandardPlus() {
        return standardPlus;
    }

    /**
     * Sets the value of the standardPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardPlus }
     *     
     */
    public void setStandardPlus(StandardPlus value) {
        this.standardPlus = value;
    }

    /**
     * Gets the value of the advance property.
     * 
     * @return
     *     possible object is
     *     {@link Advance }
     *     
     */
    public Advance getAdvance() {
        return advance;
    }

    /**
     * Sets the value of the advance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Advance }
     *     
     */
    public void setAdvance(Advance value) {
        this.advance = value;
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
