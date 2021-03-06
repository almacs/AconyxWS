
package com.agnity.ngin.sms.webservice.tollfree;

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
    NumberProfileDetail.class,
    SuperRoutePlanGroup.class,
    SuperRoutePlanGroupDetail.class,
    TerminatingNumber.class,
    NumberProfileList.class,
    NumberProfile.class,
    SuperRoutePlanDelete.class,
    TollFreeInfo.class,
    SuperRoutePlanDetail.class,
    SuperRoutePlanList.class,
    CustomProfileList.class,
    TfNumberDetail.class,
    ServicePlan.class,
    TollFreeSetting.class,
    SuperRoutePlanGroupList.class,
    TfNumberList.class,
    ServicePlanSS7 .class,
    TerminatingNumberList.class,
    NumberProfileAttribute.class,
    TollFreeNumber.class,
    CustomProfile.class,
    TollFreeRouting.class,
    TfNumberListAttribute.class,
    TollFreeSettingSS7 .class,
    ActivateSuperRoutePlanInGroup.class
})
public abstract class WsGenericObject {


}
