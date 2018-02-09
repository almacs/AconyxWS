
package com.agnity.ngin.sms.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUnPublishedUowListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUnPublishedUowListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSResponse" type="{http://common.webservice.sms.ngin.agnity.com/}wsResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUnPublishedUowListResponse", propOrder = {
    "wsResponse"
})
public class GetUnPublishedUowListResponse {

    @XmlElement(name = "WSResponse")
    protected WsResponse wsResponse;

    /**
     * Gets the value of the wsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link WsResponse }
     *     
     */
    public WsResponse getWSResponse() {
        return wsResponse;
    }

    /**
     * Sets the value of the wsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsResponse }
     *     
     */
    public void setWSResponse(WsResponse value) {
        this.wsResponse = value;
    }

}
