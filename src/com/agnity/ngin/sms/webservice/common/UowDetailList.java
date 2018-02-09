
package com.agnity.ngin.sms.webservice.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uowDetailList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uowDetailList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://common.webservice.sms.ngin.agnity.com/}wsGenericObject">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UowId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GCClusterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UOWDetail" type="{http://common.webservice.sms.ngin.agnity.com/}uowDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uowDetailList", propOrder = {
    "accountNumber",
    "uowId",
    "gcClusterId",
    "uowDetail"
})
public class UowDetailList
    extends WsGenericObject
{

    @XmlElement(name = "AccountNumber")
    protected Long accountNumber;
    @XmlElement(name = "UowId")
    protected Long uowId;
    @XmlElement(name = "GCClusterId")
    protected String gcClusterId;
    @XmlElement(name = "UOWDetail")
    protected List<UowDetail> uowDetail;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountNumber(Long value) {
        this.accountNumber = value;
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
     * Gets the value of the gcClusterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGCClusterId() {
        return gcClusterId;
    }

    /**
     * Sets the value of the gcClusterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGCClusterId(String value) {
        this.gcClusterId = value;
    }

    /**
     * Gets the value of the uowDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uowDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUOWDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UowDetail }
     * 
     * 
     */
    public List<UowDetail> getUOWDetail() {
        if (uowDetail == null) {
            uowDetail = new ArrayList<UowDetail>();
        }
        return this.uowDetail;
    }

}
