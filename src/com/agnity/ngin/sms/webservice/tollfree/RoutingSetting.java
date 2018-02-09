
package com.agnity.ngin.sms.webservice.tollfree;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routingSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routingSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryTerminateRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternateTerminateRouteList" type="{http://tollfree.webservice.sms.ngin.agnity.com/}alternateTerminateRouteList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SuperRouteGroupList" type="{http://tollfree.webservice.sms.ngin.agnity.com/}superRouteGroupList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmergencyRoutePlan" type="{http://tollfree.webservice.sms.ngin.agnity.com/}emergencyRoutePlan" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BlockNumPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routingSetting", propOrder = {
    "primaryTerminateRoute",
    "alternateTerminateRouteList",
    "superRouteGroupList",
    "emergencyRoutePlan",
    "blockNumPattern"
})
public class RoutingSetting {

    @XmlElement(name = "PrimaryTerminateRoute")
    protected String primaryTerminateRoute;
    @XmlElement(name = "AlternateTerminateRouteList")
    protected List<AlternateTerminateRouteList> alternateTerminateRouteList;
    @XmlElement(name = "SuperRouteGroupList")
    protected List<SuperRouteGroupList> superRouteGroupList;
    @XmlElement(name = "EmergencyRoutePlan")
    protected List<EmergencyRoutePlan> emergencyRoutePlan;
    @XmlElement(name = "BlockNumPattern")
    protected String blockNumPattern;

    /**
     * Gets the value of the primaryTerminateRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryTerminateRoute() {
        return primaryTerminateRoute;
    }

    /**
     * Sets the value of the primaryTerminateRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryTerminateRoute(String value) {
        this.primaryTerminateRoute = value;
    }

    /**
     * Gets the value of the alternateTerminateRouteList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateTerminateRouteList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateTerminateRouteList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternateTerminateRouteList }
     * 
     * 
     */
    public List<AlternateTerminateRouteList> getAlternateTerminateRouteList() {
        if (alternateTerminateRouteList == null) {
            alternateTerminateRouteList = new ArrayList<AlternateTerminateRouteList>();
        }
        return this.alternateTerminateRouteList;
    }

    /**
     * Gets the value of the superRouteGroupList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the superRouteGroupList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuperRouteGroupList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuperRouteGroupList }
     * 
     * 
     */
    public List<SuperRouteGroupList> getSuperRouteGroupList() {
        if (superRouteGroupList == null) {
            superRouteGroupList = new ArrayList<SuperRouteGroupList>();
        }
        return this.superRouteGroupList;
    }

    /**
     * Gets the value of the emergencyRoutePlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emergencyRoutePlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmergencyRoutePlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmergencyRoutePlan }
     * 
     * 
     */
    public List<EmergencyRoutePlan> getEmergencyRoutePlan() {
        if (emergencyRoutePlan == null) {
            emergencyRoutePlan = new ArrayList<EmergencyRoutePlan>();
        }
        return this.emergencyRoutePlan;
    }

    /**
     * Gets the value of the blockNumPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockNumPattern() {
        return blockNumPattern;
    }

    /**
     * Sets the value of the blockNumPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockNumPattern(String value) {
        this.blockNumPattern = value;
    }

}
