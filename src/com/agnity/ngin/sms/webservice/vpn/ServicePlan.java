
package com.agnity.ngin.sms.webservice.vpn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servicePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicePlan">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vpn.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="EnterpriseAccountNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PlanPackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceChargeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncomingCallRestricitions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "servicePlan", propOrder = {
    "enterpriseAccountNo",
    "planPackage",
    "serviceChargeId",
    "incomingCallRestricitions",
    "status",
    "uowId"
})
public class ServicePlan
    extends WsGenericObject
{

    @XmlElement(name = "EnterpriseAccountNo")
    protected Long enterpriseAccountNo;
    @XmlElement(name = "PlanPackage")
    protected String planPackage;
    @XmlElement(name = "ServiceChargeId")
    protected String serviceChargeId;
    @XmlElement(name = "IncomingCallRestricitions")
    protected String incomingCallRestricitions;
    @XmlElement(name = "Status")
    protected String status;
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
     * Gets the value of the planPackage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanPackage() {
        return planPackage;
    }

    /**
     * Sets the value of the planPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanPackage(String value) {
        this.planPackage = value;
    }

    /**
     * Gets the value of the serviceChargeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceChargeId() {
        return serviceChargeId;
    }

    /**
     * Sets the value of the serviceChargeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceChargeId(String value) {
        this.serviceChargeId = value;
    }

    /**
     * Gets the value of the incomingCallRestricitions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingCallRestricitions() {
        return incomingCallRestricitions;
    }

    /**
     * Sets the value of the incomingCallRestricitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingCallRestricitions(String value) {
        this.incomingCallRestricitions = value;
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
