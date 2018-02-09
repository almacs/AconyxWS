
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for superRoutePlanGroupAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="superRoutePlanGroupAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuperRouteGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "superRoutePlanGroupAction", propOrder = {
    "superRouteGroupName",
    "activateDate"
})
public class SuperRoutePlanGroupAction {

    @XmlElement(name = "SuperRouteGroupName")
    protected String superRouteGroupName;
    @XmlElement(name = "ActivateDate")
    protected String activateDate;
    @XmlAttribute(name = "action")
    protected String action;

    /**
     * Gets the value of the superRouteGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperRouteGroupName() {
        return superRouteGroupName;
    }

    /**
     * Sets the value of the superRouteGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperRouteGroupName(String value) {
        this.superRouteGroupName = value;
    }

    /**
     * Gets the value of the activateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivateDate() {
        return activateDate;
    }

    /**
     * Sets the value of the activateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivateDate(String value) {
        this.activateDate = value;
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
