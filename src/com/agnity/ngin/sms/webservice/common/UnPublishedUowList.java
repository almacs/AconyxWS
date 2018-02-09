
package com.agnity.ngin.sms.webservice.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unPublishedUowList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unPublishedUowList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://common.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="NonPublishedUowList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Uow" type="{http://common.webservice.sms.ngin.agnity.com/}uow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UowId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LoginUserAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unPublishedUowList", propOrder = {
    "nonPublishedUowList",
    "uowId",
    "loginUserAccountNo"
})
public class UnPublishedUowList
    extends WsGenericObject
{

    @XmlElement(name = "NonPublishedUowList")
    protected UnPublishedUowList.NonPublishedUowList nonPublishedUowList;
    @XmlElement(name = "UowId")
    protected Long uowId;
    @XmlElement(name = "LoginUserAccountNo")
    protected String loginUserAccountNo;

    /**
     * Gets the value of the nonPublishedUowList property.
     * 
     * @return
     *     possible object is
     *     {@link UnPublishedUowList.NonPublishedUowList }
     *     
     */
    public UnPublishedUowList.NonPublishedUowList getNonPublishedUowList() {
        return nonPublishedUowList;
    }

    /**
     * Sets the value of the nonPublishedUowList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnPublishedUowList.NonPublishedUowList }
     *     
     */
    public void setNonPublishedUowList(UnPublishedUowList.NonPublishedUowList value) {
        this.nonPublishedUowList = value;
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
     * Gets the value of the loginUserAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginUserAccountNo() {
        return loginUserAccountNo;
    }

    /**
     * Sets the value of the loginUserAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginUserAccountNo(String value) {
        this.loginUserAccountNo = value;
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
     *         &lt;element name="Uow" type="{http://common.webservice.sms.ngin.agnity.com/}uow" maxOccurs="unbounded" minOccurs="0"/>
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
        "uow"
    })
    public static class NonPublishedUowList {

        @XmlElement(name = "Uow")
        protected List<Uow> uow;

        /**
         * Gets the value of the uow property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the uow property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Uow }
         * 
         * 
         */
        public List<Uow> getUow() {
            if (uow == null) {
                uow = new ArrayList<Uow>();
            }
            return this.uow;
        }

    }

}
