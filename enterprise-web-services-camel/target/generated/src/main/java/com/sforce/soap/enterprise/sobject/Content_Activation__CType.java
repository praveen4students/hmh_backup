
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Content_Activation__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Content_Activation__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Activation_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Assigned_To__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Assigned_To__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Authorizing_Contact_Name__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Authorizing_Contact_Name__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Content_Material_Descriptions__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="District_Contact_Name__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="District_Contact_Name__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="District_Name__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="District_Name__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="Due_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Events" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Examview_Title10__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Examview_Title1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Examview_Title2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Examview_Title3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Examview_Title4__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Examview_Title5__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Examview_Title6__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Examview_Title7__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Examview_Title8__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Examview_Title9__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Make_Public_or_Private__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name_Location_of_Material_to_be_Copied__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="New_State_s_Standards__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpenActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opportunity_Name__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Opportunity_Name__r" type="{urn:sobject.enterprise.soap.sforce.com}Opportunity" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Permission_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Product10__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product10__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Product11__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product11__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Product12__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product12__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Product13__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product13__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Product14__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product14__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Product15__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product15__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Product16__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product16__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Product17__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product17__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Product18__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product18__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Product1__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product1__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Product2__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product2__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Product3__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product3__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Product4__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product4__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Product5__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product5__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Product6__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product6__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Product7__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product7__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Product8__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product8__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Product9__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product9__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Project_Details__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Provider__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recipient_District_Name__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Recipient_District_Name__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="RecordType" type="{urn:sobject.enterprise.soap.sforce.com}RecordType" minOccurs="0"/>
 *         &lt;element name="RecordTypeId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Requestor__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Source_District_Name__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Source_District_Name__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="Standard_Arts__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Standard_Business__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Standard_Computers_Technology__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Standard_English_Language_Arts_Core__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Standard_English_Language_Arts_Elective__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Standard_Foreign_Languages__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Standard_Mathematics_Core__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Standard_Mathematics_Electives__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Standard_Other__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Standard_Physical_Education__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Standard_Science_Core__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Standard_Science_Electivies__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Standard_Set_Detail__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Standard_Set__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Standard_Social_Studies_Core__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Standard_Social_Studies_Elective__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="State_Loaded__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State_Standards_Updated__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Textbook_Information__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Users_Names_limit10__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Content_Activation__c", propOrder = {
    "activationTypeC",
    "activityHistories",
    "assignedToC",
    "assignedToR",
    "attachments",
    "authorizingContactNameC",
    "authorizingContactNameR",
    "commentsC",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "contentMaterialDescriptionsC",
    "createdBy",
    "createdById",
    "createdDate",
    "districtContactNameC",
    "districtContactNameR",
    "districtNameC",
    "districtNameR",
    "dueDateC",
    "events",
    "examviewTitle10C",
    "examviewTitle1C",
    "examviewTitle2C",
    "examviewTitle3C",
    "examviewTitle4C",
    "examviewTitle5C",
    "examviewTitle6C",
    "examviewTitle7C",
    "examviewTitle8C",
    "examviewTitle9C",
    "feedSubscriptionsForEntity",
    "isDeleted",
    "lastActivityDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "makePublicOrPrivateC",
    "name",
    "nameLocationOfMaterialToBeCopiedC",
    "newStateSStandardsC",
    "notes",
    "notesAndAttachments",
    "openActivities",
    "opportunityNameC",
    "opportunityNameR",
    "owner",
    "ownerId",
    "permissionTypeC",
    "priorityC",
    "processInstances",
    "processSteps",
    "product10C",
    "product10R",
    "product11C",
    "product11R",
    "product12C",
    "product12R",
    "product13C",
    "product13R",
    "product14C",
    "product14R",
    "product15C",
    "product15R",
    "product16C",
    "product16R",
    "product17C",
    "product17R",
    "product18C",
    "product18R",
    "product1C",
    "product1R",
    "product2C",
    "product2R",
    "product3C",
    "product3R",
    "product4C",
    "product4R",
    "product5C",
    "product5R",
    "product6C",
    "product6R",
    "product7C",
    "product7R",
    "product8C",
    "product8R",
    "product9C",
    "product9R",
    "projectDetailsC",
    "providerC",
    "recipientDistrictNameC",
    "recipientDistrictNameR",
    "recordType",
    "recordTypeId",
    "requestorC",
    "sourceDistrictNameC",
    "sourceDistrictNameR",
    "standardArtsC",
    "standardBusinessC",
    "standardComputersTechnologyC",
    "standardEnglishLanguageArtsCoreC",
    "standardEnglishLanguageArtsElectiveC",
    "standardForeignLanguagesC",
    "standardMathematicsCoreC",
    "standardMathematicsElectivesC",
    "standardOtherC",
    "standardPhysicalEducationC",
    "standardScienceCoreC",
    "standardScienceElectiviesC",
    "standardSetDetailC",
    "standardSetC",
    "standardSocialStudiesCoreC",
    "standardSocialStudiesElectiveC",
    "stateLoadedC",
    "stateStandardsUpdatedC",
    "statusC",
    "subjectC",
    "systemModstamp",
    "tasks",
    "textbookInformationC",
    "userTypeC",
    "usersNamesLimit10C",
    "emailC"
})
public class Content_Activation__CType
    extends SObjectType
{

    @XmlElement(name = "Activation_Type__c", nillable = true)
    protected String activationTypeC;
    @XmlElement(name = "ActivityHistories", nillable = true)
    protected QueryResult activityHistories;
    @XmlElement(name = "Assigned_To__c", nillable = true)
    protected String assignedToC;
    @XmlElement(name = "Assigned_To__r", nillable = true)
    protected UserType assignedToR;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "Authorizing_Contact_Name__c", nillable = true)
    protected String authorizingContactNameC;
    @XmlElement(name = "Authorizing_Contact_Name__r", nillable = true)
    protected ContactType authorizingContactNameR;
    @XmlElement(name = "Comments__c", nillable = true)
    protected String commentsC;
    @XmlElement(name = "ConnectionReceived", nillable = true)
    protected PartnerNetworkConnectionType connectionReceived;
    @XmlElement(name = "ConnectionReceivedId", nillable = true)
    protected String connectionReceivedId;
    @XmlElement(name = "ConnectionSent", nillable = true)
    protected PartnerNetworkConnectionType connectionSent;
    @XmlElement(name = "ConnectionSentId", nillable = true)
    protected String connectionSentId;
    @XmlElement(name = "Content_Material_Descriptions__c", nillable = true)
    protected String contentMaterialDescriptionsC;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "District_Contact_Name__c", nillable = true)
    protected String districtContactNameC;
    @XmlElement(name = "District_Contact_Name__r", nillable = true)
    protected ContactType districtContactNameR;
    @XmlElement(name = "District_Name__c", nillable = true)
    protected String districtNameC;
    @XmlElement(name = "District_Name__r", nillable = true)
    protected AccountType districtNameR;
    @XmlElement(name = "Due_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDateC;
    @XmlElement(name = "Events", nillable = true)
    protected QueryResult events;
    @XmlElement(name = "Examview_Title10__c", nillable = true)
    protected String examviewTitle10C;
    @XmlElement(name = "Examview_Title1__c", nillable = true)
    protected String examviewTitle1C;
    @XmlElement(name = "Examview_Title2__c", nillable = true)
    protected String examviewTitle2C;
    @XmlElement(name = "Examview_Title3__c", nillable = true)
    protected String examviewTitle3C;
    @XmlElement(name = "Examview_Title4__c", nillable = true)
    protected String examviewTitle4C;
    @XmlElement(name = "Examview_Title5__c", nillable = true)
    protected String examviewTitle5C;
    @XmlElement(name = "Examview_Title6__c", nillable = true)
    protected String examviewTitle6C;
    @XmlElement(name = "Examview_Title7__c", nillable = true)
    protected String examviewTitle7C;
    @XmlElement(name = "Examview_Title8__c", nillable = true)
    protected String examviewTitle8C;
    @XmlElement(name = "Examview_Title9__c", nillable = true)
    protected String examviewTitle9C;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
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
    @XmlElement(name = "Make_Public_or_Private__c", nillable = true)
    protected String makePublicOrPrivateC;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Name_Location_of_Material_to_be_Copied__c", nillable = true)
    protected String nameLocationOfMaterialToBeCopiedC;
    @XmlElement(name = "New_State_s_Standards__c", nillable = true)
    protected Boolean newStateSStandardsC;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "OpenActivities", nillable = true)
    protected QueryResult openActivities;
    @XmlElement(name = "Opportunity_Name__c", nillable = true)
    protected String opportunityNameC;
    @XmlElement(name = "Opportunity_Name__r", nillable = true)
    protected OpportunityType opportunityNameR;
    @XmlElement(name = "Owner", nillable = true)
    protected NameType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "Permission_Type__c", nillable = true)
    protected String permissionTypeC;
    @XmlElement(name = "Priority__c", nillable = true)
    protected String priorityC;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "Product10__c", nillable = true)
    protected String product10C;
    @XmlElement(name = "Product10__r", nillable = true)
    protected Product2Type product10R;
    @XmlElement(name = "Product11__c", nillable = true)
    protected String product11C;
    @XmlElement(name = "Product11__r", nillable = true)
    protected Product2Type product11R;
    @XmlElement(name = "Product12__c", nillable = true)
    protected String product12C;
    @XmlElement(name = "Product12__r", nillable = true)
    protected Product2Type product12R;
    @XmlElement(name = "Product13__c", nillable = true)
    protected String product13C;
    @XmlElement(name = "Product13__r", nillable = true)
    protected Product2Type product13R;
    @XmlElement(name = "Product14__c", nillable = true)
    protected String product14C;
    @XmlElement(name = "Product14__r", nillable = true)
    protected Product2Type product14R;
    @XmlElement(name = "Product15__c", nillable = true)
    protected String product15C;
    @XmlElement(name = "Product15__r", nillable = true)
    protected Product2Type product15R;
    @XmlElement(name = "Product16__c", nillable = true)
    protected String product16C;
    @XmlElement(name = "Product16__r", nillable = true)
    protected Product2Type product16R;
    @XmlElement(name = "Product17__c", nillable = true)
    protected String product17C;
    @XmlElement(name = "Product17__r", nillable = true)
    protected Product2Type product17R;
    @XmlElement(name = "Product18__c", nillable = true)
    protected String product18C;
    @XmlElement(name = "Product18__r", nillable = true)
    protected Product2Type product18R;
    @XmlElement(name = "Product1__c", nillable = true)
    protected String product1C;
    @XmlElement(name = "Product1__r", nillable = true)
    protected Product2Type product1R;
    @XmlElement(name = "Product2__c", nillable = true)
    protected String product2C;
    @XmlElement(name = "Product2__r", nillable = true)
    protected Product2Type product2R;
    @XmlElement(name = "Product3__c", nillable = true)
    protected String product3C;
    @XmlElement(name = "Product3__r", nillable = true)
    protected Product2Type product3R;
    @XmlElement(name = "Product4__c", nillable = true)
    protected String product4C;
    @XmlElement(name = "Product4__r", nillable = true)
    protected Product2Type product4R;
    @XmlElement(name = "Product5__c", nillable = true)
    protected String product5C;
    @XmlElement(name = "Product5__r", nillable = true)
    protected Product2Type product5R;
    @XmlElement(name = "Product6__c", nillable = true)
    protected String product6C;
    @XmlElement(name = "Product6__r", nillable = true)
    protected Product2Type product6R;
    @XmlElement(name = "Product7__c", nillable = true)
    protected String product7C;
    @XmlElement(name = "Product7__r", nillable = true)
    protected Product2Type product7R;
    @XmlElement(name = "Product8__c", nillable = true)
    protected String product8C;
    @XmlElement(name = "Product8__r", nillable = true)
    protected Product2Type product8R;
    @XmlElement(name = "Product9__c", nillable = true)
    protected String product9C;
    @XmlElement(name = "Product9__r", nillable = true)
    protected Product2Type product9R;
    @XmlElement(name = "Project_Details__c", nillable = true)
    protected String projectDetailsC;
    @XmlElement(name = "Provider__c", nillable = true)
    protected String providerC;
    @XmlElement(name = "Recipient_District_Name__c", nillable = true)
    protected String recipientDistrictNameC;
    @XmlElement(name = "Recipient_District_Name__r", nillable = true)
    protected AccountType recipientDistrictNameR;
    @XmlElement(name = "RecordType", nillable = true)
    protected RecordTypeType recordType;
    @XmlElement(name = "RecordTypeId", nillable = true)
    protected String recordTypeId;
    @XmlElement(name = "Requestor__c", nillable = true)
    protected String requestorC;
    @XmlElement(name = "Source_District_Name__c", nillable = true)
    protected String sourceDistrictNameC;
    @XmlElement(name = "Source_District_Name__r", nillable = true)
    protected AccountType sourceDistrictNameR;
    @XmlElement(name = "Standard_Arts__c", nillable = true)
    protected Boolean standardArtsC;
    @XmlElement(name = "Standard_Business__c", nillable = true)
    protected Boolean standardBusinessC;
    @XmlElement(name = "Standard_Computers_Technology__c", nillable = true)
    protected Boolean standardComputersTechnologyC;
    @XmlElement(name = "Standard_English_Language_Arts_Core__c", nillable = true)
    protected Boolean standardEnglishLanguageArtsCoreC;
    @XmlElement(name = "Standard_English_Language_Arts_Elective__c", nillable = true)
    protected Boolean standardEnglishLanguageArtsElectiveC;
    @XmlElement(name = "Standard_Foreign_Languages__c", nillable = true)
    protected Boolean standardForeignLanguagesC;
    @XmlElement(name = "Standard_Mathematics_Core__c", nillable = true)
    protected Boolean standardMathematicsCoreC;
    @XmlElement(name = "Standard_Mathematics_Electives__c", nillable = true)
    protected Boolean standardMathematicsElectivesC;
    @XmlElement(name = "Standard_Other__c", nillable = true)
    protected Boolean standardOtherC;
    @XmlElement(name = "Standard_Physical_Education__c", nillable = true)
    protected Boolean standardPhysicalEducationC;
    @XmlElement(name = "Standard_Science_Core__c", nillable = true)
    protected Boolean standardScienceCoreC;
    @XmlElement(name = "Standard_Science_Electivies__c", nillable = true)
    protected Boolean standardScienceElectiviesC;
    @XmlElement(name = "Standard_Set_Detail__c", nillable = true)
    protected String standardSetDetailC;
    @XmlElement(name = "Standard_Set__c", nillable = true)
    protected String standardSetC;
    @XmlElement(name = "Standard_Social_Studies_Core__c", nillable = true)
    protected Boolean standardSocialStudiesCoreC;
    @XmlElement(name = "Standard_Social_Studies_Elective__c", nillable = true)
    protected Boolean standardSocialStudiesElectiveC;
    @XmlElement(name = "State_Loaded__c", nillable = true)
    protected String stateLoadedC;
    @XmlElement(name = "State_Standards_Updated__c", nillable = true)
    protected Boolean stateStandardsUpdatedC;
    @XmlElement(name = "Status__c", nillable = true)
    protected String statusC;
    @XmlElement(name = "Subject__c", nillable = true)
    protected String subjectC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Tasks", nillable = true)
    protected QueryResult tasks;
    @XmlElement(name = "Textbook_Information__c", nillable = true)
    protected String textbookInformationC;
    @XmlElement(name = "User_Type__c", nillable = true)
    protected String userTypeC;
    @XmlElement(name = "Users_Names_limit10__c", nillable = true)
    protected String usersNamesLimit10C;
    @XmlElement(name = "email__c", nillable = true)
    protected String emailC;

    /**
     * Gets the value of the activation_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivation_Type__C() {
        return activationTypeC;
    }

    /**
     * Sets the value of the activation_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivation_Type__C(String value) {
        this.activationTypeC = value;
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
     * Gets the value of the assigned_To__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getAssigned_To__R() {
        return assignedToR;
    }

    /**
     * Sets the value of the assigned_To__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setAssigned_To__R(UserType value) {
        this.assignedToR = value;
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
     * Gets the value of the authorizing_Contact_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizing_Contact_Name__C() {
        return authorizingContactNameC;
    }

    /**
     * Sets the value of the authorizing_Contact_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizing_Contact_Name__C(String value) {
        this.authorizingContactNameC = value;
    }

    /**
     * Gets the value of the authorizing_Contact_Name__R property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getAuthorizing_Contact_Name__R() {
        return authorizingContactNameR;
    }

    /**
     * Sets the value of the authorizing_Contact_Name__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setAuthorizing_Contact_Name__R(ContactType value) {
        this.authorizingContactNameR = value;
    }

    /**
     * Gets the value of the comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments__C() {
        return commentsC;
    }

    /**
     * Sets the value of the comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments__C(String value) {
        this.commentsC = value;
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
     * Gets the value of the content_Material_Descriptions__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent_Material_Descriptions__C() {
        return contentMaterialDescriptionsC;
    }

    /**
     * Sets the value of the content_Material_Descriptions__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent_Material_Descriptions__C(String value) {
        this.contentMaterialDescriptionsC = value;
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
     * Gets the value of the district_Contact_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict_Contact_Name__C() {
        return districtContactNameC;
    }

    /**
     * Sets the value of the district_Contact_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict_Contact_Name__C(String value) {
        this.districtContactNameC = value;
    }

    /**
     * Gets the value of the district_Contact_Name__R property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getDistrict_Contact_Name__R() {
        return districtContactNameR;
    }

    /**
     * Sets the value of the district_Contact_Name__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setDistrict_Contact_Name__R(ContactType value) {
        this.districtContactNameR = value;
    }

    /**
     * Gets the value of the district_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict_Name__C() {
        return districtNameC;
    }

    /**
     * Sets the value of the district_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict_Name__C(String value) {
        this.districtNameC = value;
    }

    /**
     * Gets the value of the district_Name__R property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getDistrict_Name__R() {
        return districtNameR;
    }

    /**
     * Sets the value of the district_Name__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setDistrict_Name__R(AccountType value) {
        this.districtNameR = value;
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
     * Gets the value of the examview_Title10__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamview_Title10__C() {
        return examviewTitle10C;
    }

    /**
     * Sets the value of the examview_Title10__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamview_Title10__C(String value) {
        this.examviewTitle10C = value;
    }

    /**
     * Gets the value of the examview_Title1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamview_Title1__C() {
        return examviewTitle1C;
    }

    /**
     * Sets the value of the examview_Title1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamview_Title1__C(String value) {
        this.examviewTitle1C = value;
    }

    /**
     * Gets the value of the examview_Title2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamview_Title2__C() {
        return examviewTitle2C;
    }

    /**
     * Sets the value of the examview_Title2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamview_Title2__C(String value) {
        this.examviewTitle2C = value;
    }

    /**
     * Gets the value of the examview_Title3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamview_Title3__C() {
        return examviewTitle3C;
    }

    /**
     * Sets the value of the examview_Title3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamview_Title3__C(String value) {
        this.examviewTitle3C = value;
    }

    /**
     * Gets the value of the examview_Title4__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamview_Title4__C() {
        return examviewTitle4C;
    }

    /**
     * Sets the value of the examview_Title4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamview_Title4__C(String value) {
        this.examviewTitle4C = value;
    }

    /**
     * Gets the value of the examview_Title5__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamview_Title5__C() {
        return examviewTitle5C;
    }

    /**
     * Sets the value of the examview_Title5__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamview_Title5__C(String value) {
        this.examviewTitle5C = value;
    }

    /**
     * Gets the value of the examview_Title6__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamview_Title6__C() {
        return examviewTitle6C;
    }

    /**
     * Sets the value of the examview_Title6__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamview_Title6__C(String value) {
        this.examviewTitle6C = value;
    }

    /**
     * Gets the value of the examview_Title7__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamview_Title7__C() {
        return examviewTitle7C;
    }

    /**
     * Sets the value of the examview_Title7__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamview_Title7__C(String value) {
        this.examviewTitle7C = value;
    }

    /**
     * Gets the value of the examview_Title8__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamview_Title8__C() {
        return examviewTitle8C;
    }

    /**
     * Sets the value of the examview_Title8__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamview_Title8__C(String value) {
        this.examviewTitle8C = value;
    }

    /**
     * Gets the value of the examview_Title9__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamview_Title9__C() {
        return examviewTitle9C;
    }

    /**
     * Sets the value of the examview_Title9__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamview_Title9__C(String value) {
        this.examviewTitle9C = value;
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
     * Gets the value of the make_Public_Or_Private__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMake_Public_Or_Private__C() {
        return makePublicOrPrivateC;
    }

    /**
     * Sets the value of the make_Public_Or_Private__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMake_Public_Or_Private__C(String value) {
        this.makePublicOrPrivateC = value;
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
     * Gets the value of the name_Location_Of_Material_To_Be_Copied__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName_Location_Of_Material_To_Be_Copied__C() {
        return nameLocationOfMaterialToBeCopiedC;
    }

    /**
     * Sets the value of the name_Location_Of_Material_To_Be_Copied__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName_Location_Of_Material_To_Be_Copied__C(String value) {
        this.nameLocationOfMaterialToBeCopiedC = value;
    }

    /**
     * Gets the value of the new_State_S_Standards__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNew_State_S_Standards__C() {
        return newStateSStandardsC;
    }

    /**
     * Sets the value of the new_State_S_Standards__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNew_State_S_Standards__C(Boolean value) {
        this.newStateSStandardsC = value;
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
     * Gets the value of the opportunity_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunity_Name__C() {
        return opportunityNameC;
    }

    /**
     * Sets the value of the opportunity_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunity_Name__C(String value) {
        this.opportunityNameC = value;
    }

    /**
     * Gets the value of the opportunity_Name__R property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityType }
     *     
     */
    public OpportunityType getOpportunity_Name__R() {
        return opportunityNameR;
    }

    /**
     * Sets the value of the opportunity_Name__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityType }
     *     
     */
    public void setOpportunity_Name__R(OpportunityType value) {
        this.opportunityNameR = value;
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
     * Gets the value of the priority__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority__C() {
        return priorityC;
    }

    /**
     * Sets the value of the priority__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority__C(String value) {
        this.priorityC = value;
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
     * Gets the value of the product10__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct10__C() {
        return product10C;
    }

    /**
     * Sets the value of the product10__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct10__C(String value) {
        this.product10C = value;
    }

    /**
     * Gets the value of the product10__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct10__R() {
        return product10R;
    }

    /**
     * Sets the value of the product10__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct10__R(Product2Type value) {
        this.product10R = value;
    }

    /**
     * Gets the value of the product11__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct11__C() {
        return product11C;
    }

    /**
     * Sets the value of the product11__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct11__C(String value) {
        this.product11C = value;
    }

    /**
     * Gets the value of the product11__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct11__R() {
        return product11R;
    }

    /**
     * Sets the value of the product11__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct11__R(Product2Type value) {
        this.product11R = value;
    }

    /**
     * Gets the value of the product12__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct12__C() {
        return product12C;
    }

    /**
     * Sets the value of the product12__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct12__C(String value) {
        this.product12C = value;
    }

    /**
     * Gets the value of the product12__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct12__R() {
        return product12R;
    }

    /**
     * Sets the value of the product12__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct12__R(Product2Type value) {
        this.product12R = value;
    }

    /**
     * Gets the value of the product13__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct13__C() {
        return product13C;
    }

    /**
     * Sets the value of the product13__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct13__C(String value) {
        this.product13C = value;
    }

    /**
     * Gets the value of the product13__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct13__R() {
        return product13R;
    }

    /**
     * Sets the value of the product13__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct13__R(Product2Type value) {
        this.product13R = value;
    }

    /**
     * Gets the value of the product14__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct14__C() {
        return product14C;
    }

    /**
     * Sets the value of the product14__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct14__C(String value) {
        this.product14C = value;
    }

    /**
     * Gets the value of the product14__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct14__R() {
        return product14R;
    }

    /**
     * Sets the value of the product14__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct14__R(Product2Type value) {
        this.product14R = value;
    }

    /**
     * Gets the value of the product15__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct15__C() {
        return product15C;
    }

    /**
     * Sets the value of the product15__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct15__C(String value) {
        this.product15C = value;
    }

    /**
     * Gets the value of the product15__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct15__R() {
        return product15R;
    }

    /**
     * Sets the value of the product15__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct15__R(Product2Type value) {
        this.product15R = value;
    }

    /**
     * Gets the value of the product16__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct16__C() {
        return product16C;
    }

    /**
     * Sets the value of the product16__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct16__C(String value) {
        this.product16C = value;
    }

    /**
     * Gets the value of the product16__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct16__R() {
        return product16R;
    }

    /**
     * Sets the value of the product16__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct16__R(Product2Type value) {
        this.product16R = value;
    }

    /**
     * Gets the value of the product17__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct17__C() {
        return product17C;
    }

    /**
     * Sets the value of the product17__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct17__C(String value) {
        this.product17C = value;
    }

    /**
     * Gets the value of the product17__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct17__R() {
        return product17R;
    }

    /**
     * Sets the value of the product17__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct17__R(Product2Type value) {
        this.product17R = value;
    }

    /**
     * Gets the value of the product18__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct18__C() {
        return product18C;
    }

    /**
     * Sets the value of the product18__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct18__C(String value) {
        this.product18C = value;
    }

    /**
     * Gets the value of the product18__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct18__R() {
        return product18R;
    }

    /**
     * Sets the value of the product18__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct18__R(Product2Type value) {
        this.product18R = value;
    }

    /**
     * Gets the value of the product1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct1__C() {
        return product1C;
    }

    /**
     * Sets the value of the product1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct1__C(String value) {
        this.product1C = value;
    }

    /**
     * Gets the value of the product1__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct1__R() {
        return product1R;
    }

    /**
     * Sets the value of the product1__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct1__R(Product2Type value) {
        this.product1R = value;
    }

    /**
     * Gets the value of the product2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct2__C() {
        return product2C;
    }

    /**
     * Sets the value of the product2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct2__C(String value) {
        this.product2C = value;
    }

    /**
     * Gets the value of the product2__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct2__R() {
        return product2R;
    }

    /**
     * Sets the value of the product2__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct2__R(Product2Type value) {
        this.product2R = value;
    }

    /**
     * Gets the value of the product3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct3__C() {
        return product3C;
    }

    /**
     * Sets the value of the product3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct3__C(String value) {
        this.product3C = value;
    }

    /**
     * Gets the value of the product3__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct3__R() {
        return product3R;
    }

    /**
     * Sets the value of the product3__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct3__R(Product2Type value) {
        this.product3R = value;
    }

    /**
     * Gets the value of the product4__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct4__C() {
        return product4C;
    }

    /**
     * Sets the value of the product4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct4__C(String value) {
        this.product4C = value;
    }

    /**
     * Gets the value of the product4__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct4__R() {
        return product4R;
    }

    /**
     * Sets the value of the product4__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct4__R(Product2Type value) {
        this.product4R = value;
    }

    /**
     * Gets the value of the product5__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct5__C() {
        return product5C;
    }

    /**
     * Sets the value of the product5__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct5__C(String value) {
        this.product5C = value;
    }

    /**
     * Gets the value of the product5__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct5__R() {
        return product5R;
    }

    /**
     * Sets the value of the product5__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct5__R(Product2Type value) {
        this.product5R = value;
    }

    /**
     * Gets the value of the product6__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct6__C() {
        return product6C;
    }

    /**
     * Sets the value of the product6__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct6__C(String value) {
        this.product6C = value;
    }

    /**
     * Gets the value of the product6__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct6__R() {
        return product6R;
    }

    /**
     * Sets the value of the product6__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct6__R(Product2Type value) {
        this.product6R = value;
    }

    /**
     * Gets the value of the product7__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct7__C() {
        return product7C;
    }

    /**
     * Sets the value of the product7__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct7__C(String value) {
        this.product7C = value;
    }

    /**
     * Gets the value of the product7__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct7__R() {
        return product7R;
    }

    /**
     * Sets the value of the product7__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct7__R(Product2Type value) {
        this.product7R = value;
    }

    /**
     * Gets the value of the product8__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct8__C() {
        return product8C;
    }

    /**
     * Sets the value of the product8__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct8__C(String value) {
        this.product8C = value;
    }

    /**
     * Gets the value of the product8__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct8__R() {
        return product8R;
    }

    /**
     * Sets the value of the product8__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct8__R(Product2Type value) {
        this.product8R = value;
    }

    /**
     * Gets the value of the product9__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct9__C() {
        return product9C;
    }

    /**
     * Sets the value of the product9__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct9__C(String value) {
        this.product9C = value;
    }

    /**
     * Gets the value of the product9__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct9__R() {
        return product9R;
    }

    /**
     * Sets the value of the product9__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct9__R(Product2Type value) {
        this.product9R = value;
    }

    /**
     * Gets the value of the project_Details__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProject_Details__C() {
        return projectDetailsC;
    }

    /**
     * Sets the value of the project_Details__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProject_Details__C(String value) {
        this.projectDetailsC = value;
    }

    /**
     * Gets the value of the provider__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider__C() {
        return providerC;
    }

    /**
     * Sets the value of the provider__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider__C(String value) {
        this.providerC = value;
    }

    /**
     * Gets the value of the recipient_District_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipient_District_Name__C() {
        return recipientDistrictNameC;
    }

    /**
     * Sets the value of the recipient_District_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipient_District_Name__C(String value) {
        this.recipientDistrictNameC = value;
    }

    /**
     * Gets the value of the recipient_District_Name__R property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getRecipient_District_Name__R() {
        return recipientDistrictNameR;
    }

    /**
     * Sets the value of the recipient_District_Name__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setRecipient_District_Name__R(AccountType value) {
        this.recipientDistrictNameR = value;
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
     * Gets the value of the requestor__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestor__C() {
        return requestorC;
    }

    /**
     * Sets the value of the requestor__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestor__C(String value) {
        this.requestorC = value;
    }

    /**
     * Gets the value of the source_District_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource_District_Name__C() {
        return sourceDistrictNameC;
    }

    /**
     * Sets the value of the source_District_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource_District_Name__C(String value) {
        this.sourceDistrictNameC = value;
    }

    /**
     * Gets the value of the source_District_Name__R property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getSource_District_Name__R() {
        return sourceDistrictNameR;
    }

    /**
     * Sets the value of the source_District_Name__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setSource_District_Name__R(AccountType value) {
        this.sourceDistrictNameR = value;
    }

    /**
     * Gets the value of the standard_Arts__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandard_Arts__C() {
        return standardArtsC;
    }

    /**
     * Sets the value of the standard_Arts__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandard_Arts__C(Boolean value) {
        this.standardArtsC = value;
    }

    /**
     * Gets the value of the standard_Business__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandard_Business__C() {
        return standardBusinessC;
    }

    /**
     * Sets the value of the standard_Business__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandard_Business__C(Boolean value) {
        this.standardBusinessC = value;
    }

    /**
     * Gets the value of the standard_Computers_Technology__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandard_Computers_Technology__C() {
        return standardComputersTechnologyC;
    }

    /**
     * Sets the value of the standard_Computers_Technology__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandard_Computers_Technology__C(Boolean value) {
        this.standardComputersTechnologyC = value;
    }

    /**
     * Gets the value of the standard_English_Language_Arts_Core__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandard_English_Language_Arts_Core__C() {
        return standardEnglishLanguageArtsCoreC;
    }

    /**
     * Sets the value of the standard_English_Language_Arts_Core__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandard_English_Language_Arts_Core__C(Boolean value) {
        this.standardEnglishLanguageArtsCoreC = value;
    }

    /**
     * Gets the value of the standard_English_Language_Arts_Elective__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandard_English_Language_Arts_Elective__C() {
        return standardEnglishLanguageArtsElectiveC;
    }

    /**
     * Sets the value of the standard_English_Language_Arts_Elective__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandard_English_Language_Arts_Elective__C(Boolean value) {
        this.standardEnglishLanguageArtsElectiveC = value;
    }

    /**
     * Gets the value of the standard_Foreign_Languages__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandard_Foreign_Languages__C() {
        return standardForeignLanguagesC;
    }

    /**
     * Sets the value of the standard_Foreign_Languages__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandard_Foreign_Languages__C(Boolean value) {
        this.standardForeignLanguagesC = value;
    }

    /**
     * Gets the value of the standard_Mathematics_Core__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandard_Mathematics_Core__C() {
        return standardMathematicsCoreC;
    }

    /**
     * Sets the value of the standard_Mathematics_Core__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandard_Mathematics_Core__C(Boolean value) {
        this.standardMathematicsCoreC = value;
    }

    /**
     * Gets the value of the standard_Mathematics_Electives__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandard_Mathematics_Electives__C() {
        return standardMathematicsElectivesC;
    }

    /**
     * Sets the value of the standard_Mathematics_Electives__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandard_Mathematics_Electives__C(Boolean value) {
        this.standardMathematicsElectivesC = value;
    }

    /**
     * Gets the value of the standard_Other__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandard_Other__C() {
        return standardOtherC;
    }

    /**
     * Sets the value of the standard_Other__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandard_Other__C(Boolean value) {
        this.standardOtherC = value;
    }

    /**
     * Gets the value of the standard_Physical_Education__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandard_Physical_Education__C() {
        return standardPhysicalEducationC;
    }

    /**
     * Sets the value of the standard_Physical_Education__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandard_Physical_Education__C(Boolean value) {
        this.standardPhysicalEducationC = value;
    }

    /**
     * Gets the value of the standard_Science_Core__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandard_Science_Core__C() {
        return standardScienceCoreC;
    }

    /**
     * Sets the value of the standard_Science_Core__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandard_Science_Core__C(Boolean value) {
        this.standardScienceCoreC = value;
    }

    /**
     * Gets the value of the standard_Science_Electivies__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandard_Science_Electivies__C() {
        return standardScienceElectiviesC;
    }

    /**
     * Sets the value of the standard_Science_Electivies__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandard_Science_Electivies__C(Boolean value) {
        this.standardScienceElectiviesC = value;
    }

    /**
     * Gets the value of the standard_Set_Detail__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandard_Set_Detail__C() {
        return standardSetDetailC;
    }

    /**
     * Sets the value of the standard_Set_Detail__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandard_Set_Detail__C(String value) {
        this.standardSetDetailC = value;
    }

    /**
     * Gets the value of the standard_Set__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandard_Set__C() {
        return standardSetC;
    }

    /**
     * Sets the value of the standard_Set__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandard_Set__C(String value) {
        this.standardSetC = value;
    }

    /**
     * Gets the value of the standard_Social_Studies_Core__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandard_Social_Studies_Core__C() {
        return standardSocialStudiesCoreC;
    }

    /**
     * Sets the value of the standard_Social_Studies_Core__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandard_Social_Studies_Core__C(Boolean value) {
        this.standardSocialStudiesCoreC = value;
    }

    /**
     * Gets the value of the standard_Social_Studies_Elective__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandard_Social_Studies_Elective__C() {
        return standardSocialStudiesElectiveC;
    }

    /**
     * Sets the value of the standard_Social_Studies_Elective__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandard_Social_Studies_Elective__C(Boolean value) {
        this.standardSocialStudiesElectiveC = value;
    }

    /**
     * Gets the value of the state_Loaded__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState_Loaded__C() {
        return stateLoadedC;
    }

    /**
     * Sets the value of the state_Loaded__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState_Loaded__C(String value) {
        this.stateLoadedC = value;
    }

    /**
     * Gets the value of the state_Standards_Updated__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isState_Standards_Updated__C() {
        return stateStandardsUpdatedC;
    }

    /**
     * Sets the value of the state_Standards_Updated__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setState_Standards_Updated__C(Boolean value) {
        this.stateStandardsUpdatedC = value;
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
     * Gets the value of the subject__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject__C() {
        return subjectC;
    }

    /**
     * Sets the value of the subject__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject__C(String value) {
        this.subjectC = value;
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
     * Gets the value of the textbook_Information__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextbook_Information__C() {
        return textbookInformationC;
    }

    /**
     * Sets the value of the textbook_Information__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextbook_Information__C(String value) {
        this.textbookInformationC = value;
    }

    /**
     * Gets the value of the user_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser_Type__C() {
        return userTypeC;
    }

    /**
     * Sets the value of the user_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser_Type__C(String value) {
        this.userTypeC = value;
    }

    /**
     * Gets the value of the users_Names_Limit10__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsers_Names_Limit10__C() {
        return usersNamesLimit10C;
    }

    /**
     * Sets the value of the users_Names_Limit10__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsers_Names_Limit10__C(String value) {
        this.usersNamesLimit10C = value;
    }

    /**
     * Gets the value of the email__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail__C() {
        return emailC;
    }

    /**
     * Sets the value of the email__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail__C(String value) {
        this.emailC = value;
    }

}
