
package com.agnity.ngin.sms.webservice.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsGenericObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsGenericObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsGenericObject")
@XmlSeeAlso({
    OrganizationAccountList.class,
    UnitOfWork.class,
    UowJob.class,
    Uow.class,
    AuthInfo.class,
    Subscription.class,
    UowDetailList.class,
    UowStatus.class,
    AccountInfo.class,
    UnPublishedUowList.class,
    Address.class,
    UowDetail.class,
    Organization.class,
    Account.class
})
public abstract class WsGenericObject {


}
