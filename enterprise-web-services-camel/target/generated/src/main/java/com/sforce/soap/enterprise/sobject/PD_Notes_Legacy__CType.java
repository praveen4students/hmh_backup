
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for PD_Notes_Legacy__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PD_Notes_Legacy__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Account__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Activities_included_in_literacy_block__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Login__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Password__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assessments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Asset__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Attendee_Observations_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendees_Include_Function__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendees_of_Note__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Checklist_Sent__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Closest_Airport__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Completed_Checklist_Received__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Completed_Planning_Pages_Received__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Core_Curriculum__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Delivery_Confirmed__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Describe_Additional_Intervention_Time__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Describe_Attendees__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Describe_Current_Intervention_Materials__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Describe_Current_Supplemental_Materials__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Describe_Implementation__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Describe_Literacy_Block__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Describe_Reading_Block__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Distance_Airport_to_Training__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Earobics_to_be_used_in__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Earobics_will_be_implemented_in__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Network_Setup_req_Early_Trainer_Arrival__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Notable_Attendees__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Notes_on_Early_Arrival__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes_on_Follow_Up__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes_on_Teachers_Bringing_TR_s__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes_on_Trainer_CD_install__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_of_Attendees__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Office_Follow_up__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Other_Content_Issues__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Other_Pre_Training_Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Other_Travel_Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Per_Diem_Trainer__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Planning_Pages_Sent__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Preferred_Operating_Systems__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Recommended_Hotel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Record_Creator__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rep_Contacted_on_Their_Follow_Up__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sales_Follow_Up__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Notes_Resolved__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Shipping_Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Software_install_requires_Trainer_CD_Ver__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Specific_Customization_Provided__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Staff_Contacted_on_Office_Follow_Up__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Step_1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Step_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Students_Using_Earobics_include__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Teachers_Bringing_TR_s__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Teachers_Students_enrolled_by_Trainer__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Tech_Issues_Resolved__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Tech_Issues__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Technology_Contact__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trainer_Follow_Up_Completed__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Trainer_Observations_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trainer__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Training_Begins_on__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Training_Contact__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Training_Ends_On__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Training_Materials_Ordered__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Training_Times__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Training_location__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type_of_Training__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version_and_Delivery_Method__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Workstation_Password_Required__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PD_Notes_Legacy__c", propOrder = {
    "accountC",
    "activitiesIncludedInLiteracyBlockC",
    "adminLoginC",
    "adminPasswordC",
    "assessmentsC",
    "assetC",
    "attachments",
    "attendeeObservationsCommentsC",
    "attendeesIncludeFunctionC",
    "attendeesOfNoteC",
    "checklistSentC",
    "closestAirportC",
    "completedChecklistReceivedC",
    "completedPlanningPagesReceivedC",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "coreCurriculumC",
    "createdBy",
    "createdById",
    "createdDate",
    "deliveryConfirmedC",
    "describeAdditionalInterventionTimeC",
    "describeAttendeesC",
    "describeCurrentInterventionMaterialsC",
    "describeCurrentSupplementalMaterialsC",
    "describeImplementationC",
    "describeLiteracyBlockC",
    "describeReadingBlockC",
    "distanceAirportToTrainingC",
    "earobicsToBeUsedInC",
    "earobicsWillBeImplementedInC",
    "feedSubscriptionsForEntity",
    "isDeleted",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "name",
    "networkSetupReqEarlyTrainerArrivalC",
    "notableAttendeesC",
    "notes",
    "notesAndAttachments",
    "notesOnEarlyArrivalC",
    "notesOnFollowUpC",
    "notesOnTeachersBringingTRSC",
    "notesOnTrainerCDInstallC",
    "numberOfAttendeesC",
    "officeFollowUpC",
    "otherContentIssuesC",
    "otherPreTrainingNotesC",
    "otherTravelNotesC",
    "owner",
    "ownerId",
    "perDiemTrainerC",
    "planningPagesSentC",
    "preferredOperatingSystemsC",
    "processInstances",
    "processSteps",
    "recommendedHotelC",
    "recordCreatorC",
    "repContactedOnTheirFollowUpC",
    "salesFollowUpC",
    "shippingNotesResolvedC",
    "shippingNotesC",
    "softwareInstallRequiresTrainerCDVerC",
    "specificCustomizationProvidedC",
    "staffContactedOnOfficeFollowUpC",
    "step1C",
    "step2C",
    "studentsUsingEarobicsIncludeC",
    "systemModstamp",
    "teachersBringingTRSC",
    "teachersStudentsEnrolledByTrainerC",
    "techIssuesResolvedC",
    "techIssuesC",
    "technologyContactC",
    "trainerFollowUpCompletedC",
    "trainerObservationsCommentsC",
    "trainerC",
    "trainingBeginsOnC",
    "trainingContactC",
    "trainingEndsOnC",
    "trainingMaterialsOrderedC",
    "trainingTimesC",
    "trainingLocationC",
    "typeOfTrainingC",
    "versionAndDeliveryMethodC",
    "workstationPasswordRequiredC"
})
public class PD_Notes_Legacy__CType
    extends SObjectType
{

    @XmlElement(name = "Account__c", nillable = true)
    protected String accountC;
    @XmlElement(name = "Activities_included_in_literacy_block__c", nillable = true)
    protected String activitiesIncludedInLiteracyBlockC;
    @XmlElement(name = "Admin_Login__c", nillable = true)
    protected String adminLoginC;
    @XmlElement(name = "Admin_Password__c", nillable = true)
    protected String adminPasswordC;
    @XmlElement(name = "Assessments__c", nillable = true)
    protected String assessmentsC;
    @XmlElement(name = "Asset__c", nillable = true)
    protected String assetC;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "Attendee_Observations_Comments__c", nillable = true)
    protected String attendeeObservationsCommentsC;
    @XmlElement(name = "Attendees_Include_Function__c", nillable = true)
    protected String attendeesIncludeFunctionC;
    @XmlElement(name = "Attendees_of_Note__c", nillable = true)
    protected String attendeesOfNoteC;
    @XmlElement(name = "Checklist_Sent__c", nillable = true)
    protected Boolean checklistSentC;
    @XmlElement(name = "Closest_Airport__c", nillable = true)
    protected String closestAirportC;
    @XmlElement(name = "Completed_Checklist_Received__c", nillable = true)
    protected Boolean completedChecklistReceivedC;
    @XmlElement(name = "Completed_Planning_Pages_Received__c", nillable = true)
    protected Boolean completedPlanningPagesReceivedC;
    @XmlElement(name = "ConnectionReceived", nillable = true)
    protected PartnerNetworkConnectionType connectionReceived;
    @XmlElement(name = "ConnectionReceivedId", nillable = true)
    protected String connectionReceivedId;
    @XmlElement(name = "ConnectionSent", nillable = true)
    protected PartnerNetworkConnectionType connectionSent;
    @XmlElement(name = "ConnectionSentId", nillable = true)
    protected String connectionSentId;
    @XmlElement(name = "Core_Curriculum__c", nillable = true)
    protected String coreCurriculumC;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Delivery_Confirmed__c", nillable = true)
    protected Boolean deliveryConfirmedC;
    @XmlElement(name = "Describe_Additional_Intervention_Time__c", nillable = true)
    protected String describeAdditionalInterventionTimeC;
    @XmlElement(name = "Describe_Attendees__c", nillable = true)
    protected String describeAttendeesC;
    @XmlElement(name = "Describe_Current_Intervention_Materials__c", nillable = true)
    protected String describeCurrentInterventionMaterialsC;
    @XmlElement(name = "Describe_Current_Supplemental_Materials__c", nillable = true)
    protected String describeCurrentSupplementalMaterialsC;
    @XmlElement(name = "Describe_Implementation__c", nillable = true)
    protected String describeImplementationC;
    @XmlElement(name = "Describe_Literacy_Block__c", nillable = true)
    protected String describeLiteracyBlockC;
    @XmlElement(name = "Describe_Reading_Block__c", nillable = true)
    protected String describeReadingBlockC;
    @XmlElement(name = "Distance_Airport_to_Training__c", nillable = true)
    protected String distanceAirportToTrainingC;
    @XmlElement(name = "Earobics_to_be_used_in__c", nillable = true)
    protected String earobicsToBeUsedInC;
    @XmlElement(name = "Earobics_will_be_implemented_in__c", nillable = true)
    protected String earobicsWillBeImplementedInC;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Network_Setup_req_Early_Trainer_Arrival__c", nillable = true)
    protected Boolean networkSetupReqEarlyTrainerArrivalC;
    @XmlElement(name = "Notable_Attendees__c", nillable = true)
    protected String notableAttendeesC;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "Notes_on_Early_Arrival__c", nillable = true)
    protected String notesOnEarlyArrivalC;
    @XmlElement(name = "Notes_on_Follow_Up__c", nillable = true)
    protected String notesOnFollowUpC;
    @XmlElement(name = "Notes_on_Teachers_Bringing_TR_s__c", nillable = true)
    protected String notesOnTeachersBringingTRSC;
    @XmlElement(name = "Notes_on_Trainer_CD_install__c", nillable = true)
    protected String notesOnTrainerCDInstallC;
    @XmlElement(name = "Number_of_Attendees__c", nillable = true)
    protected String numberOfAttendeesC;
    @XmlElement(name = "Office_Follow_up__c", nillable = true)
    protected String officeFollowUpC;
    @XmlElement(name = "Other_Content_Issues__c", nillable = true)
    protected String otherContentIssuesC;
    @XmlElement(name = "Other_Pre_Training_Notes__c", nillable = true)
    protected String otherPreTrainingNotesC;
    @XmlElement(name = "Other_Travel_Notes__c", nillable = true)
    protected String otherTravelNotesC;
    @XmlElement(name = "Owner", nillable = true)
    protected NameType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "Per_Diem_Trainer__c", nillable = true)
    protected String perDiemTrainerC;
    @XmlElement(name = "Planning_Pages_Sent__c", nillable = true)
    protected Boolean planningPagesSentC;
    @XmlElement(name = "Preferred_Operating_Systems__c", nillable = true)
    protected String preferredOperatingSystemsC;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "Recommended_Hotel__c", nillable = true)
    protected String recommendedHotelC;
    @XmlElement(name = "Record_Creator__c", nillable = true)
    protected String recordCreatorC;
    @XmlElement(name = "Rep_Contacted_on_Their_Follow_Up__c", nillable = true)
    protected Boolean repContactedOnTheirFollowUpC;
    @XmlElement(name = "Sales_Follow_Up__c", nillable = true)
    protected String salesFollowUpC;
    @XmlElement(name = "Shipping_Notes_Resolved__c", nillable = true)
    protected Boolean shippingNotesResolvedC;
    @XmlElement(name = "Shipping_Notes__c", nillable = true)
    protected String shippingNotesC;
    @XmlElement(name = "Software_install_requires_Trainer_CD_Ver__c", nillable = true)
    protected Boolean softwareInstallRequiresTrainerCDVerC;
    @XmlElement(name = "Specific_Customization_Provided__c", nillable = true)
    protected String specificCustomizationProvidedC;
    @XmlElement(name = "Staff_Contacted_on_Office_Follow_Up__c", nillable = true)
    protected Boolean staffContactedOnOfficeFollowUpC;
    @XmlElement(name = "Step_1__c", nillable = true)
    protected String step1C;
    @XmlElement(name = "Step_2__c", nillable = true)
    protected String step2C;
    @XmlElement(name = "Students_Using_Earobics_include__c", nillable = true)
    protected String studentsUsingEarobicsIncludeC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Teachers_Bringing_TR_s__c", nillable = true)
    protected Boolean teachersBringingTRSC;
    @XmlElement(name = "Teachers_Students_enrolled_by_Trainer__c", nillable = true)
    protected Boolean teachersStudentsEnrolledByTrainerC;
    @XmlElement(name = "Tech_Issues_Resolved__c", nillable = true)
    protected Boolean techIssuesResolvedC;
    @XmlElement(name = "Tech_Issues__c", nillable = true)
    protected String techIssuesC;
    @XmlElement(name = "Technology_Contact__c", nillable = true)
    protected String technologyContactC;
    @XmlElement(name = "Trainer_Follow_Up_Completed__c", nillable = true)
    protected Boolean trainerFollowUpCompletedC;
    @XmlElement(name = "Trainer_Observations_Comments__c", nillable = true)
    protected String trainerObservationsCommentsC;
    @XmlElement(name = "Trainer__c", nillable = true)
    protected String trainerC;
    @XmlElement(name = "Training_Begins_on__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trainingBeginsOnC;
    @XmlElement(name = "Training_Contact__c", nillable = true)
    protected String trainingContactC;
    @XmlElement(name = "Training_Ends_On__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trainingEndsOnC;
    @XmlElement(name = "Training_Materials_Ordered__c", nillable = true)
    protected Boolean trainingMaterialsOrderedC;
    @XmlElement(name = "Training_Times__c", nillable = true)
    protected String trainingTimesC;
    @XmlElement(name = "Training_location__c", nillable = true)
    protected String trainingLocationC;
    @XmlElement(name = "Type_of_Training__c", nillable = true)
    protected String typeOfTrainingC;
    @XmlElement(name = "Version_and_Delivery_Method__c", nillable = true)
    protected String versionAndDeliveryMethodC;
    @XmlElement(name = "Workstation_Password_Required__c", nillable = true)
    protected String workstationPasswordRequiredC;

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
     * Gets the value of the activities_Included_In_Literacy_Block__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivities_Included_In_Literacy_Block__C() {
        return activitiesIncludedInLiteracyBlockC;
    }

    /**
     * Sets the value of the activities_Included_In_Literacy_Block__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivities_Included_In_Literacy_Block__C(String value) {
        this.activitiesIncludedInLiteracyBlockC = value;
    }

    /**
     * Gets the value of the admin_Login__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmin_Login__C() {
        return adminLoginC;
    }

    /**
     * Sets the value of the admin_Login__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmin_Login__C(String value) {
        this.adminLoginC = value;
    }

    /**
     * Gets the value of the admin_Password__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmin_Password__C() {
        return adminPasswordC;
    }

    /**
     * Sets the value of the admin_Password__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmin_Password__C(String value) {
        this.adminPasswordC = value;
    }

    /**
     * Gets the value of the assessments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessments__C() {
        return assessmentsC;
    }

    /**
     * Sets the value of the assessments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessments__C(String value) {
        this.assessmentsC = value;
    }

    /**
     * Gets the value of the asset__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsset__C() {
        return assetC;
    }

    /**
     * Sets the value of the asset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsset__C(String value) {
        this.assetC = value;
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
     * Gets the value of the attendee_Observations_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendee_Observations_Comments__C() {
        return attendeeObservationsCommentsC;
    }

    /**
     * Sets the value of the attendee_Observations_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendee_Observations_Comments__C(String value) {
        this.attendeeObservationsCommentsC = value;
    }

    /**
     * Gets the value of the attendees_Include_Function__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendees_Include_Function__C() {
        return attendeesIncludeFunctionC;
    }

    /**
     * Sets the value of the attendees_Include_Function__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendees_Include_Function__C(String value) {
        this.attendeesIncludeFunctionC = value;
    }

    /**
     * Gets the value of the attendees_Of_Note__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendees_Of_Note__C() {
        return attendeesOfNoteC;
    }

    /**
     * Sets the value of the attendees_Of_Note__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendees_Of_Note__C(String value) {
        this.attendeesOfNoteC = value;
    }

    /**
     * Gets the value of the checklist_Sent__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChecklist_Sent__C() {
        return checklistSentC;
    }

    /**
     * Sets the value of the checklist_Sent__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChecklist_Sent__C(Boolean value) {
        this.checklistSentC = value;
    }

    /**
     * Gets the value of the closest_Airport__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosest_Airport__C() {
        return closestAirportC;
    }

    /**
     * Sets the value of the closest_Airport__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosest_Airport__C(String value) {
        this.closestAirportC = value;
    }

    /**
     * Gets the value of the completed_Checklist_Received__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompleted_Checklist_Received__C() {
        return completedChecklistReceivedC;
    }

    /**
     * Sets the value of the completed_Checklist_Received__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompleted_Checklist_Received__C(Boolean value) {
        this.completedChecklistReceivedC = value;
    }

    /**
     * Gets the value of the completed_Planning_Pages_Received__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompleted_Planning_Pages_Received__C() {
        return completedPlanningPagesReceivedC;
    }

    /**
     * Sets the value of the completed_Planning_Pages_Received__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompleted_Planning_Pages_Received__C(Boolean value) {
        this.completedPlanningPagesReceivedC = value;
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
     * Gets the value of the core_Curriculum__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCore_Curriculum__C() {
        return coreCurriculumC;
    }

    /**
     * Sets the value of the core_Curriculum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCore_Curriculum__C(String value) {
        this.coreCurriculumC = value;
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
     * Gets the value of the delivery_Confirmed__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelivery_Confirmed__C() {
        return deliveryConfirmedC;
    }

    /**
     * Sets the value of the delivery_Confirmed__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelivery_Confirmed__C(Boolean value) {
        this.deliveryConfirmedC = value;
    }

    /**
     * Gets the value of the describe_Additional_Intervention_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescribe_Additional_Intervention_Time__C() {
        return describeAdditionalInterventionTimeC;
    }

    /**
     * Sets the value of the describe_Additional_Intervention_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescribe_Additional_Intervention_Time__C(String value) {
        this.describeAdditionalInterventionTimeC = value;
    }

    /**
     * Gets the value of the describe_Attendees__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescribe_Attendees__C() {
        return describeAttendeesC;
    }

    /**
     * Sets the value of the describe_Attendees__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescribe_Attendees__C(String value) {
        this.describeAttendeesC = value;
    }

    /**
     * Gets the value of the describe_Current_Intervention_Materials__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescribe_Current_Intervention_Materials__C() {
        return describeCurrentInterventionMaterialsC;
    }

    /**
     * Sets the value of the describe_Current_Intervention_Materials__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescribe_Current_Intervention_Materials__C(String value) {
        this.describeCurrentInterventionMaterialsC = value;
    }

    /**
     * Gets the value of the describe_Current_Supplemental_Materials__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescribe_Current_Supplemental_Materials__C() {
        return describeCurrentSupplementalMaterialsC;
    }

    /**
     * Sets the value of the describe_Current_Supplemental_Materials__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescribe_Current_Supplemental_Materials__C(String value) {
        this.describeCurrentSupplementalMaterialsC = value;
    }

    /**
     * Gets the value of the describe_Implementation__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescribe_Implementation__C() {
        return describeImplementationC;
    }

    /**
     * Sets the value of the describe_Implementation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescribe_Implementation__C(String value) {
        this.describeImplementationC = value;
    }

    /**
     * Gets the value of the describe_Literacy_Block__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescribe_Literacy_Block__C() {
        return describeLiteracyBlockC;
    }

    /**
     * Sets the value of the describe_Literacy_Block__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescribe_Literacy_Block__C(String value) {
        this.describeLiteracyBlockC = value;
    }

    /**
     * Gets the value of the describe_Reading_Block__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescribe_Reading_Block__C() {
        return describeReadingBlockC;
    }

    /**
     * Sets the value of the describe_Reading_Block__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescribe_Reading_Block__C(String value) {
        this.describeReadingBlockC = value;
    }

    /**
     * Gets the value of the distance_Airport_To_Training__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistance_Airport_To_Training__C() {
        return distanceAirportToTrainingC;
    }

    /**
     * Sets the value of the distance_Airport_To_Training__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistance_Airport_To_Training__C(String value) {
        this.distanceAirportToTrainingC = value;
    }

    /**
     * Gets the value of the earobics_To_Be_Used_In__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarobics_To_Be_Used_In__C() {
        return earobicsToBeUsedInC;
    }

    /**
     * Sets the value of the earobics_To_Be_Used_In__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarobics_To_Be_Used_In__C(String value) {
        this.earobicsToBeUsedInC = value;
    }

    /**
     * Gets the value of the earobics_Will_Be_Implemented_In__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarobics_Will_Be_Implemented_In__C() {
        return earobicsWillBeImplementedInC;
    }

    /**
     * Sets the value of the earobics_Will_Be_Implemented_In__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarobics_Will_Be_Implemented_In__C(String value) {
        this.earobicsWillBeImplementedInC = value;
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
     * Gets the value of the network_Setup_Req_Early_Trainer_Arrival__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetwork_Setup_Req_Early_Trainer_Arrival__C() {
        return networkSetupReqEarlyTrainerArrivalC;
    }

    /**
     * Sets the value of the network_Setup_Req_Early_Trainer_Arrival__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetwork_Setup_Req_Early_Trainer_Arrival__C(Boolean value) {
        this.networkSetupReqEarlyTrainerArrivalC = value;
    }

    /**
     * Gets the value of the notable_Attendees__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotable_Attendees__C() {
        return notableAttendeesC;
    }

    /**
     * Sets the value of the notable_Attendees__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotable_Attendees__C(String value) {
        this.notableAttendeesC = value;
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
     * Gets the value of the notes_On_Early_Arrival__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes_On_Early_Arrival__C() {
        return notesOnEarlyArrivalC;
    }

    /**
     * Sets the value of the notes_On_Early_Arrival__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes_On_Early_Arrival__C(String value) {
        this.notesOnEarlyArrivalC = value;
    }

    /**
     * Gets the value of the notes_On_Follow_Up__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes_On_Follow_Up__C() {
        return notesOnFollowUpC;
    }

    /**
     * Sets the value of the notes_On_Follow_Up__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes_On_Follow_Up__C(String value) {
        this.notesOnFollowUpC = value;
    }

    /**
     * Gets the value of the notes_On_Teachers_Bringing_TR_S__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes_On_Teachers_Bringing_TR_S__C() {
        return notesOnTeachersBringingTRSC;
    }

    /**
     * Sets the value of the notes_On_Teachers_Bringing_TR_S__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes_On_Teachers_Bringing_TR_S__C(String value) {
        this.notesOnTeachersBringingTRSC = value;
    }

    /**
     * Gets the value of the notes_On_Trainer_CD_Install__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes_On_Trainer_CD_Install__C() {
        return notesOnTrainerCDInstallC;
    }

    /**
     * Sets the value of the notes_On_Trainer_CD_Install__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes_On_Trainer_CD_Install__C(String value) {
        this.notesOnTrainerCDInstallC = value;
    }

    /**
     * Gets the value of the number_Of_Attendees__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber_Of_Attendees__C() {
        return numberOfAttendeesC;
    }

    /**
     * Sets the value of the number_Of_Attendees__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber_Of_Attendees__C(String value) {
        this.numberOfAttendeesC = value;
    }

    /**
     * Gets the value of the office_Follow_Up__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffice_Follow_Up__C() {
        return officeFollowUpC;
    }

    /**
     * Sets the value of the office_Follow_Up__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffice_Follow_Up__C(String value) {
        this.officeFollowUpC = value;
    }

    /**
     * Gets the value of the other_Content_Issues__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther_Content_Issues__C() {
        return otherContentIssuesC;
    }

    /**
     * Sets the value of the other_Content_Issues__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther_Content_Issues__C(String value) {
        this.otherContentIssuesC = value;
    }

    /**
     * Gets the value of the other_Pre_Training_Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther_Pre_Training_Notes__C() {
        return otherPreTrainingNotesC;
    }

    /**
     * Sets the value of the other_Pre_Training_Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther_Pre_Training_Notes__C(String value) {
        this.otherPreTrainingNotesC = value;
    }

    /**
     * Gets the value of the other_Travel_Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther_Travel_Notes__C() {
        return otherTravelNotesC;
    }

    /**
     * Sets the value of the other_Travel_Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther_Travel_Notes__C(String value) {
        this.otherTravelNotesC = value;
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
     * Gets the value of the per_Diem_Trainer__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPer_Diem_Trainer__C() {
        return perDiemTrainerC;
    }

    /**
     * Sets the value of the per_Diem_Trainer__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPer_Diem_Trainer__C(String value) {
        this.perDiemTrainerC = value;
    }

    /**
     * Gets the value of the planning_Pages_Sent__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanning_Pages_Sent__C() {
        return planningPagesSentC;
    }

    /**
     * Sets the value of the planning_Pages_Sent__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlanning_Pages_Sent__C(Boolean value) {
        this.planningPagesSentC = value;
    }

    /**
     * Gets the value of the preferred_Operating_Systems__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferred_Operating_Systems__C() {
        return preferredOperatingSystemsC;
    }

    /**
     * Sets the value of the preferred_Operating_Systems__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferred_Operating_Systems__C(String value) {
        this.preferredOperatingSystemsC = value;
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
     * Gets the value of the recommended_Hotel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommended_Hotel__C() {
        return recommendedHotelC;
    }

    /**
     * Sets the value of the recommended_Hotel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommended_Hotel__C(String value) {
        this.recommendedHotelC = value;
    }

    /**
     * Gets the value of the record_Creator__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecord_Creator__C() {
        return recordCreatorC;
    }

    /**
     * Sets the value of the record_Creator__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecord_Creator__C(String value) {
        this.recordCreatorC = value;
    }

    /**
     * Gets the value of the rep_Contacted_On_Their_Follow_Up__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRep_Contacted_On_Their_Follow_Up__C() {
        return repContactedOnTheirFollowUpC;
    }

    /**
     * Sets the value of the rep_Contacted_On_Their_Follow_Up__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRep_Contacted_On_Their_Follow_Up__C(Boolean value) {
        this.repContactedOnTheirFollowUpC = value;
    }

    /**
     * Gets the value of the sales_Follow_Up__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Follow_Up__C() {
        return salesFollowUpC;
    }

    /**
     * Sets the value of the sales_Follow_Up__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Follow_Up__C(String value) {
        this.salesFollowUpC = value;
    }

    /**
     * Gets the value of the shipping_Notes_Resolved__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipping_Notes_Resolved__C() {
        return shippingNotesResolvedC;
    }

    /**
     * Sets the value of the shipping_Notes_Resolved__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipping_Notes_Resolved__C(Boolean value) {
        this.shippingNotesResolvedC = value;
    }

    /**
     * Gets the value of the shipping_Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipping_Notes__C() {
        return shippingNotesC;
    }

    /**
     * Sets the value of the shipping_Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipping_Notes__C(String value) {
        this.shippingNotesC = value;
    }

    /**
     * Gets the value of the software_Install_Requires_Trainer_CD_Ver__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoftware_Install_Requires_Trainer_CD_Ver__C() {
        return softwareInstallRequiresTrainerCDVerC;
    }

    /**
     * Sets the value of the software_Install_Requires_Trainer_CD_Ver__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoftware_Install_Requires_Trainer_CD_Ver__C(Boolean value) {
        this.softwareInstallRequiresTrainerCDVerC = value;
    }

    /**
     * Gets the value of the specific_Customization_Provided__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecific_Customization_Provided__C() {
        return specificCustomizationProvidedC;
    }

    /**
     * Sets the value of the specific_Customization_Provided__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecific_Customization_Provided__C(String value) {
        this.specificCustomizationProvidedC = value;
    }

    /**
     * Gets the value of the staff_Contacted_On_Office_Follow_Up__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStaff_Contacted_On_Office_Follow_Up__C() {
        return staffContactedOnOfficeFollowUpC;
    }

    /**
     * Sets the value of the staff_Contacted_On_Office_Follow_Up__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaff_Contacted_On_Office_Follow_Up__C(Boolean value) {
        this.staffContactedOnOfficeFollowUpC = value;
    }

    /**
     * Gets the value of the step_1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStep_1__C() {
        return step1C;
    }

    /**
     * Sets the value of the step_1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStep_1__C(String value) {
        this.step1C = value;
    }

    /**
     * Gets the value of the step_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStep_2__C() {
        return step2C;
    }

    /**
     * Sets the value of the step_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStep_2__C(String value) {
        this.step2C = value;
    }

    /**
     * Gets the value of the students_Using_Earobics_Include__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudents_Using_Earobics_Include__C() {
        return studentsUsingEarobicsIncludeC;
    }

    /**
     * Sets the value of the students_Using_Earobics_Include__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudents_Using_Earobics_Include__C(String value) {
        this.studentsUsingEarobicsIncludeC = value;
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
     * Gets the value of the teachers_Bringing_TR_S__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTeachers_Bringing_TR_S__C() {
        return teachersBringingTRSC;
    }

    /**
     * Sets the value of the teachers_Bringing_TR_S__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTeachers_Bringing_TR_S__C(Boolean value) {
        this.teachersBringingTRSC = value;
    }

    /**
     * Gets the value of the teachers_Students_Enrolled_By_Trainer__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTeachers_Students_Enrolled_By_Trainer__C() {
        return teachersStudentsEnrolledByTrainerC;
    }

    /**
     * Sets the value of the teachers_Students_Enrolled_By_Trainer__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTeachers_Students_Enrolled_By_Trainer__C(Boolean value) {
        this.teachersStudentsEnrolledByTrainerC = value;
    }

    /**
     * Gets the value of the tech_Issues_Resolved__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTech_Issues_Resolved__C() {
        return techIssuesResolvedC;
    }

    /**
     * Sets the value of the tech_Issues_Resolved__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTech_Issues_Resolved__C(Boolean value) {
        this.techIssuesResolvedC = value;
    }

    /**
     * Gets the value of the tech_Issues__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTech_Issues__C() {
        return techIssuesC;
    }

    /**
     * Sets the value of the tech_Issues__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTech_Issues__C(String value) {
        this.techIssuesC = value;
    }

    /**
     * Gets the value of the technology_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnology_Contact__C() {
        return technologyContactC;
    }

    /**
     * Sets the value of the technology_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnology_Contact__C(String value) {
        this.technologyContactC = value;
    }

    /**
     * Gets the value of the trainer_Follow_Up_Completed__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrainer_Follow_Up_Completed__C() {
        return trainerFollowUpCompletedC;
    }

    /**
     * Sets the value of the trainer_Follow_Up_Completed__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrainer_Follow_Up_Completed__C(Boolean value) {
        this.trainerFollowUpCompletedC = value;
    }

    /**
     * Gets the value of the trainer_Observations_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainer_Observations_Comments__C() {
        return trainerObservationsCommentsC;
    }

    /**
     * Sets the value of the trainer_Observations_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainer_Observations_Comments__C(String value) {
        this.trainerObservationsCommentsC = value;
    }

    /**
     * Gets the value of the trainer__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainer__C() {
        return trainerC;
    }

    /**
     * Sets the value of the trainer__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainer__C(String value) {
        this.trainerC = value;
    }

    /**
     * Gets the value of the training_Begins_On__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTraining_Begins_On__C() {
        return trainingBeginsOnC;
    }

    /**
     * Sets the value of the training_Begins_On__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTraining_Begins_On__C(XMLGregorianCalendar value) {
        this.trainingBeginsOnC = value;
    }

    /**
     * Gets the value of the training_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraining_Contact__C() {
        return trainingContactC;
    }

    /**
     * Sets the value of the training_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraining_Contact__C(String value) {
        this.trainingContactC = value;
    }

    /**
     * Gets the value of the training_Ends_On__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTraining_Ends_On__C() {
        return trainingEndsOnC;
    }

    /**
     * Sets the value of the training_Ends_On__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTraining_Ends_On__C(XMLGregorianCalendar value) {
        this.trainingEndsOnC = value;
    }

    /**
     * Gets the value of the training_Materials_Ordered__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTraining_Materials_Ordered__C() {
        return trainingMaterialsOrderedC;
    }

    /**
     * Sets the value of the training_Materials_Ordered__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTraining_Materials_Ordered__C(Boolean value) {
        this.trainingMaterialsOrderedC = value;
    }

    /**
     * Gets the value of the training_Times__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraining_Times__C() {
        return trainingTimesC;
    }

    /**
     * Sets the value of the training_Times__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraining_Times__C(String value) {
        this.trainingTimesC = value;
    }

    /**
     * Gets the value of the training_Location__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraining_Location__C() {
        return trainingLocationC;
    }

    /**
     * Sets the value of the training_Location__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraining_Location__C(String value) {
        this.trainingLocationC = value;
    }

    /**
     * Gets the value of the type_Of_Training__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType_Of_Training__C() {
        return typeOfTrainingC;
    }

    /**
     * Sets the value of the type_Of_Training__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType_Of_Training__C(String value) {
        this.typeOfTrainingC = value;
    }

    /**
     * Gets the value of the version_And_Delivery_Method__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion_And_Delivery_Method__C() {
        return versionAndDeliveryMethodC;
    }

    /**
     * Sets the value of the version_And_Delivery_Method__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion_And_Delivery_Method__C(String value) {
        this.versionAndDeliveryMethodC = value;
    }

    /**
     * Gets the value of the workstation_Password_Required__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkstation_Password_Required__C() {
        return workstationPasswordRequiredC;
    }

    /**
     * Sets the value of the workstation_Password_Required__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkstation_Password_Required__C(String value) {
        this.workstationPasswordRequiredC = value;
    }

}
