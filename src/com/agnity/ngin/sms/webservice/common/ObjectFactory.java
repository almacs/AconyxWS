
package com.agnity.ngin.sms.webservice.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.agnity.ngin.sms.webservice.common package. 
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

    private final static QName _SubscribeService_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "subscribeService");
    private final static QName _GetPublishedUOWStatusResponse_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "getPublishedUOWStatusResponse");
    private final static QName _ReleaseUOWFromSession_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "releaseUOWFromSession");
    private final static QName _DeleteOrganizationAccountResponse_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "deleteOrganizationAccountResponse");
    private final static QName _GetOrganizationListResponse_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "getOrganizationListResponse");
    private final static QName _GetUnPublishedUowListResponse_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "getUnPublishedUowListResponse");
    private final static QName _CreateUnitOfWork_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "createUnitOfWork");
    private final static QName _CreateOrganizationAccountResponse_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "createOrganizationAccountResponse");
    private final static QName _PublishUnitOfWorkResponse_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "publishUnitOfWorkResponse");
    private final static QName _GetPublishedUOWStatus_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "getPublishedUOWStatus");
    private final static QName _CreateUnitOfWorkResponse_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "createUnitOfWorkResponse");
    private final static QName _GetOrganizationAccount_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "getOrganizationAccount");
    private final static QName _PublishUnitOfWork_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "publishUnitOfWork");
    private final static QName _ReleaseUOWFromSessionResponse_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "releaseUOWFromSessionResponse");
    private final static QName _AuthenticateUserResponse_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "authenticateUserResponse");
    private final static QName _UpdateOrganizationAccount_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "updateOrganizationAccount");
    private final static QName _LogoutUserResponse_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "logoutUserResponse");
    private final static QName _SelectUnitOfWorkResponse_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "selectUnitOfWorkResponse");
    private final static QName _SubscribeServiceResponse_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "subscribeServiceResponse");
    private final static QName _DeleteUnitOfWork_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "deleteUnitOfWork");
    private final static QName _DeleteUnitOfWorkResponse_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "deleteUnitOfWorkResponse");
    private final static QName _GetOrganizationAccountResponse_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "getOrganizationAccountResponse");
    private final static QName _GetUOWStatusOnGCResponse_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "getUOWStatusOnGCResponse");
    private final static QName _GetUnPublishedUowList_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "getUnPublishedUowList");
    private final static QName _DeleteOrganizationAccount_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "deleteOrganizationAccount");
    private final static QName _CreateOrganizationAccount_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "createOrganizationAccount");
    private final static QName _GetOrganizationList_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "getOrganizationList");
    private final static QName _AuthenticateUser_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "authenticateUser");
    private final static QName _SelectUnitOfWork_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "selectUnitOfWork");
    private final static QName _LogoutUser_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "logoutUser");
    private final static QName _UpdateOrganizationAccountResponse_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "updateOrganizationAccountResponse");
    private final static QName _Response_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "Response");
    private final static QName _GetUOWStatusOnGC_QNAME = new QName("http://common.webservice.sms.ngin.agnity.com/", "getUOWStatusOnGC");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.agnity.ngin.sms.webservice.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UnPublishedUowList }
     * 
     */
    public UnPublishedUowList createUnPublishedUowList() {
        return new UnPublishedUowList();
    }

    /**
     * Create an instance of {@link AccountInfo }
     * 
     */
    public AccountInfo createAccountInfo() {
        return new AccountInfo();
    }

    /**
     * Create an instance of {@link WsResponse }
     * 
     */
    public WsResponse createWsResponse() {
        return new WsResponse();
    }

    /**
     * Create an instance of {@link OrganizationAccountList }
     * 
     */
    public OrganizationAccountList createOrganizationAccountList() {
        return new OrganizationAccountList();
    }

    /**
     * Create an instance of {@link CreateOrganizationAccountResponse }
     * 
     */
    public CreateOrganizationAccountResponse createCreateOrganizationAccountResponse() {
        return new CreateOrganizationAccountResponse();
    }

    /**
     * Create an instance of {@link CreateUnitOfWork }
     * 
     */
    public CreateUnitOfWork createCreateUnitOfWork() {
        return new CreateUnitOfWork();
    }

    /**
     * Create an instance of {@link DeleteOrganizationAccountResponse }
     * 
     */
    public DeleteOrganizationAccountResponse createDeleteOrganizationAccountResponse() {
        return new DeleteOrganizationAccountResponse();
    }

    /**
     * Create an instance of {@link GetOrganizationListResponse }
     * 
     */
    public GetOrganizationListResponse createGetOrganizationListResponse() {
        return new GetOrganizationListResponse();
    }

    /**
     * Create an instance of {@link GetUnPublishedUowListResponse }
     * 
     */
    public GetUnPublishedUowListResponse createGetUnPublishedUowListResponse() {
        return new GetUnPublishedUowListResponse();
    }

    /**
     * Create an instance of {@link ReleaseUOWFromSession }
     * 
     */
    public ReleaseUOWFromSession createReleaseUOWFromSession() {
        return new ReleaseUOWFromSession();
    }

    /**
     * Create an instance of {@link GetPublishedUOWStatusResponse }
     * 
     */
    public GetPublishedUOWStatusResponse createGetPublishedUOWStatusResponse() {
        return new GetPublishedUOWStatusResponse();
    }

    /**
     * Create an instance of {@link SubscribeService }
     * 
     */
    public SubscribeService createSubscribeService() {
        return new SubscribeService();
    }

    /**
     * Create an instance of {@link ReleaseUOWFromSessionResponse }
     * 
     */
    public ReleaseUOWFromSessionResponse createReleaseUOWFromSessionResponse() {
        return new ReleaseUOWFromSessionResponse();
    }

    /**
     * Create an instance of {@link PublishUnitOfWork }
     * 
     */
    public PublishUnitOfWork createPublishUnitOfWork() {
        return new PublishUnitOfWork();
    }

    /**
     * Create an instance of {@link GetOrganizationAccount }
     * 
     */
    public GetOrganizationAccount createGetOrganizationAccount() {
        return new GetOrganizationAccount();
    }

    /**
     * Create an instance of {@link CreateUnitOfWorkResponse }
     * 
     */
    public CreateUnitOfWorkResponse createCreateUnitOfWorkResponse() {
        return new CreateUnitOfWorkResponse();
    }

    /**
     * Create an instance of {@link GetPublishedUOWStatus }
     * 
     */
    public GetPublishedUOWStatus createGetPublishedUOWStatus() {
        return new GetPublishedUOWStatus();
    }

    /**
     * Create an instance of {@link PublishUnitOfWorkResponse }
     * 
     */
    public PublishUnitOfWorkResponse createPublishUnitOfWorkResponse() {
        return new PublishUnitOfWorkResponse();
    }

    /**
     * Create an instance of {@link DeleteUnitOfWork }
     * 
     */
    public DeleteUnitOfWork createDeleteUnitOfWork() {
        return new DeleteUnitOfWork();
    }

    /**
     * Create an instance of {@link DeleteUnitOfWorkResponse }
     * 
     */
    public DeleteUnitOfWorkResponse createDeleteUnitOfWorkResponse() {
        return new DeleteUnitOfWorkResponse();
    }

    /**
     * Create an instance of {@link SubscribeServiceResponse }
     * 
     */
    public SubscribeServiceResponse createSubscribeServiceResponse() {
        return new SubscribeServiceResponse();
    }

    /**
     * Create an instance of {@link SelectUnitOfWorkResponse }
     * 
     */
    public SelectUnitOfWorkResponse createSelectUnitOfWorkResponse() {
        return new SelectUnitOfWorkResponse();
    }

    /**
     * Create an instance of {@link LogoutUserResponse }
     * 
     */
    public LogoutUserResponse createLogoutUserResponse() {
        return new LogoutUserResponse();
    }

    /**
     * Create an instance of {@link UpdateOrganizationAccount }
     * 
     */
    public UpdateOrganizationAccount createUpdateOrganizationAccount() {
        return new UpdateOrganizationAccount();
    }

    /**
     * Create an instance of {@link AuthenticateUserResponse }
     * 
     */
    public AuthenticateUserResponse createAuthenticateUserResponse() {
        return new AuthenticateUserResponse();
    }

    /**
     * Create an instance of {@link GetUOWStatusOnGC }
     * 
     */
    public GetUOWStatusOnGC createGetUOWStatusOnGC() {
        return new GetUOWStatusOnGC();
    }

    /**
     * Create an instance of {@link LogoutUser }
     * 
     */
    public LogoutUser createLogoutUser() {
        return new LogoutUser();
    }

    /**
     * Create an instance of {@link UpdateOrganizationAccountResponse }
     * 
     */
    public UpdateOrganizationAccountResponse createUpdateOrganizationAccountResponse() {
        return new UpdateOrganizationAccountResponse();
    }

    /**
     * Create an instance of {@link SelectUnitOfWork }
     * 
     */
    public SelectUnitOfWork createSelectUnitOfWork() {
        return new SelectUnitOfWork();
    }

    /**
     * Create an instance of {@link AuthenticateUser }
     * 
     */
    public AuthenticateUser createAuthenticateUser() {
        return new AuthenticateUser();
    }

    /**
     * Create an instance of {@link GetOrganizationList }
     * 
     */
    public GetOrganizationList createGetOrganizationList() {
        return new GetOrganizationList();
    }

    /**
     * Create an instance of {@link CreateOrganizationAccount }
     * 
     */
    public CreateOrganizationAccount createCreateOrganizationAccount() {
        return new CreateOrganizationAccount();
    }

    /**
     * Create an instance of {@link DeleteOrganizationAccount }
     * 
     */
    public DeleteOrganizationAccount createDeleteOrganizationAccount() {
        return new DeleteOrganizationAccount();
    }

    /**
     * Create an instance of {@link GetOrganizationAccountResponse }
     * 
     */
    public GetOrganizationAccountResponse createGetOrganizationAccountResponse() {
        return new GetOrganizationAccountResponse();
    }

    /**
     * Create an instance of {@link GetUOWStatusOnGCResponse }
     * 
     */
    public GetUOWStatusOnGCResponse createGetUOWStatusOnGCResponse() {
        return new GetUOWStatusOnGCResponse();
    }

    /**
     * Create an instance of {@link GetUnPublishedUowList }
     * 
     */
    public GetUnPublishedUowList createGetUnPublishedUowList() {
        return new GetUnPublishedUowList();
    }

    /**
     * Create an instance of {@link UnitOfWork }
     * 
     */
    public UnitOfWork createUnitOfWork() {
        return new UnitOfWork();
    }

    /**
     * Create an instance of {@link ArrayList }
     * 
     */
    public ArrayList createArrayList() {
        return new ArrayList();
    }

    /**
     * Create an instance of {@link UowJob }
     * 
     */
    public UowJob createUowJob() {
        return new UowJob();
    }

    /**
     * Create an instance of {@link Uow }
     * 
     */
    public Uow createUow() {
        return new Uow();
    }

    /**
     * Create an instance of {@link Failed }
     * 
     */
    public Failed createFailed() {
        return new Failed();
    }

    /**
     * Create an instance of {@link AuthInfo }
     * 
     */
    public AuthInfo createAuthInfo() {
        return new AuthInfo();
    }

    /**
     * Create an instance of {@link Success }
     * 
     */
    public Success createSuccess() {
        return new Success();
    }

    /**
     * Create an instance of {@link Subscription }
     * 
     */
    public Subscription createSubscription() {
        return new Subscription();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link UowDetailList }
     * 
     */
    public UowDetailList createUowDetailList() {
        return new UowDetailList();
    }

    /**
     * Create an instance of {@link UowStatus }
     * 
     */
    public UowStatus createUowStatus() {
        return new UowStatus();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link UowDetail }
     * 
     */
    public UowDetail createUowDetail() {
        return new UowDetail();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link UnPublishedUowList.NonPublishedUowList }
     * 
     */
    public UnPublishedUowList.NonPublishedUowList createUnPublishedUowListNonPublishedUowList() {
        return new UnPublishedUowList.NonPublishedUowList();
    }

    /**
     * Create an instance of {@link AccountInfo.AddressList }
     * 
     */
    public AccountInfo.AddressList createAccountInfoAddressList() {
        return new AccountInfo.AddressList();
    }

    /**
     * Create an instance of {@link WsResponse.PartialFailure }
     * 
     */
    public WsResponse.PartialFailure createWsResponsePartialFailure() {
        return new WsResponse.PartialFailure();
    }

    /**
     * Create an instance of {@link OrganizationAccountList.OrganizationAccList }
     * 
     */
    public OrganizationAccountList.OrganizationAccList createOrganizationAccountListOrganizationAccList() {
        return new OrganizationAccountList.OrganizationAccList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribeService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "subscribeService")
    public JAXBElement<SubscribeService> createSubscribeService(SubscribeService value) {
        return new JAXBElement<SubscribeService>(_SubscribeService_QNAME, SubscribeService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublishedUOWStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "getPublishedUOWStatusResponse")
    public JAXBElement<GetPublishedUOWStatusResponse> createGetPublishedUOWStatusResponse(GetPublishedUOWStatusResponse value) {
        return new JAXBElement<GetPublishedUOWStatusResponse>(_GetPublishedUOWStatusResponse_QNAME, GetPublishedUOWStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseUOWFromSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "releaseUOWFromSession")
    public JAXBElement<ReleaseUOWFromSession> createReleaseUOWFromSession(ReleaseUOWFromSession value) {
        return new JAXBElement<ReleaseUOWFromSession>(_ReleaseUOWFromSession_QNAME, ReleaseUOWFromSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrganizationAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "deleteOrganizationAccountResponse")
    public JAXBElement<DeleteOrganizationAccountResponse> createDeleteOrganizationAccountResponse(DeleteOrganizationAccountResponse value) {
        return new JAXBElement<DeleteOrganizationAccountResponse>(_DeleteOrganizationAccountResponse_QNAME, DeleteOrganizationAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrganizationListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "getOrganizationListResponse")
    public JAXBElement<GetOrganizationListResponse> createGetOrganizationListResponse(GetOrganizationListResponse value) {
        return new JAXBElement<GetOrganizationListResponse>(_GetOrganizationListResponse_QNAME, GetOrganizationListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnPublishedUowListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "getUnPublishedUowListResponse")
    public JAXBElement<GetUnPublishedUowListResponse> createGetUnPublishedUowListResponse(GetUnPublishedUowListResponse value) {
        return new JAXBElement<GetUnPublishedUowListResponse>(_GetUnPublishedUowListResponse_QNAME, GetUnPublishedUowListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUnitOfWork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "createUnitOfWork")
    public JAXBElement<CreateUnitOfWork> createCreateUnitOfWork(CreateUnitOfWork value) {
        return new JAXBElement<CreateUnitOfWork>(_CreateUnitOfWork_QNAME, CreateUnitOfWork.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrganizationAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "createOrganizationAccountResponse")
    public JAXBElement<CreateOrganizationAccountResponse> createCreateOrganizationAccountResponse(CreateOrganizationAccountResponse value) {
        return new JAXBElement<CreateOrganizationAccountResponse>(_CreateOrganizationAccountResponse_QNAME, CreateOrganizationAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishUnitOfWorkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "publishUnitOfWorkResponse")
    public JAXBElement<PublishUnitOfWorkResponse> createPublishUnitOfWorkResponse(PublishUnitOfWorkResponse value) {
        return new JAXBElement<PublishUnitOfWorkResponse>(_PublishUnitOfWorkResponse_QNAME, PublishUnitOfWorkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublishedUOWStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "getPublishedUOWStatus")
    public JAXBElement<GetPublishedUOWStatus> createGetPublishedUOWStatus(GetPublishedUOWStatus value) {
        return new JAXBElement<GetPublishedUOWStatus>(_GetPublishedUOWStatus_QNAME, GetPublishedUOWStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUnitOfWorkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "createUnitOfWorkResponse")
    public JAXBElement<CreateUnitOfWorkResponse> createCreateUnitOfWorkResponse(CreateUnitOfWorkResponse value) {
        return new JAXBElement<CreateUnitOfWorkResponse>(_CreateUnitOfWorkResponse_QNAME, CreateUnitOfWorkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrganizationAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "getOrganizationAccount")
    public JAXBElement<GetOrganizationAccount> createGetOrganizationAccount(GetOrganizationAccount value) {
        return new JAXBElement<GetOrganizationAccount>(_GetOrganizationAccount_QNAME, GetOrganizationAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishUnitOfWork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "publishUnitOfWork")
    public JAXBElement<PublishUnitOfWork> createPublishUnitOfWork(PublishUnitOfWork value) {
        return new JAXBElement<PublishUnitOfWork>(_PublishUnitOfWork_QNAME, PublishUnitOfWork.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseUOWFromSessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "releaseUOWFromSessionResponse")
    public JAXBElement<ReleaseUOWFromSessionResponse> createReleaseUOWFromSessionResponse(ReleaseUOWFromSessionResponse value) {
        return new JAXBElement<ReleaseUOWFromSessionResponse>(_ReleaseUOWFromSessionResponse_QNAME, ReleaseUOWFromSessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "authenticateUserResponse")
    public JAXBElement<AuthenticateUserResponse> createAuthenticateUserResponse(AuthenticateUserResponse value) {
        return new JAXBElement<AuthenticateUserResponse>(_AuthenticateUserResponse_QNAME, AuthenticateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrganizationAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "updateOrganizationAccount")
    public JAXBElement<UpdateOrganizationAccount> createUpdateOrganizationAccount(UpdateOrganizationAccount value) {
        return new JAXBElement<UpdateOrganizationAccount>(_UpdateOrganizationAccount_QNAME, UpdateOrganizationAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "logoutUserResponse")
    public JAXBElement<LogoutUserResponse> createLogoutUserResponse(LogoutUserResponse value) {
        return new JAXBElement<LogoutUserResponse>(_LogoutUserResponse_QNAME, LogoutUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectUnitOfWorkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "selectUnitOfWorkResponse")
    public JAXBElement<SelectUnitOfWorkResponse> createSelectUnitOfWorkResponse(SelectUnitOfWorkResponse value) {
        return new JAXBElement<SelectUnitOfWorkResponse>(_SelectUnitOfWorkResponse_QNAME, SelectUnitOfWorkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribeServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "subscribeServiceResponse")
    public JAXBElement<SubscribeServiceResponse> createSubscribeServiceResponse(SubscribeServiceResponse value) {
        return new JAXBElement<SubscribeServiceResponse>(_SubscribeServiceResponse_QNAME, SubscribeServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUnitOfWork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "deleteUnitOfWork")
    public JAXBElement<DeleteUnitOfWork> createDeleteUnitOfWork(DeleteUnitOfWork value) {
        return new JAXBElement<DeleteUnitOfWork>(_DeleteUnitOfWork_QNAME, DeleteUnitOfWork.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUnitOfWorkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "deleteUnitOfWorkResponse")
    public JAXBElement<DeleteUnitOfWorkResponse> createDeleteUnitOfWorkResponse(DeleteUnitOfWorkResponse value) {
        return new JAXBElement<DeleteUnitOfWorkResponse>(_DeleteUnitOfWorkResponse_QNAME, DeleteUnitOfWorkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrganizationAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "getOrganizationAccountResponse")
    public JAXBElement<GetOrganizationAccountResponse> createGetOrganizationAccountResponse(GetOrganizationAccountResponse value) {
        return new JAXBElement<GetOrganizationAccountResponse>(_GetOrganizationAccountResponse_QNAME, GetOrganizationAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUOWStatusOnGCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "getUOWStatusOnGCResponse")
    public JAXBElement<GetUOWStatusOnGCResponse> createGetUOWStatusOnGCResponse(GetUOWStatusOnGCResponse value) {
        return new JAXBElement<GetUOWStatusOnGCResponse>(_GetUOWStatusOnGCResponse_QNAME, GetUOWStatusOnGCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnPublishedUowList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "getUnPublishedUowList")
    public JAXBElement<GetUnPublishedUowList> createGetUnPublishedUowList(GetUnPublishedUowList value) {
        return new JAXBElement<GetUnPublishedUowList>(_GetUnPublishedUowList_QNAME, GetUnPublishedUowList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrganizationAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "deleteOrganizationAccount")
    public JAXBElement<DeleteOrganizationAccount> createDeleteOrganizationAccount(DeleteOrganizationAccount value) {
        return new JAXBElement<DeleteOrganizationAccount>(_DeleteOrganizationAccount_QNAME, DeleteOrganizationAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrganizationAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "createOrganizationAccount")
    public JAXBElement<CreateOrganizationAccount> createCreateOrganizationAccount(CreateOrganizationAccount value) {
        return new JAXBElement<CreateOrganizationAccount>(_CreateOrganizationAccount_QNAME, CreateOrganizationAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrganizationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "getOrganizationList")
    public JAXBElement<GetOrganizationList> createGetOrganizationList(GetOrganizationList value) {
        return new JAXBElement<GetOrganizationList>(_GetOrganizationList_QNAME, GetOrganizationList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "authenticateUser")
    public JAXBElement<AuthenticateUser> createAuthenticateUser(AuthenticateUser value) {
        return new JAXBElement<AuthenticateUser>(_AuthenticateUser_QNAME, AuthenticateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectUnitOfWork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "selectUnitOfWork")
    public JAXBElement<SelectUnitOfWork> createSelectUnitOfWork(SelectUnitOfWork value) {
        return new JAXBElement<SelectUnitOfWork>(_SelectUnitOfWork_QNAME, SelectUnitOfWork.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "logoutUser")
    public JAXBElement<LogoutUser> createLogoutUser(LogoutUser value) {
        return new JAXBElement<LogoutUser>(_LogoutUser_QNAME, LogoutUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrganizationAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "updateOrganizationAccountResponse")
    public JAXBElement<UpdateOrganizationAccountResponse> createUpdateOrganizationAccountResponse(UpdateOrganizationAccountResponse value) {
        return new JAXBElement<UpdateOrganizationAccountResponse>(_UpdateOrganizationAccountResponse_QNAME, UpdateOrganizationAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsGenericObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "Response")
    public JAXBElement<WsGenericObject> createResponse(WsGenericObject value) {
        return new JAXBElement<WsGenericObject>(_Response_QNAME, WsGenericObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUOWStatusOnGC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://common.webservice.sms.ngin.agnity.com/", name = "getUOWStatusOnGC")
    public JAXBElement<GetUOWStatusOnGC> createGetUOWStatusOnGC(GetUOWStatusOnGC value) {
        return new JAXBElement<GetUOWStatusOnGC>(_GetUOWStatusOnGC_QNAME, GetUOWStatusOnGC.class, null, value);
    }

}
