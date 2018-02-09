
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tfNumberListAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tfNumberListAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tollfree.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="TollFreeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tfNumberListAttribute", propOrder = {
    "tollFreeNumber",
    "assignStatus"
})
public class TfNumberListAttribute
    extends WsGenericObject
{

    @XmlElement(name = "TollFreeNumber")
    protected String tollFreeNumber;
    @XmlElement(name = "AssignStatus")
    protected String assignStatus;

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
     * Gets the value of the assignStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignStatus() {
        return assignStatus;
    }

    /**
     * Sets the value of the assignStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignStatus(String value) {
        this.assignStatus = value;
    }

}
