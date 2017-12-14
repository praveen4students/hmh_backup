
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="AboutMe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="AccountTeams" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Account_Group__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Accounts1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Accounts2__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Accounts__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Approve_Sample_Limit_Overages__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BCC_Notification_Email__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CP_Allow_Substitutions_Checkbox__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CP_Close_Date_Default__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CP_Expiration_Date_Default__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CP_Print_Tax_Default__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CP_Search_State__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallCenterId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommunityNickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Consultant_Skill_Set__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="ContactId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Contacts__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ContractsSigned" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CurrentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultDivision" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="DefaultGroupNotificationFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Default_Shipping_to_SAP__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DelegatedApproverId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="DelegatedUsers" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DigestFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="District__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Do_Not_Deactivate__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailEncodingKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Employee_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enterprise_User__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FederationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptions" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Feeds" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForecastEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Formal_First_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullPhotoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hire_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Imp_Pricebook_Id__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Imp_Pricebook_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Is_Large_CP_Collapse_Default__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KenTests1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="KenTests__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="LT_Assets1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="LT_Assets2__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="LT_Assets__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="LanguageLocaleKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastLoginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinkPoint360__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocaleSidKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manager" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="ManagerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Market_Abbreviation__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Market_Comments__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Market_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Market__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Max_Ratio__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OIRs1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OIRs__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OfflinePdaTrialExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OfflineTrialExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Opp_Pricebook_Id__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opp_Pricebook_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opportunities1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opportunities__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpportunityTeams" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opps_Orders_Proposals1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opps_Orders_Proposals2__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opps_Orders_Proposals__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OrderedByOpportunities__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Pass_Override_Id__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Profile" type="{urn:sobject.enterprise.soap.sforce.com}Profile" minOccurs="0"/>
 *         &lt;element name="ProfileId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Project_Plan_Resources__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="R00N60000001PRPbEAO__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ReceivesAdminInfoEmails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReceivesInfoEmails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Region_Group__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region_Scheduler_Maps__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Region__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Customer__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Territory_Id__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_User_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sample_Pricebook_Id__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sample_Pricebook_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Schedulable_Consultant__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SchedulerServiceRequestForms__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ServiceRequestTentativeAttendees1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ServiceRequestTentativeAttendees__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SkillsTutor_Email_Alert_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SkillsTutor_User__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SmallPhotoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Snapshot_Users__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Territory_Desciption__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Territory_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Territory_Financial_Details__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="TimeZoneSidKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unassigned_Sales__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Use_CP_Alternate_Subtotal_Format__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserAccountTeams" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserPermissionsAvantgoUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsCallCenterAutoLogin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsMarketingUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsMobileUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsOfflineUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsSFContentUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferences" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserPreferencesActivityRemindersPopup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesApexPagesDeveloperMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisableAutoSubForFeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesEventRemindersCheckboxDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesReminderSoundOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesTaskRemindersCheckboxDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserRole" type="{urn:sobject.enterprise.soap.sforce.com}UserRole" minOccurs="0"/>
 *         &lt;element name="UserRoleId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="UserTeams" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User_Account_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Windows_Login_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isRepLocatorInvisible__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ities_msg__Manage_Home_Page_Messages__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "aboutMe",
    "accountId",
    "accountTeams",
    "accountGroupC",
    "accounts1R",
    "accounts2R",
    "accountsR",
    "alias",
    "approveSampleLimitOveragesC",
    "bccNotificationEmailC",
    "cpAllowSubstitutionsCheckboxC",
    "cpCloseDateDefaultC",
    "cpExpirationDateDefaultC",
    "cpPrintTaxDefaultC",
    "cpSearchStateC",
    "callCenterId",
    "city",
    "communityNickname",
    "companyName",
    "consultantSkillSetC",
    "contact",
    "contactId",
    "contactsR",
    "contractsSigned",
    "country",
    "createdBy",
    "createdById",
    "createdDate",
    "currentStatus",
    "defaultDivision",
    "defaultGroupNotificationFrequency",
    "defaultShippingToSAPC",
    "delegatedApproverId",
    "delegatedUsers",
    "department",
    "digestFrequency",
    "districtC",
    "division",
    "doNotDeactivateC",
    "email",
    "emailEncodingKey",
    "employeeNumber",
    "employeeIDC",
    "enterpriseUserC",
    "extension",
    "fax",
    "federationIdentifier",
    "feedSubscriptions",
    "feedSubscriptionsForEntity",
    "feeds",
    "firstName",
    "forecastEnabled",
    "formalFirstNameC",
    "fullPhotoUrl",
    "hireDateC",
    "impPricebookIdC",
    "impPricebookNameC",
    "isActive",
    "isLargeCPCollapseDefaultC",
    "kenTests1R",
    "kenTestsR",
    "ltAssets1R",
    "ltAssets2R",
    "ltAssetsR",
    "languageLocaleKey",
    "lastLoginDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastName",
    "linkPoint360C",
    "localeSidKey",
    "manager",
    "managerId",
    "marketAbbreviationC",
    "marketCommentsR",
    "marketDescriptionC",
    "marketC",
    "maxRatioC",
    "mobilePhone",
    "name",
    "oiRs1R",
    "oiRsR",
    "offlinePdaTrialExpirationDate",
    "offlineTrialExpirationDate",
    "oppPricebookIdC",
    "oppPricebookNameC",
    "opportunities1R",
    "opportunitiesR",
    "opportunityTeams",
    "oppsOrdersProposals1R",
    "oppsOrdersProposals2R",
    "oppsOrdersProposalsR",
    "orderedByOpportunitiesR",
    "passOverrideIdC",
    "phone",
    "postalCode",
    "profile",
    "profileId",
    "projectPlanResourcesR",
    "r00N60000001PRPbEAOR",
    "receivesAdminInfoEmails",
    "receivesInfoEmails",
    "regionGroupC",
    "regionSchedulerMapsR",
    "regionC",
    "sapCustomerC",
    "sapTerritoryIdC",
    "sapUserIDC",
    "samplePricebookIdC",
    "samplePricebookNameC",
    "schedulableConsultantC",
    "schedulerServiceRequestFormsR",
    "serviceRequestTentativeAttendees1R",
    "serviceRequestTentativeAttendeesR",
    "skillsTutorEmailAlertFlagC",
    "skillsTutorUserC",
    "smallPhotoUrl",
    "snapshotUsersR",
    "state",
    "street",
    "systemModstamp",
    "territoryDesciptionC",
    "territoryDescriptionC",
    "territoryFinancialDetailsR",
    "timeZoneSidKey",
    "title",
    "unassignedSalesR",
    "useCPAlternateSubtotalFormatC",
    "userAccountTeams",
    "userPermissionsAvantgoUser",
    "userPermissionsCallCenterAutoLogin",
    "userPermissionsMarketingUser",
    "userPermissionsMobileUser",
    "userPermissionsOfflineUser",
    "userPermissionsSFContentUser",
    "userPreferences",
    "userPreferencesActivityRemindersPopup",
    "userPreferencesApexPagesDeveloperMode",
    "userPreferencesDisableAutoSubForFeeds",
    "userPreferencesEventRemindersCheckboxDefault",
    "userPreferencesReminderSoundOff",
    "userPreferencesTaskRemindersCheckboxDefault",
    "userRole",
    "userRoleId",
    "userTeams",
    "userType",
    "userAccountIDC",
    "username",
    "windowsLoginIDC",
    "isRepLocatorInvisibleC",
    "itiesMsgManageHomePageMessagesC"
})
public class UserType
    extends SObjectType
{

    @XmlElement(name = "AboutMe", nillable = true)
    protected String aboutMe;
    @XmlElement(name = "AccountId", nillable = true)
    protected String accountId;
    @XmlElement(name = "AccountTeams", nillable = true)
    protected QueryResult accountTeams;
    @XmlElement(name = "Account_Group__c", nillable = true)
    protected String accountGroupC;
    @XmlElement(name = "Accounts1__r", nillable = true)
    protected QueryResult accounts1R;
    @XmlElement(name = "Accounts2__r", nillable = true)
    protected QueryResult accounts2R;
    @XmlElement(name = "Accounts__r", nillable = true)
    protected QueryResult accountsR;
    @XmlElement(name = "Alias", nillable = true)
    protected String alias;
    @XmlElement(name = "Approve_Sample_Limit_Overages__c", nillable = true)
    protected Boolean approveSampleLimitOveragesC;
    @XmlElement(name = "BCC_Notification_Email__c", nillable = true)
    protected Boolean bccNotificationEmailC;
    @XmlElement(name = "CP_Allow_Substitutions_Checkbox__c", nillable = true)
    protected Boolean cpAllowSubstitutionsCheckboxC;
    @XmlElement(name = "CP_Close_Date_Default__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cpCloseDateDefaultC;
    @XmlElement(name = "CP_Expiration_Date_Default__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cpExpirationDateDefaultC;
    @XmlElement(name = "CP_Print_Tax_Default__c", nillable = true)
    protected Boolean cpPrintTaxDefaultC;
    @XmlElement(name = "CP_Search_State__c", nillable = true)
    protected String cpSearchStateC;
    @XmlElement(name = "CallCenterId", nillable = true)
    protected String callCenterId;
    @XmlElement(name = "City", nillable = true)
    protected String city;
    @XmlElement(name = "CommunityNickname", nillable = true)
    protected String communityNickname;
    @XmlElement(name = "CompanyName", nillable = true)
    protected String companyName;
    @XmlElement(name = "Consultant_Skill_Set__c", nillable = true)
    protected String consultantSkillSetC;
    @XmlElement(name = "Contact", nillable = true)
    protected ContactType contact;
    @XmlElement(name = "ContactId", nillable = true)
    protected String contactId;
    @XmlElement(name = "Contacts__r", nillable = true)
    protected QueryResult contactsR;
    @XmlElement(name = "ContractsSigned", nillable = true)
    protected QueryResult contractsSigned;
    @XmlElement(name = "Country", nillable = true)
    protected String country;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "CurrentStatus", nillable = true)
    protected String currentStatus;
    @XmlElement(name = "DefaultDivision", nillable = true)
    protected String defaultDivision;
    @XmlElement(name = "DefaultGroupNotificationFrequency", nillable = true)
    protected String defaultGroupNotificationFrequency;
    @XmlElement(name = "Default_Shipping_to_SAP__c", nillable = true)
    protected Boolean defaultShippingToSAPC;
    @XmlElement(name = "DelegatedApproverId", nillable = true)
    protected String delegatedApproverId;
    @XmlElement(name = "DelegatedUsers", nillable = true)
    protected QueryResult delegatedUsers;
    @XmlElement(name = "Department", nillable = true)
    protected String department;
    @XmlElement(name = "DigestFrequency", nillable = true)
    protected String digestFrequency;
    @XmlElement(name = "District__c", nillable = true)
    protected String districtC;
    @XmlElement(name = "Division", nillable = true)
    protected String division;
    @XmlElement(name = "Do_Not_Deactivate__c", nillable = true)
    protected Boolean doNotDeactivateC;
    @XmlElement(name = "Email", nillable = true)
    protected String email;
    @XmlElement(name = "EmailEncodingKey", nillable = true)
    protected String emailEncodingKey;
    @XmlElement(name = "EmployeeNumber", nillable = true)
    protected String employeeNumber;
    @XmlElement(name = "Employee_ID__c", nillable = true)
    protected String employeeIDC;
    @XmlElement(name = "Enterprise_User__c", nillable = true)
    protected Boolean enterpriseUserC;
    @XmlElement(name = "Extension", nillable = true)
    protected String extension;
    @XmlElement(name = "Fax", nillable = true)
    protected String fax;
    @XmlElement(name = "FederationIdentifier", nillable = true)
    protected String federationIdentifier;
    @XmlElement(name = "FeedSubscriptions", nillable = true)
    protected QueryResult feedSubscriptions;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "Feeds", nillable = true)
    protected QueryResult feeds;
    @XmlElement(name = "FirstName", nillable = true)
    protected String firstName;
    @XmlElement(name = "ForecastEnabled", nillable = true)
    protected Boolean forecastEnabled;
    @XmlElement(name = "Formal_First_Name__c", nillable = true)
    protected String formalFirstNameC;
    @XmlElement(name = "FullPhotoUrl", nillable = true)
    protected String fullPhotoUrl;
    @XmlElement(name = "Hire_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar hireDateC;
    @XmlElement(name = "Imp_Pricebook_Id__c", nillable = true)
    protected String impPricebookIdC;
    @XmlElement(name = "Imp_Pricebook_Name__c", nillable = true)
    protected String impPricebookNameC;
    @XmlElement(name = "IsActive", nillable = true)
    protected Boolean isActive;
    @XmlElement(name = "Is_Large_CP_Collapse_Default__c", nillable = true)
    protected Boolean isLargeCPCollapseDefaultC;
    @XmlElement(name = "KenTests1__r", nillable = true)
    protected QueryResult kenTests1R;
    @XmlElement(name = "KenTests__r", nillable = true)
    protected QueryResult kenTestsR;
    @XmlElement(name = "LT_Assets1__r", nillable = true)
    protected QueryResult ltAssets1R;
    @XmlElement(name = "LT_Assets2__r", nillable = true)
    protected QueryResult ltAssets2R;
    @XmlElement(name = "LT_Assets__r", nillable = true)
    protected QueryResult ltAssetsR;
    @XmlElement(name = "LanguageLocaleKey", nillable = true)
    protected String languageLocaleKey;
    @XmlElement(name = "LastLoginDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLoginDate;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "LastName", nillable = true)
    protected String lastName;
    @XmlElement(name = "LinkPoint360__c", nillable = true)
    protected Boolean linkPoint360C;
    @XmlElement(name = "LocaleSidKey", nillable = true)
    protected String localeSidKey;
    @XmlElement(name = "Manager", nillable = true)
    protected UserType manager;
    @XmlElement(name = "ManagerId", nillable = true)
    protected String managerId;
    @XmlElement(name = "Market_Abbreviation__c", nillable = true)
    protected String marketAbbreviationC;
    @XmlElement(name = "Market_Comments__r", nillable = true)
    protected QueryResult marketCommentsR;
    @XmlElement(name = "Market_Description__c", nillable = true)
    protected String marketDescriptionC;
    @XmlElement(name = "Market__c", nillable = true)
    protected String marketC;
    @XmlElement(name = "Max_Ratio__c", nillable = true)
    protected Double maxRatioC;
    @XmlElement(name = "MobilePhone", nillable = true)
    protected String mobilePhone;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "OIRs1__r", nillable = true)
    protected QueryResult oiRs1R;
    @XmlElement(name = "OIRs__r", nillable = true)
    protected QueryResult oiRsR;
    @XmlElement(name = "OfflinePdaTrialExpirationDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offlinePdaTrialExpirationDate;
    @XmlElement(name = "OfflineTrialExpirationDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offlineTrialExpirationDate;
    @XmlElement(name = "Opp_Pricebook_Id__c", nillable = true)
    protected String oppPricebookIdC;
    @XmlElement(name = "Opp_Pricebook_Name__c", nillable = true)
    protected String oppPricebookNameC;
    @XmlElement(name = "Opportunities1__r", nillable = true)
    protected QueryResult opportunities1R;
    @XmlElement(name = "Opportunities__r", nillable = true)
    protected QueryResult opportunitiesR;
    @XmlElement(name = "OpportunityTeams", nillable = true)
    protected QueryResult opportunityTeams;
    @XmlElement(name = "Opps_Orders_Proposals1__r", nillable = true)
    protected QueryResult oppsOrdersProposals1R;
    @XmlElement(name = "Opps_Orders_Proposals2__r", nillable = true)
    protected QueryResult oppsOrdersProposals2R;
    @XmlElement(name = "Opps_Orders_Proposals__r", nillable = true)
    protected QueryResult oppsOrdersProposalsR;
    @XmlElement(name = "OrderedByOpportunities__r", nillable = true)
    protected QueryResult orderedByOpportunitiesR;
    @XmlElement(name = "Pass_Override_Id__c", nillable = true)
    protected Boolean passOverrideIdC;
    @XmlElement(name = "Phone", nillable = true)
    protected String phone;
    @XmlElement(name = "PostalCode", nillable = true)
    protected String postalCode;
    @XmlElement(name = "Profile", nillable = true)
    protected ProfileType profile;
    @XmlElement(name = "ProfileId", nillable = true)
    protected String profileId;
    @XmlElement(name = "Project_Plan_Resources__r", nillable = true)
    protected QueryResult projectPlanResourcesR;
    @XmlElement(name = "R00N60000001PRPbEAO__r", nillable = true)
    protected QueryResult r00N60000001PRPbEAOR;
    @XmlElement(name = "ReceivesAdminInfoEmails", nillable = true)
    protected Boolean receivesAdminInfoEmails;
    @XmlElement(name = "ReceivesInfoEmails", nillable = true)
    protected Boolean receivesInfoEmails;
    @XmlElement(name = "Region_Group__c", nillable = true)
    protected String regionGroupC;
    @XmlElement(name = "Region_Scheduler_Maps__r", nillable = true)
    protected QueryResult regionSchedulerMapsR;
    @XmlElement(name = "Region__c", nillable = true)
    protected String regionC;
    @XmlElement(name = "SAP_Customer__c", nillable = true)
    protected String sapCustomerC;
    @XmlElement(name = "SAP_Territory_Id__c", nillable = true)
    protected String sapTerritoryIdC;
    @XmlElement(name = "SAP_User_ID__c", nillable = true)
    protected String sapUserIDC;
    @XmlElement(name = "Sample_Pricebook_Id__c", nillable = true)
    protected String samplePricebookIdC;
    @XmlElement(name = "Sample_Pricebook_Name__c", nillable = true)
    protected String samplePricebookNameC;
    @XmlElement(name = "Schedulable_Consultant__c", nillable = true)
    protected Boolean schedulableConsultantC;
    @XmlElement(name = "SchedulerServiceRequestForms__r", nillable = true)
    protected QueryResult schedulerServiceRequestFormsR;
    @XmlElement(name = "ServiceRequestTentativeAttendees1__r", nillable = true)
    protected QueryResult serviceRequestTentativeAttendees1R;
    @XmlElement(name = "ServiceRequestTentativeAttendees__r", nillable = true)
    protected QueryResult serviceRequestTentativeAttendeesR;
    @XmlElement(name = "SkillsTutor_Email_Alert_Flag__c", nillable = true)
    protected Boolean skillsTutorEmailAlertFlagC;
    @XmlElement(name = "SkillsTutor_User__c", nillable = true)
    protected Boolean skillsTutorUserC;
    @XmlElement(name = "SmallPhotoUrl", nillable = true)
    protected String smallPhotoUrl;
    @XmlElement(name = "Snapshot_Users__r", nillable = true)
    protected QueryResult snapshotUsersR;
    @XmlElement(name = "State", nillable = true)
    protected String state;
    @XmlElement(name = "Street", nillable = true)
    protected String street;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Territory_Desciption__c", nillable = true)
    protected String territoryDesciptionC;
    @XmlElement(name = "Territory_Description__c", nillable = true)
    protected String territoryDescriptionC;
    @XmlElement(name = "Territory_Financial_Details__r", nillable = true)
    protected QueryResult territoryFinancialDetailsR;
    @XmlElement(name = "TimeZoneSidKey", nillable = true)
    protected String timeZoneSidKey;
    @XmlElement(name = "Title", nillable = true)
    protected String title;
    @XmlElement(name = "Unassigned_Sales__r", nillable = true)
    protected QueryResult unassignedSalesR;
    @XmlElement(name = "Use_CP_Alternate_Subtotal_Format__c", nillable = true)
    protected Boolean useCPAlternateSubtotalFormatC;
    @XmlElement(name = "UserAccountTeams", nillable = true)
    protected QueryResult userAccountTeams;
    @XmlElement(name = "UserPermissionsAvantgoUser", nillable = true)
    protected Boolean userPermissionsAvantgoUser;
    @XmlElement(name = "UserPermissionsCallCenterAutoLogin", nillable = true)
    protected Boolean userPermissionsCallCenterAutoLogin;
    @XmlElement(name = "UserPermissionsMarketingUser", nillable = true)
    protected Boolean userPermissionsMarketingUser;
    @XmlElement(name = "UserPermissionsMobileUser", nillable = true)
    protected Boolean userPermissionsMobileUser;
    @XmlElement(name = "UserPermissionsOfflineUser", nillable = true)
    protected Boolean userPermissionsOfflineUser;
    @XmlElement(name = "UserPermissionsSFContentUser", nillable = true)
    protected Boolean userPermissionsSFContentUser;
    @XmlElement(name = "UserPreferences", nillable = true)
    protected QueryResult userPreferences;
    @XmlElement(name = "UserPreferencesActivityRemindersPopup", nillable = true)
    protected Boolean userPreferencesActivityRemindersPopup;
    @XmlElement(name = "UserPreferencesApexPagesDeveloperMode", nillable = true)
    protected Boolean userPreferencesApexPagesDeveloperMode;
    @XmlElement(name = "UserPreferencesDisableAutoSubForFeeds", nillable = true)
    protected Boolean userPreferencesDisableAutoSubForFeeds;
    @XmlElement(name = "UserPreferencesEventRemindersCheckboxDefault", nillable = true)
    protected Boolean userPreferencesEventRemindersCheckboxDefault;
    @XmlElement(name = "UserPreferencesReminderSoundOff", nillable = true)
    protected Boolean userPreferencesReminderSoundOff;
    @XmlElement(name = "UserPreferencesTaskRemindersCheckboxDefault", nillable = true)
    protected Boolean userPreferencesTaskRemindersCheckboxDefault;
    @XmlElement(name = "UserRole", nillable = true)
    protected UserRoleType userRole;
    @XmlElement(name = "UserRoleId", nillable = true)
    protected String userRoleId;
    @XmlElement(name = "UserTeams", nillable = true)
    protected QueryResult userTeams;
    @XmlElement(name = "UserType", nillable = true)
    protected String userType;
    @XmlElement(name = "User_Account_ID__c", nillable = true)
    protected String userAccountIDC;
    @XmlElement(name = "Username", nillable = true)
    protected String username;
    @XmlElement(name = "Windows_Login_ID__c", nillable = true)
    protected String windowsLoginIDC;
    @XmlElement(name = "isRepLocatorInvisible__c", nillable = true)
    protected Boolean isRepLocatorInvisibleC;
    @XmlElement(name = "ities_msg__Manage_Home_Page_Messages__c", nillable = true)
    protected Boolean itiesMsgManageHomePageMessagesC;

    /**
     * Gets the value of the aboutMe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAboutMe() {
        return aboutMe;
    }

    /**
     * Sets the value of the aboutMe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAboutMe(String value) {
        this.aboutMe = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountTeams property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getAccountTeams() {
        return accountTeams;
    }

    /**
     * Sets the value of the accountTeams property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setAccountTeams(QueryResult value) {
        this.accountTeams = value;
    }

    /**
     * Gets the value of the account_Group__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount_Group__C() {
        return accountGroupC;
    }

    /**
     * Sets the value of the account_Group__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount_Group__C(String value) {
        this.accountGroupC = value;
    }

    /**
     * Gets the value of the accounts1__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getAccounts1__R() {
        return accounts1R;
    }

    /**
     * Sets the value of the accounts1__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setAccounts1__R(QueryResult value) {
        this.accounts1R = value;
    }

    /**
     * Gets the value of the accounts2__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getAccounts2__R() {
        return accounts2R;
    }

    /**
     * Sets the value of the accounts2__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setAccounts2__R(QueryResult value) {
        this.accounts2R = value;
    }

    /**
     * Gets the value of the accounts__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getAccounts__R() {
        return accountsR;
    }

    /**
     * Sets the value of the accounts__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setAccounts__R(QueryResult value) {
        this.accountsR = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the approve_Sample_Limit_Overages__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApprove_Sample_Limit_Overages__C() {
        return approveSampleLimitOveragesC;
    }

    /**
     * Sets the value of the approve_Sample_Limit_Overages__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApprove_Sample_Limit_Overages__C(Boolean value) {
        this.approveSampleLimitOveragesC = value;
    }

    /**
     * Gets the value of the bcc_Notification_Email__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBCC_Notification_Email__C() {
        return bccNotificationEmailC;
    }

    /**
     * Sets the value of the bcc_Notification_Email__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBCC_Notification_Email__C(Boolean value) {
        this.bccNotificationEmailC = value;
    }

    /**
     * Gets the value of the cp_Allow_Substitutions_Checkbox__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCP_Allow_Substitutions_Checkbox__C() {
        return cpAllowSubstitutionsCheckboxC;
    }

    /**
     * Sets the value of the cp_Allow_Substitutions_Checkbox__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCP_Allow_Substitutions_Checkbox__C(Boolean value) {
        this.cpAllowSubstitutionsCheckboxC = value;
    }

    /**
     * Gets the value of the cp_Close_Date_Default__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCP_Close_Date_Default__C() {
        return cpCloseDateDefaultC;
    }

    /**
     * Sets the value of the cp_Close_Date_Default__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCP_Close_Date_Default__C(XMLGregorianCalendar value) {
        this.cpCloseDateDefaultC = value;
    }

    /**
     * Gets the value of the cp_Expiration_Date_Default__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCP_Expiration_Date_Default__C() {
        return cpExpirationDateDefaultC;
    }

    /**
     * Sets the value of the cp_Expiration_Date_Default__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCP_Expiration_Date_Default__C(XMLGregorianCalendar value) {
        this.cpExpirationDateDefaultC = value;
    }

    /**
     * Gets the value of the cp_Print_Tax_Default__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCP_Print_Tax_Default__C() {
        return cpPrintTaxDefaultC;
    }

    /**
     * Sets the value of the cp_Print_Tax_Default__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCP_Print_Tax_Default__C(Boolean value) {
        this.cpPrintTaxDefaultC = value;
    }

    /**
     * Gets the value of the cp_Search_State__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCP_Search_State__C() {
        return cpSearchStateC;
    }

    /**
     * Sets the value of the cp_Search_State__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCP_Search_State__C(String value) {
        this.cpSearchStateC = value;
    }

    /**
     * Gets the value of the callCenterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCenterId() {
        return callCenterId;
    }

    /**
     * Sets the value of the callCenterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCenterId(String value) {
        this.callCenterId = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the communityNickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunityNickname() {
        return communityNickname;
    }

    /**
     * Sets the value of the communityNickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunityNickname(String value) {
        this.communityNickname = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the consultant_Skill_Set__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultant_Skill_Set__C() {
        return consultantSkillSetC;
    }

    /**
     * Sets the value of the consultant_Skill_Set__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultant_Skill_Set__C(String value) {
        this.consultantSkillSetC = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setContact(ContactType value) {
        this.contact = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the contacts__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getContacts__R() {
        return contactsR;
    }

    /**
     * Sets the value of the contacts__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setContacts__R(QueryResult value) {
        this.contactsR = value;
    }

    /**
     * Gets the value of the contractsSigned property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getContractsSigned() {
        return contractsSigned;
    }

    /**
     * Sets the value of the contractsSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setContractsSigned(QueryResult value) {
        this.contractsSigned = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

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
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStatus(String value) {
        this.currentStatus = value;
    }

    /**
     * Gets the value of the defaultDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultDivision() {
        return defaultDivision;
    }

    /**
     * Sets the value of the defaultDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultDivision(String value) {
        this.defaultDivision = value;
    }

    /**
     * Gets the value of the defaultGroupNotificationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultGroupNotificationFrequency() {
        return defaultGroupNotificationFrequency;
    }

    /**
     * Sets the value of the defaultGroupNotificationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultGroupNotificationFrequency(String value) {
        this.defaultGroupNotificationFrequency = value;
    }

    /**
     * Gets the value of the default_Shipping_To_SAP__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefault_Shipping_To_SAP__C() {
        return defaultShippingToSAPC;
    }

    /**
     * Sets the value of the default_Shipping_To_SAP__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefault_Shipping_To_SAP__C(Boolean value) {
        this.defaultShippingToSAPC = value;
    }

    /**
     * Gets the value of the delegatedApproverId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegatedApproverId() {
        return delegatedApproverId;
    }

    /**
     * Sets the value of the delegatedApproverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegatedApproverId(String value) {
        this.delegatedApproverId = value;
    }

    /**
     * Gets the value of the delegatedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getDelegatedUsers() {
        return delegatedUsers;
    }

    /**
     * Sets the value of the delegatedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setDelegatedUsers(QueryResult value) {
        this.delegatedUsers = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the digestFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestFrequency() {
        return digestFrequency;
    }

    /**
     * Sets the value of the digestFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestFrequency(String value) {
        this.digestFrequency = value;
    }

    /**
     * Gets the value of the district__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict__C() {
        return districtC;
    }

    /**
     * Sets the value of the district__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict__C(String value) {
        this.districtC = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the do_Not_Deactivate__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDo_Not_Deactivate__C() {
        return doNotDeactivateC;
    }

    /**
     * Sets the value of the do_Not_Deactivate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDo_Not_Deactivate__C(Boolean value) {
        this.doNotDeactivateC = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the emailEncodingKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailEncodingKey() {
        return emailEncodingKey;
    }

    /**
     * Sets the value of the emailEncodingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailEncodingKey(String value) {
        this.emailEncodingKey = value;
    }

    /**
     * Gets the value of the employeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the value of the employeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNumber(String value) {
        this.employeeNumber = value;
    }

    /**
     * Gets the value of the employee_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployee_ID__C() {
        return employeeIDC;
    }

    /**
     * Sets the value of the employee_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployee_ID__C(String value) {
        this.employeeIDC = value;
    }

    /**
     * Gets the value of the enterprise_User__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnterprise_User__C() {
        return enterpriseUserC;
    }

    /**
     * Sets the value of the enterprise_User__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnterprise_User__C(Boolean value) {
        this.enterpriseUserC = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the federationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederationIdentifier() {
        return federationIdentifier;
    }

    /**
     * Sets the value of the federationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederationIdentifier(String value) {
        this.federationIdentifier = value;
    }

    /**
     * Gets the value of the feedSubscriptions property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getFeedSubscriptions() {
        return feedSubscriptions;
    }

    /**
     * Sets the value of the feedSubscriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setFeedSubscriptions(QueryResult value) {
        this.feedSubscriptions = value;
    }

    /**
     * Gets the value of the feedSubscriptionsForEntity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }

    /**
     * Sets the value of the feedSubscriptionsForEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setFeedSubscriptionsForEntity(QueryResult value) {
        this.feedSubscriptionsForEntity = value;
    }

    /**
     * Gets the value of the feeds property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getFeeds() {
        return feeds;
    }

    /**
     * Sets the value of the feeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setFeeds(QueryResult value) {
        this.feeds = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the forecastEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForecastEnabled() {
        return forecastEnabled;
    }

    /**
     * Sets the value of the forecastEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecastEnabled(Boolean value) {
        this.forecastEnabled = value;
    }

    /**
     * Gets the value of the formal_First_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormal_First_Name__C() {
        return formalFirstNameC;
    }

    /**
     * Sets the value of the formal_First_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormal_First_Name__C(String value) {
        this.formalFirstNameC = value;
    }

    /**
     * Gets the value of the fullPhotoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullPhotoUrl() {
        return fullPhotoUrl;
    }

    /**
     * Sets the value of the fullPhotoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullPhotoUrl(String value) {
        this.fullPhotoUrl = value;
    }

    /**
     * Gets the value of the hire_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHire_Date__C() {
        return hireDateC;
    }

    /**
     * Sets the value of the hire_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHire_Date__C(XMLGregorianCalendar value) {
        this.hireDateC = value;
    }

    /**
     * Gets the value of the imp_Pricebook_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImp_Pricebook_Id__C() {
        return impPricebookIdC;
    }

    /**
     * Sets the value of the imp_Pricebook_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImp_Pricebook_Id__C(String value) {
        this.impPricebookIdC = value;
    }

    /**
     * Gets the value of the imp_Pricebook_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImp_Pricebook_Name__C() {
        return impPricebookNameC;
    }

    /**
     * Sets the value of the imp_Pricebook_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImp_Pricebook_Name__C(String value) {
        this.impPricebookNameC = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the is_Large_CP_Collapse_Default__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIs_Large_CP_Collapse_Default__C() {
        return isLargeCPCollapseDefaultC;
    }

    /**
     * Sets the value of the is_Large_CP_Collapse_Default__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIs_Large_CP_Collapse_Default__C(Boolean value) {
        this.isLargeCPCollapseDefaultC = value;
    }

    /**
     * Gets the value of the kenTests1__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getKenTests1__R() {
        return kenTests1R;
    }

    /**
     * Sets the value of the kenTests1__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setKenTests1__R(QueryResult value) {
        this.kenTests1R = value;
    }

    /**
     * Gets the value of the kenTests__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getKenTests__R() {
        return kenTestsR;
    }

    /**
     * Sets the value of the kenTests__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setKenTests__R(QueryResult value) {
        this.kenTestsR = value;
    }

    /**
     * Gets the value of the lt_Assets1__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getLT_Assets1__R() {
        return ltAssets1R;
    }

    /**
     * Sets the value of the lt_Assets1__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setLT_Assets1__R(QueryResult value) {
        this.ltAssets1R = value;
    }

    /**
     * Gets the value of the lt_Assets2__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getLT_Assets2__R() {
        return ltAssets2R;
    }

    /**
     * Sets the value of the lt_Assets2__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setLT_Assets2__R(QueryResult value) {
        this.ltAssets2R = value;
    }

    /**
     * Gets the value of the lt_Assets__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getLT_Assets__R() {
        return ltAssetsR;
    }

    /**
     * Sets the value of the lt_Assets__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setLT_Assets__R(QueryResult value) {
        this.ltAssetsR = value;
    }

    /**
     * Gets the value of the languageLocaleKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageLocaleKey() {
        return languageLocaleKey;
    }

    /**
     * Sets the value of the languageLocaleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageLocaleKey(String value) {
        this.languageLocaleKey = value;
    }

    /**
     * Gets the value of the lastLoginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * Sets the value of the lastLoginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLoginDate(XMLGregorianCalendar value) {
        this.lastLoginDate = value;
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
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the linkPoint360__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLinkPoint360__C() {
        return linkPoint360C;
    }

    /**
     * Sets the value of the linkPoint360__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLinkPoint360__C(Boolean value) {
        this.linkPoint360C = value;
    }

    /**
     * Gets the value of the localeSidKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleSidKey() {
        return localeSidKey;
    }

    /**
     * Sets the value of the localeSidKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleSidKey(String value) {
        this.localeSidKey = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setManager(UserType value) {
        this.manager = value;
    }

    /**
     * Gets the value of the managerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * Sets the value of the managerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerId(String value) {
        this.managerId = value;
    }

    /**
     * Gets the value of the market_Abbreviation__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarket_Abbreviation__C() {
        return marketAbbreviationC;
    }

    /**
     * Sets the value of the market_Abbreviation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarket_Abbreviation__C(String value) {
        this.marketAbbreviationC = value;
    }

    /**
     * Gets the value of the market_Comments__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getMarket_Comments__R() {
        return marketCommentsR;
    }

    /**
     * Sets the value of the market_Comments__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setMarket_Comments__R(QueryResult value) {
        this.marketCommentsR = value;
    }

    /**
     * Gets the value of the market_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarket_Description__C() {
        return marketDescriptionC;
    }

    /**
     * Sets the value of the market_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarket_Description__C(String value) {
        this.marketDescriptionC = value;
    }

    /**
     * Gets the value of the market__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarket__C() {
        return marketC;
    }

    /**
     * Sets the value of the market__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarket__C(String value) {
        this.marketC = value;
    }

    /**
     * Gets the value of the max_Ratio__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMax_Ratio__C() {
        return maxRatioC;
    }

    /**
     * Sets the value of the max_Ratio__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMax_Ratio__C(Double value) {
        this.maxRatioC = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
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
     * Gets the value of the oiRs1__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOIRs1__R() {
        return oiRs1R;
    }

    /**
     * Sets the value of the oiRs1__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOIRs1__R(QueryResult value) {
        this.oiRs1R = value;
    }

    /**
     * Gets the value of the oiRs__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOIRs__R() {
        return oiRsR;
    }

    /**
     * Sets the value of the oiRs__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOIRs__R(QueryResult value) {
        this.oiRsR = value;
    }

    /**
     * Gets the value of the offlinePdaTrialExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOfflinePdaTrialExpirationDate() {
        return offlinePdaTrialExpirationDate;
    }

    /**
     * Sets the value of the offlinePdaTrialExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOfflinePdaTrialExpirationDate(XMLGregorianCalendar value) {
        this.offlinePdaTrialExpirationDate = value;
    }

    /**
     * Gets the value of the offlineTrialExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOfflineTrialExpirationDate() {
        return offlineTrialExpirationDate;
    }

    /**
     * Sets the value of the offlineTrialExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOfflineTrialExpirationDate(XMLGregorianCalendar value) {
        this.offlineTrialExpirationDate = value;
    }

    /**
     * Gets the value of the opp_Pricebook_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpp_Pricebook_Id__C() {
        return oppPricebookIdC;
    }

    /**
     * Sets the value of the opp_Pricebook_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpp_Pricebook_Id__C(String value) {
        this.oppPricebookIdC = value;
    }

    /**
     * Gets the value of the opp_Pricebook_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpp_Pricebook_Name__C() {
        return oppPricebookNameC;
    }

    /**
     * Sets the value of the opp_Pricebook_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpp_Pricebook_Name__C(String value) {
        this.oppPricebookNameC = value;
    }

    /**
     * Gets the value of the opportunities1__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpportunities1__R() {
        return opportunities1R;
    }

    /**
     * Sets the value of the opportunities1__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpportunities1__R(QueryResult value) {
        this.opportunities1R = value;
    }

    /**
     * Gets the value of the opportunities__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpportunities__R() {
        return opportunitiesR;
    }

    /**
     * Sets the value of the opportunities__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpportunities__R(QueryResult value) {
        this.opportunitiesR = value;
    }

    /**
     * Gets the value of the opportunityTeams property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpportunityTeams() {
        return opportunityTeams;
    }

    /**
     * Sets the value of the opportunityTeams property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpportunityTeams(QueryResult value) {
        this.opportunityTeams = value;
    }

    /**
     * Gets the value of the opps_Orders_Proposals1__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpps_Orders_Proposals1__R() {
        return oppsOrdersProposals1R;
    }

    /**
     * Sets the value of the opps_Orders_Proposals1__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpps_Orders_Proposals1__R(QueryResult value) {
        this.oppsOrdersProposals1R = value;
    }

    /**
     * Gets the value of the opps_Orders_Proposals2__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpps_Orders_Proposals2__R() {
        return oppsOrdersProposals2R;
    }

    /**
     * Sets the value of the opps_Orders_Proposals2__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpps_Orders_Proposals2__R(QueryResult value) {
        this.oppsOrdersProposals2R = value;
    }

    /**
     * Gets the value of the opps_Orders_Proposals__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpps_Orders_Proposals__R() {
        return oppsOrdersProposalsR;
    }

    /**
     * Sets the value of the opps_Orders_Proposals__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpps_Orders_Proposals__R(QueryResult value) {
        this.oppsOrdersProposalsR = value;
    }

    /**
     * Gets the value of the orderedByOpportunities__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOrderedByOpportunities__R() {
        return orderedByOpportunitiesR;
    }

    /**
     * Sets the value of the orderedByOpportunities__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOrderedByOpportunities__R(QueryResult value) {
        this.orderedByOpportunitiesR = value;
    }

    /**
     * Gets the value of the pass_Override_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPass_Override_Id__C() {
        return passOverrideIdC;
    }

    /**
     * Sets the value of the pass_Override_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPass_Override_Id__C(Boolean value) {
        this.passOverrideIdC = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileType }
     *     
     */
    public ProfileType getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileType }
     *     
     */
    public void setProfile(ProfileType value) {
        this.profile = value;
    }

    /**
     * Gets the value of the profileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileId(String value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the project_Plan_Resources__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getProject_Plan_Resources__R() {
        return projectPlanResourcesR;
    }

    /**
     * Sets the value of the project_Plan_Resources__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setProject_Plan_Resources__R(QueryResult value) {
        this.projectPlanResourcesR = value;
    }

    /**
     * Gets the value of the r00N60000001PRPbEAO__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getR00N60000001PRPbEAO__R() {
        return r00N60000001PRPbEAOR;
    }

    /**
     * Sets the value of the r00N60000001PRPbEAO__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setR00N60000001PRPbEAO__R(QueryResult value) {
        this.r00N60000001PRPbEAOR = value;
    }

    /**
     * Gets the value of the receivesAdminInfoEmails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceivesAdminInfoEmails() {
        return receivesAdminInfoEmails;
    }

    /**
     * Sets the value of the receivesAdminInfoEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceivesAdminInfoEmails(Boolean value) {
        this.receivesAdminInfoEmails = value;
    }

    /**
     * Gets the value of the receivesInfoEmails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceivesInfoEmails() {
        return receivesInfoEmails;
    }

    /**
     * Sets the value of the receivesInfoEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceivesInfoEmails(Boolean value) {
        this.receivesInfoEmails = value;
    }

    /**
     * Gets the value of the region_Group__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion_Group__C() {
        return regionGroupC;
    }

    /**
     * Sets the value of the region_Group__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion_Group__C(String value) {
        this.regionGroupC = value;
    }

    /**
     * Gets the value of the region_Scheduler_Maps__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getRegion_Scheduler_Maps__R() {
        return regionSchedulerMapsR;
    }

    /**
     * Sets the value of the region_Scheduler_Maps__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setRegion_Scheduler_Maps__R(QueryResult value) {
        this.regionSchedulerMapsR = value;
    }

    /**
     * Gets the value of the region__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion__C() {
        return regionC;
    }

    /**
     * Sets the value of the region__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion__C(String value) {
        this.regionC = value;
    }

    /**
     * Gets the value of the sap_Customer__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Customer__C() {
        return sapCustomerC;
    }

    /**
     * Sets the value of the sap_Customer__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Customer__C(String value) {
        this.sapCustomerC = value;
    }

    /**
     * Gets the value of the sap_Territory_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Territory_Id__C() {
        return sapTerritoryIdC;
    }

    /**
     * Sets the value of the sap_Territory_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Territory_Id__C(String value) {
        this.sapTerritoryIdC = value;
    }

    /**
     * Gets the value of the sap_User_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_User_ID__C() {
        return sapUserIDC;
    }

    /**
     * Sets the value of the sap_User_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_User_ID__C(String value) {
        this.sapUserIDC = value;
    }

    /**
     * Gets the value of the sample_Pricebook_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSample_Pricebook_Id__C() {
        return samplePricebookIdC;
    }

    /**
     * Sets the value of the sample_Pricebook_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSample_Pricebook_Id__C(String value) {
        this.samplePricebookIdC = value;
    }

    /**
     * Gets the value of the sample_Pricebook_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSample_Pricebook_Name__C() {
        return samplePricebookNameC;
    }

    /**
     * Sets the value of the sample_Pricebook_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSample_Pricebook_Name__C(String value) {
        this.samplePricebookNameC = value;
    }

    /**
     * Gets the value of the schedulable_Consultant__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSchedulable_Consultant__C() {
        return schedulableConsultantC;
    }

    /**
     * Sets the value of the schedulable_Consultant__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSchedulable_Consultant__C(Boolean value) {
        this.schedulableConsultantC = value;
    }

    /**
     * Gets the value of the schedulerServiceRequestForms__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getSchedulerServiceRequestForms__R() {
        return schedulerServiceRequestFormsR;
    }

    /**
     * Sets the value of the schedulerServiceRequestForms__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setSchedulerServiceRequestForms__R(QueryResult value) {
        this.schedulerServiceRequestFormsR = value;
    }

    /**
     * Gets the value of the serviceRequestTentativeAttendees1__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getServiceRequestTentativeAttendees1__R() {
        return serviceRequestTentativeAttendees1R;
    }

    /**
     * Sets the value of the serviceRequestTentativeAttendees1__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setServiceRequestTentativeAttendees1__R(QueryResult value) {
        this.serviceRequestTentativeAttendees1R = value;
    }

    /**
     * Gets the value of the serviceRequestTentativeAttendees__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getServiceRequestTentativeAttendees__R() {
        return serviceRequestTentativeAttendeesR;
    }

    /**
     * Sets the value of the serviceRequestTentativeAttendees__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setServiceRequestTentativeAttendees__R(QueryResult value) {
        this.serviceRequestTentativeAttendeesR = value;
    }

    /**
     * Gets the value of the skillsTutor_Email_Alert_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkillsTutor_Email_Alert_Flag__C() {
        return skillsTutorEmailAlertFlagC;
    }

    /**
     * Sets the value of the skillsTutor_Email_Alert_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkillsTutor_Email_Alert_Flag__C(Boolean value) {
        this.skillsTutorEmailAlertFlagC = value;
    }

    /**
     * Gets the value of the skillsTutor_User__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkillsTutor_User__C() {
        return skillsTutorUserC;
    }

    /**
     * Sets the value of the skillsTutor_User__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkillsTutor_User__C(Boolean value) {
        this.skillsTutorUserC = value;
    }

    /**
     * Gets the value of the smallPhotoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmallPhotoUrl() {
        return smallPhotoUrl;
    }

    /**
     * Sets the value of the smallPhotoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmallPhotoUrl(String value) {
        this.smallPhotoUrl = value;
    }

    /**
     * Gets the value of the snapshot_Users__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getSnapshot_Users__R() {
        return snapshotUsersR;
    }

    /**
     * Sets the value of the snapshot_Users__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setSnapshot_Users__R(QueryResult value) {
        this.snapshotUsersR = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
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
     * Gets the value of the territory_Desciption__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory_Desciption__C() {
        return territoryDesciptionC;
    }

    /**
     * Sets the value of the territory_Desciption__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory_Desciption__C(String value) {
        this.territoryDesciptionC = value;
    }

    /**
     * Gets the value of the territory_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory_Description__C() {
        return territoryDescriptionC;
    }

    /**
     * Sets the value of the territory_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory_Description__C(String value) {
        this.territoryDescriptionC = value;
    }

    /**
     * Gets the value of the territory_Financial_Details__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getTerritory_Financial_Details__R() {
        return territoryFinancialDetailsR;
    }

    /**
     * Sets the value of the territory_Financial_Details__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setTerritory_Financial_Details__R(QueryResult value) {
        this.territoryFinancialDetailsR = value;
    }

    /**
     * Gets the value of the timeZoneSidKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneSidKey() {
        return timeZoneSidKey;
    }

    /**
     * Sets the value of the timeZoneSidKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneSidKey(String value) {
        this.timeZoneSidKey = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the unassigned_Sales__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getUnassigned_Sales__R() {
        return unassignedSalesR;
    }

    /**
     * Sets the value of the unassigned_Sales__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setUnassigned_Sales__R(QueryResult value) {
        this.unassignedSalesR = value;
    }

    /**
     * Gets the value of the use_CP_Alternate_Subtotal_Format__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUse_CP_Alternate_Subtotal_Format__C() {
        return useCPAlternateSubtotalFormatC;
    }

    /**
     * Sets the value of the use_CP_Alternate_Subtotal_Format__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUse_CP_Alternate_Subtotal_Format__C(Boolean value) {
        this.useCPAlternateSubtotalFormatC = value;
    }

    /**
     * Gets the value of the userAccountTeams property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getUserAccountTeams() {
        return userAccountTeams;
    }

    /**
     * Sets the value of the userAccountTeams property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setUserAccountTeams(QueryResult value) {
        this.userAccountTeams = value;
    }

    /**
     * Gets the value of the userPermissionsAvantgoUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPermissionsAvantgoUser() {
        return userPermissionsAvantgoUser;
    }

    /**
     * Sets the value of the userPermissionsAvantgoUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPermissionsAvantgoUser(Boolean value) {
        this.userPermissionsAvantgoUser = value;
    }

    /**
     * Gets the value of the userPermissionsCallCenterAutoLogin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPermissionsCallCenterAutoLogin() {
        return userPermissionsCallCenterAutoLogin;
    }

    /**
     * Sets the value of the userPermissionsCallCenterAutoLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPermissionsCallCenterAutoLogin(Boolean value) {
        this.userPermissionsCallCenterAutoLogin = value;
    }

    /**
     * Gets the value of the userPermissionsMarketingUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPermissionsMarketingUser() {
        return userPermissionsMarketingUser;
    }

    /**
     * Sets the value of the userPermissionsMarketingUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPermissionsMarketingUser(Boolean value) {
        this.userPermissionsMarketingUser = value;
    }

    /**
     * Gets the value of the userPermissionsMobileUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPermissionsMobileUser() {
        return userPermissionsMobileUser;
    }

    /**
     * Sets the value of the userPermissionsMobileUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPermissionsMobileUser(Boolean value) {
        this.userPermissionsMobileUser = value;
    }

    /**
     * Gets the value of the userPermissionsOfflineUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPermissionsOfflineUser() {
        return userPermissionsOfflineUser;
    }

    /**
     * Sets the value of the userPermissionsOfflineUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPermissionsOfflineUser(Boolean value) {
        this.userPermissionsOfflineUser = value;
    }

    /**
     * Gets the value of the userPermissionsSFContentUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPermissionsSFContentUser() {
        return userPermissionsSFContentUser;
    }

    /**
     * Sets the value of the userPermissionsSFContentUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPermissionsSFContentUser(Boolean value) {
        this.userPermissionsSFContentUser = value;
    }

    /**
     * Gets the value of the userPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getUserPreferences() {
        return userPreferences;
    }

    /**
     * Sets the value of the userPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setUserPreferences(QueryResult value) {
        this.userPreferences = value;
    }

    /**
     * Gets the value of the userPreferencesActivityRemindersPopup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesActivityRemindersPopup() {
        return userPreferencesActivityRemindersPopup;
    }

    /**
     * Sets the value of the userPreferencesActivityRemindersPopup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesActivityRemindersPopup(Boolean value) {
        this.userPreferencesActivityRemindersPopup = value;
    }

    /**
     * Gets the value of the userPreferencesApexPagesDeveloperMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesApexPagesDeveloperMode() {
        return userPreferencesApexPagesDeveloperMode;
    }

    /**
     * Sets the value of the userPreferencesApexPagesDeveloperMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesApexPagesDeveloperMode(Boolean value) {
        this.userPreferencesApexPagesDeveloperMode = value;
    }

    /**
     * Gets the value of the userPreferencesDisableAutoSubForFeeds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesDisableAutoSubForFeeds() {
        return userPreferencesDisableAutoSubForFeeds;
    }

    /**
     * Sets the value of the userPreferencesDisableAutoSubForFeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesDisableAutoSubForFeeds(Boolean value) {
        this.userPreferencesDisableAutoSubForFeeds = value;
    }

    /**
     * Gets the value of the userPreferencesEventRemindersCheckboxDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesEventRemindersCheckboxDefault() {
        return userPreferencesEventRemindersCheckboxDefault;
    }

    /**
     * Sets the value of the userPreferencesEventRemindersCheckboxDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesEventRemindersCheckboxDefault(Boolean value) {
        this.userPreferencesEventRemindersCheckboxDefault = value;
    }

    /**
     * Gets the value of the userPreferencesReminderSoundOff property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesReminderSoundOff() {
        return userPreferencesReminderSoundOff;
    }

    /**
     * Sets the value of the userPreferencesReminderSoundOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesReminderSoundOff(Boolean value) {
        this.userPreferencesReminderSoundOff = value;
    }

    /**
     * Gets the value of the userPreferencesTaskRemindersCheckboxDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesTaskRemindersCheckboxDefault() {
        return userPreferencesTaskRemindersCheckboxDefault;
    }

    /**
     * Sets the value of the userPreferencesTaskRemindersCheckboxDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesTaskRemindersCheckboxDefault(Boolean value) {
        this.userPreferencesTaskRemindersCheckboxDefault = value;
    }

    /**
     * Gets the value of the userRole property.
     * 
     * @return
     *     possible object is
     *     {@link UserRoleType }
     *     
     */
    public UserRoleType getUserRole() {
        return userRole;
    }

    /**
     * Sets the value of the userRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRoleType }
     *     
     */
    public void setUserRole(UserRoleType value) {
        this.userRole = value;
    }

    /**
     * Gets the value of the userRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRoleId() {
        return userRoleId;
    }

    /**
     * Sets the value of the userRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRoleId(String value) {
        this.userRoleId = value;
    }

    /**
     * Gets the value of the userTeams property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getUserTeams() {
        return userTeams;
    }

    /**
     * Sets the value of the userTeams property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setUserTeams(QueryResult value) {
        this.userTeams = value;
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
     * Gets the value of the user_Account_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser_Account_ID__C() {
        return userAccountIDC;
    }

    /**
     * Sets the value of the user_Account_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser_Account_ID__C(String value) {
        this.userAccountIDC = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the windows_Login_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindows_Login_ID__C() {
        return windowsLoginIDC;
    }

    /**
     * Sets the value of the windows_Login_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindows_Login_ID__C(String value) {
        this.windowsLoginIDC = value;
    }

    /**
     * Gets the value of the isRepLocatorInvisible__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRepLocatorInvisible__C() {
        return isRepLocatorInvisibleC;
    }

    /**
     * Sets the value of the isRepLocatorInvisible__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRepLocatorInvisible__C(Boolean value) {
        this.isRepLocatorInvisibleC = value;
    }

    /**
     * Gets the value of the ities_Msg__Manage_Home_Page_Messages__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIties_Msg__Manage_Home_Page_Messages__C() {
        return itiesMsgManageHomePageMessagesC;
    }

    /**
     * Sets the value of the ities_Msg__Manage_Home_Page_Messages__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIties_Msg__Manage_Home_Page_Messages__C(Boolean value) {
        this.itiesMsgManageHomePageMessagesC = value;
    }

}
