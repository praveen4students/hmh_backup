
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Event">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Account_Executive__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account_Phone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ActivityDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Activity_Category__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Activity_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Additional_Information_Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Call_Resolution__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Campaign_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Campaign_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City_State__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Completed_Date__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Contact_Method_Link__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact_Method__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content_to_Activate__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content_to_Change__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Customer_Title__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DI_Event_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DI_Task_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Integration_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Received__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Date_Closed__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Date_Opened__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Date_Request_Completed__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Date_of_Pre_Sale_Activity__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Date_of_Support_Request__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Date_to_Install__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="District_Size__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="District__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Division" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="DurationInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Escalation__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Estimated_Completion_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Estimated_Cost__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EventAttendees" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Event_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Feeds" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="First_Contact__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="GroupEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hour_Touched__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="If_Other_how__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Implementation_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Implementation_Management_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Infrastructure_Challenges__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Internet_Connection__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Internet_Utilization_Percentage__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Invoice_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAllDayEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsArchived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsGroupEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRecurrence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsReminderSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Issue_Escalated_to__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Issue__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LAN_Infrastrucutre__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LAN_Utilization_Percentage__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Lead_Rating__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Source_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Source__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="License_Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mail_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Next_Steps_Takeaways_Followups__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes_on_Infrastructure_and_Utilization__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Original_Meeting_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Others_Present__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out_Of_Compliance__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Parent_Account_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Percent_Complete__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Permission_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Proposal_Highlights_Challenges__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recommended_Next_Steps__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordType" type="{urn:sobject.enterprise.soap.sforce.com}RecordType" minOccurs="0"/>
 *         &lt;element name="RecordTypeId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="RecurrenceActivityId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="RecurrenceDayOfMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RecurrenceDayOfWeekMask" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RecurrenceEndDateOnly" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RecurrenceInstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurrenceInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RecurrenceMonthOfYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurrenceStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RecurrenceTimeZoneSidKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurrenceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurringEvents" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ReminderDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Request_Received_From__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Request_Received_by__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resources_Needed__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Restricted_User_Names_limit_10__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Restricted_User_Selection__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Results_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SRTA_id__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ST_SIEBEL_ACTIVITY_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Meeting_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="School__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Services_Purchased__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShowAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Start_Time__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="State_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Steps_Taken_to_Resolve__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Super_Restricted_User_Names_limit_10__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Support_Plan__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Technical_Contact_Email__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Technical_Contact_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Technical_Contact_Other_Info__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Technical_Contact_Phone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ticket_Number__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time_spent__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Total_Rosters_To_Date__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Training_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Training_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WAN_Infrastructure__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WAN_Utilization_Percentage__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="What" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="WhatId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Who" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="WhoId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event", propOrder = {
    "account",
    "accountId",
    "accountExecutiveC",
    "accountNameC",
    "accountPhoneC",
    "activityDate",
    "activityDateTime",
    "activityCategoryC",
    "activityTypeC",
    "additionalInformationNotesC",
    "attachments",
    "callResolutionC",
    "campaignCodeC",
    "campaignNameC",
    "cityStateC",
    "completedDateC",
    "contactMethodLinkC",
    "contactMethodC",
    "contactTypeC",
    "contentToActivateC",
    "contentToChangeC",
    "createdBy",
    "createdById",
    "createdDate",
    "customerTitleC",
    "diEventTypeC",
    "diTaskTypeC",
    "dataIDC",
    "dataIntegrationStatusC",
    "dataReceivedC",
    "dateClosedC",
    "dateOpenedC",
    "dateRequestCompletedC",
    "dateOfPreSaleActivityC",
    "dateOfSupportRequestC",
    "dateToInstallC",
    "description",
    "discountC",
    "districtSizeC",
    "districtC",
    "division",
    "durationInMinutes",
    "endDateTime",
    "escalationC",
    "estimatedCompletionDateC",
    "estimatedCostC",
    "eventAttendees",
    "eventStatusC",
    "feedSubscriptionsForEntity",
    "feeds",
    "firstContactC",
    "groupEventType",
    "hourTouchedC",
    "ifOtherHowC",
    "implementationIDC",
    "implementationManagementStatusC",
    "infrastructureChallengesC",
    "internetConnectionC",
    "internetUtilizationPercentageC",
    "invoiceIDC",
    "isAllDayEvent",
    "isArchived",
    "isChild",
    "isDeleted",
    "isGroupEvent",
    "isPrivate",
    "isRecurrence",
    "isReminderSet",
    "issueEscalatedToC",
    "issueC",
    "lanInfrastrucutreC",
    "lanUtilizationPercentageC",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "leadRatingC",
    "leadSourceCommentsC",
    "leadSourceC",
    "licenseNotesC",
    "location",
    "mailDateC",
    "nextStepsTakeawaysFollowupsC",
    "notesOnInfrastructureAndUtilizationC",
    "originalMeetingDateC",
    "othersPresentC",
    "outOfComplianceC",
    "owner",
    "ownerId",
    "parentAccountNameC",
    "percentCompleteC",
    "permissionTypeC",
    "productC",
    "proposalHighlightsChallengesC",
    "recommendedNextStepsC",
    "recordType",
    "recordTypeId",
    "recurrenceActivityId",
    "recurrenceDayOfMonth",
    "recurrenceDayOfWeekMask",
    "recurrenceEndDateOnly",
    "recurrenceInstance",
    "recurrenceInterval",
    "recurrenceMonthOfYear",
    "recurrenceStartDateTime",
    "recurrenceTimeZoneSidKey",
    "recurrenceType",
    "recurringEvents",
    "reminderDateTime",
    "requestReceivedFromC",
    "requestReceivedByC",
    "resourcesNeededC",
    "restrictedUserNamesLimit10C",
    "restrictedUserSelectionC",
    "resultsCodeC",
    "srtaIdC",
    "stSIEBELACTIVITYIDC",
    "salesMeetingStatusC",
    "schoolC",
    "servicesPurchasedC",
    "showAs",
    "siteC",
    "startDateTime",
    "startTimeC",
    "stateNameC",
    "stepsTakenToResolveC",
    "subject",
    "superRestrictedUserNamesLimit10C",
    "supportPlanC",
    "systemModstamp",
    "technicalContactEmailC",
    "technicalContactNameC",
    "technicalContactOtherInfoC",
    "technicalContactPhoneC",
    "ticketNumberC",
    "timeSpentC",
    "totalRostersToDateC",
    "trainingIDC",
    "trainingStatusC",
    "type",
    "wanInfrastructureC",
    "wanUtilizationPercentageC",
    "what",
    "whatId",
    "who",
    "whoId"
})
public class EventType
    extends SObjectType
{

    @XmlElement(name = "Account", nillable = true)
    protected AccountType account;
    @XmlElement(name = "AccountId", nillable = true)
    protected String accountId;
    @XmlElement(name = "Account_Executive__c", nillable = true)
    protected String accountExecutiveC;
    @XmlElement(name = "Account_Name__c", nillable = true)
    protected String accountNameC;
    @XmlElement(name = "Account_Phone__c", nillable = true)
    protected String accountPhoneC;
    @XmlElement(name = "ActivityDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activityDate;
    @XmlElement(name = "ActivityDateTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activityDateTime;
    @XmlElement(name = "Activity_Category__c", nillable = true)
    protected String activityCategoryC;
    @XmlElement(name = "Activity_Type__c", nillable = true)
    protected String activityTypeC;
    @XmlElement(name = "Additional_Information_Notes__c", nillable = true)
    protected String additionalInformationNotesC;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "Call_Resolution__c", nillable = true)
    protected String callResolutionC;
    @XmlElement(name = "Campaign_Code__c", nillable = true)
    protected String campaignCodeC;
    @XmlElement(name = "Campaign_Name__c", nillable = true)
    protected String campaignNameC;
    @XmlElement(name = "City_State__c", nillable = true)
    protected String cityStateC;
    @XmlElement(name = "Completed_Date__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completedDateC;
    @XmlElement(name = "Contact_Method_Link__c", nillable = true)
    protected String contactMethodLinkC;
    @XmlElement(name = "Contact_Method__c", nillable = true)
    protected String contactMethodC;
    @XmlElement(name = "Contact_Type__c", nillable = true)
    protected String contactTypeC;
    @XmlElement(name = "Content_to_Activate__c", nillable = true)
    protected String contentToActivateC;
    @XmlElement(name = "Content_to_Change__c", nillable = true)
    protected String contentToChangeC;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Customer_Title__c", nillable = true)
    protected String customerTitleC;
    @XmlElement(name = "DI_Event_Type__c", nillable = true)
    protected String diEventTypeC;
    @XmlElement(name = "DI_Task_Type__c", nillable = true)
    protected String diTaskTypeC;
    @XmlElement(name = "Data_ID__c", nillable = true)
    protected String dataIDC;
    @XmlElement(name = "Data_Integration_Status__c", nillable = true)
    protected String dataIntegrationStatusC;
    @XmlElement(name = "Data_Received__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataReceivedC;
    @XmlElement(name = "Date_Closed__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateClosedC;
    @XmlElement(name = "Date_Opened__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOpenedC;
    @XmlElement(name = "Date_Request_Completed__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateRequestCompletedC;
    @XmlElement(name = "Date_of_Pre_Sale_Activity__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfPreSaleActivityC;
    @XmlElement(name = "Date_of_Support_Request__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfSupportRequestC;
    @XmlElement(name = "Date_to_Install__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateToInstallC;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "Discount__c", nillable = true)
    protected String discountC;
    @XmlElement(name = "District_Size__c", nillable = true)
    protected String districtSizeC;
    @XmlElement(name = "District__c", nillable = true)
    protected String districtC;
    @XmlElement(name = "Division", nillable = true)
    protected String division;
    @XmlElement(name = "DurationInMinutes", nillable = true)
    protected Integer durationInMinutes;
    @XmlElement(name = "EndDateTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(name = "Escalation__c", nillable = true)
    protected String escalationC;
    @XmlElement(name = "Estimated_Completion_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar estimatedCompletionDateC;
    @XmlElement(name = "Estimated_Cost__c", nillable = true)
    protected Double estimatedCostC;
    @XmlElement(name = "EventAttendees", nillable = true)
    protected QueryResult eventAttendees;
    @XmlElement(name = "Event_Status__c", nillable = true)
    protected String eventStatusC;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "Feeds", nillable = true)
    protected QueryResult feeds;
    @XmlElement(name = "First_Contact__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstContactC;
    @XmlElement(name = "GroupEventType", nillable = true)
    protected String groupEventType;
    @XmlElement(name = "Hour_Touched__c", nillable = true)
    protected String hourTouchedC;
    @XmlElement(name = "If_Other_how__c", nillable = true)
    protected String ifOtherHowC;
    @XmlElement(name = "Implementation_ID__c", nillable = true)
    protected String implementationIDC;
    @XmlElement(name = "Implementation_Management_Status__c", nillable = true)
    protected String implementationManagementStatusC;
    @XmlElement(name = "Infrastructure_Challenges__c", nillable = true)
    protected String infrastructureChallengesC;
    @XmlElement(name = "Internet_Connection__c", nillable = true)
    protected String internetConnectionC;
    @XmlElement(name = "Internet_Utilization_Percentage__c", nillable = true)
    protected String internetUtilizationPercentageC;
    @XmlElement(name = "Invoice_ID__c", nillable = true)
    protected String invoiceIDC;
    @XmlElement(name = "IsAllDayEvent", nillable = true)
    protected Boolean isAllDayEvent;
    @XmlElement(name = "IsArchived", nillable = true)
    protected Boolean isArchived;
    @XmlElement(name = "IsChild", nillable = true)
    protected Boolean isChild;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "IsGroupEvent", nillable = true)
    protected Boolean isGroupEvent;
    @XmlElement(name = "IsPrivate", nillable = true)
    protected Boolean isPrivate;
    @XmlElement(name = "IsRecurrence", nillable = true)
    protected Boolean isRecurrence;
    @XmlElement(name = "IsReminderSet", nillable = true)
    protected Boolean isReminderSet;
    @XmlElement(name = "Issue_Escalated_to__c", nillable = true)
    protected String issueEscalatedToC;
    @XmlElement(name = "Issue__c", nillable = true)
    protected String issueC;
    @XmlElement(name = "LAN_Infrastrucutre__c", nillable = true)
    protected String lanInfrastrucutreC;
    @XmlElement(name = "LAN_Utilization_Percentage__c", nillable = true)
    protected String lanUtilizationPercentageC;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Lead_Rating__c", nillable = true)
    protected String leadRatingC;
    @XmlElement(name = "Lead_Source_Comments__c", nillable = true)
    protected String leadSourceCommentsC;
    @XmlElement(name = "Lead_Source__c", nillable = true)
    protected String leadSourceC;
    @XmlElement(name = "License_Notes__c", nillable = true)
    protected String licenseNotesC;
    @XmlElement(name = "Location", nillable = true)
    protected String location;
    @XmlElement(name = "Mail_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mailDateC;
    @XmlElement(name = "Next_Steps_Takeaways_Followups__c", nillable = true)
    protected String nextStepsTakeawaysFollowupsC;
    @XmlElement(name = "Notes_on_Infrastructure_and_Utilization__c", nillable = true)
    protected String notesOnInfrastructureAndUtilizationC;
    @XmlElement(name = "Original_Meeting_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originalMeetingDateC;
    @XmlElement(name = "Others_Present__c", nillable = true)
    protected String othersPresentC;
    @XmlElement(name = "Out_Of_Compliance__c", nillable = true)
    protected Boolean outOfComplianceC;
    @XmlElement(name = "Owner", nillable = true)
    protected NameType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "Parent_Account_Name__c", nillable = true)
    protected String parentAccountNameC;
    @XmlElement(name = "Percent_Complete__c", nillable = true)
    protected Double percentCompleteC;
    @XmlElement(name = "Permission_Type__c", nillable = true)
    protected String permissionTypeC;
    @XmlElement(name = "Product__c", nillable = true)
    protected String productC;
    @XmlElement(name = "Proposal_Highlights_Challenges__c", nillable = true)
    protected String proposalHighlightsChallengesC;
    @XmlElement(name = "Recommended_Next_Steps__c", nillable = true)
    protected String recommendedNextStepsC;
    @XmlElement(name = "RecordType", nillable = true)
    protected RecordTypeType recordType;
    @XmlElement(name = "RecordTypeId", nillable = true)
    protected String recordTypeId;
    @XmlElement(name = "RecurrenceActivityId", nillable = true)
    protected String recurrenceActivityId;
    @XmlElement(name = "RecurrenceDayOfMonth", nillable = true)
    protected Integer recurrenceDayOfMonth;
    @XmlElement(name = "RecurrenceDayOfWeekMask", nillable = true)
    protected Integer recurrenceDayOfWeekMask;
    @XmlElement(name = "RecurrenceEndDateOnly", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recurrenceEndDateOnly;
    @XmlElement(name = "RecurrenceInstance", nillable = true)
    protected String recurrenceInstance;
    @XmlElement(name = "RecurrenceInterval", nillable = true)
    protected Integer recurrenceInterval;
    @XmlElement(name = "RecurrenceMonthOfYear", nillable = true)
    protected String recurrenceMonthOfYear;
    @XmlElement(name = "RecurrenceStartDateTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recurrenceStartDateTime;
    @XmlElement(name = "RecurrenceTimeZoneSidKey", nillable = true)
    protected String recurrenceTimeZoneSidKey;
    @XmlElement(name = "RecurrenceType", nillable = true)
    protected String recurrenceType;
    @XmlElement(name = "RecurringEvents", nillable = true)
    protected QueryResult recurringEvents;
    @XmlElement(name = "ReminderDateTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reminderDateTime;
    @XmlElement(name = "Request_Received_From__c", nillable = true)
    protected String requestReceivedFromC;
    @XmlElement(name = "Request_Received_by__c", nillable = true)
    protected String requestReceivedByC;
    @XmlElement(name = "Resources_Needed__c", nillable = true)
    protected String resourcesNeededC;
    @XmlElement(name = "Restricted_User_Names_limit_10__c", nillable = true)
    protected String restrictedUserNamesLimit10C;
    @XmlElement(name = "Restricted_User_Selection__c", nillable = true)
    protected String restrictedUserSelectionC;
    @XmlElement(name = "Results_Code__c", nillable = true)
    protected String resultsCodeC;
    @XmlElement(name = "SRTA_id__c", nillable = true)
    protected String srtaIdC;
    @XmlElement(name = "ST_SIEBEL_ACTIVITY_ID__c", nillable = true)
    protected String stSIEBELACTIVITYIDC;
    @XmlElement(name = "Sales_Meeting_Status__c", nillable = true)
    protected String salesMeetingStatusC;
    @XmlElement(name = "School__c", nillable = true)
    protected String schoolC;
    @XmlElement(name = "Services_Purchased__c", nillable = true)
    protected String servicesPurchasedC;
    @XmlElement(name = "ShowAs", nillable = true)
    protected String showAs;
    @XmlElement(name = "Site__c", nillable = true)
    protected String siteC;
    @XmlElement(name = "StartDateTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlElement(name = "Start_Time__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTimeC;
    @XmlElement(name = "State_Name__c", nillable = true)
    protected String stateNameC;
    @XmlElement(name = "Steps_Taken_to_Resolve__c", nillable = true)
    protected String stepsTakenToResolveC;
    @XmlElement(name = "Subject", nillable = true)
    protected String subject;
    @XmlElement(name = "Super_Restricted_User_Names_limit_10__c", nillable = true)
    protected String superRestrictedUserNamesLimit10C;
    @XmlElement(name = "Support_Plan__c", nillable = true)
    protected String supportPlanC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Technical_Contact_Email__c", nillable = true)
    protected String technicalContactEmailC;
    @XmlElement(name = "Technical_Contact_Name__c", nillable = true)
    protected String technicalContactNameC;
    @XmlElement(name = "Technical_Contact_Other_Info__c", nillable = true)
    protected String technicalContactOtherInfoC;
    @XmlElement(name = "Technical_Contact_Phone__c", nillable = true)
    protected String technicalContactPhoneC;
    @XmlElement(name = "Ticket_Number__c", nillable = true)
    protected String ticketNumberC;
    @XmlElement(name = "Time_spent__c", nillable = true)
    protected Double timeSpentC;
    @XmlElement(name = "Total_Rosters_To_Date__c", nillable = true)
    protected String totalRostersToDateC;
    @XmlElement(name = "Training_ID__c", nillable = true)
    protected String trainingIDC;
    @XmlElement(name = "Training_Status__c", nillable = true)
    protected String trainingStatusC;
    @XmlElement(name = "Type", nillable = true)
    protected String type;
    @XmlElement(name = "WAN_Infrastructure__c", nillable = true)
    protected String wanInfrastructureC;
    @XmlElement(name = "WAN_Utilization_Percentage__c", nillable = true)
    protected String wanUtilizationPercentageC;
    @XmlElement(name = "What", nillable = true)
    protected NameType what;
    @XmlElement(name = "WhatId", nillable = true)
    protected String whatId;
    @XmlElement(name = "Who", nillable = true)
    protected NameType who;
    @XmlElement(name = "WhoId", nillable = true)
    protected String whoId;

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
     * Gets the value of the account_Executive__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount_Executive__C() {
        return accountExecutiveC;
    }

    /**
     * Sets the value of the account_Executive__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount_Executive__C(String value) {
        this.accountExecutiveC = value;
    }

    /**
     * Gets the value of the account_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount_Name__C() {
        return accountNameC;
    }

    /**
     * Sets the value of the account_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount_Name__C(String value) {
        this.accountNameC = value;
    }

    /**
     * Gets the value of the account_Phone__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount_Phone__C() {
        return accountPhoneC;
    }

    /**
     * Sets the value of the account_Phone__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount_Phone__C(String value) {
        this.accountPhoneC = value;
    }

    /**
     * Gets the value of the activityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityDate() {
        return activityDate;
    }

    /**
     * Sets the value of the activityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityDate(XMLGregorianCalendar value) {
        this.activityDate = value;
    }

    /**
     * Gets the value of the activityDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityDateTime() {
        return activityDateTime;
    }

    /**
     * Sets the value of the activityDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityDateTime(XMLGregorianCalendar value) {
        this.activityDateTime = value;
    }

    /**
     * Gets the value of the activity_Category__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity_Category__C() {
        return activityCategoryC;
    }

    /**
     * Sets the value of the activity_Category__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity_Category__C(String value) {
        this.activityCategoryC = value;
    }

    /**
     * Gets the value of the activity_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity_Type__C() {
        return activityTypeC;
    }

    /**
     * Sets the value of the activity_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity_Type__C(String value) {
        this.activityTypeC = value;
    }

    /**
     * Gets the value of the additional_Information_Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditional_Information_Notes__C() {
        return additionalInformationNotesC;
    }

    /**
     * Sets the value of the additional_Information_Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditional_Information_Notes__C(String value) {
        this.additionalInformationNotesC = value;
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
     * Gets the value of the call_Resolution__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCall_Resolution__C() {
        return callResolutionC;
    }

    /**
     * Sets the value of the call_Resolution__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCall_Resolution__C(String value) {
        this.callResolutionC = value;
    }

    /**
     * Gets the value of the campaign_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaign_Code__C() {
        return campaignCodeC;
    }

    /**
     * Sets the value of the campaign_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaign_Code__C(String value) {
        this.campaignCodeC = value;
    }

    /**
     * Gets the value of the campaign_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaign_Name__C() {
        return campaignNameC;
    }

    /**
     * Sets the value of the campaign_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaign_Name__C(String value) {
        this.campaignNameC = value;
    }

    /**
     * Gets the value of the city_State__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity_State__C() {
        return cityStateC;
    }

    /**
     * Sets the value of the city_State__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity_State__C(String value) {
        this.cityStateC = value;
    }

    /**
     * Gets the value of the completed_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompleted_Date__C() {
        return completedDateC;
    }

    /**
     * Sets the value of the completed_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompleted_Date__C(XMLGregorianCalendar value) {
        this.completedDateC = value;
    }

    /**
     * Gets the value of the contact_Method_Link__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact_Method_Link__C() {
        return contactMethodLinkC;
    }

    /**
     * Sets the value of the contact_Method_Link__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact_Method_Link__C(String value) {
        this.contactMethodLinkC = value;
    }

    /**
     * Gets the value of the contact_Method__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact_Method__C() {
        return contactMethodC;
    }

    /**
     * Sets the value of the contact_Method__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact_Method__C(String value) {
        this.contactMethodC = value;
    }

    /**
     * Gets the value of the contact_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact_Type__C() {
        return contactTypeC;
    }

    /**
     * Sets the value of the contact_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact_Type__C(String value) {
        this.contactTypeC = value;
    }

    /**
     * Gets the value of the content_To_Activate__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent_To_Activate__C() {
        return contentToActivateC;
    }

    /**
     * Sets the value of the content_To_Activate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent_To_Activate__C(String value) {
        this.contentToActivateC = value;
    }

    /**
     * Gets the value of the content_To_Change__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent_To_Change__C() {
        return contentToChangeC;
    }

    /**
     * Sets the value of the content_To_Change__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent_To_Change__C(String value) {
        this.contentToChangeC = value;
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
     * Gets the value of the customer_Title__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Title__C() {
        return customerTitleC;
    }

    /**
     * Sets the value of the customer_Title__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Title__C(String value) {
        this.customerTitleC = value;
    }

    /**
     * Gets the value of the di_Event_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDI_Event_Type__C() {
        return diEventTypeC;
    }

    /**
     * Sets the value of the di_Event_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDI_Event_Type__C(String value) {
        this.diEventTypeC = value;
    }

    /**
     * Gets the value of the di_Task_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDI_Task_Type__C() {
        return diTaskTypeC;
    }

    /**
     * Sets the value of the di_Task_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDI_Task_Type__C(String value) {
        this.diTaskTypeC = value;
    }

    /**
     * Gets the value of the data_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData_ID__C() {
        return dataIDC;
    }

    /**
     * Sets the value of the data_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData_ID__C(String value) {
        this.dataIDC = value;
    }

    /**
     * Gets the value of the data_Integration_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData_Integration_Status__C() {
        return dataIntegrationStatusC;
    }

    /**
     * Sets the value of the data_Integration_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData_Integration_Status__C(String value) {
        this.dataIntegrationStatusC = value;
    }

    /**
     * Gets the value of the data_Received__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData_Received__C() {
        return dataReceivedC;
    }

    /**
     * Sets the value of the data_Received__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData_Received__C(XMLGregorianCalendar value) {
        this.dataReceivedC = value;
    }

    /**
     * Gets the value of the date_Closed__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate_Closed__C() {
        return dateClosedC;
    }

    /**
     * Sets the value of the date_Closed__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate_Closed__C(XMLGregorianCalendar value) {
        this.dateClosedC = value;
    }

    /**
     * Gets the value of the date_Opened__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate_Opened__C() {
        return dateOpenedC;
    }

    /**
     * Sets the value of the date_Opened__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate_Opened__C(XMLGregorianCalendar value) {
        this.dateOpenedC = value;
    }

    /**
     * Gets the value of the date_Request_Completed__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate_Request_Completed__C() {
        return dateRequestCompletedC;
    }

    /**
     * Sets the value of the date_Request_Completed__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate_Request_Completed__C(XMLGregorianCalendar value) {
        this.dateRequestCompletedC = value;
    }

    /**
     * Gets the value of the date_Of_Pre_Sale_Activity__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate_Of_Pre_Sale_Activity__C() {
        return dateOfPreSaleActivityC;
    }

    /**
     * Sets the value of the date_Of_Pre_Sale_Activity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate_Of_Pre_Sale_Activity__C(XMLGregorianCalendar value) {
        this.dateOfPreSaleActivityC = value;
    }

    /**
     * Gets the value of the date_Of_Support_Request__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate_Of_Support_Request__C() {
        return dateOfSupportRequestC;
    }

    /**
     * Sets the value of the date_Of_Support_Request__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate_Of_Support_Request__C(XMLGregorianCalendar value) {
        this.dateOfSupportRequestC = value;
    }

    /**
     * Gets the value of the date_To_Install__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate_To_Install__C() {
        return dateToInstallC;
    }

    /**
     * Sets the value of the date_To_Install__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate_To_Install__C(XMLGregorianCalendar value) {
        this.dateToInstallC = value;
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
     * Gets the value of the discount__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscount__C() {
        return discountC;
    }

    /**
     * Sets the value of the discount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscount__C(String value) {
        this.discountC = value;
    }

    /**
     * Gets the value of the district_Size__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict_Size__C() {
        return districtSizeC;
    }

    /**
     * Sets the value of the district_Size__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict_Size__C(String value) {
        this.districtSizeC = value;
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
     * Gets the value of the durationInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    /**
     * Sets the value of the durationInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDurationInMinutes(Integer value) {
        this.durationInMinutes = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the escalation__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscalation__C() {
        return escalationC;
    }

    /**
     * Sets the value of the escalation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscalation__C(String value) {
        this.escalationC = value;
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
     * Gets the value of the estimated_Cost__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimated_Cost__C() {
        return estimatedCostC;
    }

    /**
     * Sets the value of the estimated_Cost__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimated_Cost__C(Double value) {
        this.estimatedCostC = value;
    }

    /**
     * Gets the value of the eventAttendees property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getEventAttendees() {
        return eventAttendees;
    }

    /**
     * Sets the value of the eventAttendees property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setEventAttendees(QueryResult value) {
        this.eventAttendees = value;
    }

    /**
     * Gets the value of the event_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent_Status__C() {
        return eventStatusC;
    }

    /**
     * Sets the value of the event_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent_Status__C(String value) {
        this.eventStatusC = value;
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
     * Gets the value of the first_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirst_Contact__C() {
        return firstContactC;
    }

    /**
     * Sets the value of the first_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirst_Contact__C(XMLGregorianCalendar value) {
        this.firstContactC = value;
    }

    /**
     * Gets the value of the groupEventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupEventType() {
        return groupEventType;
    }

    /**
     * Sets the value of the groupEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupEventType(String value) {
        this.groupEventType = value;
    }

    /**
     * Gets the value of the hour_Touched__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHour_Touched__C() {
        return hourTouchedC;
    }

    /**
     * Sets the value of the hour_Touched__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHour_Touched__C(String value) {
        this.hourTouchedC = value;
    }

    /**
     * Gets the value of the if_Other_How__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIf_Other_How__C() {
        return ifOtherHowC;
    }

    /**
     * Sets the value of the if_Other_How__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIf_Other_How__C(String value) {
        this.ifOtherHowC = value;
    }

    /**
     * Gets the value of the implementation_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementation_ID__C() {
        return implementationIDC;
    }

    /**
     * Sets the value of the implementation_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementation_ID__C(String value) {
        this.implementationIDC = value;
    }

    /**
     * Gets the value of the implementation_Management_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementation_Management_Status__C() {
        return implementationManagementStatusC;
    }

    /**
     * Sets the value of the implementation_Management_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementation_Management_Status__C(String value) {
        this.implementationManagementStatusC = value;
    }

    /**
     * Gets the value of the infrastructure_Challenges__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfrastructure_Challenges__C() {
        return infrastructureChallengesC;
    }

    /**
     * Sets the value of the infrastructure_Challenges__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfrastructure_Challenges__C(String value) {
        this.infrastructureChallengesC = value;
    }

    /**
     * Gets the value of the internet_Connection__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternet_Connection__C() {
        return internetConnectionC;
    }

    /**
     * Sets the value of the internet_Connection__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternet_Connection__C(String value) {
        this.internetConnectionC = value;
    }

    /**
     * Gets the value of the internet_Utilization_Percentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternet_Utilization_Percentage__C() {
        return internetUtilizationPercentageC;
    }

    /**
     * Sets the value of the internet_Utilization_Percentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternet_Utilization_Percentage__C(String value) {
        this.internetUtilizationPercentageC = value;
    }

    /**
     * Gets the value of the invoice_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoice_ID__C() {
        return invoiceIDC;
    }

    /**
     * Sets the value of the invoice_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoice_ID__C(String value) {
        this.invoiceIDC = value;
    }

    /**
     * Gets the value of the isAllDayEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllDayEvent() {
        return isAllDayEvent;
    }

    /**
     * Sets the value of the isAllDayEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllDayEvent(Boolean value) {
        this.isAllDayEvent = value;
    }

    /**
     * Gets the value of the isArchived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsArchived() {
        return isArchived;
    }

    /**
     * Sets the value of the isArchived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsArchived(Boolean value) {
        this.isArchived = value;
    }

    /**
     * Gets the value of the isChild property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsChild() {
        return isChild;
    }

    /**
     * Sets the value of the isChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsChild(Boolean value) {
        this.isChild = value;
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
     * Gets the value of the isGroupEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGroupEvent() {
        return isGroupEvent;
    }

    /**
     * Sets the value of the isGroupEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGroupEvent(Boolean value) {
        this.isGroupEvent = value;
    }

    /**
     * Gets the value of the isPrivate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * Sets the value of the isPrivate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrivate(Boolean value) {
        this.isPrivate = value;
    }

    /**
     * Gets the value of the isRecurrence property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRecurrence() {
        return isRecurrence;
    }

    /**
     * Sets the value of the isRecurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRecurrence(Boolean value) {
        this.isRecurrence = value;
    }

    /**
     * Gets the value of the isReminderSet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReminderSet() {
        return isReminderSet;
    }

    /**
     * Sets the value of the isReminderSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReminderSet(Boolean value) {
        this.isReminderSet = value;
    }

    /**
     * Gets the value of the issue_Escalated_To__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssue_Escalated_To__C() {
        return issueEscalatedToC;
    }

    /**
     * Sets the value of the issue_Escalated_To__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssue_Escalated_To__C(String value) {
        this.issueEscalatedToC = value;
    }

    /**
     * Gets the value of the issue__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssue__C() {
        return issueC;
    }

    /**
     * Sets the value of the issue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssue__C(String value) {
        this.issueC = value;
    }

    /**
     * Gets the value of the lan_Infrastrucutre__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAN_Infrastrucutre__C() {
        return lanInfrastrucutreC;
    }

    /**
     * Sets the value of the lan_Infrastrucutre__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAN_Infrastrucutre__C(String value) {
        this.lanInfrastrucutreC = value;
    }

    /**
     * Gets the value of the lan_Utilization_Percentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAN_Utilization_Percentage__C() {
        return lanUtilizationPercentageC;
    }

    /**
     * Sets the value of the lan_Utilization_Percentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAN_Utilization_Percentage__C(String value) {
        this.lanUtilizationPercentageC = value;
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
     * Gets the value of the lead_Rating__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLead_Rating__C() {
        return leadRatingC;
    }

    /**
     * Sets the value of the lead_Rating__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLead_Rating__C(String value) {
        this.leadRatingC = value;
    }

    /**
     * Gets the value of the lead_Source_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLead_Source_Comments__C() {
        return leadSourceCommentsC;
    }

    /**
     * Sets the value of the lead_Source_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLead_Source_Comments__C(String value) {
        this.leadSourceCommentsC = value;
    }

    /**
     * Gets the value of the lead_Source__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLead_Source__C() {
        return leadSourceC;
    }

    /**
     * Sets the value of the lead_Source__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLead_Source__C(String value) {
        this.leadSourceC = value;
    }

    /**
     * Gets the value of the license_Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicense_Notes__C() {
        return licenseNotesC;
    }

    /**
     * Sets the value of the license_Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicense_Notes__C(String value) {
        this.licenseNotesC = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the mail_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMail_Date__C() {
        return mailDateC;
    }

    /**
     * Sets the value of the mail_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMail_Date__C(XMLGregorianCalendar value) {
        this.mailDateC = value;
    }

    /**
     * Gets the value of the next_Steps_Takeaways_Followups__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNext_Steps_Takeaways_Followups__C() {
        return nextStepsTakeawaysFollowupsC;
    }

    /**
     * Sets the value of the next_Steps_Takeaways_Followups__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNext_Steps_Takeaways_Followups__C(String value) {
        this.nextStepsTakeawaysFollowupsC = value;
    }

    /**
     * Gets the value of the notes_On_Infrastructure_And_Utilization__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes_On_Infrastructure_And_Utilization__C() {
        return notesOnInfrastructureAndUtilizationC;
    }

    /**
     * Sets the value of the notes_On_Infrastructure_And_Utilization__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes_On_Infrastructure_And_Utilization__C(String value) {
        this.notesOnInfrastructureAndUtilizationC = value;
    }

    /**
     * Gets the value of the original_Meeting_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginal_Meeting_Date__C() {
        return originalMeetingDateC;
    }

    /**
     * Sets the value of the original_Meeting_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginal_Meeting_Date__C(XMLGregorianCalendar value) {
        this.originalMeetingDateC = value;
    }

    /**
     * Gets the value of the others_Present__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthers_Present__C() {
        return othersPresentC;
    }

    /**
     * Sets the value of the others_Present__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthers_Present__C(String value) {
        this.othersPresentC = value;
    }

    /**
     * Gets the value of the out_Of_Compliance__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOut_Of_Compliance__C() {
        return outOfComplianceC;
    }

    /**
     * Sets the value of the out_Of_Compliance__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOut_Of_Compliance__C(Boolean value) {
        this.outOfComplianceC = value;
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
     * Gets the value of the parent_Account_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent_Account_Name__C() {
        return parentAccountNameC;
    }

    /**
     * Sets the value of the parent_Account_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent_Account_Name__C(String value) {
        this.parentAccountNameC = value;
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
     * Gets the value of the permission_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermission_Type__C() {
        return permissionTypeC;
    }

    /**
     * Sets the value of the permission_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermission_Type__C(String value) {
        this.permissionTypeC = value;
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
     * Gets the value of the proposal_Highlights_Challenges__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposal_Highlights_Challenges__C() {
        return proposalHighlightsChallengesC;
    }

    /**
     * Sets the value of the proposal_Highlights_Challenges__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposal_Highlights_Challenges__C(String value) {
        this.proposalHighlightsChallengesC = value;
    }

    /**
     * Gets the value of the recommended_Next_Steps__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommended_Next_Steps__C() {
        return recommendedNextStepsC;
    }

    /**
     * Sets the value of the recommended_Next_Steps__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommended_Next_Steps__C(String value) {
        this.recommendedNextStepsC = value;
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
     * Gets the value of the recurrenceActivityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceActivityId() {
        return recurrenceActivityId;
    }

    /**
     * Sets the value of the recurrenceActivityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceActivityId(String value) {
        this.recurrenceActivityId = value;
    }

    /**
     * Gets the value of the recurrenceDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecurrenceDayOfMonth() {
        return recurrenceDayOfMonth;
    }

    /**
     * Sets the value of the recurrenceDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecurrenceDayOfMonth(Integer value) {
        this.recurrenceDayOfMonth = value;
    }

    /**
     * Gets the value of the recurrenceDayOfWeekMask property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecurrenceDayOfWeekMask() {
        return recurrenceDayOfWeekMask;
    }

    /**
     * Sets the value of the recurrenceDayOfWeekMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecurrenceDayOfWeekMask(Integer value) {
        this.recurrenceDayOfWeekMask = value;
    }

    /**
     * Gets the value of the recurrenceEndDateOnly property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecurrenceEndDateOnly() {
        return recurrenceEndDateOnly;
    }

    /**
     * Sets the value of the recurrenceEndDateOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecurrenceEndDateOnly(XMLGregorianCalendar value) {
        this.recurrenceEndDateOnly = value;
    }

    /**
     * Gets the value of the recurrenceInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceInstance() {
        return recurrenceInstance;
    }

    /**
     * Sets the value of the recurrenceInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceInstance(String value) {
        this.recurrenceInstance = value;
    }

    /**
     * Gets the value of the recurrenceInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecurrenceInterval() {
        return recurrenceInterval;
    }

    /**
     * Sets the value of the recurrenceInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecurrenceInterval(Integer value) {
        this.recurrenceInterval = value;
    }

    /**
     * Gets the value of the recurrenceMonthOfYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceMonthOfYear() {
        return recurrenceMonthOfYear;
    }

    /**
     * Sets the value of the recurrenceMonthOfYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceMonthOfYear(String value) {
        this.recurrenceMonthOfYear = value;
    }

    /**
     * Gets the value of the recurrenceStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecurrenceStartDateTime() {
        return recurrenceStartDateTime;
    }

    /**
     * Sets the value of the recurrenceStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecurrenceStartDateTime(XMLGregorianCalendar value) {
        this.recurrenceStartDateTime = value;
    }

    /**
     * Gets the value of the recurrenceTimeZoneSidKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceTimeZoneSidKey() {
        return recurrenceTimeZoneSidKey;
    }

    /**
     * Sets the value of the recurrenceTimeZoneSidKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceTimeZoneSidKey(String value) {
        this.recurrenceTimeZoneSidKey = value;
    }

    /**
     * Gets the value of the recurrenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceType() {
        return recurrenceType;
    }

    /**
     * Sets the value of the recurrenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceType(String value) {
        this.recurrenceType = value;
    }

    /**
     * Gets the value of the recurringEvents property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getRecurringEvents() {
        return recurringEvents;
    }

    /**
     * Sets the value of the recurringEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setRecurringEvents(QueryResult value) {
        this.recurringEvents = value;
    }

    /**
     * Gets the value of the reminderDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReminderDateTime() {
        return reminderDateTime;
    }

    /**
     * Sets the value of the reminderDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReminderDateTime(XMLGregorianCalendar value) {
        this.reminderDateTime = value;
    }

    /**
     * Gets the value of the request_Received_From__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequest_Received_From__C() {
        return requestReceivedFromC;
    }

    /**
     * Sets the value of the request_Received_From__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequest_Received_From__C(String value) {
        this.requestReceivedFromC = value;
    }

    /**
     * Gets the value of the request_Received_By__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequest_Received_By__C() {
        return requestReceivedByC;
    }

    /**
     * Sets the value of the request_Received_By__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequest_Received_By__C(String value) {
        this.requestReceivedByC = value;
    }

    /**
     * Gets the value of the resources_Needed__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResources_Needed__C() {
        return resourcesNeededC;
    }

    /**
     * Sets the value of the resources_Needed__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResources_Needed__C(String value) {
        this.resourcesNeededC = value;
    }

    /**
     * Gets the value of the restricted_User_Names_Limit_10__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestricted_User_Names_Limit_10__C() {
        return restrictedUserNamesLimit10C;
    }

    /**
     * Sets the value of the restricted_User_Names_Limit_10__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestricted_User_Names_Limit_10__C(String value) {
        this.restrictedUserNamesLimit10C = value;
    }

    /**
     * Gets the value of the restricted_User_Selection__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestricted_User_Selection__C() {
        return restrictedUserSelectionC;
    }

    /**
     * Sets the value of the restricted_User_Selection__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestricted_User_Selection__C(String value) {
        this.restrictedUserSelectionC = value;
    }

    /**
     * Gets the value of the results_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResults_Code__C() {
        return resultsCodeC;
    }

    /**
     * Sets the value of the results_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResults_Code__C(String value) {
        this.resultsCodeC = value;
    }

    /**
     * Gets the value of the srta_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRTA_Id__C() {
        return srtaIdC;
    }

    /**
     * Sets the value of the srta_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRTA_Id__C(String value) {
        this.srtaIdC = value;
    }

    /**
     * Gets the value of the st_SIEBEL_ACTIVITY_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getST_SIEBEL_ACTIVITY_ID__C() {
        return stSIEBELACTIVITYIDC;
    }

    /**
     * Sets the value of the st_SIEBEL_ACTIVITY_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setST_SIEBEL_ACTIVITY_ID__C(String value) {
        this.stSIEBELACTIVITYIDC = value;
    }

    /**
     * Gets the value of the sales_Meeting_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Meeting_Status__C() {
        return salesMeetingStatusC;
    }

    /**
     * Sets the value of the sales_Meeting_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Meeting_Status__C(String value) {
        this.salesMeetingStatusC = value;
    }

    /**
     * Gets the value of the school__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchool__C() {
        return schoolC;
    }

    /**
     * Sets the value of the school__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchool__C(String value) {
        this.schoolC = value;
    }

    /**
     * Gets the value of the services_Purchased__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServices_Purchased__C() {
        return servicesPurchasedC;
    }

    /**
     * Sets the value of the services_Purchased__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServices_Purchased__C(String value) {
        this.servicesPurchasedC = value;
    }

    /**
     * Gets the value of the showAs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowAs() {
        return showAs;
    }

    /**
     * Sets the value of the showAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowAs(String value) {
        this.showAs = value;
    }

    /**
     * Gets the value of the site__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite__C() {
        return siteC;
    }

    /**
     * Sets the value of the site__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite__C(String value) {
        this.siteC = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the start_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart_Time__C() {
        return startTimeC;
    }

    /**
     * Sets the value of the start_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart_Time__C(XMLGregorianCalendar value) {
        this.startTimeC = value;
    }

    /**
     * Gets the value of the state_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState_Name__C() {
        return stateNameC;
    }

    /**
     * Sets the value of the state_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState_Name__C(String value) {
        this.stateNameC = value;
    }

    /**
     * Gets the value of the steps_Taken_To_Resolve__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSteps_Taken_To_Resolve__C() {
        return stepsTakenToResolveC;
    }

    /**
     * Sets the value of the steps_Taken_To_Resolve__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSteps_Taken_To_Resolve__C(String value) {
        this.stepsTakenToResolveC = value;
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
     * Gets the value of the super_Restricted_User_Names_Limit_10__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuper_Restricted_User_Names_Limit_10__C() {
        return superRestrictedUserNamesLimit10C;
    }

    /**
     * Sets the value of the super_Restricted_User_Names_Limit_10__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuper_Restricted_User_Names_Limit_10__C(String value) {
        this.superRestrictedUserNamesLimit10C = value;
    }

    /**
     * Gets the value of the support_Plan__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupport_Plan__C() {
        return supportPlanC;
    }

    /**
     * Sets the value of the support_Plan__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupport_Plan__C(String value) {
        this.supportPlanC = value;
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
     * Gets the value of the technical_Contact_Email__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnical_Contact_Email__C() {
        return technicalContactEmailC;
    }

    /**
     * Sets the value of the technical_Contact_Email__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnical_Contact_Email__C(String value) {
        this.technicalContactEmailC = value;
    }

    /**
     * Gets the value of the technical_Contact_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnical_Contact_Name__C() {
        return technicalContactNameC;
    }

    /**
     * Sets the value of the technical_Contact_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnical_Contact_Name__C(String value) {
        this.technicalContactNameC = value;
    }

    /**
     * Gets the value of the technical_Contact_Other_Info__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnical_Contact_Other_Info__C() {
        return technicalContactOtherInfoC;
    }

    /**
     * Sets the value of the technical_Contact_Other_Info__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnical_Contact_Other_Info__C(String value) {
        this.technicalContactOtherInfoC = value;
    }

    /**
     * Gets the value of the technical_Contact_Phone__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnical_Contact_Phone__C() {
        return technicalContactPhoneC;
    }

    /**
     * Sets the value of the technical_Contact_Phone__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnical_Contact_Phone__C(String value) {
        this.technicalContactPhoneC = value;
    }

    /**
     * Gets the value of the ticket_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicket_Number__C() {
        return ticketNumberC;
    }

    /**
     * Sets the value of the ticket_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicket_Number__C(String value) {
        this.ticketNumberC = value;
    }

    /**
     * Gets the value of the time_Spent__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTime_Spent__C() {
        return timeSpentC;
    }

    /**
     * Sets the value of the time_Spent__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTime_Spent__C(Double value) {
        this.timeSpentC = value;
    }

    /**
     * Gets the value of the total_Rosters_To_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal_Rosters_To_Date__C() {
        return totalRostersToDateC;
    }

    /**
     * Sets the value of the total_Rosters_To_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal_Rosters_To_Date__C(String value) {
        this.totalRostersToDateC = value;
    }

    /**
     * Gets the value of the training_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraining_ID__C() {
        return trainingIDC;
    }

    /**
     * Sets the value of the training_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraining_ID__C(String value) {
        this.trainingIDC = value;
    }

    /**
     * Gets the value of the training_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraining_Status__C() {
        return trainingStatusC;
    }

    /**
     * Sets the value of the training_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraining_Status__C(String value) {
        this.trainingStatusC = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the wan_Infrastructure__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAN_Infrastructure__C() {
        return wanInfrastructureC;
    }

    /**
     * Sets the value of the wan_Infrastructure__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAN_Infrastructure__C(String value) {
        this.wanInfrastructureC = value;
    }

    /**
     * Gets the value of the wan_Utilization_Percentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAN_Utilization_Percentage__C() {
        return wanUtilizationPercentageC;
    }

    /**
     * Sets the value of the wan_Utilization_Percentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAN_Utilization_Percentage__C(String value) {
        this.wanUtilizationPercentageC = value;
    }

    /**
     * Gets the value of the what property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getWhat() {
        return what;
    }

    /**
     * Sets the value of the what property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setWhat(NameType value) {
        this.what = value;
    }

    /**
     * Gets the value of the whatId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhatId() {
        return whatId;
    }

    /**
     * Sets the value of the whatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhatId(String value) {
        this.whatId = value;
    }

    /**
     * Gets the value of the who property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getWho() {
        return who;
    }

    /**
     * Sets the value of the who property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setWho(NameType value) {
        this.who = value;
    }

    /**
     * Gets the value of the whoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhoId() {
        return whoId;
    }

    /**
     * Sets the value of the whoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhoId(String value) {
        this.whoId = value;
    }

}
