
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Lead complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lead">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="ActivityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Are_you_a_customer__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Are_you_working_with_a_Reseller__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Campaign" type="{urn:sobject.enterprise.soap.sforce.com}Campaign" minOccurs="0"/>
 *         &lt;element name="CampaignMembers" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConvertedAccount" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="ConvertedAccountId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConvertedContact" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="ConvertedContactId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConvertedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ConvertedOpportunity" type="{urn:sobject.enterprise.soap.sforce.com}Opportunity" minOccurs="0"/>
 *         &lt;element name="ConvertedOpportunityId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Decision_Department__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Decision_Level__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Decision_Timeframe__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Division" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Eloqua_Events__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailBouncedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EmailBouncedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailStatuses" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Email_Opt_In__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Enrollment__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Events" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Feeds" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="First_Referral_Meeting_Leads__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Funding_Source__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gatekeeper_s_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasOptedOutOfEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="How_did_you_hear_about_Edusoft__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interest_Product_1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interest_Product_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interest_Product_3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interest_Product__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interested_in_Criterion__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interested_in_email_webinars_products__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsConverted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsUnreadByOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Jigsaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Role__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeadSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Rating__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Score__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Lead_Source_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Source_Representative__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Source__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_Owned__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Mailing_City__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mailing_Country__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mailing_State__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mailing_Street__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mailing_Zip_Postal_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MasterRecord" type="{urn:sobject.enterprise.soap.sforce.com}Lead" minOccurs="0"/>
 *         &lt;element name="MasterRecordId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Most_Recent_Lead_Source__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Number_of_Students__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Number_of_Teachers__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OpenActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PIDNID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Physical_Address_Same_as_Mailing__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Product_Interest__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordType" type="{urn:sobject.enterprise.soap.sforce.com}RecordType" minOccurs="0"/>
 *         &lt;element name="RecordTypeId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Reseller_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Role_Edusoft_Leads__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="School_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Secondary_Role_Lead__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shares" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Shipping_City__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Country__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_State__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Street_1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Zip_Postal_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State_required_writing_assess_spring__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Which_Grades_Other__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Which_Grades__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="experianqas__Updated_Touchpoints_Timestamp__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="experianqas__Updated_Touchpoints__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lead", propOrder = {
    "activityHistories",
    "areYouACustomerC",
    "areYouWorkingWithAResellerC",
    "attachments",
    "campaign",
    "campaignMembers",
    "city",
    "company",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "convertedAccount",
    "convertedAccountId",
    "convertedContact",
    "convertedContactId",
    "convertedDate",
    "convertedOpportunity",
    "convertedOpportunityId",
    "country",
    "countyC",
    "createdBy",
    "createdById",
    "createdDate",
    "decisionDepartmentC",
    "decisionLevelC",
    "decisionTimeframeC",
    "description",
    "division",
    "eloquaEventsC",
    "email",
    "emailBouncedDate",
    "emailBouncedReason",
    "emailStatuses",
    "emailOptInC",
    "enrollmentC",
    "events",
    "fax",
    "feedSubscriptionsForEntity",
    "feeds",
    "firstName",
    "firstReferralMeetingLeadsC",
    "fundingSourceC",
    "gatekeeperSNameC",
    "hasOptedOutOfEmail",
    "histories",
    "howDidYouHearAboutEdusoftC",
    "interestProduct1C",
    "interestProduct2C",
    "interestProduct3C",
    "interestProductC",
    "interestedInCriterionC",
    "interestedInEmailWebinarsProductsC",
    "isConverted",
    "isDeleted",
    "isUnreadByOwner",
    "jigsaw",
    "jobCodeC",
    "jobRoleC",
    "lastActivityDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastName",
    "leadSource",
    "leadRatingC",
    "leadScoreC",
    "leadSourceCommentsC",
    "leadSourceRepresentativeC",
    "leadSourceC",
    "mdrOwnedC",
    "mailingCityC",
    "mailingCountryC",
    "mailingStateC",
    "mailingStreetC",
    "mailingZipPostalCodeC",
    "masterRecord",
    "masterRecordId",
    "mobilePhone",
    "mostRecentLeadSourceC",
    "nidC",
    "name",
    "notes",
    "notesAndAttachments",
    "numberOfStudentsC",
    "numberOfTeachersC",
    "openActivities",
    "owner",
    "ownerId",
    "pidnidC",
    "pidC",
    "phone",
    "physicalAddressSameAsMailingC",
    "postalCode",
    "processInstances",
    "processSteps",
    "productInterestC",
    "rating",
    "recordType",
    "recordTypeId",
    "resellerNameC",
    "roleEdusoftLeadsC",
    "salutation",
    "schoolNameC",
    "secondaryRoleLeadC",
    "shares",
    "shippingCityC",
    "shippingCountryC",
    "shippingStateC",
    "shippingStreet1C",
    "shippingZipPostalCodeC",
    "state",
    "stateRequiredWritingAssessSpringC",
    "status",
    "street",
    "systemModstamp",
    "tasks",
    "title",
    "website",
    "whichGradesOtherC",
    "whichGradesC",
    "experianqasUpdatedTouchpointsTimestampC",
    "experianqasUpdatedTouchpointsC"
})
public class LeadType
    extends SObjectType
{

    @XmlElement(name = "ActivityHistories", nillable = true)
    protected QueryResult activityHistories;
    @XmlElement(name = "Are_you_a_customer__c", nillable = true)
    protected String areYouACustomerC;
    @XmlElement(name = "Are_you_working_with_a_Reseller__c", nillable = true)
    protected String areYouWorkingWithAResellerC;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "Campaign", nillable = true)
    protected CampaignType campaign;
    @XmlElement(name = "CampaignMembers", nillable = true)
    protected QueryResult campaignMembers;
    @XmlElement(name = "City", nillable = true)
    protected String city;
    @XmlElement(name = "Company", nillable = true)
    protected String company;
    @XmlElement(name = "ConnectionReceived", nillable = true)
    protected PartnerNetworkConnectionType connectionReceived;
    @XmlElement(name = "ConnectionReceivedId", nillable = true)
    protected String connectionReceivedId;
    @XmlElement(name = "ConnectionSent", nillable = true)
    protected PartnerNetworkConnectionType connectionSent;
    @XmlElement(name = "ConnectionSentId", nillable = true)
    protected String connectionSentId;
    @XmlElement(name = "ConvertedAccount", nillable = true)
    protected AccountType convertedAccount;
    @XmlElement(name = "ConvertedAccountId", nillable = true)
    protected String convertedAccountId;
    @XmlElement(name = "ConvertedContact", nillable = true)
    protected ContactType convertedContact;
    @XmlElement(name = "ConvertedContactId", nillable = true)
    protected String convertedContactId;
    @XmlElement(name = "ConvertedDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar convertedDate;
    @XmlElement(name = "ConvertedOpportunity", nillable = true)
    protected OpportunityType convertedOpportunity;
    @XmlElement(name = "ConvertedOpportunityId", nillable = true)
    protected String convertedOpportunityId;
    @XmlElement(name = "Country", nillable = true)
    protected String country;
    @XmlElement(name = "County__c", nillable = true)
    protected String countyC;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Decision_Department__c", nillable = true)
    protected String decisionDepartmentC;
    @XmlElement(name = "Decision_Level__c", nillable = true)
    protected String decisionLevelC;
    @XmlElement(name = "Decision_Timeframe__c", nillable = true)
    protected String decisionTimeframeC;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "Division", nillable = true)
    protected String division;
    @XmlElement(name = "Eloqua_Events__c", nillable = true)
    protected String eloquaEventsC;
    @XmlElement(name = "Email", nillable = true)
    protected String email;
    @XmlElement(name = "EmailBouncedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar emailBouncedDate;
    @XmlElement(name = "EmailBouncedReason", nillable = true)
    protected String emailBouncedReason;
    @XmlElement(name = "EmailStatuses", nillable = true)
    protected QueryResult emailStatuses;
    @XmlElement(name = "Email_Opt_In__c", nillable = true)
    protected Boolean emailOptInC;
    @XmlElement(name = "Enrollment__c", nillable = true)
    protected Double enrollmentC;
    @XmlElement(name = "Events", nillable = true)
    protected QueryResult events;
    @XmlElement(name = "Fax", nillable = true)
    protected String fax;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "Feeds", nillable = true)
    protected QueryResult feeds;
    @XmlElement(name = "FirstName", nillable = true)
    protected String firstName;
    @XmlElement(name = "First_Referral_Meeting_Leads__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstReferralMeetingLeadsC;
    @XmlElement(name = "Funding_Source__c", nillable = true)
    protected String fundingSourceC;
    @XmlElement(name = "Gatekeeper_s_Name__c", nillable = true)
    protected String gatekeeperSNameC;
    @XmlElement(name = "HasOptedOutOfEmail", nillable = true)
    protected Boolean hasOptedOutOfEmail;
    @XmlElement(name = "Histories", nillable = true)
    protected QueryResult histories;
    @XmlElement(name = "How_did_you_hear_about_Edusoft__c", nillable = true)
    protected String howDidYouHearAboutEdusoftC;
    @XmlElement(name = "Interest_Product_1__c", nillable = true)
    protected String interestProduct1C;
    @XmlElement(name = "Interest_Product_2__c", nillable = true)
    protected String interestProduct2C;
    @XmlElement(name = "Interest_Product_3__c", nillable = true)
    protected String interestProduct3C;
    @XmlElement(name = "Interest_Product__c", nillable = true)
    protected String interestProductC;
    @XmlElement(name = "Interested_in_Criterion__c", nillable = true)
    protected String interestedInCriterionC;
    @XmlElement(name = "Interested_in_email_webinars_products__c", nillable = true)
    protected Boolean interestedInEmailWebinarsProductsC;
    @XmlElement(name = "IsConverted", nillable = true)
    protected Boolean isConverted;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "IsUnreadByOwner", nillable = true)
    protected Boolean isUnreadByOwner;
    @XmlElement(name = "Jigsaw", nillable = true)
    protected String jigsaw;
    @XmlElement(name = "Job_Code__c", nillable = true)
    protected String jobCodeC;
    @XmlElement(name = "Job_Role__c", nillable = true)
    protected String jobRoleC;
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
    @XmlElement(name = "LastName", nillable = true)
    protected String lastName;
    @XmlElement(name = "LeadSource", nillable = true)
    protected String leadSource;
    @XmlElement(name = "Lead_Rating__c", nillable = true)
    protected String leadRatingC;
    @XmlElement(name = "Lead_Score__c", nillable = true)
    protected Double leadScoreC;
    @XmlElement(name = "Lead_Source_Comments__c", nillable = true)
    protected String leadSourceCommentsC;
    @XmlElement(name = "Lead_Source_Representative__c", nillable = true)
    protected String leadSourceRepresentativeC;
    @XmlElement(name = "Lead_Source__c", nillable = true)
    protected String leadSourceC;
    @XmlElement(name = "MDR_Owned__c", nillable = true)
    protected Boolean mdrOwnedC;
    @XmlElement(name = "Mailing_City__c", nillable = true)
    protected String mailingCityC;
    @XmlElement(name = "Mailing_Country__c", nillable = true)
    protected String mailingCountryC;
    @XmlElement(name = "Mailing_State__c", nillable = true)
    protected String mailingStateC;
    @XmlElement(name = "Mailing_Street__c", nillable = true)
    protected String mailingStreetC;
    @XmlElement(name = "Mailing_Zip_Postal_Code__c", nillable = true)
    protected String mailingZipPostalCodeC;
    @XmlElement(name = "MasterRecord", nillable = true)
    protected LeadType masterRecord;
    @XmlElement(name = "MasterRecordId", nillable = true)
    protected String masterRecordId;
    @XmlElement(name = "MobilePhone", nillable = true)
    protected String mobilePhone;
    @XmlElement(name = "Most_Recent_Lead_Source__c", nillable = true)
    protected String mostRecentLeadSourceC;
    @XmlElement(name = "NID__c", nillable = true)
    protected String nidC;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "Number_of_Students__c", nillable = true)
    protected Double numberOfStudentsC;
    @XmlElement(name = "Number_of_Teachers__c", nillable = true)
    protected Double numberOfTeachersC;
    @XmlElement(name = "OpenActivities", nillable = true)
    protected QueryResult openActivities;
    @XmlElement(name = "Owner", nillable = true)
    protected NameType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "PIDNID__c", nillable = true)
    protected String pidnidC;
    @XmlElement(name = "PID__c", nillable = true)
    protected String pidC;
    @XmlElement(name = "Phone", nillable = true)
    protected String phone;
    @XmlElement(name = "Physical_Address_Same_as_Mailing__c", nillable = true)
    protected Boolean physicalAddressSameAsMailingC;
    @XmlElement(name = "PostalCode", nillable = true)
    protected String postalCode;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "Product_Interest__c", nillable = true)
    protected String productInterestC;
    @XmlElement(name = "Rating", nillable = true)
    protected String rating;
    @XmlElement(name = "RecordType", nillable = true)
    protected RecordTypeType recordType;
    @XmlElement(name = "RecordTypeId", nillable = true)
    protected String recordTypeId;
    @XmlElement(name = "Reseller_Name__c", nillable = true)
    protected String resellerNameC;
    @XmlElement(name = "Role_Edusoft_Leads__c", nillable = true)
    protected String roleEdusoftLeadsC;
    @XmlElement(name = "Salutation", nillable = true)
    protected String salutation;
    @XmlElement(name = "School_Name__c", nillable = true)
    protected String schoolNameC;
    @XmlElement(name = "Secondary_Role_Lead__c", nillable = true)
    protected String secondaryRoleLeadC;
    @XmlElement(name = "Shares", nillable = true)
    protected QueryResult shares;
    @XmlElement(name = "Shipping_City__c", nillable = true)
    protected String shippingCityC;
    @XmlElement(name = "Shipping_Country__c", nillable = true)
    protected String shippingCountryC;
    @XmlElement(name = "Shipping_State__c", nillable = true)
    protected String shippingStateC;
    @XmlElement(name = "Shipping_Street_1__c", nillable = true)
    protected String shippingStreet1C;
    @XmlElement(name = "Shipping_Zip_Postal_Code__c", nillable = true)
    protected String shippingZipPostalCodeC;
    @XmlElement(name = "State", nillable = true)
    protected String state;
    @XmlElement(name = "State_required_writing_assess_spring__c", nillable = true)
    protected Boolean stateRequiredWritingAssessSpringC;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "Street", nillable = true)
    protected String street;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Tasks", nillable = true)
    protected QueryResult tasks;
    @XmlElement(name = "Title", nillable = true)
    protected String title;
    @XmlElement(name = "Website", nillable = true)
    protected String website;
    @XmlElement(name = "Which_Grades_Other__c", nillable = true)
    protected String whichGradesOtherC;
    @XmlElement(name = "Which_Grades__c", nillable = true)
    protected String whichGradesC;
    @XmlElement(name = "experianqas__Updated_Touchpoints_Timestamp__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar experianqasUpdatedTouchpointsTimestampC;
    @XmlElement(name = "experianqas__Updated_Touchpoints__c", nillable = true)
    protected String experianqasUpdatedTouchpointsC;

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
     * Gets the value of the are_You_A_Customer__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAre_You_A_Customer__C() {
        return areYouACustomerC;
    }

    /**
     * Sets the value of the are_You_A_Customer__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAre_You_A_Customer__C(String value) {
        this.areYouACustomerC = value;
    }

    /**
     * Gets the value of the are_You_Working_With_A_Reseller__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAre_You_Working_With_A_Reseller__C() {
        return areYouWorkingWithAResellerC;
    }

    /**
     * Sets the value of the are_You_Working_With_A_Reseller__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAre_You_Working_With_A_Reseller__C(String value) {
        this.areYouWorkingWithAResellerC = value;
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
     * Gets the value of the campaign property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignType }
     *     
     */
    public CampaignType getCampaign() {
        return campaign;
    }

    /**
     * Sets the value of the campaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignType }
     *     
     */
    public void setCampaign(CampaignType value) {
        this.campaign = value;
    }

    /**
     * Gets the value of the campaignMembers property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getCampaignMembers() {
        return campaignMembers;
    }

    /**
     * Sets the value of the campaignMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setCampaignMembers(QueryResult value) {
        this.campaignMembers = value;
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
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
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
     * Gets the value of the convertedAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getConvertedAccount() {
        return convertedAccount;
    }

    /**
     * Sets the value of the convertedAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setConvertedAccount(AccountType value) {
        this.convertedAccount = value;
    }

    /**
     * Gets the value of the convertedAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvertedAccountId() {
        return convertedAccountId;
    }

    /**
     * Sets the value of the convertedAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvertedAccountId(String value) {
        this.convertedAccountId = value;
    }

    /**
     * Gets the value of the convertedContact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getConvertedContact() {
        return convertedContact;
    }

    /**
     * Sets the value of the convertedContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setConvertedContact(ContactType value) {
        this.convertedContact = value;
    }

    /**
     * Gets the value of the convertedContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvertedContactId() {
        return convertedContactId;
    }

    /**
     * Sets the value of the convertedContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvertedContactId(String value) {
        this.convertedContactId = value;
    }

    /**
     * Gets the value of the convertedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConvertedDate() {
        return convertedDate;
    }

    /**
     * Sets the value of the convertedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConvertedDate(XMLGregorianCalendar value) {
        this.convertedDate = value;
    }

    /**
     * Gets the value of the convertedOpportunity property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityType }
     *     
     */
    public OpportunityType getConvertedOpportunity() {
        return convertedOpportunity;
    }

    /**
     * Sets the value of the convertedOpportunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityType }
     *     
     */
    public void setConvertedOpportunity(OpportunityType value) {
        this.convertedOpportunity = value;
    }

    /**
     * Gets the value of the convertedOpportunityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvertedOpportunityId() {
        return convertedOpportunityId;
    }

    /**
     * Sets the value of the convertedOpportunityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvertedOpportunityId(String value) {
        this.convertedOpportunityId = value;
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
     * Gets the value of the county__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty__C() {
        return countyC;
    }

    /**
     * Sets the value of the county__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty__C(String value) {
        this.countyC = value;
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
     * Gets the value of the decision_Department__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecision_Department__C() {
        return decisionDepartmentC;
    }

    /**
     * Sets the value of the decision_Department__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecision_Department__C(String value) {
        this.decisionDepartmentC = value;
    }

    /**
     * Gets the value of the decision_Level__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecision_Level__C() {
        return decisionLevelC;
    }

    /**
     * Sets the value of the decision_Level__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecision_Level__C(String value) {
        this.decisionLevelC = value;
    }

    /**
     * Gets the value of the decision_Timeframe__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecision_Timeframe__C() {
        return decisionTimeframeC;
    }

    /**
     * Sets the value of the decision_Timeframe__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecision_Timeframe__C(String value) {
        this.decisionTimeframeC = value;
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
     * Gets the value of the eloqua_Events__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEloqua_Events__C() {
        return eloquaEventsC;
    }

    /**
     * Sets the value of the eloqua_Events__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEloqua_Events__C(String value) {
        this.eloquaEventsC = value;
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
     * Gets the value of the emailBouncedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmailBouncedDate() {
        return emailBouncedDate;
    }

    /**
     * Sets the value of the emailBouncedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmailBouncedDate(XMLGregorianCalendar value) {
        this.emailBouncedDate = value;
    }

    /**
     * Gets the value of the emailBouncedReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailBouncedReason() {
        return emailBouncedReason;
    }

    /**
     * Sets the value of the emailBouncedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailBouncedReason(String value) {
        this.emailBouncedReason = value;
    }

    /**
     * Gets the value of the emailStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getEmailStatuses() {
        return emailStatuses;
    }

    /**
     * Sets the value of the emailStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setEmailStatuses(QueryResult value) {
        this.emailStatuses = value;
    }

    /**
     * Gets the value of the email_Opt_In__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmail_Opt_In__C() {
        return emailOptInC;
    }

    /**
     * Sets the value of the email_Opt_In__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmail_Opt_In__C(Boolean value) {
        this.emailOptInC = value;
    }

    /**
     * Gets the value of the enrollment__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEnrollment__C() {
        return enrollmentC;
    }

    /**
     * Sets the value of the enrollment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEnrollment__C(Double value) {
        this.enrollmentC = value;
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
     * Gets the value of the first_Referral_Meeting_Leads__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirst_Referral_Meeting_Leads__C() {
        return firstReferralMeetingLeadsC;
    }

    /**
     * Sets the value of the first_Referral_Meeting_Leads__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirst_Referral_Meeting_Leads__C(XMLGregorianCalendar value) {
        this.firstReferralMeetingLeadsC = value;
    }

    /**
     * Gets the value of the funding_Source__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunding_Source__C() {
        return fundingSourceC;
    }

    /**
     * Sets the value of the funding_Source__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunding_Source__C(String value) {
        this.fundingSourceC = value;
    }

    /**
     * Gets the value of the gatekeeper_S_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatekeeper_S_Name__C() {
        return gatekeeperSNameC;
    }

    /**
     * Sets the value of the gatekeeper_S_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatekeeper_S_Name__C(String value) {
        this.gatekeeperSNameC = value;
    }

    /**
     * Gets the value of the hasOptedOutOfEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasOptedOutOfEmail() {
        return hasOptedOutOfEmail;
    }

    /**
     * Sets the value of the hasOptedOutOfEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOptedOutOfEmail(Boolean value) {
        this.hasOptedOutOfEmail = value;
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
     * Gets the value of the how_Did_You_Hear_About_Edusoft__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHow_Did_You_Hear_About_Edusoft__C() {
        return howDidYouHearAboutEdusoftC;
    }

    /**
     * Sets the value of the how_Did_You_Hear_About_Edusoft__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHow_Did_You_Hear_About_Edusoft__C(String value) {
        this.howDidYouHearAboutEdusoftC = value;
    }

    /**
     * Gets the value of the interest_Product_1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterest_Product_1__C() {
        return interestProduct1C;
    }

    /**
     * Sets the value of the interest_Product_1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterest_Product_1__C(String value) {
        this.interestProduct1C = value;
    }

    /**
     * Gets the value of the interest_Product_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterest_Product_2__C() {
        return interestProduct2C;
    }

    /**
     * Sets the value of the interest_Product_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterest_Product_2__C(String value) {
        this.interestProduct2C = value;
    }

    /**
     * Gets the value of the interest_Product_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterest_Product_3__C() {
        return interestProduct3C;
    }

    /**
     * Sets the value of the interest_Product_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterest_Product_3__C(String value) {
        this.interestProduct3C = value;
    }

    /**
     * Gets the value of the interest_Product__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterest_Product__C() {
        return interestProductC;
    }

    /**
     * Sets the value of the interest_Product__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterest_Product__C(String value) {
        this.interestProductC = value;
    }

    /**
     * Gets the value of the interested_In_Criterion__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterested_In_Criterion__C() {
        return interestedInCriterionC;
    }

    /**
     * Sets the value of the interested_In_Criterion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterested_In_Criterion__C(String value) {
        this.interestedInCriterionC = value;
    }

    /**
     * Gets the value of the interested_In_Email_Webinars_Products__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterested_In_Email_Webinars_Products__C() {
        return interestedInEmailWebinarsProductsC;
    }

    /**
     * Sets the value of the interested_In_Email_Webinars_Products__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterested_In_Email_Webinars_Products__C(Boolean value) {
        this.interestedInEmailWebinarsProductsC = value;
    }

    /**
     * Gets the value of the isConverted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConverted() {
        return isConverted;
    }

    /**
     * Sets the value of the isConverted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConverted(Boolean value) {
        this.isConverted = value;
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
     * Gets the value of the isUnreadByOwner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUnreadByOwner() {
        return isUnreadByOwner;
    }

    /**
     * Sets the value of the isUnreadByOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUnreadByOwner(Boolean value) {
        this.isUnreadByOwner = value;
    }

    /**
     * Gets the value of the jigsaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJigsaw() {
        return jigsaw;
    }

    /**
     * Sets the value of the jigsaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJigsaw(String value) {
        this.jigsaw = value;
    }

    /**
     * Gets the value of the job_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJob_Code__C() {
        return jobCodeC;
    }

    /**
     * Sets the value of the job_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJob_Code__C(String value) {
        this.jobCodeC = value;
    }

    /**
     * Gets the value of the job_Role__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJob_Role__C() {
        return jobRoleC;
    }

    /**
     * Sets the value of the job_Role__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJob_Role__C(String value) {
        this.jobRoleC = value;
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
     * Gets the value of the leadSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadSource() {
        return leadSource;
    }

    /**
     * Sets the value of the leadSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadSource(String value) {
        this.leadSource = value;
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
     * Gets the value of the lead_Score__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLead_Score__C() {
        return leadScoreC;
    }

    /**
     * Sets the value of the lead_Score__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLead_Score__C(Double value) {
        this.leadScoreC = value;
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
     * Gets the value of the lead_Source_Representative__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLead_Source_Representative__C() {
        return leadSourceRepresentativeC;
    }

    /**
     * Sets the value of the lead_Source_Representative__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLead_Source_Representative__C(String value) {
        this.leadSourceRepresentativeC = value;
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
     * Gets the value of the mdr_Owned__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMDR_Owned__C() {
        return mdrOwnedC;
    }

    /**
     * Sets the value of the mdr_Owned__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMDR_Owned__C(Boolean value) {
        this.mdrOwnedC = value;
    }

    /**
     * Gets the value of the mailing_City__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailing_City__C() {
        return mailingCityC;
    }

    /**
     * Sets the value of the mailing_City__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailing_City__C(String value) {
        this.mailingCityC = value;
    }

    /**
     * Gets the value of the mailing_Country__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailing_Country__C() {
        return mailingCountryC;
    }

    /**
     * Sets the value of the mailing_Country__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailing_Country__C(String value) {
        this.mailingCountryC = value;
    }

    /**
     * Gets the value of the mailing_State__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailing_State__C() {
        return mailingStateC;
    }

    /**
     * Sets the value of the mailing_State__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailing_State__C(String value) {
        this.mailingStateC = value;
    }

    /**
     * Gets the value of the mailing_Street__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailing_Street__C() {
        return mailingStreetC;
    }

    /**
     * Sets the value of the mailing_Street__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailing_Street__C(String value) {
        this.mailingStreetC = value;
    }

    /**
     * Gets the value of the mailing_Zip_Postal_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailing_Zip_Postal_Code__C() {
        return mailingZipPostalCodeC;
    }

    /**
     * Sets the value of the mailing_Zip_Postal_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailing_Zip_Postal_Code__C(String value) {
        this.mailingZipPostalCodeC = value;
    }

    /**
     * Gets the value of the masterRecord property.
     * 
     * @return
     *     possible object is
     *     {@link LeadType }
     *     
     */
    public LeadType getMasterRecord() {
        return masterRecord;
    }

    /**
     * Sets the value of the masterRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadType }
     *     
     */
    public void setMasterRecord(LeadType value) {
        this.masterRecord = value;
    }

    /**
     * Gets the value of the masterRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterRecordId() {
        return masterRecordId;
    }

    /**
     * Sets the value of the masterRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterRecordId(String value) {
        this.masterRecordId = value;
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
     * Gets the value of the most_Recent_Lead_Source__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMost_Recent_Lead_Source__C() {
        return mostRecentLeadSourceC;
    }

    /**
     * Sets the value of the most_Recent_Lead_Source__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMost_Recent_Lead_Source__C(String value) {
        this.mostRecentLeadSourceC = value;
    }

    /**
     * Gets the value of the nid__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNID__C() {
        return nidC;
    }

    /**
     * Sets the value of the nid__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNID__C(String value) {
        this.nidC = value;
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
     * Gets the value of the number_Of_Students__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumber_Of_Students__C() {
        return numberOfStudentsC;
    }

    /**
     * Sets the value of the number_Of_Students__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumber_Of_Students__C(Double value) {
        this.numberOfStudentsC = value;
    }

    /**
     * Gets the value of the number_Of_Teachers__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumber_Of_Teachers__C() {
        return numberOfTeachersC;
    }

    /**
     * Sets the value of the number_Of_Teachers__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumber_Of_Teachers__C(Double value) {
        this.numberOfTeachersC = value;
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
     * Gets the value of the pidnid__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIDNID__C() {
        return pidnidC;
    }

    /**
     * Sets the value of the pidnid__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIDNID__C(String value) {
        this.pidnidC = value;
    }

    /**
     * Gets the value of the pid__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPID__C() {
        return pidC;
    }

    /**
     * Sets the value of the pid__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPID__C(String value) {
        this.pidC = value;
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
     * Gets the value of the physical_Address_Same_As_Mailing__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhysical_Address_Same_As_Mailing__C() {
        return physicalAddressSameAsMailingC;
    }

    /**
     * Sets the value of the physical_Address_Same_As_Mailing__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhysical_Address_Same_As_Mailing__C(Boolean value) {
        this.physicalAddressSameAsMailingC = value;
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
     * Gets the value of the product_Interest__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct_Interest__C() {
        return productInterestC;
    }

    /**
     * Sets the value of the product_Interest__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct_Interest__C(String value) {
        this.productInterestC = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRating(String value) {
        this.rating = value;
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
     * Gets the value of the reseller_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReseller_Name__C() {
        return resellerNameC;
    }

    /**
     * Sets the value of the reseller_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReseller_Name__C(String value) {
        this.resellerNameC = value;
    }

    /**
     * Gets the value of the role_Edusoft_Leads__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole_Edusoft_Leads__C() {
        return roleEdusoftLeadsC;
    }

    /**
     * Sets the value of the role_Edusoft_Leads__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole_Edusoft_Leads__C(String value) {
        this.roleEdusoftLeadsC = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the school_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchool_Name__C() {
        return schoolNameC;
    }

    /**
     * Sets the value of the school_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchool_Name__C(String value) {
        this.schoolNameC = value;
    }

    /**
     * Gets the value of the secondary_Role_Lead__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondary_Role_Lead__C() {
        return secondaryRoleLeadC;
    }

    /**
     * Sets the value of the secondary_Role_Lead__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondary_Role_Lead__C(String value) {
        this.secondaryRoleLeadC = value;
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
     * Gets the value of the shipping_City__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipping_City__C() {
        return shippingCityC;
    }

    /**
     * Sets the value of the shipping_City__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipping_City__C(String value) {
        this.shippingCityC = value;
    }

    /**
     * Gets the value of the shipping_Country__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipping_Country__C() {
        return shippingCountryC;
    }

    /**
     * Sets the value of the shipping_Country__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipping_Country__C(String value) {
        this.shippingCountryC = value;
    }

    /**
     * Gets the value of the shipping_State__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipping_State__C() {
        return shippingStateC;
    }

    /**
     * Sets the value of the shipping_State__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipping_State__C(String value) {
        this.shippingStateC = value;
    }

    /**
     * Gets the value of the shipping_Street_1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipping_Street_1__C() {
        return shippingStreet1C;
    }

    /**
     * Sets the value of the shipping_Street_1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipping_Street_1__C(String value) {
        this.shippingStreet1C = value;
    }

    /**
     * Gets the value of the shipping_Zip_Postal_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipping_Zip_Postal_Code__C() {
        return shippingZipPostalCodeC;
    }

    /**
     * Sets the value of the shipping_Zip_Postal_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipping_Zip_Postal_Code__C(String value) {
        this.shippingZipPostalCodeC = value;
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
     * Gets the value of the state_Required_Writing_Assess_Spring__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isState_Required_Writing_Assess_Spring__C() {
        return stateRequiredWritingAssessSpringC;
    }

    /**
     * Sets the value of the state_Required_Writing_Assess_Spring__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setState_Required_Writing_Assess_Spring__C(Boolean value) {
        this.stateRequiredWritingAssessSpringC = value;
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
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * Gets the value of the which_Grades_Other__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhich_Grades_Other__C() {
        return whichGradesOtherC;
    }

    /**
     * Sets the value of the which_Grades_Other__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhich_Grades_Other__C(String value) {
        this.whichGradesOtherC = value;
    }

    /**
     * Gets the value of the which_Grades__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhich_Grades__C() {
        return whichGradesC;
    }

    /**
     * Sets the value of the which_Grades__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhich_Grades__C(String value) {
        this.whichGradesC = value;
    }

    /**
     * Gets the value of the experianqas__Updated_Touchpoints_Timestamp__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExperianqas__Updated_Touchpoints_Timestamp__C() {
        return experianqasUpdatedTouchpointsTimestampC;
    }

    /**
     * Sets the value of the experianqas__Updated_Touchpoints_Timestamp__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExperianqas__Updated_Touchpoints_Timestamp__C(XMLGregorianCalendar value) {
        this.experianqasUpdatedTouchpointsTimestampC = value;
    }

    /**
     * Gets the value of the experianqas__Updated_Touchpoints__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperianqas__Updated_Touchpoints__C() {
        return experianqasUpdatedTouchpointsC;
    }

    /**
     * Sets the value of the experianqas__Updated_Touchpoints__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperianqas__Updated_Touchpoints__C(String value) {
        this.experianqasUpdatedTouchpointsC = value;
    }

}
