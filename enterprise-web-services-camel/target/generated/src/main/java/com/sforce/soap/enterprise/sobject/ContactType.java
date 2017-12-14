
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="AccountContactRoles" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Account_Fax__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account_Phone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account_Website__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Accounts1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Accounts2__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Accounts__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ActivityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Advocate__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Assets" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="AssistantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssistantPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Association_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Asst_Email_Address__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Birthdate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Buyer_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="By_Appointment_Only__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="COL_Divisional_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CampaignMembers" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Campaigns__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CaseContactRoles" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Cases" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Cases__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Catalog_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Check_with_Sales_Rep_Before_Sampling__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Children__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Competing_Author__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Competing_Publisher__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Consultant_skill_set__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact_Best_Time_to_Call__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact_Review_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Contact_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact_Web_Address__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contacts__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Content_Area__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractContactRoles" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ContractsSigned" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Data_Source__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateTrained__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Day__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direct_Phone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discipline__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Division" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="DoNotCall" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Eloqua_Contact_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Eloqua_Email_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailBouncedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EmailBouncedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailStatuses" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Email_Invalid__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Events" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Familiar_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Feeds" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Field_Engineering_Installations__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flag_Big_Mouth__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Formative_System_Enhancement_Requests__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="From_Time__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GRT_Divisional_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="General_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gift_Preferences__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Grade__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HIT_Divisional_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HMCo_Author__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HMH_Contact_Roles1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="HMH_Contact_Roles__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="HMH_Licensing_Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="HMH_Licensing_Account__r" type="{urn:sobject.enterprise.soap.sforce.com}HMH_Licensing_Account__c" minOccurs="0"/>
 *         &lt;element name="HasOptedOutOfEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Home_Address_City__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Home_Address_Country__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Home_Address_County__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Home_Address_State_Province__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Home_Address_Street__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Home_Address_Zip_Postal_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Home_Address__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Home_Email_Address__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Home_Mobile_Phone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INT_Divisional_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In_Active_No_Longer_w_District__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Jigsaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Description_Contacts__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Role__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Title__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Key_Decision_Maker__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastCURequestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastCUUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeadSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Rating_Icons__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Rating__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Score_Campaign__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Lead_Score__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Legacy_Contact_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MCD_Divisional_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_Contact__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MDR_First_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_Job_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_Job_Discipline__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_Job_Function_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_Job_Role__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_Last_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_Marketing_Email__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_Owned__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MDR_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mail_Opt_Out__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MailingCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailingCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailingPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailingStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manager__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Manager__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="Market_Comments__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Market__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MasterRecord" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="MasterRecordId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Most_Recent_Lead_Source__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NID_Eloqua__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nickname__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OIRs1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OIRs2__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OIRs__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpenActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opportunities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opportunities1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpportunityContactRoles" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OtherCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Other_Address_Use_Expiration__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PIDNID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PID_Eloqua__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Per_Diem_Forecasts__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Per_Diem_Plan_Form__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Per_Diem_Plan_Form__r" type="{urn:sobject.enterprise.soap.sforce.com}Per_Diem_Plan_Form__c" minOccurs="0"/>
 *         &lt;element name="Permissions_Administrator__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneExt__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Preferred_City__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Preferred_Contact_Method__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Preferred_Country__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Preferred_State_Province__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Preferred_Street__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Preferred_Zip_Postal_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Presentation__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Presentation__r" type="{urn:sobject.enterprise.soap.sforce.com}Presentation__c" minOccurs="0"/>
 *         &lt;element name="Prevent_MDR_Update__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Prior_Contact_ID__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Prior_Contact_ID__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProductReference__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Professor_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Project_Plans__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="R00N60000001PRPAEA4__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="RSVP__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="RecordType" type="{urn:sobject.enterprise.soap.sforce.com}RecordType" minOccurs="0"/>
 *         &lt;element name="RecordTypeId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Reference_able__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Region__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportsTo" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="ReportsToId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Reports_To__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Reports_To__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="Reviewer__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Role__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCH_Divisional_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ST_SIEBEL_ACC_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ST_SIEBEL_CONTACT_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesReference__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Plan__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Sales_Plan__r" type="{urn:sobject.enterprise.soap.sforce.com}Sales_Plan__c" minOccurs="0"/>
 *         &lt;element name="Salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Season__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Secondary_Role__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceRequestTentativeAttendees_del__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Service_Request_Forms__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Shares" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Skills_Tutor_Role__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Special_Interest__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Spouse__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Start_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubDistrict__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub_Discipline__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TRD_Divisional_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Tenure__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Time_Zone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="To_Time__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Web_Form__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="X2nd_Asst_Email__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="X2nd_Asst_Phone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="X2nd_Asst__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Contact", propOrder = {
    "account",
    "accountContactRoles",
    "accountId",
    "accountFaxC",
    "accountPhoneC",
    "accountWebsiteC",
    "accounts1R",
    "accounts2R",
    "accountsR",
    "activityHistories",
    "advocateC",
    "assets",
    "assistantName",
    "assistantPhone",
    "associationTypeC",
    "asstEmailAddressC",
    "attachments",
    "birthdate",
    "buyerTypeC",
    "byAppointmentOnlyC",
    "colDivisionalCommentsC",
    "campaignMembers",
    "campaignsR",
    "caseContactRoles",
    "cases",
    "casesR",
    "catalogTypeC",
    "checkWithSalesRepBeforeSamplingC",
    "childrenC",
    "competingAuthorC",
    "competingPublisherC",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "consultantSkillSetC",
    "contactBestTimeToCallC",
    "contactReviewDateC",
    "contactTypeC",
    "contactWebAddressC",
    "contactsR",
    "contentAreaC",
    "contractContactRoles",
    "contractsSigned",
    "createdBy",
    "createdById",
    "createdDate",
    "dataSourceC",
    "dateTrainedC",
    "dayC",
    "description",
    "directPhoneC",
    "disciplineC",
    "division",
    "doNotCall",
    "eloquaContactIDC",
    "eloquaEmailIDC",
    "email",
    "emailBouncedDate",
    "emailBouncedReason",
    "emailStatuses",
    "emailInvalidC",
    "events",
    "familiarNameC",
    "fax",
    "feedSubscriptionsForEntity",
    "feeds",
    "fieldEngineeringInstallationsR",
    "firstName",
    "flagBigMouthC",
    "formativeSystemEnhancementRequestsR",
    "fromTimeC",
    "grtDivisionalCommentsC",
    "generalCommentsC",
    "giftPreferencesC",
    "gradeC",
    "hitDivisionalCommentsC",
    "hmCoAuthorC",
    "hmhContactRoles1R",
    "hmhContactRolesR",
    "hmhLicensingAccountC",
    "hmhLicensingAccountR",
    "hasOptedOutOfEmail",
    "histories",
    "homePhone",
    "homeAddressCityC",
    "homeAddressCountryC",
    "homeAddressCountyC",
    "homeAddressStateProvinceC",
    "homeAddressStreetC",
    "homeAddressZipPostalCodeC",
    "homeAddressC",
    "homeEmailAddressC",
    "homeMobilePhoneC",
    "intDivisionalCommentsC",
    "inActiveNoLongerWDistrictC",
    "isDeleted",
    "jigsaw",
    "jobCodeC",
    "jobDescriptionContactsC",
    "jobRoleC",
    "jobTitleC",
    "keyDecisionMakerC",
    "lastActivityDate",
    "lastCURequestDate",
    "lastCUUpdateDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastName",
    "leadSource",
    "leadRatingIconsC",
    "leadRatingC",
    "leadScoreCampaignC",
    "leadScoreC",
    "legacyContactIDC",
    "locationC",
    "mcdDivisionalCommentsC",
    "mdrContactC",
    "mdrFirstNameC",
    "mdrJobDescriptionC",
    "mdrJobDisciplineC",
    "mdrJobFunctionCodeC",
    "mdrJobRoleC",
    "mdrLastNameC",
    "mdrMarketingEmailC",
    "mdrOwnedC",
    "mdrStatusC",
    "mailOptOutC",
    "mailingCity",
    "mailingCountry",
    "mailingPostalCode",
    "mailingState",
    "mailingStreet",
    "managerC",
    "managerR",
    "marketCommentsR",
    "marketC",
    "masterRecord",
    "masterRecordId",
    "mobilePhone",
    "mostRecentLeadSourceC",
    "nidEloquaC",
    "nidC",
    "name",
    "nicknameC",
    "notes",
    "notesAndAttachments",
    "oiRs1R",
    "oiRs2R",
    "oiRsR",
    "openActivities",
    "opportunities",
    "opportunities1R",
    "opportunityContactRoles",
    "otherCity",
    "otherCountry",
    "otherPhone",
    "otherPostalCode",
    "otherState",
    "otherStreet",
    "otherAddressUseExpirationC",
    "owner",
    "ownerId",
    "pidnidC",
    "pidEloquaC",
    "perDiemForecastsR",
    "perDiemPlanFormC",
    "perDiemPlanFormR",
    "permissionsAdministratorC",
    "phone",
    "phoneExtC",
    "preferredCityC",
    "preferredContactMethodC",
    "preferredCountryC",
    "preferredStateProvinceC",
    "preferredStreetC",
    "preferredZipPostalCodeC",
    "presentationC",
    "presentationR",
    "preventMDRUpdateC",
    "priorContactIDC",
    "priorContactIDR",
    "processInstances",
    "processSteps",
    "productReferenceC",
    "professorIDC",
    "projectPlansR",
    "r00N60000001PRPAEA4R",
    "rsvpR",
    "recordType",
    "recordTypeId",
    "referenceAbleC",
    "regionC",
    "reportsTo",
    "reportsToId",
    "reportsToC",
    "reportsToR",
    "reviewerC",
    "roleC",
    "schDivisionalCommentsC",
    "stSIEBELACCIDC",
    "stSIEBELCONTACTIDC",
    "salesReferenceC",
    "salesPlanC",
    "salesPlanR",
    "salutation",
    "schoolNameC",
    "seasonC",
    "secondaryRoleC",
    "serviceRequestTentativeAttendeesDelR",
    "serviceRequestFormsR",
    "shares",
    "skillsTutorRoleC",
    "specialInterestC",
    "spouseC",
    "startDateC",
    "statusC",
    "subDistrictC",
    "subDisciplineC",
    "subjectC",
    "systemModstamp",
    "trdDivisionalCommentsC",
    "tasks",
    "tenureC",
    "timeZoneC",
    "title",
    "toTimeC",
    "webFormC",
    "x2NdAsstEmailC",
    "x2NdAsstPhoneC",
    "x2NdAsstC",
    "experianqasUpdatedTouchpointsTimestampC",
    "experianqasUpdatedTouchpointsC"
})
public class ContactType
    extends SObjectType
{

    @XmlElement(name = "Account", nillable = true)
    protected AccountType account;
    @XmlElement(name = "AccountContactRoles", nillable = true)
    protected QueryResult accountContactRoles;
    @XmlElement(name = "AccountId", nillable = true)
    protected String accountId;
    @XmlElement(name = "Account_Fax__c", nillable = true)
    protected String accountFaxC;
    @XmlElement(name = "Account_Phone__c", nillable = true)
    protected String accountPhoneC;
    @XmlElement(name = "Account_Website__c", nillable = true)
    protected String accountWebsiteC;
    @XmlElement(name = "Accounts1__r", nillable = true)
    protected QueryResult accounts1R;
    @XmlElement(name = "Accounts2__r", nillable = true)
    protected QueryResult accounts2R;
    @XmlElement(name = "Accounts__r", nillable = true)
    protected QueryResult accountsR;
    @XmlElement(name = "ActivityHistories", nillable = true)
    protected QueryResult activityHistories;
    @XmlElement(name = "Advocate__c", nillable = true)
    protected Boolean advocateC;
    @XmlElement(name = "Assets", nillable = true)
    protected QueryResult assets;
    @XmlElement(name = "AssistantName", nillable = true)
    protected String assistantName;
    @XmlElement(name = "AssistantPhone", nillable = true)
    protected String assistantPhone;
    @XmlElement(name = "Association_Type__c", nillable = true)
    protected String associationTypeC;
    @XmlElement(name = "Asst_Email_Address__c", nillable = true)
    protected String asstEmailAddressC;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "Birthdate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthdate;
    @XmlElement(name = "Buyer_Type__c", nillable = true)
    protected String buyerTypeC;
    @XmlElement(name = "By_Appointment_Only__c", nillable = true)
    protected Boolean byAppointmentOnlyC;
    @XmlElement(name = "COL_Divisional_Comments__c", nillable = true)
    protected String colDivisionalCommentsC;
    @XmlElement(name = "CampaignMembers", nillable = true)
    protected QueryResult campaignMembers;
    @XmlElement(name = "Campaigns__r", nillable = true)
    protected QueryResult campaignsR;
    @XmlElement(name = "CaseContactRoles", nillable = true)
    protected QueryResult caseContactRoles;
    @XmlElement(name = "Cases", nillable = true)
    protected QueryResult cases;
    @XmlElement(name = "Cases__r", nillable = true)
    protected QueryResult casesR;
    @XmlElement(name = "Catalog_Type__c", nillable = true)
    protected String catalogTypeC;
    @XmlElement(name = "Check_with_Sales_Rep_Before_Sampling__c", nillable = true)
    protected String checkWithSalesRepBeforeSamplingC;
    @XmlElement(name = "Children__c", nillable = true)
    protected String childrenC;
    @XmlElement(name = "Competing_Author__c", nillable = true)
    protected String competingAuthorC;
    @XmlElement(name = "Competing_Publisher__c", nillable = true)
    protected String competingPublisherC;
    @XmlElement(name = "ConnectionReceived", nillable = true)
    protected PartnerNetworkConnectionType connectionReceived;
    @XmlElement(name = "ConnectionReceivedId", nillable = true)
    protected String connectionReceivedId;
    @XmlElement(name = "ConnectionSent", nillable = true)
    protected PartnerNetworkConnectionType connectionSent;
    @XmlElement(name = "ConnectionSentId", nillable = true)
    protected String connectionSentId;
    @XmlElement(name = "Consultant_skill_set__c", nillable = true)
    protected String consultantSkillSetC;
    @XmlElement(name = "Contact_Best_Time_to_Call__c", nillable = true)
    protected String contactBestTimeToCallC;
    @XmlElement(name = "Contact_Review_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contactReviewDateC;
    @XmlElement(name = "Contact_Type__c", nillable = true)
    protected String contactTypeC;
    @XmlElement(name = "Contact_Web_Address__c", nillable = true)
    protected String contactWebAddressC;
    @XmlElement(name = "Contacts__r", nillable = true)
    protected QueryResult contactsR;
    @XmlElement(name = "Content_Area__c", nillable = true)
    protected String contentAreaC;
    @XmlElement(name = "ContractContactRoles", nillable = true)
    protected QueryResult contractContactRoles;
    @XmlElement(name = "ContractsSigned", nillable = true)
    protected QueryResult contractsSigned;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Data_Source__c", nillable = true)
    protected String dataSourceC;
    @XmlElement(name = "DateTrained__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateTrainedC;
    @XmlElement(name = "Day__c", nillable = true)
    protected String dayC;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "Direct_Phone__c", nillable = true)
    protected String directPhoneC;
    @XmlElement(name = "Discipline__c", nillable = true)
    protected String disciplineC;
    @XmlElement(name = "Division", nillable = true)
    protected String division;
    @XmlElement(name = "DoNotCall", nillable = true)
    protected Boolean doNotCall;
    @XmlElement(name = "Eloqua_Contact_ID__c", nillable = true)
    protected String eloquaContactIDC;
    @XmlElement(name = "Eloqua_Email_ID__c", nillable = true)
    protected String eloquaEmailIDC;
    @XmlElement(name = "Email", nillable = true)
    protected String email;
    @XmlElement(name = "EmailBouncedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar emailBouncedDate;
    @XmlElement(name = "EmailBouncedReason", nillable = true)
    protected String emailBouncedReason;
    @XmlElement(name = "EmailStatuses", nillable = true)
    protected QueryResult emailStatuses;
    @XmlElement(name = "Email_Invalid__c", nillable = true)
    protected Boolean emailInvalidC;
    @XmlElement(name = "Events", nillable = true)
    protected QueryResult events;
    @XmlElement(name = "Familiar_Name__c", nillable = true)
    protected String familiarNameC;
    @XmlElement(name = "Fax", nillable = true)
    protected String fax;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "Feeds", nillable = true)
    protected QueryResult feeds;
    @XmlElement(name = "Field_Engineering_Installations__r", nillable = true)
    protected QueryResult fieldEngineeringInstallationsR;
    @XmlElement(name = "FirstName", nillable = true)
    protected String firstName;
    @XmlElement(name = "Flag_Big_Mouth__c", nillable = true)
    protected Boolean flagBigMouthC;
    @XmlElement(name = "Formative_System_Enhancement_Requests__r", nillable = true)
    protected QueryResult formativeSystemEnhancementRequestsR;
    @XmlElement(name = "From_Time__c", nillable = true)
    protected String fromTimeC;
    @XmlElement(name = "GRT_Divisional_Comments__c", nillable = true)
    protected String grtDivisionalCommentsC;
    @XmlElement(name = "General_Comments__c", nillable = true)
    protected String generalCommentsC;
    @XmlElement(name = "Gift_Preferences__c", nillable = true)
    protected String giftPreferencesC;
    @XmlElement(name = "Grade__c", nillable = true)
    protected String gradeC;
    @XmlElement(name = "HIT_Divisional_Comments__c", nillable = true)
    protected String hitDivisionalCommentsC;
    @XmlElement(name = "HMCo_Author__c", nillable = true)
    protected String hmCoAuthorC;
    @XmlElement(name = "HMH_Contact_Roles1__r", nillable = true)
    protected QueryResult hmhContactRoles1R;
    @XmlElement(name = "HMH_Contact_Roles__r", nillable = true)
    protected QueryResult hmhContactRolesR;
    @XmlElement(name = "HMH_Licensing_Account__c", nillable = true)
    protected String hmhLicensingAccountC;
    @XmlElement(name = "HMH_Licensing_Account__r", nillable = true)
    protected HMH_Licensing_Account__CType hmhLicensingAccountR;
    @XmlElement(name = "HasOptedOutOfEmail", nillable = true)
    protected Boolean hasOptedOutOfEmail;
    @XmlElement(name = "Histories", nillable = true)
    protected QueryResult histories;
    @XmlElement(name = "HomePhone", nillable = true)
    protected String homePhone;
    @XmlElement(name = "Home_Address_City__c", nillable = true)
    protected String homeAddressCityC;
    @XmlElement(name = "Home_Address_Country__c", nillable = true)
    protected String homeAddressCountryC;
    @XmlElement(name = "Home_Address_County__c", nillable = true)
    protected String homeAddressCountyC;
    @XmlElement(name = "Home_Address_State_Province__c", nillable = true)
    protected String homeAddressStateProvinceC;
    @XmlElement(name = "Home_Address_Street__c", nillable = true)
    protected String homeAddressStreetC;
    @XmlElement(name = "Home_Address_Zip_Postal_Code__c", nillable = true)
    protected String homeAddressZipPostalCodeC;
    @XmlElement(name = "Home_Address__c", nillable = true)
    protected String homeAddressC;
    @XmlElement(name = "Home_Email_Address__c", nillable = true)
    protected String homeEmailAddressC;
    @XmlElement(name = "Home_Mobile_Phone__c", nillable = true)
    protected String homeMobilePhoneC;
    @XmlElement(name = "INT_Divisional_Comments__c", nillable = true)
    protected String intDivisionalCommentsC;
    @XmlElement(name = "In_Active_No_Longer_w_District__c", nillable = true)
    protected Boolean inActiveNoLongerWDistrictC;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "Jigsaw", nillable = true)
    protected String jigsaw;
    @XmlElement(name = "Job_Code__c", nillable = true)
    protected String jobCodeC;
    @XmlElement(name = "Job_Description_Contacts__c", nillable = true)
    protected String jobDescriptionContactsC;
    @XmlElement(name = "Job_Role__c", nillable = true)
    protected String jobRoleC;
    @XmlElement(name = "Job_Title__c", nillable = true)
    protected String jobTitleC;
    @XmlElement(name = "Key_Decision_Maker__c", nillable = true)
    protected Boolean keyDecisionMakerC;
    @XmlElement(name = "LastActivityDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastActivityDate;
    @XmlElement(name = "LastCURequestDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastCURequestDate;
    @XmlElement(name = "LastCUUpdateDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastCUUpdateDate;
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
    @XmlElement(name = "Lead_Rating_Icons__c", nillable = true)
    protected String leadRatingIconsC;
    @XmlElement(name = "Lead_Rating__c", nillable = true)
    protected String leadRatingC;
    @XmlElement(name = "Lead_Score_Campaign__c", nillable = true)
    protected Double leadScoreCampaignC;
    @XmlElement(name = "Lead_Score__c", nillable = true)
    protected Double leadScoreC;
    @XmlElement(name = "Legacy_Contact_ID__c", nillable = true)
    protected String legacyContactIDC;
    @XmlElement(name = "Location__c", nillable = true)
    protected String locationC;
    @XmlElement(name = "MCD_Divisional_Comments__c", nillable = true)
    protected String mcdDivisionalCommentsC;
    @XmlElement(name = "MDR_Contact__c", nillable = true)
    protected Boolean mdrContactC;
    @XmlElement(name = "MDR_First_Name__c", nillable = true)
    protected String mdrFirstNameC;
    @XmlElement(name = "MDR_Job_Description__c", nillable = true)
    protected String mdrJobDescriptionC;
    @XmlElement(name = "MDR_Job_Discipline__c", nillable = true)
    protected String mdrJobDisciplineC;
    @XmlElement(name = "MDR_Job_Function_Code__c", nillable = true)
    protected String mdrJobFunctionCodeC;
    @XmlElement(name = "MDR_Job_Role__c", nillable = true)
    protected String mdrJobRoleC;
    @XmlElement(name = "MDR_Last_Name__c", nillable = true)
    protected String mdrLastNameC;
    @XmlElement(name = "MDR_Marketing_Email__c", nillable = true)
    protected String mdrMarketingEmailC;
    @XmlElement(name = "MDR_Owned__c", nillable = true)
    protected Boolean mdrOwnedC;
    @XmlElement(name = "MDR_Status__c", nillable = true)
    protected String mdrStatusC;
    @XmlElement(name = "Mail_Opt_Out__c", nillable = true)
    protected Boolean mailOptOutC;
    @XmlElement(name = "MailingCity", nillable = true)
    protected String mailingCity;
    @XmlElement(name = "MailingCountry", nillable = true)
    protected String mailingCountry;
    @XmlElement(name = "MailingPostalCode", nillable = true)
    protected String mailingPostalCode;
    @XmlElement(name = "MailingState", nillable = true)
    protected String mailingState;
    @XmlElement(name = "MailingStreet", nillable = true)
    protected String mailingStreet;
    @XmlElement(name = "Manager__c", nillable = true)
    protected String managerC;
    @XmlElement(name = "Manager__r", nillable = true)
    protected UserType managerR;
    @XmlElement(name = "Market_Comments__r", nillable = true)
    protected QueryResult marketCommentsR;
    @XmlElement(name = "Market__c", nillable = true)
    protected String marketC;
    @XmlElement(name = "MasterRecord", nillable = true)
    protected ContactType masterRecord;
    @XmlElement(name = "MasterRecordId", nillable = true)
    protected String masterRecordId;
    @XmlElement(name = "MobilePhone", nillable = true)
    protected String mobilePhone;
    @XmlElement(name = "Most_Recent_Lead_Source__c", nillable = true)
    protected String mostRecentLeadSourceC;
    @XmlElement(name = "NID_Eloqua__c", nillable = true)
    protected String nidEloquaC;
    @XmlElement(name = "NID__c", nillable = true)
    protected String nidC;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Nickname__c", nillable = true)
    protected String nicknameC;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "OIRs1__r", nillable = true)
    protected QueryResult oiRs1R;
    @XmlElement(name = "OIRs2__r", nillable = true)
    protected QueryResult oiRs2R;
    @XmlElement(name = "OIRs__r", nillable = true)
    protected QueryResult oiRsR;
    @XmlElement(name = "OpenActivities", nillable = true)
    protected QueryResult openActivities;
    @XmlElement(name = "Opportunities", nillable = true)
    protected QueryResult opportunities;
    @XmlElement(name = "Opportunities1__r", nillable = true)
    protected QueryResult opportunities1R;
    @XmlElement(name = "OpportunityContactRoles", nillable = true)
    protected QueryResult opportunityContactRoles;
    @XmlElement(name = "OtherCity", nillable = true)
    protected String otherCity;
    @XmlElement(name = "OtherCountry", nillable = true)
    protected String otherCountry;
    @XmlElement(name = "OtherPhone", nillable = true)
    protected String otherPhone;
    @XmlElement(name = "OtherPostalCode", nillable = true)
    protected String otherPostalCode;
    @XmlElement(name = "OtherState", nillable = true)
    protected String otherState;
    @XmlElement(name = "OtherStreet", nillable = true)
    protected String otherStreet;
    @XmlElement(name = "Other_Address_Use_Expiration__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar otherAddressUseExpirationC;
    @XmlElement(name = "Owner", nillable = true)
    protected UserType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "PIDNID__c", nillable = true)
    protected String pidnidC;
    @XmlElement(name = "PID_Eloqua__c", nillable = true)
    protected String pidEloquaC;
    @XmlElement(name = "Per_Diem_Forecasts__r", nillable = true)
    protected QueryResult perDiemForecastsR;
    @XmlElement(name = "Per_Diem_Plan_Form__c", nillable = true)
    protected String perDiemPlanFormC;
    @XmlElement(name = "Per_Diem_Plan_Form__r", nillable = true)
    protected Per_Diem_Plan_Form__CType perDiemPlanFormR;
    @XmlElement(name = "Permissions_Administrator__c", nillable = true)
    protected Boolean permissionsAdministratorC;
    @XmlElement(name = "Phone", nillable = true)
    protected String phone;
    @XmlElement(name = "PhoneExt__c", nillable = true)
    protected String phoneExtC;
    @XmlElement(name = "Preferred_City__c", nillable = true)
    protected String preferredCityC;
    @XmlElement(name = "Preferred_Contact_Method__c", nillable = true)
    protected String preferredContactMethodC;
    @XmlElement(name = "Preferred_Country__c", nillable = true)
    protected String preferredCountryC;
    @XmlElement(name = "Preferred_State_Province__c", nillable = true)
    protected String preferredStateProvinceC;
    @XmlElement(name = "Preferred_Street__c", nillable = true)
    protected String preferredStreetC;
    @XmlElement(name = "Preferred_Zip_Postal_Code__c", nillable = true)
    protected String preferredZipPostalCodeC;
    @XmlElement(name = "Presentation__c", nillable = true)
    protected String presentationC;
    @XmlElement(name = "Presentation__r", nillable = true)
    protected Presentation__CType presentationR;
    @XmlElement(name = "Prevent_MDR_Update__c", nillable = true)
    protected Boolean preventMDRUpdateC;
    @XmlElement(name = "Prior_Contact_ID__c", nillable = true)
    protected String priorContactIDC;
    @XmlElement(name = "Prior_Contact_ID__r", nillable = true)
    protected AccountType priorContactIDR;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "ProductReference__c", nillable = true)
    protected String productReferenceC;
    @XmlElement(name = "Professor_ID__c", nillable = true)
    protected String professorIDC;
    @XmlElement(name = "Project_Plans__r", nillable = true)
    protected QueryResult projectPlansR;
    @XmlElement(name = "R00N60000001PRPAEA4__r", nillable = true)
    protected QueryResult r00N60000001PRPAEA4R;
    @XmlElement(name = "RSVP__r", nillable = true)
    protected QueryResult rsvpR;
    @XmlElement(name = "RecordType", nillable = true)
    protected RecordTypeType recordType;
    @XmlElement(name = "RecordTypeId", nillable = true)
    protected String recordTypeId;
    @XmlElement(name = "Reference_able__c", nillable = true)
    protected Boolean referenceAbleC;
    @XmlElement(name = "Region__c", nillable = true)
    protected String regionC;
    @XmlElement(name = "ReportsTo", nillable = true)
    protected ContactType reportsTo;
    @XmlElement(name = "ReportsToId", nillable = true)
    protected String reportsToId;
    @XmlElement(name = "Reports_To__c", nillable = true)
    protected String reportsToC;
    @XmlElement(name = "Reports_To__r", nillable = true)
    protected ContactType reportsToR;
    @XmlElement(name = "Reviewer__c", nillable = true)
    protected Boolean reviewerC;
    @XmlElement(name = "Role__c", nillable = true)
    protected String roleC;
    @XmlElement(name = "SCH_Divisional_Comments__c", nillable = true)
    protected String schDivisionalCommentsC;
    @XmlElement(name = "ST_SIEBEL_ACC_ID__c", nillable = true)
    protected String stSIEBELACCIDC;
    @XmlElement(name = "ST_SIEBEL_CONTACT_ID__c", nillable = true)
    protected String stSIEBELCONTACTIDC;
    @XmlElement(name = "SalesReference__c", nillable = true)
    protected String salesReferenceC;
    @XmlElement(name = "Sales_Plan__c", nillable = true)
    protected String salesPlanC;
    @XmlElement(name = "Sales_Plan__r", nillable = true)
    protected Sales_Plan__CType salesPlanR;
    @XmlElement(name = "Salutation", nillable = true)
    protected String salutation;
    @XmlElement(name = "SchoolName__c", nillable = true)
    protected String schoolNameC;
    @XmlElement(name = "Season__c", nillable = true)
    protected String seasonC;
    @XmlElement(name = "Secondary_Role__c", nillable = true)
    protected String secondaryRoleC;
    @XmlElement(name = "ServiceRequestTentativeAttendees_del__r", nillable = true)
    protected QueryResult serviceRequestTentativeAttendeesDelR;
    @XmlElement(name = "Service_Request_Forms__r", nillable = true)
    protected QueryResult serviceRequestFormsR;
    @XmlElement(name = "Shares", nillable = true)
    protected QueryResult shares;
    @XmlElement(name = "Skills_Tutor_Role__c", nillable = true)
    protected String skillsTutorRoleC;
    @XmlElement(name = "Special_Interest__c", nillable = true)
    protected String specialInterestC;
    @XmlElement(name = "Spouse__c", nillable = true)
    protected String spouseC;
    @XmlElement(name = "Start_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDateC;
    @XmlElement(name = "Status__c", nillable = true)
    protected String statusC;
    @XmlElement(name = "SubDistrict__c", nillable = true)
    protected String subDistrictC;
    @XmlElement(name = "Sub_Discipline__c", nillable = true)
    protected String subDisciplineC;
    @XmlElement(name = "Subject__c", nillable = true)
    protected String subjectC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TRD_Divisional_Comments__c", nillable = true)
    protected String trdDivisionalCommentsC;
    @XmlElement(name = "Tasks", nillable = true)
    protected QueryResult tasks;
    @XmlElement(name = "Tenure__c", nillable = true)
    protected Double tenureC;
    @XmlElement(name = "Time_Zone__c", nillable = true)
    protected String timeZoneC;
    @XmlElement(name = "Title", nillable = true)
    protected String title;
    @XmlElement(name = "To_Time__c", nillable = true)
    protected String toTimeC;
    @XmlElement(name = "Web_Form__c", nillable = true)
    protected Boolean webFormC;
    @XmlElement(name = "X2nd_Asst_Email__c", nillable = true)
    protected String x2NdAsstEmailC;
    @XmlElement(name = "X2nd_Asst_Phone__c", nillable = true)
    protected String x2NdAsstPhoneC;
    @XmlElement(name = "X2nd_Asst__c", nillable = true)
    protected String x2NdAsstC;
    @XmlElement(name = "experianqas__Updated_Touchpoints_Timestamp__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar experianqasUpdatedTouchpointsTimestampC;
    @XmlElement(name = "experianqas__Updated_Touchpoints__c", nillable = true)
    protected String experianqasUpdatedTouchpointsC;

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
     * Gets the value of the accountContactRoles property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getAccountContactRoles() {
        return accountContactRoles;
    }

    /**
     * Sets the value of the accountContactRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setAccountContactRoles(QueryResult value) {
        this.accountContactRoles = value;
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
     * Gets the value of the account_Fax__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount_Fax__C() {
        return accountFaxC;
    }

    /**
     * Sets the value of the account_Fax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount_Fax__C(String value) {
        this.accountFaxC = value;
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
     * Gets the value of the account_Website__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount_Website__C() {
        return accountWebsiteC;
    }

    /**
     * Sets the value of the account_Website__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount_Website__C(String value) {
        this.accountWebsiteC = value;
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
     * Gets the value of the advocate__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvocate__C() {
        return advocateC;
    }

    /**
     * Sets the value of the advocate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvocate__C(Boolean value) {
        this.advocateC = value;
    }

    /**
     * Gets the value of the assets property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getAssets() {
        return assets;
    }

    /**
     * Sets the value of the assets property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setAssets(QueryResult value) {
        this.assets = value;
    }

    /**
     * Gets the value of the assistantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssistantName() {
        return assistantName;
    }

    /**
     * Sets the value of the assistantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssistantName(String value) {
        this.assistantName = value;
    }

    /**
     * Gets the value of the assistantPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssistantPhone() {
        return assistantPhone;
    }

    /**
     * Sets the value of the assistantPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssistantPhone(String value) {
        this.assistantPhone = value;
    }

    /**
     * Gets the value of the association_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociation_Type__C() {
        return associationTypeC;
    }

    /**
     * Sets the value of the association_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociation_Type__C(String value) {
        this.associationTypeC = value;
    }

    /**
     * Gets the value of the asst_Email_Address__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsst_Email_Address__C() {
        return asstEmailAddressC;
    }

    /**
     * Sets the value of the asst_Email_Address__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsst_Email_Address__C(String value) {
        this.asstEmailAddressC = value;
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
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthdate(XMLGregorianCalendar value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the buyer_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyer_Type__C() {
        return buyerTypeC;
    }

    /**
     * Sets the value of the buyer_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyer_Type__C(String value) {
        this.buyerTypeC = value;
    }

    /**
     * Gets the value of the by_Appointment_Only__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBy_Appointment_Only__C() {
        return byAppointmentOnlyC;
    }

    /**
     * Sets the value of the by_Appointment_Only__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBy_Appointment_Only__C(Boolean value) {
        this.byAppointmentOnlyC = value;
    }

    /**
     * Gets the value of the col_Divisional_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOL_Divisional_Comments__C() {
        return colDivisionalCommentsC;
    }

    /**
     * Sets the value of the col_Divisional_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOL_Divisional_Comments__C(String value) {
        this.colDivisionalCommentsC = value;
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
     * Gets the value of the campaigns__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getCampaigns__R() {
        return campaignsR;
    }

    /**
     * Sets the value of the campaigns__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setCampaigns__R(QueryResult value) {
        this.campaignsR = value;
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
     * Gets the value of the cases__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getCases__R() {
        return casesR;
    }

    /**
     * Sets the value of the cases__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setCases__R(QueryResult value) {
        this.casesR = value;
    }

    /**
     * Gets the value of the catalog_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalog_Type__C() {
        return catalogTypeC;
    }

    /**
     * Sets the value of the catalog_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalog_Type__C(String value) {
        this.catalogTypeC = value;
    }

    /**
     * Gets the value of the check_With_Sales_Rep_Before_Sampling__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheck_With_Sales_Rep_Before_Sampling__C() {
        return checkWithSalesRepBeforeSamplingC;
    }

    /**
     * Sets the value of the check_With_Sales_Rep_Before_Sampling__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheck_With_Sales_Rep_Before_Sampling__C(String value) {
        this.checkWithSalesRepBeforeSamplingC = value;
    }

    /**
     * Gets the value of the children__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildren__C() {
        return childrenC;
    }

    /**
     * Sets the value of the children__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildren__C(String value) {
        this.childrenC = value;
    }

    /**
     * Gets the value of the competing_Author__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompeting_Author__C() {
        return competingAuthorC;
    }

    /**
     * Sets the value of the competing_Author__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompeting_Author__C(String value) {
        this.competingAuthorC = value;
    }

    /**
     * Gets the value of the competing_Publisher__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompeting_Publisher__C() {
        return competingPublisherC;
    }

    /**
     * Sets the value of the competing_Publisher__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompeting_Publisher__C(String value) {
        this.competingPublisherC = value;
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
     * Gets the value of the contact_Best_Time_To_Call__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact_Best_Time_To_Call__C() {
        return contactBestTimeToCallC;
    }

    /**
     * Sets the value of the contact_Best_Time_To_Call__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact_Best_Time_To_Call__C(String value) {
        this.contactBestTimeToCallC = value;
    }

    /**
     * Gets the value of the contact_Review_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContact_Review_Date__C() {
        return contactReviewDateC;
    }

    /**
     * Sets the value of the contact_Review_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContact_Review_Date__C(XMLGregorianCalendar value) {
        this.contactReviewDateC = value;
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
     * Gets the value of the contact_Web_Address__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact_Web_Address__C() {
        return contactWebAddressC;
    }

    /**
     * Sets the value of the contact_Web_Address__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact_Web_Address__C(String value) {
        this.contactWebAddressC = value;
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
     * Gets the value of the content_Area__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent_Area__C() {
        return contentAreaC;
    }

    /**
     * Sets the value of the content_Area__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent_Area__C(String value) {
        this.contentAreaC = value;
    }

    /**
     * Gets the value of the contractContactRoles property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getContractContactRoles() {
        return contractContactRoles;
    }

    /**
     * Sets the value of the contractContactRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setContractContactRoles(QueryResult value) {
        this.contractContactRoles = value;
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
     * Gets the value of the data_Source__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData_Source__C() {
        return dataSourceC;
    }

    /**
     * Sets the value of the data_Source__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData_Source__C(String value) {
        this.dataSourceC = value;
    }

    /**
     * Gets the value of the dateTrained__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTrained__C() {
        return dateTrainedC;
    }

    /**
     * Sets the value of the dateTrained__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTrained__C(XMLGregorianCalendar value) {
        this.dateTrainedC = value;
    }

    /**
     * Gets the value of the day__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDay__C() {
        return dayC;
    }

    /**
     * Sets the value of the day__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDay__C(String value) {
        this.dayC = value;
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
     * Gets the value of the direct_Phone__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirect_Phone__C() {
        return directPhoneC;
    }

    /**
     * Sets the value of the direct_Phone__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirect_Phone__C(String value) {
        this.directPhoneC = value;
    }

    /**
     * Gets the value of the discipline__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscipline__C() {
        return disciplineC;
    }

    /**
     * Sets the value of the discipline__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscipline__C(String value) {
        this.disciplineC = value;
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
     * Gets the value of the doNotCall property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoNotCall() {
        return doNotCall;
    }

    /**
     * Sets the value of the doNotCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoNotCall(Boolean value) {
        this.doNotCall = value;
    }

    /**
     * Gets the value of the eloqua_Contact_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEloqua_Contact_ID__C() {
        return eloquaContactIDC;
    }

    /**
     * Sets the value of the eloqua_Contact_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEloqua_Contact_ID__C(String value) {
        this.eloquaContactIDC = value;
    }

    /**
     * Gets the value of the eloqua_Email_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEloqua_Email_ID__C() {
        return eloquaEmailIDC;
    }

    /**
     * Sets the value of the eloqua_Email_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEloqua_Email_ID__C(String value) {
        this.eloquaEmailIDC = value;
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
     * Gets the value of the email_Invalid__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmail_Invalid__C() {
        return emailInvalidC;
    }

    /**
     * Sets the value of the email_Invalid__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmail_Invalid__C(Boolean value) {
        this.emailInvalidC = value;
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
     * Gets the value of the familiar_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamiliar_Name__C() {
        return familiarNameC;
    }

    /**
     * Sets the value of the familiar_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamiliar_Name__C(String value) {
        this.familiarNameC = value;
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
     * Gets the value of the flag_Big_Mouth__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlag_Big_Mouth__C() {
        return flagBigMouthC;
    }

    /**
     * Sets the value of the flag_Big_Mouth__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlag_Big_Mouth__C(Boolean value) {
        this.flagBigMouthC = value;
    }

    /**
     * Gets the value of the formative_System_Enhancement_Requests__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getFormative_System_Enhancement_Requests__R() {
        return formativeSystemEnhancementRequestsR;
    }

    /**
     * Sets the value of the formative_System_Enhancement_Requests__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setFormative_System_Enhancement_Requests__R(QueryResult value) {
        this.formativeSystemEnhancementRequestsR = value;
    }

    /**
     * Gets the value of the from_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom_Time__C() {
        return fromTimeC;
    }

    /**
     * Sets the value of the from_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom_Time__C(String value) {
        this.fromTimeC = value;
    }

    /**
     * Gets the value of the grt_Divisional_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRT_Divisional_Comments__C() {
        return grtDivisionalCommentsC;
    }

    /**
     * Sets the value of the grt_Divisional_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRT_Divisional_Comments__C(String value) {
        this.grtDivisionalCommentsC = value;
    }

    /**
     * Gets the value of the general_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneral_Comments__C() {
        return generalCommentsC;
    }

    /**
     * Sets the value of the general_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneral_Comments__C(String value) {
        this.generalCommentsC = value;
    }

    /**
     * Gets the value of the gift_Preferences__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGift_Preferences__C() {
        return giftPreferencesC;
    }

    /**
     * Sets the value of the gift_Preferences__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGift_Preferences__C(String value) {
        this.giftPreferencesC = value;
    }

    /**
     * Gets the value of the grade__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade__C() {
        return gradeC;
    }

    /**
     * Sets the value of the grade__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade__C(String value) {
        this.gradeC = value;
    }

    /**
     * Gets the value of the hit_Divisional_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHIT_Divisional_Comments__C() {
        return hitDivisionalCommentsC;
    }

    /**
     * Sets the value of the hit_Divisional_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHIT_Divisional_Comments__C(String value) {
        this.hitDivisionalCommentsC = value;
    }

    /**
     * Gets the value of the hmCo_Author__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHMCo_Author__C() {
        return hmCoAuthorC;
    }

    /**
     * Sets the value of the hmCo_Author__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHMCo_Author__C(String value) {
        this.hmCoAuthorC = value;
    }

    /**
     * Gets the value of the hmh_Contact_Roles1__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getHMH_Contact_Roles1__R() {
        return hmhContactRoles1R;
    }

    /**
     * Sets the value of the hmh_Contact_Roles1__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setHMH_Contact_Roles1__R(QueryResult value) {
        this.hmhContactRoles1R = value;
    }

    /**
     * Gets the value of the hmh_Contact_Roles__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getHMH_Contact_Roles__R() {
        return hmhContactRolesR;
    }

    /**
     * Sets the value of the hmh_Contact_Roles__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setHMH_Contact_Roles__R(QueryResult value) {
        this.hmhContactRolesR = value;
    }

    /**
     * Gets the value of the hmh_Licensing_Account__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHMH_Licensing_Account__C() {
        return hmhLicensingAccountC;
    }

    /**
     * Sets the value of the hmh_Licensing_Account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHMH_Licensing_Account__C(String value) {
        this.hmhLicensingAccountC = value;
    }

    /**
     * Gets the value of the hmh_Licensing_Account__R property.
     * 
     * @return
     *     possible object is
     *     {@link HMH_Licensing_Account__CType }
     *     
     */
    public HMH_Licensing_Account__CType getHMH_Licensing_Account__R() {
        return hmhLicensingAccountR;
    }

    /**
     * Sets the value of the hmh_Licensing_Account__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link HMH_Licensing_Account__CType }
     *     
     */
    public void setHMH_Licensing_Account__R(HMH_Licensing_Account__CType value) {
        this.hmhLicensingAccountR = value;
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
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the home_Address_City__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHome_Address_City__C() {
        return homeAddressCityC;
    }

    /**
     * Sets the value of the home_Address_City__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHome_Address_City__C(String value) {
        this.homeAddressCityC = value;
    }

    /**
     * Gets the value of the home_Address_Country__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHome_Address_Country__C() {
        return homeAddressCountryC;
    }

    /**
     * Sets the value of the home_Address_Country__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHome_Address_Country__C(String value) {
        this.homeAddressCountryC = value;
    }

    /**
     * Gets the value of the home_Address_County__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHome_Address_County__C() {
        return homeAddressCountyC;
    }

    /**
     * Sets the value of the home_Address_County__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHome_Address_County__C(String value) {
        this.homeAddressCountyC = value;
    }

    /**
     * Gets the value of the home_Address_State_Province__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHome_Address_State_Province__C() {
        return homeAddressStateProvinceC;
    }

    /**
     * Sets the value of the home_Address_State_Province__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHome_Address_State_Province__C(String value) {
        this.homeAddressStateProvinceC = value;
    }

    /**
     * Gets the value of the home_Address_Street__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHome_Address_Street__C() {
        return homeAddressStreetC;
    }

    /**
     * Sets the value of the home_Address_Street__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHome_Address_Street__C(String value) {
        this.homeAddressStreetC = value;
    }

    /**
     * Gets the value of the home_Address_Zip_Postal_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHome_Address_Zip_Postal_Code__C() {
        return homeAddressZipPostalCodeC;
    }

    /**
     * Sets the value of the home_Address_Zip_Postal_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHome_Address_Zip_Postal_Code__C(String value) {
        this.homeAddressZipPostalCodeC = value;
    }

    /**
     * Gets the value of the home_Address__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHome_Address__C() {
        return homeAddressC;
    }

    /**
     * Sets the value of the home_Address__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHome_Address__C(String value) {
        this.homeAddressC = value;
    }

    /**
     * Gets the value of the home_Email_Address__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHome_Email_Address__C() {
        return homeEmailAddressC;
    }

    /**
     * Sets the value of the home_Email_Address__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHome_Email_Address__C(String value) {
        this.homeEmailAddressC = value;
    }

    /**
     * Gets the value of the home_Mobile_Phone__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHome_Mobile_Phone__C() {
        return homeMobilePhoneC;
    }

    /**
     * Sets the value of the home_Mobile_Phone__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHome_Mobile_Phone__C(String value) {
        this.homeMobilePhoneC = value;
    }

    /**
     * Gets the value of the int_Divisional_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINT_Divisional_Comments__C() {
        return intDivisionalCommentsC;
    }

    /**
     * Sets the value of the int_Divisional_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINT_Divisional_Comments__C(String value) {
        this.intDivisionalCommentsC = value;
    }

    /**
     * Gets the value of the in_Active_No_Longer_W_District__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIn_Active_No_Longer_W_District__C() {
        return inActiveNoLongerWDistrictC;
    }

    /**
     * Sets the value of the in_Active_No_Longer_W_District__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIn_Active_No_Longer_W_District__C(Boolean value) {
        this.inActiveNoLongerWDistrictC = value;
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
     * Gets the value of the job_Description_Contacts__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJob_Description_Contacts__C() {
        return jobDescriptionContactsC;
    }

    /**
     * Sets the value of the job_Description_Contacts__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJob_Description_Contacts__C(String value) {
        this.jobDescriptionContactsC = value;
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
     * Gets the value of the job_Title__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJob_Title__C() {
        return jobTitleC;
    }

    /**
     * Sets the value of the job_Title__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJob_Title__C(String value) {
        this.jobTitleC = value;
    }

    /**
     * Gets the value of the key_Decision_Maker__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKey_Decision_Maker__C() {
        return keyDecisionMakerC;
    }

    /**
     * Sets the value of the key_Decision_Maker__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKey_Decision_Maker__C(Boolean value) {
        this.keyDecisionMakerC = value;
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
     * Gets the value of the lastCURequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastCURequestDate() {
        return lastCURequestDate;
    }

    /**
     * Sets the value of the lastCURequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastCURequestDate(XMLGregorianCalendar value) {
        this.lastCURequestDate = value;
    }

    /**
     * Gets the value of the lastCUUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastCUUpdateDate() {
        return lastCUUpdateDate;
    }

    /**
     * Sets the value of the lastCUUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastCUUpdateDate(XMLGregorianCalendar value) {
        this.lastCUUpdateDate = value;
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
     * Gets the value of the lead_Rating_Icons__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLead_Rating_Icons__C() {
        return leadRatingIconsC;
    }

    /**
     * Sets the value of the lead_Rating_Icons__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLead_Rating_Icons__C(String value) {
        this.leadRatingIconsC = value;
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
     * Gets the value of the lead_Score_Campaign__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLead_Score_Campaign__C() {
        return leadScoreCampaignC;
    }

    /**
     * Sets the value of the lead_Score_Campaign__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLead_Score_Campaign__C(Double value) {
        this.leadScoreCampaignC = value;
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
     * Gets the value of the legacy_Contact_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacy_Contact_ID__C() {
        return legacyContactIDC;
    }

    /**
     * Sets the value of the legacy_Contact_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacy_Contact_ID__C(String value) {
        this.legacyContactIDC = value;
    }

    /**
     * Gets the value of the location__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation__C() {
        return locationC;
    }

    /**
     * Sets the value of the location__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation__C(String value) {
        this.locationC = value;
    }

    /**
     * Gets the value of the mcd_Divisional_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCD_Divisional_Comments__C() {
        return mcdDivisionalCommentsC;
    }

    /**
     * Sets the value of the mcd_Divisional_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCD_Divisional_Comments__C(String value) {
        this.mcdDivisionalCommentsC = value;
    }

    /**
     * Gets the value of the mdr_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMDR_Contact__C() {
        return mdrContactC;
    }

    /**
     * Sets the value of the mdr_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMDR_Contact__C(Boolean value) {
        this.mdrContactC = value;
    }

    /**
     * Gets the value of the mdr_First_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_First_Name__C() {
        return mdrFirstNameC;
    }

    /**
     * Sets the value of the mdr_First_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_First_Name__C(String value) {
        this.mdrFirstNameC = value;
    }

    /**
     * Gets the value of the mdr_Job_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_Job_Description__C() {
        return mdrJobDescriptionC;
    }

    /**
     * Sets the value of the mdr_Job_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_Job_Description__C(String value) {
        this.mdrJobDescriptionC = value;
    }

    /**
     * Gets the value of the mdr_Job_Discipline__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_Job_Discipline__C() {
        return mdrJobDisciplineC;
    }

    /**
     * Sets the value of the mdr_Job_Discipline__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_Job_Discipline__C(String value) {
        this.mdrJobDisciplineC = value;
    }

    /**
     * Gets the value of the mdr_Job_Function_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_Job_Function_Code__C() {
        return mdrJobFunctionCodeC;
    }

    /**
     * Sets the value of the mdr_Job_Function_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_Job_Function_Code__C(String value) {
        this.mdrJobFunctionCodeC = value;
    }

    /**
     * Gets the value of the mdr_Job_Role__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_Job_Role__C() {
        return mdrJobRoleC;
    }

    /**
     * Sets the value of the mdr_Job_Role__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_Job_Role__C(String value) {
        this.mdrJobRoleC = value;
    }

    /**
     * Gets the value of the mdr_Last_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_Last_Name__C() {
        return mdrLastNameC;
    }

    /**
     * Sets the value of the mdr_Last_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_Last_Name__C(String value) {
        this.mdrLastNameC = value;
    }

    /**
     * Gets the value of the mdr_Marketing_Email__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_Marketing_Email__C() {
        return mdrMarketingEmailC;
    }

    /**
     * Sets the value of the mdr_Marketing_Email__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_Marketing_Email__C(String value) {
        this.mdrMarketingEmailC = value;
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
     * Gets the value of the mdr_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_Status__C() {
        return mdrStatusC;
    }

    /**
     * Sets the value of the mdr_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_Status__C(String value) {
        this.mdrStatusC = value;
    }

    /**
     * Gets the value of the mail_Opt_Out__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMail_Opt_Out__C() {
        return mailOptOutC;
    }

    /**
     * Sets the value of the mail_Opt_Out__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMail_Opt_Out__C(Boolean value) {
        this.mailOptOutC = value;
    }

    /**
     * Gets the value of the mailingCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingCity() {
        return mailingCity;
    }

    /**
     * Sets the value of the mailingCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingCity(String value) {
        this.mailingCity = value;
    }

    /**
     * Gets the value of the mailingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingCountry() {
        return mailingCountry;
    }

    /**
     * Sets the value of the mailingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingCountry(String value) {
        this.mailingCountry = value;
    }

    /**
     * Gets the value of the mailingPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingPostalCode() {
        return mailingPostalCode;
    }

    /**
     * Sets the value of the mailingPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingPostalCode(String value) {
        this.mailingPostalCode = value;
    }

    /**
     * Gets the value of the mailingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingState() {
        return mailingState;
    }

    /**
     * Sets the value of the mailingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingState(String value) {
        this.mailingState = value;
    }

    /**
     * Gets the value of the mailingStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingStreet() {
        return mailingStreet;
    }

    /**
     * Sets the value of the mailingStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingStreet(String value) {
        this.mailingStreet = value;
    }

    /**
     * Gets the value of the manager__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager__C() {
        return managerC;
    }

    /**
     * Sets the value of the manager__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager__C(String value) {
        this.managerC = value;
    }

    /**
     * Gets the value of the manager__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getManager__R() {
        return managerR;
    }

    /**
     * Sets the value of the manager__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setManager__R(UserType value) {
        this.managerR = value;
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
     * Gets the value of the masterRecord property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getMasterRecord() {
        return masterRecord;
    }

    /**
     * Sets the value of the masterRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setMasterRecord(ContactType value) {
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
     * Gets the value of the nid_Eloqua__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNID_Eloqua__C() {
        return nidEloquaC;
    }

    /**
     * Sets the value of the nid_Eloqua__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNID_Eloqua__C(String value) {
        this.nidEloquaC = value;
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
     * Gets the value of the nickname__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname__C() {
        return nicknameC;
    }

    /**
     * Sets the value of the nickname__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname__C(String value) {
        this.nicknameC = value;
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
     * Gets the value of the oiRs2__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOIRs2__R() {
        return oiRs2R;
    }

    /**
     * Sets the value of the oiRs2__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOIRs2__R(QueryResult value) {
        this.oiRs2R = value;
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
     * Gets the value of the opportunities property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpportunities() {
        return opportunities;
    }

    /**
     * Sets the value of the opportunities property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpportunities(QueryResult value) {
        this.opportunities = value;
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
     * Gets the value of the opportunityContactRoles property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpportunityContactRoles() {
        return opportunityContactRoles;
    }

    /**
     * Sets the value of the opportunityContactRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpportunityContactRoles(QueryResult value) {
        this.opportunityContactRoles = value;
    }

    /**
     * Gets the value of the otherCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCity() {
        return otherCity;
    }

    /**
     * Sets the value of the otherCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCity(String value) {
        this.otherCity = value;
    }

    /**
     * Gets the value of the otherCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCountry() {
        return otherCountry;
    }

    /**
     * Sets the value of the otherCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCountry(String value) {
        this.otherCountry = value;
    }

    /**
     * Gets the value of the otherPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPhone() {
        return otherPhone;
    }

    /**
     * Sets the value of the otherPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPhone(String value) {
        this.otherPhone = value;
    }

    /**
     * Gets the value of the otherPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPostalCode() {
        return otherPostalCode;
    }

    /**
     * Sets the value of the otherPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPostalCode(String value) {
        this.otherPostalCode = value;
    }

    /**
     * Gets the value of the otherState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherState() {
        return otherState;
    }

    /**
     * Sets the value of the otherState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherState(String value) {
        this.otherState = value;
    }

    /**
     * Gets the value of the otherStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherStreet() {
        return otherStreet;
    }

    /**
     * Sets the value of the otherStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherStreet(String value) {
        this.otherStreet = value;
    }

    /**
     * Gets the value of the other_Address_Use_Expiration__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOther_Address_Use_Expiration__C() {
        return otherAddressUseExpirationC;
    }

    /**
     * Sets the value of the other_Address_Use_Expiration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOther_Address_Use_Expiration__C(XMLGregorianCalendar value) {
        this.otherAddressUseExpirationC = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setOwner(UserType value) {
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
     * Gets the value of the pid_Eloqua__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPID_Eloqua__C() {
        return pidEloquaC;
    }

    /**
     * Sets the value of the pid_Eloqua__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPID_Eloqua__C(String value) {
        this.pidEloquaC = value;
    }

    /**
     * Gets the value of the per_Diem_Forecasts__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getPer_Diem_Forecasts__R() {
        return perDiemForecastsR;
    }

    /**
     * Sets the value of the per_Diem_Forecasts__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setPer_Diem_Forecasts__R(QueryResult value) {
        this.perDiemForecastsR = value;
    }

    /**
     * Gets the value of the per_Diem_Plan_Form__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPer_Diem_Plan_Form__C() {
        return perDiemPlanFormC;
    }

    /**
     * Sets the value of the per_Diem_Plan_Form__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPer_Diem_Plan_Form__C(String value) {
        this.perDiemPlanFormC = value;
    }

    /**
     * Gets the value of the per_Diem_Plan_Form__R property.
     * 
     * @return
     *     possible object is
     *     {@link Per_Diem_Plan_Form__CType }
     *     
     */
    public Per_Diem_Plan_Form__CType getPer_Diem_Plan_Form__R() {
        return perDiemPlanFormR;
    }

    /**
     * Sets the value of the per_Diem_Plan_Form__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Per_Diem_Plan_Form__CType }
     *     
     */
    public void setPer_Diem_Plan_Form__R(Per_Diem_Plan_Form__CType value) {
        this.perDiemPlanFormR = value;
    }

    /**
     * Gets the value of the permissions_Administrator__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissions_Administrator__C() {
        return permissionsAdministratorC;
    }

    /**
     * Sets the value of the permissions_Administrator__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissions_Administrator__C(Boolean value) {
        this.permissionsAdministratorC = value;
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
     * Gets the value of the phoneExt__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneExt__C() {
        return phoneExtC;
    }

    /**
     * Sets the value of the phoneExt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneExt__C(String value) {
        this.phoneExtC = value;
    }

    /**
     * Gets the value of the preferred_City__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferred_City__C() {
        return preferredCityC;
    }

    /**
     * Sets the value of the preferred_City__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferred_City__C(String value) {
        this.preferredCityC = value;
    }

    /**
     * Gets the value of the preferred_Contact_Method__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferred_Contact_Method__C() {
        return preferredContactMethodC;
    }

    /**
     * Sets the value of the preferred_Contact_Method__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferred_Contact_Method__C(String value) {
        this.preferredContactMethodC = value;
    }

    /**
     * Gets the value of the preferred_Country__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferred_Country__C() {
        return preferredCountryC;
    }

    /**
     * Sets the value of the preferred_Country__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferred_Country__C(String value) {
        this.preferredCountryC = value;
    }

    /**
     * Gets the value of the preferred_State_Province__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferred_State_Province__C() {
        return preferredStateProvinceC;
    }

    /**
     * Sets the value of the preferred_State_Province__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferred_State_Province__C(String value) {
        this.preferredStateProvinceC = value;
    }

    /**
     * Gets the value of the preferred_Street__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferred_Street__C() {
        return preferredStreetC;
    }

    /**
     * Sets the value of the preferred_Street__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferred_Street__C(String value) {
        this.preferredStreetC = value;
    }

    /**
     * Gets the value of the preferred_Zip_Postal_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferred_Zip_Postal_Code__C() {
        return preferredZipPostalCodeC;
    }

    /**
     * Sets the value of the preferred_Zip_Postal_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferred_Zip_Postal_Code__C(String value) {
        this.preferredZipPostalCodeC = value;
    }

    /**
     * Gets the value of the presentation__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentation__C() {
        return presentationC;
    }

    /**
     * Sets the value of the presentation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentation__C(String value) {
        this.presentationC = value;
    }

    /**
     * Gets the value of the presentation__R property.
     * 
     * @return
     *     possible object is
     *     {@link Presentation__CType }
     *     
     */
    public Presentation__CType getPresentation__R() {
        return presentationR;
    }

    /**
     * Sets the value of the presentation__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Presentation__CType }
     *     
     */
    public void setPresentation__R(Presentation__CType value) {
        this.presentationR = value;
    }

    /**
     * Gets the value of the prevent_MDR_Update__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrevent_MDR_Update__C() {
        return preventMDRUpdateC;
    }

    /**
     * Sets the value of the prevent_MDR_Update__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrevent_MDR_Update__C(Boolean value) {
        this.preventMDRUpdateC = value;
    }

    /**
     * Gets the value of the prior_Contact_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrior_Contact_ID__C() {
        return priorContactIDC;
    }

    /**
     * Sets the value of the prior_Contact_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrior_Contact_ID__C(String value) {
        this.priorContactIDC = value;
    }

    /**
     * Gets the value of the prior_Contact_ID__R property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getPrior_Contact_ID__R() {
        return priorContactIDR;
    }

    /**
     * Sets the value of the prior_Contact_ID__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setPrior_Contact_ID__R(AccountType value) {
        this.priorContactIDR = value;
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
     * Gets the value of the productReference__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductReference__C() {
        return productReferenceC;
    }

    /**
     * Sets the value of the productReference__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductReference__C(String value) {
        this.productReferenceC = value;
    }

    /**
     * Gets the value of the professor_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessor_ID__C() {
        return professorIDC;
    }

    /**
     * Sets the value of the professor_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessor_ID__C(String value) {
        this.professorIDC = value;
    }

    /**
     * Gets the value of the project_Plans__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getProject_Plans__R() {
        return projectPlansR;
    }

    /**
     * Sets the value of the project_Plans__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setProject_Plans__R(QueryResult value) {
        this.projectPlansR = value;
    }

    /**
     * Gets the value of the r00N60000001PRPAEA4__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getR00N60000001PRPAEA4__R() {
        return r00N60000001PRPAEA4R;
    }

    /**
     * Sets the value of the r00N60000001PRPAEA4__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setR00N60000001PRPAEA4__R(QueryResult value) {
        this.r00N60000001PRPAEA4R = value;
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
     * Gets the value of the reference_Able__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReference_Able__C() {
        return referenceAbleC;
    }

    /**
     * Sets the value of the reference_Able__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReference_Able__C(Boolean value) {
        this.referenceAbleC = value;
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
     * Gets the value of the reportsTo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getReportsTo() {
        return reportsTo;
    }

    /**
     * Sets the value of the reportsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setReportsTo(ContactType value) {
        this.reportsTo = value;
    }

    /**
     * Gets the value of the reportsToId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportsToId() {
        return reportsToId;
    }

    /**
     * Sets the value of the reportsToId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportsToId(String value) {
        this.reportsToId = value;
    }

    /**
     * Gets the value of the reports_To__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReports_To__C() {
        return reportsToC;
    }

    /**
     * Sets the value of the reports_To__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReports_To__C(String value) {
        this.reportsToC = value;
    }

    /**
     * Gets the value of the reports_To__R property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getReports_To__R() {
        return reportsToR;
    }

    /**
     * Sets the value of the reports_To__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setReports_To__R(ContactType value) {
        this.reportsToR = value;
    }

    /**
     * Gets the value of the reviewer__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReviewer__C() {
        return reviewerC;
    }

    /**
     * Sets the value of the reviewer__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReviewer__C(Boolean value) {
        this.reviewerC = value;
    }

    /**
     * Gets the value of the role__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole__C() {
        return roleC;
    }

    /**
     * Sets the value of the role__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole__C(String value) {
        this.roleC = value;
    }

    /**
     * Gets the value of the sch_Divisional_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCH_Divisional_Comments__C() {
        return schDivisionalCommentsC;
    }

    /**
     * Sets the value of the sch_Divisional_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCH_Divisional_Comments__C(String value) {
        this.schDivisionalCommentsC = value;
    }

    /**
     * Gets the value of the st_SIEBEL_ACC_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getST_SIEBEL_ACC_ID__C() {
        return stSIEBELACCIDC;
    }

    /**
     * Sets the value of the st_SIEBEL_ACC_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setST_SIEBEL_ACC_ID__C(String value) {
        this.stSIEBELACCIDC = value;
    }

    /**
     * Gets the value of the st_SIEBEL_CONTACT_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getST_SIEBEL_CONTACT_ID__C() {
        return stSIEBELCONTACTIDC;
    }

    /**
     * Sets the value of the st_SIEBEL_CONTACT_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setST_SIEBEL_CONTACT_ID__C(String value) {
        this.stSIEBELCONTACTIDC = value;
    }

    /**
     * Gets the value of the salesReference__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesReference__C() {
        return salesReferenceC;
    }

    /**
     * Sets the value of the salesReference__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesReference__C(String value) {
        this.salesReferenceC = value;
    }

    /**
     * Gets the value of the sales_Plan__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Plan__C() {
        return salesPlanC;
    }

    /**
     * Sets the value of the sales_Plan__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Plan__C(String value) {
        this.salesPlanC = value;
    }

    /**
     * Gets the value of the sales_Plan__R property.
     * 
     * @return
     *     possible object is
     *     {@link Sales_Plan__CType }
     *     
     */
    public Sales_Plan__CType getSales_Plan__R() {
        return salesPlanR;
    }

    /**
     * Sets the value of the sales_Plan__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sales_Plan__CType }
     *     
     */
    public void setSales_Plan__R(Sales_Plan__CType value) {
        this.salesPlanR = value;
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
     * Gets the value of the schoolName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolName__C() {
        return schoolNameC;
    }

    /**
     * Sets the value of the schoolName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolName__C(String value) {
        this.schoolNameC = value;
    }

    /**
     * Gets the value of the season__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeason__C() {
        return seasonC;
    }

    /**
     * Sets the value of the season__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeason__C(String value) {
        this.seasonC = value;
    }

    /**
     * Gets the value of the secondary_Role__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondary_Role__C() {
        return secondaryRoleC;
    }

    /**
     * Sets the value of the secondary_Role__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondary_Role__C(String value) {
        this.secondaryRoleC = value;
    }

    /**
     * Gets the value of the serviceRequestTentativeAttendees_Del__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getServiceRequestTentativeAttendees_Del__R() {
        return serviceRequestTentativeAttendeesDelR;
    }

    /**
     * Sets the value of the serviceRequestTentativeAttendees_Del__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setServiceRequestTentativeAttendees_Del__R(QueryResult value) {
        this.serviceRequestTentativeAttendeesDelR = value;
    }

    /**
     * Gets the value of the service_Request_Forms__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getService_Request_Forms__R() {
        return serviceRequestFormsR;
    }

    /**
     * Sets the value of the service_Request_Forms__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setService_Request_Forms__R(QueryResult value) {
        this.serviceRequestFormsR = value;
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
     * Gets the value of the skills_Tutor_Role__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkills_Tutor_Role__C() {
        return skillsTutorRoleC;
    }

    /**
     * Sets the value of the skills_Tutor_Role__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkills_Tutor_Role__C(String value) {
        this.skillsTutorRoleC = value;
    }

    /**
     * Gets the value of the special_Interest__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecial_Interest__C() {
        return specialInterestC;
    }

    /**
     * Sets the value of the special_Interest__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecial_Interest__C(String value) {
        this.specialInterestC = value;
    }

    /**
     * Gets the value of the spouse__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouse__C() {
        return spouseC;
    }

    /**
     * Sets the value of the spouse__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouse__C(String value) {
        this.spouseC = value;
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
     * Gets the value of the subDistrict__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDistrict__C() {
        return subDistrictC;
    }

    /**
     * Sets the value of the subDistrict__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDistrict__C(String value) {
        this.subDistrictC = value;
    }

    /**
     * Gets the value of the sub_Discipline__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub_Discipline__C() {
        return subDisciplineC;
    }

    /**
     * Sets the value of the sub_Discipline__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub_Discipline__C(String value) {
        this.subDisciplineC = value;
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
     * Gets the value of the trd_Divisional_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRD_Divisional_Comments__C() {
        return trdDivisionalCommentsC;
    }

    /**
     * Sets the value of the trd_Divisional_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRD_Divisional_Comments__C(String value) {
        this.trdDivisionalCommentsC = value;
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
     * Gets the value of the tenure__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTenure__C() {
        return tenureC;
    }

    /**
     * Sets the value of the tenure__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTenure__C(Double value) {
        this.tenureC = value;
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
     * Gets the value of the to_Time__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo_Time__C() {
        return toTimeC;
    }

    /**
     * Sets the value of the to_Time__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo_Time__C(String value) {
        this.toTimeC = value;
    }

    /**
     * Gets the value of the web_Form__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeb_Form__C() {
        return webFormC;
    }

    /**
     * Sets the value of the web_Form__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeb_Form__C(Boolean value) {
        this.webFormC = value;
    }

    /**
     * Gets the value of the x2Nd_Asst_Email__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX2Nd_Asst_Email__C() {
        return x2NdAsstEmailC;
    }

    /**
     * Sets the value of the x2Nd_Asst_Email__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX2Nd_Asst_Email__C(String value) {
        this.x2NdAsstEmailC = value;
    }

    /**
     * Gets the value of the x2Nd_Asst_Phone__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX2Nd_Asst_Phone__C() {
        return x2NdAsstPhoneC;
    }

    /**
     * Sets the value of the x2Nd_Asst_Phone__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX2Nd_Asst_Phone__C(String value) {
        this.x2NdAsstPhoneC = value;
    }

    /**
     * Gets the value of the x2Nd_Asst__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX2Nd_Asst__C() {
        return x2NdAsstC;
    }

    /**
     * Sets the value of the x2Nd_Asst__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX2Nd_Asst__C(String value) {
        this.x2NdAsstC = value;
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
