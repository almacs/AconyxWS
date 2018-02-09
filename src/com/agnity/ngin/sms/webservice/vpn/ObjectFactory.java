
package com.agnity.ngin.sms.webservice.vpn;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.agnity.ngin.sms.webservice.vpn package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AssociateCugResponse_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "associateCugResponse");
    private final static QName _ConfigureServicePlan_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "configureServicePlan");
    private final static QName _CreatePbxPhoneResponse_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "createPbxPhoneResponse");
    private final static QName _CreateAccountDefaultsResponse_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "createAccountDefaultsResponse");
    private final static QName _AssociateCug_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "associateCug");
    private final static QName _CreatePbxPhone_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "createPbxPhone");
    private final static QName _CreateAccountDefaults_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "createAccountDefaults");
    private final static QName _CreateCugResponse_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "createCugResponse");
    private final static QName _ConfigureServicePlanResponse_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "configureServicePlanResponse");
    private final static QName _DeleteCugResponse_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "deleteCugResponse");
    private final static QName _DissociateCug_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "dissociateCug");
    private final static QName _DeleteCug_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "deleteCug");
    private final static QName _DeletePbxPhone_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "deletePbxPhone");
    private final static QName _DissociateCugResponse_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "dissociateCugResponse");
    private final static QName _UpdatePbxPhoneResponse_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "updatePbxPhoneResponse");
    private final static QName _Response_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "Response");
    private final static QName _CreateCug_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "createCug");
    private final static QName _DeletePbxPhoneResponse_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "deletePbxPhoneResponse");
    private final static QName _UpdatePbxPhone_QNAME = new QName("http://vpn.webservice.sms.ngin.agnity.com/", "updatePbxPhone");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.agnity.ngin.sms.webservice.vpn
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PbxPnInfoDetails }
     * 
     */
    public PbxPnInfoDetails createPbxPnInfoDetails() {
        return new PbxPnInfoDetails();
    }

    /**
     * Create an instance of {@link PbxPnInfo }
     * 
     */
    public PbxPnInfo createPbxPnInfo() {
        return new PbxPnInfo();
    }

    /**
     * Create an instance of {@link ClosedGroupAssociation }
     * 
     */
    public ClosedGroupAssociation createClosedGroupAssociation() {
        return new ClosedGroupAssociation();
    }

    /**
     * Create an instance of {@link WsResponse }
     * 
     */
    public WsResponse createWsResponse() {
        return new WsResponse();
    }

    /**
     * Create an instance of {@link CreateCugResponse }
     * 
     */
    public CreateCugResponse createCreateCugResponse() {
        return new CreateCugResponse();
    }

    /**
     * Create an instance of {@link ConfigureServicePlanResponse }
     * 
     */
    public ConfigureServicePlanResponse createConfigureServicePlanResponse() {
        return new ConfigureServicePlanResponse();
    }

    /**
     * Create an instance of {@link CreateAccountDefaults }
     * 
     */
    public CreateAccountDefaults createCreateAccountDefaults() {
        return new CreateAccountDefaults();
    }

    /**
     * Create an instance of {@link CreatePbxPhone }
     * 
     */
    public CreatePbxPhone createCreatePbxPhone() {
        return new CreatePbxPhone();
    }

    /**
     * Create an instance of {@link AssociateCug }
     * 
     */
    public AssociateCug createAssociateCug() {
        return new AssociateCug();
    }

    /**
     * Create an instance of {@link CreatePbxPhoneResponse }
     * 
     */
    public CreatePbxPhoneResponse createCreatePbxPhoneResponse() {
        return new CreatePbxPhoneResponse();
    }

    /**
     * Create an instance of {@link CreateAccountDefaultsResponse }
     * 
     */
    public CreateAccountDefaultsResponse createCreateAccountDefaultsResponse() {
        return new CreateAccountDefaultsResponse();
    }

    /**
     * Create an instance of {@link ConfigureServicePlan }
     * 
     */
    public ConfigureServicePlan createConfigureServicePlan() {
        return new ConfigureServicePlan();
    }

    /**
     * Create an instance of {@link AssociateCugResponse }
     * 
     */
    public AssociateCugResponse createAssociateCugResponse() {
        return new AssociateCugResponse();
    }

    /**
     * Create an instance of {@link CreateCug }
     * 
     */
    public CreateCug createCreateCug() {
        return new CreateCug();
    }

    /**
     * Create an instance of {@link DeletePbxPhoneResponse }
     * 
     */
    public DeletePbxPhoneResponse createDeletePbxPhoneResponse() {
        return new DeletePbxPhoneResponse();
    }

    /**
     * Create an instance of {@link UpdatePbxPhone }
     * 
     */
    public UpdatePbxPhone createUpdatePbxPhone() {
        return new UpdatePbxPhone();
    }

    /**
     * Create an instance of {@link DissociateCugResponse }
     * 
     */
    public DissociateCugResponse createDissociateCugResponse() {
        return new DissociateCugResponse();
    }

    /**
     * Create an instance of {@link UpdatePbxPhoneResponse }
     * 
     */
    public UpdatePbxPhoneResponse createUpdatePbxPhoneResponse() {
        return new UpdatePbxPhoneResponse();
    }

    /**
     * Create an instance of {@link DeleteCug }
     * 
     */
    public DeleteCug createDeleteCug() {
        return new DeleteCug();
    }

    /**
     * Create an instance of {@link DeletePbxPhone }
     * 
     */
    public DeletePbxPhone createDeletePbxPhone() {
        return new DeletePbxPhone();
    }

    /**
     * Create an instance of {@link DeleteCugResponse }
     * 
     */
    public DeleteCugResponse createDeleteCugResponse() {
        return new DeleteCugResponse();
    }

    /**
     * Create an instance of {@link DissociateCug }
     * 
     */
    public DissociateCug createDissociateCug() {
        return new DissociateCug();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link EnterpriseDetail }
     * 
     */
    public EnterpriseDetail createEnterpriseDetail() {
        return new EnterpriseDetail();
    }

    /**
     * Create an instance of {@link ArrayList }
     * 
     */
    public ArrayList createArrayList() {
        return new ArrayList();
    }

    /**
     * Create an instance of {@link Failed }
     * 
     */
    public Failed createFailed() {
        return new Failed();
    }

    /**
     * Create an instance of {@link ClosedGroup }
     * 
     */
    public ClosedGroup createClosedGroup() {
        return new ClosedGroup();
    }

    /**
     * Create an instance of {@link CliDetails }
     * 
     */
    public CliDetails createCliDetails() {
        return new CliDetails();
    }

    /**
     * Create an instance of {@link ServicePlan }
     * 
     */
    public ServicePlan createServicePlan() {
        return new ServicePlan();
    }

    /**
     * Create an instance of {@link Success }
     * 
     */
    public Success createSuccess() {
        return new Success();
    }

    /**
     * Create an instance of {@link PbxPnInfoDetails.PbxPnInfoList }
     * 
     */
    public PbxPnInfoDetails.PbxPnInfoList createPbxPnInfoDetailsPbxPnInfoList() {
        return new PbxPnInfoDetails.PbxPnInfoList();
    }

    /**
     * Create an instance of {@link PbxPnInfo.IncomingCliList }
     * 
     */
    public PbxPnInfo.IncomingCliList createPbxPnInfoIncomingCliList() {
        return new PbxPnInfo.IncomingCliList();
    }

    /**
     * Create an instance of {@link PbxPnInfo.OutgoingCliList }
     * 
     */
    public PbxPnInfo.OutgoingCliList createPbxPnInfoOutgoingCliList() {
        return new PbxPnInfo.OutgoingCliList();
    }

    /**
     * Create an instance of {@link ClosedGroupAssociation.PrivateNumberList }
     * 
     */
    public ClosedGroupAssociation.PrivateNumberList createClosedGroupAssociationPrivateNumberList() {
        return new ClosedGroupAssociation.PrivateNumberList();
    }

    /**
     * Create an instance of {@link WsResponse.PartialFailure }
     * 
     */
    public WsResponse.PartialFailure createWsResponsePartialFailure() {
        return new WsResponse.PartialFailure();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateCugResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "associateCugResponse")
    public JAXBElement<AssociateCugResponse> createAssociateCugResponse(AssociateCugResponse value) {
        return new JAXBElement<AssociateCugResponse>(_AssociateCugResponse_QNAME, AssociateCugResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigureServicePlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "configureServicePlan")
    public JAXBElement<ConfigureServicePlan> createConfigureServicePlan(ConfigureServicePlan value) {
        return new JAXBElement<ConfigureServicePlan>(_ConfigureServicePlan_QNAME, ConfigureServicePlan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePbxPhoneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "createPbxPhoneResponse")
    public JAXBElement<CreatePbxPhoneResponse> createCreatePbxPhoneResponse(CreatePbxPhoneResponse value) {
        return new JAXBElement<CreatePbxPhoneResponse>(_CreatePbxPhoneResponse_QNAME, CreatePbxPhoneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountDefaultsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "createAccountDefaultsResponse")
    public JAXBElement<CreateAccountDefaultsResponse> createCreateAccountDefaultsResponse(CreateAccountDefaultsResponse value) {
        return new JAXBElement<CreateAccountDefaultsResponse>(_CreateAccountDefaultsResponse_QNAME, CreateAccountDefaultsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateCug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "associateCug")
    public JAXBElement<AssociateCug> createAssociateCug(AssociateCug value) {
        return new JAXBElement<AssociateCug>(_AssociateCug_QNAME, AssociateCug.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePbxPhone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "createPbxPhone")
    public JAXBElement<CreatePbxPhone> createCreatePbxPhone(CreatePbxPhone value) {
        return new JAXBElement<CreatePbxPhone>(_CreatePbxPhone_QNAME, CreatePbxPhone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountDefaults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "createAccountDefaults")
    public JAXBElement<CreateAccountDefaults> createCreateAccountDefaults(CreateAccountDefaults value) {
        return new JAXBElement<CreateAccountDefaults>(_CreateAccountDefaults_QNAME, CreateAccountDefaults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCugResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "createCugResponse")
    public JAXBElement<CreateCugResponse> createCreateCugResponse(CreateCugResponse value) {
        return new JAXBElement<CreateCugResponse>(_CreateCugResponse_QNAME, CreateCugResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigureServicePlanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "configureServicePlanResponse")
    public JAXBElement<ConfigureServicePlanResponse> createConfigureServicePlanResponse(ConfigureServicePlanResponse value) {
        return new JAXBElement<ConfigureServicePlanResponse>(_ConfigureServicePlanResponse_QNAME, ConfigureServicePlanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCugResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "deleteCugResponse")
    public JAXBElement<DeleteCugResponse> createDeleteCugResponse(DeleteCugResponse value) {
        return new JAXBElement<DeleteCugResponse>(_DeleteCugResponse_QNAME, DeleteCugResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DissociateCug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "dissociateCug")
    public JAXBElement<DissociateCug> createDissociateCug(DissociateCug value) {
        return new JAXBElement<DissociateCug>(_DissociateCug_QNAME, DissociateCug.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "deleteCug")
    public JAXBElement<DeleteCug> createDeleteCug(DeleteCug value) {
        return new JAXBElement<DeleteCug>(_DeleteCug_QNAME, DeleteCug.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePbxPhone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "deletePbxPhone")
    public JAXBElement<DeletePbxPhone> createDeletePbxPhone(DeletePbxPhone value) {
        return new JAXBElement<DeletePbxPhone>(_DeletePbxPhone_QNAME, DeletePbxPhone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DissociateCugResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "dissociateCugResponse")
    public JAXBElement<DissociateCugResponse> createDissociateCugResponse(DissociateCugResponse value) {
        return new JAXBElement<DissociateCugResponse>(_DissociateCugResponse_QNAME, DissociateCugResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePbxPhoneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "updatePbxPhoneResponse")
    public JAXBElement<UpdatePbxPhoneResponse> createUpdatePbxPhoneResponse(UpdatePbxPhoneResponse value) {
        return new JAXBElement<UpdatePbxPhoneResponse>(_UpdatePbxPhoneResponse_QNAME, UpdatePbxPhoneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsGenericObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "Response")
    public JAXBElement<WsGenericObject> createResponse(WsGenericObject value) {
        return new JAXBElement<WsGenericObject>(_Response_QNAME, WsGenericObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "createCug")
    public JAXBElement<CreateCug> createCreateCug(CreateCug value) {
        return new JAXBElement<CreateCug>(_CreateCug_QNAME, CreateCug.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePbxPhoneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "deletePbxPhoneResponse")
    public JAXBElement<DeletePbxPhoneResponse> createDeletePbxPhoneResponse(DeletePbxPhoneResponse value) {
        return new JAXBElement<DeletePbxPhoneResponse>(_DeletePbxPhoneResponse_QNAME, DeletePbxPhoneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePbxPhone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vpn.webservice.sms.ngin.agnity.com/", name = "updatePbxPhone")
    public JAXBElement<UpdatePbxPhone> createUpdatePbxPhone(UpdatePbxPhone value) {
        return new JAXBElement<UpdatePbxPhone>(_UpdatePbxPhone_QNAME, UpdatePbxPhone.class, null, value);
    }

}
