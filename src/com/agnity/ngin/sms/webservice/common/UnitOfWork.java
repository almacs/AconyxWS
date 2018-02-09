
package com.agnity.ngin.sms.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unitOfWork complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unitOfWork">
 *   &lt;complexContent>
 *     &lt;extension base="{http://common.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="UowId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UowDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ScheduleTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unitOfWork", propOrder = {
    "uowId",
    "accountNumber",
    "uowName",
    "uowDesc",
    "status",
    "scheduleTime",
    "type"
})
public class UnitOfWork
    extends WsGenericObject
{

    @XmlElement(name = "UowId")
    protected Long uowId;
    @XmlElement(name = "AccountNumber")
    protected Long accountNumber;
    @XmlElement(name = "UowName")
    protected String uowName;
    @XmlElement(name = "UowDesc")
    protected String uowDesc;
    @XmlElement(name = "Status")
    protected Long status;
    @XmlElement(name = "ScheduleTime")
    protected String scheduleTime;
    protected String type;

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
     * Gets the value of the uowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUowName() {
        return uowName;
    }

    /**
     * Sets the value of the uowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUowName(String value) {
        this.uowName = value;
    }

    /**
     * Gets the value of the uowDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUowDesc() {
        return uowDesc;
    }

    /**
     * Sets the value of the uowDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUowDesc(String value) {
        this.uowDesc = value;
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
     * Gets the value of the scheduleTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleTime() {
        return scheduleTime;
    }

    /**
     * Sets the value of the scheduleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleTime(String value) {
        this.scheduleTime = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
