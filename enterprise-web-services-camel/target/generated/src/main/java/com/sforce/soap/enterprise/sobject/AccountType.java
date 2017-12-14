
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="A2K__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AP_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="A_E_Data_Set_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountContactRoles" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPartnersFrom" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="AccountPartnersTo" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="AccountTeamMembers" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Account_Group_HMD__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account_Group_SCH__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account_Group_SUP__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account_Group__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account_Order_History1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Account_Order_History2__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Account_Order_History__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Account_Profiles__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Account_Rank_HMD__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Account_Rank_SCG__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Account_Rank_SCH__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Account_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Accounts1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Accounts2__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Accounts__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="AcctDivFormula__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Adult_Ed_Account_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Alliance_District_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Assets" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="At_Risk__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Avg_Revenue_HMHLT__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Avg_Revenue_Primary__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Avg_Revenue_Riverside__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Avg_Revenue_Secondary__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Avg_Revenue_Supplemental__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Avg_Revenue_Total__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Bandwidth__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Benchmark_Assessment_Install_Yr__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Benchmark_Assessment__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COL_Divisional_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COMS_Account_NUM__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COR_Divisional_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CP_Ship_To_Override__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CP_Sold_To_Override__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Calendar_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Campus__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cases" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Catalog_Types__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Channel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Charter_School_Count__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Charter_School_Indicator__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Closed_District_Adoption_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Closed_District_for_Emails_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="College_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="College_NACS_Number__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Contacts" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Contacts1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Content_Filter_Caching_Software__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content_Management_System_Install_Yr__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content_Management_System__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contracts" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="County__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Course_Management_System__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Credit_Hold__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Current_District_Total__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Current_Pupil__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Class__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Platform__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DD_DI__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DD_Item_Bank__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DD_Module__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DD_Report_Card__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DI_Lead__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="DI_Lead__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="DI_Servcie_Level__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DI_Temp__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="DI_Temp__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="DataIntegration__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataLoadedonCollumn__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataScanner_Site__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataScanner_Student__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Quality_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Quality_Score__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Data_Quality__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Set_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Source__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Transport__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Warehouse_Assessment_Analytics__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Whse_Asmt_Analytics_Install_Yr__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount_Level__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="District_Account__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="District_Proxy__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Division" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Division_s__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Do_Not_Call__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Do_Not_Sample__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Drop_Shipments__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="EGood_Fulfillments__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ELA_Performance_Trend__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Elementary_School_Count__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Email_Contact__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Email_Opt_Out__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="English_Language_Learner_Count__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Enrolled_Schools__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Enrolled_Students__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Enrollment_Rank__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Enrollment_Rating__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enrollment__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Enterprise_Last_Modified_By__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enterprise_Last_Modified_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Enterprise_Riverside_Account_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Events" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ExamView__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FY09_SIG_Eligible__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FY09_SIG_Model_Chosen__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FY09_SIG_Winner__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FY10_SIG_Eligible__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FY10_SIG_Model_Chosen__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FY10_SIG_Winner__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Feeds" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Firewall__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Formative_Assessment_App_Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Formative_Assessment_App_Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="Formative_Assessment_App_Install_Yr__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Formative_Assessment_App_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Formative_System_Enhancement_Requests__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Free_Reduced_Lunch_Count__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Funding_Allocations__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Funding_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GPV_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GRT_Divisional_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="General_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Generic_ID_Setting__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Grade_Book_Install_Yr__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Grade_Book__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Grade_Range__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Grades__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Graduation_Rate_Trend__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Graduation_Rate_URL__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HIT_Divisional_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HMD_Data_Set_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HMH_House_Account__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HMH_Market_Share_Rank__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HMH_Market_Share__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HMH_Pupil_Expend_HMHLT_Rank__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HMH_Pupil_Expend_HMHLT__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HMH_Pupil_Expend_Primary_Rank__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HMH_Pupil_Expend_Primary__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HMH_Pupil_Expend_Riverside_Rank__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HMH_Pupil_Expend_Riverside__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HMH_Pupil_Expend_Secondary_Rank__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HMH_Pupil_Expend_Secondary__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HMH_Pupil_Expend_Supp_Rank__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HMH_Pupil_Expend_Supplemental__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HMH_Pupil_Expend_Total_Rank__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HMH_Pupil_Expend_Total__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HMH_Total_Revenue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="High_Grade__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="High_School_Count__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Home_School_Account_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IB_School_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IDEA_Stimulus__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ID_Display_Preference__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IIE_Data_Set_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IIE_Inside_Account_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IIE_Strategic_Account_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="INT_Divisional_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISA_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Import_Demographics__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Import_Test__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inside_PNP_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Inside_Sales_Account_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Institution_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Instructional_Technology_Support_Dept__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntermediateAgency__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Internal_Account_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Internet_Available__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Item_Banks_Install_Yr__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Item_Banks__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Jigsaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="K__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="KenTest4s__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="KenTest_Prototype_WIN_s__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="KenTests__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="LAUSD_Excluded__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastHighStakesUpdate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastRosterUpdate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Learning_Management_System_Install_Yr__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Learning_Management_System__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Legacy_Source_Id__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lifestyle__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Local_High_Stakes_Test__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Low_Grade__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MCD_Divisional_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_Account_Close_Date__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_Account_Open_Date__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_All_Instruct_Materials_Expend__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MDR_Apple_Computers_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_Apple_Computers_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_College_Bound_Percent__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MDR_County_Code__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MDR_Enrollment_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_File_Type_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_File_Type_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_Household_Income_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_Household_Income_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_Market_Power__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_PC_Computers_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_PC_Computers_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_PID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_Poverty_Level_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_Poverty_Level_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_School_Class_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_School_Class_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_School_Type_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_School_Type_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDR_Title2_Allocation__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MDR_Universal_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MDTPenabled__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Magnet__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Mail_Opt_Out__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Market_Comments__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="MasterRecord" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="MasterRecordId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Math_Performance_Trend__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Merge_Account_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Middle_School_Count__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ModuleBench__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModuleState__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModuleTT__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Module_Curriculum_Management__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NCES_Id__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NCES_Locale_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Non_Basal_Curriculum_Program__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Non_Basal_Curriculum_User__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Notable_Recent_Events__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OIRs1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OIRs__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Office_Front_or_Back__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Office_Lock__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Online_Testing__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpenActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opportunities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpportunityPartnersTo" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opps_Orders_Proposals1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opps_Orders_Proposals__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Other_Email__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Other_Fax__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Other_Phone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Other_School_Count__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Other_Website__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Overall_Budget__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PD_Management__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PK__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Parent" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="ParentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Parent_Account_County__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parent_Account_Enrollment__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Parent_Current_District_Total__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Parent_Current_Pupil__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parent_Enrollment_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parent_Enrollment__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Parent_MDR_File_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parent_Market_Power__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parent_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parent_PID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parent_Title_1_per_Pupil__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parent_View__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Part_Time_Enrollment__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PartnersFrom" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="PartnersTo" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Percent_Asian__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Percent_Black__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Percent_Hispanic__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Percent_Native_American__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Percent_White__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Performance_Source_URL__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Planning_Priority__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PnP_Account_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Poverty_Percent__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Pref_School_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prefferred_Location__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Presentations__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Private_School_Type_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Private_School_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Process_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Products_In_Use__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Professional_Development_Partners__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Professional_Development_Type_in_Use__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Professional_Development_Yr_Implemented__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Profile_Analyst_User__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Profile_Analyst_User__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="R00N60000001PRP8EAO__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Race_to_the_Top__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Range_of_IBMs__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Range_of_Macs__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reclaim_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RecordType" type="{urn:sobject.enterprise.soap.sforce.com}RecordType" minOccurs="0"/>
 *         &lt;element name="RecordTypeId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Related_MDR_Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Related_MDR_Account__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="Related_Profile_Parent_Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Related_Profile_Parent_Account__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="Related_SAP_Primary_Account__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reseller_2008_HMH_Revenue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Reseller_2009_HMH_Revenue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Reseller_Account_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Reseller_Adherence_to_HMH_Policies__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Reseller_Areas_of_Interest__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reseller_Business_Terms__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reseller_Channels__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reseller_Data_Transmission_Method__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reseller_Divisions__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reseller_Geography_Covered__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reseller_Key_Contact_Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reseller_Minimum_Margin__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Reseller_Organization__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reseller_Ownership__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reseller_Print_Technology__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reseller_Product_Type_Sold__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reseller_Sales_Model__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reseller_Seasonality__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reseller_Sell_Through_Data_Available__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Risk_Marker__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Roster_Update_History__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Routing_Instructions__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAN__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Customer_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Customer__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Email__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCH_Data_Set_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCH_Divisional_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SFDC_Territories__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SFTP_User__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SFTP_Username__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUP_Data_Set_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SV_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SY10_11_SIG_Funding__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SY11_12_SIG_Funding__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sales_2010_HMD__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sales_2010_IIE__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sales_2010_RPC__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sales_2010_SCG__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sales_2010_SCH__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sales_2011_HMD__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sales_2011_IIE__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sales_2011_RPC__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sales_2011_SCG__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sales_2011_SCH__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Sales_Plan_Users__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="School_Association__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="School_Class_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="School_Improvement_Grant__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="School_Supply_Account_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="School_System__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="School_Type_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="School_Type_Grade_Range__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="School_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="School_Year__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Self_Contained__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Senior_A_M__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Senior_A_M__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="Service_Group__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Request_Forms__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Share_Demographics__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shares" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ShippingCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Address_Street_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping_Address_Street_3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Source__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State_High_Stakes_Test__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Strategic_Account_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Student_Computers__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Student_Information_System_Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Student_Information_System_Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="Student_Information_System_Install_Yr__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Student_Information_System_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub_Abuse_Program__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subjects__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TRD_Divisional_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Target_Account__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Teacher_Count__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Technology_Platform_Infrastructure__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Technology_per_Student__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Territory_ADULT_ED__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Territory_A_E__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Territory_Assignment_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Territory_Financial_Details__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Territory_HMD__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Territory_HMHLT__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Territory_SAXON__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Territory_SCH__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Territory_SKILLS_TUTOR__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Territory_SUPP__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Territory__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Territory_s__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Testing_Start_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Testing_Window__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title_1_per_Pupil_District__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Title_1_per_Pupil__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title_I_Stimulus__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Title_I_Whole_Allocation__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Top_100_Account__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TotalDistrictEnrollment__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalSchoolsinDistrict__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Total_Federal_Revenue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Total_Local_Revenue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Total_School_Count__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Total_State_Revenue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type_of_Student_ID_loaded__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ultimate_Parent_Current_Pupil__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ultimate_Parent_Enrollment_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ultimate_Parent_Enrollment__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Ultimate_Parent_MDR_File_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ultimate_Parent_PID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ultimate_Parent_Title_1_per_Pupil__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unassigned_Sales__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Unique_Student_Codes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unique_Teacher_Codes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Username__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Using_Edusoft_IP_Address__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Validator_User__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vote_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="X10__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="X11__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="X12__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="X1__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="X21st_Century_Community_Learning__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="X2__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="X3__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="X3rd_Party_Distributor_Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="X3rd_Party_Distributor_Account__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="X4__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="X5__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="X6__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="X7__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="X8__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="X9__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="experianqas__Updated_Touchpoints_Timestamp__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="experianqas__Updated_Touchpoints__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="file_type_code_desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num_of_IBMs__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num_of_MACs__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="of_Schools_Loaded__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="of_Students_Loaded__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="per_Student__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "a2KC",
    "apCommentsC",
    "aEDataSetNameC",
    "accountContactRoles",
    "accountNumber",
    "accountPartnersFrom",
    "accountPartnersTo",
    "accountTeamMembers",
    "accountGroupHMDC",
    "accountGroupSCHC",
    "accountGroupSUPC",
    "accountGroupC",
    "accountOrderHistory1R",
    "accountOrderHistory2R",
    "accountOrderHistoryR",
    "accountProfilesR",
    "accountRankHMDC",
    "accountRankSCGC",
    "accountRankSCHC",
    "accountStatusC",
    "accountTypeC",
    "accounts1R",
    "accounts2R",
    "accountsR",
    "acctDivFormulaC",
    "activityHistories",
    "adultEdAccountFlagC",
    "allianceDistrictFlagC",
    "assets",
    "atRiskC",
    "attachments",
    "avgRevenueHMHLTC",
    "avgRevenuePrimaryC",
    "avgRevenueRiversideC",
    "avgRevenueSecondaryC",
    "avgRevenueSupplementalC",
    "avgRevenueTotalC",
    "bandwidthC",
    "benchmarkAssessmentInstallYrC",
    "benchmarkAssessmentC",
    "billingCity",
    "billingCountry",
    "billingPostalCode",
    "billingState",
    "billingStreet",
    "colDivisionalCommentsC",
    "comsAccountNUMC",
    "corDivisionalCommentsC",
    "cpShipToOverrideC",
    "cpSoldToOverrideC",
    "calendarCodeC",
    "campusC",
    "cases",
    "catalogTypesC",
    "channelC",
    "charterSchoolCountC",
    "charterSchoolIndicatorC",
    "closedDistrictAdoptionFlagC",
    "closedDistrictForEmailsFlagC",
    "collegeCodeC",
    "collegeNACSNumberC",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "contacts",
    "contacts1R",
    "contentFilterCachingSoftwareC",
    "contentManagementSystemInstallYrC",
    "contentManagementSystemC",
    "contracts",
    "countyC",
    "courseManagementSystemC",
    "createdBy",
    "createdById",
    "createdDate",
    "creditHoldC",
    "currentDistrictTotalC",
    "currentPupilC",
    "customerClassC",
    "customerPlatformC",
    "customerTypeC",
    "ddDIC",
    "ddItemBankC",
    "ddModuleC",
    "ddReportCardC",
    "diLeadC",
    "diLeadR",
    "diServcieLevelC",
    "diTempC",
    "diTempR",
    "dataIntegrationC",
    "dataLoadedonCollumnC",
    "dataScannerSiteC",
    "dataScannerStudentC",
    "dataQualityDescriptionC",
    "dataQualityScoreC",
    "dataQualityC",
    "dataSetNameC",
    "dataSourceC",
    "dataTransportC",
    "dataWarehouseAssessmentAnalyticsC",
    "dataWhseAsmtAnalyticsInstallYrC",
    "description",
    "discountLevelC",
    "districtAccountC",
    "districtProxyC",
    "division",
    "divisionSC",
    "doNotCallC",
    "doNotSampleC",
    "dropShipmentsR",
    "eGoodFulfillmentsR",
    "elaPerformanceTrendC",
    "elementarySchoolCountC",
    "emailContactC",
    "emailOptOutC",
    "englishLanguageLearnerCountC",
    "enrolledSchoolsC",
    "enrolledStudentsC",
    "enrollmentRankC",
    "enrollmentRatingC",
    "enrollmentC",
    "enterpriseLastModifiedByC",
    "enterpriseLastModifiedDateC",
    "enterpriseRiversideAccountStatusC",
    "events",
    "examViewC",
    "fy09SIGEligibleC",
    "fy09SIGModelChosenC",
    "fy09SIGWinnerC",
    "fy10SIGEligibleC",
    "fy10SIGModelChosenC",
    "fy10SIGWinnerC",
    "fax",
    "feedSubscriptionsForEntity",
    "feeds",
    "firewallC",
    "formativeAssessmentAppContactC",
    "formativeAssessmentAppContactR",
    "formativeAssessmentAppInstallYrC",
    "formativeAssessmentAppNameC",
    "formativeSystemEnhancementRequestsR",
    "freeReducedLunchCountC",
    "fundingAllocationsR",
    "fundingCommentsC",
    "gpvAmountC",
    "grtDivisionalCommentsC",
    "generalCommentsC",
    "genericIDSettingC",
    "gradeBookInstallYrC",
    "gradeBookC",
    "gradeRangeC",
    "gradesC",
    "graduationRateTrendC",
    "graduationRateURLC",
    "hitDivisionalCommentsC",
    "hmdDataSetNameC",
    "hmhHouseAccountC",
    "hmhMarketShareRankC",
    "hmhMarketShareC",
    "hmhPupilExpendHMHLTRankC",
    "hmhPupilExpendHMHLTC",
    "hmhPupilExpendPrimaryRankC",
    "hmhPupilExpendPrimaryC",
    "hmhPupilExpendRiversideRankC",
    "hmhPupilExpendRiversideC",
    "hmhPupilExpendSecondaryRankC",
    "hmhPupilExpendSecondaryC",
    "hmhPupilExpendSuppRankC",
    "hmhPupilExpendSupplementalC",
    "hmhPupilExpendTotalRankC",
    "hmhPupilExpendTotalC",
    "hmhTotalRevenueC",
    "highGradeC",
    "highSchoolCountC",
    "histories",
    "homeSchoolAccountFlagC",
    "ibSchoolFlagC",
    "ideaStimulusC",
    "idDisplayPreferenceC",
    "iieDataSetNameC",
    "iieInsideAccountFlagC",
    "iieStrategicAccountFlagC",
    "intDivisionalCommentsC",
    "isaIDC",
    "importDemographicsC",
    "importTestC",
    "industry",
    "insidePNPFlagC",
    "insideSalesAccountFlagC",
    "institutionTypeC",
    "instructionalTechnologySupportDeptC",
    "intermediateAgencyC",
    "internalAccountIDC",
    "internetAvailableC",
    "isDeleted",
    "itemBanksInstallYrC",
    "itemBanksC",
    "jigsaw",
    "kC",
    "kenTest4SR",
    "kenTestPrototypeWINSR",
    "kenTestsR",
    "lausdExcludedC",
    "lastActivityDate",
    "lastHighStakesUpdateC",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastRosterUpdateC",
    "learningManagementSystemInstallYrC",
    "learningManagementSystemC",
    "legacySourceIdC",
    "lifestyleC",
    "localHighStakesTestC",
    "locationCodeC",
    "lowGradeC",
    "mcdDivisionalCommentsC",
    "mdrAccountCloseDateC",
    "mdrAccountOpenDateC",
    "mdrAllInstructMaterialsExpendC",
    "mdrAppleComputersCodeC",
    "mdrAppleComputersDescC",
    "mdrCollegeBoundPercentC",
    "mdrCountyCodeC",
    "mdrEnrollmentCodeC",
    "mdrFileTypeCodeC",
    "mdrFileTypeDescC",
    "mdrHouseholdIncomeCodeC",
    "mdrHouseholdIncomeDescC",
    "mdrMarketPowerC",
    "mdrPCComputersCodeC",
    "mdrPCComputersDescC",
    "mdrPIDC",
    "mdrPovertyLevelCodeC",
    "mdrPovertyLevelDescC",
    "mdrSchoolClassCodeC",
    "mdrSchoolClassDescC",
    "mdrSchoolTypeCodeC",
    "mdrSchoolTypeDescC",
    "mdrTitle2AllocationC",
    "mdrUniversalCodeC",
    "mdtPenabledC",
    "magnetC",
    "mailOptOutC",
    "marketCommentsR",
    "masterRecord",
    "masterRecordId",
    "mathPerformanceTrendC",
    "mergeAccountIDC",
    "middleSchoolCountC",
    "moduleBenchC",
    "moduleStateC",
    "moduleTTC",
    "moduleCurriculumManagementC",
    "ncesIdC",
    "ncesLocaleDescC",
    "name",
    "nonBasalCurriculumProgramC",
    "nonBasalCurriculumUserC",
    "notableRecentEventsC",
    "notes",
    "notesAndAttachments",
    "oiRs1R",
    "oiRsR",
    "officeFrontOrBackC",
    "officeLockC",
    "onlineTestingC",
    "openActivities",
    "opportunities",
    "opportunityPartnersTo",
    "oppsOrdersProposals1R",
    "oppsOrdersProposalsR",
    "otherEmailC",
    "otherFaxC",
    "otherPhoneC",
    "otherSchoolCountC",
    "otherWebsiteC",
    "overallBudgetC",
    "owner",
    "ownerId",
    "pdManagementC",
    "pidC",
    "pkC",
    "parent",
    "parentId",
    "parentAccountCountyC",
    "parentAccountEnrollmentC",
    "parentCurrentDistrictTotalC",
    "parentCurrentPupilC",
    "parentEnrollmentCodeC",
    "parentEnrollmentC",
    "parentMDRFileTypeC",
    "parentMarketPowerC",
    "parentNameC",
    "parentPIDC",
    "parentTitle1PerPupilC",
    "parentViewC",
    "partTimeEnrollmentC",
    "partnersFrom",
    "partnersTo",
    "percentAsianC",
    "percentBlackC",
    "percentHispanicC",
    "percentNativeAmericanC",
    "percentWhiteC",
    "performanceSourceURLC",
    "phone",
    "planningPriorityC",
    "pnPAccountFlagC",
    "povertyPercentC",
    "prefSchoolNameC",
    "prefferredLocationC",
    "presentationsR",
    "privateSchoolTypeCommentsC",
    "privateSchoolTypeC",
    "processInstances",
    "processSteps",
    "processTypeC",
    "productsInUseR",
    "professionalDevelopmentPartnersC",
    "professionalDevelopmentTypeInUseC",
    "professionalDevelopmentYrImplementedC",
    "profileAnalystUserC",
    "profileAnalystUserR",
    "r00N60000001PRP8EAOR",
    "raceToTheTopC",
    "rangeOfIBMsC",
    "rangeOfMacsC",
    "reclaimDateC",
    "recordType",
    "recordTypeId",
    "relatedMDRAccountC",
    "relatedMDRAccountR",
    "relatedProfileParentAccountC",
    "relatedProfileParentAccountR",
    "relatedSAPPrimaryAccountC",
    "reseller2008HMHRevenueC",
    "reseller2009HMHRevenueC",
    "resellerAccountFlagC",
    "resellerAdherenceToHMHPoliciesC",
    "resellerAreasOfInterestC",
    "resellerBusinessTermsC",
    "resellerChannelsC",
    "resellerDataTransmissionMethodC",
    "resellerDivisionsC",
    "resellerGeographyCoveredC",
    "resellerKeyContactNotesC",
    "resellerMinimumMarginC",
    "resellerOrganizationC",
    "resellerOwnershipC",
    "resellerPrintTechnologyC",
    "resellerProductTypeSoldC",
    "resellerSalesModelC",
    "resellerSeasonalityC",
    "resellerSellThroughDataAvailableC",
    "riskMarkerC",
    "rosterUpdateHistoryC",
    "routingInstructionsC",
    "sanC",
    "sapCommentsC",
    "sapCustomerTypeC",
    "sapCustomerC",
    "sapEmailC",
    "schDataSetNameC",
    "schDivisionalCommentsC",
    "sfdcTerritoriesC",
    "sftpUserC",
    "sftpUsernameC",
    "supDataSetNameC",
    "svAmountC",
    "sy1011SIGFundingC",
    "sy1112SIGFundingC",
    "sales2010HMDC",
    "sales2010IIEC",
    "sales2010RPCC",
    "sales2010SCGC",
    "sales2010SCHC",
    "sales2011HMDC",
    "sales2011IIEC",
    "sales2011RPCC",
    "sales2011SCGC",
    "sales2011SCHC",
    "salesPlanUsersR",
    "schoolAssociationC",
    "schoolClassCodeC",
    "schoolImprovementGrantC",
    "schoolSupplyAccountFlagC",
    "schoolSystemC",
    "schoolTypeCodeC",
    "schoolTypeGradeRangeC",
    "schoolTypeC",
    "schoolYearC",
    "selfContainedC",
    "seniorAMC",
    "seniorAMR",
    "serviceGroupC",
    "serviceRequestFormsR",
    "shareDemographicsC",
    "shares",
    "shippingCity",
    "shippingCountry",
    "shippingPostalCode",
    "shippingState",
    "shippingStreet",
    "shippingAddressStreet2C",
    "shippingAddressStreet3C",
    "site",
    "siteC",
    "sourceC",
    "stateHighStakesTestC",
    "strategicAccountFlagC",
    "studentComputersC",
    "studentInformationSystemContactC",
    "studentInformationSystemContactR",
    "studentInformationSystemInstallYrC",
    "studentInformationSystemNameC",
    "subAbuseProgramC",
    "subjectsC",
    "systemModstamp",
    "trdDivisionalCommentsC",
    "targetAccountC",
    "tasks",
    "teacherCountC",
    "technologyPlatformInfrastructureC",
    "technologyPerStudentC",
    "territoryADULTEDC",
    "territoryAEC",
    "territoryAssignmentCodeC",
    "territoryFinancialDetailsR",
    "territoryHMDC",
    "territoryHMHLTC",
    "territorySAXONC",
    "territorySCHC",
    "territorySKILLSTUTORC",
    "territorySUPPC",
    "territoryC",
    "territorySC",
    "testingStartDateC",
    "testingWindowC",
    "title1PerPupilDistrictC",
    "title1PerPupilC",
    "title2C",
    "titleIStimulusC",
    "titleIWholeAllocationC",
    "top100AccountC",
    "totalDistrictEnrollmentC",
    "totalSchoolsinDistrictC",
    "totalFederalRevenueC",
    "totalLocalRevenueC",
    "totalSchoolCountC",
    "totalStateRevenueC",
    "type",
    "typeOfStudentIDLoadedC",
    "ultimateParentCurrentPupilC",
    "ultimateParentEnrollmentCodeC",
    "ultimateParentEnrollmentC",
    "ultimateParentMDRFileTypeC",
    "ultimateParentPIDC",
    "ultimateParentTitle1PerPupilC",
    "unassignedSalesR",
    "uniqueStudentCodesC",
    "uniqueTeacherCodesC",
    "usernameC",
    "usingEdusoftIPAddressC",
    "validatorUserC",
    "voteTypeC",
    "website",
    "x10C",
    "x11C",
    "x12C",
    "x1C",
    "x21StCenturyCommunityLearningC",
    "x2C",
    "x3C",
    "x3RdPartyDistributorAccountC",
    "x3RdPartyDistributorAccountR",
    "x4C",
    "x5C",
    "x6C",
    "x7C",
    "x8C",
    "x9C",
    "experianqasUpdatedTouchpointsTimestampC",
    "experianqasUpdatedTouchpointsC",
    "fileTypeCodeDescC",
    "numOfIBMsC",
    "numOfMACsC",
    "ofSchoolsLoadedC",
    "ofStudentsLoadedC",
    "perStudentC"
})
public class AccountType
    extends SObjectType
{

    @XmlElement(name = "A2K__c", nillable = true)
    protected String a2KC;
    @XmlElement(name = "AP_Comments__c", nillable = true)
    protected String apCommentsC;
    @XmlElement(name = "A_E_Data_Set_Name__c", nillable = true)
    protected String aEDataSetNameC;
    @XmlElement(name = "AccountContactRoles", nillable = true)
    protected QueryResult accountContactRoles;
    @XmlElement(name = "AccountNumber", nillable = true)
    protected String accountNumber;
    @XmlElement(name = "AccountPartnersFrom", nillable = true)
    protected QueryResult accountPartnersFrom;
    @XmlElement(name = "AccountPartnersTo", nillable = true)
    protected QueryResult accountPartnersTo;
    @XmlElement(name = "AccountTeamMembers", nillable = true)
    protected QueryResult accountTeamMembers;
    @XmlElement(name = "Account_Group_HMD__c", nillable = true)
    protected String accountGroupHMDC;
    @XmlElement(name = "Account_Group_SCH__c", nillable = true)
    protected String accountGroupSCHC;
    @XmlElement(name = "Account_Group_SUP__c", nillable = true)
    protected String accountGroupSUPC;
    @XmlElement(name = "Account_Group__c", nillable = true)
    protected String accountGroupC;
    @XmlElement(name = "Account_Order_History1__r", nillable = true)
    protected QueryResult accountOrderHistory1R;
    @XmlElement(name = "Account_Order_History2__r", nillable = true)
    protected QueryResult accountOrderHistory2R;
    @XmlElement(name = "Account_Order_History__r", nillable = true)
    protected QueryResult accountOrderHistoryR;
    @XmlElement(name = "Account_Profiles__r", nillable = true)
    protected QueryResult accountProfilesR;
    @XmlElement(name = "Account_Rank_HMD__c", nillable = true)
    protected Double accountRankHMDC;
    @XmlElement(name = "Account_Rank_SCG__c", nillable = true)
    protected Double accountRankSCGC;
    @XmlElement(name = "Account_Rank_SCH__c", nillable = true)
    protected Double accountRankSCHC;
    @XmlElement(name = "Account_Status__c", nillable = true)
    protected String accountStatusC;
    @XmlElement(name = "Account_Type__c", nillable = true)
    protected String accountTypeC;
    @XmlElement(name = "Accounts1__r", nillable = true)
    protected QueryResult accounts1R;
    @XmlElement(name = "Accounts2__r", nillable = true)
    protected QueryResult accounts2R;
    @XmlElement(name = "Accounts__r", nillable = true)
    protected QueryResult accountsR;
    @XmlElement(name = "AcctDivFormula__c", nillable = true)
    protected String acctDivFormulaC;
    @XmlElement(name = "ActivityHistories", nillable = true)
    protected QueryResult activityHistories;
    @XmlElement(name = "Adult_Ed_Account_Flag__c", nillable = true)
    protected Boolean adultEdAccountFlagC;
    @XmlElement(name = "Alliance_District_Flag__c", nillable = true)
    protected Boolean allianceDistrictFlagC;
    @XmlElement(name = "Assets", nillable = true)
    protected QueryResult assets;
    @XmlElement(name = "At_Risk__c", nillable = true)
    protected Boolean atRiskC;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "Avg_Revenue_HMHLT__c", nillable = true)
    protected Double avgRevenueHMHLTC;
    @XmlElement(name = "Avg_Revenue_Primary__c", nillable = true)
    protected Double avgRevenuePrimaryC;
    @XmlElement(name = "Avg_Revenue_Riverside__c", nillable = true)
    protected Double avgRevenueRiversideC;
    @XmlElement(name = "Avg_Revenue_Secondary__c", nillable = true)
    protected Double avgRevenueSecondaryC;
    @XmlElement(name = "Avg_Revenue_Supplemental__c", nillable = true)
    protected Double avgRevenueSupplementalC;
    @XmlElement(name = "Avg_Revenue_Total__c", nillable = true)
    protected Double avgRevenueTotalC;
    @XmlElement(name = "Bandwidth__c", nillable = true)
    protected String bandwidthC;
    @XmlElement(name = "Benchmark_Assessment_Install_Yr__c", nillable = true)
    protected String benchmarkAssessmentInstallYrC;
    @XmlElement(name = "Benchmark_Assessment__c", nillable = true)
    protected String benchmarkAssessmentC;
    @XmlElement(name = "BillingCity", nillable = true)
    protected String billingCity;
    @XmlElement(name = "BillingCountry", nillable = true)
    protected String billingCountry;
    @XmlElement(name = "BillingPostalCode", nillable = true)
    protected String billingPostalCode;
    @XmlElement(name = "BillingState", nillable = true)
    protected String billingState;
    @XmlElement(name = "BillingStreet", nillable = true)
    protected String billingStreet;
    @XmlElement(name = "COL_Divisional_Comments__c", nillable = true)
    protected String colDivisionalCommentsC;
    @XmlElement(name = "COMS_Account_NUM__c", nillable = true)
    protected String comsAccountNUMC;
    @XmlElement(name = "COR_Divisional_Comments__c", nillable = true)
    protected String corDivisionalCommentsC;
    @XmlElement(name = "CP_Ship_To_Override__c", nillable = true)
    protected String cpShipToOverrideC;
    @XmlElement(name = "CP_Sold_To_Override__c", nillable = true)
    protected String cpSoldToOverrideC;
    @XmlElement(name = "Calendar_Code__c", nillable = true)
    protected String calendarCodeC;
    @XmlElement(name = "Campus__c", nillable = true)
    protected String campusC;
    @XmlElement(name = "Cases", nillable = true)
    protected QueryResult cases;
    @XmlElement(name = "Catalog_Types__c", nillable = true)
    protected String catalogTypesC;
    @XmlElement(name = "Channel__c", nillable = true)
    protected String channelC;
    @XmlElement(name = "Charter_School_Count__c", nillable = true)
    protected Double charterSchoolCountC;
    @XmlElement(name = "Charter_School_Indicator__c", nillable = true)
    protected String charterSchoolIndicatorC;
    @XmlElement(name = "Closed_District_Adoption_Flag__c", nillable = true)
    protected Boolean closedDistrictAdoptionFlagC;
    @XmlElement(name = "Closed_District_for_Emails_Flag__c", nillable = true)
    protected Boolean closedDistrictForEmailsFlagC;
    @XmlElement(name = "College_Code__c", nillable = true)
    protected String collegeCodeC;
    @XmlElement(name = "College_NACS_Number__c", nillable = true)
    protected String collegeNACSNumberC;
    @XmlElement(name = "ConnectionReceived", nillable = true)
    protected PartnerNetworkConnectionType connectionReceived;
    @XmlElement(name = "ConnectionReceivedId", nillable = true)
    protected String connectionReceivedId;
    @XmlElement(name = "ConnectionSent", nillable = true)
    protected PartnerNetworkConnectionType connectionSent;
    @XmlElement(name = "ConnectionSentId", nillable = true)
    protected String connectionSentId;
    @XmlElement(name = "Contacts", nillable = true)
    protected QueryResult contacts;
    @XmlElement(name = "Contacts1__r", nillable = true)
    protected QueryResult contacts1R;
    @XmlElement(name = "Content_Filter_Caching_Software__c", nillable = true)
    protected String contentFilterCachingSoftwareC;
    @XmlElement(name = "Content_Management_System_Install_Yr__c", nillable = true)
    protected String contentManagementSystemInstallYrC;
    @XmlElement(name = "Content_Management_System__c", nillable = true)
    protected String contentManagementSystemC;
    @XmlElement(name = "Contracts", nillable = true)
    protected QueryResult contracts;
    @XmlElement(name = "County__c", nillable = true)
    protected String countyC;
    @XmlElement(name = "Course_Management_System__c", nillable = true)
    protected String courseManagementSystemC;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Credit_Hold__c", nillable = true)
    protected Boolean creditHoldC;
    @XmlElement(name = "Current_District_Total__c", nillable = true)
    protected Double currentDistrictTotalC;
    @XmlElement(name = "Current_Pupil__c", nillable = true)
    protected String currentPupilC;
    @XmlElement(name = "Customer_Class__c", nillable = true)
    protected String customerClassC;
    @XmlElement(name = "Customer_Platform__c", nillable = true)
    protected String customerPlatformC;
    @XmlElement(name = "Customer_Type__c", nillable = true)
    protected String customerTypeC;
    @XmlElement(name = "DD_DI__c", nillable = true)
    protected String ddDIC;
    @XmlElement(name = "DD_Item_Bank__c", nillable = true)
    protected String ddItemBankC;
    @XmlElement(name = "DD_Module__c", nillable = true)
    protected String ddModuleC;
    @XmlElement(name = "DD_Report_Card__c", nillable = true)
    protected String ddReportCardC;
    @XmlElement(name = "DI_Lead__c", nillable = true)
    protected String diLeadC;
    @XmlElement(name = "DI_Lead__r", nillable = true)
    protected UserType diLeadR;
    @XmlElement(name = "DI_Servcie_Level__c", nillable = true)
    protected String diServcieLevelC;
    @XmlElement(name = "DI_Temp__c", nillable = true)
    protected String diTempC;
    @XmlElement(name = "DI_Temp__r", nillable = true)
    protected UserType diTempR;
    @XmlElement(name = "DataIntegration__c", nillable = true)
    protected String dataIntegrationC;
    @XmlElement(name = "DataLoadedonCollumn__c", nillable = true)
    protected String dataLoadedonCollumnC;
    @XmlElement(name = "DataScanner_Site__c", nillable = true)
    protected String dataScannerSiteC;
    @XmlElement(name = "DataScanner_Student__c", nillable = true)
    protected String dataScannerStudentC;
    @XmlElement(name = "Data_Quality_Description__c", nillable = true)
    protected String dataQualityDescriptionC;
    @XmlElement(name = "Data_Quality_Score__c", nillable = true)
    protected Double dataQualityScoreC;
    @XmlElement(name = "Data_Quality__c", nillable = true)
    protected String dataQualityC;
    @XmlElement(name = "Data_Set_Name__c", nillable = true)
    protected String dataSetNameC;
    @XmlElement(name = "Data_Source__c", nillable = true)
    protected String dataSourceC;
    @XmlElement(name = "Data_Transport__c", nillable = true)
    protected String dataTransportC;
    @XmlElement(name = "Data_Warehouse_Assessment_Analytics__c", nillable = true)
    protected String dataWarehouseAssessmentAnalyticsC;
    @XmlElement(name = "Data_Whse_Asmt_Analytics_Install_Yr__c", nillable = true)
    protected String dataWhseAsmtAnalyticsInstallYrC;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "Discount_Level__c", nillable = true)
    protected Double discountLevelC;
    @XmlElement(name = "District_Account__c", nillable = true)
    protected String districtAccountC;
    @XmlElement(name = "District_Proxy__c", nillable = true)
    protected String districtProxyC;
    @XmlElement(name = "Division", nillable = true)
    protected String division;
    @XmlElement(name = "Division_s__c", nillable = true)
    protected String divisionSC;
    @XmlElement(name = "Do_Not_Call__c", nillable = true)
    protected Boolean doNotCallC;
    @XmlElement(name = "Do_Not_Sample__c", nillable = true)
    protected String doNotSampleC;
    @XmlElement(name = "Drop_Shipments__r", nillable = true)
    protected QueryResult dropShipmentsR;
    @XmlElement(name = "EGood_Fulfillments__r", nillable = true)
    protected QueryResult eGoodFulfillmentsR;
    @XmlElement(name = "ELA_Performance_Trend__c", nillable = true)
    protected Double elaPerformanceTrendC;
    @XmlElement(name = "Elementary_School_Count__c", nillable = true)
    protected Double elementarySchoolCountC;
    @XmlElement(name = "Email_Contact__c", nillable = true)
    protected Boolean emailContactC;
    @XmlElement(name = "Email_Opt_Out__c", nillable = true)
    protected Boolean emailOptOutC;
    @XmlElement(name = "English_Language_Learner_Count__c", nillable = true)
    protected Double englishLanguageLearnerCountC;
    @XmlElement(name = "Enrolled_Schools__c", nillable = true)
    protected Double enrolledSchoolsC;
    @XmlElement(name = "Enrolled_Students__c", nillable = true)
    protected Double enrolledStudentsC;
    @XmlElement(name = "Enrollment_Rank__c", nillable = true)
    protected Double enrollmentRankC;
    @XmlElement(name = "Enrollment_Rating__c", nillable = true)
    protected String enrollmentRatingC;
    @XmlElement(name = "Enrollment__c", nillable = true)
    protected Double enrollmentC;
    @XmlElement(name = "Enterprise_Last_Modified_By__c", nillable = true)
    protected String enterpriseLastModifiedByC;
    @XmlElement(name = "Enterprise_Last_Modified_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enterpriseLastModifiedDateC;
    @XmlElement(name = "Enterprise_Riverside_Account_Status__c", nillable = true)
    protected String enterpriseRiversideAccountStatusC;
    @XmlElement(name = "Events", nillable = true)
    protected QueryResult events;
    @XmlElement(name = "ExamView__c", nillable = true)
    protected String examViewC;
    @XmlElement(name = "FY09_SIG_Eligible__c", nillable = true)
    protected Boolean fy09SIGEligibleC;
    @XmlElement(name = "FY09_SIG_Model_Chosen__c", nillable = true)
    protected String fy09SIGModelChosenC;
    @XmlElement(name = "FY09_SIG_Winner__c", nillable = true)
    protected Boolean fy09SIGWinnerC;
    @XmlElement(name = "FY10_SIG_Eligible__c", nillable = true)
    protected Boolean fy10SIGEligibleC;
    @XmlElement(name = "FY10_SIG_Model_Chosen__c", nillable = true)
    protected String fy10SIGModelChosenC;
    @XmlElement(name = "FY10_SIG_Winner__c", nillable = true)
    protected Boolean fy10SIGWinnerC;
    @XmlElement(name = "Fax", nillable = true)
    protected String fax;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "Feeds", nillable = true)
    protected QueryResult feeds;
    @XmlElement(name = "Firewall__c", nillable = true)
    protected String firewallC;
    @XmlElement(name = "Formative_Assessment_App_Contact__c", nillable = true)
    protected String formativeAssessmentAppContactC;
    @XmlElement(name = "Formative_Assessment_App_Contact__r", nillable = true)
    protected ContactType formativeAssessmentAppContactR;
    @XmlElement(name = "Formative_Assessment_App_Install_Yr__c", nillable = true)
    protected String formativeAssessmentAppInstallYrC;
    @XmlElement(name = "Formative_Assessment_App_Name__c", nillable = true)
    protected String formativeAssessmentAppNameC;
    @XmlElement(name = "Formative_System_Enhancement_Requests__r", nillable = true)
    protected QueryResult formativeSystemEnhancementRequestsR;
    @XmlElement(name = "Free_Reduced_Lunch_Count__c", nillable = true)
    protected Double freeReducedLunchCountC;
    @XmlElement(name = "Funding_Allocations__r", nillable = true)
    protected QueryResult fundingAllocationsR;
    @XmlElement(name = "Funding_Comments__c", nillable = true)
    protected String fundingCommentsC;
    @XmlElement(name = "GPV_Amount__c", nillable = true)
    protected Double gpvAmountC;
    @XmlElement(name = "GRT_Divisional_Comments__c", nillable = true)
    protected String grtDivisionalCommentsC;
    @XmlElement(name = "General_Comments__c", nillable = true)
    protected String generalCommentsC;
    @XmlElement(name = "Generic_ID_Setting__c", nillable = true)
    protected String genericIDSettingC;
    @XmlElement(name = "Grade_Book_Install_Yr__c", nillable = true)
    protected String gradeBookInstallYrC;
    @XmlElement(name = "Grade_Book__c", nillable = true)
    protected String gradeBookC;
    @XmlElement(name = "Grade_Range__c", nillable = true)
    protected String gradeRangeC;
    @XmlElement(name = "Grades__c", nillable = true)
    protected String gradesC;
    @XmlElement(name = "Graduation_Rate_Trend__c", nillable = true)
    protected Double graduationRateTrendC;
    @XmlElement(name = "Graduation_Rate_URL__c", nillable = true)
    protected String graduationRateURLC;
    @XmlElement(name = "HIT_Divisional_Comments__c", nillable = true)
    protected String hitDivisionalCommentsC;
    @XmlElement(name = "HMD_Data_Set_Name__c", nillable = true)
    protected String hmdDataSetNameC;
    @XmlElement(name = "HMH_House_Account__c", nillable = true)
    protected Boolean hmhHouseAccountC;
    @XmlElement(name = "HMH_Market_Share_Rank__c", nillable = true)
    protected Double hmhMarketShareRankC;
    @XmlElement(name = "HMH_Market_Share__c", nillable = true)
    protected Double hmhMarketShareC;
    @XmlElement(name = "HMH_Pupil_Expend_HMHLT_Rank__c", nillable = true)
    protected Double hmhPupilExpendHMHLTRankC;
    @XmlElement(name = "HMH_Pupil_Expend_HMHLT__c", nillable = true)
    protected Double hmhPupilExpendHMHLTC;
    @XmlElement(name = "HMH_Pupil_Expend_Primary_Rank__c", nillable = true)
    protected Double hmhPupilExpendPrimaryRankC;
    @XmlElement(name = "HMH_Pupil_Expend_Primary__c", nillable = true)
    protected Double hmhPupilExpendPrimaryC;
    @XmlElement(name = "HMH_Pupil_Expend_Riverside_Rank__c", nillable = true)
    protected Double hmhPupilExpendRiversideRankC;
    @XmlElement(name = "HMH_Pupil_Expend_Riverside__c", nillable = true)
    protected Double hmhPupilExpendRiversideC;
    @XmlElement(name = "HMH_Pupil_Expend_Secondary_Rank__c", nillable = true)
    protected Double hmhPupilExpendSecondaryRankC;
    @XmlElement(name = "HMH_Pupil_Expend_Secondary__c", nillable = true)
    protected Double hmhPupilExpendSecondaryC;
    @XmlElement(name = "HMH_Pupil_Expend_Supp_Rank__c", nillable = true)
    protected Double hmhPupilExpendSuppRankC;
    @XmlElement(name = "HMH_Pupil_Expend_Supplemental__c", nillable = true)
    protected Double hmhPupilExpendSupplementalC;
    @XmlElement(name = "HMH_Pupil_Expend_Total_Rank__c", nillable = true)
    protected Double hmhPupilExpendTotalRankC;
    @XmlElement(name = "HMH_Pupil_Expend_Total__c", nillable = true)
    protected Double hmhPupilExpendTotalC;
    @XmlElement(name = "HMH_Total_Revenue__c", nillable = true)
    protected Double hmhTotalRevenueC;
    @XmlElement(name = "High_Grade__c", nillable = true)
    protected String highGradeC;
    @XmlElement(name = "High_School_Count__c", nillable = true)
    protected Double highSchoolCountC;
    @XmlElement(name = "Histories", nillable = true)
    protected QueryResult histories;
    @XmlElement(name = "Home_School_Account_Flag__c", nillable = true)
    protected Boolean homeSchoolAccountFlagC;
    @XmlElement(name = "IB_School_Flag__c", nillable = true)
    protected Boolean ibSchoolFlagC;
    @XmlElement(name = "IDEA_Stimulus__c", nillable = true)
    protected Double ideaStimulusC;
    @XmlElement(name = "ID_Display_Preference__c", nillable = true)
    protected String idDisplayPreferenceC;
    @XmlElement(name = "IIE_Data_Set_Name__c", nillable = true)
    protected String iieDataSetNameC;
    @XmlElement(name = "IIE_Inside_Account_Flag__c", nillable = true)
    protected Boolean iieInsideAccountFlagC;
    @XmlElement(name = "IIE_Strategic_Account_Flag__c", nillable = true)
    protected Boolean iieStrategicAccountFlagC;
    @XmlElement(name = "INT_Divisional_Comments__c", nillable = true)
    protected String intDivisionalCommentsC;
    @XmlElement(name = "ISA_ID__c", nillable = true)
    protected String isaIDC;
    @XmlElement(name = "Import_Demographics__c", nillable = true)
    protected String importDemographicsC;
    @XmlElement(name = "Import_Test__c", nillable = true)
    protected String importTestC;
    @XmlElement(name = "Industry", nillable = true)
    protected String industry;
    @XmlElement(name = "Inside_PNP_Flag__c", nillable = true)
    protected Boolean insidePNPFlagC;
    @XmlElement(name = "Inside_Sales_Account_Flag__c", nillable = true)
    protected Boolean insideSalesAccountFlagC;
    @XmlElement(name = "Institution_Type__c", nillable = true)
    protected String institutionTypeC;
    @XmlElement(name = "Instructional_Technology_Support_Dept__c", nillable = true)
    protected String instructionalTechnologySupportDeptC;
    @XmlElement(name = "IntermediateAgency__c", nillable = true)
    protected String intermediateAgencyC;
    @XmlElement(name = "Internal_Account_ID__c", nillable = true)
    protected String internalAccountIDC;
    @XmlElement(name = "Internet_Available__c", nillable = true)
    protected String internetAvailableC;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "Item_Banks_Install_Yr__c", nillable = true)
    protected String itemBanksInstallYrC;
    @XmlElement(name = "Item_Banks__c", nillable = true)
    protected String itemBanksC;
    @XmlElement(name = "Jigsaw", nillable = true)
    protected String jigsaw;
    @XmlElement(name = "K__c", nillable = true)
    protected Double kC;
    @XmlElement(name = "KenTest4s__r", nillable = true)
    protected QueryResult kenTest4SR;
    @XmlElement(name = "KenTest_Prototype_WIN_s__r", nillable = true)
    protected QueryResult kenTestPrototypeWINSR;
    @XmlElement(name = "KenTests__r", nillable = true)
    protected QueryResult kenTestsR;
    @XmlElement(name = "LAUSD_Excluded__c", nillable = true)
    protected Boolean lausdExcludedC;
    @XmlElement(name = "LastActivityDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastActivityDate;
    @XmlElement(name = "LastHighStakesUpdate__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastHighStakesUpdateC;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "LastRosterUpdate__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastRosterUpdateC;
    @XmlElement(name = "Learning_Management_System_Install_Yr__c", nillable = true)
    protected String learningManagementSystemInstallYrC;
    @XmlElement(name = "Learning_Management_System__c", nillable = true)
    protected String learningManagementSystemC;
    @XmlElement(name = "Legacy_Source_Id__c", nillable = true)
    protected String legacySourceIdC;
    @XmlElement(name = "Lifestyle__c", nillable = true)
    protected String lifestyleC;
    @XmlElement(name = "Local_High_Stakes_Test__c", nillable = true)
    protected String localHighStakesTestC;
    @XmlElement(name = "Location_Code__c", nillable = true)
    protected String locationCodeC;
    @XmlElement(name = "Low_Grade__c", nillable = true)
    protected String lowGradeC;
    @XmlElement(name = "MCD_Divisional_Comments__c", nillable = true)
    protected String mcdDivisionalCommentsC;
    @XmlElement(name = "MDR_Account_Close_Date__c", nillable = true)
    protected String mdrAccountCloseDateC;
    @XmlElement(name = "MDR_Account_Open_Date__c", nillable = true)
    protected String mdrAccountOpenDateC;
    @XmlElement(name = "MDR_All_Instruct_Materials_Expend__c", nillable = true)
    protected Double mdrAllInstructMaterialsExpendC;
    @XmlElement(name = "MDR_Apple_Computers_Code__c", nillable = true)
    protected String mdrAppleComputersCodeC;
    @XmlElement(name = "MDR_Apple_Computers_Desc__c", nillable = true)
    protected String mdrAppleComputersDescC;
    @XmlElement(name = "MDR_College_Bound_Percent__c", nillable = true)
    protected Double mdrCollegeBoundPercentC;
    @XmlElement(name = "MDR_County_Code__c", nillable = true)
    protected Double mdrCountyCodeC;
    @XmlElement(name = "MDR_Enrollment_Code__c", nillable = true)
    protected String mdrEnrollmentCodeC;
    @XmlElement(name = "MDR_File_Type_Code__c", nillable = true)
    protected String mdrFileTypeCodeC;
    @XmlElement(name = "MDR_File_Type_Desc__c", nillable = true)
    protected String mdrFileTypeDescC;
    @XmlElement(name = "MDR_Household_Income_Code__c", nillable = true)
    protected String mdrHouseholdIncomeCodeC;
    @XmlElement(name = "MDR_Household_Income_Desc__c", nillable = true)
    protected String mdrHouseholdIncomeDescC;
    @XmlElement(name = "MDR_Market_Power__c", nillable = true)
    protected String mdrMarketPowerC;
    @XmlElement(name = "MDR_PC_Computers_Code__c", nillable = true)
    protected String mdrPCComputersCodeC;
    @XmlElement(name = "MDR_PC_Computers_Desc__c", nillable = true)
    protected String mdrPCComputersDescC;
    @XmlElement(name = "MDR_PID__c", nillable = true)
    protected String mdrPIDC;
    @XmlElement(name = "MDR_Poverty_Level_Code__c", nillable = true)
    protected String mdrPovertyLevelCodeC;
    @XmlElement(name = "MDR_Poverty_Level_Desc__c", nillable = true)
    protected String mdrPovertyLevelDescC;
    @XmlElement(name = "MDR_School_Class_Code__c", nillable = true)
    protected String mdrSchoolClassCodeC;
    @XmlElement(name = "MDR_School_Class_Desc__c", nillable = true)
    protected String mdrSchoolClassDescC;
    @XmlElement(name = "MDR_School_Type_Code__c", nillable = true)
    protected String mdrSchoolTypeCodeC;
    @XmlElement(name = "MDR_School_Type_Desc__c", nillable = true)
    protected String mdrSchoolTypeDescC;
    @XmlElement(name = "MDR_Title2_Allocation__c", nillable = true)
    protected Double mdrTitle2AllocationC;
    @XmlElement(name = "MDR_Universal_Code__c", nillable = true)
    protected String mdrUniversalCodeC;
    @XmlElement(name = "MDTPenabled__c", nillable = true)
    protected String mdtPenabledC;
    @XmlElement(name = "Magnet__c", nillable = true)
    protected Boolean magnetC;
    @XmlElement(name = "Mail_Opt_Out__c", nillable = true)
    protected Boolean mailOptOutC;
    @XmlElement(name = "Market_Comments__r", nillable = true)
    protected QueryResult marketCommentsR;
    @XmlElement(name = "MasterRecord", nillable = true)
    protected AccountType masterRecord;
    @XmlElement(name = "MasterRecordId", nillable = true)
    protected String masterRecordId;
    @XmlElement(name = "Math_Performance_Trend__c", nillable = true)
    protected Double mathPerformanceTrendC;
    @XmlElement(name = "Merge_Account_ID__c", nillable = true)
    protected String mergeAccountIDC;
    @XmlElement(name = "Middle_School_Count__c", nillable = true)
    protected Double middleSchoolCountC;
    @XmlElement(name = "ModuleBench__c", nillable = true)
    protected String moduleBenchC;
    @XmlElement(name = "ModuleState__c", nillable = true)
    protected String moduleStateC;
    @XmlElement(name = "ModuleTT__c", nillable = true)
    protected String moduleTTC;
    @XmlElement(name = "Module_Curriculum_Management__c", nillable = true)
    protected String moduleCurriculumManagementC;
    @XmlElement(name = "NCES_Id__c", nillable = true)
    protected String ncesIdC;
    @XmlElement(name = "NCES_Locale_Desc__c", nillable = true)
    protected String ncesLocaleDescC;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Non_Basal_Curriculum_Program__c", nillable = true)
    protected String nonBasalCurriculumProgramC;
    @XmlElement(name = "Non_Basal_Curriculum_User__c", nillable = true)
    protected Boolean nonBasalCurriculumUserC;
    @XmlElement(name = "Notable_Recent_Events__c", nillable = true)
    protected String notableRecentEventsC;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "OIRs1__r", nillable = true)
    protected QueryResult oiRs1R;
    @XmlElement(name = "OIRs__r", nillable = true)
    protected QueryResult oiRsR;
    @XmlElement(name = "Office_Front_or_Back__c", nillable = true)
    protected String officeFrontOrBackC;
    @XmlElement(name = "Office_Lock__c", nillable = true)
    protected Boolean officeLockC;
    @XmlElement(name = "Online_Testing__c", nillable = true)
    protected String onlineTestingC;
    @XmlElement(name = "OpenActivities", nillable = true)
    protected QueryResult openActivities;
    @XmlElement(name = "Opportunities", nillable = true)
    protected QueryResult opportunities;
    @XmlElement(name = "OpportunityPartnersTo", nillable = true)
    protected QueryResult opportunityPartnersTo;
    @XmlElement(name = "Opps_Orders_Proposals1__r", nillable = true)
    protected QueryResult oppsOrdersProposals1R;
    @XmlElement(name = "Opps_Orders_Proposals__r", nillable = true)
    protected QueryResult oppsOrdersProposalsR;
    @XmlElement(name = "Other_Email__c", nillable = true)
    protected String otherEmailC;
    @XmlElement(name = "Other_Fax__c", nillable = true)
    protected String otherFaxC;
    @XmlElement(name = "Other_Phone__c", nillable = true)
    protected String otherPhoneC;
    @XmlElement(name = "Other_School_Count__c", nillable = true)
    protected Double otherSchoolCountC;
    @XmlElement(name = "Other_Website__c", nillable = true)
    protected String otherWebsiteC;
    @XmlElement(name = "Overall_Budget__c", nillable = true)
    protected Double overallBudgetC;
    @XmlElement(name = "Owner", nillable = true)
    protected UserType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "PD_Management__c", nillable = true)
    protected String pdManagementC;
    @XmlElement(name = "PID__c", nillable = true)
    protected String pidC;
    @XmlElement(name = "PK__c", nillable = true)
    protected Double pkC;
    @XmlElement(name = "Parent", nillable = true)
    protected AccountType parent;
    @XmlElement(name = "ParentId", nillable = true)
    protected String parentId;
    @XmlElement(name = "Parent_Account_County__c", nillable = true)
    protected String parentAccountCountyC;
    @XmlElement(name = "Parent_Account_Enrollment__c", nillable = true)
    protected Double parentAccountEnrollmentC;
    @XmlElement(name = "Parent_Current_District_Total__c", nillable = true)
    protected Double parentCurrentDistrictTotalC;
    @XmlElement(name = "Parent_Current_Pupil__c", nillable = true)
    protected String parentCurrentPupilC;
    @XmlElement(name = "Parent_Enrollment_Code__c", nillable = true)
    protected String parentEnrollmentCodeC;
    @XmlElement(name = "Parent_Enrollment__c", nillable = true)
    protected Double parentEnrollmentC;
    @XmlElement(name = "Parent_MDR_File_Type__c", nillable = true)
    protected String parentMDRFileTypeC;
    @XmlElement(name = "Parent_Market_Power__c", nillable = true)
    protected String parentMarketPowerC;
    @XmlElement(name = "Parent_Name__c", nillable = true)
    protected String parentNameC;
    @XmlElement(name = "Parent_PID__c", nillable = true)
    protected String parentPIDC;
    @XmlElement(name = "Parent_Title_1_per_Pupil__c", nillable = true)
    protected String parentTitle1PerPupilC;
    @XmlElement(name = "Parent_View__c", nillable = true)
    protected String parentViewC;
    @XmlElement(name = "Part_Time_Enrollment__c", nillable = true)
    protected Double partTimeEnrollmentC;
    @XmlElement(name = "PartnersFrom", nillable = true)
    protected QueryResult partnersFrom;
    @XmlElement(name = "PartnersTo", nillable = true)
    protected QueryResult partnersTo;
    @XmlElement(name = "Percent_Asian__c", nillable = true)
    protected Double percentAsianC;
    @XmlElement(name = "Percent_Black__c", nillable = true)
    protected Double percentBlackC;
    @XmlElement(name = "Percent_Hispanic__c", nillable = true)
    protected Double percentHispanicC;
    @XmlElement(name = "Percent_Native_American__c", nillable = true)
    protected Double percentNativeAmericanC;
    @XmlElement(name = "Percent_White__c", nillable = true)
    protected Double percentWhiteC;
    @XmlElement(name = "Performance_Source_URL__c", nillable = true)
    protected String performanceSourceURLC;
    @XmlElement(name = "Phone", nillable = true)
    protected String phone;
    @XmlElement(name = "Planning_Priority__c", nillable = true)
    protected String planningPriorityC;
    @XmlElement(name = "PnP_Account_Flag__c", nillable = true)
    protected Boolean pnPAccountFlagC;
    @XmlElement(name = "Poverty_Percent__c", nillable = true)
    protected Double povertyPercentC;
    @XmlElement(name = "Pref_School_Name__c", nillable = true)
    protected String prefSchoolNameC;
    @XmlElement(name = "Prefferred_Location__c", nillable = true)
    protected String prefferredLocationC;
    @XmlElement(name = "Presentations__r", nillable = true)
    protected QueryResult presentationsR;
    @XmlElement(name = "Private_School_Type_Comments__c", nillable = true)
    protected String privateSchoolTypeCommentsC;
    @XmlElement(name = "Private_School_Type__c", nillable = true)
    protected String privateSchoolTypeC;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "Process_Type__c", nillable = true)
    protected String processTypeC;
    @XmlElement(name = "Products_In_Use__r", nillable = true)
    protected QueryResult productsInUseR;
    @XmlElement(name = "Professional_Development_Partners__c", nillable = true)
    protected String professionalDevelopmentPartnersC;
    @XmlElement(name = "Professional_Development_Type_in_Use__c", nillable = true)
    protected String professionalDevelopmentTypeInUseC;
    @XmlElement(name = "Professional_Development_Yr_Implemented__c", nillable = true)
    protected String professionalDevelopmentYrImplementedC;
    @XmlElement(name = "Profile_Analyst_User__c", nillable = true)
    protected String profileAnalystUserC;
    @XmlElement(name = "Profile_Analyst_User__r", nillable = true)
    protected UserType profileAnalystUserR;
    @XmlElement(name = "R00N60000001PRP8EAO__r", nillable = true)
    protected QueryResult r00N60000001PRP8EAOR;
    @XmlElement(name = "Race_to_the_Top__c", nillable = true)
    protected Double raceToTheTopC;
    @XmlElement(name = "Range_of_IBMs__c", nillable = true)
    protected String rangeOfIBMsC;
    @XmlElement(name = "Range_of_Macs__c", nillable = true)
    protected String rangeOfMacsC;
    @XmlElement(name = "Reclaim_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reclaimDateC;
    @XmlElement(name = "RecordType", nillable = true)
    protected RecordTypeType recordType;
    @XmlElement(name = "RecordTypeId", nillable = true)
    protected String recordTypeId;
    @XmlElement(name = "Related_MDR_Account__c", nillable = true)
    protected String relatedMDRAccountC;
    @XmlElement(name = "Related_MDR_Account__r", nillable = true)
    protected AccountType relatedMDRAccountR;
    @XmlElement(name = "Related_Profile_Parent_Account__c", nillable = true)
    protected String relatedProfileParentAccountC;
    @XmlElement(name = "Related_Profile_Parent_Account__r", nillable = true)
    protected AccountType relatedProfileParentAccountR;
    @XmlElement(name = "Related_SAP_Primary_Account__c", nillable = true)
    protected String relatedSAPPrimaryAccountC;
    @XmlElement(name = "Reseller_2008_HMH_Revenue__c", nillable = true)
    protected Double reseller2008HMHRevenueC;
    @XmlElement(name = "Reseller_2009_HMH_Revenue__c", nillable = true)
    protected Double reseller2009HMHRevenueC;
    @XmlElement(name = "Reseller_Account_Flag__c", nillable = true)
    protected Boolean resellerAccountFlagC;
    @XmlElement(name = "Reseller_Adherence_to_HMH_Policies__c", nillable = true)
    protected Boolean resellerAdherenceToHMHPoliciesC;
    @XmlElement(name = "Reseller_Areas_of_Interest__c", nillable = true)
    protected String resellerAreasOfInterestC;
    @XmlElement(name = "Reseller_Business_Terms__c", nillable = true)
    protected String resellerBusinessTermsC;
    @XmlElement(name = "Reseller_Channels__c", nillable = true)
    protected String resellerChannelsC;
    @XmlElement(name = "Reseller_Data_Transmission_Method__c", nillable = true)
    protected String resellerDataTransmissionMethodC;
    @XmlElement(name = "Reseller_Divisions__c", nillable = true)
    protected String resellerDivisionsC;
    @XmlElement(name = "Reseller_Geography_Covered__c", nillable = true)
    protected String resellerGeographyCoveredC;
    @XmlElement(name = "Reseller_Key_Contact_Notes__c", nillable = true)
    protected String resellerKeyContactNotesC;
    @XmlElement(name = "Reseller_Minimum_Margin__c", nillable = true)
    protected Double resellerMinimumMarginC;
    @XmlElement(name = "Reseller_Organization__c", nillable = true)
    protected String resellerOrganizationC;
    @XmlElement(name = "Reseller_Ownership__c", nillable = true)
    protected String resellerOwnershipC;
    @XmlElement(name = "Reseller_Print_Technology__c", nillable = true)
    protected String resellerPrintTechnologyC;
    @XmlElement(name = "Reseller_Product_Type_Sold__c", nillable = true)
    protected String resellerProductTypeSoldC;
    @XmlElement(name = "Reseller_Sales_Model__c", nillable = true)
    protected String resellerSalesModelC;
    @XmlElement(name = "Reseller_Seasonality__c", nillable = true)
    protected String resellerSeasonalityC;
    @XmlElement(name = "Reseller_Sell_Through_Data_Available__c", nillable = true)
    protected Boolean resellerSellThroughDataAvailableC;
    @XmlElement(name = "Risk_Marker__c", nillable = true)
    protected String riskMarkerC;
    @XmlElement(name = "Roster_Update_History__c", nillable = true)
    protected String rosterUpdateHistoryC;
    @XmlElement(name = "Routing_Instructions__c", nillable = true)
    protected String routingInstructionsC;
    @XmlElement(name = "SAN__c", nillable = true)
    protected String sanC;
    @XmlElement(name = "SAP_Comments__c", nillable = true)
    protected String sapCommentsC;
    @XmlElement(name = "SAP_Customer_Type__c", nillable = true)
    protected String sapCustomerTypeC;
    @XmlElement(name = "SAP_Customer__c", nillable = true)
    protected String sapCustomerC;
    @XmlElement(name = "SAP_Email__c", nillable = true)
    protected String sapEmailC;
    @XmlElement(name = "SCH_Data_Set_Name__c", nillable = true)
    protected String schDataSetNameC;
    @XmlElement(name = "SCH_Divisional_Comments__c", nillable = true)
    protected String schDivisionalCommentsC;
    @XmlElement(name = "SFDC_Territories__c", nillable = true)
    protected String sfdcTerritoriesC;
    @XmlElement(name = "SFTP_User__c", nillable = true)
    protected String sftpUserC;
    @XmlElement(name = "SFTP_Username__c", nillable = true)
    protected String sftpUsernameC;
    @XmlElement(name = "SUP_Data_Set_Name__c", nillable = true)
    protected String supDataSetNameC;
    @XmlElement(name = "SV_Amount__c", nillable = true)
    protected Double svAmountC;
    @XmlElement(name = "SY10_11_SIG_Funding__c", nillable = true)
    protected Double sy1011SIGFundingC;
    @XmlElement(name = "SY11_12_SIG_Funding__c", nillable = true)
    protected Double sy1112SIGFundingC;
    @XmlElement(name = "Sales_2010_HMD__c", nillable = true)
    protected Double sales2010HMDC;
    @XmlElement(name = "Sales_2010_IIE__c", nillable = true)
    protected Double sales2010IIEC;
    @XmlElement(name = "Sales_2010_RPC__c", nillable = true)
    protected Double sales2010RPCC;
    @XmlElement(name = "Sales_2010_SCG__c", nillable = true)
    protected Double sales2010SCGC;
    @XmlElement(name = "Sales_2010_SCH__c", nillable = true)
    protected Double sales2010SCHC;
    @XmlElement(name = "Sales_2011_HMD__c", nillable = true)
    protected Double sales2011HMDC;
    @XmlElement(name = "Sales_2011_IIE__c", nillable = true)
    protected Double sales2011IIEC;
    @XmlElement(name = "Sales_2011_RPC__c", nillable = true)
    protected Double sales2011RPCC;
    @XmlElement(name = "Sales_2011_SCG__c", nillable = true)
    protected Double sales2011SCGC;
    @XmlElement(name = "Sales_2011_SCH__c", nillable = true)
    protected Double sales2011SCHC;
    @XmlElement(name = "Sales_Plan_Users__r", nillable = true)
    protected QueryResult salesPlanUsersR;
    @XmlElement(name = "School_Association__c", nillable = true)
    protected String schoolAssociationC;
    @XmlElement(name = "School_Class_Code__c", nillable = true)
    protected String schoolClassCodeC;
    @XmlElement(name = "School_Improvement_Grant__c", nillable = true)
    protected Double schoolImprovementGrantC;
    @XmlElement(name = "School_Supply_Account_Flag__c", nillable = true)
    protected Boolean schoolSupplyAccountFlagC;
    @XmlElement(name = "School_System__c", nillable = true)
    protected String schoolSystemC;
    @XmlElement(name = "School_Type_Code__c", nillable = true)
    protected String schoolTypeCodeC;
    @XmlElement(name = "School_Type_Grade_Range__c", nillable = true)
    protected String schoolTypeGradeRangeC;
    @XmlElement(name = "School_Type__c", nillable = true)
    protected String schoolTypeC;
    @XmlElement(name = "School_Year__c", nillable = true)
    protected String schoolYearC;
    @XmlElement(name = "Self_Contained__c", nillable = true)
    protected Boolean selfContainedC;
    @XmlElement(name = "Senior_A_M__c", nillable = true)
    protected String seniorAMC;
    @XmlElement(name = "Senior_A_M__r", nillable = true)
    protected UserType seniorAMR;
    @XmlElement(name = "Service_Group__c", nillable = true)
    protected String serviceGroupC;
    @XmlElement(name = "Service_Request_Forms__r", nillable = true)
    protected QueryResult serviceRequestFormsR;
    @XmlElement(name = "Share_Demographics__c", nillable = true)
    protected String shareDemographicsC;
    @XmlElement(name = "Shares", nillable = true)
    protected QueryResult shares;
    @XmlElement(name = "ShippingCity", nillable = true)
    protected String shippingCity;
    @XmlElement(name = "ShippingCountry", nillable = true)
    protected String shippingCountry;
    @XmlElement(name = "ShippingPostalCode", nillable = true)
    protected String shippingPostalCode;
    @XmlElement(name = "ShippingState", nillable = true)
    protected String shippingState;
    @XmlElement(name = "ShippingStreet", nillable = true)
    protected String shippingStreet;
    @XmlElement(name = "Shipping_Address_Street_2__c", nillable = true)
    protected String shippingAddressStreet2C;
    @XmlElement(name = "Shipping_Address_Street_3__c", nillable = true)
    protected String shippingAddressStreet3C;
    @XmlElement(name = "Site", nillable = true)
    protected String site;
    @XmlElement(name = "Site__c", nillable = true)
    protected String siteC;
    @XmlElement(name = "Source__c", nillable = true)
    protected String sourceC;
    @XmlElement(name = "State_High_Stakes_Test__c", nillable = true)
    protected String stateHighStakesTestC;
    @XmlElement(name = "Strategic_Account_Flag__c", nillable = true)
    protected Boolean strategicAccountFlagC;
    @XmlElement(name = "Student_Computers__c", nillable = true)
    protected String studentComputersC;
    @XmlElement(name = "Student_Information_System_Contact__c", nillable = true)
    protected String studentInformationSystemContactC;
    @XmlElement(name = "Student_Information_System_Contact__r", nillable = true)
    protected ContactType studentInformationSystemContactR;
    @XmlElement(name = "Student_Information_System_Install_Yr__c", nillable = true)
    protected String studentInformationSystemInstallYrC;
    @XmlElement(name = "Student_Information_System_Name__c", nillable = true)
    protected String studentInformationSystemNameC;
    @XmlElement(name = "Sub_Abuse_Program__c", nillable = true)
    protected String subAbuseProgramC;
    @XmlElement(name = "Subjects__c", nillable = true)
    protected String subjectsC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TRD_Divisional_Comments__c", nillable = true)
    protected String trdDivisionalCommentsC;
    @XmlElement(name = "Target_Account__c", nillable = true)
    protected Boolean targetAccountC;
    @XmlElement(name = "Tasks", nillable = true)
    protected QueryResult tasks;
    @XmlElement(name = "Teacher_Count__c", nillable = true)
    protected Double teacherCountC;
    @XmlElement(name = "Technology_Platform_Infrastructure__c", nillable = true)
    protected String technologyPlatformInfrastructureC;
    @XmlElement(name = "Technology_per_Student__c", nillable = true)
    protected Double technologyPerStudentC;
    @XmlElement(name = "Territory_ADULT_ED__c", nillable = true)
    protected String territoryADULTEDC;
    @XmlElement(name = "Territory_A_E__c", nillable = true)
    protected String territoryAEC;
    @XmlElement(name = "Territory_Assignment_Code__c", nillable = true)
    protected String territoryAssignmentCodeC;
    @XmlElement(name = "Territory_Financial_Details__r", nillable = true)
    protected QueryResult territoryFinancialDetailsR;
    @XmlElement(name = "Territory_HMD__c", nillable = true)
    protected String territoryHMDC;
    @XmlElement(name = "Territory_HMHLT__c", nillable = true)
    protected String territoryHMHLTC;
    @XmlElement(name = "Territory_SAXON__c", nillable = true)
    protected String territorySAXONC;
    @XmlElement(name = "Territory_SCH__c", nillable = true)
    protected String territorySCHC;
    @XmlElement(name = "Territory_SKILLS_TUTOR__c", nillable = true)
    protected String territorySKILLSTUTORC;
    @XmlElement(name = "Territory_SUPP__c", nillable = true)
    protected String territorySUPPC;
    @XmlElement(name = "Territory__c", nillable = true)
    protected String territoryC;
    @XmlElement(name = "Territory_s__c", nillable = true)
    protected String territorySC;
    @XmlElement(name = "Testing_Start_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar testingStartDateC;
    @XmlElement(name = "Testing_Window__c", nillable = true)
    protected String testingWindowC;
    @XmlElement(name = "Title_1_per_Pupil_District__c", nillable = true)
    protected Double title1PerPupilDistrictC;
    @XmlElement(name = "Title_1_per_Pupil__c", nillable = true)
    protected String title1PerPupilC;
    @XmlElement(name = "Title_2__c", nillable = true)
    protected String title2C;
    @XmlElement(name = "Title_I_Stimulus__c", nillable = true)
    protected Double titleIStimulusC;
    @XmlElement(name = "Title_I_Whole_Allocation__c", nillable = true)
    protected Double titleIWholeAllocationC;
    @XmlElement(name = "Top_100_Account__c", nillable = true)
    protected Boolean top100AccountC;
    @XmlElement(name = "TotalDistrictEnrollment__c", nillable = true)
    protected Double totalDistrictEnrollmentC;
    @XmlElement(name = "TotalSchoolsinDistrict__c", nillable = true)
    protected Double totalSchoolsinDistrictC;
    @XmlElement(name = "Total_Federal_Revenue__c", nillable = true)
    protected Double totalFederalRevenueC;
    @XmlElement(name = "Total_Local_Revenue__c", nillable = true)
    protected Double totalLocalRevenueC;
    @XmlElement(name = "Total_School_Count__c", nillable = true)
    protected Double totalSchoolCountC;
    @XmlElement(name = "Total_State_Revenue__c", nillable = true)
    protected Double totalStateRevenueC;
    @XmlElement(name = "Type", nillable = true)
    protected String type;
    @XmlElement(name = "Type_of_Student_ID_loaded__c", nillable = true)
    protected String typeOfStudentIDLoadedC;
    @XmlElement(name = "Ultimate_Parent_Current_Pupil__c", nillable = true)
    protected String ultimateParentCurrentPupilC;
    @XmlElement(name = "Ultimate_Parent_Enrollment_Code__c", nillable = true)
    protected String ultimateParentEnrollmentCodeC;
    @XmlElement(name = "Ultimate_Parent_Enrollment__c", nillable = true)
    protected Double ultimateParentEnrollmentC;
    @XmlElement(name = "Ultimate_Parent_MDR_File_Type__c", nillable = true)
    protected String ultimateParentMDRFileTypeC;
    @XmlElement(name = "Ultimate_Parent_PID__c", nillable = true)
    protected String ultimateParentPIDC;
    @XmlElement(name = "Ultimate_Parent_Title_1_per_Pupil__c", nillable = true)
    protected String ultimateParentTitle1PerPupilC;
    @XmlElement(name = "Unassigned_Sales__r", nillable = true)
    protected QueryResult unassignedSalesR;
    @XmlElement(name = "Unique_Student_Codes__c", nillable = true)
    protected String uniqueStudentCodesC;
    @XmlElement(name = "Unique_Teacher_Codes__c", nillable = true)
    protected String uniqueTeacherCodesC;
    @XmlElement(name = "Username__c", nillable = true)
    protected String usernameC;
    @XmlElement(name = "Using_Edusoft_IP_Address__c", nillable = true)
    protected String usingEdusoftIPAddressC;
    @XmlElement(name = "Validator_User__c", nillable = true)
    protected String validatorUserC;
    @XmlElement(name = "Vote_Type__c", nillable = true)
    protected String voteTypeC;
    @XmlElement(name = "Website", nillable = true)
    protected String website;
    @XmlElement(name = "X10__c", nillable = true)
    protected Double x10C;
    @XmlElement(name = "X11__c", nillable = true)
    protected Double x11C;
    @XmlElement(name = "X12__c", nillable = true)
    protected Double x12C;
    @XmlElement(name = "X1__c", nillable = true)
    protected Double x1C;
    @XmlElement(name = "X21st_Century_Community_Learning__c", nillable = true)
    protected Double x21StCenturyCommunityLearningC;
    @XmlElement(name = "X2__c", nillable = true)
    protected Double x2C;
    @XmlElement(name = "X3__c", nillable = true)
    protected Double x3C;
    @XmlElement(name = "X3rd_Party_Distributor_Account__c", nillable = true)
    protected String x3RdPartyDistributorAccountC;
    @XmlElement(name = "X3rd_Party_Distributor_Account__r", nillable = true)
    protected AccountType x3RdPartyDistributorAccountR;
    @XmlElement(name = "X4__c", nillable = true)
    protected Double x4C;
    @XmlElement(name = "X5__c", nillable = true)
    protected Double x5C;
    @XmlElement(name = "X6__c", nillable = true)
    protected Double x6C;
    @XmlElement(name = "X7__c", nillable = true)
    protected Double x7C;
    @XmlElement(name = "X8__c", nillable = true)
    protected Double x8C;
    @XmlElement(name = "X9__c", nillable = true)
    protected Double x9C;
    @XmlElement(name = "experianqas__Updated_Touchpoints_Timestamp__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar experianqasUpdatedTouchpointsTimestampC;
    @XmlElement(name = "experianqas__Updated_Touchpoints__c", nillable = true)
    protected String experianqasUpdatedTouchpointsC;
    @XmlElement(name = "file_type_code_desc__c", nillable = true)
    protected String fileTypeCodeDescC;
    @XmlElement(name = "num_of_IBMs__c", nillable = true)
    protected String numOfIBMsC;
    @XmlElement(name = "num_of_MACs__c", nillable = true)
    protected String numOfMACsC;
    @XmlElement(name = "of_Schools_Loaded__c", nillable = true)
    protected Double ofSchoolsLoadedC;
    @XmlElement(name = "of_Students_Loaded__c", nillable = true)
    protected Double ofStudentsLoadedC;
    @XmlElement(name = "per_Student__c", nillable = true)
    protected Double perStudentC;

    /**
     * Gets the value of the a2K__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getA2K__C() {
        return a2KC;
    }

    /**
     * Sets the value of the a2K__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setA2K__C(String value) {
        this.a2KC = value;
    }

    /**
     * Gets the value of the ap_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAP_Comments__C() {
        return apCommentsC;
    }

    /**
     * Sets the value of the ap_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAP_Comments__C(String value) {
        this.apCommentsC = value;
    }

    /**
     * Gets the value of the a_E_Data_Set_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getA_E_Data_Set_Name__C() {
        return aEDataSetNameC;
    }

    /**
     * Sets the value of the a_E_Data_Set_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setA_E_Data_Set_Name__C(String value) {
        this.aEDataSetNameC = value;
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
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountPartnersFrom property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getAccountPartnersFrom() {
        return accountPartnersFrom;
    }

    /**
     * Sets the value of the accountPartnersFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setAccountPartnersFrom(QueryResult value) {
        this.accountPartnersFrom = value;
    }

    /**
     * Gets the value of the accountPartnersTo property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getAccountPartnersTo() {
        return accountPartnersTo;
    }

    /**
     * Sets the value of the accountPartnersTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setAccountPartnersTo(QueryResult value) {
        this.accountPartnersTo = value;
    }

    /**
     * Gets the value of the accountTeamMembers property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getAccountTeamMembers() {
        return accountTeamMembers;
    }

    /**
     * Sets the value of the accountTeamMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setAccountTeamMembers(QueryResult value) {
        this.accountTeamMembers = value;
    }

    /**
     * Gets the value of the account_Group_HMD__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount_Group_HMD__C() {
        return accountGroupHMDC;
    }

    /**
     * Sets the value of the account_Group_HMD__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount_Group_HMD__C(String value) {
        this.accountGroupHMDC = value;
    }

    /**
     * Gets the value of the account_Group_SCH__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount_Group_SCH__C() {
        return accountGroupSCHC;
    }

    /**
     * Sets the value of the account_Group_SCH__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount_Group_SCH__C(String value) {
        this.accountGroupSCHC = value;
    }

    /**
     * Gets the value of the account_Group_SUP__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount_Group_SUP__C() {
        return accountGroupSUPC;
    }

    /**
     * Sets the value of the account_Group_SUP__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount_Group_SUP__C(String value) {
        this.accountGroupSUPC = value;
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
     * Gets the value of the account_Order_History1__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getAccount_Order_History1__R() {
        return accountOrderHistory1R;
    }

    /**
     * Sets the value of the account_Order_History1__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setAccount_Order_History1__R(QueryResult value) {
        this.accountOrderHistory1R = value;
    }

    /**
     * Gets the value of the account_Order_History2__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getAccount_Order_History2__R() {
        return accountOrderHistory2R;
    }

    /**
     * Sets the value of the account_Order_History2__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setAccount_Order_History2__R(QueryResult value) {
        this.accountOrderHistory2R = value;
    }

    /**
     * Gets the value of the account_Order_History__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getAccount_Order_History__R() {
        return accountOrderHistoryR;
    }

    /**
     * Sets the value of the account_Order_History__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setAccount_Order_History__R(QueryResult value) {
        this.accountOrderHistoryR = value;
    }

    /**
     * Gets the value of the account_Profiles__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getAccount_Profiles__R() {
        return accountProfilesR;
    }

    /**
     * Sets the value of the account_Profiles__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setAccount_Profiles__R(QueryResult value) {
        this.accountProfilesR = value;
    }

    /**
     * Gets the value of the account_Rank_HMD__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAccount_Rank_HMD__C() {
        return accountRankHMDC;
    }

    /**
     * Sets the value of the account_Rank_HMD__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAccount_Rank_HMD__C(Double value) {
        this.accountRankHMDC = value;
    }

    /**
     * Gets the value of the account_Rank_SCG__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAccount_Rank_SCG__C() {
        return accountRankSCGC;
    }

    /**
     * Sets the value of the account_Rank_SCG__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAccount_Rank_SCG__C(Double value) {
        this.accountRankSCGC = value;
    }

    /**
     * Gets the value of the account_Rank_SCH__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAccount_Rank_SCH__C() {
        return accountRankSCHC;
    }

    /**
     * Sets the value of the account_Rank_SCH__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAccount_Rank_SCH__C(Double value) {
        this.accountRankSCHC = value;
    }

    /**
     * Gets the value of the account_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount_Status__C() {
        return accountStatusC;
    }

    /**
     * Sets the value of the account_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount_Status__C(String value) {
        this.accountStatusC = value;
    }

    /**
     * Gets the value of the account_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount_Type__C() {
        return accountTypeC;
    }

    /**
     * Sets the value of the account_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount_Type__C(String value) {
        this.accountTypeC = value;
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
     * Gets the value of the acctDivFormula__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctDivFormula__C() {
        return acctDivFormulaC;
    }

    /**
     * Sets the value of the acctDivFormula__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctDivFormula__C(String value) {
        this.acctDivFormulaC = value;
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
     * Gets the value of the adult_Ed_Account_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdult_Ed_Account_Flag__C() {
        return adultEdAccountFlagC;
    }

    /**
     * Sets the value of the adult_Ed_Account_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdult_Ed_Account_Flag__C(Boolean value) {
        this.adultEdAccountFlagC = value;
    }

    /**
     * Gets the value of the alliance_District_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlliance_District_Flag__C() {
        return allianceDistrictFlagC;
    }

    /**
     * Sets the value of the alliance_District_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlliance_District_Flag__C(Boolean value) {
        this.allianceDistrictFlagC = value;
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
     * Gets the value of the at_Risk__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAt_Risk__C() {
        return atRiskC;
    }

    /**
     * Sets the value of the at_Risk__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAt_Risk__C(Boolean value) {
        this.atRiskC = value;
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
     * Gets the value of the avg_Revenue_HMHLT__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvg_Revenue_HMHLT__C() {
        return avgRevenueHMHLTC;
    }

    /**
     * Sets the value of the avg_Revenue_HMHLT__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvg_Revenue_HMHLT__C(Double value) {
        this.avgRevenueHMHLTC = value;
    }

    /**
     * Gets the value of the avg_Revenue_Primary__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvg_Revenue_Primary__C() {
        return avgRevenuePrimaryC;
    }

    /**
     * Sets the value of the avg_Revenue_Primary__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvg_Revenue_Primary__C(Double value) {
        this.avgRevenuePrimaryC = value;
    }

    /**
     * Gets the value of the avg_Revenue_Riverside__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvg_Revenue_Riverside__C() {
        return avgRevenueRiversideC;
    }

    /**
     * Sets the value of the avg_Revenue_Riverside__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvg_Revenue_Riverside__C(Double value) {
        this.avgRevenueRiversideC = value;
    }

    /**
     * Gets the value of the avg_Revenue_Secondary__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvg_Revenue_Secondary__C() {
        return avgRevenueSecondaryC;
    }

    /**
     * Sets the value of the avg_Revenue_Secondary__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvg_Revenue_Secondary__C(Double value) {
        this.avgRevenueSecondaryC = value;
    }

    /**
     * Gets the value of the avg_Revenue_Supplemental__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvg_Revenue_Supplemental__C() {
        return avgRevenueSupplementalC;
    }

    /**
     * Sets the value of the avg_Revenue_Supplemental__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvg_Revenue_Supplemental__C(Double value) {
        this.avgRevenueSupplementalC = value;
    }

    /**
     * Gets the value of the avg_Revenue_Total__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvg_Revenue_Total__C() {
        return avgRevenueTotalC;
    }

    /**
     * Sets the value of the avg_Revenue_Total__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvg_Revenue_Total__C(Double value) {
        this.avgRevenueTotalC = value;
    }

    /**
     * Gets the value of the bandwidth__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandwidth__C() {
        return bandwidthC;
    }

    /**
     * Sets the value of the bandwidth__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandwidth__C(String value) {
        this.bandwidthC = value;
    }

    /**
     * Gets the value of the benchmark_Assessment_Install_Yr__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenchmark_Assessment_Install_Yr__C() {
        return benchmarkAssessmentInstallYrC;
    }

    /**
     * Sets the value of the benchmark_Assessment_Install_Yr__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenchmark_Assessment_Install_Yr__C(String value) {
        this.benchmarkAssessmentInstallYrC = value;
    }

    /**
     * Gets the value of the benchmark_Assessment__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenchmark_Assessment__C() {
        return benchmarkAssessmentC;
    }

    /**
     * Sets the value of the benchmark_Assessment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenchmark_Assessment__C(String value) {
        this.benchmarkAssessmentC = value;
    }

    /**
     * Gets the value of the billingCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCity() {
        return billingCity;
    }

    /**
     * Sets the value of the billingCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCity(String value) {
        this.billingCity = value;
    }

    /**
     * Gets the value of the billingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCountry() {
        return billingCountry;
    }

    /**
     * Sets the value of the billingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCountry(String value) {
        this.billingCountry = value;
    }

    /**
     * Gets the value of the billingPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    /**
     * Sets the value of the billingPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingPostalCode(String value) {
        this.billingPostalCode = value;
    }

    /**
     * Gets the value of the billingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingState() {
        return billingState;
    }

    /**
     * Sets the value of the billingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingState(String value) {
        this.billingState = value;
    }

    /**
     * Gets the value of the billingStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingStreet() {
        return billingStreet;
    }

    /**
     * Sets the value of the billingStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingStreet(String value) {
        this.billingStreet = value;
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
     * Gets the value of the coms_Account_NUM__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMS_Account_NUM__C() {
        return comsAccountNUMC;
    }

    /**
     * Sets the value of the coms_Account_NUM__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMS_Account_NUM__C(String value) {
        this.comsAccountNUMC = value;
    }

    /**
     * Gets the value of the cor_Divisional_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOR_Divisional_Comments__C() {
        return corDivisionalCommentsC;
    }

    /**
     * Sets the value of the cor_Divisional_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOR_Divisional_Comments__C(String value) {
        this.corDivisionalCommentsC = value;
    }

    /**
     * Gets the value of the cp_Ship_To_Override__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCP_Ship_To_Override__C() {
        return cpShipToOverrideC;
    }

    /**
     * Sets the value of the cp_Ship_To_Override__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCP_Ship_To_Override__C(String value) {
        this.cpShipToOverrideC = value;
    }

    /**
     * Gets the value of the cp_Sold_To_Override__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCP_Sold_To_Override__C() {
        return cpSoldToOverrideC;
    }

    /**
     * Sets the value of the cp_Sold_To_Override__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCP_Sold_To_Override__C(String value) {
        this.cpSoldToOverrideC = value;
    }

    /**
     * Gets the value of the calendar_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendar_Code__C() {
        return calendarCodeC;
    }

    /**
     * Sets the value of the calendar_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendar_Code__C(String value) {
        this.calendarCodeC = value;
    }

    /**
     * Gets the value of the campus__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampus__C() {
        return campusC;
    }

    /**
     * Sets the value of the campus__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampus__C(String value) {
        this.campusC = value;
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
     * Gets the value of the catalog_Types__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalog_Types__C() {
        return catalogTypesC;
    }

    /**
     * Sets the value of the catalog_Types__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalog_Types__C(String value) {
        this.catalogTypesC = value;
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
     * Gets the value of the charter_School_Count__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCharter_School_Count__C() {
        return charterSchoolCountC;
    }

    /**
     * Sets the value of the charter_School_Count__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCharter_School_Count__C(Double value) {
        this.charterSchoolCountC = value;
    }

    /**
     * Gets the value of the charter_School_Indicator__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharter_School_Indicator__C() {
        return charterSchoolIndicatorC;
    }

    /**
     * Sets the value of the charter_School_Indicator__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharter_School_Indicator__C(String value) {
        this.charterSchoolIndicatorC = value;
    }

    /**
     * Gets the value of the closed_District_Adoption_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClosed_District_Adoption_Flag__C() {
        return closedDistrictAdoptionFlagC;
    }

    /**
     * Sets the value of the closed_District_Adoption_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosed_District_Adoption_Flag__C(Boolean value) {
        this.closedDistrictAdoptionFlagC = value;
    }

    /**
     * Gets the value of the closed_District_For_Emails_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClosed_District_For_Emails_Flag__C() {
        return closedDistrictForEmailsFlagC;
    }

    /**
     * Sets the value of the closed_District_For_Emails_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosed_District_For_Emails_Flag__C(Boolean value) {
        this.closedDistrictForEmailsFlagC = value;
    }

    /**
     * Gets the value of the college_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollege_Code__C() {
        return collegeCodeC;
    }

    /**
     * Sets the value of the college_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollege_Code__C(String value) {
        this.collegeCodeC = value;
    }

    /**
     * Gets the value of the college_NACS_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollege_NACS_Number__C() {
        return collegeNACSNumberC;
    }

    /**
     * Sets the value of the college_NACS_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollege_NACS_Number__C(String value) {
        this.collegeNACSNumberC = value;
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
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setContacts(QueryResult value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the contacts1__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getContacts1__R() {
        return contacts1R;
    }

    /**
     * Sets the value of the contacts1__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setContacts1__R(QueryResult value) {
        this.contacts1R = value;
    }

    /**
     * Gets the value of the content_Filter_Caching_Software__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent_Filter_Caching_Software__C() {
        return contentFilterCachingSoftwareC;
    }

    /**
     * Sets the value of the content_Filter_Caching_Software__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent_Filter_Caching_Software__C(String value) {
        this.contentFilterCachingSoftwareC = value;
    }

    /**
     * Gets the value of the content_Management_System_Install_Yr__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent_Management_System_Install_Yr__C() {
        return contentManagementSystemInstallYrC;
    }

    /**
     * Sets the value of the content_Management_System_Install_Yr__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent_Management_System_Install_Yr__C(String value) {
        this.contentManagementSystemInstallYrC = value;
    }

    /**
     * Gets the value of the content_Management_System__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent_Management_System__C() {
        return contentManagementSystemC;
    }

    /**
     * Sets the value of the content_Management_System__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent_Management_System__C(String value) {
        this.contentManagementSystemC = value;
    }

    /**
     * Gets the value of the contracts property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getContracts() {
        return contracts;
    }

    /**
     * Sets the value of the contracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setContracts(QueryResult value) {
        this.contracts = value;
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
     * Gets the value of the course_Management_System__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourse_Management_System__C() {
        return courseManagementSystemC;
    }

    /**
     * Sets the value of the course_Management_System__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourse_Management_System__C(String value) {
        this.courseManagementSystemC = value;
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
     * Gets the value of the credit_Hold__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCredit_Hold__C() {
        return creditHoldC;
    }

    /**
     * Sets the value of the credit_Hold__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCredit_Hold__C(Boolean value) {
        this.creditHoldC = value;
    }

    /**
     * Gets the value of the current_District_Total__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrent_District_Total__C() {
        return currentDistrictTotalC;
    }

    /**
     * Sets the value of the current_District_Total__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrent_District_Total__C(Double value) {
        this.currentDistrictTotalC = value;
    }

    /**
     * Gets the value of the current_Pupil__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrent_Pupil__C() {
        return currentPupilC;
    }

    /**
     * Sets the value of the current_Pupil__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrent_Pupil__C(String value) {
        this.currentPupilC = value;
    }

    /**
     * Gets the value of the customer_Class__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Class__C() {
        return customerClassC;
    }

    /**
     * Sets the value of the customer_Class__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Class__C(String value) {
        this.customerClassC = value;
    }

    /**
     * Gets the value of the customer_Platform__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Platform__C() {
        return customerPlatformC;
    }

    /**
     * Sets the value of the customer_Platform__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Platform__C(String value) {
        this.customerPlatformC = value;
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
     * Gets the value of the dd_DI__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDD_DI__C() {
        return ddDIC;
    }

    /**
     * Sets the value of the dd_DI__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDD_DI__C(String value) {
        this.ddDIC = value;
    }

    /**
     * Gets the value of the dd_Item_Bank__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDD_Item_Bank__C() {
        return ddItemBankC;
    }

    /**
     * Sets the value of the dd_Item_Bank__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDD_Item_Bank__C(String value) {
        this.ddItemBankC = value;
    }

    /**
     * Gets the value of the dd_Module__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDD_Module__C() {
        return ddModuleC;
    }

    /**
     * Sets the value of the dd_Module__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDD_Module__C(String value) {
        this.ddModuleC = value;
    }

    /**
     * Gets the value of the dd_Report_Card__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDD_Report_Card__C() {
        return ddReportCardC;
    }

    /**
     * Sets the value of the dd_Report_Card__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDD_Report_Card__C(String value) {
        this.ddReportCardC = value;
    }

    /**
     * Gets the value of the di_Lead__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDI_Lead__C() {
        return diLeadC;
    }

    /**
     * Sets the value of the di_Lead__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDI_Lead__C(String value) {
        this.diLeadC = value;
    }

    /**
     * Gets the value of the di_Lead__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getDI_Lead__R() {
        return diLeadR;
    }

    /**
     * Sets the value of the di_Lead__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setDI_Lead__R(UserType value) {
        this.diLeadR = value;
    }

    /**
     * Gets the value of the di_Servcie_Level__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDI_Servcie_Level__C() {
        return diServcieLevelC;
    }

    /**
     * Sets the value of the di_Servcie_Level__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDI_Servcie_Level__C(String value) {
        this.diServcieLevelC = value;
    }

    /**
     * Gets the value of the di_Temp__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDI_Temp__C() {
        return diTempC;
    }

    /**
     * Sets the value of the di_Temp__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDI_Temp__C(String value) {
        this.diTempC = value;
    }

    /**
     * Gets the value of the di_Temp__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getDI_Temp__R() {
        return diTempR;
    }

    /**
     * Sets the value of the di_Temp__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setDI_Temp__R(UserType value) {
        this.diTempR = value;
    }

    /**
     * Gets the value of the dataIntegration__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataIntegration__C() {
        return dataIntegrationC;
    }

    /**
     * Sets the value of the dataIntegration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataIntegration__C(String value) {
        this.dataIntegrationC = value;
    }

    /**
     * Gets the value of the dataLoadedonCollumn__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataLoadedonCollumn__C() {
        return dataLoadedonCollumnC;
    }

    /**
     * Sets the value of the dataLoadedonCollumn__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataLoadedonCollumn__C(String value) {
        this.dataLoadedonCollumnC = value;
    }

    /**
     * Gets the value of the dataScanner_Site__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataScanner_Site__C() {
        return dataScannerSiteC;
    }

    /**
     * Sets the value of the dataScanner_Site__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataScanner_Site__C(String value) {
        this.dataScannerSiteC = value;
    }

    /**
     * Gets the value of the dataScanner_Student__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataScanner_Student__C() {
        return dataScannerStudentC;
    }

    /**
     * Sets the value of the dataScanner_Student__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataScanner_Student__C(String value) {
        this.dataScannerStudentC = value;
    }

    /**
     * Gets the value of the data_Quality_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData_Quality_Description__C() {
        return dataQualityDescriptionC;
    }

    /**
     * Sets the value of the data_Quality_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData_Quality_Description__C(String value) {
        this.dataQualityDescriptionC = value;
    }

    /**
     * Gets the value of the data_Quality_Score__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getData_Quality_Score__C() {
        return dataQualityScoreC;
    }

    /**
     * Sets the value of the data_Quality_Score__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setData_Quality_Score__C(Double value) {
        this.dataQualityScoreC = value;
    }

    /**
     * Gets the value of the data_Quality__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData_Quality__C() {
        return dataQualityC;
    }

    /**
     * Sets the value of the data_Quality__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData_Quality__C(String value) {
        this.dataQualityC = value;
    }

    /**
     * Gets the value of the data_Set_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData_Set_Name__C() {
        return dataSetNameC;
    }

    /**
     * Sets the value of the data_Set_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData_Set_Name__C(String value) {
        this.dataSetNameC = value;
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
     * Gets the value of the data_Transport__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData_Transport__C() {
        return dataTransportC;
    }

    /**
     * Sets the value of the data_Transport__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData_Transport__C(String value) {
        this.dataTransportC = value;
    }

    /**
     * Gets the value of the data_Warehouse_Assessment_Analytics__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData_Warehouse_Assessment_Analytics__C() {
        return dataWarehouseAssessmentAnalyticsC;
    }

    /**
     * Sets the value of the data_Warehouse_Assessment_Analytics__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData_Warehouse_Assessment_Analytics__C(String value) {
        this.dataWarehouseAssessmentAnalyticsC = value;
    }

    /**
     * Gets the value of the data_Whse_Asmt_Analytics_Install_Yr__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData_Whse_Asmt_Analytics_Install_Yr__C() {
        return dataWhseAsmtAnalyticsInstallYrC;
    }

    /**
     * Sets the value of the data_Whse_Asmt_Analytics_Install_Yr__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData_Whse_Asmt_Analytics_Install_Yr__C(String value) {
        this.dataWhseAsmtAnalyticsInstallYrC = value;
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
     * Gets the value of the discount_Level__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscount_Level__C() {
        return discountLevelC;
    }

    /**
     * Sets the value of the discount_Level__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscount_Level__C(Double value) {
        this.discountLevelC = value;
    }

    /**
     * Gets the value of the district_Account__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict_Account__C() {
        return districtAccountC;
    }

    /**
     * Sets the value of the district_Account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict_Account__C(String value) {
        this.districtAccountC = value;
    }

    /**
     * Gets the value of the district_Proxy__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict_Proxy__C() {
        return districtProxyC;
    }

    /**
     * Sets the value of the district_Proxy__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict_Proxy__C(String value) {
        this.districtProxyC = value;
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
     * Gets the value of the division_S__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision_S__C() {
        return divisionSC;
    }

    /**
     * Sets the value of the division_S__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision_S__C(String value) {
        this.divisionSC = value;
    }

    /**
     * Gets the value of the do_Not_Call__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDo_Not_Call__C() {
        return doNotCallC;
    }

    /**
     * Sets the value of the do_Not_Call__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDo_Not_Call__C(Boolean value) {
        this.doNotCallC = value;
    }

    /**
     * Gets the value of the do_Not_Sample__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDo_Not_Sample__C() {
        return doNotSampleC;
    }

    /**
     * Sets the value of the do_Not_Sample__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDo_Not_Sample__C(String value) {
        this.doNotSampleC = value;
    }

    /**
     * Gets the value of the drop_Shipments__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getDrop_Shipments__R() {
        return dropShipmentsR;
    }

    /**
     * Sets the value of the drop_Shipments__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setDrop_Shipments__R(QueryResult value) {
        this.dropShipmentsR = value;
    }

    /**
     * Gets the value of the eGood_Fulfillments__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getEGood_Fulfillments__R() {
        return eGoodFulfillmentsR;
    }

    /**
     * Sets the value of the eGood_Fulfillments__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setEGood_Fulfillments__R(QueryResult value) {
        this.eGoodFulfillmentsR = value;
    }

    /**
     * Gets the value of the ela_Performance_Trend__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getELA_Performance_Trend__C() {
        return elaPerformanceTrendC;
    }

    /**
     * Sets the value of the ela_Performance_Trend__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setELA_Performance_Trend__C(Double value) {
        this.elaPerformanceTrendC = value;
    }

    /**
     * Gets the value of the elementary_School_Count__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getElementary_School_Count__C() {
        return elementarySchoolCountC;
    }

    /**
     * Sets the value of the elementary_School_Count__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setElementary_School_Count__C(Double value) {
        this.elementarySchoolCountC = value;
    }

    /**
     * Gets the value of the email_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmail_Contact__C() {
        return emailContactC;
    }

    /**
     * Sets the value of the email_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmail_Contact__C(Boolean value) {
        this.emailContactC = value;
    }

    /**
     * Gets the value of the email_Opt_Out__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmail_Opt_Out__C() {
        return emailOptOutC;
    }

    /**
     * Sets the value of the email_Opt_Out__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmail_Opt_Out__C(Boolean value) {
        this.emailOptOutC = value;
    }

    /**
     * Gets the value of the english_Language_Learner_Count__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEnglish_Language_Learner_Count__C() {
        return englishLanguageLearnerCountC;
    }

    /**
     * Sets the value of the english_Language_Learner_Count__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEnglish_Language_Learner_Count__C(Double value) {
        this.englishLanguageLearnerCountC = value;
    }

    /**
     * Gets the value of the enrolled_Schools__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEnrolled_Schools__C() {
        return enrolledSchoolsC;
    }

    /**
     * Sets the value of the enrolled_Schools__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEnrolled_Schools__C(Double value) {
        this.enrolledSchoolsC = value;
    }

    /**
     * Gets the value of the enrolled_Students__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEnrolled_Students__C() {
        return enrolledStudentsC;
    }

    /**
     * Sets the value of the enrolled_Students__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEnrolled_Students__C(Double value) {
        this.enrolledStudentsC = value;
    }

    /**
     * Gets the value of the enrollment_Rank__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEnrollment_Rank__C() {
        return enrollmentRankC;
    }

    /**
     * Sets the value of the enrollment_Rank__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEnrollment_Rank__C(Double value) {
        this.enrollmentRankC = value;
    }

    /**
     * Gets the value of the enrollment_Rating__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollment_Rating__C() {
        return enrollmentRatingC;
    }

    /**
     * Sets the value of the enrollment_Rating__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollment_Rating__C(String value) {
        this.enrollmentRatingC = value;
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
     * Gets the value of the enterprise_Last_Modified_By__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterprise_Last_Modified_By__C() {
        return enterpriseLastModifiedByC;
    }

    /**
     * Sets the value of the enterprise_Last_Modified_By__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterprise_Last_Modified_By__C(String value) {
        this.enterpriseLastModifiedByC = value;
    }

    /**
     * Gets the value of the enterprise_Last_Modified_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnterprise_Last_Modified_Date__C() {
        return enterpriseLastModifiedDateC;
    }

    /**
     * Sets the value of the enterprise_Last_Modified_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnterprise_Last_Modified_Date__C(XMLGregorianCalendar value) {
        this.enterpriseLastModifiedDateC = value;
    }

    /**
     * Gets the value of the enterprise_Riverside_Account_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterprise_Riverside_Account_Status__C() {
        return enterpriseRiversideAccountStatusC;
    }

    /**
     * Sets the value of the enterprise_Riverside_Account_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterprise_Riverside_Account_Status__C(String value) {
        this.enterpriseRiversideAccountStatusC = value;
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
     * Gets the value of the examView__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamView__C() {
        return examViewC;
    }

    /**
     * Sets the value of the examView__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamView__C(String value) {
        this.examViewC = value;
    }

    /**
     * Gets the value of the fy09_SIG_Eligible__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFY09_SIG_Eligible__C() {
        return fy09SIGEligibleC;
    }

    /**
     * Sets the value of the fy09_SIG_Eligible__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFY09_SIG_Eligible__C(Boolean value) {
        this.fy09SIGEligibleC = value;
    }

    /**
     * Gets the value of the fy09_SIG_Model_Chosen__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFY09_SIG_Model_Chosen__C() {
        return fy09SIGModelChosenC;
    }

    /**
     * Sets the value of the fy09_SIG_Model_Chosen__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFY09_SIG_Model_Chosen__C(String value) {
        this.fy09SIGModelChosenC = value;
    }

    /**
     * Gets the value of the fy09_SIG_Winner__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFY09_SIG_Winner__C() {
        return fy09SIGWinnerC;
    }

    /**
     * Sets the value of the fy09_SIG_Winner__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFY09_SIG_Winner__C(Boolean value) {
        this.fy09SIGWinnerC = value;
    }

    /**
     * Gets the value of the fy10_SIG_Eligible__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFY10_SIG_Eligible__C() {
        return fy10SIGEligibleC;
    }

    /**
     * Sets the value of the fy10_SIG_Eligible__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFY10_SIG_Eligible__C(Boolean value) {
        this.fy10SIGEligibleC = value;
    }

    /**
     * Gets the value of the fy10_SIG_Model_Chosen__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFY10_SIG_Model_Chosen__C() {
        return fy10SIGModelChosenC;
    }

    /**
     * Sets the value of the fy10_SIG_Model_Chosen__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFY10_SIG_Model_Chosen__C(String value) {
        this.fy10SIGModelChosenC = value;
    }

    /**
     * Gets the value of the fy10_SIG_Winner__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFY10_SIG_Winner__C() {
        return fy10SIGWinnerC;
    }

    /**
     * Sets the value of the fy10_SIG_Winner__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFY10_SIG_Winner__C(Boolean value) {
        this.fy10SIGWinnerC = value;
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
     * Gets the value of the firewall__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirewall__C() {
        return firewallC;
    }

    /**
     * Sets the value of the firewall__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirewall__C(String value) {
        this.firewallC = value;
    }

    /**
     * Gets the value of the formative_Assessment_App_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormative_Assessment_App_Contact__C() {
        return formativeAssessmentAppContactC;
    }

    /**
     * Sets the value of the formative_Assessment_App_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormative_Assessment_App_Contact__C(String value) {
        this.formativeAssessmentAppContactC = value;
    }

    /**
     * Gets the value of the formative_Assessment_App_Contact__R property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getFormative_Assessment_App_Contact__R() {
        return formativeAssessmentAppContactR;
    }

    /**
     * Sets the value of the formative_Assessment_App_Contact__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setFormative_Assessment_App_Contact__R(ContactType value) {
        this.formativeAssessmentAppContactR = value;
    }

    /**
     * Gets the value of the formative_Assessment_App_Install_Yr__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormative_Assessment_App_Install_Yr__C() {
        return formativeAssessmentAppInstallYrC;
    }

    /**
     * Sets the value of the formative_Assessment_App_Install_Yr__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormative_Assessment_App_Install_Yr__C(String value) {
        this.formativeAssessmentAppInstallYrC = value;
    }

    /**
     * Gets the value of the formative_Assessment_App_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormative_Assessment_App_Name__C() {
        return formativeAssessmentAppNameC;
    }

    /**
     * Sets the value of the formative_Assessment_App_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormative_Assessment_App_Name__C(String value) {
        this.formativeAssessmentAppNameC = value;
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
     * Gets the value of the free_Reduced_Lunch_Count__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFree_Reduced_Lunch_Count__C() {
        return freeReducedLunchCountC;
    }

    /**
     * Sets the value of the free_Reduced_Lunch_Count__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFree_Reduced_Lunch_Count__C(Double value) {
        this.freeReducedLunchCountC = value;
    }

    /**
     * Gets the value of the funding_Allocations__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getFunding_Allocations__R() {
        return fundingAllocationsR;
    }

    /**
     * Sets the value of the funding_Allocations__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setFunding_Allocations__R(QueryResult value) {
        this.fundingAllocationsR = value;
    }

    /**
     * Gets the value of the funding_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunding_Comments__C() {
        return fundingCommentsC;
    }

    /**
     * Sets the value of the funding_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunding_Comments__C(String value) {
        this.fundingCommentsC = value;
    }

    /**
     * Gets the value of the gpv_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGPV_Amount__C() {
        return gpvAmountC;
    }

    /**
     * Sets the value of the gpv_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGPV_Amount__C(Double value) {
        this.gpvAmountC = value;
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
     * Gets the value of the generic_ID_Setting__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneric_ID_Setting__C() {
        return genericIDSettingC;
    }

    /**
     * Sets the value of the generic_ID_Setting__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneric_ID_Setting__C(String value) {
        this.genericIDSettingC = value;
    }

    /**
     * Gets the value of the grade_Book_Install_Yr__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade_Book_Install_Yr__C() {
        return gradeBookInstallYrC;
    }

    /**
     * Sets the value of the grade_Book_Install_Yr__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade_Book_Install_Yr__C(String value) {
        this.gradeBookInstallYrC = value;
    }

    /**
     * Gets the value of the grade_Book__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade_Book__C() {
        return gradeBookC;
    }

    /**
     * Sets the value of the grade_Book__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade_Book__C(String value) {
        this.gradeBookC = value;
    }

    /**
     * Gets the value of the grade_Range__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade_Range__C() {
        return gradeRangeC;
    }

    /**
     * Sets the value of the grade_Range__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade_Range__C(String value) {
        this.gradeRangeC = value;
    }

    /**
     * Gets the value of the grades__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrades__C() {
        return gradesC;
    }

    /**
     * Sets the value of the grades__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrades__C(String value) {
        this.gradesC = value;
    }

    /**
     * Gets the value of the graduation_Rate_Trend__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGraduation_Rate_Trend__C() {
        return graduationRateTrendC;
    }

    /**
     * Sets the value of the graduation_Rate_Trend__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGraduation_Rate_Trend__C(Double value) {
        this.graduationRateTrendC = value;
    }

    /**
     * Gets the value of the graduation_Rate_URL__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduation_Rate_URL__C() {
        return graduationRateURLC;
    }

    /**
     * Sets the value of the graduation_Rate_URL__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduation_Rate_URL__C(String value) {
        this.graduationRateURLC = value;
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
     * Gets the value of the hmd_Data_Set_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHMD_Data_Set_Name__C() {
        return hmdDataSetNameC;
    }

    /**
     * Sets the value of the hmd_Data_Set_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHMD_Data_Set_Name__C(String value) {
        this.hmdDataSetNameC = value;
    }

    /**
     * Gets the value of the hmh_House_Account__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHMH_House_Account__C() {
        return hmhHouseAccountC;
    }

    /**
     * Sets the value of the hmh_House_Account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHMH_House_Account__C(Boolean value) {
        this.hmhHouseAccountC = value;
    }

    /**
     * Gets the value of the hmh_Market_Share_Rank__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHMH_Market_Share_Rank__C() {
        return hmhMarketShareRankC;
    }

    /**
     * Sets the value of the hmh_Market_Share_Rank__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHMH_Market_Share_Rank__C(Double value) {
        this.hmhMarketShareRankC = value;
    }

    /**
     * Gets the value of the hmh_Market_Share__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHMH_Market_Share__C() {
        return hmhMarketShareC;
    }

    /**
     * Sets the value of the hmh_Market_Share__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHMH_Market_Share__C(Double value) {
        this.hmhMarketShareC = value;
    }

    /**
     * Gets the value of the hmh_Pupil_Expend_HMHLT_Rank__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHMH_Pupil_Expend_HMHLT_Rank__C() {
        return hmhPupilExpendHMHLTRankC;
    }

    /**
     * Sets the value of the hmh_Pupil_Expend_HMHLT_Rank__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHMH_Pupil_Expend_HMHLT_Rank__C(Double value) {
        this.hmhPupilExpendHMHLTRankC = value;
    }

    /**
     * Gets the value of the hmh_Pupil_Expend_HMHLT__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHMH_Pupil_Expend_HMHLT__C() {
        return hmhPupilExpendHMHLTC;
    }

    /**
     * Sets the value of the hmh_Pupil_Expend_HMHLT__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHMH_Pupil_Expend_HMHLT__C(Double value) {
        this.hmhPupilExpendHMHLTC = value;
    }

    /**
     * Gets the value of the hmh_Pupil_Expend_Primary_Rank__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHMH_Pupil_Expend_Primary_Rank__C() {
        return hmhPupilExpendPrimaryRankC;
    }

    /**
     * Sets the value of the hmh_Pupil_Expend_Primary_Rank__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHMH_Pupil_Expend_Primary_Rank__C(Double value) {
        this.hmhPupilExpendPrimaryRankC = value;
    }

    /**
     * Gets the value of the hmh_Pupil_Expend_Primary__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHMH_Pupil_Expend_Primary__C() {
        return hmhPupilExpendPrimaryC;
    }

    /**
     * Sets the value of the hmh_Pupil_Expend_Primary__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHMH_Pupil_Expend_Primary__C(Double value) {
        this.hmhPupilExpendPrimaryC = value;
    }

    /**
     * Gets the value of the hmh_Pupil_Expend_Riverside_Rank__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHMH_Pupil_Expend_Riverside_Rank__C() {
        return hmhPupilExpendRiversideRankC;
    }

    /**
     * Sets the value of the hmh_Pupil_Expend_Riverside_Rank__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHMH_Pupil_Expend_Riverside_Rank__C(Double value) {
        this.hmhPupilExpendRiversideRankC = value;
    }

    /**
     * Gets the value of the hmh_Pupil_Expend_Riverside__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHMH_Pupil_Expend_Riverside__C() {
        return hmhPupilExpendRiversideC;
    }

    /**
     * Sets the value of the hmh_Pupil_Expend_Riverside__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHMH_Pupil_Expend_Riverside__C(Double value) {
        this.hmhPupilExpendRiversideC = value;
    }

    /**
     * Gets the value of the hmh_Pupil_Expend_Secondary_Rank__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHMH_Pupil_Expend_Secondary_Rank__C() {
        return hmhPupilExpendSecondaryRankC;
    }

    /**
     * Sets the value of the hmh_Pupil_Expend_Secondary_Rank__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHMH_Pupil_Expend_Secondary_Rank__C(Double value) {
        this.hmhPupilExpendSecondaryRankC = value;
    }

    /**
     * Gets the value of the hmh_Pupil_Expend_Secondary__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHMH_Pupil_Expend_Secondary__C() {
        return hmhPupilExpendSecondaryC;
    }

    /**
     * Sets the value of the hmh_Pupil_Expend_Secondary__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHMH_Pupil_Expend_Secondary__C(Double value) {
        this.hmhPupilExpendSecondaryC = value;
    }

    /**
     * Gets the value of the hmh_Pupil_Expend_Supp_Rank__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHMH_Pupil_Expend_Supp_Rank__C() {
        return hmhPupilExpendSuppRankC;
    }

    /**
     * Sets the value of the hmh_Pupil_Expend_Supp_Rank__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHMH_Pupil_Expend_Supp_Rank__C(Double value) {
        this.hmhPupilExpendSuppRankC = value;
    }

    /**
     * Gets the value of the hmh_Pupil_Expend_Supplemental__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHMH_Pupil_Expend_Supplemental__C() {
        return hmhPupilExpendSupplementalC;
    }

    /**
     * Sets the value of the hmh_Pupil_Expend_Supplemental__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHMH_Pupil_Expend_Supplemental__C(Double value) {
        this.hmhPupilExpendSupplementalC = value;
    }

    /**
     * Gets the value of the hmh_Pupil_Expend_Total_Rank__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHMH_Pupil_Expend_Total_Rank__C() {
        return hmhPupilExpendTotalRankC;
    }

    /**
     * Sets the value of the hmh_Pupil_Expend_Total_Rank__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHMH_Pupil_Expend_Total_Rank__C(Double value) {
        this.hmhPupilExpendTotalRankC = value;
    }

    /**
     * Gets the value of the hmh_Pupil_Expend_Total__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHMH_Pupil_Expend_Total__C() {
        return hmhPupilExpendTotalC;
    }

    /**
     * Sets the value of the hmh_Pupil_Expend_Total__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHMH_Pupil_Expend_Total__C(Double value) {
        this.hmhPupilExpendTotalC = value;
    }

    /**
     * Gets the value of the hmh_Total_Revenue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHMH_Total_Revenue__C() {
        return hmhTotalRevenueC;
    }

    /**
     * Sets the value of the hmh_Total_Revenue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHMH_Total_Revenue__C(Double value) {
        this.hmhTotalRevenueC = value;
    }

    /**
     * Gets the value of the high_Grade__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHigh_Grade__C() {
        return highGradeC;
    }

    /**
     * Sets the value of the high_Grade__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHigh_Grade__C(String value) {
        this.highGradeC = value;
    }

    /**
     * Gets the value of the high_School_Count__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHigh_School_Count__C() {
        return highSchoolCountC;
    }

    /**
     * Sets the value of the high_School_Count__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHigh_School_Count__C(Double value) {
        this.highSchoolCountC = value;
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
     * Gets the value of the home_School_Account_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHome_School_Account_Flag__C() {
        return homeSchoolAccountFlagC;
    }

    /**
     * Sets the value of the home_School_Account_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHome_School_Account_Flag__C(Boolean value) {
        this.homeSchoolAccountFlagC = value;
    }

    /**
     * Gets the value of the ib_School_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIB_School_Flag__C() {
        return ibSchoolFlagC;
    }

    /**
     * Sets the value of the ib_School_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIB_School_Flag__C(Boolean value) {
        this.ibSchoolFlagC = value;
    }

    /**
     * Gets the value of the idea_Stimulus__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIDEA_Stimulus__C() {
        return ideaStimulusC;
    }

    /**
     * Sets the value of the idea_Stimulus__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIDEA_Stimulus__C(Double value) {
        this.ideaStimulusC = value;
    }

    /**
     * Gets the value of the id_Display_Preference__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID_Display_Preference__C() {
        return idDisplayPreferenceC;
    }

    /**
     * Sets the value of the id_Display_Preference__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID_Display_Preference__C(String value) {
        this.idDisplayPreferenceC = value;
    }

    /**
     * Gets the value of the iie_Data_Set_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIIE_Data_Set_Name__C() {
        return iieDataSetNameC;
    }

    /**
     * Sets the value of the iie_Data_Set_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIIE_Data_Set_Name__C(String value) {
        this.iieDataSetNameC = value;
    }

    /**
     * Gets the value of the iie_Inside_Account_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIIE_Inside_Account_Flag__C() {
        return iieInsideAccountFlagC;
    }

    /**
     * Sets the value of the iie_Inside_Account_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIIE_Inside_Account_Flag__C(Boolean value) {
        this.iieInsideAccountFlagC = value;
    }

    /**
     * Gets the value of the iie_Strategic_Account_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIIE_Strategic_Account_Flag__C() {
        return iieStrategicAccountFlagC;
    }

    /**
     * Sets the value of the iie_Strategic_Account_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIIE_Strategic_Account_Flag__C(Boolean value) {
        this.iieStrategicAccountFlagC = value;
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
     * Gets the value of the isa_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISA_ID__C() {
        return isaIDC;
    }

    /**
     * Sets the value of the isa_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISA_ID__C(String value) {
        this.isaIDC = value;
    }

    /**
     * Gets the value of the import_Demographics__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImport_Demographics__C() {
        return importDemographicsC;
    }

    /**
     * Sets the value of the import_Demographics__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImport_Demographics__C(String value) {
        this.importDemographicsC = value;
    }

    /**
     * Gets the value of the import_Test__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImport_Test__C() {
        return importTestC;
    }

    /**
     * Sets the value of the import_Test__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImport_Test__C(String value) {
        this.importTestC = value;
    }

    /**
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustry(String value) {
        this.industry = value;
    }

    /**
     * Gets the value of the inside_PNP_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInside_PNP_Flag__C() {
        return insidePNPFlagC;
    }

    /**
     * Sets the value of the inside_PNP_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInside_PNP_Flag__C(Boolean value) {
        this.insidePNPFlagC = value;
    }

    /**
     * Gets the value of the inside_Sales_Account_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInside_Sales_Account_Flag__C() {
        return insideSalesAccountFlagC;
    }

    /**
     * Sets the value of the inside_Sales_Account_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInside_Sales_Account_Flag__C(Boolean value) {
        this.insideSalesAccountFlagC = value;
    }

    /**
     * Gets the value of the institution_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitution_Type__C() {
        return institutionTypeC;
    }

    /**
     * Sets the value of the institution_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitution_Type__C(String value) {
        this.institutionTypeC = value;
    }

    /**
     * Gets the value of the instructional_Technology_Support_Dept__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructional_Technology_Support_Dept__C() {
        return instructionalTechnologySupportDeptC;
    }

    /**
     * Sets the value of the instructional_Technology_Support_Dept__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructional_Technology_Support_Dept__C(String value) {
        this.instructionalTechnologySupportDeptC = value;
    }

    /**
     * Gets the value of the intermediateAgency__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntermediateAgency__C() {
        return intermediateAgencyC;
    }

    /**
     * Sets the value of the intermediateAgency__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntermediateAgency__C(String value) {
        this.intermediateAgencyC = value;
    }

    /**
     * Gets the value of the internal_Account_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternal_Account_ID__C() {
        return internalAccountIDC;
    }

    /**
     * Sets the value of the internal_Account_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternal_Account_ID__C(String value) {
        this.internalAccountIDC = value;
    }

    /**
     * Gets the value of the internet_Available__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternet_Available__C() {
        return internetAvailableC;
    }

    /**
     * Sets the value of the internet_Available__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternet_Available__C(String value) {
        this.internetAvailableC = value;
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
     * Gets the value of the item_Banks_Install_Yr__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItem_Banks_Install_Yr__C() {
        return itemBanksInstallYrC;
    }

    /**
     * Sets the value of the item_Banks_Install_Yr__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItem_Banks_Install_Yr__C(String value) {
        this.itemBanksInstallYrC = value;
    }

    /**
     * Gets the value of the item_Banks__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItem_Banks__C() {
        return itemBanksC;
    }

    /**
     * Sets the value of the item_Banks__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItem_Banks__C(String value) {
        this.itemBanksC = value;
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
     * Gets the value of the k__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getK__C() {
        return kC;
    }

    /**
     * Sets the value of the k__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setK__C(Double value) {
        this.kC = value;
    }

    /**
     * Gets the value of the kenTest4S__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getKenTest4S__R() {
        return kenTest4SR;
    }

    /**
     * Sets the value of the kenTest4S__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setKenTest4S__R(QueryResult value) {
        this.kenTest4SR = value;
    }

    /**
     * Gets the value of the kenTest_Prototype_WIN_S__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getKenTest_Prototype_WIN_S__R() {
        return kenTestPrototypeWINSR;
    }

    /**
     * Sets the value of the kenTest_Prototype_WIN_S__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setKenTest_Prototype_WIN_S__R(QueryResult value) {
        this.kenTestPrototypeWINSR = value;
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
     * Gets the value of the lausd_Excluded__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLAUSD_Excluded__C() {
        return lausdExcludedC;
    }

    /**
     * Sets the value of the lausd_Excluded__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLAUSD_Excluded__C(Boolean value) {
        this.lausdExcludedC = value;
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
     * Gets the value of the lastHighStakesUpdate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastHighStakesUpdate__C() {
        return lastHighStakesUpdateC;
    }

    /**
     * Sets the value of the lastHighStakesUpdate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastHighStakesUpdate__C(XMLGregorianCalendar value) {
        this.lastHighStakesUpdateC = value;
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
     * Gets the value of the lastRosterUpdate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRosterUpdate__C() {
        return lastRosterUpdateC;
    }

    /**
     * Sets the value of the lastRosterUpdate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRosterUpdate__C(XMLGregorianCalendar value) {
        this.lastRosterUpdateC = value;
    }

    /**
     * Gets the value of the learning_Management_System_Install_Yr__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearning_Management_System_Install_Yr__C() {
        return learningManagementSystemInstallYrC;
    }

    /**
     * Sets the value of the learning_Management_System_Install_Yr__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearning_Management_System_Install_Yr__C(String value) {
        this.learningManagementSystemInstallYrC = value;
    }

    /**
     * Gets the value of the learning_Management_System__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearning_Management_System__C() {
        return learningManagementSystemC;
    }

    /**
     * Sets the value of the learning_Management_System__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearning_Management_System__C(String value) {
        this.learningManagementSystemC = value;
    }

    /**
     * Gets the value of the legacy_Source_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacy_Source_Id__C() {
        return legacySourceIdC;
    }

    /**
     * Sets the value of the legacy_Source_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacy_Source_Id__C(String value) {
        this.legacySourceIdC = value;
    }

    /**
     * Gets the value of the lifestyle__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifestyle__C() {
        return lifestyleC;
    }

    /**
     * Sets the value of the lifestyle__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifestyle__C(String value) {
        this.lifestyleC = value;
    }

    /**
     * Gets the value of the local_High_Stakes_Test__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocal_High_Stakes_Test__C() {
        return localHighStakesTestC;
    }

    /**
     * Sets the value of the local_High_Stakes_Test__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocal_High_Stakes_Test__C(String value) {
        this.localHighStakesTestC = value;
    }

    /**
     * Gets the value of the location_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation_Code__C() {
        return locationCodeC;
    }

    /**
     * Sets the value of the location_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation_Code__C(String value) {
        this.locationCodeC = value;
    }

    /**
     * Gets the value of the low_Grade__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLow_Grade__C() {
        return lowGradeC;
    }

    /**
     * Sets the value of the low_Grade__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLow_Grade__C(String value) {
        this.lowGradeC = value;
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
     * Gets the value of the mdr_Account_Close_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_Account_Close_Date__C() {
        return mdrAccountCloseDateC;
    }

    /**
     * Sets the value of the mdr_Account_Close_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_Account_Close_Date__C(String value) {
        this.mdrAccountCloseDateC = value;
    }

    /**
     * Gets the value of the mdr_Account_Open_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_Account_Open_Date__C() {
        return mdrAccountOpenDateC;
    }

    /**
     * Sets the value of the mdr_Account_Open_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_Account_Open_Date__C(String value) {
        this.mdrAccountOpenDateC = value;
    }

    /**
     * Gets the value of the mdr_All_Instruct_Materials_Expend__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMDR_All_Instruct_Materials_Expend__C() {
        return mdrAllInstructMaterialsExpendC;
    }

    /**
     * Sets the value of the mdr_All_Instruct_Materials_Expend__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMDR_All_Instruct_Materials_Expend__C(Double value) {
        this.mdrAllInstructMaterialsExpendC = value;
    }

    /**
     * Gets the value of the mdr_Apple_Computers_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_Apple_Computers_Code__C() {
        return mdrAppleComputersCodeC;
    }

    /**
     * Sets the value of the mdr_Apple_Computers_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_Apple_Computers_Code__C(String value) {
        this.mdrAppleComputersCodeC = value;
    }

    /**
     * Gets the value of the mdr_Apple_Computers_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_Apple_Computers_Desc__C() {
        return mdrAppleComputersDescC;
    }

    /**
     * Sets the value of the mdr_Apple_Computers_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_Apple_Computers_Desc__C(String value) {
        this.mdrAppleComputersDescC = value;
    }

    /**
     * Gets the value of the mdr_College_Bound_Percent__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMDR_College_Bound_Percent__C() {
        return mdrCollegeBoundPercentC;
    }

    /**
     * Sets the value of the mdr_College_Bound_Percent__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMDR_College_Bound_Percent__C(Double value) {
        this.mdrCollegeBoundPercentC = value;
    }

    /**
     * Gets the value of the mdr_County_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMDR_County_Code__C() {
        return mdrCountyCodeC;
    }

    /**
     * Sets the value of the mdr_County_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMDR_County_Code__C(Double value) {
        this.mdrCountyCodeC = value;
    }

    /**
     * Gets the value of the mdr_Enrollment_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_Enrollment_Code__C() {
        return mdrEnrollmentCodeC;
    }

    /**
     * Sets the value of the mdr_Enrollment_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_Enrollment_Code__C(String value) {
        this.mdrEnrollmentCodeC = value;
    }

    /**
     * Gets the value of the mdr_File_Type_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_File_Type_Code__C() {
        return mdrFileTypeCodeC;
    }

    /**
     * Sets the value of the mdr_File_Type_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_File_Type_Code__C(String value) {
        this.mdrFileTypeCodeC = value;
    }

    /**
     * Gets the value of the mdr_File_Type_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_File_Type_Desc__C() {
        return mdrFileTypeDescC;
    }

    /**
     * Sets the value of the mdr_File_Type_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_File_Type_Desc__C(String value) {
        this.mdrFileTypeDescC = value;
    }

    /**
     * Gets the value of the mdr_Household_Income_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_Household_Income_Code__C() {
        return mdrHouseholdIncomeCodeC;
    }

    /**
     * Sets the value of the mdr_Household_Income_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_Household_Income_Code__C(String value) {
        this.mdrHouseholdIncomeCodeC = value;
    }

    /**
     * Gets the value of the mdr_Household_Income_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_Household_Income_Desc__C() {
        return mdrHouseholdIncomeDescC;
    }

    /**
     * Sets the value of the mdr_Household_Income_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_Household_Income_Desc__C(String value) {
        this.mdrHouseholdIncomeDescC = value;
    }

    /**
     * Gets the value of the mdr_Market_Power__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_Market_Power__C() {
        return mdrMarketPowerC;
    }

    /**
     * Sets the value of the mdr_Market_Power__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_Market_Power__C(String value) {
        this.mdrMarketPowerC = value;
    }

    /**
     * Gets the value of the mdr_PC_Computers_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_PC_Computers_Code__C() {
        return mdrPCComputersCodeC;
    }

    /**
     * Sets the value of the mdr_PC_Computers_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_PC_Computers_Code__C(String value) {
        this.mdrPCComputersCodeC = value;
    }

    /**
     * Gets the value of the mdr_PC_Computers_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_PC_Computers_Desc__C() {
        return mdrPCComputersDescC;
    }

    /**
     * Sets the value of the mdr_PC_Computers_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_PC_Computers_Desc__C(String value) {
        this.mdrPCComputersDescC = value;
    }

    /**
     * Gets the value of the mdr_PID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_PID__C() {
        return mdrPIDC;
    }

    /**
     * Sets the value of the mdr_PID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_PID__C(String value) {
        this.mdrPIDC = value;
    }

    /**
     * Gets the value of the mdr_Poverty_Level_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_Poverty_Level_Code__C() {
        return mdrPovertyLevelCodeC;
    }

    /**
     * Sets the value of the mdr_Poverty_Level_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_Poverty_Level_Code__C(String value) {
        this.mdrPovertyLevelCodeC = value;
    }

    /**
     * Gets the value of the mdr_Poverty_Level_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_Poverty_Level_Desc__C() {
        return mdrPovertyLevelDescC;
    }

    /**
     * Sets the value of the mdr_Poverty_Level_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_Poverty_Level_Desc__C(String value) {
        this.mdrPovertyLevelDescC = value;
    }

    /**
     * Gets the value of the mdr_School_Class_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_School_Class_Code__C() {
        return mdrSchoolClassCodeC;
    }

    /**
     * Sets the value of the mdr_School_Class_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_School_Class_Code__C(String value) {
        this.mdrSchoolClassCodeC = value;
    }

    /**
     * Gets the value of the mdr_School_Class_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_School_Class_Desc__C() {
        return mdrSchoolClassDescC;
    }

    /**
     * Sets the value of the mdr_School_Class_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_School_Class_Desc__C(String value) {
        this.mdrSchoolClassDescC = value;
    }

    /**
     * Gets the value of the mdr_School_Type_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_School_Type_Code__C() {
        return mdrSchoolTypeCodeC;
    }

    /**
     * Sets the value of the mdr_School_Type_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_School_Type_Code__C(String value) {
        this.mdrSchoolTypeCodeC = value;
    }

    /**
     * Gets the value of the mdr_School_Type_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_School_Type_Desc__C() {
        return mdrSchoolTypeDescC;
    }

    /**
     * Sets the value of the mdr_School_Type_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_School_Type_Desc__C(String value) {
        this.mdrSchoolTypeDescC = value;
    }

    /**
     * Gets the value of the mdr_Title2_Allocation__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMDR_Title2_Allocation__C() {
        return mdrTitle2AllocationC;
    }

    /**
     * Sets the value of the mdr_Title2_Allocation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMDR_Title2_Allocation__C(Double value) {
        this.mdrTitle2AllocationC = value;
    }

    /**
     * Gets the value of the mdr_Universal_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDR_Universal_Code__C() {
        return mdrUniversalCodeC;
    }

    /**
     * Sets the value of the mdr_Universal_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDR_Universal_Code__C(String value) {
        this.mdrUniversalCodeC = value;
    }

    /**
     * Gets the value of the mdtPenabled__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDTPenabled__C() {
        return mdtPenabledC;
    }

    /**
     * Sets the value of the mdtPenabled__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDTPenabled__C(String value) {
        this.mdtPenabledC = value;
    }

    /**
     * Gets the value of the magnet__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMagnet__C() {
        return magnetC;
    }

    /**
     * Sets the value of the magnet__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMagnet__C(Boolean value) {
        this.magnetC = value;
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
     * Gets the value of the masterRecord property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getMasterRecord() {
        return masterRecord;
    }

    /**
     * Sets the value of the masterRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setMasterRecord(AccountType value) {
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
     * Gets the value of the math_Performance_Trend__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMath_Performance_Trend__C() {
        return mathPerformanceTrendC;
    }

    /**
     * Sets the value of the math_Performance_Trend__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMath_Performance_Trend__C(Double value) {
        this.mathPerformanceTrendC = value;
    }

    /**
     * Gets the value of the merge_Account_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerge_Account_ID__C() {
        return mergeAccountIDC;
    }

    /**
     * Sets the value of the merge_Account_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerge_Account_ID__C(String value) {
        this.mergeAccountIDC = value;
    }

    /**
     * Gets the value of the middle_School_Count__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMiddle_School_Count__C() {
        return middleSchoolCountC;
    }

    /**
     * Sets the value of the middle_School_Count__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMiddle_School_Count__C(Double value) {
        this.middleSchoolCountC = value;
    }

    /**
     * Gets the value of the moduleBench__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleBench__C() {
        return moduleBenchC;
    }

    /**
     * Sets the value of the moduleBench__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleBench__C(String value) {
        this.moduleBenchC = value;
    }

    /**
     * Gets the value of the moduleState__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleState__C() {
        return moduleStateC;
    }

    /**
     * Sets the value of the moduleState__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleState__C(String value) {
        this.moduleStateC = value;
    }

    /**
     * Gets the value of the moduleTT__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleTT__C() {
        return moduleTTC;
    }

    /**
     * Sets the value of the moduleTT__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleTT__C(String value) {
        this.moduleTTC = value;
    }

    /**
     * Gets the value of the module_Curriculum_Management__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModule_Curriculum_Management__C() {
        return moduleCurriculumManagementC;
    }

    /**
     * Sets the value of the module_Curriculum_Management__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModule_Curriculum_Management__C(String value) {
        this.moduleCurriculumManagementC = value;
    }

    /**
     * Gets the value of the nces_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCES_Id__C() {
        return ncesIdC;
    }

    /**
     * Sets the value of the nces_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCES_Id__C(String value) {
        this.ncesIdC = value;
    }

    /**
     * Gets the value of the nces_Locale_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCES_Locale_Desc__C() {
        return ncesLocaleDescC;
    }

    /**
     * Sets the value of the nces_Locale_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCES_Locale_Desc__C(String value) {
        this.ncesLocaleDescC = value;
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
     * Gets the value of the non_Basal_Curriculum_Program__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNon_Basal_Curriculum_Program__C() {
        return nonBasalCurriculumProgramC;
    }

    /**
     * Sets the value of the non_Basal_Curriculum_Program__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNon_Basal_Curriculum_Program__C(String value) {
        this.nonBasalCurriculumProgramC = value;
    }

    /**
     * Gets the value of the non_Basal_Curriculum_User__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNon_Basal_Curriculum_User__C() {
        return nonBasalCurriculumUserC;
    }

    /**
     * Sets the value of the non_Basal_Curriculum_User__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNon_Basal_Curriculum_User__C(Boolean value) {
        this.nonBasalCurriculumUserC = value;
    }

    /**
     * Gets the value of the notable_Recent_Events__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotable_Recent_Events__C() {
        return notableRecentEventsC;
    }

    /**
     * Sets the value of the notable_Recent_Events__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotable_Recent_Events__C(String value) {
        this.notableRecentEventsC = value;
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
     * Gets the value of the office_Front_Or_Back__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffice_Front_Or_Back__C() {
        return officeFrontOrBackC;
    }

    /**
     * Sets the value of the office_Front_Or_Back__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffice_Front_Or_Back__C(String value) {
        this.officeFrontOrBackC = value;
    }

    /**
     * Gets the value of the office_Lock__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOffice_Lock__C() {
        return officeLockC;
    }

    /**
     * Sets the value of the office_Lock__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOffice_Lock__C(Boolean value) {
        this.officeLockC = value;
    }

    /**
     * Gets the value of the online_Testing__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnline_Testing__C() {
        return onlineTestingC;
    }

    /**
     * Sets the value of the online_Testing__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnline_Testing__C(String value) {
        this.onlineTestingC = value;
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
     * Gets the value of the opportunityPartnersTo property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpportunityPartnersTo() {
        return opportunityPartnersTo;
    }

    /**
     * Sets the value of the opportunityPartnersTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpportunityPartnersTo(QueryResult value) {
        this.opportunityPartnersTo = value;
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
     * Gets the value of the other_Email__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther_Email__C() {
        return otherEmailC;
    }

    /**
     * Sets the value of the other_Email__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther_Email__C(String value) {
        this.otherEmailC = value;
    }

    /**
     * Gets the value of the other_Fax__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther_Fax__C() {
        return otherFaxC;
    }

    /**
     * Sets the value of the other_Fax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther_Fax__C(String value) {
        this.otherFaxC = value;
    }

    /**
     * Gets the value of the other_Phone__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther_Phone__C() {
        return otherPhoneC;
    }

    /**
     * Sets the value of the other_Phone__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther_Phone__C(String value) {
        this.otherPhoneC = value;
    }

    /**
     * Gets the value of the other_School_Count__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOther_School_Count__C() {
        return otherSchoolCountC;
    }

    /**
     * Sets the value of the other_School_Count__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOther_School_Count__C(Double value) {
        this.otherSchoolCountC = value;
    }

    /**
     * Gets the value of the other_Website__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther_Website__C() {
        return otherWebsiteC;
    }

    /**
     * Sets the value of the other_Website__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther_Website__C(String value) {
        this.otherWebsiteC = value;
    }

    /**
     * Gets the value of the overall_Budget__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverall_Budget__C() {
        return overallBudgetC;
    }

    /**
     * Sets the value of the overall_Budget__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverall_Budget__C(Double value) {
        this.overallBudgetC = value;
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
     * Gets the value of the pd_Management__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD_Management__C() {
        return pdManagementC;
    }

    /**
     * Sets the value of the pd_Management__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD_Management__C(String value) {
        this.pdManagementC = value;
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
     * Gets the value of the pk__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPK__C() {
        return pkC;
    }

    /**
     * Sets the value of the pk__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPK__C(Double value) {
        this.pkC = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setParent(AccountType value) {
        this.parent = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentId(String value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the parent_Account_County__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent_Account_County__C() {
        return parentAccountCountyC;
    }

    /**
     * Sets the value of the parent_Account_County__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent_Account_County__C(String value) {
        this.parentAccountCountyC = value;
    }

    /**
     * Gets the value of the parent_Account_Enrollment__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getParent_Account_Enrollment__C() {
        return parentAccountEnrollmentC;
    }

    /**
     * Sets the value of the parent_Account_Enrollment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setParent_Account_Enrollment__C(Double value) {
        this.parentAccountEnrollmentC = value;
    }

    /**
     * Gets the value of the parent_Current_District_Total__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getParent_Current_District_Total__C() {
        return parentCurrentDistrictTotalC;
    }

    /**
     * Sets the value of the parent_Current_District_Total__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setParent_Current_District_Total__C(Double value) {
        this.parentCurrentDistrictTotalC = value;
    }

    /**
     * Gets the value of the parent_Current_Pupil__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent_Current_Pupil__C() {
        return parentCurrentPupilC;
    }

    /**
     * Sets the value of the parent_Current_Pupil__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent_Current_Pupil__C(String value) {
        this.parentCurrentPupilC = value;
    }

    /**
     * Gets the value of the parent_Enrollment_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent_Enrollment_Code__C() {
        return parentEnrollmentCodeC;
    }

    /**
     * Sets the value of the parent_Enrollment_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent_Enrollment_Code__C(String value) {
        this.parentEnrollmentCodeC = value;
    }

    /**
     * Gets the value of the parent_Enrollment__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getParent_Enrollment__C() {
        return parentEnrollmentC;
    }

    /**
     * Sets the value of the parent_Enrollment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setParent_Enrollment__C(Double value) {
        this.parentEnrollmentC = value;
    }

    /**
     * Gets the value of the parent_MDR_File_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent_MDR_File_Type__C() {
        return parentMDRFileTypeC;
    }

    /**
     * Sets the value of the parent_MDR_File_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent_MDR_File_Type__C(String value) {
        this.parentMDRFileTypeC = value;
    }

    /**
     * Gets the value of the parent_Market_Power__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent_Market_Power__C() {
        return parentMarketPowerC;
    }

    /**
     * Sets the value of the parent_Market_Power__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent_Market_Power__C(String value) {
        this.parentMarketPowerC = value;
    }

    /**
     * Gets the value of the parent_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent_Name__C() {
        return parentNameC;
    }

    /**
     * Sets the value of the parent_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent_Name__C(String value) {
        this.parentNameC = value;
    }

    /**
     * Gets the value of the parent_PID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent_PID__C() {
        return parentPIDC;
    }

    /**
     * Sets the value of the parent_PID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent_PID__C(String value) {
        this.parentPIDC = value;
    }

    /**
     * Gets the value of the parent_Title_1_Per_Pupil__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent_Title_1_Per_Pupil__C() {
        return parentTitle1PerPupilC;
    }

    /**
     * Sets the value of the parent_Title_1_Per_Pupil__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent_Title_1_Per_Pupil__C(String value) {
        this.parentTitle1PerPupilC = value;
    }

    /**
     * Gets the value of the parent_View__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent_View__C() {
        return parentViewC;
    }

    /**
     * Sets the value of the parent_View__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent_View__C(String value) {
        this.parentViewC = value;
    }

    /**
     * Gets the value of the part_Time_Enrollment__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPart_Time_Enrollment__C() {
        return partTimeEnrollmentC;
    }

    /**
     * Sets the value of the part_Time_Enrollment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPart_Time_Enrollment__C(Double value) {
        this.partTimeEnrollmentC = value;
    }

    /**
     * Gets the value of the partnersFrom property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getPartnersFrom() {
        return partnersFrom;
    }

    /**
     * Sets the value of the partnersFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setPartnersFrom(QueryResult value) {
        this.partnersFrom = value;
    }

    /**
     * Gets the value of the partnersTo property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getPartnersTo() {
        return partnersTo;
    }

    /**
     * Sets the value of the partnersTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setPartnersTo(QueryResult value) {
        this.partnersTo = value;
    }

    /**
     * Gets the value of the percent_Asian__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercent_Asian__C() {
        return percentAsianC;
    }

    /**
     * Sets the value of the percent_Asian__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercent_Asian__C(Double value) {
        this.percentAsianC = value;
    }

    /**
     * Gets the value of the percent_Black__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercent_Black__C() {
        return percentBlackC;
    }

    /**
     * Sets the value of the percent_Black__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercent_Black__C(Double value) {
        this.percentBlackC = value;
    }

    /**
     * Gets the value of the percent_Hispanic__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercent_Hispanic__C() {
        return percentHispanicC;
    }

    /**
     * Sets the value of the percent_Hispanic__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercent_Hispanic__C(Double value) {
        this.percentHispanicC = value;
    }

    /**
     * Gets the value of the percent_Native_American__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercent_Native_American__C() {
        return percentNativeAmericanC;
    }

    /**
     * Sets the value of the percent_Native_American__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercent_Native_American__C(Double value) {
        this.percentNativeAmericanC = value;
    }

    /**
     * Gets the value of the percent_White__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercent_White__C() {
        return percentWhiteC;
    }

    /**
     * Sets the value of the percent_White__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercent_White__C(Double value) {
        this.percentWhiteC = value;
    }

    /**
     * Gets the value of the performance_Source_URL__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformance_Source_URL__C() {
        return performanceSourceURLC;
    }

    /**
     * Sets the value of the performance_Source_URL__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformance_Source_URL__C(String value) {
        this.performanceSourceURLC = value;
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
     * Gets the value of the planning_Priority__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanning_Priority__C() {
        return planningPriorityC;
    }

    /**
     * Sets the value of the planning_Priority__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanning_Priority__C(String value) {
        this.planningPriorityC = value;
    }

    /**
     * Gets the value of the pnP_Account_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPnP_Account_Flag__C() {
        return pnPAccountFlagC;
    }

    /**
     * Sets the value of the pnP_Account_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPnP_Account_Flag__C(Boolean value) {
        this.pnPAccountFlagC = value;
    }

    /**
     * Gets the value of the poverty_Percent__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPoverty_Percent__C() {
        return povertyPercentC;
    }

    /**
     * Sets the value of the poverty_Percent__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPoverty_Percent__C(Double value) {
        this.povertyPercentC = value;
    }

    /**
     * Gets the value of the pref_School_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPref_School_Name__C() {
        return prefSchoolNameC;
    }

    /**
     * Sets the value of the pref_School_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPref_School_Name__C(String value) {
        this.prefSchoolNameC = value;
    }

    /**
     * Gets the value of the prefferred_Location__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefferred_Location__C() {
        return prefferredLocationC;
    }

    /**
     * Sets the value of the prefferred_Location__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefferred_Location__C(String value) {
        this.prefferredLocationC = value;
    }

    /**
     * Gets the value of the presentations__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getPresentations__R() {
        return presentationsR;
    }

    /**
     * Sets the value of the presentations__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setPresentations__R(QueryResult value) {
        this.presentationsR = value;
    }

    /**
     * Gets the value of the private_School_Type_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivate_School_Type_Comments__C() {
        return privateSchoolTypeCommentsC;
    }

    /**
     * Sets the value of the private_School_Type_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivate_School_Type_Comments__C(String value) {
        this.privateSchoolTypeCommentsC = value;
    }

    /**
     * Gets the value of the private_School_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivate_School_Type__C() {
        return privateSchoolTypeC;
    }

    /**
     * Sets the value of the private_School_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivate_School_Type__C(String value) {
        this.privateSchoolTypeC = value;
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
     * Gets the value of the process_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcess_Type__C() {
        return processTypeC;
    }

    /**
     * Sets the value of the process_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcess_Type__C(String value) {
        this.processTypeC = value;
    }

    /**
     * Gets the value of the products_In_Use__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getProducts_In_Use__R() {
        return productsInUseR;
    }

    /**
     * Sets the value of the products_In_Use__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setProducts_In_Use__R(QueryResult value) {
        this.productsInUseR = value;
    }

    /**
     * Gets the value of the professional_Development_Partners__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessional_Development_Partners__C() {
        return professionalDevelopmentPartnersC;
    }

    /**
     * Sets the value of the professional_Development_Partners__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessional_Development_Partners__C(String value) {
        this.professionalDevelopmentPartnersC = value;
    }

    /**
     * Gets the value of the professional_Development_Type_In_Use__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessional_Development_Type_In_Use__C() {
        return professionalDevelopmentTypeInUseC;
    }

    /**
     * Sets the value of the professional_Development_Type_In_Use__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessional_Development_Type_In_Use__C(String value) {
        this.professionalDevelopmentTypeInUseC = value;
    }

    /**
     * Gets the value of the professional_Development_Yr_Implemented__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessional_Development_Yr_Implemented__C() {
        return professionalDevelopmentYrImplementedC;
    }

    /**
     * Sets the value of the professional_Development_Yr_Implemented__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessional_Development_Yr_Implemented__C(String value) {
        this.professionalDevelopmentYrImplementedC = value;
    }

    /**
     * Gets the value of the profile_Analyst_User__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile_Analyst_User__C() {
        return profileAnalystUserC;
    }

    /**
     * Sets the value of the profile_Analyst_User__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile_Analyst_User__C(String value) {
        this.profileAnalystUserC = value;
    }

    /**
     * Gets the value of the profile_Analyst_User__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getProfile_Analyst_User__R() {
        return profileAnalystUserR;
    }

    /**
     * Sets the value of the profile_Analyst_User__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setProfile_Analyst_User__R(UserType value) {
        this.profileAnalystUserR = value;
    }

    /**
     * Gets the value of the r00N60000001PRP8EAO__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getR00N60000001PRP8EAO__R() {
        return r00N60000001PRP8EAOR;
    }

    /**
     * Sets the value of the r00N60000001PRP8EAO__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setR00N60000001PRP8EAO__R(QueryResult value) {
        this.r00N60000001PRP8EAOR = value;
    }

    /**
     * Gets the value of the race_To_The_Top__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRace_To_The_Top__C() {
        return raceToTheTopC;
    }

    /**
     * Sets the value of the race_To_The_Top__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRace_To_The_Top__C(Double value) {
        this.raceToTheTopC = value;
    }

    /**
     * Gets the value of the range_Of_IBMs__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRange_Of_IBMs__C() {
        return rangeOfIBMsC;
    }

    /**
     * Sets the value of the range_Of_IBMs__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRange_Of_IBMs__C(String value) {
        this.rangeOfIBMsC = value;
    }

    /**
     * Gets the value of the range_Of_Macs__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRange_Of_Macs__C() {
        return rangeOfMacsC;
    }

    /**
     * Sets the value of the range_Of_Macs__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRange_Of_Macs__C(String value) {
        this.rangeOfMacsC = value;
    }

    /**
     * Gets the value of the reclaim_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReclaim_Date__C() {
        return reclaimDateC;
    }

    /**
     * Sets the value of the reclaim_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReclaim_Date__C(XMLGregorianCalendar value) {
        this.reclaimDateC = value;
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
     * Gets the value of the related_MDR_Account__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated_MDR_Account__C() {
        return relatedMDRAccountC;
    }

    /**
     * Sets the value of the related_MDR_Account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated_MDR_Account__C(String value) {
        this.relatedMDRAccountC = value;
    }

    /**
     * Gets the value of the related_MDR_Account__R property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getRelated_MDR_Account__R() {
        return relatedMDRAccountR;
    }

    /**
     * Sets the value of the related_MDR_Account__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setRelated_MDR_Account__R(AccountType value) {
        this.relatedMDRAccountR = value;
    }

    /**
     * Gets the value of the related_Profile_Parent_Account__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated_Profile_Parent_Account__C() {
        return relatedProfileParentAccountC;
    }

    /**
     * Sets the value of the related_Profile_Parent_Account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated_Profile_Parent_Account__C(String value) {
        this.relatedProfileParentAccountC = value;
    }

    /**
     * Gets the value of the related_Profile_Parent_Account__R property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getRelated_Profile_Parent_Account__R() {
        return relatedProfileParentAccountR;
    }

    /**
     * Sets the value of the related_Profile_Parent_Account__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setRelated_Profile_Parent_Account__R(AccountType value) {
        this.relatedProfileParentAccountR = value;
    }

    /**
     * Gets the value of the related_SAP_Primary_Account__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated_SAP_Primary_Account__C() {
        return relatedSAPPrimaryAccountC;
    }

    /**
     * Sets the value of the related_SAP_Primary_Account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated_SAP_Primary_Account__C(String value) {
        this.relatedSAPPrimaryAccountC = value;
    }

    /**
     * Gets the value of the reseller_2008_HMH_Revenue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReseller_2008_HMH_Revenue__C() {
        return reseller2008HMHRevenueC;
    }

    /**
     * Sets the value of the reseller_2008_HMH_Revenue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReseller_2008_HMH_Revenue__C(Double value) {
        this.reseller2008HMHRevenueC = value;
    }

    /**
     * Gets the value of the reseller_2009_HMH_Revenue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReseller_2009_HMH_Revenue__C() {
        return reseller2009HMHRevenueC;
    }

    /**
     * Sets the value of the reseller_2009_HMH_Revenue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReseller_2009_HMH_Revenue__C(Double value) {
        this.reseller2009HMHRevenueC = value;
    }

    /**
     * Gets the value of the reseller_Account_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReseller_Account_Flag__C() {
        return resellerAccountFlagC;
    }

    /**
     * Sets the value of the reseller_Account_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReseller_Account_Flag__C(Boolean value) {
        this.resellerAccountFlagC = value;
    }

    /**
     * Gets the value of the reseller_Adherence_To_HMH_Policies__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReseller_Adherence_To_HMH_Policies__C() {
        return resellerAdherenceToHMHPoliciesC;
    }

    /**
     * Sets the value of the reseller_Adherence_To_HMH_Policies__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReseller_Adherence_To_HMH_Policies__C(Boolean value) {
        this.resellerAdherenceToHMHPoliciesC = value;
    }

    /**
     * Gets the value of the reseller_Areas_Of_Interest__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReseller_Areas_Of_Interest__C() {
        return resellerAreasOfInterestC;
    }

    /**
     * Sets the value of the reseller_Areas_Of_Interest__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReseller_Areas_Of_Interest__C(String value) {
        this.resellerAreasOfInterestC = value;
    }

    /**
     * Gets the value of the reseller_Business_Terms__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReseller_Business_Terms__C() {
        return resellerBusinessTermsC;
    }

    /**
     * Sets the value of the reseller_Business_Terms__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReseller_Business_Terms__C(String value) {
        this.resellerBusinessTermsC = value;
    }

    /**
     * Gets the value of the reseller_Channels__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReseller_Channels__C() {
        return resellerChannelsC;
    }

    /**
     * Sets the value of the reseller_Channels__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReseller_Channels__C(String value) {
        this.resellerChannelsC = value;
    }

    /**
     * Gets the value of the reseller_Data_Transmission_Method__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReseller_Data_Transmission_Method__C() {
        return resellerDataTransmissionMethodC;
    }

    /**
     * Sets the value of the reseller_Data_Transmission_Method__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReseller_Data_Transmission_Method__C(String value) {
        this.resellerDataTransmissionMethodC = value;
    }

    /**
     * Gets the value of the reseller_Divisions__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReseller_Divisions__C() {
        return resellerDivisionsC;
    }

    /**
     * Sets the value of the reseller_Divisions__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReseller_Divisions__C(String value) {
        this.resellerDivisionsC = value;
    }

    /**
     * Gets the value of the reseller_Geography_Covered__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReseller_Geography_Covered__C() {
        return resellerGeographyCoveredC;
    }

    /**
     * Sets the value of the reseller_Geography_Covered__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReseller_Geography_Covered__C(String value) {
        this.resellerGeographyCoveredC = value;
    }

    /**
     * Gets the value of the reseller_Key_Contact_Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReseller_Key_Contact_Notes__C() {
        return resellerKeyContactNotesC;
    }

    /**
     * Sets the value of the reseller_Key_Contact_Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReseller_Key_Contact_Notes__C(String value) {
        this.resellerKeyContactNotesC = value;
    }

    /**
     * Gets the value of the reseller_Minimum_Margin__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReseller_Minimum_Margin__C() {
        return resellerMinimumMarginC;
    }

    /**
     * Sets the value of the reseller_Minimum_Margin__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReseller_Minimum_Margin__C(Double value) {
        this.resellerMinimumMarginC = value;
    }

    /**
     * Gets the value of the reseller_Organization__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReseller_Organization__C() {
        return resellerOrganizationC;
    }

    /**
     * Sets the value of the reseller_Organization__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReseller_Organization__C(String value) {
        this.resellerOrganizationC = value;
    }

    /**
     * Gets the value of the reseller_Ownership__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReseller_Ownership__C() {
        return resellerOwnershipC;
    }

    /**
     * Sets the value of the reseller_Ownership__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReseller_Ownership__C(String value) {
        this.resellerOwnershipC = value;
    }

    /**
     * Gets the value of the reseller_Print_Technology__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReseller_Print_Technology__C() {
        return resellerPrintTechnologyC;
    }

    /**
     * Sets the value of the reseller_Print_Technology__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReseller_Print_Technology__C(String value) {
        this.resellerPrintTechnologyC = value;
    }

    /**
     * Gets the value of the reseller_Product_Type_Sold__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReseller_Product_Type_Sold__C() {
        return resellerProductTypeSoldC;
    }

    /**
     * Sets the value of the reseller_Product_Type_Sold__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReseller_Product_Type_Sold__C(String value) {
        this.resellerProductTypeSoldC = value;
    }

    /**
     * Gets the value of the reseller_Sales_Model__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReseller_Sales_Model__C() {
        return resellerSalesModelC;
    }

    /**
     * Sets the value of the reseller_Sales_Model__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReseller_Sales_Model__C(String value) {
        this.resellerSalesModelC = value;
    }

    /**
     * Gets the value of the reseller_Seasonality__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReseller_Seasonality__C() {
        return resellerSeasonalityC;
    }

    /**
     * Sets the value of the reseller_Seasonality__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReseller_Seasonality__C(String value) {
        this.resellerSeasonalityC = value;
    }

    /**
     * Gets the value of the reseller_Sell_Through_Data_Available__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReseller_Sell_Through_Data_Available__C() {
        return resellerSellThroughDataAvailableC;
    }

    /**
     * Sets the value of the reseller_Sell_Through_Data_Available__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReseller_Sell_Through_Data_Available__C(Boolean value) {
        this.resellerSellThroughDataAvailableC = value;
    }

    /**
     * Gets the value of the risk_Marker__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRisk_Marker__C() {
        return riskMarkerC;
    }

    /**
     * Sets the value of the risk_Marker__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRisk_Marker__C(String value) {
        this.riskMarkerC = value;
    }

    /**
     * Gets the value of the roster_Update_History__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoster_Update_History__C() {
        return rosterUpdateHistoryC;
    }

    /**
     * Sets the value of the roster_Update_History__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoster_Update_History__C(String value) {
        this.rosterUpdateHistoryC = value;
    }

    /**
     * Gets the value of the routing_Instructions__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouting_Instructions__C() {
        return routingInstructionsC;
    }

    /**
     * Sets the value of the routing_Instructions__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouting_Instructions__C(String value) {
        this.routingInstructionsC = value;
    }

    /**
     * Gets the value of the san__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAN__C() {
        return sanC;
    }

    /**
     * Sets the value of the san__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAN__C(String value) {
        this.sanC = value;
    }

    /**
     * Gets the value of the sap_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Comments__C() {
        return sapCommentsC;
    }

    /**
     * Sets the value of the sap_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Comments__C(String value) {
        this.sapCommentsC = value;
    }

    /**
     * Gets the value of the sap_Customer_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Customer_Type__C() {
        return sapCustomerTypeC;
    }

    /**
     * Sets the value of the sap_Customer_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Customer_Type__C(String value) {
        this.sapCustomerTypeC = value;
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
     * Gets the value of the sap_Email__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Email__C() {
        return sapEmailC;
    }

    /**
     * Sets the value of the sap_Email__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Email__C(String value) {
        this.sapEmailC = value;
    }

    /**
     * Gets the value of the sch_Data_Set_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCH_Data_Set_Name__C() {
        return schDataSetNameC;
    }

    /**
     * Sets the value of the sch_Data_Set_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCH_Data_Set_Name__C(String value) {
        this.schDataSetNameC = value;
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
     * Gets the value of the sfdc_Territories__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFDC_Territories__C() {
        return sfdcTerritoriesC;
    }

    /**
     * Sets the value of the sfdc_Territories__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFDC_Territories__C(String value) {
        this.sfdcTerritoriesC = value;
    }

    /**
     * Gets the value of the sftp_User__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFTP_User__C() {
        return sftpUserC;
    }

    /**
     * Sets the value of the sftp_User__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFTP_User__C(String value) {
        this.sftpUserC = value;
    }

    /**
     * Gets the value of the sftp_Username__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFTP_Username__C() {
        return sftpUsernameC;
    }

    /**
     * Sets the value of the sftp_Username__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFTP_Username__C(String value) {
        this.sftpUsernameC = value;
    }

    /**
     * Gets the value of the sup_Data_Set_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUP_Data_Set_Name__C() {
        return supDataSetNameC;
    }

    /**
     * Sets the value of the sup_Data_Set_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUP_Data_Set_Name__C(String value) {
        this.supDataSetNameC = value;
    }

    /**
     * Gets the value of the sv_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSV_Amount__C() {
        return svAmountC;
    }

    /**
     * Sets the value of the sv_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSV_Amount__C(Double value) {
        this.svAmountC = value;
    }

    /**
     * Gets the value of the sy10_11_SIG_Funding__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSY10_11_SIG_Funding__C() {
        return sy1011SIGFundingC;
    }

    /**
     * Sets the value of the sy10_11_SIG_Funding__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSY10_11_SIG_Funding__C(Double value) {
        this.sy1011SIGFundingC = value;
    }

    /**
     * Gets the value of the sy11_12_SIG_Funding__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSY11_12_SIG_Funding__C() {
        return sy1112SIGFundingC;
    }

    /**
     * Sets the value of the sy11_12_SIG_Funding__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSY11_12_SIG_Funding__C(Double value) {
        this.sy1112SIGFundingC = value;
    }

    /**
     * Gets the value of the sales_2010_HMD__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSales_2010_HMD__C() {
        return sales2010HMDC;
    }

    /**
     * Sets the value of the sales_2010_HMD__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSales_2010_HMD__C(Double value) {
        this.sales2010HMDC = value;
    }

    /**
     * Gets the value of the sales_2010_IIE__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSales_2010_IIE__C() {
        return sales2010IIEC;
    }

    /**
     * Sets the value of the sales_2010_IIE__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSales_2010_IIE__C(Double value) {
        this.sales2010IIEC = value;
    }

    /**
     * Gets the value of the sales_2010_RPC__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSales_2010_RPC__C() {
        return sales2010RPCC;
    }

    /**
     * Sets the value of the sales_2010_RPC__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSales_2010_RPC__C(Double value) {
        this.sales2010RPCC = value;
    }

    /**
     * Gets the value of the sales_2010_SCG__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSales_2010_SCG__C() {
        return sales2010SCGC;
    }

    /**
     * Sets the value of the sales_2010_SCG__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSales_2010_SCG__C(Double value) {
        this.sales2010SCGC = value;
    }

    /**
     * Gets the value of the sales_2010_SCH__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSales_2010_SCH__C() {
        return sales2010SCHC;
    }

    /**
     * Sets the value of the sales_2010_SCH__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSales_2010_SCH__C(Double value) {
        this.sales2010SCHC = value;
    }

    /**
     * Gets the value of the sales_2011_HMD__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSales_2011_HMD__C() {
        return sales2011HMDC;
    }

    /**
     * Sets the value of the sales_2011_HMD__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSales_2011_HMD__C(Double value) {
        this.sales2011HMDC = value;
    }

    /**
     * Gets the value of the sales_2011_IIE__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSales_2011_IIE__C() {
        return sales2011IIEC;
    }

    /**
     * Sets the value of the sales_2011_IIE__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSales_2011_IIE__C(Double value) {
        this.sales2011IIEC = value;
    }

    /**
     * Gets the value of the sales_2011_RPC__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSales_2011_RPC__C() {
        return sales2011RPCC;
    }

    /**
     * Sets the value of the sales_2011_RPC__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSales_2011_RPC__C(Double value) {
        this.sales2011RPCC = value;
    }

    /**
     * Gets the value of the sales_2011_SCG__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSales_2011_SCG__C() {
        return sales2011SCGC;
    }

    /**
     * Sets the value of the sales_2011_SCG__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSales_2011_SCG__C(Double value) {
        this.sales2011SCGC = value;
    }

    /**
     * Gets the value of the sales_2011_SCH__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSales_2011_SCH__C() {
        return sales2011SCHC;
    }

    /**
     * Sets the value of the sales_2011_SCH__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSales_2011_SCH__C(Double value) {
        this.sales2011SCHC = value;
    }

    /**
     * Gets the value of the sales_Plan_Users__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getSales_Plan_Users__R() {
        return salesPlanUsersR;
    }

    /**
     * Sets the value of the sales_Plan_Users__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setSales_Plan_Users__R(QueryResult value) {
        this.salesPlanUsersR = value;
    }

    /**
     * Gets the value of the school_Association__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchool_Association__C() {
        return schoolAssociationC;
    }

    /**
     * Sets the value of the school_Association__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchool_Association__C(String value) {
        this.schoolAssociationC = value;
    }

    /**
     * Gets the value of the school_Class_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchool_Class_Code__C() {
        return schoolClassCodeC;
    }

    /**
     * Sets the value of the school_Class_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchool_Class_Code__C(String value) {
        this.schoolClassCodeC = value;
    }

    /**
     * Gets the value of the school_Improvement_Grant__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSchool_Improvement_Grant__C() {
        return schoolImprovementGrantC;
    }

    /**
     * Sets the value of the school_Improvement_Grant__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSchool_Improvement_Grant__C(Double value) {
        this.schoolImprovementGrantC = value;
    }

    /**
     * Gets the value of the school_Supply_Account_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSchool_Supply_Account_Flag__C() {
        return schoolSupplyAccountFlagC;
    }

    /**
     * Sets the value of the school_Supply_Account_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSchool_Supply_Account_Flag__C(Boolean value) {
        this.schoolSupplyAccountFlagC = value;
    }

    /**
     * Gets the value of the school_System__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchool_System__C() {
        return schoolSystemC;
    }

    /**
     * Sets the value of the school_System__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchool_System__C(String value) {
        this.schoolSystemC = value;
    }

    /**
     * Gets the value of the school_Type_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchool_Type_Code__C() {
        return schoolTypeCodeC;
    }

    /**
     * Sets the value of the school_Type_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchool_Type_Code__C(String value) {
        this.schoolTypeCodeC = value;
    }

    /**
     * Gets the value of the school_Type_Grade_Range__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchool_Type_Grade_Range__C() {
        return schoolTypeGradeRangeC;
    }

    /**
     * Sets the value of the school_Type_Grade_Range__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchool_Type_Grade_Range__C(String value) {
        this.schoolTypeGradeRangeC = value;
    }

    /**
     * Gets the value of the school_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchool_Type__C() {
        return schoolTypeC;
    }

    /**
     * Sets the value of the school_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchool_Type__C(String value) {
        this.schoolTypeC = value;
    }

    /**
     * Gets the value of the school_Year__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchool_Year__C() {
        return schoolYearC;
    }

    /**
     * Sets the value of the school_Year__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchool_Year__C(String value) {
        this.schoolYearC = value;
    }

    /**
     * Gets the value of the self_Contained__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelf_Contained__C() {
        return selfContainedC;
    }

    /**
     * Sets the value of the self_Contained__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelf_Contained__C(Boolean value) {
        this.selfContainedC = value;
    }

    /**
     * Gets the value of the senior_A_M__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenior_A_M__C() {
        return seniorAMC;
    }

    /**
     * Sets the value of the senior_A_M__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenior_A_M__C(String value) {
        this.seniorAMC = value;
    }

    /**
     * Gets the value of the senior_A_M__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getSenior_A_M__R() {
        return seniorAMR;
    }

    /**
     * Sets the value of the senior_A_M__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setSenior_A_M__R(UserType value) {
        this.seniorAMR = value;
    }

    /**
     * Gets the value of the service_Group__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService_Group__C() {
        return serviceGroupC;
    }

    /**
     * Sets the value of the service_Group__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService_Group__C(String value) {
        this.serviceGroupC = value;
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
     * Gets the value of the share_Demographics__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShare_Demographics__C() {
        return shareDemographicsC;
    }

    /**
     * Sets the value of the share_Demographics__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShare_Demographics__C(String value) {
        this.shareDemographicsC = value;
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
     * Gets the value of the shippingCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCity() {
        return shippingCity;
    }

    /**
     * Sets the value of the shippingCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCity(String value) {
        this.shippingCity = value;
    }

    /**
     * Gets the value of the shippingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCountry() {
        return shippingCountry;
    }

    /**
     * Sets the value of the shippingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCountry(String value) {
        this.shippingCountry = value;
    }

    /**
     * Gets the value of the shippingPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingPostalCode() {
        return shippingPostalCode;
    }

    /**
     * Sets the value of the shippingPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingPostalCode(String value) {
        this.shippingPostalCode = value;
    }

    /**
     * Gets the value of the shippingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingState() {
        return shippingState;
    }

    /**
     * Sets the value of the shippingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingState(String value) {
        this.shippingState = value;
    }

    /**
     * Gets the value of the shippingStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingStreet() {
        return shippingStreet;
    }

    /**
     * Sets the value of the shippingStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingStreet(String value) {
        this.shippingStreet = value;
    }

    /**
     * Gets the value of the shipping_Address_Street_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipping_Address_Street_2__C() {
        return shippingAddressStreet2C;
    }

    /**
     * Sets the value of the shipping_Address_Street_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipping_Address_Street_2__C(String value) {
        this.shippingAddressStreet2C = value;
    }

    /**
     * Gets the value of the shipping_Address_Street_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipping_Address_Street_3__C() {
        return shippingAddressStreet3C;
    }

    /**
     * Sets the value of the shipping_Address_Street_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipping_Address_Street_3__C(String value) {
        this.shippingAddressStreet3C = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
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
     * Gets the value of the source__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource__C() {
        return sourceC;
    }

    /**
     * Sets the value of the source__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource__C(String value) {
        this.sourceC = value;
    }

    /**
     * Gets the value of the state_High_Stakes_Test__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState_High_Stakes_Test__C() {
        return stateHighStakesTestC;
    }

    /**
     * Sets the value of the state_High_Stakes_Test__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState_High_Stakes_Test__C(String value) {
        this.stateHighStakesTestC = value;
    }

    /**
     * Gets the value of the strategic_Account_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStrategic_Account_Flag__C() {
        return strategicAccountFlagC;
    }

    /**
     * Sets the value of the strategic_Account_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrategic_Account_Flag__C(Boolean value) {
        this.strategicAccountFlagC = value;
    }

    /**
     * Gets the value of the student_Computers__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudent_Computers__C() {
        return studentComputersC;
    }

    /**
     * Sets the value of the student_Computers__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudent_Computers__C(String value) {
        this.studentComputersC = value;
    }

    /**
     * Gets the value of the student_Information_System_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudent_Information_System_Contact__C() {
        return studentInformationSystemContactC;
    }

    /**
     * Sets the value of the student_Information_System_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudent_Information_System_Contact__C(String value) {
        this.studentInformationSystemContactC = value;
    }

    /**
     * Gets the value of the student_Information_System_Contact__R property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getStudent_Information_System_Contact__R() {
        return studentInformationSystemContactR;
    }

    /**
     * Sets the value of the student_Information_System_Contact__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setStudent_Information_System_Contact__R(ContactType value) {
        this.studentInformationSystemContactR = value;
    }

    /**
     * Gets the value of the student_Information_System_Install_Yr__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudent_Information_System_Install_Yr__C() {
        return studentInformationSystemInstallYrC;
    }

    /**
     * Sets the value of the student_Information_System_Install_Yr__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudent_Information_System_Install_Yr__C(String value) {
        this.studentInformationSystemInstallYrC = value;
    }

    /**
     * Gets the value of the student_Information_System_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudent_Information_System_Name__C() {
        return studentInformationSystemNameC;
    }

    /**
     * Sets the value of the student_Information_System_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudent_Information_System_Name__C(String value) {
        this.studentInformationSystemNameC = value;
    }

    /**
     * Gets the value of the sub_Abuse_Program__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSub_Abuse_Program__C() {
        return subAbuseProgramC;
    }

    /**
     * Sets the value of the sub_Abuse_Program__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSub_Abuse_Program__C(String value) {
        this.subAbuseProgramC = value;
    }

    /**
     * Gets the value of the subjects__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjects__C() {
        return subjectsC;
    }

    /**
     * Sets the value of the subjects__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjects__C(String value) {
        this.subjectsC = value;
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
     * Gets the value of the target_Account__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTarget_Account__C() {
        return targetAccountC;
    }

    /**
     * Sets the value of the target_Account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTarget_Account__C(Boolean value) {
        this.targetAccountC = value;
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
     * Gets the value of the teacher_Count__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTeacher_Count__C() {
        return teacherCountC;
    }

    /**
     * Sets the value of the teacher_Count__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTeacher_Count__C(Double value) {
        this.teacherCountC = value;
    }

    /**
     * Gets the value of the technology_Platform_Infrastructure__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnology_Platform_Infrastructure__C() {
        return technologyPlatformInfrastructureC;
    }

    /**
     * Sets the value of the technology_Platform_Infrastructure__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnology_Platform_Infrastructure__C(String value) {
        this.technologyPlatformInfrastructureC = value;
    }

    /**
     * Gets the value of the technology_Per_Student__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTechnology_Per_Student__C() {
        return technologyPerStudentC;
    }

    /**
     * Sets the value of the technology_Per_Student__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTechnology_Per_Student__C(Double value) {
        this.technologyPerStudentC = value;
    }

    /**
     * Gets the value of the territory_ADULT_ED__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory_ADULT_ED__C() {
        return territoryADULTEDC;
    }

    /**
     * Sets the value of the territory_ADULT_ED__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory_ADULT_ED__C(String value) {
        this.territoryADULTEDC = value;
    }

    /**
     * Gets the value of the territory_A_E__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory_A_E__C() {
        return territoryAEC;
    }

    /**
     * Sets the value of the territory_A_E__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory_A_E__C(String value) {
        this.territoryAEC = value;
    }

    /**
     * Gets the value of the territory_Assignment_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory_Assignment_Code__C() {
        return territoryAssignmentCodeC;
    }

    /**
     * Sets the value of the territory_Assignment_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory_Assignment_Code__C(String value) {
        this.territoryAssignmentCodeC = value;
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
     * Gets the value of the territory_HMD__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory_HMD__C() {
        return territoryHMDC;
    }

    /**
     * Sets the value of the territory_HMD__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory_HMD__C(String value) {
        this.territoryHMDC = value;
    }

    /**
     * Gets the value of the territory_HMHLT__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory_HMHLT__C() {
        return territoryHMHLTC;
    }

    /**
     * Sets the value of the territory_HMHLT__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory_HMHLT__C(String value) {
        this.territoryHMHLTC = value;
    }

    /**
     * Gets the value of the territory_SAXON__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory_SAXON__C() {
        return territorySAXONC;
    }

    /**
     * Sets the value of the territory_SAXON__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory_SAXON__C(String value) {
        this.territorySAXONC = value;
    }

    /**
     * Gets the value of the territory_SCH__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory_SCH__C() {
        return territorySCHC;
    }

    /**
     * Sets the value of the territory_SCH__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory_SCH__C(String value) {
        this.territorySCHC = value;
    }

    /**
     * Gets the value of the territory_SKILLS_TUTOR__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory_SKILLS_TUTOR__C() {
        return territorySKILLSTUTORC;
    }

    /**
     * Sets the value of the territory_SKILLS_TUTOR__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory_SKILLS_TUTOR__C(String value) {
        this.territorySKILLSTUTORC = value;
    }

    /**
     * Gets the value of the territory_SUPP__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory_SUPP__C() {
        return territorySUPPC;
    }

    /**
     * Sets the value of the territory_SUPP__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory_SUPP__C(String value) {
        this.territorySUPPC = value;
    }

    /**
     * Gets the value of the territory__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory__C() {
        return territoryC;
    }

    /**
     * Sets the value of the territory__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory__C(String value) {
        this.territoryC = value;
    }

    /**
     * Gets the value of the territory_S__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory_S__C() {
        return territorySC;
    }

    /**
     * Sets the value of the territory_S__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory_S__C(String value) {
        this.territorySC = value;
    }

    /**
     * Gets the value of the testing_Start_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTesting_Start_Date__C() {
        return testingStartDateC;
    }

    /**
     * Sets the value of the testing_Start_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTesting_Start_Date__C(XMLGregorianCalendar value) {
        this.testingStartDateC = value;
    }

    /**
     * Gets the value of the testing_Window__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTesting_Window__C() {
        return testingWindowC;
    }

    /**
     * Sets the value of the testing_Window__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTesting_Window__C(String value) {
        this.testingWindowC = value;
    }

    /**
     * Gets the value of the title_1_Per_Pupil_District__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTitle_1_Per_Pupil_District__C() {
        return title1PerPupilDistrictC;
    }

    /**
     * Sets the value of the title_1_Per_Pupil_District__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTitle_1_Per_Pupil_District__C(Double value) {
        this.title1PerPupilDistrictC = value;
    }

    /**
     * Gets the value of the title_1_Per_Pupil__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle_1_Per_Pupil__C() {
        return title1PerPupilC;
    }

    /**
     * Sets the value of the title_1_Per_Pupil__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle_1_Per_Pupil__C(String value) {
        this.title1PerPupilC = value;
    }

    /**
     * Gets the value of the title_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle_2__C() {
        return title2C;
    }

    /**
     * Sets the value of the title_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle_2__C(String value) {
        this.title2C = value;
    }

    /**
     * Gets the value of the title_I_Stimulus__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTitle_I_Stimulus__C() {
        return titleIStimulusC;
    }

    /**
     * Sets the value of the title_I_Stimulus__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTitle_I_Stimulus__C(Double value) {
        this.titleIStimulusC = value;
    }

    /**
     * Gets the value of the title_I_Whole_Allocation__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTitle_I_Whole_Allocation__C() {
        return titleIWholeAllocationC;
    }

    /**
     * Sets the value of the title_I_Whole_Allocation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTitle_I_Whole_Allocation__C(Double value) {
        this.titleIWholeAllocationC = value;
    }

    /**
     * Gets the value of the top_100_Account__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTop_100_Account__C() {
        return top100AccountC;
    }

    /**
     * Sets the value of the top_100_Account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTop_100_Account__C(Boolean value) {
        this.top100AccountC = value;
    }

    /**
     * Gets the value of the totalDistrictEnrollment__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalDistrictEnrollment__C() {
        return totalDistrictEnrollmentC;
    }

    /**
     * Sets the value of the totalDistrictEnrollment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalDistrictEnrollment__C(Double value) {
        this.totalDistrictEnrollmentC = value;
    }

    /**
     * Gets the value of the totalSchoolsinDistrict__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalSchoolsinDistrict__C() {
        return totalSchoolsinDistrictC;
    }

    /**
     * Sets the value of the totalSchoolsinDistrict__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalSchoolsinDistrict__C(Double value) {
        this.totalSchoolsinDistrictC = value;
    }

    /**
     * Gets the value of the total_Federal_Revenue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal_Federal_Revenue__C() {
        return totalFederalRevenueC;
    }

    /**
     * Sets the value of the total_Federal_Revenue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal_Federal_Revenue__C(Double value) {
        this.totalFederalRevenueC = value;
    }

    /**
     * Gets the value of the total_Local_Revenue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal_Local_Revenue__C() {
        return totalLocalRevenueC;
    }

    /**
     * Sets the value of the total_Local_Revenue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal_Local_Revenue__C(Double value) {
        this.totalLocalRevenueC = value;
    }

    /**
     * Gets the value of the total_School_Count__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal_School_Count__C() {
        return totalSchoolCountC;
    }

    /**
     * Sets the value of the total_School_Count__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal_School_Count__C(Double value) {
        this.totalSchoolCountC = value;
    }

    /**
     * Gets the value of the total_State_Revenue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal_State_Revenue__C() {
        return totalStateRevenueC;
    }

    /**
     * Sets the value of the total_State_Revenue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal_State_Revenue__C(Double value) {
        this.totalStateRevenueC = value;
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
     * Gets the value of the type_Of_Student_ID_Loaded__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType_Of_Student_ID_Loaded__C() {
        return typeOfStudentIDLoadedC;
    }

    /**
     * Sets the value of the type_Of_Student_ID_Loaded__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType_Of_Student_ID_Loaded__C(String value) {
        this.typeOfStudentIDLoadedC = value;
    }

    /**
     * Gets the value of the ultimate_Parent_Current_Pupil__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltimate_Parent_Current_Pupil__C() {
        return ultimateParentCurrentPupilC;
    }

    /**
     * Sets the value of the ultimate_Parent_Current_Pupil__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltimate_Parent_Current_Pupil__C(String value) {
        this.ultimateParentCurrentPupilC = value;
    }

    /**
     * Gets the value of the ultimate_Parent_Enrollment_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltimate_Parent_Enrollment_Code__C() {
        return ultimateParentEnrollmentCodeC;
    }

    /**
     * Sets the value of the ultimate_Parent_Enrollment_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltimate_Parent_Enrollment_Code__C(String value) {
        this.ultimateParentEnrollmentCodeC = value;
    }

    /**
     * Gets the value of the ultimate_Parent_Enrollment__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUltimate_Parent_Enrollment__C() {
        return ultimateParentEnrollmentC;
    }

    /**
     * Sets the value of the ultimate_Parent_Enrollment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUltimate_Parent_Enrollment__C(Double value) {
        this.ultimateParentEnrollmentC = value;
    }

    /**
     * Gets the value of the ultimate_Parent_MDR_File_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltimate_Parent_MDR_File_Type__C() {
        return ultimateParentMDRFileTypeC;
    }

    /**
     * Sets the value of the ultimate_Parent_MDR_File_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltimate_Parent_MDR_File_Type__C(String value) {
        this.ultimateParentMDRFileTypeC = value;
    }

    /**
     * Gets the value of the ultimate_Parent_PID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltimate_Parent_PID__C() {
        return ultimateParentPIDC;
    }

    /**
     * Sets the value of the ultimate_Parent_PID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltimate_Parent_PID__C(String value) {
        this.ultimateParentPIDC = value;
    }

    /**
     * Gets the value of the ultimate_Parent_Title_1_Per_Pupil__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltimate_Parent_Title_1_Per_Pupil__C() {
        return ultimateParentTitle1PerPupilC;
    }

    /**
     * Sets the value of the ultimate_Parent_Title_1_Per_Pupil__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltimate_Parent_Title_1_Per_Pupil__C(String value) {
        this.ultimateParentTitle1PerPupilC = value;
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
     * Gets the value of the unique_Student_Codes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnique_Student_Codes__C() {
        return uniqueStudentCodesC;
    }

    /**
     * Sets the value of the unique_Student_Codes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnique_Student_Codes__C(String value) {
        this.uniqueStudentCodesC = value;
    }

    /**
     * Gets the value of the unique_Teacher_Codes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnique_Teacher_Codes__C() {
        return uniqueTeacherCodesC;
    }

    /**
     * Sets the value of the unique_Teacher_Codes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnique_Teacher_Codes__C(String value) {
        this.uniqueTeacherCodesC = value;
    }

    /**
     * Gets the value of the username__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername__C() {
        return usernameC;
    }

    /**
     * Sets the value of the username__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername__C(String value) {
        this.usernameC = value;
    }

    /**
     * Gets the value of the using_Edusoft_IP_Address__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsing_Edusoft_IP_Address__C() {
        return usingEdusoftIPAddressC;
    }

    /**
     * Sets the value of the using_Edusoft_IP_Address__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsing_Edusoft_IP_Address__C(String value) {
        this.usingEdusoftIPAddressC = value;
    }

    /**
     * Gets the value of the validator_User__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidator_User__C() {
        return validatorUserC;
    }

    /**
     * Sets the value of the validator_User__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidator_User__C(String value) {
        this.validatorUserC = value;
    }

    /**
     * Gets the value of the vote_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVote_Type__C() {
        return voteTypeC;
    }

    /**
     * Sets the value of the vote_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVote_Type__C(String value) {
        this.voteTypeC = value;
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
     * Gets the value of the x10__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX10__C() {
        return x10C;
    }

    /**
     * Sets the value of the x10__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX10__C(Double value) {
        this.x10C = value;
    }

    /**
     * Gets the value of the x11__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX11__C() {
        return x11C;
    }

    /**
     * Sets the value of the x11__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX11__C(Double value) {
        this.x11C = value;
    }

    /**
     * Gets the value of the x12__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX12__C() {
        return x12C;
    }

    /**
     * Sets the value of the x12__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX12__C(Double value) {
        this.x12C = value;
    }

    /**
     * Gets the value of the x1__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX1__C() {
        return x1C;
    }

    /**
     * Sets the value of the x1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX1__C(Double value) {
        this.x1C = value;
    }

    /**
     * Gets the value of the x21St_Century_Community_Learning__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX21St_Century_Community_Learning__C() {
        return x21StCenturyCommunityLearningC;
    }

    /**
     * Sets the value of the x21St_Century_Community_Learning__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX21St_Century_Community_Learning__C(Double value) {
        this.x21StCenturyCommunityLearningC = value;
    }

    /**
     * Gets the value of the x2__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX2__C() {
        return x2C;
    }

    /**
     * Sets the value of the x2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX2__C(Double value) {
        this.x2C = value;
    }

    /**
     * Gets the value of the x3__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX3__C() {
        return x3C;
    }

    /**
     * Sets the value of the x3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX3__C(Double value) {
        this.x3C = value;
    }

    /**
     * Gets the value of the x3Rd_Party_Distributor_Account__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX3Rd_Party_Distributor_Account__C() {
        return x3RdPartyDistributorAccountC;
    }

    /**
     * Sets the value of the x3Rd_Party_Distributor_Account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX3Rd_Party_Distributor_Account__C(String value) {
        this.x3RdPartyDistributorAccountC = value;
    }

    /**
     * Gets the value of the x3Rd_Party_Distributor_Account__R property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getX3Rd_Party_Distributor_Account__R() {
        return x3RdPartyDistributorAccountR;
    }

    /**
     * Sets the value of the x3Rd_Party_Distributor_Account__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setX3Rd_Party_Distributor_Account__R(AccountType value) {
        this.x3RdPartyDistributorAccountR = value;
    }

    /**
     * Gets the value of the x4__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX4__C() {
        return x4C;
    }

    /**
     * Sets the value of the x4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX4__C(Double value) {
        this.x4C = value;
    }

    /**
     * Gets the value of the x5__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX5__C() {
        return x5C;
    }

    /**
     * Sets the value of the x5__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX5__C(Double value) {
        this.x5C = value;
    }

    /**
     * Gets the value of the x6__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX6__C() {
        return x6C;
    }

    /**
     * Sets the value of the x6__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX6__C(Double value) {
        this.x6C = value;
    }

    /**
     * Gets the value of the x7__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX7__C() {
        return x7C;
    }

    /**
     * Sets the value of the x7__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX7__C(Double value) {
        this.x7C = value;
    }

    /**
     * Gets the value of the x8__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX8__C() {
        return x8C;
    }

    /**
     * Sets the value of the x8__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX8__C(Double value) {
        this.x8C = value;
    }

    /**
     * Gets the value of the x9__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX9__C() {
        return x9C;
    }

    /**
     * Sets the value of the x9__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX9__C(Double value) {
        this.x9C = value;
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

    /**
     * Gets the value of the file_Type_Code_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile_Type_Code_Desc__C() {
        return fileTypeCodeDescC;
    }

    /**
     * Sets the value of the file_Type_Code_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile_Type_Code_Desc__C(String value) {
        this.fileTypeCodeDescC = value;
    }

    /**
     * Gets the value of the num_Of_IBMs__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNum_Of_IBMs__C() {
        return numOfIBMsC;
    }

    /**
     * Sets the value of the num_Of_IBMs__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNum_Of_IBMs__C(String value) {
        this.numOfIBMsC = value;
    }

    /**
     * Gets the value of the num_Of_MACs__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNum_Of_MACs__C() {
        return numOfMACsC;
    }

    /**
     * Sets the value of the num_Of_MACs__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNum_Of_MACs__C(String value) {
        this.numOfMACsC = value;
    }

    /**
     * Gets the value of the of_Schools_Loaded__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOf_Schools_Loaded__C() {
        return ofSchoolsLoadedC;
    }

    /**
     * Sets the value of the of_Schools_Loaded__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOf_Schools_Loaded__C(Double value) {
        this.ofSchoolsLoadedC = value;
    }

    /**
     * Gets the value of the of_Students_Loaded__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOf_Students_Loaded__C() {
        return ofStudentsLoadedC;
    }

    /**
     * Sets the value of the of_Students_Loaded__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOf_Students_Loaded__C(Double value) {
        this.ofStudentsLoadedC = value;
    }

    /**
     * Gets the value of the per_Student__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPer_Student__C() {
        return perStudentC;
    }

    /**
     * Sets the value of the per_Student__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPer_Student__C(Double value) {
        this.perStudentC = value;
    }

}
