
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Service_Request_Form__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service_Request_Form__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Account_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Account__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="ActivityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Additional_Contact_Info__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Additional_Time_Specifics__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adoption_Value__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Alternate_Dates__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Anticipated_next_steps__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Arrival_Date_Time__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Audience_Role_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audience_type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Departure_Date_Time__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="End_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Estimated_Travel_Time_by_Car__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Event_Address_Line_1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Event_Address_Line_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Event_City__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Event_Location__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Event_Phone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Event_Specifics__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Event_State__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Event_Time_Zone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Event_Time__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Event_Zip__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Events" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Grade_Levels_Represented__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Link_Address__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Link_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mutiple_Sessions__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nearest_Airport__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Notification_Email__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_Attending__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Number_of_Consultants__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OpenActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opportunity_Discipline__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opportunity_Grades__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opportunity_Stage__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opportunity_Value__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Other_event_type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Other_resource_type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Problem_the_district_is_trying_to_solve__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="RSVP_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RSVP__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="RecordType" type="{urn:sobject.enterprise.soap.sforce.com}RecordType" minOccurs="0"/>
 *         &lt;element name="RecordTypeId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Region__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Requested_Consultant__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SRFNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Rep_Delivered__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sales_Resource__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scheduler_Notes_to_Field__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scheduler__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Scheduler__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="ServiceRequestTentativeAttendees__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Shares" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Start_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Suggested_Hotel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Topic__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="What_are_the_objectives_of_this_meeting__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="What_has_occurred_prior_to_this_meeting__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Who_is_the_competition__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelled_reason__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cons_per_diem_needed__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="disciplines__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="event_type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="explain_multiple_sessions__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="explain_session_desc_times__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instructions_updates__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="is_approved__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="related_opportunity__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="related_opportunity__r" type="{urn:sobject.enterprise.soap.sforce.com}Opportunity" minOccurs="0"/>
 *         &lt;element name="rep_pick_up_at_airport__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="requester_cell__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requester_email__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requester_phone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sales_rep_attending__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="scheduler_project_notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="service_request_type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="time_zone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service_Request_Form__c", propOrder = {
    "accountNameC",
    "accountC",
    "accountR",
    "activityHistories",
    "additionalContactInfoC",
    "additionalTimeSpecificsC",
    "adoptionValueC",
    "alternateDatesC",
    "anticipatedNextStepsC",
    "arrivalDateTimeC",
    "attachments",
    "audienceRoleTypeC",
    "audienceTypeC",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "contactC",
    "contactR",
    "createdBy",
    "createdById",
    "createdDate",
    "departureDateTimeC",
    "endDateC",
    "estimatedTravelTimeByCarC",
    "eventAddressLine1C",
    "eventAddressLine2C",
    "eventCityC",
    "eventLocationC",
    "eventPhoneC",
    "eventSpecificsC",
    "eventStateC",
    "eventTimeZoneC",
    "eventTimeC",
    "eventZipC",
    "events",
    "feedSubscriptionsForEntity",
    "gradeLevelsRepresentedC",
    "isDeleted",
    "lastActivityDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "linkAddressC",
    "linkDescriptionC",
    "mutipleSessionsC",
    "name",
    "nearestAirportC",
    "notes",
    "notesAndAttachments",
    "notificationEmailC",
    "numberAttendingC",
    "numberOfConsultantsC",
    "openActivities",
    "opportunityDisciplineC",
    "opportunityGradesC",
    "opportunityStageC",
    "opportunityValueC",
    "otherEventTypeC",
    "otherResourceTypeC",
    "owner",
    "ownerId",
    "problemTheDistrictIsTryingToSolveC",
    "processInstances",
    "processSteps",
    "rsvpCodeC",
    "rsvpR",
    "recordType",
    "recordTypeId",
    "regionC",
    "requestedConsultantC",
    "srfNumberC",
    "salesRepDeliveredC",
    "salesResourceC",
    "schedulerNotesToFieldC",
    "schedulerC",
    "schedulerR",
    "serviceRequestTentativeAttendeesR",
    "shares",
    "startDateC",
    "suggestedHotelC",
    "systemModstamp",
    "tasks",
    "topicC",
    "whatAreTheObjectivesOfThisMeetingC",
    "whatHasOccurredPriorToThisMeetingC",
    "whoIsTheCompetitionC",
    "cancelledReasonC",
    "consPerDiemNeededC",
    "disciplinesC",
    "durationC",
    "eventTypeC",
    "explainMultipleSessionsC",
    "explainSessionDescTimesC",
    "instructionsUpdatesC",
    "isApprovedC",
    "relatedOpportunityC",
    "relatedOpportunityR",
    "repPickUpAtAirportC",
    "requesterCellC",
    "requesterEmailC",
    "requesterPhoneC",
    "salesRepAttendingC",
    "schedulerProjectNotesC",
    "serviceRequestTypeC",
    "statusC",
    "timeZoneC"
})
public class Service_Request_Form__CType
    extends SObjectType
{

    @XmlElement(name = "Account_Name__c", nillable = true)
    protected String accountNameC;
    @XmlElement(name = "Account__c", nillable = true)
    protected String accountC;
    @XmlElement(name = "Account__r", nillable = true)
    protected AccountType accountR;
    @XmlElement(name = "ActivityHistories", nillable = true)
    protected QueryResult activityHistories;
    @XmlElement(name = "Additional_Contact_Info__c", nillable = true)
    protected String additionalContactInfoC;
    @XmlElement(name = "Additional_Time_Specifics__c", nillable = true)
    protected String additionalTimeSpecificsC;
    @XmlElement(name = "Adoption_Value__c", nillable = true)
    protected Double adoptionValueC;
    @XmlElement(name = "Alternate_Dates__c", nillable = true)
    protected String alternateDatesC;
    @XmlElement(name = "Anticipated_next_steps__c", nillable = true)
    protected String anticipatedNextStepsC;
    @XmlElement(name = "Arrival_Date_Time__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDateTimeC;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "Audience_Role_Type__c", nillable = true)
    protected String audienceRoleTypeC;
    @XmlElement(name = "Audience_type__c", nillable = true)
    protected String audienceTypeC;
    @XmlElement(name = "ConnectionReceived", nillable = true)
    protected PartnerNetworkConnectionType connectionReceived;
    @XmlElement(name = "ConnectionReceivedId", nillable = true)
    protected String connectionReceivedId;
    @XmlElement(name = "ConnectionSent", nillable = true)
    protected PartnerNetworkConnectionType connectionSent;
    @XmlElement(name = "ConnectionSentId", nillable = true)
    protected String connectionSentId;
    @XmlElement(name = "Contact__c", nillable = true)
    protected String contactC;
    @XmlElement(name = "Contact__r", nillable = true)
    protected ContactType contactR;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Departure_Date_Time__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateTimeC;
    @XmlElement(name = "End_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDateC;
    @XmlElement(name = "Estimated_Travel_Time_by_Car__c", nillable = true)
    protected String estimatedTravelTimeByCarC;
    @XmlElement(name = "Event_Address_Line_1__c", nillable = true)
    protected String eventAddressLine1C;
    @XmlElement(name = "Event_Address_Line_2__c", nillable = true)
    protected String eventAddressLine2C;
    @XmlElement(name = "Event_City__c", nillable = true)
    protected String eventCityC;
    @XmlElement(name = "Event_Location__c", nillable = true)
    protected String eventLocationC;
    @XmlElement(name = "Event_Phone__c", nillable = true)
    protected String eventPhoneC;
    @XmlElement(name = "Event_Specifics__c", nillable = true)
    protected String eventSpecificsC;
    @XmlElement(name = "Event_State__c", nillable = true)
    protected String eventStateC;
    @XmlElement(name = "Event_Time_Zone__c", nillable = true)
    protected String eventTimeZoneC;
    @XmlElement(name = "Event_Time__c", nillable = true)
    protected String eventTimeC;
    @XmlElement(name = "Event_Zip__c", nillable = true)
    protected String eventZipC;
    @XmlElement(name = "Events", nillable = true)
    protected QueryResult events;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "Grade_Levels_Represented__c", nillable = true)
    protected String gradeLevelsRepresentedC;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "LastActivityDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastActivityDate;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Link_Address__c", nillable = true)
    protected String linkAddressC;
    @XmlElement(name = "Link_Description__c", nillable = true)
    protected String linkDescriptionC;
    @XmlElement(name = "Mutiple_Sessions__c", nillable = true)
    protected Boolean mutipleSessionsC;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Nearest_Airport__c", nillable = true)
    protected String nearestAirportC;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "Notification_Email__c", nillable = true)
    protected String notificationEmailC;
    @XmlElement(name = "Number_Attending__c", nillable = true)
    protected Double numberAttendingC;
    @XmlElement(name = "Number_of_Consultants__c", nillable = true)
    protected Double numberOfConsultantsC;
    @XmlElement(name = "OpenActivities", nillable = true)
    protected QueryResult openActivities;
    @XmlElement(name = "Opportunity_Discipline__c", nillable = true)
    protected String opportunityDisciplineC;
    @XmlElement(name = "Opportunity_Grades__c", nillable = true)
    protected String opportunityGradesC;
    @XmlElement(name = "Opportunity_Stage__c", nillable = true)
    protected String opportunityStageC;
    @XmlElement(name = "Opportunity_Value__c", nillable = true)
    protected Double opportunityValueC;
    @XmlElement(name = "Other_event_type__c", nillable = true)
    protected String otherEventTypeC;
    @XmlElement(name = "Other_resource_type__c", nillable = true)
    protected String otherResourceTypeC;
    @XmlElement(name = "Owner", nillable = true)
    protected NameType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "Problem_the_district_is_trying_to_solve__c", nillable = true)
    protected String problemTheDistrictIsTryingToSolveC;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "RSVP_Code__c", nillable = true)
    protected String rsvpCodeC;
    @XmlElement(name = "RSVP__r", nillable = true)
    protected QueryResult rsvpR;
    @XmlElement(name = "RecordType", nillable = true)
    protected RecordTypeType recordType;
    @XmlElement(name = "RecordTypeId", nillable = true)
    protected String recordTypeId;
    @XmlElement(name = "Region__c", nillable = true)
    protected String regionC;
    @XmlElement(name = "Requested_Consultant__c", nillable = true)
    protected String requestedConsultantC;
    @XmlElement(name = "SRFNumber__c", nillable = true)
    protected String srfNumberC;
    @XmlElement(name = "Sales_Rep_Delivered__c", nillable = true)
    protected Boolean salesRepDeliveredC;
    @XmlElement(name = "Sales_Resource__c", nillable = true)
    protected String salesResourceC;
    @XmlElement(name = "Scheduler_Notes_to_Field__c", nillable = true)
    protected String schedulerNotesToFieldC;
    @XmlElement(name = "Scheduler__c", nillable = true)
    protected String schedulerC;
    @XmlElement(name = "Scheduler__r", nillable = true)
    protected UserType schedulerR;
    @XmlElement(name = "ServiceRequestTentativeAttendees__r", nillable = true)
    protected QueryResult serviceRequestTentativeAttendeesR;
    @XmlElement(name = "Shares", nillable = true)
    protected QueryResult shares;
    @XmlElement(name = "Start_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDateC;
    @XmlElement(name = "Suggested_Hotel__c", nillable = true)
    protected String suggestedHotelC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Tasks", nillable = true)
    protected QueryResult tasks;
    @XmlElement(name = "Topic__c", nillable = true)
    protected String topicC;
    @XmlElement(name = "What_are_the_objectives_of_this_meeting__c", nillable = true)
    protected String whatAreTheObjectivesOfThisMeetingC;
    @XmlElement(name = "What_has_occurred_prior_to_this_meeting__c", nillable = true)
    protected String whatHasOccurredPriorToThisMeetingC;
    @XmlElement(name = "Who_is_the_competition__c", nillable = true)
    protected String whoIsTheCompetitionC;
    @XmlElement(name = "cancelled_reason__c", nillable = true)
    protected String cancelledReasonC;
    @XmlElement(name = "cons_per_diem_needed__c", nillable = true)
    protected Boolean consPerDiemNeededC;
    @XmlElement(name = "disciplines__c", nillable = true)
    protected String disciplinesC;
    @XmlElement(name = "duration__c", nillable = true)
    protected String durationC;
    @XmlElement(name = "event_type__c", nillable = true)
    protected String eventTypeC;
    @XmlElement(name = "explain_multiple_sessions__c", nillable = true)
    protected String explainMultipleSessionsC;
    @XmlElement(name = "explain_session_desc_times__c", nillable = true)
    protected String explainSessionDescTimesC;
    @XmlElement(name = "instructions_updates__c", nillable = true)
    protected String instructionsUpdatesC;
    @XmlElement(name = "is_approved__c", nillable = true)
    protected Boolean isApprovedC;
    @XmlElement(name = "related_opportunity__c", nillable = true)
    protected String relatedOpportunityC;
    @XmlElement(name = "related_opportunity__r", nillable = true)
    protected OpportunityType relatedOpportunityR;
    @XmlElement(name = "rep_pick_up_at_airport__c", nillable = true)
    protected Boolean repPickUpAtAirportC;
    @XmlElement(name = "requester_cell__c", nillable = true)
    protected String requesterCellC;
    @XmlElement(name = "requester_email__c", nillable = true)
    protected String requesterEmailC;
    @XmlElement(name = "requester_phone__c", nillable = true)
    protected String requesterPhoneC;
    @XmlElement(name = "sales_rep_attending__c", nillable = true)
    protected Boolean salesRepAttendingC;
    @XmlElement(name = "scheduler_project_notes__c", nillable = true)
    protected String schedulerProjectNotesC;
    @XmlElement(name = "service_request_type__c", nillable = true)
    protected String serviceRequestTypeC;
    @XmlElement(name = "status__c", nillable = true)
    protected String statusC;
    @XmlElement(name = "time_zone__c", nillable = true)
    protected String timeZoneC;

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
     * Gets the value of the account__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount__C() {
        return accountC;
    }

    /**
     * Sets the value of the account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount__C(String value) {
        this.accountC = value;
    }

    /**
     * Gets the value of the account__R property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccount__R() {
        return accountR;
    }

    /**
     * Sets the value of the account__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccount__R(AccountType value) {
        this.accountR = value;
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
     * Gets the value of the additional_Contact_Info__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditional_Contact_Info__C() {
        return additionalContactInfoC;
    }

    /**
     * Sets the value of the additional_Contact_Info__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditional_Contact_Info__C(String value) {
        this.additionalContactInfoC = value;
    }

    /**
     * Gets the value of the additional_Time_Specifics__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditional_Time_Specifics__C() {
        return additionalTimeSpecificsC;
    }

    /**
     * Sets the value of the additional_Time_Specifics__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditional_Time_Specifics__C(String value) {
        this.additionalTimeSpecificsC = value;
    }

    /**
     * Gets the value of the adoption_Value__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdoption_Value__C() {
        return adoptionValueC;
    }

    /**
     * Sets the value of the adoption_Value__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdoption_Value__C(Double value) {
        this.adoptionValueC = value;
    }

    /**
     * Gets the value of the alternate_Dates__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternate_Dates__C() {
        return alternateDatesC;
    }

    /**
     * Sets the value of the alternate_Dates__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternate_Dates__C(String value) {
        this.alternateDatesC = value;
    }

    /**
     * Gets the value of the anticipated_Next_Steps__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnticipated_Next_Steps__C() {
        return anticipatedNextStepsC;
    }

    /**
     * Sets the value of the anticipated_Next_Steps__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnticipated_Next_Steps__C(String value) {
        this.anticipatedNextStepsC = value;
    }

    /**
     * Gets the value of the arrival_Date_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrival_Date_Time__C() {
        return arrivalDateTimeC;
    }

    /**
     * Sets the value of the arrival_Date_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrival_Date_Time__C(XMLGregorianCalendar value) {
        this.arrivalDateTimeC = value;
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
     * Gets the value of the audience_Role_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudience_Role_Type__C() {
        return audienceRoleTypeC;
    }

    /**
     * Sets the value of the audience_Role_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudience_Role_Type__C(String value) {
        this.audienceRoleTypeC = value;
    }

    /**
     * Gets the value of the audience_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudience_Type__C() {
        return audienceTypeC;
    }

    /**
     * Sets the value of the audience_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudience_Type__C(String value) {
        this.audienceTypeC = value;
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
     * Gets the value of the contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact__C() {
        return contactC;
    }

    /**
     * Sets the value of the contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact__C(String value) {
        this.contactC = value;
    }

    /**
     * Gets the value of the contact__R property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getContact__R() {
        return contactR;
    }

    /**
     * Sets the value of the contact__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setContact__R(ContactType value) {
        this.contactR = value;
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
     * Gets the value of the departure_Date_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeparture_Date_Time__C() {
        return departureDateTimeC;
    }

    /**
     * Sets the value of the departure_Date_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeparture_Date_Time__C(XMLGregorianCalendar value) {
        this.departureDateTimeC = value;
    }

    /**
     * Gets the value of the end_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd_Date__C() {
        return endDateC;
    }

    /**
     * Sets the value of the end_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd_Date__C(XMLGregorianCalendar value) {
        this.endDateC = value;
    }

    /**
     * Gets the value of the estimated_Travel_Time_By_Car__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimated_Travel_Time_By_Car__C() {
        return estimatedTravelTimeByCarC;
    }

    /**
     * Sets the value of the estimated_Travel_Time_By_Car__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimated_Travel_Time_By_Car__C(String value) {
        this.estimatedTravelTimeByCarC = value;
    }

    /**
     * Gets the value of the event_Address_Line_1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent_Address_Line_1__C() {
        return eventAddressLine1C;
    }

    /**
     * Sets the value of the event_Address_Line_1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent_Address_Line_1__C(String value) {
        this.eventAddressLine1C = value;
    }

    /**
     * Gets the value of the event_Address_Line_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent_Address_Line_2__C() {
        return eventAddressLine2C;
    }

    /**
     * Sets the value of the event_Address_Line_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent_Address_Line_2__C(String value) {
        this.eventAddressLine2C = value;
    }

    /**
     * Gets the value of the event_City__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent_City__C() {
        return eventCityC;
    }

    /**
     * Sets the value of the event_City__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent_City__C(String value) {
        this.eventCityC = value;
    }

    /**
     * Gets the value of the event_Location__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent_Location__C() {
        return eventLocationC;
    }

    /**
     * Sets the value of the event_Location__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent_Location__C(String value) {
        this.eventLocationC = value;
    }

    /**
     * Gets the value of the event_Phone__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent_Phone__C() {
        return eventPhoneC;
    }

    /**
     * Sets the value of the event_Phone__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent_Phone__C(String value) {
        this.eventPhoneC = value;
    }

    /**
     * Gets the value of the event_Specifics__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent_Specifics__C() {
        return eventSpecificsC;
    }

    /**
     * Sets the value of the event_Specifics__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent_Specifics__C(String value) {
        this.eventSpecificsC = value;
    }

    /**
     * Gets the value of the event_State__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent_State__C() {
        return eventStateC;
    }

    /**
     * Sets the value of the event_State__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent_State__C(String value) {
        this.eventStateC = value;
    }

    /**
     * Gets the value of the event_Time_Zone__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent_Time_Zone__C() {
        return eventTimeZoneC;
    }

    /**
     * Sets the value of the event_Time_Zone__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent_Time_Zone__C(String value) {
        this.eventTimeZoneC = value;
    }

    /**
     * Gets the value of the event_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent_Time__C() {
        return eventTimeC;
    }

    /**
     * Sets the value of the event_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent_Time__C(String value) {
        this.eventTimeC = value;
    }

    /**
     * Gets the value of the event_Zip__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent_Zip__C() {
        return eventZipC;
    }

    /**
     * Sets the value of the event_Zip__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent_Zip__C(String value) {
        this.eventZipC = value;
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
     * Gets the value of the grade_Levels_Represented__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade_Levels_Represented__C() {
        return gradeLevelsRepresentedC;
    }

    /**
     * Sets the value of the grade_Levels_Represented__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade_Levels_Represented__C(String value) {
        this.gradeLevelsRepresentedC = value;
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
     * Gets the value of the lastActivityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Sets the value of the lastActivityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastActivityDate(XMLGregorianCalendar value) {
        this.lastActivityDate = value;
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
     * Gets the value of the link_Address__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink_Address__C() {
        return linkAddressC;
    }

    /**
     * Sets the value of the link_Address__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink_Address__C(String value) {
        this.linkAddressC = value;
    }

    /**
     * Gets the value of the link_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink_Description__C() {
        return linkDescriptionC;
    }

    /**
     * Sets the value of the link_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink_Description__C(String value) {
        this.linkDescriptionC = value;
    }

    /**
     * Gets the value of the mutiple_Sessions__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMutiple_Sessions__C() {
        return mutipleSessionsC;
    }

    /**
     * Sets the value of the mutiple_Sessions__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMutiple_Sessions__C(Boolean value) {
        this.mutipleSessionsC = value;
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
     * Gets the value of the nearest_Airport__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNearest_Airport__C() {
        return nearestAirportC;
    }

    /**
     * Sets the value of the nearest_Airport__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNearest_Airport__C(String value) {
        this.nearestAirportC = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setNotes(QueryResult value) {
        this.notes = value;
    }

    /**
     * Gets the value of the notesAndAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }

    /**
     * Sets the value of the notesAndAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setNotesAndAttachments(QueryResult value) {
        this.notesAndAttachments = value;
    }

    /**
     * Gets the value of the notification_Email__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotification_Email__C() {
        return notificationEmailC;
    }

    /**
     * Sets the value of the notification_Email__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotification_Email__C(String value) {
        this.notificationEmailC = value;
    }

    /**
     * Gets the value of the number_Attending__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumber_Attending__C() {
        return numberAttendingC;
    }

    /**
     * Sets the value of the number_Attending__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumber_Attending__C(Double value) {
        this.numberAttendingC = value;
    }

    /**
     * Gets the value of the number_Of_Consultants__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumber_Of_Consultants__C() {
        return numberOfConsultantsC;
    }

    /**
     * Sets the value of the number_Of_Consultants__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumber_Of_Consultants__C(Double value) {
        this.numberOfConsultantsC = value;
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
     * Gets the value of the opportunity_Discipline__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunity_Discipline__C() {
        return opportunityDisciplineC;
    }

    /**
     * Sets the value of the opportunity_Discipline__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunity_Discipline__C(String value) {
        this.opportunityDisciplineC = value;
    }

    /**
     * Gets the value of the opportunity_Grades__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunity_Grades__C() {
        return opportunityGradesC;
    }

    /**
     * Sets the value of the opportunity_Grades__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunity_Grades__C(String value) {
        this.opportunityGradesC = value;
    }

    /**
     * Gets the value of the opportunity_Stage__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunity_Stage__C() {
        return opportunityStageC;
    }

    /**
     * Sets the value of the opportunity_Stage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunity_Stage__C(String value) {
        this.opportunityStageC = value;
    }

    /**
     * Gets the value of the opportunity_Value__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpportunity_Value__C() {
        return opportunityValueC;
    }

    /**
     * Sets the value of the opportunity_Value__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpportunity_Value__C(Double value) {
        this.opportunityValueC = value;
    }

    /**
     * Gets the value of the other_Event_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther_Event_Type__C() {
        return otherEventTypeC;
    }

    /**
     * Sets the value of the other_Event_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther_Event_Type__C(String value) {
        this.otherEventTypeC = value;
    }

    /**
     * Gets the value of the other_Resource_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther_Resource_Type__C() {
        return otherResourceTypeC;
    }

    /**
     * Sets the value of the other_Resource_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther_Resource_Type__C(String value) {
        this.otherResourceTypeC = value;
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
     * Gets the value of the problem_The_District_Is_Trying_To_Solve__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblem_The_District_Is_Trying_To_Solve__C() {
        return problemTheDistrictIsTryingToSolveC;
    }

    /**
     * Sets the value of the problem_The_District_Is_Trying_To_Solve__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblem_The_District_Is_Trying_To_Solve__C(String value) {
        this.problemTheDistrictIsTryingToSolveC = value;
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
     * Gets the value of the rsvp_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSVP_Code__C() {
        return rsvpCodeC;
    }

    /**
     * Sets the value of the rsvp_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSVP_Code__C(String value) {
        this.rsvpCodeC = value;
    }

    /**
     * Gets the value of the rsvp__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getRSVP__R() {
        return rsvpR;
    }

    /**
     * Sets the value of the rsvp__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setRSVP__R(QueryResult value) {
        this.rsvpR = value;
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
     * Gets the value of the requested_Consultant__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequested_Consultant__C() {
        return requestedConsultantC;
    }

    /**
     * Sets the value of the requested_Consultant__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequested_Consultant__C(String value) {
        this.requestedConsultantC = value;
    }

    /**
     * Gets the value of the srfNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRFNumber__C() {
        return srfNumberC;
    }

    /**
     * Sets the value of the srfNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRFNumber__C(String value) {
        this.srfNumberC = value;
    }

    /**
     * Gets the value of the sales_Rep_Delivered__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSales_Rep_Delivered__C() {
        return salesRepDeliveredC;
    }

    /**
     * Sets the value of the sales_Rep_Delivered__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSales_Rep_Delivered__C(Boolean value) {
        this.salesRepDeliveredC = value;
    }

    /**
     * Gets the value of the sales_Resource__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Resource__C() {
        return salesResourceC;
    }

    /**
     * Sets the value of the sales_Resource__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Resource__C(String value) {
        this.salesResourceC = value;
    }

    /**
     * Gets the value of the scheduler_Notes_To_Field__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduler_Notes_To_Field__C() {
        return schedulerNotesToFieldC;
    }

    /**
     * Sets the value of the scheduler_Notes_To_Field__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduler_Notes_To_Field__C(String value) {
        this.schedulerNotesToFieldC = value;
    }

    /**
     * Gets the value of the scheduler__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduler__C() {
        return schedulerC;
    }

    /**
     * Sets the value of the scheduler__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduler__C(String value) {
        this.schedulerC = value;
    }

    /**
     * Gets the value of the scheduler__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getScheduler__R() {
        return schedulerR;
    }

    /**
     * Sets the value of the scheduler__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setScheduler__R(UserType value) {
        this.schedulerR = value;
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
     * Gets the value of the suggested_Hotel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggested_Hotel__C() {
        return suggestedHotelC;
    }

    /**
     * Sets the value of the suggested_Hotel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggested_Hotel__C(String value) {
        this.suggestedHotelC = value;
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
     * Gets the value of the topic__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopic__C() {
        return topicC;
    }

    /**
     * Sets the value of the topic__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopic__C(String value) {
        this.topicC = value;
    }

    /**
     * Gets the value of the what_Are_The_Objectives_Of_This_Meeting__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhat_Are_The_Objectives_Of_This_Meeting__C() {
        return whatAreTheObjectivesOfThisMeetingC;
    }

    /**
     * Sets the value of the what_Are_The_Objectives_Of_This_Meeting__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhat_Are_The_Objectives_Of_This_Meeting__C(String value) {
        this.whatAreTheObjectivesOfThisMeetingC = value;
    }

    /**
     * Gets the value of the what_Has_Occurred_Prior_To_This_Meeting__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhat_Has_Occurred_Prior_To_This_Meeting__C() {
        return whatHasOccurredPriorToThisMeetingC;
    }

    /**
     * Sets the value of the what_Has_Occurred_Prior_To_This_Meeting__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhat_Has_Occurred_Prior_To_This_Meeting__C(String value) {
        this.whatHasOccurredPriorToThisMeetingC = value;
    }

    /**
     * Gets the value of the who_Is_The_Competition__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWho_Is_The_Competition__C() {
        return whoIsTheCompetitionC;
    }

    /**
     * Sets the value of the who_Is_The_Competition__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWho_Is_The_Competition__C(String value) {
        this.whoIsTheCompetitionC = value;
    }

    /**
     * Gets the value of the cancelled_Reason__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelled_Reason__C() {
        return cancelledReasonC;
    }

    /**
     * Sets the value of the cancelled_Reason__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelled_Reason__C(String value) {
        this.cancelledReasonC = value;
    }

    /**
     * Gets the value of the cons_Per_Diem_Needed__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCons_Per_Diem_Needed__C() {
        return consPerDiemNeededC;
    }

    /**
     * Sets the value of the cons_Per_Diem_Needed__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCons_Per_Diem_Needed__C(Boolean value) {
        this.consPerDiemNeededC = value;
    }

    /**
     * Gets the value of the disciplines__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisciplines__C() {
        return disciplinesC;
    }

    /**
     * Sets the value of the disciplines__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplines__C(String value) {
        this.disciplinesC = value;
    }

    /**
     * Gets the value of the duration__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration__C() {
        return durationC;
    }

    /**
     * Sets the value of the duration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration__C(String value) {
        this.durationC = value;
    }

    /**
     * Gets the value of the event_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent_Type__C() {
        return eventTypeC;
    }

    /**
     * Sets the value of the event_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent_Type__C(String value) {
        this.eventTypeC = value;
    }

    /**
     * Gets the value of the explain_Multiple_Sessions__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplain_Multiple_Sessions__C() {
        return explainMultipleSessionsC;
    }

    /**
     * Sets the value of the explain_Multiple_Sessions__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplain_Multiple_Sessions__C(String value) {
        this.explainMultipleSessionsC = value;
    }

    /**
     * Gets the value of the explain_Session_Desc_Times__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplain_Session_Desc_Times__C() {
        return explainSessionDescTimesC;
    }

    /**
     * Sets the value of the explain_Session_Desc_Times__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplain_Session_Desc_Times__C(String value) {
        this.explainSessionDescTimesC = value;
    }

    /**
     * Gets the value of the instructions_Updates__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructions_Updates__C() {
        return instructionsUpdatesC;
    }

    /**
     * Sets the value of the instructions_Updates__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructions_Updates__C(String value) {
        this.instructionsUpdatesC = value;
    }

    /**
     * Gets the value of the is_Approved__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIs_Approved__C() {
        return isApprovedC;
    }

    /**
     * Sets the value of the is_Approved__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIs_Approved__C(Boolean value) {
        this.isApprovedC = value;
    }

    /**
     * Gets the value of the related_Opportunity__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated_Opportunity__C() {
        return relatedOpportunityC;
    }

    /**
     * Sets the value of the related_Opportunity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated_Opportunity__C(String value) {
        this.relatedOpportunityC = value;
    }

    /**
     * Gets the value of the related_Opportunity__R property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityType }
     *     
     */
    public OpportunityType getRelated_Opportunity__R() {
        return relatedOpportunityR;
    }

    /**
     * Sets the value of the related_Opportunity__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityType }
     *     
     */
    public void setRelated_Opportunity__R(OpportunityType value) {
        this.relatedOpportunityR = value;
    }

    /**
     * Gets the value of the rep_Pick_Up_At_Airport__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRep_Pick_Up_At_Airport__C() {
        return repPickUpAtAirportC;
    }

    /**
     * Sets the value of the rep_Pick_Up_At_Airport__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRep_Pick_Up_At_Airport__C(Boolean value) {
        this.repPickUpAtAirportC = value;
    }

    /**
     * Gets the value of the requester_Cell__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequester_Cell__C() {
        return requesterCellC;
    }

    /**
     * Sets the value of the requester_Cell__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequester_Cell__C(String value) {
        this.requesterCellC = value;
    }

    /**
     * Gets the value of the requester_Email__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequester_Email__C() {
        return requesterEmailC;
    }

    /**
     * Sets the value of the requester_Email__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequester_Email__C(String value) {
        this.requesterEmailC = value;
    }

    /**
     * Gets the value of the requester_Phone__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequester_Phone__C() {
        return requesterPhoneC;
    }

    /**
     * Sets the value of the requester_Phone__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequester_Phone__C(String value) {
        this.requesterPhoneC = value;
    }

    /**
     * Gets the value of the sales_Rep_Attending__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSales_Rep_Attending__C() {
        return salesRepAttendingC;
    }

    /**
     * Sets the value of the sales_Rep_Attending__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSales_Rep_Attending__C(Boolean value) {
        this.salesRepAttendingC = value;
    }

    /**
     * Gets the value of the scheduler_Project_Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduler_Project_Notes__C() {
        return schedulerProjectNotesC;
    }

    /**
     * Sets the value of the scheduler_Project_Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduler_Project_Notes__C(String value) {
        this.schedulerProjectNotesC = value;
    }

    /**
     * Gets the value of the service_Request_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService_Request_Type__C() {
        return serviceRequestTypeC;
    }

    /**
     * Sets the value of the service_Request_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService_Request_Type__C(String value) {
        this.serviceRequestTypeC = value;
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
     * Gets the value of the time_Zone__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime_Zone__C() {
        return timeZoneC;
    }

    /**
     * Sets the value of the time_Zone__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime_Zone__C(String value) {
        this.timeZoneC = value;
    }

}
