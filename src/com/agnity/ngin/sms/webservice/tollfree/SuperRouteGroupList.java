
package com.agnity.ngin.sms.webservice.tollfree;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for superRouteGroupList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="superRouteGroupList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuperRouteGroup" type="{http://tollfree.webservice.sms.ngin.agnity.com/}srPlanGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "superRouteGroupList", propOrder = {
    "superRouteGroup"
})
public class SuperRouteGroupList {

    @XmlElement(name = "SuperRouteGroup")
    protected List<SrPlanGroup> superRouteGroup;

    /**
     * Gets the value of the superRouteGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the superRouteGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuperRouteGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SrPlanGroup }
     * 
     * 
     */
    public List<SrPlanGroup> getSuperRouteGroup() {
        if (superRouteGroup == null) {
            superRouteGroup = new ArrayList<SrPlanGroup>();
        }
        return this.superRouteGroup;
    }

}
