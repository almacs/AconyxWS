
package com.agnity.ngin.sms.webservice.tollfree;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for advance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="advance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuperRoutePlanGroup" type="{http://tollfree.webservice.sms.ngin.agnity.com/}superRoutePlanGroupAction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmergencyPlanGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BlockedPatterns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BlockedPatternsPatternsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "advance", propOrder = {
    "superRoutePlanGroup",
    "emergencyPlanGroup",
    "blockedPatterns",
    "blockedPatternsPatternsType"
})
public class Advance {

    @XmlElement(name = "SuperRoutePlanGroup")
    protected List<SuperRoutePlanGroupAction> superRoutePlanGroup;
    @XmlElement(name = "EmergencyPlanGroup")
    protected String emergencyPlanGroup;
    @XmlElement(name = "BlockedPatterns")
    protected String blockedPatterns;
    @XmlElement(name = "BlockedPatternsPatternsType")
    protected String blockedPatternsPatternsType;

    /**
     * Gets the value of the superRoutePlanGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the superRoutePlanGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuperRoutePlanGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuperRoutePlanGroupAction }
     * 
     * 
     */
    public List<SuperRoutePlanGroupAction> getSuperRoutePlanGroup() {
        if (superRoutePlanGroup == null) {
            superRoutePlanGroup = new ArrayList<SuperRoutePlanGroupAction>();
        }
        return this.superRoutePlanGroup;
    }

    /**
     * Gets the value of the emergencyPlanGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyPlanGroup() {
        return emergencyPlanGroup;
    }

    /**
     * Sets the value of the emergencyPlanGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyPlanGroup(String value) {
        this.emergencyPlanGroup = value;
    }

    /**
     * Gets the value of the blockedPatterns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockedPatterns() {
        return blockedPatterns;
    }

    /**
     * Sets the value of the blockedPatterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockedPatterns(String value) {
        this.blockedPatterns = value;
    }

    /**
     * Gets the value of the blockedPatternsPatternsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockedPatternsPatternsType() {
        return blockedPatternsPatternsType;
    }

    /**
     * Sets the value of the blockedPatternsPatternsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockedPatternsPatternsType(String value) {
        this.blockedPatternsPatternsType = value;
    }

}
