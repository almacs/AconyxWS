
package com.agnity.ngin.sms.webservice.vpn;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pbxPnInfoDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pbxPnInfoDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnterpriseAccountNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UowId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PbxPnInfoList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PbxPnInfo" type="{http://vpn.webservice.sms.ngin.agnity.com/}pbxPnInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pbxPnInfoDetails", propOrder = {
    "enterpriseAccountNo",
    "uowId",
    "pbxPnInfoList"
})
public class PbxPnInfoDetails {

    @XmlElement(name = "EnterpriseAccountNo")
    protected Long enterpriseAccountNo;
    @XmlElement(name = "UowId")
    protected Long uowId;
    @XmlElement(name = "PbxPnInfoList")
    protected PbxPnInfoDetails.PbxPnInfoList pbxPnInfoList;

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

    /**
     * Gets the value of the pbxPnInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link PbxPnInfoDetails.PbxPnInfoList }
     *     
     */
    public PbxPnInfoDetails.PbxPnInfoList getPbxPnInfoList() {
        return pbxPnInfoList;
    }

    /**
     * Sets the value of the pbxPnInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PbxPnInfoDetails.PbxPnInfoList }
     *     
     */
    public void setPbxPnInfoList(PbxPnInfoDetails.PbxPnInfoList value) {
        this.pbxPnInfoList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PbxPnInfo" type="{http://vpn.webservice.sms.ngin.agnity.com/}pbxPnInfo" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pbxPnInfo"
    })
    public static class PbxPnInfoList {

        @XmlElement(name = "PbxPnInfo")
        protected List<PbxPnInfo> pbxPnInfo;

        /**
         * Gets the value of the pbxPnInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pbxPnInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPbxPnInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PbxPnInfo }
         * 
         * 
         */
        public List<PbxPnInfo> getPbxPnInfo() {
            if (pbxPnInfo == null) {
                pbxPnInfo = new ArrayList<PbxPnInfo>();
            }
            return this.pbxPnInfo;
        }

    }

}
