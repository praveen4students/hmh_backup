
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Case complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Case">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Acrobat_Versions__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Annual_Revenue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Application__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Asset" type="{urn:sobject.enterprise.soap.sforce.com}Asset" minOccurs="0"/>
 *         &lt;element name="AssetId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Assigned_To__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Browser__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BugzillaID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaseComments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CaseContactRoles" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaseSolutions" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Case_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cases" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Category__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Channel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClosedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Constituent_Meeting__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="ContactId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Contact_Market__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Days_to_Complete__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Division" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Division__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Due_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Estimated_Completion_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Events" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Feeds" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Group_Size__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HMH_Reporter__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasCommentsUnreadByOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasSelfServiceComments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="IsClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEscalated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Latency__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Level_of_Effort__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OS_Verion__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Object__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpenActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Percent_Complete__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Primary_Technical_Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Primary_Technical_Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Product__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Project_Plan__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Project_Plan__r" type="{urn:sobject.enterprise.soap.sforce.com}Project_Plan__c" minOccurs="0"/>
 *         &lt;element name="Rank__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordType" type="{urn:sobject.enterprise.soap.sforce.com}RecordType" minOccurs="0"/>
 *         &lt;element name="RecordTypeId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Related_QC_Defect_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Release_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Release__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remedy_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Response_Date_1st__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Scanner_Location_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scanner_Models__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shares" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Solutions" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Start_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="State_Exam_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub_Category__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub_Group__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuppliedCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuppliedEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuppliedPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Support_Reason_Details__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Support_Reason__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Target_Milestone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="TeamMembers" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="TeamTemplateRecords" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Use_of_Salesforce__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebDistrict__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebSchool__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebTitle__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Web_Platform__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Web_Username__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Case", propOrder = {
    "account",
    "accountId",
    "acrobatVersionsC",
    "activityHistories",
    "annualRevenueC",
    "applicationC",
    "asset",
    "assetId",
    "assignedToC",
    "attachments",
    "browserC",
    "bugzillaIDC",
    "caseComments",
    "caseContactRoles",
    "caseNumber",
    "caseSolutions",
    "caseCommentsC",
    "cases",
    "categoryC",
    "channelC",
    "closedDate",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "constituentMeetingC",
    "contact",
    "contactId",
    "contactMarketC",
    "createdBy",
    "createdById",
    "createdDate",
    "daysToCompleteC",
    "description",
    "division",
    "divisionC",
    "dueDateC",
    "estimatedCompletionDateC",
    "events",
    "feedSubscriptionsForEntity",
    "feeds",
    "groupSizeC",
    "groupC",
    "hmhReporterC",
    "hasCommentsUnreadByOwner",
    "hasSelfServiceComments",
    "histories",
    "isClosed",
    "isDeleted",
    "isEscalated",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "latencyC",
    "levelOfEffortC",
    "osVerionC",
    "objectC",
    "openActivities",
    "origin",
    "owner",
    "ownerId",
    "percentCompleteC",
    "primaryTechnicalContactC",
    "primaryTechnicalContactR",
    "priority",
    "processInstances",
    "processSteps",
    "productC",
    "projectPlanC",
    "projectPlanR",
    "rankC",
    "reason",
    "recordType",
    "recordTypeId",
    "relatedQCDefectIDC",
    "releaseTypeC",
    "releaseC",
    "remedyIDC",
    "responseDate1StC",
    "scannerLocationNameC",
    "scannerModelsC",
    "shares",
    "solutions",
    "startDateC",
    "stateExamTypeC",
    "status",
    "statusC",
    "subCategoryC",
    "subGroupC",
    "subject",
    "suppliedCompany",
    "suppliedEmail",
    "suppliedName",
    "suppliedPhone",
    "supportReasonDetailsC",
    "supportReasonC",
    "systemModstamp",
    "targetMilestoneC",
    "tasks",
    "teamMembers",
    "teamTemplateRecords",
    "useOfSalesforceC",
    "webDistrictC",
    "webSchoolC",
    "webTitleC",
    "webPlatformC",
    "webUsernameC"
})
public class CaseType
    extends SObjectType
{

    @XmlElement(name = "Account", nillable = true)
    protected AccountType account;
    @XmlElement(name = "AccountId", nillable = true)
    protected String accountId;
    @XmlElement(name = "Acrobat_Versions__c", nillable = true)
    protected String acrobatVersionsC;
    @XmlElement(name = "ActivityHistories", nillable = true)
    protected QueryResult activityHistories;
    @XmlElement(name = "Annual_Revenue__c", nillable = true)
    protected Double annualRevenueC;
    @XmlElement(name = "Application__c", nillable = true)
    protected String applicationC;
    @XmlElement(name = "Asset", nillable = true)
    protected AssetType asset;
    @XmlElement(name = "AssetId", nillable = true)
    protected String assetId;
    @XmlElement(name = "Assigned_To__c", nillable = true)
    protected String assignedToC;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "Browser__c", nillable = true)
    protected String browserC;
    @XmlElement(name = "BugzillaID__c", nillable = true)
    protected String bugzillaIDC;
    @XmlElement(name = "CaseComments", nillable = true)
    protected QueryResult caseComments;
    @XmlElement(name = "CaseContactRoles", nillable = true)
    protected QueryResult caseContactRoles;
    @XmlElement(name = "CaseNumber", nillable = true)
    protected String caseNumber;
    @XmlElement(name = "CaseSolutions", nillable = true)
    protected QueryResult caseSolutions;
    @XmlElement(name = "Case_Comments__c", nillable = true)
    protected String caseCommentsC;
    @XmlElement(name = "Cases", nillable = true)
    protected QueryResult cases;
    @XmlElement(name = "Category__c", nillable = true)
    protected String categoryC;
    @XmlElement(name = "Channel__c", nillable = true)
    protected String channelC;
    @XmlElement(name = "ClosedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closedDate;
    @XmlElement(name = "ConnectionReceived", nillable = true)
    protected PartnerNetworkConnectionType connectionReceived;
    @XmlElement(name = "ConnectionReceivedId", nillable = true)
    protected String connectionReceivedId;
    @XmlElement(name = "ConnectionSent", nillable = true)
    protected PartnerNetworkConnectionType connectionSent;
    @XmlElement(name = "ConnectionSentId", nillable = true)
    protected String connectionSentId;
    @XmlElement(name = "Constituent_Meeting__c", nillable = true)
    protected String constituentMeetingC;
    @XmlElement(name = "Contact", nillable = true)
    protected ContactType contact;
    @XmlElement(name = "ContactId", nillable = true)
    protected String contactId;
    @XmlElement(name = "Contact_Market__c", nillable = true)
    protected String contactMarketC;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Days_to_Complete__c", nillable = true)
    protected Double daysToCompleteC;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "Division", nillable = true)
    protected String division;
    @XmlElement(name = "Division__c", nillable = true)
    protected String divisionC;
    @XmlElement(name = "Due_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDateC;
    @XmlElement(name = "Estimated_Completion_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar estimatedCompletionDateC;
    @XmlElement(name = "Events", nillable = true)
    protected QueryResult events;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "Feeds", nillable = true)
    protected QueryResult feeds;
    @XmlElement(name = "Group_Size__c", nillable = true)
    protected String groupSizeC;
    @XmlElement(name = "Group__c", nillable = true)
    protected String groupC;
    @XmlElement(name = "HMH_Reporter__c", nillable = true)
    protected String hmhReporterC;
    @XmlElement(name = "HasCommentsUnreadByOwner", nillable = true)
    protected Boolean hasCommentsUnreadByOwner;
    @XmlElement(name = "HasSelfServiceComments", nillable = true)
    protected Boolean hasSelfServiceComments;
    @XmlElement(name = "Histories", nillable = true)
    protected QueryResult histories;
    @XmlElement(name = "IsClosed", nillable = true)
    protected Boolean isClosed;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "IsEscalated", nillable = true)
    protected Boolean isEscalated;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Latency__c", nillable = true)
    protected Boolean latencyC;
    @XmlElement(name = "Level_of_Effort__c", nillable = true)
    protected String levelOfEffortC;
    @XmlElement(name = "OS_Verion__c", nillable = true)
    protected String osVerionC;
    @XmlElement(name = "Object__c", nillable = true)
    protected String objectC;
    @XmlElement(name = "OpenActivities", nillable = true)
    protected QueryResult openActivities;
    @XmlElement(name = "Origin", nillable = true)
    protected String origin;
    @XmlElement(name = "Owner", nillable = true)
    protected NameType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "Percent_Complete__c", nillable = true)
    protected Double percentCompleteC;
    @XmlElement(name = "Primary_Technical_Contact__c", nillable = true)
    protected String primaryTechnicalContactC;
    @XmlElement(name = "Primary_Technical_Contact__r", nillable = true)
    protected ContactType primaryTechnicalContactR;
    @XmlElement(name = "Priority", nillable = true)
    protected String priority;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "Product__c", nillable = true)
    protected String productC;
    @XmlElement(name = "Project_Plan__c", nillable = true)
    protected String projectPlanC;
    @XmlElement(name = "Project_Plan__r", nillable = true)
    protected Project_Plan__CType projectPlanR;
    @XmlElement(name = "Rank__c", nillable = true)
    protected Double rankC;
    @XmlElement(name = "Reason", nillable = true)
    protected String reason;
    @XmlElement(name = "RecordType", nillable = true)
    protected RecordTypeType recordType;
    @XmlElement(name = "RecordTypeId", nillable = true)
    protected String recordTypeId;
    @XmlElement(name = "Related_QC_Defect_ID__c", nillable = true)
    protected String relatedQCDefectIDC;
    @XmlElement(name = "Release_Type__c", nillable = true)
    protected String releaseTypeC;
    @XmlElement(name = "Release__c", nillable = true)
    protected String releaseC;
    @XmlElement(name = "Remedy_ID__c", nillable = true)
    protected String remedyIDC;
    @XmlElement(name = "Response_Date_1st__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseDate1StC;
    @XmlElement(name = "Scanner_Location_Name__c", nillable = true)
    protected String scannerLocationNameC;
    @XmlElement(name = "Scanner_Models__c", nillable = true)
    protected String scannerModelsC;
    @XmlElement(name = "Shares", nillable = true)
    protected QueryResult shares;
    @XmlElement(name = "Solutions", nillable = true)
    protected QueryResult solutions;
    @XmlElement(name = "Start_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDateC;
    @XmlElement(name = "State_Exam_Type__c", nillable = true)
    protected String stateExamTypeC;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "Status__c", nillable = true)
    protected String statusC;
    @XmlElement(name = "Sub_Category__c", nillable = true)
    protected String subCategoryC;
    @XmlElement(name = "Sub_Group__c", nillable = true)
    protected String subGroupC;
    @XmlElement(name = "Subject", nillable = true)
    protected String subject;
    @XmlElement(name = "SuppliedCompany", nillable = true)
    protected String suppliedCompany;
    @XmlElement(name = "SuppliedEmail", nillable = true)
    protected String suppliedEmail;
    @XmlElement(name = "SuppliedName", nillable = true)
    protected String suppliedName;
    @XmlElement(name = "SuppliedPhone", nillable = true)
    protected String suppliedPhone;
    @XmlElement(name = "Support_Reason_Details__c", nillable = true)
    protected String supportReasonDetailsC;
    @XmlElement(name = "Support_Reason__c", nillable = true)
    protected String supportReasonC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Target_Milestone__c", nillable = true)
    protected String targetMilestoneC;
    @XmlElement(name = "Tasks", nillable = true)
    protected QueryResult tasks;
    @XmlElement(name = "TeamMembers", nillable = true)
    protected QueryResult teamMembers;
    @XmlElement(name = "TeamTemplateRecords", nillable = true)
    protected QueryResult teamTemplateRecords;
    @XmlElement(name = "Use_of_Salesforce__c", nillable = true)
    protected String useOfSalesforceC;
    @XmlElement(name = "WebDistrict__c", nillable = true)
    protected String webDistrictC;
    @XmlElement(name = "WebSchool__c", nillable = true)
    protected String webSchoolC;
    @XmlElement(name = "WebTitle__c", nillable = true)
    protected String webTitleC;
    @XmlElement(name = "Web_Platform__c", nillable = true)
    protected String webPlatformC;
    @XmlElement(name = "Web_Username__c", nillable = true)
    protected String webUsernameC;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccount(AccountType value) {
        this.account = value;
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
     * Gets the value of the acrobat_Versions__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcrobat_Versions__C() {
        return acrobatVersionsC;
    }

    /**
     * Sets the value of the acrobat_Versions__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcrobat_Versions__C(String value) {
        this.acrobatVersionsC = value;
    }

    /**
     * Gets the value of the activityHistories property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getActivityHistories() {
        return activityHistories;
    }

    /**
     * Sets the value of the activityHistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setActivityHistories(QueryResult value) {
        this.activityHistories = value;
    }

    /**
     * Gets the value of the annual_Revenue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAnnual_Revenue__C() {
        return annualRevenueC;
    }

    /**
     * Sets the value of the annual_Revenue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAnnual_Revenue__C(Double value) {
        this.annualRevenueC = value;
    }

    /**
     * Gets the value of the application__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication__C() {
        return applicationC;
    }

    /**
     * Sets the value of the application__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication__C(String value) {
        this.applicationC = value;
    }

    /**
     * Gets the value of the asset property.
     * 
     * @return
     *     possible object is
     *     {@link AssetType }
     *     
     */
    public AssetType getAsset() {
        return asset;
    }

    /**
     * Sets the value of the asset property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetType }
     *     
     */
    public void setAsset(AssetType value) {
        this.asset = value;
    }

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetId(String value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the assigned_To__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigned_To__C() {
        return assignedToC;
    }

    /**
     * Sets the value of the assigned_To__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigned_To__C(String value) {
        this.assignedToC = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setAttachments(QueryResult value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the browser__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowser__C() {
        return browserC;
    }

    /**
     * Sets the value of the browser__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowser__C(String value) {
        this.browserC = value;
    }

    /**
     * Gets the value of the bugzillaID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBugzillaID__C() {
        return bugzillaIDC;
    }

    /**
     * Sets the value of the bugzillaID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBugzillaID__C(String value) {
        this.bugzillaIDC = value;
    }

    /**
     * Gets the value of the caseComments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getCaseComments() {
        return caseComments;
    }

    /**
     * Sets the value of the caseComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setCaseComments(QueryResult value) {
        this.caseComments = value;
    }

    /**
     * Gets the value of the caseContactRoles property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getCaseContactRoles() {
        return caseContactRoles;
    }

    /**
     * Sets the value of the caseContactRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setCaseContactRoles(QueryResult value) {
        this.caseContactRoles = value;
    }

    /**
     * Gets the value of the caseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * Sets the value of the caseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNumber(String value) {
        this.caseNumber = value;
    }

    /**
     * Gets the value of the caseSolutions property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getCaseSolutions() {
        return caseSolutions;
    }

    /**
     * Sets the value of the caseSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setCaseSolutions(QueryResult value) {
        this.caseSolutions = value;
    }

    /**
     * Gets the value of the case_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCase_Comments__C() {
        return caseCommentsC;
    }

    /**
     * Sets the value of the case_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCase_Comments__C(String value) {
        this.caseCommentsC = value;
    }

    /**
     * Gets the value of the cases property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getCases() {
        return cases;
    }

    /**
     * Sets the value of the cases property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setCases(QueryResult value) {
        this.cases = value;
    }

    /**
     * Gets the value of the category__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory__C() {
        return categoryC;
    }

    /**
     * Sets the value of the category__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory__C(String value) {
        this.categoryC = value;
    }

    /**
     * Gets the value of the channel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel__C() {
        return channelC;
    }

    /**
     * Sets the value of the channel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel__C(String value) {
        this.channelC = value;
    }

    /**
     * Gets the value of the closedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosedDate() {
        return closedDate;
    }

    /**
     * Sets the value of the closedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosedDate(XMLGregorianCalendar value) {
        this.closedDate = value;
    }

    /**
     * Gets the value of the connectionReceived property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerNetworkConnectionType }
     *     
     */
    public PartnerNetworkConnectionType getConnectionReceived() {
        return connectionReceived;
    }

    /**
     * Sets the value of the connectionReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerNetworkConnectionType }
     *     
     */
    public void setConnectionReceived(PartnerNetworkConnectionType value) {
        this.connectionReceived = value;
    }

    /**
     * Gets the value of the connectionReceivedId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionReceivedId() {
        return connectionReceivedId;
    }

    /**
     * Sets the value of the connectionReceivedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionReceivedId(String value) {
        this.connectionReceivedId = value;
    }

    /**
     * Gets the value of the connectionSent property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerNetworkConnectionType }
     *     
     */
    public PartnerNetworkConnectionType getConnectionSent() {
        return connectionSent;
    }

    /**
     * Sets the value of the connectionSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerNetworkConnectionType }
     *     
     */
    public void setConnectionSent(PartnerNetworkConnectionType value) {
        this.connectionSent = value;
    }

    /**
     * Gets the value of the connectionSentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionSentId() {
        return connectionSentId;
    }

    /**
     * Sets the value of the connectionSentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionSentId(String value) {
        this.connectionSentId = value;
    }

    /**
     * Gets the value of the constituent_Meeting__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstituent_Meeting__C() {
        return constituentMeetingC;
    }

    /**
     * Sets the value of the constituent_Meeting__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstituent_Meeting__C(String value) {
        this.constituentMeetingC = value;
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
     * Gets the value of the contact_Market__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact_Market__C() {
        return contactMarketC;
    }

    /**
     * Sets the value of the contact_Market__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact_Market__C(String value) {
        this.contactMarketC = value;
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
     * Gets the value of the days_To_Complete__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDays_To_Complete__C() {
        return daysToCompleteC;
    }

    /**
     * Sets the value of the days_To_Complete__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDays_To_Complete__C(Double value) {
        this.daysToCompleteC = value;
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
     * Gets the value of the division__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision__C() {
        return divisionC;
    }

    /**
     * Sets the value of the division__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision__C(String value) {
        this.divisionC = value;
    }

    /**
     * Gets the value of the due_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDue_Date__C() {
        return dueDateC;
    }

    /**
     * Sets the value of the due_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDue_Date__C(XMLGregorianCalendar value) {
        this.dueDateC = value;
    }

    /**
     * Gets the value of the estimated_Completion_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimated_Completion_Date__C() {
        return estimatedCompletionDateC;
    }

    /**
     * Sets the value of the estimated_Completion_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimated_Completion_Date__C(XMLGregorianCalendar value) {
        this.estimatedCompletionDateC = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setEvents(QueryResult value) {
        this.events = value;
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
     * Gets the value of the group_Size__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup_Size__C() {
        return groupSizeC;
    }

    /**
     * Sets the value of the group_Size__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup_Size__C(String value) {
        this.groupSizeC = value;
    }

    /**
     * Gets the value of the group__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup__C() {
        return groupC;
    }

    /**
     * Sets the value of the group__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup__C(String value) {
        this.groupC = value;
    }

    /**
     * Gets the value of the hmh_Reporter__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHMH_Reporter__C() {
        return hmhReporterC;
    }

    /**
     * Sets the value of the hmh_Reporter__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHMH_Reporter__C(String value) {
        this.hmhReporterC = value;
    }

    /**
     * Gets the value of the hasCommentsUnreadByOwner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasCommentsUnreadByOwner() {
        return hasCommentsUnreadByOwner;
    }

    /**
     * Sets the value of the hasCommentsUnreadByOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasCommentsUnreadByOwner(Boolean value) {
        this.hasCommentsUnreadByOwner = value;
    }

    /**
     * Gets the value of the hasSelfServiceComments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasSelfServiceComments() {
        return hasSelfServiceComments;
    }

    /**
     * Sets the value of the hasSelfServiceComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSelfServiceComments(Boolean value) {
        this.hasSelfServiceComments = value;
    }

    /**
     * Gets the value of the histories property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getHistories() {
        return histories;
    }

    /**
     * Sets the value of the histories property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setHistories(QueryResult value) {
        this.histories = value;
    }

    /**
     * Gets the value of the isClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsClosed() {
        return isClosed;
    }

    /**
     * Sets the value of the isClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsClosed(Boolean value) {
        this.isClosed = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the isEscalated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEscalated() {
        return isEscalated;
    }

    /**
     * Sets the value of the isEscalated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEscalated(Boolean value) {
        this.isEscalated = value;
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
     * Gets the value of the latency__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatency__C() {
        return latencyC;
    }

    /**
     * Sets the value of the latency__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLatency__C(Boolean value) {
        this.latencyC = value;
    }

    /**
     * Gets the value of the level_Of_Effort__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel_Of_Effort__C() {
        return levelOfEffortC;
    }

    /**
     * Sets the value of the level_Of_Effort__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel_Of_Effort__C(String value) {
        this.levelOfEffortC = value;
    }

    /**
     * Gets the value of the os_Verion__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOS_Verion__C() {
        return osVerionC;
    }

    /**
     * Sets the value of the os_Verion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOS_Verion__C(String value) {
        this.osVerionC = value;
    }

    /**
     * Gets the value of the object__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObject__C() {
        return objectC;
    }

    /**
     * Sets the value of the object__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObject__C(String value) {
        this.objectC = value;
    }

    /**
     * Gets the value of the openActivities property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpenActivities() {
        return openActivities;
    }

    /**
     * Sets the value of the openActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpenActivities(QueryResult value) {
        this.openActivities = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setOwner(NameType value) {
        this.owner = value;
    }

    /**
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerId(String value) {
        this.ownerId = value;
    }

    /**
     * Gets the value of the percent_Complete__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercent_Complete__C() {
        return percentCompleteC;
    }

    /**
     * Sets the value of the percent_Complete__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercent_Complete__C(Double value) {
        this.percentCompleteC = value;
    }

    /**
     * Gets the value of the primary_Technical_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimary_Technical_Contact__C() {
        return primaryTechnicalContactC;
    }

    /**
     * Sets the value of the primary_Technical_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimary_Technical_Contact__C(String value) {
        this.primaryTechnicalContactC = value;
    }

    /**
     * Gets the value of the primary_Technical_Contact__R property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getPrimary_Technical_Contact__R() {
        return primaryTechnicalContactR;
    }

    /**
     * Sets the value of the primary_Technical_Contact__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setPrimary_Technical_Contact__R(ContactType value) {
        this.primaryTechnicalContactR = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the processInstances property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getProcessInstances() {
        return processInstances;
    }

    /**
     * Sets the value of the processInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setProcessInstances(QueryResult value) {
        this.processInstances = value;
    }

    /**
     * Gets the value of the processSteps property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getProcessSteps() {
        return processSteps;
    }

    /**
     * Sets the value of the processSteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setProcessSteps(QueryResult value) {
        this.processSteps = value;
    }

    /**
     * Gets the value of the product__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct__C() {
        return productC;
    }

    /**
     * Sets the value of the product__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct__C(String value) {
        this.productC = value;
    }

    /**
     * Gets the value of the project_Plan__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProject_Plan__C() {
        return projectPlanC;
    }

    /**
     * Sets the value of the project_Plan__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProject_Plan__C(String value) {
        this.projectPlanC = value;
    }

    /**
     * Gets the value of the project_Plan__R property.
     * 
     * @return
     *     possible object is
     *     {@link Project_Plan__CType }
     *     
     */
    public Project_Plan__CType getProject_Plan__R() {
        return projectPlanR;
    }

    /**
     * Sets the value of the project_Plan__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project_Plan__CType }
     *     
     */
    public void setProject_Plan__R(Project_Plan__CType value) {
        this.projectPlanR = value;
    }

    /**
     * Gets the value of the rank__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRank__C() {
        return rankC;
    }

    /**
     * Sets the value of the rank__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRank__C(Double value) {
        this.rankC = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTypeType }
     *     
     */
    public RecordTypeType getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTypeType }
     *     
     */
    public void setRecordType(RecordTypeType value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the recordTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordTypeId() {
        return recordTypeId;
    }

    /**
     * Sets the value of the recordTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordTypeId(String value) {
        this.recordTypeId = value;
    }

    /**
     * Gets the value of the related_QC_Defect_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated_QC_Defect_ID__C() {
        return relatedQCDefectIDC;
    }

    /**
     * Sets the value of the related_QC_Defect_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated_QC_Defect_ID__C(String value) {
        this.relatedQCDefectIDC = value;
    }

    /**
     * Gets the value of the release_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelease_Type__C() {
        return releaseTypeC;
    }

    /**
     * Sets the value of the release_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelease_Type__C(String value) {
        this.releaseTypeC = value;
    }

    /**
     * Gets the value of the release__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelease__C() {
        return releaseC;
    }

    /**
     * Sets the value of the release__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelease__C(String value) {
        this.releaseC = value;
    }

    /**
     * Gets the value of the remedy_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemedy_ID__C() {
        return remedyIDC;
    }

    /**
     * Sets the value of the remedy_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemedy_ID__C(String value) {
        this.remedyIDC = value;
    }

    /**
     * Gets the value of the response_Date_1St__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponse_Date_1St__C() {
        return responseDate1StC;
    }

    /**
     * Sets the value of the response_Date_1St__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponse_Date_1St__C(XMLGregorianCalendar value) {
        this.responseDate1StC = value;
    }

    /**
     * Gets the value of the scanner_Location_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanner_Location_Name__C() {
        return scannerLocationNameC;
    }

    /**
     * Sets the value of the scanner_Location_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanner_Location_Name__C(String value) {
        this.scannerLocationNameC = value;
    }

    /**
     * Gets the value of the scanner_Models__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanner_Models__C() {
        return scannerModelsC;
    }

    /**
     * Sets the value of the scanner_Models__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanner_Models__C(String value) {
        this.scannerModelsC = value;
    }

    /**
     * Gets the value of the shares property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getShares() {
        return shares;
    }

    /**
     * Sets the value of the shares property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setShares(QueryResult value) {
        this.shares = value;
    }

    /**
     * Gets the value of the solutions property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getSolutions() {
        return solutions;
    }

    /**
     * Sets the value of the solutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setSolutions(QueryResult value) {
        this.solutions = value;
    }

    /**
     * Gets the value of the start_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart_Date__C() {
        return startDateC;
    }

    /**
     * Sets the value of the start_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart_Date__C(XMLGregorianCalendar value) {
        this.startDateC = value;
    }

    /**
     * Gets the value of the state_Exam_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState_Exam_Type__C() {
        return stateExamTypeC;
    }

    /**
     * Sets the value of the state_Exam_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState_Exam_Type__C(String value) {
        this.stateExamTypeC = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus__C() {
        return statusC;
    }

    /**
     * Sets the value of the status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus__C(String value) {
        this.statusC = value;
    }

    /**
     * Gets the value of the sub_Category__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub_Category__C() {
        return subCategoryC;
    }

    /**
     * Sets the value of the sub_Category__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub_Category__C(String value) {
        this.subCategoryC = value;
    }

    /**
     * Gets the value of the sub_Group__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub_Group__C() {
        return subGroupC;
    }

    /**
     * Sets the value of the sub_Group__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub_Group__C(String value) {
        this.subGroupC = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the suppliedCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppliedCompany() {
        return suppliedCompany;
    }

    /**
     * Sets the value of the suppliedCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppliedCompany(String value) {
        this.suppliedCompany = value;
    }

    /**
     * Gets the value of the suppliedEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppliedEmail() {
        return suppliedEmail;
    }

    /**
     * Sets the value of the suppliedEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppliedEmail(String value) {
        this.suppliedEmail = value;
    }

    /**
     * Gets the value of the suppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppliedName() {
        return suppliedName;
    }

    /**
     * Sets the value of the suppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppliedName(String value) {
        this.suppliedName = value;
    }

    /**
     * Gets the value of the suppliedPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppliedPhone() {
        return suppliedPhone;
    }

    /**
     * Sets the value of the suppliedPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppliedPhone(String value) {
        this.suppliedPhone = value;
    }

    /**
     * Gets the value of the support_Reason_Details__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupport_Reason_Details__C() {
        return supportReasonDetailsC;
    }

    /**
     * Sets the value of the support_Reason_Details__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupport_Reason_Details__C(String value) {
        this.supportReasonDetailsC = value;
    }

    /**
     * Gets the value of the support_Reason__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupport_Reason__C() {
        return supportReasonC;
    }

    /**
     * Sets the value of the support_Reason__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupport_Reason__C(String value) {
        this.supportReasonC = value;
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
     * Gets the value of the target_Milestone__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget_Milestone__C() {
        return targetMilestoneC;
    }

    /**
     * Sets the value of the target_Milestone__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget_Milestone__C(String value) {
        this.targetMilestoneC = value;
    }

    /**
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setTasks(QueryResult value) {
        this.tasks = value;
    }

    /**
     * Gets the value of the teamMembers property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getTeamMembers() {
        return teamMembers;
    }

    /**
     * Sets the value of the teamMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setTeamMembers(QueryResult value) {
        this.teamMembers = value;
    }

    /**
     * Gets the value of the teamTemplateRecords property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getTeamTemplateRecords() {
        return teamTemplateRecords;
    }

    /**
     * Sets the value of the teamTemplateRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setTeamTemplateRecords(QueryResult value) {
        this.teamTemplateRecords = value;
    }

    /**
     * Gets the value of the use_Of_Salesforce__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUse_Of_Salesforce__C() {
        return useOfSalesforceC;
    }

    /**
     * Sets the value of the use_Of_Salesforce__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUse_Of_Salesforce__C(String value) {
        this.useOfSalesforceC = value;
    }

    /**
     * Gets the value of the webDistrict__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebDistrict__C() {
        return webDistrictC;
    }

    /**
     * Sets the value of the webDistrict__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebDistrict__C(String value) {
        this.webDistrictC = value;
    }

    /**
     * Gets the value of the webSchool__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebSchool__C() {
        return webSchoolC;
    }

    /**
     * Sets the value of the webSchool__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebSchool__C(String value) {
        this.webSchoolC = value;
    }

    /**
     * Gets the value of the webTitle__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebTitle__C() {
        return webTitleC;
    }

    /**
     * Sets the value of the webTitle__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebTitle__C(String value) {
        this.webTitleC = value;
    }

    /**
     * Gets the value of the web_Platform__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeb_Platform__C() {
        return webPlatformC;
    }

    /**
     * Sets the value of the web_Platform__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeb_Platform__C(String value) {
        this.webPlatformC = value;
    }

    /**
     * Gets the value of the web_Username__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeb_Username__C() {
        return webUsernameC;
    }

    /**
     * Sets the value of the web_Username__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeb_Username__C(String value) {
        this.webUsernameC = value;
    }

}
