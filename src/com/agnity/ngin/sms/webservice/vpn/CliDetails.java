
package com.agnity.ngin.sms.webservice.vpn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cliDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cliDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LowNumberCli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HighNumberCli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cliDetails", propOrder = {
    "numberType",
    "lowNumberCli",
    "highNumberCli"
})
public class CliDetails {

    @XmlElement(name = "NumberType")
    protected String numberType;
    @XmlElement(name = "LowNumberCli")
    protected String lowNumberCli;
    @XmlElement(name = "HighNumberCli")
    protected String highNumberCli;
    @XmlAttribute(name = "action")
    protected String action;

    /**
     * Gets the value of the numberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberType() {
        return numberType;
    }

    /**
     * Sets the value of the numberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberType(String value) {
        this.numberType = value;
    }

    /**
     * Gets the value of the lowNumberCli property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowNumberCli() {
        return lowNumberCli;
    }

    /**
     * Sets the value of the lowNumberCli property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowNumberCli(String value) {
        this.lowNumberCli = value;
    }

    /**
     * Gets the value of the highNumberCli property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighNumberCli() {
        return highNumberCli;
    }

    /**
     * Sets the value of the highNumberCli property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighNumberCli(String value) {
        this.highNumberCli = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

}
