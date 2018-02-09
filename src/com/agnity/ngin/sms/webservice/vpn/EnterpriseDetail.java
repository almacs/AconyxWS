
package com.agnity.ngin.sms.webservice.vpn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enterpriseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enterpriseDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vpn.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="EnterpriseAccountNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "enterpriseDetail", propOrder = {
    "enterpriseAccountNo",
    "uowId"
})
public class EnterpriseDetail
    extends WsGenericObject
{

    @XmlElement(name = "EnterpriseAccountNo")
    protected Long enterpriseAccountNo;
    @XmlElement(name = "UowId")
    protected Long uowId;

    /**
     * Gets the value of the enterpriseAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEnterpriseAccountNo() {
        return enterpriseAccountNo;
    }

    /**
     * Sets the value of the enterpriseAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEnterpriseAccountNo(Long value) {
        this.enterpriseAccountNo = value;
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
