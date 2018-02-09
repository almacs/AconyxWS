
package com.agnity.ngin.sms.webservice.tollfree;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageReferralSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="messageReferralSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlayDisconnectAnnouncementUntil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlayDisconnectAnnouncement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForwardingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageReferralSettings", propOrder = {
    "playDisconnectAnnouncementUntil",
    "playDisconnectAnnouncement",
    "forwardingNumber"
})
public class MessageReferralSettings {

    @XmlElement(name = "PlayDisconnectAnnouncementUntil")
    protected String playDisconnectAnnouncementUntil;
    @XmlElement(name = "PlayDisconnectAnnouncement")
    protected String playDisconnectAnnouncement;
    @XmlElement(name = "ForwardingNumber")
    protected String forwardingNumber;

    /**
     * Gets the value of the playDisconnectAnnouncementUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayDisconnectAnnouncementUntil() {
        return playDisconnectAnnouncementUntil;
    }

    /**
     * Sets the value of the playDisconnectAnnouncementUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayDisconnectAnnouncementUntil(String value) {
        this.playDisconnectAnnouncementUntil = value;
    }

    /**
     * Gets the value of the playDisconnectAnnouncement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayDisconnectAnnouncement() {
        return playDisconnectAnnouncement;
    }

    /**
     * Sets the value of the playDisconnectAnnouncement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayDisconnectAnnouncement(String value) {
        this.playDisconnectAnnouncement = value;
    }

    /**
     * Gets the value of the forwardingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwardingNumber() {
        return forwardingNumber;
    }

    /**
     * Sets the value of the forwardingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardingNumber(String value) {
        this.forwardingNumber = value;
    }

}
