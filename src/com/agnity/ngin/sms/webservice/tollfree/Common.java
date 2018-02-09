
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for common complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="common">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlayAnn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RePlayAnn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoInputAnn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlayAnnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "common", propOrder = {
    "playAnn",
    "rePlayAnn",
    "noInputAnn",
    "playAnnType"
})
public class Common {

    @XmlElement(name = "PlayAnn")
    protected String playAnn;
    @XmlElement(name = "RePlayAnn")
    protected String rePlayAnn;
    @XmlElement(name = "NoInputAnn")
    protected String noInputAnn;
    @XmlElement(name = "PlayAnnType")
    protected String playAnnType;

    /**
     * Gets the value of the playAnn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayAnn() {
        return playAnn;
    }

    /**
     * Sets the value of the playAnn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayAnn(String value) {
        this.playAnn = value;
    }

    /**
     * Gets the value of the rePlayAnn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRePlayAnn() {
        return rePlayAnn;
    }

    /**
     * Sets the value of the rePlayAnn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRePlayAnn(String value) {
        this.rePlayAnn = value;
    }

    /**
     * Gets the value of the noInputAnn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoInputAnn() {
        return noInputAnn;
    }

    /**
     * Sets the value of the noInputAnn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoInputAnn(String value) {
        this.noInputAnn = value;
    }

    /**
     * Gets the value of the playAnnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayAnnType() {
        return playAnnType;
    }

    /**
     * Sets the value of the playAnnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayAnnType(String value) {
        this.playAnnType = value;
    }

}
