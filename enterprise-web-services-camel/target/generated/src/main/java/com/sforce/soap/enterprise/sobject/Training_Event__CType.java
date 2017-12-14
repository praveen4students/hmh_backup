
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Training_Event__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Training_Event__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="ActivityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Additional_Team_Member_s__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Login_Password__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assessments_Math__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assessments_Reading__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Attendee_Observations_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Automated_Data_Sync__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Core_Math_Curriculum_Basal__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Core_Reading_Curriculum_Basal__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County_Parish_Region__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Course_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Customer_Price_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Price_Recognized__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Customer_Price_Remaining__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Customer_Price__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Events" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Funding_Sources__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Grade_Levels_Targeted__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Home_Access_Available__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Implementation_Focus_Goal__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Implementation_Meeting_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Implementation_Meeting_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Initial_Contact_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Instructional_Model_Delivery_Time__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Intervention_Materials_Currently_In_Use__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LT_Asset__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LT_Asset__r" type="{urn:sobject.enterprise.soap.sforce.com}LT_Asset__c" minOccurs="0"/>
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Math_Block_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No_of_Days_for_this_Event__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="No_of_Particpants__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OIR_Sales_Rep__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OIR__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpenActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Other_URL_Login_Password__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PD_End_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PD_Locations__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PD_Start_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PM_Trainer__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PM_Trainer__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="Per_Diem_Contractor__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Per_Diem_Contractor__r" type="{urn:sobject.enterprise.soap.sforce.com}Per_Diem_Contractor__c" minOccurs="0"/>
 *         &lt;element name="Post_Implementation_Tasks__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pre_Implementation_Tasks__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Principal_Contact_Info__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Principal_Contact_Info__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Product_Bundled_With_Request__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Products_Engaged_During_Training__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reading_Literacy_Block_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="School_Level_Curriculum_Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="School_Level_Curriculum_Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="School_Level_PD_Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="School_Level_PD_Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="School_Level_Technology_Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="School_Level_Technology_Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="Shipping_Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site_URL__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State_Province__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Supplemental_Materials_Currently_In_Use__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Tasks_to_be_Performed_by_Trainer__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Technical_Obstacles__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Technical_Tasks_Completed__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trainer__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Training_Event_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Training_Event_Price__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Training_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Workstation_LAN_Login_Password__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Workstation_OS__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Zip__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Training_Event__c", propOrder = {
    "activityHistories",
    "additionalTeamMemberSC",
    "addressC",
    "adminLoginPasswordC",
    "assessmentsMathC",
    "assessmentsReadingC",
    "attachments",
    "attendeeObservationsCommentsC",
    "automatedDataSyncC",
    "cityC",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "coreMathCurriculumBasalC",
    "coreReadingCurriculumBasalC",
    "countryC",
    "countyParishRegionC",
    "courseNameC",
    "createdBy",
    "createdById",
    "createdDate",
    "customerPriceCommentsC",
    "customerPriceRecognizedC",
    "customerPriceRemainingC",
    "customerPriceC",
    "events",
    "feedSubscriptionsForEntity",
    "fundingSourcesC",
    "gradeLevelsTargetedC",
    "histories",
    "homeAccessAvailableC",
    "implementationFocusGoalC",
    "implementationMeetingDateC",
    "implementationMeetingTypeC",
    "initialContactDateC",
    "instructionalModelDeliveryTimeC",
    "interventionMaterialsCurrentlyInUseC",
    "isDeleted",
    "ltAssetC",
    "ltAssetR",
    "lastActivityDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "mathBlockDescriptionC",
    "name",
    "noOfDaysForThisEventC",
    "noOfParticpantsC",
    "notes",
    "notesAndAttachments",
    "notesC",
    "oirSalesRepC",
    "oirC",
    "openActivities",
    "otherURLLoginPasswordC",
    "pdEndDateC",
    "pdLocationsC",
    "pdStartDateC",
    "pmTrainerC",
    "pmTrainerR",
    "perDiemContractorC",
    "perDiemContractorR",
    "postImplementationTasksC",
    "preImplementationTasksC",
    "principalContactInfoC",
    "principalContactInfoR",
    "processInstances",
    "processSteps",
    "productBundledWithRequestC",
    "productsEngagedDuringTrainingC",
    "readingLiteracyBlockDescriptionC",
    "schoolLevelCurriculumContactC",
    "schoolLevelCurriculumContactR",
    "schoolLevelPDContactC",
    "schoolLevelPDContactR",
    "schoolLevelTechnologyContactC",
    "schoolLevelTechnologyContactR",
    "shippingNotesC",
    "siteNameC",
    "siteURLC",
    "stateProvinceC",
    "statusC",
    "supplementalMaterialsCurrentlyInUseC",
    "systemModstamp",
    "tasks",
    "tasksToBePerformedByTrainerC",
    "technicalObstaclesC",
    "technicalTasksCompletedC",
    "trainerC",
    "trainingEventDescriptionC",
    "trainingEventPriceC",
    "trainingTypeC",
    "workstationLANLoginPasswordC",
    "workstationOSC",
    "zipC"
})
public class Training_Event__CType
    extends SObjectType
{

    @XmlElement(name = "ActivityHistories", nillable = true)
    protected QueryResult activityHistories;
    @XmlElement(name = "Additional_Team_Member_s__c", nillable = true)
    protected String additionalTeamMemberSC;
    @XmlElement(name = "Address__c", nillable = true)
    protected String addressC;
    @XmlElement(name = "Admin_Login_Password__c", nillable = true)
    protected String adminLoginPasswordC;
    @XmlElement(name = "Assessments_Math__c", nillable = true)
    protected String assessmentsMathC;
    @XmlElement(name = "Assessments_Reading__c", nillable = true)
    protected String assessmentsReadingC;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "Attendee_Observations_Comments__c", nillable = true)
    protected String attendeeObservationsCommentsC;
    @XmlElement(name = "Automated_Data_Sync__c", nillable = true)
    protected String automatedDataSyncC;
    @XmlElement(name = "City__c", nillable = true)
    protected String cityC;
    @XmlElement(name = "ConnectionReceived", nillable = true)
    protected PartnerNetworkConnectionType connectionReceived;
    @XmlElement(name = "ConnectionReceivedId", nillable = true)
    protected String connectionReceivedId;
    @XmlElement(name = "ConnectionSent", nillable = true)
    protected PartnerNetworkConnectionType connectionSent;
    @XmlElement(name = "ConnectionSentId", nillable = true)
    protected String connectionSentId;
    @XmlElement(name = "Core_Math_Curriculum_Basal__c", nillable = true)
    protected String coreMathCurriculumBasalC;
    @XmlElement(name = "Core_Reading_Curriculum_Basal__c", nillable = true)
    protected String coreReadingCurriculumBasalC;
    @XmlElement(name = "Country__c", nillable = true)
    protected String countryC;
    @XmlElement(name = "County_Parish_Region__c", nillable = true)
    protected String countyParishRegionC;
    @XmlElement(name = "Course_Name__c", nillable = true)
    protected String courseNameC;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Customer_Price_Comments__c", nillable = true)
    protected String customerPriceCommentsC;
    @XmlElement(name = "Customer_Price_Recognized__c", nillable = true)
    protected Double customerPriceRecognizedC;
    @XmlElement(name = "Customer_Price_Remaining__c", nillable = true)
    protected Double customerPriceRemainingC;
    @XmlElement(name = "Customer_Price__c", nillable = true)
    protected Double customerPriceC;
    @XmlElement(name = "Events", nillable = true)
    protected QueryResult events;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "Funding_Sources__c", nillable = true)
    protected String fundingSourcesC;
    @XmlElement(name = "Grade_Levels_Targeted__c", nillable = true)
    protected String gradeLevelsTargetedC;
    @XmlElement(name = "Histories", nillable = true)
    protected QueryResult histories;
    @XmlElement(name = "Home_Access_Available__c", nillable = true)
    protected String homeAccessAvailableC;
    @XmlElement(name = "Implementation_Focus_Goal__c", nillable = true)
    protected String implementationFocusGoalC;
    @XmlElement(name = "Implementation_Meeting_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar implementationMeetingDateC;
    @XmlElement(name = "Implementation_Meeting_Type__c", nillable = true)
    protected String implementationMeetingTypeC;
    @XmlElement(name = "Initial_Contact_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar initialContactDateC;
    @XmlElement(name = "Instructional_Model_Delivery_Time__c", nillable = true)
    protected String instructionalModelDeliveryTimeC;
    @XmlElement(name = "Intervention_Materials_Currently_In_Use__c", nillable = true)
    protected String interventionMaterialsCurrentlyInUseC;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "LT_Asset__c", nillable = true)
    protected String ltAssetC;
    @XmlElement(name = "LT_Asset__r", nillable = true)
    protected LT_Asset__CType ltAssetR;
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
    @XmlElement(name = "Math_Block_Description__c", nillable = true)
    protected String mathBlockDescriptionC;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "No_of_Days_for_this_Event__c", nillable = true)
    protected Double noOfDaysForThisEventC;
    @XmlElement(name = "No_of_Particpants__c", nillable = true)
    protected String noOfParticpantsC;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "Notes__c", nillable = true)
    protected String notesC;
    @XmlElement(name = "OIR_Sales_Rep__c", nillable = true)
    protected String oirSalesRepC;
    @XmlElement(name = "OIR__c", nillable = true)
    protected String oirC;
    @XmlElement(name = "OpenActivities", nillable = true)
    protected QueryResult openActivities;
    @XmlElement(name = "Other_URL_Login_Password__c", nillable = true)
    protected String otherURLLoginPasswordC;
    @XmlElement(name = "PD_End_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pdEndDateC;
    @XmlElement(name = "PD_Locations__c", nillable = true)
    protected String pdLocationsC;
    @XmlElement(name = "PD_Start_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pdStartDateC;
    @XmlElement(name = "PM_Trainer__c", nillable = true)
    protected String pmTrainerC;
    @XmlElement(name = "PM_Trainer__r", nillable = true)
    protected UserType pmTrainerR;
    @XmlElement(name = "Per_Diem_Contractor__c", nillable = true)
    protected String perDiemContractorC;
    @XmlElement(name = "Per_Diem_Contractor__r", nillable = true)
    protected Per_Diem_Contractor__CType perDiemContractorR;
    @XmlElement(name = "Post_Implementation_Tasks__c", nillable = true)
    protected String postImplementationTasksC;
    @XmlElement(name = "Pre_Implementation_Tasks__c", nillable = true)
    protected String preImplementationTasksC;
    @XmlElement(name = "Principal_Contact_Info__c", nillable = true)
    protected String principalContactInfoC;
    @XmlElement(name = "Principal_Contact_Info__r", nillable = true)
    protected ContactType principalContactInfoR;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "Product_Bundled_With_Request__c", nillable = true)
    protected Boolean productBundledWithRequestC;
    @XmlElement(name = "Products_Engaged_During_Training__c", nillable = true)
    protected String productsEngagedDuringTrainingC;
    @XmlElement(name = "Reading_Literacy_Block_Description__c", nillable = true)
    protected String readingLiteracyBlockDescriptionC;
    @XmlElement(name = "School_Level_Curriculum_Contact__c", nillable = true)
    protected String schoolLevelCurriculumContactC;
    @XmlElement(name = "School_Level_Curriculum_Contact__r", nillable = true)
    protected ContactType schoolLevelCurriculumContactR;
    @XmlElement(name = "School_Level_PD_Contact__c", nillable = true)
    protected String schoolLevelPDContactC;
    @XmlElement(name = "School_Level_PD_Contact__r", nillable = true)
    protected ContactType schoolLevelPDContactR;
    @XmlElement(name = "School_Level_Technology_Contact__c", nillable = true)
    protected String schoolLevelTechnologyContactC;
    @XmlElement(name = "School_Level_Technology_Contact__r", nillable = true)
    protected ContactType schoolLevelTechnologyContactR;
    @XmlElement(name = "Shipping_Notes__c", nillable = true)
    protected String shippingNotesC;
    @XmlElement(name = "Site_Name__c", nillable = true)
    protected String siteNameC;
    @XmlElement(name = "Site_URL__c", nillable = true)
    protected String siteURLC;
    @XmlElement(name = "State_Province__c", nillable = true)
    protected String stateProvinceC;
    @XmlElement(name = "Status__c", nillable = true)
    protected String statusC;
    @XmlElement(name = "Supplemental_Materials_Currently_In_Use__c", nillable = true)
    protected String supplementalMaterialsCurrentlyInUseC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Tasks", nillable = true)
    protected QueryResult tasks;
    @XmlElement(name = "Tasks_to_be_Performed_by_Trainer__c", nillable = true)
    protected String tasksToBePerformedByTrainerC;
    @XmlElement(name = "Technical_Obstacles__c", nillable = true)
    protected String technicalObstaclesC;
    @XmlElement(name = "Technical_Tasks_Completed__c", nillable = true)
    protected String technicalTasksCompletedC;
    @XmlElement(name = "Trainer__c", nillable = true)
    protected String trainerC;
    @XmlElement(name = "Training_Event_Description__c", nillable = true)
    protected String trainingEventDescriptionC;
    @XmlElement(name = "Training_Event_Price__c", nillable = true)
    protected Double trainingEventPriceC;
    @XmlElement(name = "Training_Type__c", nillable = true)
    protected String trainingTypeC;
    @XmlElement(name = "Workstation_LAN_Login_Password__c", nillable = true)
    protected String workstationLANLoginPasswordC;
    @XmlElement(name = "Workstation_OS__c", nillable = true)
    protected String workstationOSC;
    @XmlElement(name = "Zip__c", nillable = true)
    protected String zipC;

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
     * Gets the value of the additional_Team_Member_S__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditional_Team_Member_S__C() {
        return additionalTeamMemberSC;
    }

    /**
     * Sets the value of the additional_Team_Member_S__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditional_Team_Member_S__C(String value) {
        this.additionalTeamMemberSC = value;
    }

    /**
     * Gets the value of the address__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress__C() {
        return addressC;
    }

    /**
     * Sets the value of the address__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress__C(String value) {
        this.addressC = value;
    }

    /**
     * Gets the value of the admin_Login_Password__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmin_Login_Password__C() {
        return adminLoginPasswordC;
    }

    /**
     * Sets the value of the admin_Login_Password__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmin_Login_Password__C(String value) {
        this.adminLoginPasswordC = value;
    }

    /**
     * Gets the value of the assessments_Math__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessments_Math__C() {
        return assessmentsMathC;
    }

    /**
     * Sets the value of the assessments_Math__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessments_Math__C(String value) {
        this.assessmentsMathC = value;
    }

    /**
     * Gets the value of the assessments_Reading__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessments_Reading__C() {
        return assessmentsReadingC;
    }

    /**
     * Sets the value of the assessments_Reading__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessments_Reading__C(String value) {
        this.assessmentsReadingC = value;
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
     * Gets the value of the automated_Data_Sync__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomated_Data_Sync__C() {
        return automatedDataSyncC;
    }

    /**
     * Sets the value of the automated_Data_Sync__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomated_Data_Sync__C(String value) {
        this.automatedDataSyncC = value;
    }

    /**
     * Gets the value of the city__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity__C() {
        return cityC;
    }

    /**
     * Sets the value of the city__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity__C(String value) {
        this.cityC = value;
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
     * Gets the value of the core_Math_Curriculum_Basal__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCore_Math_Curriculum_Basal__C() {
        return coreMathCurriculumBasalC;
    }

    /**
     * Sets the value of the core_Math_Curriculum_Basal__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCore_Math_Curriculum_Basal__C(String value) {
        this.coreMathCurriculumBasalC = value;
    }

    /**
     * Gets the value of the core_Reading_Curriculum_Basal__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCore_Reading_Curriculum_Basal__C() {
        return coreReadingCurriculumBasalC;
    }

    /**
     * Sets the value of the core_Reading_Curriculum_Basal__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCore_Reading_Curriculum_Basal__C(String value) {
        this.coreReadingCurriculumBasalC = value;
    }

    /**
     * Gets the value of the country__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry__C() {
        return countryC;
    }

    /**
     * Sets the value of the country__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry__C(String value) {
        this.countryC = value;
    }

    /**
     * Gets the value of the county_Parish_Region__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty_Parish_Region__C() {
        return countyParishRegionC;
    }

    /**
     * Sets the value of the county_Parish_Region__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty_Parish_Region__C(String value) {
        this.countyParishRegionC = value;
    }

    /**
     * Gets the value of the course_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourse_Name__C() {
        return courseNameC;
    }

    /**
     * Sets the value of the course_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourse_Name__C(String value) {
        this.courseNameC = value;
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
     * Gets the value of the customer_Price_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Price_Comments__C() {
        return customerPriceCommentsC;
    }

    /**
     * Sets the value of the customer_Price_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Price_Comments__C(String value) {
        this.customerPriceCommentsC = value;
    }

    /**
     * Gets the value of the customer_Price_Recognized__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomer_Price_Recognized__C() {
        return customerPriceRecognizedC;
    }

    /**
     * Sets the value of the customer_Price_Recognized__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomer_Price_Recognized__C(Double value) {
        this.customerPriceRecognizedC = value;
    }

    /**
     * Gets the value of the customer_Price_Remaining__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomer_Price_Remaining__C() {
        return customerPriceRemainingC;
    }

    /**
     * Sets the value of the customer_Price_Remaining__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomer_Price_Remaining__C(Double value) {
        this.customerPriceRemainingC = value;
    }

    /**
     * Gets the value of the customer_Price__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustomer_Price__C() {
        return customerPriceC;
    }

    /**
     * Sets the value of the customer_Price__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustomer_Price__C(Double value) {
        this.customerPriceC = value;
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
     * Gets the value of the funding_Sources__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunding_Sources__C() {
        return fundingSourcesC;
    }

    /**
     * Sets the value of the funding_Sources__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunding_Sources__C(String value) {
        this.fundingSourcesC = value;
    }

    /**
     * Gets the value of the grade_Levels_Targeted__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade_Levels_Targeted__C() {
        return gradeLevelsTargetedC;
    }

    /**
     * Sets the value of the grade_Levels_Targeted__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade_Levels_Targeted__C(String value) {
        this.gradeLevelsTargetedC = value;
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
     * Gets the value of the home_Access_Available__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHome_Access_Available__C() {
        return homeAccessAvailableC;
    }

    /**
     * Sets the value of the home_Access_Available__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHome_Access_Available__C(String value) {
        this.homeAccessAvailableC = value;
    }

    /**
     * Gets the value of the implementation_Focus_Goal__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementation_Focus_Goal__C() {
        return implementationFocusGoalC;
    }

    /**
     * Sets the value of the implementation_Focus_Goal__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementation_Focus_Goal__C(String value) {
        this.implementationFocusGoalC = value;
    }

    /**
     * Gets the value of the implementation_Meeting_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getImplementation_Meeting_Date__C() {
        return implementationMeetingDateC;
    }

    /**
     * Sets the value of the implementation_Meeting_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setImplementation_Meeting_Date__C(XMLGregorianCalendar value) {
        this.implementationMeetingDateC = value;
    }

    /**
     * Gets the value of the implementation_Meeting_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementation_Meeting_Type__C() {
        return implementationMeetingTypeC;
    }

    /**
     * Sets the value of the implementation_Meeting_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementation_Meeting_Type__C(String value) {
        this.implementationMeetingTypeC = value;
    }

    /**
     * Gets the value of the initial_Contact_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitial_Contact_Date__C() {
        return initialContactDateC;
    }

    /**
     * Sets the value of the initial_Contact_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitial_Contact_Date__C(XMLGregorianCalendar value) {
        this.initialContactDateC = value;
    }

    /**
     * Gets the value of the instructional_Model_Delivery_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructional_Model_Delivery_Time__C() {
        return instructionalModelDeliveryTimeC;
    }

    /**
     * Sets the value of the instructional_Model_Delivery_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructional_Model_Delivery_Time__C(String value) {
        this.instructionalModelDeliveryTimeC = value;
    }

    /**
     * Gets the value of the intervention_Materials_Currently_In_Use__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntervention_Materials_Currently_In_Use__C() {
        return interventionMaterialsCurrentlyInUseC;
    }

    /**
     * Sets the value of the intervention_Materials_Currently_In_Use__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntervention_Materials_Currently_In_Use__C(String value) {
        this.interventionMaterialsCurrentlyInUseC = value;
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
     * Gets the value of the lt_Asset__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLT_Asset__C() {
        return ltAssetC;
    }

    /**
     * Sets the value of the lt_Asset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLT_Asset__C(String value) {
        this.ltAssetC = value;
    }

    /**
     * Gets the value of the lt_Asset__R property.
     * 
     * @return
     *     possible object is
     *     {@link LT_Asset__CType }
     *     
     */
    public LT_Asset__CType getLT_Asset__R() {
        return ltAssetR;
    }

    /**
     * Sets the value of the lt_Asset__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link LT_Asset__CType }
     *     
     */
    public void setLT_Asset__R(LT_Asset__CType value) {
        this.ltAssetR = value;
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
     * Gets the value of the math_Block_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMath_Block_Description__C() {
        return mathBlockDescriptionC;
    }

    /**
     * Sets the value of the math_Block_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMath_Block_Description__C(String value) {
        this.mathBlockDescriptionC = value;
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
     * Gets the value of the no_Of_Days_For_This_Event__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNo_Of_Days_For_This_Event__C() {
        return noOfDaysForThisEventC;
    }

    /**
     * Sets the value of the no_Of_Days_For_This_Event__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNo_Of_Days_For_This_Event__C(Double value) {
        this.noOfDaysForThisEventC = value;
    }

    /**
     * Gets the value of the no_Of_Particpants__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNo_Of_Particpants__C() {
        return noOfParticpantsC;
    }

    /**
     * Sets the value of the no_Of_Particpants__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNo_Of_Particpants__C(String value) {
        this.noOfParticpantsC = value;
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
     * Gets the value of the notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes__C() {
        return notesC;
    }

    /**
     * Sets the value of the notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes__C(String value) {
        this.notesC = value;
    }

    /**
     * Gets the value of the oir_Sales_Rep__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOIR_Sales_Rep__C() {
        return oirSalesRepC;
    }

    /**
     * Sets the value of the oir_Sales_Rep__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOIR_Sales_Rep__C(String value) {
        this.oirSalesRepC = value;
    }

    /**
     * Gets the value of the oir__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOIR__C() {
        return oirC;
    }

    /**
     * Sets the value of the oir__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOIR__C(String value) {
        this.oirC = value;
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
     * Gets the value of the other_URL_Login_Password__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther_URL_Login_Password__C() {
        return otherURLLoginPasswordC;
    }

    /**
     * Sets the value of the other_URL_Login_Password__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther_URL_Login_Password__C(String value) {
        this.otherURLLoginPasswordC = value;
    }

    /**
     * Gets the value of the pd_End_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPD_End_Date__C() {
        return pdEndDateC;
    }

    /**
     * Sets the value of the pd_End_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPD_End_Date__C(XMLGregorianCalendar value) {
        this.pdEndDateC = value;
    }

    /**
     * Gets the value of the pd_Locations__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD_Locations__C() {
        return pdLocationsC;
    }

    /**
     * Sets the value of the pd_Locations__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD_Locations__C(String value) {
        this.pdLocationsC = value;
    }

    /**
     * Gets the value of the pd_Start_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPD_Start_Date__C() {
        return pdStartDateC;
    }

    /**
     * Sets the value of the pd_Start_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPD_Start_Date__C(XMLGregorianCalendar value) {
        this.pdStartDateC = value;
    }

    /**
     * Gets the value of the pm_Trainer__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPM_Trainer__C() {
        return pmTrainerC;
    }

    /**
     * Sets the value of the pm_Trainer__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPM_Trainer__C(String value) {
        this.pmTrainerC = value;
    }

    /**
     * Gets the value of the pm_Trainer__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getPM_Trainer__R() {
        return pmTrainerR;
    }

    /**
     * Sets the value of the pm_Trainer__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setPM_Trainer__R(UserType value) {
        this.pmTrainerR = value;
    }

    /**
     * Gets the value of the per_Diem_Contractor__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPer_Diem_Contractor__C() {
        return perDiemContractorC;
    }

    /**
     * Sets the value of the per_Diem_Contractor__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPer_Diem_Contractor__C(String value) {
        this.perDiemContractorC = value;
    }

    /**
     * Gets the value of the per_Diem_Contractor__R property.
     * 
     * @return
     *     possible object is
     *     {@link Per_Diem_Contractor__CType }
     *     
     */
    public Per_Diem_Contractor__CType getPer_Diem_Contractor__R() {
        return perDiemContractorR;
    }

    /**
     * Sets the value of the per_Diem_Contractor__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Per_Diem_Contractor__CType }
     *     
     */
    public void setPer_Diem_Contractor__R(Per_Diem_Contractor__CType value) {
        this.perDiemContractorR = value;
    }

    /**
     * Gets the value of the post_Implementation_Tasks__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPost_Implementation_Tasks__C() {
        return postImplementationTasksC;
    }

    /**
     * Sets the value of the post_Implementation_Tasks__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPost_Implementation_Tasks__C(String value) {
        this.postImplementationTasksC = value;
    }

    /**
     * Gets the value of the pre_Implementation_Tasks__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPre_Implementation_Tasks__C() {
        return preImplementationTasksC;
    }

    /**
     * Sets the value of the pre_Implementation_Tasks__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPre_Implementation_Tasks__C(String value) {
        this.preImplementationTasksC = value;
    }

    /**
     * Gets the value of the principal_Contact_Info__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipal_Contact_Info__C() {
        return principalContactInfoC;
    }

    /**
     * Sets the value of the principal_Contact_Info__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipal_Contact_Info__C(String value) {
        this.principalContactInfoC = value;
    }

    /**
     * Gets the value of the principal_Contact_Info__R property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getPrincipal_Contact_Info__R() {
        return principalContactInfoR;
    }

    /**
     * Sets the value of the principal_Contact_Info__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setPrincipal_Contact_Info__R(ContactType value) {
        this.principalContactInfoR = value;
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
     * Gets the value of the product_Bundled_With_Request__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProduct_Bundled_With_Request__C() {
        return productBundledWithRequestC;
    }

    /**
     * Sets the value of the product_Bundled_With_Request__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProduct_Bundled_With_Request__C(Boolean value) {
        this.productBundledWithRequestC = value;
    }

    /**
     * Gets the value of the products_Engaged_During_Training__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducts_Engaged_During_Training__C() {
        return productsEngagedDuringTrainingC;
    }

    /**
     * Sets the value of the products_Engaged_During_Training__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducts_Engaged_During_Training__C(String value) {
        this.productsEngagedDuringTrainingC = value;
    }

    /**
     * Gets the value of the reading_Literacy_Block_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReading_Literacy_Block_Description__C() {
        return readingLiteracyBlockDescriptionC;
    }

    /**
     * Sets the value of the reading_Literacy_Block_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReading_Literacy_Block_Description__C(String value) {
        this.readingLiteracyBlockDescriptionC = value;
    }

    /**
     * Gets the value of the school_Level_Curriculum_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchool_Level_Curriculum_Contact__C() {
        return schoolLevelCurriculumContactC;
    }

    /**
     * Sets the value of the school_Level_Curriculum_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchool_Level_Curriculum_Contact__C(String value) {
        this.schoolLevelCurriculumContactC = value;
    }

    /**
     * Gets the value of the school_Level_Curriculum_Contact__R property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getSchool_Level_Curriculum_Contact__R() {
        return schoolLevelCurriculumContactR;
    }

    /**
     * Sets the value of the school_Level_Curriculum_Contact__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setSchool_Level_Curriculum_Contact__R(ContactType value) {
        this.schoolLevelCurriculumContactR = value;
    }

    /**
     * Gets the value of the school_Level_PD_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchool_Level_PD_Contact__C() {
        return schoolLevelPDContactC;
    }

    /**
     * Sets the value of the school_Level_PD_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchool_Level_PD_Contact__C(String value) {
        this.schoolLevelPDContactC = value;
    }

    /**
     * Gets the value of the school_Level_PD_Contact__R property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getSchool_Level_PD_Contact__R() {
        return schoolLevelPDContactR;
    }

    /**
     * Sets the value of the school_Level_PD_Contact__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setSchool_Level_PD_Contact__R(ContactType value) {
        this.schoolLevelPDContactR = value;
    }

    /**
     * Gets the value of the school_Level_Technology_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchool_Level_Technology_Contact__C() {
        return schoolLevelTechnologyContactC;
    }

    /**
     * Sets the value of the school_Level_Technology_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchool_Level_Technology_Contact__C(String value) {
        this.schoolLevelTechnologyContactC = value;
    }

    /**
     * Gets the value of the school_Level_Technology_Contact__R property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getSchool_Level_Technology_Contact__R() {
        return schoolLevelTechnologyContactR;
    }

    /**
     * Sets the value of the school_Level_Technology_Contact__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setSchool_Level_Technology_Contact__R(ContactType value) {
        this.schoolLevelTechnologyContactR = value;
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
     * Gets the value of the site_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite_Name__C() {
        return siteNameC;
    }

    /**
     * Sets the value of the site_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite_Name__C(String value) {
        this.siteNameC = value;
    }

    /**
     * Gets the value of the site_URL__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite_URL__C() {
        return siteURLC;
    }

    /**
     * Sets the value of the site_URL__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite_URL__C(String value) {
        this.siteURLC = value;
    }

    /**
     * Gets the value of the state_Province__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState_Province__C() {
        return stateProvinceC;
    }

    /**
     * Sets the value of the state_Province__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState_Province__C(String value) {
        this.stateProvinceC = value;
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
     * Gets the value of the supplemental_Materials_Currently_In_Use__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplemental_Materials_Currently_In_Use__C() {
        return supplementalMaterialsCurrentlyInUseC;
    }

    /**
     * Sets the value of the supplemental_Materials_Currently_In_Use__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplemental_Materials_Currently_In_Use__C(String value) {
        this.supplementalMaterialsCurrentlyInUseC = value;
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
     * Gets the value of the tasks_To_Be_Performed_By_Trainer__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTasks_To_Be_Performed_By_Trainer__C() {
        return tasksToBePerformedByTrainerC;
    }

    /**
     * Sets the value of the tasks_To_Be_Performed_By_Trainer__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTasks_To_Be_Performed_By_Trainer__C(String value) {
        this.tasksToBePerformedByTrainerC = value;
    }

    /**
     * Gets the value of the technical_Obstacles__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnical_Obstacles__C() {
        return technicalObstaclesC;
    }

    /**
     * Sets the value of the technical_Obstacles__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnical_Obstacles__C(String value) {
        this.technicalObstaclesC = value;
    }

    /**
     * Gets the value of the technical_Tasks_Completed__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnical_Tasks_Completed__C() {
        return technicalTasksCompletedC;
    }

    /**
     * Sets the value of the technical_Tasks_Completed__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnical_Tasks_Completed__C(String value) {
        this.technicalTasksCompletedC = value;
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
     * Gets the value of the training_Event_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraining_Event_Description__C() {
        return trainingEventDescriptionC;
    }

    /**
     * Sets the value of the training_Event_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraining_Event_Description__C(String value) {
        this.trainingEventDescriptionC = value;
    }

    /**
     * Gets the value of the training_Event_Price__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTraining_Event_Price__C() {
        return trainingEventPriceC;
    }

    /**
     * Sets the value of the training_Event_Price__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTraining_Event_Price__C(Double value) {
        this.trainingEventPriceC = value;
    }

    /**
     * Gets the value of the training_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraining_Type__C() {
        return trainingTypeC;
    }

    /**
     * Sets the value of the training_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraining_Type__C(String value) {
        this.trainingTypeC = value;
    }

    /**
     * Gets the value of the workstation_LAN_Login_Password__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkstation_LAN_Login_Password__C() {
        return workstationLANLoginPasswordC;
    }

    /**
     * Sets the value of the workstation_LAN_Login_Password__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkstation_LAN_Login_Password__C(String value) {
        this.workstationLANLoginPasswordC = value;
    }

    /**
     * Gets the value of the workstation_OS__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkstation_OS__C() {
        return workstationOSC;
    }

    /**
     * Sets the value of the workstation_OS__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkstation_OS__C(String value) {
        this.workstationOSC = value;
    }

    /**
     * Gets the value of the zip__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip__C() {
        return zipC;
    }

    /**
     * Sets the value of the zip__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip__C(String value) {
        this.zipC = value;
    }

}
