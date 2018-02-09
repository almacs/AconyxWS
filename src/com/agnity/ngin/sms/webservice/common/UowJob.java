
package com.agnity.ngin.sms.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uowJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uowJob">
 *   &lt;complexContent>
 *     &lt;extension base="{http://common.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="UowId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduledTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "uowJob", propOrder = {
    "uowId",
    "priority",
    "scheduledTime",
    "type"
})
public class UowJob
    extends WsGenericObject
{

    @XmlElement(name = "UowId")
    protected Long uowId;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "ScheduledTime")
    protected String scheduledTime;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the scheduledTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledTime() {
        return scheduledTime;
    }

    /**
     * Sets the value of the scheduledTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledTime(String value) {
        this.scheduledTime = value;
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
