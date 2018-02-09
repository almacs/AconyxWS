
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for additionalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="additionalInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DigitPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FixedLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DigitFixedLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionalInfo", propOrder = {
    "digitPattern",
    "validationType",
    "fixedLength",
    "digitFixedLength"
})
public class AdditionalInfo {

    @XmlElement(name = "DigitPattern")
    protected String digitPattern;
    @XmlElement(name = "ValidationType")
    protected String validationType;
    @XmlElement(name = "FixedLength")
    protected Integer fixedLength;
    @XmlElement(name = "DigitFixedLength")
    protected String digitFixedLength;

    /**
     * Gets the value of the digitPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitPattern() {
        return digitPattern;
    }

    /**
     * Sets the value of the digitPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitPattern(String value) {
        this.digitPattern = value;
    }

    /**
     * Gets the value of the validationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationType() {
        return validationType;
    }

    /**
     * Sets the value of the validationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationType(String value) {
        this.validationType = value;
    }

    /**
     * Gets the value of the fixedLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFixedLength() {
        return fixedLength;
    }

    /**
     * Sets the value of the fixedLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFixedLength(Integer value) {
        this.fixedLength = value;
    }

    /**
     * Gets the value of the digitFixedLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitFixedLength() {
        return digitFixedLength;
    }

    /**
     * Sets the value of the digitFixedLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitFixedLength(String value) {
        this.digitFixedLength = value;
    }

}
