
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for LT_Asset__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LT_Asset__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Access_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account_Executive__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Account_Executive__r" type="{urn:sobject.enterprise.soap.sforce.com}OIR__c" minOccurs="0"/>
 *         &lt;element name="Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Account__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="ActivityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Additional_Team_Member_s__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Login_Password__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Password__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Username__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Appliance_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Approximate_Shipping_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Assessments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Asset_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Automated_Data_Sync__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CDRom_License_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Computer_Device__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Connections_License_Expiration__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Connections_Licenses_Short_Product_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Connections_Licenses__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Connections_Licenses__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Country__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County_Parish_Region__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Curriculum_Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Curriculum_Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="Customer_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date_Needed_by_Customer__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Date_Purchased__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Days_Delivered__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Days_Purchased__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Days_Until_Expiration__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Delivery_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="District_PD_Locations__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="District_School__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="District_School__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="End_Month_Year__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="End_Month__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="End_Year__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Events" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Field_Engineering_Installations__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Foundations_License_Expiration__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Foundations_Licenses_Short_Product_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Foundations_Licenses__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Foundations_Licenses__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Fulfillment__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HMH_to_Vendor_SAP_PO__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Home_Access_Available__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Initial_Contact_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Installation_Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Installation_Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="Internet_Licence_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="License_Expiration__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="License_Start__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Logistics_Coordinator__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Logistics_Coordinator__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_of_Connections_Licenses__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Number_of_Foundations_Licenses__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Number_of_Licenses__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Number_of_Reach_Licenses__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OIR_AE__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OIR_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OIR_Parent_Account__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OIR_Reseller__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OIR_Sales_Rep__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OIR__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="OIR__r" type="{urn:sobject.enterprise.soap.sforce.com}OIR__c" minOccurs="0"/>
 *         &lt;element name="OpenActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Other_URL_Login_Password__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PD_Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PD_Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="PD_Regional_Director__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PD_Regional_Director__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="PD_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Product_Expiration_End_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Product_Expiration_Start_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Product_Family__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Manager__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product_Manager__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="Product__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="Project_Manager__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Project_Manager__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="Quantity__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Reach_License_Expiration__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Reach_Licenses_Short_Product_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reach_Licenses__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Reach_Licenses__r" type="{urn:sobject.enterprise.soap.sforce.com}Product2" minOccurs="0"/>
 *         &lt;element name="RecordType" type="{urn:sobject.enterprise.soap.sforce.com}RecordType" minOccurs="0"/>
 *         &lt;element name="RecordTypeId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ST_SIEBEL_ASSETT__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Channel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Rep__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Sales_Rep__r" type="{urn:sobject.enterprise.soap.sforce.com}OIR__c" minOccurs="0"/>
 *         &lt;element name="Senior_Project_Manager__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Senior_Project_Manager__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="Serial__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shares" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Ship_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Short_Product_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site_Formula__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site_Login__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site_URL__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Software_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Special_Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Start_Year__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State_Province__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject_CDRom__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject_Internet__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subscr_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subscription_Length__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Support_Package_Expiration__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Tasks_to_be_Performed_by_Trainer__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Technical_Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Technical_Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="Technical_Obstacles__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Technical_Tasks_Completed__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Training_Days_Declined__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Training_Days_Delivered__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Training_Days_Expired__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Training_Days_Purchased__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Training_Days_Remaining__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Training_Days_Scheduled__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Training_Expiration_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Training_Room__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Training_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPS_Track__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL_to_be_used__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "LT_Asset__c", propOrder = {
    "accessCodeC",
    "accountExecutiveC",
    "accountExecutiveR",
    "accountC",
    "accountR",
    "activityHistories",
    "additionalTeamMemberSC",
    "addressC",
    "adminLoginPasswordC",
    "adminPasswordC",
    "adminUsernameC",
    "applianceTypeC",
    "approximateShippingDateC",
    "assessmentsC",
    "assetTypeC",
    "attachments",
    "automatedDataSyncC",
    "cdRomLicenseTypeC",
    "cityC",
    "commentsC",
    "computerDeviceC",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "connectionsLicenseExpirationC",
    "connectionsLicensesShortProductCodeC",
    "connectionsLicensesC",
    "connectionsLicensesR",
    "countryC",
    "countyParishRegionC",
    "createdBy",
    "createdById",
    "createdDate",
    "curriculumContactC",
    "curriculumContactR",
    "customerTypeC",
    "dateNeededByCustomerC",
    "datePurchasedC",
    "daysDeliveredC",
    "daysPurchasedC",
    "daysUntilExpirationC",
    "deliveryStatusC",
    "districtPDLocationsC",
    "districtSchoolC",
    "districtSchoolR",
    "endMonthYearC",
    "endMonthC",
    "endYearC",
    "events",
    "feedSubscriptionsForEntity",
    "fieldEngineeringInstallationsR",
    "foundationsLicenseExpirationC",
    "foundationsLicensesShortProductCodeC",
    "foundationsLicensesC",
    "foundationsLicensesR",
    "fulfillmentC",
    "hmhToVendorSAPPOC",
    "histories",
    "homeAccessAvailableC",
    "initialContactDateC",
    "installationContactC",
    "installationContactR",
    "internetLicenceTypeC",
    "isDeleted",
    "lastActivityDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "licenseExpirationC",
    "licenseStartC",
    "logisticsCoordinatorC",
    "logisticsCoordinatorR",
    "name",
    "notes",
    "notesAndAttachments",
    "notesC",
    "numberOfConnectionsLicensesC",
    "numberOfFoundationsLicensesC",
    "numberOfLicensesC",
    "numberOfReachLicensesC",
    "oirAEC",
    "oirIDC",
    "oirParentAccountC",
    "oirResellerC",
    "oirSalesRepC",
    "oirC",
    "oirR",
    "openActivities",
    "otherURLLoginPasswordC",
    "owner",
    "ownerId",
    "pdContactC",
    "pdContactR",
    "pdRegionalDirectorC",
    "pdRegionalDirectorR",
    "pdTypeC",
    "processInstances",
    "processSteps",
    "productExpirationEndDateC",
    "productExpirationStartDateC",
    "productFamilyC",
    "productManagerC",
    "productManagerR",
    "productC",
    "productR",
    "projectManagerC",
    "projectManagerR",
    "quantityC",
    "reachLicenseExpirationC",
    "reachLicensesShortProductCodeC",
    "reachLicensesC",
    "reachLicensesR",
    "recordType",
    "recordTypeId",
    "stSIEBELASSETTC",
    "salesChannelC",
    "salesRepC",
    "salesRepR",
    "seniorProjectManagerC",
    "seniorProjectManagerR",
    "serialC",
    "shares",
    "shipDateC",
    "shortProductCodeC",
    "siteFormulaC",
    "siteLoginC",
    "siteURLC",
    "softwareTypeC",
    "specialNotesC",
    "startYearC",
    "stateProvinceC",
    "subjectCDRomC",
    "subjectInternetC",
    "subscrTypeC",
    "subscriptionLengthC",
    "supportPackageExpirationC",
    "systemModstamp",
    "tasks",
    "tasksToBePerformedByTrainerC",
    "technicalContactC",
    "technicalContactR",
    "technicalObstaclesC",
    "technicalTasksCompletedC",
    "trainingDaysDeclinedC",
    "trainingDaysDeliveredC",
    "trainingDaysExpiredC",
    "trainingDaysPurchasedC",
    "trainingDaysRemainingC",
    "trainingDaysScheduledC",
    "trainingExpirationDateC",
    "trainingRoomC",
    "trainingStatusC",
    "upsTrackC",
    "urlToBeUsedC",
    "workstationLANLoginPasswordC",
    "workstationOSC",
    "zipC"
})
public class LT_Asset__CType
    extends SObjectType
{

    @XmlElement(name = "Access_Code__c", nillable = true)
    protected String accessCodeC;
    @XmlElement(name = "Account_Executive__c", nillable = true)
    protected String accountExecutiveC;
    @XmlElement(name = "Account_Executive__r", nillable = true)
    protected OIR__CType accountExecutiveR;
    @XmlElement(name = "Account__c", nillable = true)
    protected String accountC;
    @XmlElement(name = "Account__r", nillable = true)
    protected AccountType accountR;
    @XmlElement(name = "ActivityHistories", nillable = true)
    protected QueryResult activityHistories;
    @XmlElement(name = "Additional_Team_Member_s__c", nillable = true)
    protected String additionalTeamMemberSC;
    @XmlElement(name = "Address__c", nillable = true)
    protected String addressC;
    @XmlElement(name = "Admin_Login_Password__c", nillable = true)
    protected String adminLoginPasswordC;
    @XmlElement(name = "Admin_Password__c", nillable = true)
    protected String adminPasswordC;
    @XmlElement(name = "Admin_Username__c", nillable = true)
    protected String adminUsernameC;
    @XmlElement(name = "Appliance_Type__c", nillable = true)
    protected String applianceTypeC;
    @XmlElement(name = "Approximate_Shipping_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar approximateShippingDateC;
    @XmlElement(name = "Assessments__c", nillable = true)
    protected String assessmentsC;
    @XmlElement(name = "Asset_Type__c", nillable = true)
    protected String assetTypeC;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "Automated_Data_Sync__c", nillable = true)
    protected String automatedDataSyncC;
    @XmlElement(name = "CDRom_License_Type__c", nillable = true)
    protected String cdRomLicenseTypeC;
    @XmlElement(name = "City__c", nillable = true)
    protected String cityC;
    @XmlElement(name = "Comments__c", nillable = true)
    protected String commentsC;
    @XmlElement(name = "Computer_Device__c", nillable = true)
    protected String computerDeviceC;
    @XmlElement(name = "ConnectionReceived", nillable = true)
    protected PartnerNetworkConnectionType connectionReceived;
    @XmlElement(name = "ConnectionReceivedId", nillable = true)
    protected String connectionReceivedId;
    @XmlElement(name = "ConnectionSent", nillable = true)
    protected PartnerNetworkConnectionType connectionSent;
    @XmlElement(name = "ConnectionSentId", nillable = true)
    protected String connectionSentId;
    @XmlElement(name = "Connections_License_Expiration__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar connectionsLicenseExpirationC;
    @XmlElement(name = "Connections_Licenses_Short_Product_Code__c", nillable = true)
    protected String connectionsLicensesShortProductCodeC;
    @XmlElement(name = "Connections_Licenses__c", nillable = true)
    protected String connectionsLicensesC;
    @XmlElement(name = "Connections_Licenses__r", nillable = true)
    protected Product2Type connectionsLicensesR;
    @XmlElement(name = "Country__c", nillable = true)
    protected String countryC;
    @XmlElement(name = "County_Parish_Region__c", nillable = true)
    protected String countyParishRegionC;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Curriculum_Contact__c", nillable = true)
    protected String curriculumContactC;
    @XmlElement(name = "Curriculum_Contact__r", nillable = true)
    protected ContactType curriculumContactR;
    @XmlElement(name = "Customer_Type__c", nillable = true)
    protected String customerTypeC;
    @XmlElement(name = "Date_Needed_by_Customer__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateNeededByCustomerC;
    @XmlElement(name = "Date_Purchased__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datePurchasedC;
    @XmlElement(name = "Days_Delivered__c", nillable = true)
    protected Double daysDeliveredC;
    @XmlElement(name = "Days_Purchased__c", nillable = true)
    protected Double daysPurchasedC;
    @XmlElement(name = "Days_Until_Expiration__c", nillable = true)
    protected Double daysUntilExpirationC;
    @XmlElement(name = "Delivery_Status__c", nillable = true)
    protected String deliveryStatusC;
    @XmlElement(name = "District_PD_Locations__c", nillable = true)
    protected String districtPDLocationsC;
    @XmlElement(name = "District_School__c", nillable = true)
    protected String districtSchoolC;
    @XmlElement(name = "District_School__r", nillable = true)
    protected AccountType districtSchoolR;
    @XmlElement(name = "End_Month_Year__c", nillable = true)
    protected String endMonthYearC;
    @XmlElement(name = "End_Month__c", nillable = true)
    protected Double endMonthC;
    @XmlElement(name = "End_Year__c", nillable = true)
    protected String endYearC;
    @XmlElement(name = "Events", nillable = true)
    protected QueryResult events;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "Field_Engineering_Installations__r", nillable = true)
    protected QueryResult fieldEngineeringInstallationsR;
    @XmlElement(name = "Foundations_License_Expiration__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar foundationsLicenseExpirationC;
    @XmlElement(name = "Foundations_Licenses_Short_Product_Code__c", nillable = true)
    protected String foundationsLicensesShortProductCodeC;
    @XmlElement(name = "Foundations_Licenses__c", nillable = true)
    protected String foundationsLicensesC;
    @XmlElement(name = "Foundations_Licenses__r", nillable = true)
    protected Product2Type foundationsLicensesR;
    @XmlElement(name = "Fulfillment__c", nillable = true)
    protected String fulfillmentC;
    @XmlElement(name = "HMH_to_Vendor_SAP_PO__c", nillable = true)
    protected String hmhToVendorSAPPOC;
    @XmlElement(name = "Histories", nillable = true)
    protected QueryResult histories;
    @XmlElement(name = "Home_Access_Available__c", nillable = true)
    protected String homeAccessAvailableC;
    @XmlElement(name = "Initial_Contact_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar initialContactDateC;
    @XmlElement(name = "Installation_Contact__c", nillable = true)
    protected String installationContactC;
    @XmlElement(name = "Installation_Contact__r", nillable = true)
    protected ContactType installationContactR;
    @XmlElement(name = "Internet_Licence_Type__c", nillable = true)
    protected String internetLicenceTypeC;
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
    @XmlElement(name = "License_Expiration__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar licenseExpirationC;
    @XmlElement(name = "License_Start__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar licenseStartC;
    @XmlElement(name = "Logistics_Coordinator__c", nillable = true)
    protected String logisticsCoordinatorC;
    @XmlElement(name = "Logistics_Coordinator__r", nillable = true)
    protected UserType logisticsCoordinatorR;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "Notes__c", nillable = true)
    protected String notesC;
    @XmlElement(name = "Number_of_Connections_Licenses__c", nillable = true)
    protected Double numberOfConnectionsLicensesC;
    @XmlElement(name = "Number_of_Foundations_Licenses__c", nillable = true)
    protected Double numberOfFoundationsLicensesC;
    @XmlElement(name = "Number_of_Licenses__c", nillable = true)
    protected Double numberOfLicensesC;
    @XmlElement(name = "Number_of_Reach_Licenses__c", nillable = true)
    protected Double numberOfReachLicensesC;
    @XmlElement(name = "OIR_AE__c", nillable = true)
    protected String oirAEC;
    @XmlElement(name = "OIR_ID__c", nillable = true)
    protected String oirIDC;
    @XmlElement(name = "OIR_Parent_Account__c", nillable = true)
    protected String oirParentAccountC;
    @XmlElement(name = "OIR_Reseller__c", nillable = true)
    protected String oirResellerC;
    @XmlElement(name = "OIR_Sales_Rep__c", nillable = true)
    protected String oirSalesRepC;
    @XmlElement(name = "OIR__c", nillable = true)
    protected String oirC;
    @XmlElement(name = "OIR__r", nillable = true)
    protected OIR__CType oirR;
    @XmlElement(name = "OpenActivities", nillable = true)
    protected QueryResult openActivities;
    @XmlElement(name = "Other_URL_Login_Password__c", nillable = true)
    protected String otherURLLoginPasswordC;
    @XmlElement(name = "Owner", nillable = true)
    protected NameType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "PD_Contact__c", nillable = true)
    protected String pdContactC;
    @XmlElement(name = "PD_Contact__r", nillable = true)
    protected ContactType pdContactR;
    @XmlElement(name = "PD_Regional_Director__c", nillable = true)
    protected String pdRegionalDirectorC;
    @XmlElement(name = "PD_Regional_Director__r", nillable = true)
    protected UserType pdRegionalDirectorR;
    @XmlElement(name = "PD_Type__c", nillable = true)
    protected String pdTypeC;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "Product_Expiration_End_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar productExpirationEndDateC;
    @XmlElement(name = "Product_Expiration_Start_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar productExpirationStartDateC;
    @XmlElement(name = "Product_Family__c", nillable = true)
    protected String productFamilyC;
    @XmlElement(name = "Product_Manager__c", nillable = true)
    protected String productManagerC;
    @XmlElement(name = "Product_Manager__r", nillable = true)
    protected UserType productManagerR;
    @XmlElement(name = "Product__c", nillable = true)
    protected String productC;
    @XmlElement(name = "Product__r", nillable = true)
    protected Product2Type productR;
    @XmlElement(name = "Project_Manager__c", nillable = true)
    protected String projectManagerC;
    @XmlElement(name = "Project_Manager__r", nillable = true)
    protected UserType projectManagerR;
    @XmlElement(name = "Quantity__c", nillable = true)
    protected Double quantityC;
    @XmlElement(name = "Reach_License_Expiration__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reachLicenseExpirationC;
    @XmlElement(name = "Reach_Licenses_Short_Product_Code__c", nillable = true)
    protected String reachLicensesShortProductCodeC;
    @XmlElement(name = "Reach_Licenses__c", nillable = true)
    protected String reachLicensesC;
    @XmlElement(name = "Reach_Licenses__r", nillable = true)
    protected Product2Type reachLicensesR;
    @XmlElement(name = "RecordType", nillable = true)
    protected RecordTypeType recordType;
    @XmlElement(name = "RecordTypeId", nillable = true)
    protected String recordTypeId;
    @XmlElement(name = "ST_SIEBEL_ASSETT__c", nillable = true)
    protected String stSIEBELASSETTC;
    @XmlElement(name = "Sales_Channel__c", nillable = true)
    protected String salesChannelC;
    @XmlElement(name = "Sales_Rep__c", nillable = true)
    protected String salesRepC;
    @XmlElement(name = "Sales_Rep__r", nillable = true)
    protected OIR__CType salesRepR;
    @XmlElement(name = "Senior_Project_Manager__c", nillable = true)
    protected String seniorProjectManagerC;
    @XmlElement(name = "Senior_Project_Manager__r", nillable = true)
    protected UserType seniorProjectManagerR;
    @XmlElement(name = "Serial__c", nillable = true)
    protected String serialC;
    @XmlElement(name = "Shares", nillable = true)
    protected QueryResult shares;
    @XmlElement(name = "Ship_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDateC;
    @XmlElement(name = "Short_Product_Code__c", nillable = true)
    protected String shortProductCodeC;
    @XmlElement(name = "Site_Formula__c", nillable = true)
    protected String siteFormulaC;
    @XmlElement(name = "Site_Login__c", nillable = true)
    protected String siteLoginC;
    @XmlElement(name = "Site_URL__c", nillable = true)
    protected String siteURLC;
    @XmlElement(name = "Software_Type__c", nillable = true)
    protected String softwareTypeC;
    @XmlElement(name = "Special_Notes__c", nillable = true)
    protected String specialNotesC;
    @XmlElement(name = "Start_Year__c", nillable = true)
    protected String startYearC;
    @XmlElement(name = "State_Province__c", nillable = true)
    protected String stateProvinceC;
    @XmlElement(name = "Subject_CDRom__c", nillable = true)
    protected String subjectCDRomC;
    @XmlElement(name = "Subject_Internet__c", nillable = true)
    protected String subjectInternetC;
    @XmlElement(name = "Subscr_Type__c", nillable = true)
    protected String subscrTypeC;
    @XmlElement(name = "Subscription_Length__c", nillable = true)
    protected Double subscriptionLengthC;
    @XmlElement(name = "Support_Package_Expiration__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar supportPackageExpirationC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Tasks", nillable = true)
    protected QueryResult tasks;
    @XmlElement(name = "Tasks_to_be_Performed_by_Trainer__c", nillable = true)
    protected String tasksToBePerformedByTrainerC;
    @XmlElement(name = "Technical_Contact__c", nillable = true)
    protected String technicalContactC;
    @XmlElement(name = "Technical_Contact__r", nillable = true)
    protected ContactType technicalContactR;
    @XmlElement(name = "Technical_Obstacles__c", nillable = true)
    protected String technicalObstaclesC;
    @XmlElement(name = "Technical_Tasks_Completed__c", nillable = true)
    protected String technicalTasksCompletedC;
    @XmlElement(name = "Training_Days_Declined__c", nillable = true)
    protected Double trainingDaysDeclinedC;
    @XmlElement(name = "Training_Days_Delivered__c", nillable = true)
    protected Double trainingDaysDeliveredC;
    @XmlElement(name = "Training_Days_Expired__c", nillable = true)
    protected Double trainingDaysExpiredC;
    @XmlElement(name = "Training_Days_Purchased__c", nillable = true)
    protected Double trainingDaysPurchasedC;
    @XmlElement(name = "Training_Days_Remaining__c", nillable = true)
    protected Double trainingDaysRemainingC;
    @XmlElement(name = "Training_Days_Scheduled__c", nillable = true)
    protected Double trainingDaysScheduledC;
    @XmlElement(name = "Training_Expiration_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trainingExpirationDateC;
    @XmlElement(name = "Training_Room__c", nillable = true)
    protected String trainingRoomC;
    @XmlElement(name = "Training_Status__c", nillable = true)
    protected String trainingStatusC;
    @XmlElement(name = "UPS_Track__c", nillable = true)
    protected String upsTrackC;
    @XmlElement(name = "URL_to_be_used__c", nillable = true)
    protected String urlToBeUsedC;
    @XmlElement(name = "Workstation_LAN_Login_Password__c", nillable = true)
    protected String workstationLANLoginPasswordC;
    @XmlElement(name = "Workstation_OS__c", nillable = true)
    protected String workstationOSC;
    @XmlElement(name = "Zip__c", nillable = true)
    protected String zipC;

    /**
     * Gets the value of the access_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccess_Code__C() {
        return accessCodeC;
    }

    /**
     * Sets the value of the access_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccess_Code__C(String value) {
        this.accessCodeC = value;
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
     * Gets the value of the account_Executive__R property.
     * 
     * @return
     *     possible object is
     *     {@link OIR__CType }
     *     
     */
    public OIR__CType getAccount_Executive__R() {
        return accountExecutiveR;
    }

    /**
     * Sets the value of the account_Executive__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link OIR__CType }
     *     
     */
    public void setAccount_Executive__R(OIR__CType value) {
        this.accountExecutiveR = value;
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
     * Gets the value of the admin_Username__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmin_Username__C() {
        return adminUsernameC;
    }

    /**
     * Sets the value of the admin_Username__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmin_Username__C(String value) {
        this.adminUsernameC = value;
    }

    /**
     * Gets the value of the appliance_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliance_Type__C() {
        return applianceTypeC;
    }

    /**
     * Sets the value of the appliance_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliance_Type__C(String value) {
        this.applianceTypeC = value;
    }

    /**
     * Gets the value of the approximate_Shipping_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApproximate_Shipping_Date__C() {
        return approximateShippingDateC;
    }

    /**
     * Sets the value of the approximate_Shipping_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApproximate_Shipping_Date__C(XMLGregorianCalendar value) {
        this.approximateShippingDateC = value;
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
     * Gets the value of the asset_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsset_Type__C() {
        return assetTypeC;
    }

    /**
     * Sets the value of the asset_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsset_Type__C(String value) {
        this.assetTypeC = value;
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
     * Gets the value of the cdRom_License_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDRom_License_Type__C() {
        return cdRomLicenseTypeC;
    }

    /**
     * Sets the value of the cdRom_License_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDRom_License_Type__C(String value) {
        this.cdRomLicenseTypeC = value;
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
     * Gets the value of the computer_Device__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComputer_Device__C() {
        return computerDeviceC;
    }

    /**
     * Sets the value of the computer_Device__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComputer_Device__C(String value) {
        this.computerDeviceC = value;
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
     * Gets the value of the connections_License_Expiration__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConnections_License_Expiration__C() {
        return connectionsLicenseExpirationC;
    }

    /**
     * Sets the value of the connections_License_Expiration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConnections_License_Expiration__C(XMLGregorianCalendar value) {
        this.connectionsLicenseExpirationC = value;
    }

    /**
     * Gets the value of the connections_Licenses_Short_Product_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnections_Licenses_Short_Product_Code__C() {
        return connectionsLicensesShortProductCodeC;
    }

    /**
     * Sets the value of the connections_Licenses_Short_Product_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnections_Licenses_Short_Product_Code__C(String value) {
        this.connectionsLicensesShortProductCodeC = value;
    }

    /**
     * Gets the value of the connections_Licenses__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnections_Licenses__C() {
        return connectionsLicensesC;
    }

    /**
     * Sets the value of the connections_Licenses__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnections_Licenses__C(String value) {
        this.connectionsLicensesC = value;
    }

    /**
     * Gets the value of the connections_Licenses__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getConnections_Licenses__R() {
        return connectionsLicensesR;
    }

    /**
     * Sets the value of the connections_Licenses__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setConnections_Licenses__R(Product2Type value) {
        this.connectionsLicensesR = value;
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
     * Gets the value of the curriculum_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurriculum_Contact__C() {
        return curriculumContactC;
    }

    /**
     * Sets the value of the curriculum_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurriculum_Contact__C(String value) {
        this.curriculumContactC = value;
    }

    /**
     * Gets the value of the curriculum_Contact__R property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getCurriculum_Contact__R() {
        return curriculumContactR;
    }

    /**
     * Sets the value of the curriculum_Contact__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setCurriculum_Contact__R(ContactType value) {
        this.curriculumContactR = value;
    }

    /**
     * Gets the value of the customer_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Type__C() {
        return customerTypeC;
    }

    /**
     * Sets the value of the customer_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Type__C(String value) {
        this.customerTypeC = value;
    }

    /**
     * Gets the value of the date_Needed_By_Customer__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate_Needed_By_Customer__C() {
        return dateNeededByCustomerC;
    }

    /**
     * Sets the value of the date_Needed_By_Customer__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate_Needed_By_Customer__C(XMLGregorianCalendar value) {
        this.dateNeededByCustomerC = value;
    }

    /**
     * Gets the value of the date_Purchased__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate_Purchased__C() {
        return datePurchasedC;
    }

    /**
     * Sets the value of the date_Purchased__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate_Purchased__C(XMLGregorianCalendar value) {
        this.datePurchasedC = value;
    }

    /**
     * Gets the value of the days_Delivered__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDays_Delivered__C() {
        return daysDeliveredC;
    }

    /**
     * Sets the value of the days_Delivered__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDays_Delivered__C(Double value) {
        this.daysDeliveredC = value;
    }

    /**
     * Gets the value of the days_Purchased__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDays_Purchased__C() {
        return daysPurchasedC;
    }

    /**
     * Sets the value of the days_Purchased__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDays_Purchased__C(Double value) {
        this.daysPurchasedC = value;
    }

    /**
     * Gets the value of the days_Until_Expiration__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDays_Until_Expiration__C() {
        return daysUntilExpirationC;
    }

    /**
     * Sets the value of the days_Until_Expiration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDays_Until_Expiration__C(Double value) {
        this.daysUntilExpirationC = value;
    }

    /**
     * Gets the value of the delivery_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelivery_Status__C() {
        return deliveryStatusC;
    }

    /**
     * Sets the value of the delivery_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelivery_Status__C(String value) {
        this.deliveryStatusC = value;
    }

    /**
     * Gets the value of the district_PD_Locations__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict_PD_Locations__C() {
        return districtPDLocationsC;
    }

    /**
     * Sets the value of the district_PD_Locations__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict_PD_Locations__C(String value) {
        this.districtPDLocationsC = value;
    }

    /**
     * Gets the value of the district_School__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict_School__C() {
        return districtSchoolC;
    }

    /**
     * Sets the value of the district_School__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict_School__C(String value) {
        this.districtSchoolC = value;
    }

    /**
     * Gets the value of the district_School__R property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getDistrict_School__R() {
        return districtSchoolR;
    }

    /**
     * Sets the value of the district_School__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setDistrict_School__R(AccountType value) {
        this.districtSchoolR = value;
    }

    /**
     * Gets the value of the end_Month_Year__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd_Month_Year__C() {
        return endMonthYearC;
    }

    /**
     * Sets the value of the end_Month_Year__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd_Month_Year__C(String value) {
        this.endMonthYearC = value;
    }

    /**
     * Gets the value of the end_Month__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEnd_Month__C() {
        return endMonthC;
    }

    /**
     * Sets the value of the end_Month__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEnd_Month__C(Double value) {
        this.endMonthC = value;
    }

    /**
     * Gets the value of the end_Year__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd_Year__C() {
        return endYearC;
    }

    /**
     * Sets the value of the end_Year__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd_Year__C(String value) {
        this.endYearC = value;
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
     * Gets the value of the field_Engineering_Installations__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getField_Engineering_Installations__R() {
        return fieldEngineeringInstallationsR;
    }

    /**
     * Sets the value of the field_Engineering_Installations__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setField_Engineering_Installations__R(QueryResult value) {
        this.fieldEngineeringInstallationsR = value;
    }

    /**
     * Gets the value of the foundations_License_Expiration__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFoundations_License_Expiration__C() {
        return foundationsLicenseExpirationC;
    }

    /**
     * Sets the value of the foundations_License_Expiration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFoundations_License_Expiration__C(XMLGregorianCalendar value) {
        this.foundationsLicenseExpirationC = value;
    }

    /**
     * Gets the value of the foundations_Licenses_Short_Product_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoundations_Licenses_Short_Product_Code__C() {
        return foundationsLicensesShortProductCodeC;
    }

    /**
     * Sets the value of the foundations_Licenses_Short_Product_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundations_Licenses_Short_Product_Code__C(String value) {
        this.foundationsLicensesShortProductCodeC = value;
    }

    /**
     * Gets the value of the foundations_Licenses__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoundations_Licenses__C() {
        return foundationsLicensesC;
    }

    /**
     * Sets the value of the foundations_Licenses__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundations_Licenses__C(String value) {
        this.foundationsLicensesC = value;
    }

    /**
     * Gets the value of the foundations_Licenses__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getFoundations_Licenses__R() {
        return foundationsLicensesR;
    }

    /**
     * Sets the value of the foundations_Licenses__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setFoundations_Licenses__R(Product2Type value) {
        this.foundationsLicensesR = value;
    }

    /**
     * Gets the value of the fulfillment__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillment__C() {
        return fulfillmentC;
    }

    /**
     * Sets the value of the fulfillment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillment__C(String value) {
        this.fulfillmentC = value;
    }

    /**
     * Gets the value of the hmh_To_Vendor_SAP_PO__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHMH_To_Vendor_SAP_PO__C() {
        return hmhToVendorSAPPOC;
    }

    /**
     * Sets the value of the hmh_To_Vendor_SAP_PO__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHMH_To_Vendor_SAP_PO__C(String value) {
        this.hmhToVendorSAPPOC = value;
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
     * Gets the value of the installation_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallation_Contact__C() {
        return installationContactC;
    }

    /**
     * Sets the value of the installation_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallation_Contact__C(String value) {
        this.installationContactC = value;
    }

    /**
     * Gets the value of the installation_Contact__R property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getInstallation_Contact__R() {
        return installationContactR;
    }

    /**
     * Sets the value of the installation_Contact__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setInstallation_Contact__R(ContactType value) {
        this.installationContactR = value;
    }

    /**
     * Gets the value of the internet_Licence_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternet_Licence_Type__C() {
        return internetLicenceTypeC;
    }

    /**
     * Sets the value of the internet_Licence_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternet_Licence_Type__C(String value) {
        this.internetLicenceTypeC = value;
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
     * Gets the value of the license_Expiration__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLicense_Expiration__C() {
        return licenseExpirationC;
    }

    /**
     * Sets the value of the license_Expiration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLicense_Expiration__C(XMLGregorianCalendar value) {
        this.licenseExpirationC = value;
    }

    /**
     * Gets the value of the license_Start__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLicense_Start__C() {
        return licenseStartC;
    }

    /**
     * Sets the value of the license_Start__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLicense_Start__C(XMLGregorianCalendar value) {
        this.licenseStartC = value;
    }

    /**
     * Gets the value of the logistics_Coordinator__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogistics_Coordinator__C() {
        return logisticsCoordinatorC;
    }

    /**
     * Sets the value of the logistics_Coordinator__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogistics_Coordinator__C(String value) {
        this.logisticsCoordinatorC = value;
    }

    /**
     * Gets the value of the logistics_Coordinator__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getLogistics_Coordinator__R() {
        return logisticsCoordinatorR;
    }

    /**
     * Sets the value of the logistics_Coordinator__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setLogistics_Coordinator__R(UserType value) {
        this.logisticsCoordinatorR = value;
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
     * Gets the value of the number_Of_Connections_Licenses__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumber_Of_Connections_Licenses__C() {
        return numberOfConnectionsLicensesC;
    }

    /**
     * Sets the value of the number_Of_Connections_Licenses__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumber_Of_Connections_Licenses__C(Double value) {
        this.numberOfConnectionsLicensesC = value;
    }

    /**
     * Gets the value of the number_Of_Foundations_Licenses__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumber_Of_Foundations_Licenses__C() {
        return numberOfFoundationsLicensesC;
    }

    /**
     * Sets the value of the number_Of_Foundations_Licenses__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumber_Of_Foundations_Licenses__C(Double value) {
        this.numberOfFoundationsLicensesC = value;
    }

    /**
     * Gets the value of the number_Of_Licenses__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumber_Of_Licenses__C() {
        return numberOfLicensesC;
    }

    /**
     * Sets the value of the number_Of_Licenses__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumber_Of_Licenses__C(Double value) {
        this.numberOfLicensesC = value;
    }

    /**
     * Gets the value of the number_Of_Reach_Licenses__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumber_Of_Reach_Licenses__C() {
        return numberOfReachLicensesC;
    }

    /**
     * Sets the value of the number_Of_Reach_Licenses__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumber_Of_Reach_Licenses__C(Double value) {
        this.numberOfReachLicensesC = value;
    }

    /**
     * Gets the value of the oir_AE__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOIR_AE__C() {
        return oirAEC;
    }

    /**
     * Sets the value of the oir_AE__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOIR_AE__C(String value) {
        this.oirAEC = value;
    }

    /**
     * Gets the value of the oir_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOIR_ID__C() {
        return oirIDC;
    }

    /**
     * Sets the value of the oir_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOIR_ID__C(String value) {
        this.oirIDC = value;
    }

    /**
     * Gets the value of the oir_Parent_Account__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOIR_Parent_Account__C() {
        return oirParentAccountC;
    }

    /**
     * Sets the value of the oir_Parent_Account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOIR_Parent_Account__C(String value) {
        this.oirParentAccountC = value;
    }

    /**
     * Gets the value of the oir_Reseller__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOIR_Reseller__C() {
        return oirResellerC;
    }

    /**
     * Sets the value of the oir_Reseller__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOIR_Reseller__C(String value) {
        this.oirResellerC = value;
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
     * Gets the value of the oir__R property.
     * 
     * @return
     *     possible object is
     *     {@link OIR__CType }
     *     
     */
    public OIR__CType getOIR__R() {
        return oirR;
    }

    /**
     * Sets the value of the oir__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link OIR__CType }
     *     
     */
    public void setOIR__R(OIR__CType value) {
        this.oirR = value;
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
     * Gets the value of the pd_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD_Contact__C() {
        return pdContactC;
    }

    /**
     * Sets the value of the pd_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD_Contact__C(String value) {
        this.pdContactC = value;
    }

    /**
     * Gets the value of the pd_Contact__R property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getPD_Contact__R() {
        return pdContactR;
    }

    /**
     * Sets the value of the pd_Contact__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setPD_Contact__R(ContactType value) {
        this.pdContactR = value;
    }

    /**
     * Gets the value of the pd_Regional_Director__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD_Regional_Director__C() {
        return pdRegionalDirectorC;
    }

    /**
     * Sets the value of the pd_Regional_Director__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD_Regional_Director__C(String value) {
        this.pdRegionalDirectorC = value;
    }

    /**
     * Gets the value of the pd_Regional_Director__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getPD_Regional_Director__R() {
        return pdRegionalDirectorR;
    }

    /**
     * Sets the value of the pd_Regional_Director__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setPD_Regional_Director__R(UserType value) {
        this.pdRegionalDirectorR = value;
    }

    /**
     * Gets the value of the pd_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD_Type__C() {
        return pdTypeC;
    }

    /**
     * Sets the value of the pd_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD_Type__C(String value) {
        this.pdTypeC = value;
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
     * Gets the value of the product_Expiration_End_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProduct_Expiration_End_Date__C() {
        return productExpirationEndDateC;
    }

    /**
     * Sets the value of the product_Expiration_End_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProduct_Expiration_End_Date__C(XMLGregorianCalendar value) {
        this.productExpirationEndDateC = value;
    }

    /**
     * Gets the value of the product_Expiration_Start_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProduct_Expiration_Start_Date__C() {
        return productExpirationStartDateC;
    }

    /**
     * Sets the value of the product_Expiration_Start_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProduct_Expiration_Start_Date__C(XMLGregorianCalendar value) {
        this.productExpirationStartDateC = value;
    }

    /**
     * Gets the value of the product_Family__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct_Family__C() {
        return productFamilyC;
    }

    /**
     * Sets the value of the product_Family__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct_Family__C(String value) {
        this.productFamilyC = value;
    }

    /**
     * Gets the value of the product_Manager__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct_Manager__C() {
        return productManagerC;
    }

    /**
     * Sets the value of the product_Manager__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct_Manager__C(String value) {
        this.productManagerC = value;
    }

    /**
     * Gets the value of the product_Manager__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getProduct_Manager__R() {
        return productManagerR;
    }

    /**
     * Sets the value of the product_Manager__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setProduct_Manager__R(UserType value) {
        this.productManagerR = value;
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
     * Gets the value of the product__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getProduct__R() {
        return productR;
    }

    /**
     * Sets the value of the product__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setProduct__R(Product2Type value) {
        this.productR = value;
    }

    /**
     * Gets the value of the project_Manager__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProject_Manager__C() {
        return projectManagerC;
    }

    /**
     * Sets the value of the project_Manager__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProject_Manager__C(String value) {
        this.projectManagerC = value;
    }

    /**
     * Gets the value of the project_Manager__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getProject_Manager__R() {
        return projectManagerR;
    }

    /**
     * Sets the value of the project_Manager__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setProject_Manager__R(UserType value) {
        this.projectManagerR = value;
    }

    /**
     * Gets the value of the quantity__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity__C() {
        return quantityC;
    }

    /**
     * Sets the value of the quantity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity__C(Double value) {
        this.quantityC = value;
    }

    /**
     * Gets the value of the reach_License_Expiration__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReach_License_Expiration__C() {
        return reachLicenseExpirationC;
    }

    /**
     * Sets the value of the reach_License_Expiration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReach_License_Expiration__C(XMLGregorianCalendar value) {
        this.reachLicenseExpirationC = value;
    }

    /**
     * Gets the value of the reach_Licenses_Short_Product_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReach_Licenses_Short_Product_Code__C() {
        return reachLicensesShortProductCodeC;
    }

    /**
     * Sets the value of the reach_Licenses_Short_Product_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReach_Licenses_Short_Product_Code__C(String value) {
        this.reachLicensesShortProductCodeC = value;
    }

    /**
     * Gets the value of the reach_Licenses__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReach_Licenses__C() {
        return reachLicensesC;
    }

    /**
     * Sets the value of the reach_Licenses__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReach_Licenses__C(String value) {
        this.reachLicensesC = value;
    }

    /**
     * Gets the value of the reach_Licenses__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product2Type }
     *     
     */
    public Product2Type getReach_Licenses__R() {
        return reachLicensesR;
    }

    /**
     * Sets the value of the reach_Licenses__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product2Type }
     *     
     */
    public void setReach_Licenses__R(Product2Type value) {
        this.reachLicensesR = value;
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
     * Gets the value of the st_SIEBEL_ASSETT__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getST_SIEBEL_ASSETT__C() {
        return stSIEBELASSETTC;
    }

    /**
     * Sets the value of the st_SIEBEL_ASSETT__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setST_SIEBEL_ASSETT__C(String value) {
        this.stSIEBELASSETTC = value;
    }

    /**
     * Gets the value of the sales_Channel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Channel__C() {
        return salesChannelC;
    }

    /**
     * Sets the value of the sales_Channel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Channel__C(String value) {
        this.salesChannelC = value;
    }

    /**
     * Gets the value of the sales_Rep__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Rep__C() {
        return salesRepC;
    }

    /**
     * Sets the value of the sales_Rep__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Rep__C(String value) {
        this.salesRepC = value;
    }

    /**
     * Gets the value of the sales_Rep__R property.
     * 
     * @return
     *     possible object is
     *     {@link OIR__CType }
     *     
     */
    public OIR__CType getSales_Rep__R() {
        return salesRepR;
    }

    /**
     * Sets the value of the sales_Rep__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link OIR__CType }
     *     
     */
    public void setSales_Rep__R(OIR__CType value) {
        this.salesRepR = value;
    }

    /**
     * Gets the value of the senior_Project_Manager__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenior_Project_Manager__C() {
        return seniorProjectManagerC;
    }

    /**
     * Sets the value of the senior_Project_Manager__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenior_Project_Manager__C(String value) {
        this.seniorProjectManagerC = value;
    }

    /**
     * Gets the value of the senior_Project_Manager__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getSenior_Project_Manager__R() {
        return seniorProjectManagerR;
    }

    /**
     * Sets the value of the senior_Project_Manager__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setSenior_Project_Manager__R(UserType value) {
        this.seniorProjectManagerR = value;
    }

    /**
     * Gets the value of the serial__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerial__C() {
        return serialC;
    }

    /**
     * Sets the value of the serial__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerial__C(String value) {
        this.serialC = value;
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
     * Gets the value of the ship_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShip_Date__C() {
        return shipDateC;
    }

    /**
     * Sets the value of the ship_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShip_Date__C(XMLGregorianCalendar value) {
        this.shipDateC = value;
    }

    /**
     * Gets the value of the short_Product_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShort_Product_Code__C() {
        return shortProductCodeC;
    }

    /**
     * Sets the value of the short_Product_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShort_Product_Code__C(String value) {
        this.shortProductCodeC = value;
    }

    /**
     * Gets the value of the site_Formula__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite_Formula__C() {
        return siteFormulaC;
    }

    /**
     * Sets the value of the site_Formula__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite_Formula__C(String value) {
        this.siteFormulaC = value;
    }

    /**
     * Gets the value of the site_Login__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite_Login__C() {
        return siteLoginC;
    }

    /**
     * Sets the value of the site_Login__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite_Login__C(String value) {
        this.siteLoginC = value;
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
     * Gets the value of the software_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftware_Type__C() {
        return softwareTypeC;
    }

    /**
     * Sets the value of the software_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftware_Type__C(String value) {
        this.softwareTypeC = value;
    }

    /**
     * Gets the value of the special_Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecial_Notes__C() {
        return specialNotesC;
    }

    /**
     * Sets the value of the special_Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecial_Notes__C(String value) {
        this.specialNotesC = value;
    }

    /**
     * Gets the value of the start_Year__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart_Year__C() {
        return startYearC;
    }

    /**
     * Sets the value of the start_Year__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart_Year__C(String value) {
        this.startYearC = value;
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
     * Gets the value of the subject_CDRom__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject_CDRom__C() {
        return subjectCDRomC;
    }

    /**
     * Sets the value of the subject_CDRom__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject_CDRom__C(String value) {
        this.subjectCDRomC = value;
    }

    /**
     * Gets the value of the subject_Internet__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject_Internet__C() {
        return subjectInternetC;
    }

    /**
     * Sets the value of the subject_Internet__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject_Internet__C(String value) {
        this.subjectInternetC = value;
    }

    /**
     * Gets the value of the subscr_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscr_Type__C() {
        return subscrTypeC;
    }

    /**
     * Sets the value of the subscr_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscr_Type__C(String value) {
        this.subscrTypeC = value;
    }

    /**
     * Gets the value of the subscription_Length__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubscription_Length__C() {
        return subscriptionLengthC;
    }

    /**
     * Sets the value of the subscription_Length__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubscription_Length__C(Double value) {
        this.subscriptionLengthC = value;
    }

    /**
     * Gets the value of the support_Package_Expiration__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSupport_Package_Expiration__C() {
        return supportPackageExpirationC;
    }

    /**
     * Sets the value of the support_Package_Expiration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSupport_Package_Expiration__C(XMLGregorianCalendar value) {
        this.supportPackageExpirationC = value;
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
     * Gets the value of the technical_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnical_Contact__C() {
        return technicalContactC;
    }

    /**
     * Sets the value of the technical_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnical_Contact__C(String value) {
        this.technicalContactC = value;
    }

    /**
     * Gets the value of the technical_Contact__R property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getTechnical_Contact__R() {
        return technicalContactR;
    }

    /**
     * Sets the value of the technical_Contact__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setTechnical_Contact__R(ContactType value) {
        this.technicalContactR = value;
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
     * Gets the value of the training_Days_Declined__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTraining_Days_Declined__C() {
        return trainingDaysDeclinedC;
    }

    /**
     * Sets the value of the training_Days_Declined__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTraining_Days_Declined__C(Double value) {
        this.trainingDaysDeclinedC = value;
    }

    /**
     * Gets the value of the training_Days_Delivered__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTraining_Days_Delivered__C() {
        return trainingDaysDeliveredC;
    }

    /**
     * Sets the value of the training_Days_Delivered__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTraining_Days_Delivered__C(Double value) {
        this.trainingDaysDeliveredC = value;
    }

    /**
     * Gets the value of the training_Days_Expired__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTraining_Days_Expired__C() {
        return trainingDaysExpiredC;
    }

    /**
     * Sets the value of the training_Days_Expired__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTraining_Days_Expired__C(Double value) {
        this.trainingDaysExpiredC = value;
    }

    /**
     * Gets the value of the training_Days_Purchased__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTraining_Days_Purchased__C() {
        return trainingDaysPurchasedC;
    }

    /**
     * Sets the value of the training_Days_Purchased__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTraining_Days_Purchased__C(Double value) {
        this.trainingDaysPurchasedC = value;
    }

    /**
     * Gets the value of the training_Days_Remaining__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTraining_Days_Remaining__C() {
        return trainingDaysRemainingC;
    }

    /**
     * Sets the value of the training_Days_Remaining__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTraining_Days_Remaining__C(Double value) {
        this.trainingDaysRemainingC = value;
    }

    /**
     * Gets the value of the training_Days_Scheduled__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTraining_Days_Scheduled__C() {
        return trainingDaysScheduledC;
    }

    /**
     * Sets the value of the training_Days_Scheduled__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTraining_Days_Scheduled__C(Double value) {
        this.trainingDaysScheduledC = value;
    }

    /**
     * Gets the value of the training_Expiration_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTraining_Expiration_Date__C() {
        return trainingExpirationDateC;
    }

    /**
     * Sets the value of the training_Expiration_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTraining_Expiration_Date__C(XMLGregorianCalendar value) {
        this.trainingExpirationDateC = value;
    }

    /**
     * Gets the value of the training_Room__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraining_Room__C() {
        return trainingRoomC;
    }

    /**
     * Sets the value of the training_Room__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraining_Room__C(String value) {
        this.trainingRoomC = value;
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
     * Gets the value of the ups_Track__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPS_Track__C() {
        return upsTrackC;
    }

    /**
     * Sets the value of the ups_Track__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPS_Track__C(String value) {
        this.upsTrackC = value;
    }

    /**
     * Gets the value of the url_To_Be_Used__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL_To_Be_Used__C() {
        return urlToBeUsedC;
    }

    /**
     * Sets the value of the url_To_Be_Used__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL_To_Be_Used__C(String value) {
        this.urlToBeUsedC = value;
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
