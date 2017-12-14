
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PermissionsApiEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsApiUserOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsAuthorApex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsBulkApiHardDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsCanInsertFeedSystemFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsCanUseNewDashboardBuilder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsConvertLeads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsCreateMultiforce" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsCustomizeApplication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsDivisionAffected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditCaseComments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditOppLineItemUnitPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditOwnQuota" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditPublicDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditReadonlyFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEmailAdministration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEmailTemplateManagement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEnableNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsFlowUFLRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsImportLeads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsInboundMigrationToolsUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsInstallMultiforce" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageAnalyticSnapshots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageBusinessHourHolidays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageCallCenters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageCases" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageCategories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageCssUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageCustomReportTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageDashboards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageDataCategories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageDataIntegrations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageDynamicDashboards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageEmailClientConfig" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageLeads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageMobile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManagePartnerNetConn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageRemoteAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageSelfService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageSolutions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageTerritories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsMassInlineEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsModifyAllData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsNewReportBuilder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsOutboundMigrationToolsUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsOverrideForecasts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsPasswordNeverExpires" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsPublishMultiforce" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsResetPasswords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsRunReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsScheduleJob" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsScheduleReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsSendSitRequests" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsSolutionImport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsTransferAnyCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsTransferAnyEntity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsTransferAnyLead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsUseTeamReassignWizards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsViewAllData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsViewAllForecasts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsViewDataCategories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsViewMyTeamsDashboards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsViewSetup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserLicense" type="{urn:sobject.enterprise.soap.sforce.com}UserLicense" minOccurs="0"/>
 *         &lt;element name="UserLicenseId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="UserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Users" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile", propOrder = {
    "createdBy",
    "createdById",
    "createdDate",
    "description",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "name",
    "permissionsApiEnabled",
    "permissionsApiUserOnly",
    "permissionsAuthorApex",
    "permissionsBulkApiHardDelete",
    "permissionsCanInsertFeedSystemFields",
    "permissionsCanUseNewDashboardBuilder",
    "permissionsConvertLeads",
    "permissionsCreateMultiforce",
    "permissionsCustomizeApplication",
    "permissionsDivisionAffected",
    "permissionsEditCaseComments",
    "permissionsEditEvent",
    "permissionsEditOppLineItemUnitPrice",
    "permissionsEditOwnQuota",
    "permissionsEditPublicDocuments",
    "permissionsEditReadonlyFields",
    "permissionsEditReports",
    "permissionsEditTask",
    "permissionsEmailAdministration",
    "permissionsEmailTemplateManagement",
    "permissionsEnableNotifications",
    "permissionsFlowUFLRequired",
    "permissionsImportLeads",
    "permissionsInboundMigrationToolsUser",
    "permissionsInstallMultiforce",
    "permissionsManageAnalyticSnapshots",
    "permissionsManageBusinessHourHolidays",
    "permissionsManageCallCenters",
    "permissionsManageCases",
    "permissionsManageCategories",
    "permissionsManageCssUsers",
    "permissionsManageCustomReportTypes",
    "permissionsManageDashboards",
    "permissionsManageDataCategories",
    "permissionsManageDataIntegrations",
    "permissionsManageDynamicDashboards",
    "permissionsManageEmailClientConfig",
    "permissionsManageLeads",
    "permissionsManageMobile",
    "permissionsManagePartnerNetConn",
    "permissionsManageRemoteAccess",
    "permissionsManageSelfService",
    "permissionsManageSolutions",
    "permissionsManageTerritories",
    "permissionsManageUsers",
    "permissionsMassInlineEdit",
    "permissionsModifyAllData",
    "permissionsNewReportBuilder",
    "permissionsOutboundMigrationToolsUser",
    "permissionsOverrideForecasts",
    "permissionsPasswordNeverExpires",
    "permissionsPublishMultiforce",
    "permissionsResetPasswords",
    "permissionsRunReports",
    "permissionsScheduleJob",
    "permissionsScheduleReports",
    "permissionsSendSitRequests",
    "permissionsSolutionImport",
    "permissionsTransferAnyCase",
    "permissionsTransferAnyEntity",
    "permissionsTransferAnyLead",
    "permissionsUseTeamReassignWizards",
    "permissionsViewAllData",
    "permissionsViewAllForecasts",
    "permissionsViewDataCategories",
    "permissionsViewMyTeamsDashboards",
    "permissionsViewSetup",
    "systemModstamp",
    "userLicense",
    "userLicenseId",
    "userType",
    "users"
})
public class ProfileType
    extends SObjectType
{

    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "PermissionsApiEnabled", nillable = true)
    protected Boolean permissionsApiEnabled;
    @XmlElement(name = "PermissionsApiUserOnly", nillable = true)
    protected Boolean permissionsApiUserOnly;
    @XmlElement(name = "PermissionsAuthorApex", nillable = true)
    protected Boolean permissionsAuthorApex;
    @XmlElement(name = "PermissionsBulkApiHardDelete", nillable = true)
    protected Boolean permissionsBulkApiHardDelete;
    @XmlElement(name = "PermissionsCanInsertFeedSystemFields", nillable = true)
    protected Boolean permissionsCanInsertFeedSystemFields;
    @XmlElement(name = "PermissionsCanUseNewDashboardBuilder", nillable = true)
    protected Boolean permissionsCanUseNewDashboardBuilder;
    @XmlElement(name = "PermissionsConvertLeads", nillable = true)
    protected Boolean permissionsConvertLeads;
    @XmlElement(name = "PermissionsCreateMultiforce", nillable = true)
    protected Boolean permissionsCreateMultiforce;
    @XmlElement(name = "PermissionsCustomizeApplication", nillable = true)
    protected Boolean permissionsCustomizeApplication;
    @XmlElement(name = "PermissionsDivisionAffected", nillable = true)
    protected Boolean permissionsDivisionAffected;
    @XmlElement(name = "PermissionsEditCaseComments", nillable = true)
    protected Boolean permissionsEditCaseComments;
    @XmlElement(name = "PermissionsEditEvent", nillable = true)
    protected Boolean permissionsEditEvent;
    @XmlElement(name = "PermissionsEditOppLineItemUnitPrice", nillable = true)
    protected Boolean permissionsEditOppLineItemUnitPrice;
    @XmlElement(name = "PermissionsEditOwnQuota", nillable = true)
    protected Boolean permissionsEditOwnQuota;
    @XmlElement(name = "PermissionsEditPublicDocuments", nillable = true)
    protected Boolean permissionsEditPublicDocuments;
    @XmlElement(name = "PermissionsEditReadonlyFields", nillable = true)
    protected Boolean permissionsEditReadonlyFields;
    @XmlElement(name = "PermissionsEditReports", nillable = true)
    protected Boolean permissionsEditReports;
    @XmlElement(name = "PermissionsEditTask", nillable = true)
    protected Boolean permissionsEditTask;
    @XmlElement(name = "PermissionsEmailAdministration", nillable = true)
    protected Boolean permissionsEmailAdministration;
    @XmlElement(name = "PermissionsEmailTemplateManagement", nillable = true)
    protected Boolean permissionsEmailTemplateManagement;
    @XmlElement(name = "PermissionsEnableNotifications", nillable = true)
    protected Boolean permissionsEnableNotifications;
    @XmlElement(name = "PermissionsFlowUFLRequired", nillable = true)
    protected Boolean permissionsFlowUFLRequired;
    @XmlElement(name = "PermissionsImportLeads", nillable = true)
    protected Boolean permissionsImportLeads;
    @XmlElement(name = "PermissionsInboundMigrationToolsUser", nillable = true)
    protected Boolean permissionsInboundMigrationToolsUser;
    @XmlElement(name = "PermissionsInstallMultiforce", nillable = true)
    protected Boolean permissionsInstallMultiforce;
    @XmlElement(name = "PermissionsManageAnalyticSnapshots", nillable = true)
    protected Boolean permissionsManageAnalyticSnapshots;
    @XmlElement(name = "PermissionsManageBusinessHourHolidays", nillable = true)
    protected Boolean permissionsManageBusinessHourHolidays;
    @XmlElement(name = "PermissionsManageCallCenters", nillable = true)
    protected Boolean permissionsManageCallCenters;
    @XmlElement(name = "PermissionsManageCases", nillable = true)
    protected Boolean permissionsManageCases;
    @XmlElement(name = "PermissionsManageCategories", nillable = true)
    protected Boolean permissionsManageCategories;
    @XmlElement(name = "PermissionsManageCssUsers", nillable = true)
    protected Boolean permissionsManageCssUsers;
    @XmlElement(name = "PermissionsManageCustomReportTypes", nillable = true)
    protected Boolean permissionsManageCustomReportTypes;
    @XmlElement(name = "PermissionsManageDashboards", nillable = true)
    protected Boolean permissionsManageDashboards;
    @XmlElement(name = "PermissionsManageDataCategories", nillable = true)
    protected Boolean permissionsManageDataCategories;
    @XmlElement(name = "PermissionsManageDataIntegrations", nillable = true)
    protected Boolean permissionsManageDataIntegrations;
    @XmlElement(name = "PermissionsManageDynamicDashboards", nillable = true)
    protected Boolean permissionsManageDynamicDashboards;
    @XmlElement(name = "PermissionsManageEmailClientConfig", nillable = true)
    protected Boolean permissionsManageEmailClientConfig;
    @XmlElement(name = "PermissionsManageLeads", nillable = true)
    protected Boolean permissionsManageLeads;
    @XmlElement(name = "PermissionsManageMobile", nillable = true)
    protected Boolean permissionsManageMobile;
    @XmlElement(name = "PermissionsManagePartnerNetConn", nillable = true)
    protected Boolean permissionsManagePartnerNetConn;
    @XmlElement(name = "PermissionsManageRemoteAccess", nillable = true)
    protected Boolean permissionsManageRemoteAccess;
    @XmlElement(name = "PermissionsManageSelfService", nillable = true)
    protected Boolean permissionsManageSelfService;
    @XmlElement(name = "PermissionsManageSolutions", nillable = true)
    protected Boolean permissionsManageSolutions;
    @XmlElement(name = "PermissionsManageTerritories", nillable = true)
    protected Boolean permissionsManageTerritories;
    @XmlElement(name = "PermissionsManageUsers", nillable = true)
    protected Boolean permissionsManageUsers;
    @XmlElement(name = "PermissionsMassInlineEdit", nillable = true)
    protected Boolean permissionsMassInlineEdit;
    @XmlElement(name = "PermissionsModifyAllData", nillable = true)
    protected Boolean permissionsModifyAllData;
    @XmlElement(name = "PermissionsNewReportBuilder", nillable = true)
    protected Boolean permissionsNewReportBuilder;
    @XmlElement(name = "PermissionsOutboundMigrationToolsUser", nillable = true)
    protected Boolean permissionsOutboundMigrationToolsUser;
    @XmlElement(name = "PermissionsOverrideForecasts", nillable = true)
    protected Boolean permissionsOverrideForecasts;
    @XmlElement(name = "PermissionsPasswordNeverExpires", nillable = true)
    protected Boolean permissionsPasswordNeverExpires;
    @XmlElement(name = "PermissionsPublishMultiforce", nillable = true)
    protected Boolean permissionsPublishMultiforce;
    @XmlElement(name = "PermissionsResetPasswords", nillable = true)
    protected Boolean permissionsResetPasswords;
    @XmlElement(name = "PermissionsRunReports", nillable = true)
    protected Boolean permissionsRunReports;
    @XmlElement(name = "PermissionsScheduleJob", nillable = true)
    protected Boolean permissionsScheduleJob;
    @XmlElement(name = "PermissionsScheduleReports", nillable = true)
    protected Boolean permissionsScheduleReports;
    @XmlElement(name = "PermissionsSendSitRequests", nillable = true)
    protected Boolean permissionsSendSitRequests;
    @XmlElement(name = "PermissionsSolutionImport", nillable = true)
    protected Boolean permissionsSolutionImport;
    @XmlElement(name = "PermissionsTransferAnyCase", nillable = true)
    protected Boolean permissionsTransferAnyCase;
    @XmlElement(name = "PermissionsTransferAnyEntity", nillable = true)
    protected Boolean permissionsTransferAnyEntity;
    @XmlElement(name = "PermissionsTransferAnyLead", nillable = true)
    protected Boolean permissionsTransferAnyLead;
    @XmlElement(name = "PermissionsUseTeamReassignWizards", nillable = true)
    protected Boolean permissionsUseTeamReassignWizards;
    @XmlElement(name = "PermissionsViewAllData", nillable = true)
    protected Boolean permissionsViewAllData;
    @XmlElement(name = "PermissionsViewAllForecasts", nillable = true)
    protected Boolean permissionsViewAllForecasts;
    @XmlElement(name = "PermissionsViewDataCategories", nillable = true)
    protected Boolean permissionsViewDataCategories;
    @XmlElement(name = "PermissionsViewMyTeamsDashboards", nillable = true)
    protected Boolean permissionsViewMyTeamsDashboards;
    @XmlElement(name = "PermissionsViewSetup", nillable = true)
    protected Boolean permissionsViewSetup;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "UserLicense", nillable = true)
    protected UserLicenseType userLicense;
    @XmlElement(name = "UserLicenseId", nillable = true)
    protected String userLicenseId;
    @XmlElement(name = "UserType", nillable = true)
    protected String userType;
    @XmlElement(name = "Users", nillable = true)
    protected QueryResult users;

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setCreatedBy(UserType value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedById() {
        return createdById;
    }

    /**
     * Sets the value of the createdById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedById(String value) {
        this.createdById = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the lastModifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Sets the value of the lastModifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setLastModifiedBy(UserType value) {
        this.lastModifiedBy = value;
    }

    /**
     * Gets the value of the lastModifiedById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedById() {
        return lastModifiedById;
    }

    /**
     * Sets the value of the lastModifiedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedById(String value) {
        this.lastModifiedById = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the permissionsApiEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsApiEnabled() {
        return permissionsApiEnabled;
    }

    /**
     * Sets the value of the permissionsApiEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsApiEnabled(Boolean value) {
        this.permissionsApiEnabled = value;
    }

    /**
     * Gets the value of the permissionsApiUserOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsApiUserOnly() {
        return permissionsApiUserOnly;
    }

    /**
     * Sets the value of the permissionsApiUserOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsApiUserOnly(Boolean value) {
        this.permissionsApiUserOnly = value;
    }

    /**
     * Gets the value of the permissionsAuthorApex property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsAuthorApex() {
        return permissionsAuthorApex;
    }

    /**
     * Sets the value of the permissionsAuthorApex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsAuthorApex(Boolean value) {
        this.permissionsAuthorApex = value;
    }

    /**
     * Gets the value of the permissionsBulkApiHardDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsBulkApiHardDelete() {
        return permissionsBulkApiHardDelete;
    }

    /**
     * Sets the value of the permissionsBulkApiHardDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsBulkApiHardDelete(Boolean value) {
        this.permissionsBulkApiHardDelete = value;
    }

    /**
     * Gets the value of the permissionsCanInsertFeedSystemFields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsCanInsertFeedSystemFields() {
        return permissionsCanInsertFeedSystemFields;
    }

    /**
     * Sets the value of the permissionsCanInsertFeedSystemFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsCanInsertFeedSystemFields(Boolean value) {
        this.permissionsCanInsertFeedSystemFields = value;
    }

    /**
     * Gets the value of the permissionsCanUseNewDashboardBuilder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsCanUseNewDashboardBuilder() {
        return permissionsCanUseNewDashboardBuilder;
    }

    /**
     * Sets the value of the permissionsCanUseNewDashboardBuilder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsCanUseNewDashboardBuilder(Boolean value) {
        this.permissionsCanUseNewDashboardBuilder = value;
    }

    /**
     * Gets the value of the permissionsConvertLeads property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsConvertLeads() {
        return permissionsConvertLeads;
    }

    /**
     * Sets the value of the permissionsConvertLeads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsConvertLeads(Boolean value) {
        this.permissionsConvertLeads = value;
    }

    /**
     * Gets the value of the permissionsCreateMultiforce property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsCreateMultiforce() {
        return permissionsCreateMultiforce;
    }

    /**
     * Sets the value of the permissionsCreateMultiforce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsCreateMultiforce(Boolean value) {
        this.permissionsCreateMultiforce = value;
    }

    /**
     * Gets the value of the permissionsCustomizeApplication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsCustomizeApplication() {
        return permissionsCustomizeApplication;
    }

    /**
     * Sets the value of the permissionsCustomizeApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsCustomizeApplication(Boolean value) {
        this.permissionsCustomizeApplication = value;
    }

    /**
     * Gets the value of the permissionsDivisionAffected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsDivisionAffected() {
        return permissionsDivisionAffected;
    }

    /**
     * Sets the value of the permissionsDivisionAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsDivisionAffected(Boolean value) {
        this.permissionsDivisionAffected = value;
    }

    /**
     * Gets the value of the permissionsEditCaseComments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditCaseComments() {
        return permissionsEditCaseComments;
    }

    /**
     * Sets the value of the permissionsEditCaseComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditCaseComments(Boolean value) {
        this.permissionsEditCaseComments = value;
    }

    /**
     * Gets the value of the permissionsEditEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditEvent() {
        return permissionsEditEvent;
    }

    /**
     * Sets the value of the permissionsEditEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditEvent(Boolean value) {
        this.permissionsEditEvent = value;
    }

    /**
     * Gets the value of the permissionsEditOppLineItemUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditOppLineItemUnitPrice() {
        return permissionsEditOppLineItemUnitPrice;
    }

    /**
     * Sets the value of the permissionsEditOppLineItemUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditOppLineItemUnitPrice(Boolean value) {
        this.permissionsEditOppLineItemUnitPrice = value;
    }

    /**
     * Gets the value of the permissionsEditOwnQuota property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditOwnQuota() {
        return permissionsEditOwnQuota;
    }

    /**
     * Sets the value of the permissionsEditOwnQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditOwnQuota(Boolean value) {
        this.permissionsEditOwnQuota = value;
    }

    /**
     * Gets the value of the permissionsEditPublicDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditPublicDocuments() {
        return permissionsEditPublicDocuments;
    }

    /**
     * Sets the value of the permissionsEditPublicDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditPublicDocuments(Boolean value) {
        this.permissionsEditPublicDocuments = value;
    }

    /**
     * Gets the value of the permissionsEditReadonlyFields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditReadonlyFields() {
        return permissionsEditReadonlyFields;
    }

    /**
     * Sets the value of the permissionsEditReadonlyFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditReadonlyFields(Boolean value) {
        this.permissionsEditReadonlyFields = value;
    }

    /**
     * Gets the value of the permissionsEditReports property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditReports() {
        return permissionsEditReports;
    }

    /**
     * Sets the value of the permissionsEditReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditReports(Boolean value) {
        this.permissionsEditReports = value;
    }

    /**
     * Gets the value of the permissionsEditTask property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditTask() {
        return permissionsEditTask;
    }

    /**
     * Sets the value of the permissionsEditTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditTask(Boolean value) {
        this.permissionsEditTask = value;
    }

    /**
     * Gets the value of the permissionsEmailAdministration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEmailAdministration() {
        return permissionsEmailAdministration;
    }

    /**
     * Sets the value of the permissionsEmailAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEmailAdministration(Boolean value) {
        this.permissionsEmailAdministration = value;
    }

    /**
     * Gets the value of the permissionsEmailTemplateManagement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEmailTemplateManagement() {
        return permissionsEmailTemplateManagement;
    }

    /**
     * Sets the value of the permissionsEmailTemplateManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEmailTemplateManagement(Boolean value) {
        this.permissionsEmailTemplateManagement = value;
    }

    /**
     * Gets the value of the permissionsEnableNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEnableNotifications() {
        return permissionsEnableNotifications;
    }

    /**
     * Sets the value of the permissionsEnableNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEnableNotifications(Boolean value) {
        this.permissionsEnableNotifications = value;
    }

    /**
     * Gets the value of the permissionsFlowUFLRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsFlowUFLRequired() {
        return permissionsFlowUFLRequired;
    }

    /**
     * Sets the value of the permissionsFlowUFLRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsFlowUFLRequired(Boolean value) {
        this.permissionsFlowUFLRequired = value;
    }

    /**
     * Gets the value of the permissionsImportLeads property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsImportLeads() {
        return permissionsImportLeads;
    }

    /**
     * Sets the value of the permissionsImportLeads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsImportLeads(Boolean value) {
        this.permissionsImportLeads = value;
    }

    /**
     * Gets the value of the permissionsInboundMigrationToolsUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsInboundMigrationToolsUser() {
        return permissionsInboundMigrationToolsUser;
    }

    /**
     * Sets the value of the permissionsInboundMigrationToolsUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsInboundMigrationToolsUser(Boolean value) {
        this.permissionsInboundMigrationToolsUser = value;
    }

    /**
     * Gets the value of the permissionsInstallMultiforce property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsInstallMultiforce() {
        return permissionsInstallMultiforce;
    }

    /**
     * Sets the value of the permissionsInstallMultiforce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsInstallMultiforce(Boolean value) {
        this.permissionsInstallMultiforce = value;
    }

    /**
     * Gets the value of the permissionsManageAnalyticSnapshots property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageAnalyticSnapshots() {
        return permissionsManageAnalyticSnapshots;
    }

    /**
     * Sets the value of the permissionsManageAnalyticSnapshots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageAnalyticSnapshots(Boolean value) {
        this.permissionsManageAnalyticSnapshots = value;
    }

    /**
     * Gets the value of the permissionsManageBusinessHourHolidays property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageBusinessHourHolidays() {
        return permissionsManageBusinessHourHolidays;
    }

    /**
     * Sets the value of the permissionsManageBusinessHourHolidays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageBusinessHourHolidays(Boolean value) {
        this.permissionsManageBusinessHourHolidays = value;
    }

    /**
     * Gets the value of the permissionsManageCallCenters property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageCallCenters() {
        return permissionsManageCallCenters;
    }

    /**
     * Sets the value of the permissionsManageCallCenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageCallCenters(Boolean value) {
        this.permissionsManageCallCenters = value;
    }

    /**
     * Gets the value of the permissionsManageCases property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageCases() {
        return permissionsManageCases;
    }

    /**
     * Sets the value of the permissionsManageCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageCases(Boolean value) {
        this.permissionsManageCases = value;
    }

    /**
     * Gets the value of the permissionsManageCategories property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageCategories() {
        return permissionsManageCategories;
    }

    /**
     * Sets the value of the permissionsManageCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageCategories(Boolean value) {
        this.permissionsManageCategories = value;
    }

    /**
     * Gets the value of the permissionsManageCssUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageCssUsers() {
        return permissionsManageCssUsers;
    }

    /**
     * Sets the value of the permissionsManageCssUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageCssUsers(Boolean value) {
        this.permissionsManageCssUsers = value;
    }

    /**
     * Gets the value of the permissionsManageCustomReportTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageCustomReportTypes() {
        return permissionsManageCustomReportTypes;
    }

    /**
     * Sets the value of the permissionsManageCustomReportTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageCustomReportTypes(Boolean value) {
        this.permissionsManageCustomReportTypes = value;
    }

    /**
     * Gets the value of the permissionsManageDashboards property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageDashboards() {
        return permissionsManageDashboards;
    }

    /**
     * Sets the value of the permissionsManageDashboards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageDashboards(Boolean value) {
        this.permissionsManageDashboards = value;
    }

    /**
     * Gets the value of the permissionsManageDataCategories property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageDataCategories() {
        return permissionsManageDataCategories;
    }

    /**
     * Sets the value of the permissionsManageDataCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageDataCategories(Boolean value) {
        this.permissionsManageDataCategories = value;
    }

    /**
     * Gets the value of the permissionsManageDataIntegrations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageDataIntegrations() {
        return permissionsManageDataIntegrations;
    }

    /**
     * Sets the value of the permissionsManageDataIntegrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageDataIntegrations(Boolean value) {
        this.permissionsManageDataIntegrations = value;
    }

    /**
     * Gets the value of the permissionsManageDynamicDashboards property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageDynamicDashboards() {
        return permissionsManageDynamicDashboards;
    }

    /**
     * Sets the value of the permissionsManageDynamicDashboards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageDynamicDashboards(Boolean value) {
        this.permissionsManageDynamicDashboards = value;
    }

    /**
     * Gets the value of the permissionsManageEmailClientConfig property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageEmailClientConfig() {
        return permissionsManageEmailClientConfig;
    }

    /**
     * Sets the value of the permissionsManageEmailClientConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageEmailClientConfig(Boolean value) {
        this.permissionsManageEmailClientConfig = value;
    }

    /**
     * Gets the value of the permissionsManageLeads property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageLeads() {
        return permissionsManageLeads;
    }

    /**
     * Sets the value of the permissionsManageLeads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageLeads(Boolean value) {
        this.permissionsManageLeads = value;
    }

    /**
     * Gets the value of the permissionsManageMobile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageMobile() {
        return permissionsManageMobile;
    }

    /**
     * Sets the value of the permissionsManageMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageMobile(Boolean value) {
        this.permissionsManageMobile = value;
    }

    /**
     * Gets the value of the permissionsManagePartnerNetConn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManagePartnerNetConn() {
        return permissionsManagePartnerNetConn;
    }

    /**
     * Sets the value of the permissionsManagePartnerNetConn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManagePartnerNetConn(Boolean value) {
        this.permissionsManagePartnerNetConn = value;
    }

    /**
     * Gets the value of the permissionsManageRemoteAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageRemoteAccess() {
        return permissionsManageRemoteAccess;
    }

    /**
     * Sets the value of the permissionsManageRemoteAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageRemoteAccess(Boolean value) {
        this.permissionsManageRemoteAccess = value;
    }

    /**
     * Gets the value of the permissionsManageSelfService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageSelfService() {
        return permissionsManageSelfService;
    }

    /**
     * Sets the value of the permissionsManageSelfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageSelfService(Boolean value) {
        this.permissionsManageSelfService = value;
    }

    /**
     * Gets the value of the permissionsManageSolutions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageSolutions() {
        return permissionsManageSolutions;
    }

    /**
     * Sets the value of the permissionsManageSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageSolutions(Boolean value) {
        this.permissionsManageSolutions = value;
    }

    /**
     * Gets the value of the permissionsManageTerritories property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageTerritories() {
        return permissionsManageTerritories;
    }

    /**
     * Sets the value of the permissionsManageTerritories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageTerritories(Boolean value) {
        this.permissionsManageTerritories = value;
    }

    /**
     * Gets the value of the permissionsManageUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageUsers() {
        return permissionsManageUsers;
    }

    /**
     * Sets the value of the permissionsManageUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageUsers(Boolean value) {
        this.permissionsManageUsers = value;
    }

    /**
     * Gets the value of the permissionsMassInlineEdit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsMassInlineEdit() {
        return permissionsMassInlineEdit;
    }

    /**
     * Sets the value of the permissionsMassInlineEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsMassInlineEdit(Boolean value) {
        this.permissionsMassInlineEdit = value;
    }

    /**
     * Gets the value of the permissionsModifyAllData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsModifyAllData() {
        return permissionsModifyAllData;
    }

    /**
     * Sets the value of the permissionsModifyAllData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsModifyAllData(Boolean value) {
        this.permissionsModifyAllData = value;
    }

    /**
     * Gets the value of the permissionsNewReportBuilder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsNewReportBuilder() {
        return permissionsNewReportBuilder;
    }

    /**
     * Sets the value of the permissionsNewReportBuilder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsNewReportBuilder(Boolean value) {
        this.permissionsNewReportBuilder = value;
    }

    /**
     * Gets the value of the permissionsOutboundMigrationToolsUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsOutboundMigrationToolsUser() {
        return permissionsOutboundMigrationToolsUser;
    }

    /**
     * Sets the value of the permissionsOutboundMigrationToolsUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsOutboundMigrationToolsUser(Boolean value) {
        this.permissionsOutboundMigrationToolsUser = value;
    }

    /**
     * Gets the value of the permissionsOverrideForecasts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsOverrideForecasts() {
        return permissionsOverrideForecasts;
    }

    /**
     * Sets the value of the permissionsOverrideForecasts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsOverrideForecasts(Boolean value) {
        this.permissionsOverrideForecasts = value;
    }

    /**
     * Gets the value of the permissionsPasswordNeverExpires property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsPasswordNeverExpires() {
        return permissionsPasswordNeverExpires;
    }

    /**
     * Sets the value of the permissionsPasswordNeverExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsPasswordNeverExpires(Boolean value) {
        this.permissionsPasswordNeverExpires = value;
    }

    /**
     * Gets the value of the permissionsPublishMultiforce property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsPublishMultiforce() {
        return permissionsPublishMultiforce;
    }

    /**
     * Sets the value of the permissionsPublishMultiforce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsPublishMultiforce(Boolean value) {
        this.permissionsPublishMultiforce = value;
    }

    /**
     * Gets the value of the permissionsResetPasswords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsResetPasswords() {
        return permissionsResetPasswords;
    }

    /**
     * Sets the value of the permissionsResetPasswords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsResetPasswords(Boolean value) {
        this.permissionsResetPasswords = value;
    }

    /**
     * Gets the value of the permissionsRunReports property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsRunReports() {
        return permissionsRunReports;
    }

    /**
     * Sets the value of the permissionsRunReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsRunReports(Boolean value) {
        this.permissionsRunReports = value;
    }

    /**
     * Gets the value of the permissionsScheduleJob property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsScheduleJob() {
        return permissionsScheduleJob;
    }

    /**
     * Sets the value of the permissionsScheduleJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsScheduleJob(Boolean value) {
        this.permissionsScheduleJob = value;
    }

    /**
     * Gets the value of the permissionsScheduleReports property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsScheduleReports() {
        return permissionsScheduleReports;
    }

    /**
     * Sets the value of the permissionsScheduleReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsScheduleReports(Boolean value) {
        this.permissionsScheduleReports = value;
    }

    /**
     * Gets the value of the permissionsSendSitRequests property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsSendSitRequests() {
        return permissionsSendSitRequests;
    }

    /**
     * Sets the value of the permissionsSendSitRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsSendSitRequests(Boolean value) {
        this.permissionsSendSitRequests = value;
    }

    /**
     * Gets the value of the permissionsSolutionImport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsSolutionImport() {
        return permissionsSolutionImport;
    }

    /**
     * Sets the value of the permissionsSolutionImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsSolutionImport(Boolean value) {
        this.permissionsSolutionImport = value;
    }

    /**
     * Gets the value of the permissionsTransferAnyCase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsTransferAnyCase() {
        return permissionsTransferAnyCase;
    }

    /**
     * Sets the value of the permissionsTransferAnyCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsTransferAnyCase(Boolean value) {
        this.permissionsTransferAnyCase = value;
    }

    /**
     * Gets the value of the permissionsTransferAnyEntity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsTransferAnyEntity() {
        return permissionsTransferAnyEntity;
    }

    /**
     * Sets the value of the permissionsTransferAnyEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsTransferAnyEntity(Boolean value) {
        this.permissionsTransferAnyEntity = value;
    }

    /**
     * Gets the value of the permissionsTransferAnyLead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsTransferAnyLead() {
        return permissionsTransferAnyLead;
    }

    /**
     * Sets the value of the permissionsTransferAnyLead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsTransferAnyLead(Boolean value) {
        this.permissionsTransferAnyLead = value;
    }

    /**
     * Gets the value of the permissionsUseTeamReassignWizards property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsUseTeamReassignWizards() {
        return permissionsUseTeamReassignWizards;
    }

    /**
     * Sets the value of the permissionsUseTeamReassignWizards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsUseTeamReassignWizards(Boolean value) {
        this.permissionsUseTeamReassignWizards = value;
    }

    /**
     * Gets the value of the permissionsViewAllData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsViewAllData() {
        return permissionsViewAllData;
    }

    /**
     * Sets the value of the permissionsViewAllData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsViewAllData(Boolean value) {
        this.permissionsViewAllData = value;
    }

    /**
     * Gets the value of the permissionsViewAllForecasts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsViewAllForecasts() {
        return permissionsViewAllForecasts;
    }

    /**
     * Sets the value of the permissionsViewAllForecasts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsViewAllForecasts(Boolean value) {
        this.permissionsViewAllForecasts = value;
    }

    /**
     * Gets the value of the permissionsViewDataCategories property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsViewDataCategories() {
        return permissionsViewDataCategories;
    }

    /**
     * Sets the value of the permissionsViewDataCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsViewDataCategories(Boolean value) {
        this.permissionsViewDataCategories = value;
    }

    /**
     * Gets the value of the permissionsViewMyTeamsDashboards property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsViewMyTeamsDashboards() {
        return permissionsViewMyTeamsDashboards;
    }

    /**
     * Sets the value of the permissionsViewMyTeamsDashboards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsViewMyTeamsDashboards(Boolean value) {
        this.permissionsViewMyTeamsDashboards = value;
    }

    /**
     * Gets the value of the permissionsViewSetup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsViewSetup() {
        return permissionsViewSetup;
    }

    /**
     * Sets the value of the permissionsViewSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsViewSetup(Boolean value) {
        this.permissionsViewSetup = value;
    }

    /**
     * Gets the value of the systemModstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSystemModstamp() {
        return systemModstamp;
    }

    /**
     * Sets the value of the systemModstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSystemModstamp(XMLGregorianCalendar value) {
        this.systemModstamp = value;
    }

    /**
     * Gets the value of the userLicense property.
     * 
     * @return
     *     possible object is
     *     {@link UserLicenseType }
     *     
     */
    public UserLicenseType getUserLicense() {
        return userLicense;
    }

    /**
     * Sets the value of the userLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLicenseType }
     *     
     */
    public void setUserLicense(UserLicenseType value) {
        this.userLicense = value;
    }

    /**
     * Gets the value of the userLicenseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLicenseId() {
        return userLicenseId;
    }

    /**
     * Sets the value of the userLicenseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLicenseId(String value) {
        this.userLicenseId = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setUsers(QueryResult value) {
        this.users = value;
    }

}
