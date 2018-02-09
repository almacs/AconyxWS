/**
 * CommonSmsServices_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.acc.tibco.interfaceAconyx.ws;

public interface CommonSmsServices_PortType extends java.rmi.Remote {
    public com.acc.tibco.interfaceAconyx.ws.WSResponse authenticateUser(com.acc.tibco.interfaceAconyx.ws.AuthInfo authInfo, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.acc.tibco.interfaceAconyx.ws.WSResponse publishUnitOfWork(com.acc.tibco.interfaceAconyx.ws.UowJob uowJob, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.acc.tibco.interfaceAconyx.ws.WSResponse getUnPublishedUowList(com.acc.tibco.interfaceAconyx.ws.UnPublishedUowList unPublishedUowList, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.acc.tibco.interfaceAconyx.ws.WSResponse deleteUnitOfWork(com.acc.tibco.interfaceAconyx.ws.UnitOfWork unitOfWork, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.acc.tibco.interfaceAconyx.ws.WSResponse getPublishedUOWStatus(com.acc.tibco.interfaceAconyx.ws.UowStatus uowStatus, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.acc.tibco.interfaceAconyx.ws.WSResponse createOrganizationAccount(com.acc.tibco.interfaceAconyx.ws.AccountInfo accountInfo, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.acc.tibco.interfaceAconyx.ws.WSResponse releaseUOWFromSession(com.acc.tibco.interfaceAconyx.ws.UnitOfWork unitOfWork, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.acc.tibco.interfaceAconyx.ws.WSResponse createUnitOfWork(com.acc.tibco.interfaceAconyx.ws.UnitOfWork unitOfWork, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.acc.tibco.interfaceAconyx.ws.WSResponse deleteOrganizationAccount(com.acc.tibco.interfaceAconyx.ws.AccountInfo accountInfo, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.acc.tibco.interfaceAconyx.ws.WSResponse logoutUser(com.acc.tibco.interfaceAconyx.ws.AuthInfo authInfo, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.acc.tibco.interfaceAconyx.ws.WSResponse getOrganizationList(com.acc.tibco.interfaceAconyx.ws.OrganizationAccountList organizationAccountList, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.acc.tibco.interfaceAconyx.ws.WSResponse getOrganizationAccount(com.acc.tibco.interfaceAconyx.ws.AccountInfo accountInfo, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.acc.tibco.interfaceAconyx.ws.WSResponse subscribeService(com.acc.tibco.interfaceAconyx.ws.Subscription subscription, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.acc.tibco.interfaceAconyx.ws.WSResponse updateOrganizationAccount(com.acc.tibco.interfaceAconyx.ws.AccountInfo accountInfo, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.acc.tibco.interfaceAconyx.ws.WSResponse getUOWStatusOnGC(com.acc.tibco.interfaceAconyx.ws.UowDetailList UOWDetailList, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.acc.tibco.interfaceAconyx.ws.WSResponse selectUnitOfWork(com.acc.tibco.interfaceAconyx.ws.UnitOfWork unitOfWork, java.lang.String sessionId) throws java.rmi.RemoteException;
}
