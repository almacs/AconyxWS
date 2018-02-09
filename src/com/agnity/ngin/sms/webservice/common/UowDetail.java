
package com.agnity.ngin.sms.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uowDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uowDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://common.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="ProvisioningKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GCClusterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublishTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "uowDetail", propOrder = {
    "provisioningKey",
    "gcClusterId",
    "publishTime",
    "uowId"
})
public class UowDetail
    extends WsGenericObject
{

    @XmlElement(name = "ProvisioningKey")
    protected String provisioningKey;
    @XmlElement(name = "GCClusterId")
    protected String gcClusterId;
    @XmlElement(name = "PublishTime")
    protected String publishTime;
    @XmlElement(name = "UowId")
    protected Long uowId;

    /**
     * Gets the value of the provisioningKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisioningKey() {
        return provisioningKey;
    }

    /**
     * Sets the value of the provisioningKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisioningKey(String value) {
        this.provisioningKey = value;
    }

    /**
     * Gets the value of the gcClusterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGCClusterId() {
        return gcClusterId;
    }

    /**
     * Sets the value of the gcClusterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGCClusterId(String value) {
        this.gcClusterId = value;
    }

    /**
     * Gets the value of the publishTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishTime() {
        return publishTime;
    }

    /**
     * Sets the value of the publishTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishTime(String value) {
        this.publishTime = value;
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
