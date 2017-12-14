
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Opportunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Opportunity">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="A2K_Classroom_w_TT__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="A2K_Math_Reading__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="A2K_Science__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="A2K_Social_Studies__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ATTN_To__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="AccountPartners" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Account_s_State__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Acct_Plans__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ActivityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Additional_Trainings__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Validation_Check__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adoption_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Allow_Contract_Pricing__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Allow_Substitutions__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Alt_Ship_To_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alternate_Email_Address__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alternate_Subtotal_Format__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AmountPaid__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Announcement_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Approval_Audit__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Approved_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Approved_Ratio__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Assess2Know__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Assessment_Consultant__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assisted_By__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Assisted_By__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Auto_Coupon_Code_Override__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Auto_Coupon_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Back_Office_Order__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Back_Text__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Backorder_Cancel_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Backorder_option__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BatchProcessTasks__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Beginning_Grade_Level__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BoardDate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Budget__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="COL_Auto_Calculate_Quantity__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="COL_Sample_Reason__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPAS_Num_Tests__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CPAS_Setup_Fees__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CPAS_Total_Setup_Fee__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CPO_CSR_Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPO_Owner__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CPO_Owner__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CPO_Rep_Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPO_Rep_Review_Target_Date__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CPO_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CP_Cover_Page_Logo_Formula__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CP_Cover_Page_Logo__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CP_Format__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CP_Template_Max_Ratio__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CP_Template_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CWE_Expiration_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CWE_Initial_Purchase_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CWE_Recent_Purchase_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Calc_Value_Skills_Tutor__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Calc_Value__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Campaign" type="{urn:sobject.enterprise.soap.sforce.com}Campaign" minOccurs="0"/>
 *         &lt;element name="CampaignId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Cancelled_Lost_Details__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cancelled_Lost_Reason__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CloseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Commission_Variance__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Committee__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Common_Core__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Competitor_Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Competitor_s__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Completed_Training_Days__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Confidential_Text__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Consultant_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Contact_Email__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact_Formula__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact_Job_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact_Phone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact_Title__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="Content_Enrollment_1__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Content_Enrollment_2__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Content_Enrollment_3__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Content_Enrollment_4__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Content_Fees_per_Student_2__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Content_Fees_per_Student_3__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Content_Fees_per_Student_4__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Content_Fees_per_Student__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Content_Grades_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content_Grades_3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content_Grades_4__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content_Grades__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content_Products_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content_Products_3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content_Products_4__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content_Products__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cost_Ratio__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Coupon_Code_Name__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Coupon_Code_Name__r" type="{urn:sobject.enterprise.soap.sforce.com}Coupon_Codes__c" minOccurs="0"/>
 *         &lt;element name="Coupon_Code_PD_Sale_Amt__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Coupon_Code_SE_Sale_Amt__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Create_Opportunity__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Created_From_Account__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Current_Product_Using__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Care_Default_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Care_Preferred_Contact__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Care_Preferred_PO_Number__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Email_Address__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Message__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Transaction_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customized_Product_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DI_Completed__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DI_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataIntegrationFees__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Data_Loader_Update__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Source__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Verification_Call_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DateInvoiced__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DatePaid__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DateSigned__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Date_Training_Complete__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DaysIntegration__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Deal_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Decision_Level_Skills_Tutor__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Decision_Level__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Default_Line_Item_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Default_Quantity_Calculation_Method__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Deliver_By_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount_Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Dispaly_PD_Addendum__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Display_Account_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Display_Program_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="District_Partners__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Division" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Do_Not_Mix_POs_On_Same_Pallet__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Dolphin_Shipping__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Drop_Shipments1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Drop_Shipments__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="EGood_Fulfillments__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="EffectiveDate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Effective_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Ending_Grade_Level__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enrollment__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Entry_Division__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Err_1_Line_Number__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Err_2_Line_Number__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Err_3_Line_Number__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Estimated_Scanner_Count__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Evaluation_Form__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Events" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ExamView__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExpectedRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Expected_Revenue_2__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Expected_Revenue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Expiration_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Fax_URL__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Federal_Funding_Support_Email__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Federal_Funding_Support_Phone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Federal_Funding_Support__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Feeds" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Field1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Finance_Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstMeeting__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FirstYearEnrlNotes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstYearEnrl__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="First_Benchmark_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="First_Referral_Meeting__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Fiscal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalQuarter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FiscalYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Follow_Up_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Force_Delivered_Pricing__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ForecastCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForecastCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Forecast_Category__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Formative_Non_RFP_Pricing_Proposal_Sent__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Front_Text__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fulfillment_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Fulfillment_End_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Fulfillment_Quantity__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Fulfillment_Start_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Funding_Allocation_Links__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Funding_Ext__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Funding_Likelihood__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Funding_Source_Detail__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Funding_Source__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GRT_Auto_Calculate_Quantity__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GRT_Sample_Reason__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Get_Price_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Get_Price_Date__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Get_Price_User__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Get_Price_User__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="Grade_Level__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HIT_Auto_Calculate_Quantity__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HMH_Licensing_Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="HMH_Licensing_Account__r" type="{urn:sobject.enterprise.soap.sforce.com}HMH_Licensing_Account__c" minOccurs="0"/>
 *         &lt;element name="HMLT_Lost_Reason__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hard_Sample_Restriction__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasOpportunityLineItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Has_Subscription_Item__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Header_CC_Ratio_Indicator__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="High_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Hold_for_Customer_Review__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="INT_Auto_Calculate_Quantity__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Incumbent_Publisher_s__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interface_Sort_Order__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Internal_Opportunity_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceAmount__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Invoice__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWon" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Is_CP_Template_Validated__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Is_SSO_Template__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Ist_Communication_or_Drop_In__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="KenTest2Process__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="KenTests__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Last_Imp_Query_Date__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Last_Print_Preview_Date__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LeadNotes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeadSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Source_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Source_Detail__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Source__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Learning_Series__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Lega__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Legacy_Opportunity_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Legacy_PH_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseFee__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Likelihood_Expected_Revenue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Likelihood__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Lock__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Lost_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Lost_To_Details__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lost_To__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lost__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Low_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MCD_Auto_Calculate_Quantity__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MCD_Sample_Reason__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manager_Approval_Line_Item_Count__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Market_Comments__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Market_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mass_Create_Processing_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mass_Create_Sample_Order_Template__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Mass_Create_Template__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Max_Ratio__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Module_Benchmark__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Module_Curriculum_Mgmt__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Module_State_Analysis__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Module_Teacher_Tools__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="New_Form_Scoring_Options__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No_Friday_Delivery__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Not_Int__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Number_of_Consultant_Days__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Number_of_Imp_Days_Rate__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Number_of_Meetings__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OIRs__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpenActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Open_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Open__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Opp_Owner_s_Manager__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityCompetitors" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpportunityContactRoles" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpportunityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpportunityLineItems" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpportunityPartnersFrom" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpportunityTeamMembers" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opportunity_Duration__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Opportunity_Line_Item_Links1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opportunity_Line_Item_Links__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opportunity_Market_Override__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Opportunity_Market__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opportunity_Priority__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opportunity_School_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opportunity_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opportunity_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpptyProductID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Order_Reason_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Order_Status_Last_Update_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Order_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ordered_By__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Ordered_By__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="Original_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Original_Purchase_Order__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Other__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Outstanding_Training_Days__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Overall_Cost_Ratio__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Override_Addr_City__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Override_Addr_Country__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Override_Addr_Line1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Override_Addr_Line2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Override_Addr_Line3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Override_Addr_State_Prov__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Override_Addr_Zipcode__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Override_Sales_Rep_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Override_Sales_Rep_ID_del__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Override_Shipping_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Override_Shipping_Percent__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Owner_Email__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner_Implementation_Approval_Budget_PCT__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Owner_Implementation_Budget__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Owner_Market__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner_Max_Ratio__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Owner_Mobile__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner_Phone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner_Pilot_Approval_Budget_PCT__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Owner_Pilot_Budget__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Owner_Region__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner_Sample_Approval_Budget_PCT__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Owner_Sample_Budget__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Owner_s_Manager__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Owner_s_Manager__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="Owner_s_Manager_s_Manager__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Owner_s_Manager_s_Manager__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="PD_Addendum__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PD_Product_Line_Item_Count__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PHL1_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PHL1_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PHL2_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PHL2_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PHL3_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PHL3_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PHL4_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PHL4_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PHL5_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PHL5_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PH_Full_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PID_Customer_Mode__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PID_based_Ship_to_Customer_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PID_based_Sold_to_Customer_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PLOF__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PO_Dollar_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PO_Expected_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PO_REQUIRED__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PO_Received__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PO__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pack_By__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Page_Break_by_Grade__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ParentView__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Partners" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Pending_Order__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pilot_End_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Pilot_Funding_Type_Sale_Gratis__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pilot_Rationale__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pilot_Start_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PlanningFees__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Position__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Postponed_Cancelled_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Presentations__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="PricePerStudent__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Price_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Pricebook2" type="{urn:sobject.enterprise.soap.sforce.com}Pricebook2" minOccurs="0"/>
 *         &lt;element name="Pricebook2Id" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Print_Owner_Name_Email_on_Cover_Page__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Print_Shipping__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Print_Signature_Line__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Print_Tax__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Probability" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Probability__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Product_Hierarchy_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Summary__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Professional_Devmt__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Program_Type_Skills_Tutor__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Program_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Project_Manager__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Promo_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Promotion__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Proposal_Customer_PO_Customer_PO__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Proposal_Customer_PO_Links_Proposal_ID__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Proposal_Save_Date__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Proratedterm__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Purchase_Order__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Purchase_Year__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R00NR0000000V4UwMAK__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="R00NR0000000V6vVMAS__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="R00NS0000000HI7sMAG__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="RFI__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFP_Anticipated_Receipt_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RFP_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFP_Opp_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RFP_Status_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFP_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rating__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_Lost__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_Won__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordType" type="{urn:sobject.enterprise.soap.sforce.com}RecordType" minOccurs="0"/>
 *         &lt;element name="RecordTypeId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Refresh_WAUC_Date__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Related_Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Related_Opp_Subtype__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Related_Opportunity_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Related_Opportunity_CP_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Related_Opportunity_CP_Total_PO_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Related_Opportunity_Record__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Related_Opportunity_Records__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Related_Opportunity_Records__r" type="{urn:sobject.enterprise.soap.sforce.com}Opportunity" minOccurs="0"/>
 *         &lt;element name="Related_Product_Hierarchy__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Related_Product_Hierarchy__r" type="{urn:sobject.enterprise.soap.sforce.com}Product_Hierarchy__c" minOccurs="0"/>
 *         &lt;element name="Related_ShipTo_Customer__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Related_ShipTo_Customer__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="Related_SoldTo_Customer__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Related_SoldTo_Customer__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="Related_Template_Opportunity__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Related_Template_Opportunity__r" type="{urn:sobject.enterprise.soap.sforce.com}Opportunity" minOccurs="0"/>
 *         &lt;element name="Release_Line_Item_Notifications__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Reorder_Basis_Used__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Requested_Del_y_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Research_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Riverside_PD_Opp_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RosterUpdateperSchool__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SAP_Delivery_Block__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Entry_Date__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SAP_Shipping_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SAP_Shipping__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SCH_Auto_Calculate_Quantity__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SCH_Lost_Reason__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCH_Sample_Reason__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SFDC_Order_Number__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ST_Product__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Plan__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Sales_Plan__r" type="{urn:sobject.enterprise.soap.sforce.com}Sales_Plan__c" minOccurs="0"/>
 *         &lt;element name="Sales_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Saxon_Refill_Opp_Current_Owner__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Saxon_Refill_Opp_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Saxon_Refill_Opp_Original_Owner__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScannerModel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scanner_Delivery_Address__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scanner_Delivery_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Scanner_Materials_Customer_needs__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scanner_Qty_per_location__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scanner_Ship_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Scanner_Tracking_Info__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scheduled_Training_Days__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Schools__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Send_Confirmation_Email__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Service_Request_Forms__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SetupFeeperschool__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Shares" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Ship_Date_Option_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Ship_Date_Option__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_To_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Customer_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Department__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_Location__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_SAP_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ship_to_SAP_Override__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipping__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shipto_Customer_Country__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Siebel_Account_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Signed_Contract_on_File__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site_Formula__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Soft_Sample_Restriction__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sold_to_Customer_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sold_to_SAP_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sold_to_SAP_Override__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialInstructions__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Specified_Ship_to_PID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Specified_Sold_to_PID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State_Adoption_Opp_Flag_Year_2__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="State_Adoption_Opp_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="State_Adoption_Opportunity__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Strategic_Opportunity_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Subject_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Submit_for_Manual_Correction__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Subscription_Line_Item_Count__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TRD_Auto_Calculate_Quantity__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Tax_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Technical_Contact_Email_Address__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Template_Record_Indicator__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Term_1_Contract_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Term_2_Contract_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Term_2_Total_License_Fee_Per_Student__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Term_2_Total_License_Fee__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Term_3_Contract_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Term_3_Total_License_Fee_Per_Student__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Term_3_Total_License_Fee__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Territory" type="{urn:sobject.enterprise.soap.sforce.com}Territory" minOccurs="0"/>
 *         &lt;element name="TerritoryId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="TotalOpportunityQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalRosterUpdateFee__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalSetupFee__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Total_CP_Gratis_Qty_w_o_Generic_Novels__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Total_Content_Fees_1__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Total_Content_Fees_2__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Total_Content_Fees_3__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Total_Content_Fees_4__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Total_Contract_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Total_Cost__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Total_Errors__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Total_Extended_Price__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Total_Loaded__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Total_PO_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Total_Savings__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Total_User_Discount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TrainingFee__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Training_Days_Allowed__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Training_Days_Promised__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Training_Delivered_By__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Training_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transaction_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Transaction_Source__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transaction_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transaction_Subtype__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transaction_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Uncontrolled_Cost_Ratio__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Uncontrolled_Cost__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Uncontrolled_Extended_Price__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Use_Override_Address__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="User_Max_Approval_Ratio__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="User__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="User__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="Virtual_Sample_Line_Item_Count__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WIN_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WestEdTrainingFees__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="WestEdTraining__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Where_is_the_Sales_Process__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Won_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Won__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="X5_School_CWE_Tracking__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="err__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="err_categ_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="err_categ_3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="err_code_1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="err_code_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="err_code_3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="err_msg_1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="err_msg_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="err_msg_3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netTre__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="x1stRenewalDate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="x2ndRenewalDate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="x3rdRenewalDate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Opportunity", propOrder = {
    "a2KClassroomWTTC",
    "a2KMathReadingC",
    "a2KScienceC",
    "a2KSocialStudiesC",
    "attnToC",
    "account",
    "accountId",
    "accountPartners",
    "accountSStateC",
    "acctPlansR",
    "activityHistories",
    "additionalTrainingsC",
    "addressValidationCheckC",
    "adoptionTypeC",
    "allowContractPricingC",
    "allowSubstitutionsC",
    "altShipToNameC",
    "alternateEmailAddressC",
    "alternateSubtotalFormatC",
    "amount",
    "amountPaidC",
    "announcementDateC",
    "approvalAuditC",
    "approvedAmountC",
    "approvedRatioC",
    "assess2KnowC",
    "assessmentConsultantC",
    "assistedByC",
    "assistedByR",
    "attachments",
    "autoCouponCodeOverrideC",
    "autoCouponCodeC",
    "backOfficeOrderC",
    "backTextC",
    "backorderCancelDateC",
    "backorderOptionC",
    "batchProcessTasksR",
    "beginningGradeLevelC",
    "boardDateC",
    "budgetC",
    "colAutoCalculateQuantityC",
    "colSampleReasonC",
    "cpasNumTestsC",
    "cpasSetupFeesC",
    "cpasTotalSetupFeeC",
    "cpoCSRNotesC",
    "cpoOwnerC",
    "cpoOwnerR",
    "cpoRepNotesC",
    "cpoRepReviewTargetDateC",
    "cpoStatusC",
    "cpCoverPageLogoFormulaC",
    "cpCoverPageLogoC",
    "cpFormatC",
    "cpTemplateMaxRatioC",
    "cpTemplateTypeC",
    "cweExpirationDateC",
    "cweInitialPurchaseDateC",
    "cweRecentPurchaseDateC",
    "calcValueSkillsTutorC",
    "calcValueC",
    "campaign",
    "campaignId",
    "cancelledLostDetailsC",
    "cancelledLostReasonC",
    "closeDate",
    "commissionVarianceC",
    "committeeC",
    "commonCoreC",
    "competitorNotesC",
    "competitorSC",
    "completedTrainingDaysC",
    "confidentialTextC",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "consultantAmountC",
    "contactEmailC",
    "contactFormulaC",
    "contactJobDescriptionC",
    "contactNameC",
    "contactPhoneC",
    "contactTitleC",
    "contactC",
    "contactR",
    "contentEnrollment1C",
    "contentEnrollment2C",
    "contentEnrollment3C",
    "contentEnrollment4C",
    "contentFeesPerStudent2C",
    "contentFeesPerStudent3C",
    "contentFeesPerStudent4C",
    "contentFeesPerStudentC",
    "contentGrades2C",
    "contentGrades3C",
    "contentGrades4C",
    "contentGradesC",
    "contentProducts2C",
    "contentProducts3C",
    "contentProducts4C",
    "contentProductsC",
    "costRatioC",
    "couponCodeNameC",
    "couponCodeNameR",
    "couponCodePDSaleAmtC",
    "couponCodeSESaleAmtC",
    "createOpportunityC",
    "createdBy",
    "createdById",
    "createdDate",
    "createdFromAccountC",
    "currentProductUsingC",
    "customerCareDefaultStatusC",
    "customerCarePreferredContactC",
    "customerCarePreferredPONumberC",
    "customerEmailAddressC",
    "customerMessageC",
    "customerTransactionTypeC",
    "customizedProductFlagC",
    "diCompletedC",
    "diStatusC",
    "dataIntegrationFeesC",
    "dataLoaderUpdateC",
    "dataSourceC",
    "dataVerificationCallDateC",
    "dateInvoicedC",
    "datePaidC",
    "dateSignedC",
    "dateTrainingCompleteC",
    "daysIntegrationC",
    "dealTypeC",
    "decisionLevelSkillsTutorC",
    "decisionLevelC",
    "defaultLineItemTypeC",
    "defaultQuantityCalculationMethodC",
    "deliverByDateC",
    "description",
    "discountNotesC",
    "discountC",
    "dispalyPDAddendumC",
    "displayAccountNameC",
    "displayProgramNameC",
    "districtPartnersC",
    "division",
    "doNotMixPOsOnSamePalletC",
    "dolphinShippingC",
    "dropShipments1R",
    "dropShipmentsR",
    "eGoodFulfillmentsR",
    "effectiveDateC",
    "secondEffectiveDateC",
    "endingGradeLevelC",
    "enrollmentC",
    "entryDivisionC",
    "err1LineNumberC",
    "err2LineNumberC",
    "err3LineNumberC",
    "estimatedScannerCountC",
    "evaluationFormC",
    "events",
    "examViewC",
    "expectedRevenue",
    "expectedRevenue2C",
    "expectedRevenueC",
    "expirationDateC",
    "faxURLC",
    "federalFundingSupportEmailC",
    "federalFundingSupportPhoneC",
    "federalFundingSupportC",
    "feedSubscriptionsForEntity",
    "feeds",
    "field1C",
    "financeNotesC",
    "firstMeetingC",
    "firstYearEnrlNotesC",
    "firstYearEnrlC",
    "firstBenchmarkDateC",
    "firstReferralMeetingC",
    "fiscal",
    "fiscalQuarter",
    "fiscalYear",
    "followUpDateC",
    "forceDeliveredPricingC",
    "forecastCategory",
    "forecastCategoryName",
    "forecastCategoryC",
    "formativeNonRFPPricingProposalSentC",
    "frontTextC",
    "fulfillmentAmountC",
    "fulfillmentEndDateC",
    "fulfillmentQuantityC",
    "fulfillmentStartDateC",
    "fundingAllocationLinksR",
    "fundingExtC",
    "fundingLikelihoodC",
    "fundingSourceDetailC",
    "fundingSourceC",
    "grtAutoCalculateQuantityC",
    "grtSampleReasonC",
    "getPriceCommentsC",
    "getPriceDateC",
    "getPriceUserC",
    "getPriceUserR",
    "gradeLevelC",
    "hitAutoCalculateQuantityC",
    "hmhLicensingAccountC",
    "hmhLicensingAccountR",
    "hmltLostReasonC",
    "hardSampleRestrictionC",
    "hasOpportunityLineItem",
    "hasSubscriptionItemC",
    "headerCCRatioIndicatorC",
    "highAmountC",
    "histories",
    "holdForCustomerReviewC",
    "intAutoCalculateQuantityC",
    "incumbentPublisherSC",
    "interfaceSortOrderC",
    "internalOpportunityIDC",
    "invoiceAmountC",
    "invoiceC",
    "isClosed",
    "isDeleted",
    "isPrivate",
    "isWon",
    "isCPTemplateValidatedC",
    "isSSOTemplateC",
    "istCommunicationOrDropInC",
    "kenTest2ProcessR",
    "kenTestsR",
    "lastActivityDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastImpQueryDateC",
    "lastPrintPreviewDateC",
    "leadNotesC",
    "leadSource",
    "leadSourceCommentsC",
    "leadSourceDetailC",
    "leadSourceC",
    "learningSeriesC",
    "legaC",
    "legacyOpportunityIDC",
    "legacyPHCodeC",
    "licenseFeeC",
    "likelihoodExpectedRevenueC",
    "likelihoodC",
    "lockC",
    "lostAmountC",
    "lostToDetailsC",
    "lostToC",
    "lostC",
    "lowAmountC",
    "mcdAutoCalculateQuantityC",
    "mcdSampleReasonC",
    "managerApprovalLineItemCountC",
    "marketCommentsR",
    "marketTypeC",
    "massCreateProcessingStatusC",
    "massCreateSampleOrderTemplateC",
    "massCreateTemplateC",
    "maxRatioC",
    "moduleBenchmarkC",
    "moduleCurriculumMgmtC",
    "moduleStateAnalysisC",
    "moduleTeacherToolsC",
    "name",
    "newFormScoringOptionsC",
    "noFridayDeliveryC",
    "notIntC",
    "notes",
    "notesAndAttachments",
    "numberOfConsultantDaysC",
    "numberOfImpDaysRateC",
    "numberOfMeetingsC",
    "oiRsR",
    "openActivities",
    "openAmountC",
    "openC",
    "oppOwnerSManagerC",
    "opportunityCompetitors",
    "opportunityContactRoles",
    "opportunityHistories",
    "opportunityLineItems",
    "opportunityPartnersFrom",
    "opportunityTeamMembers",
    "opportunityDurationC",
    "opportunityLineItemLinks1R",
    "opportunityLineItemLinksR",
    "opportunityMarketOverrideC",
    "opportunityMarketC",
    "opportunityPriorityC",
    "opportunitySchoolTypeC",
    "opportunityStatusC",
    "opportunityTypeC",
    "opptyProductIDC",
    "orderReasonCodeC",
    "orderStatusLastUpdateDateC",
    "orderStatusC",
    "orderedByC",
    "orderedByR",
    "originalAmountC",
    "originalPurchaseOrderC",
    "otherC",
    "outstandingTrainingDaysC",
    "overallCostRatioC",
    "overrideAddrCityC",
    "overrideAddrCountryC",
    "overrideAddrLine1C",
    "overrideAddrLine2C",
    "overrideAddrLine3C",
    "overrideAddrStateProvC",
    "overrideAddrZipcodeC",
    "overrideSalesRepIDC",
    "overrideSalesRepIDDelC",
    "overrideShippingAmountC",
    "overrideShippingPercentC",
    "owner",
    "ownerId",
    "ownerEmailC",
    "ownerImplementationApprovalBudgetPCTC",
    "ownerImplementationBudgetC",
    "ownerMarketC",
    "ownerMaxRatioC",
    "ownerMobileC",
    "ownerPhoneC",
    "ownerPilotApprovalBudgetPCTC",
    "ownerPilotBudgetC",
    "ownerRegionC",
    "ownerSampleApprovalBudgetPCTC",
    "ownerSampleBudgetC",
    "ownerSManagerC",
    "ownerSManagerR",
    "ownerSManagerSManagerC",
    "ownerSManagerSManagerR",
    "pdAddendumC",
    "pdProductLineItemCountC",
    "phl1CodeC",
    "phl1DescriptionC",
    "phl2CodeC",
    "phl2DescriptionC",
    "phl3CodeC",
    "phl3DescriptionC",
    "phl4CodeC",
    "phl4DescriptionC",
    "phl5CodeC",
    "phl5DescriptionC",
    "phFullCodeC",
    "pidCustomerModeC",
    "pidBasedShipToCustomerIDC",
    "pidBasedSoldToCustomerIDC",
    "plofC",
    "poDollarAmountC",
    "poExpectedDateC",
    "poREQUIREDC",
    "poReceivedC",
    "poC",
    "packByC",
    "pageBreakByGradeC",
    "parentViewC",
    "partners",
    "pendingOrderC",
    "pilotEndDateC",
    "pilotFundingTypeSaleGratisC",
    "pilotRationaleC",
    "pilotStartDateC",
    "planningFeesC",
    "positionC",
    "postponedCancelledAmountC",
    "presentationsR",
    "pricePerStudentC",
    "priceDateC",
    "pricebook2",
    "pricebook2Id",
    "printOwnerNameEmailOnCoverPageC",
    "printShippingC",
    "printSignatureLineC",
    "printTaxC",
    "probability",
    "probabilityC",
    "processInstances",
    "processSteps",
    "productHierarchyIDC",
    "productSummaryC",
    "professionalDevmtC",
    "programTypeSkillsTutorC",
    "programTypeC",
    "projectManagerC",
    "promoCodeC",
    "promotionC",
    "proposalCustomerPOCustomerPOR",
    "proposalCustomerPOLinksProposalIDR",
    "proposalSaveDateC",
    "proratedtermC",
    "purchaseOrderC",
    "purchaseYearC",
    "r00NR0000000V4UwMAKR",
    "r00NR0000000V6VVMASR",
    "r00NS0000000HI7SMAGR",
    "rfiC",
    "rfpAnticipatedReceiptDateC",
    "rfpNameC",
    "rfpOppFlagC",
    "rfpStatusCommentsC",
    "rfpStatusC",
    "ratingC",
    "reasonLostC",
    "reasonWonC",
    "recordType",
    "recordTypeId",
    "refreshWAUCDateC",
    "relatedNotesC",
    "relatedOppSubtypeC",
    "relatedOpportunityAmountC",
    "relatedOpportunityCPStatusC",
    "relatedOpportunityCPTotalPOAmountC",
    "relatedOpportunityRecordC",
    "relatedOpportunityRecordsC",
    "relatedOpportunityRecordsR",
    "relatedProductHierarchyC",
    "relatedProductHierarchyR",
    "relatedShipToCustomerC",
    "relatedShipToCustomerR",
    "relatedSoldToCustomerC",
    "relatedSoldToCustomerR",
    "relatedTemplateOpportunityC",
    "relatedTemplateOpportunityR",
    "releaseLineItemNotificationsR",
    "reorderBasisUsedC",
    "requestedDelYDateC",
    "researchStatusC",
    "riversidePDOppFlagC",
    "rosterUpdateperSchoolC",
    "sapDeliveryBlockC",
    "sapEntryDateC",
    "sapShippingAmountC",
    "sapShippingC",
    "schAutoCalculateQuantityC",
    "schLostReasonC",
    "schSampleReasonC",
    "sfdcOrderNumberC",
    "stProductC",
    "salesNotesC",
    "salesPlanC",
    "salesPlanR",
    "salesTypeC",
    "saxonRefillOppCurrentOwnerC",
    "saxonRefillOppFlagC",
    "saxonRefillOppOriginalOwnerC",
    "scannerModelC",
    "scannerDeliveryAddressC",
    "scannerDeliveryDateC",
    "scannerMaterialsCustomerNeedsC",
    "scannerQtyPerLocationC",
    "scannerShipDateC",
    "scannerTrackingInfoC",
    "scheduledTrainingDaysC",
    "schoolsC",
    "sendConfirmationEmailC",
    "serviceRequestFormsR",
    "setupFeeperschoolC",
    "shares",
    "shipDateOptionDateC",
    "shipDateOptionC",
    "shipToNameC",
    "shipToCustomerIDC",
    "shipToDepartmentC",
    "shipToLocationC",
    "shipToSAPNameC",
    "shipToSAPOverrideC",
    "shippingC",
    "shiptoCustomerCountryC",
    "siebelAccountNameC",
    "signedContractOnFileC",
    "siteFormulaC",
    "softSampleRestrictionC",
    "soldToCustomerIDC",
    "soldToSAPNameC",
    "soldToSAPOverrideC",
    "specialInstructionsC",
    "specifiedShipToPIDC",
    "specifiedSoldToPIDC",
    "stageName",
    "stateAdoptionOppFlagYear2C",
    "stateAdoptionOppFlagC",
    "stateAdoptionOpportunityC",
    "statusC",
    "strategicOpportunityFlagC",
    "subjectCodeC",
    "submitForManualCorrectionC",
    "subscriptionLineItemCountC",
    "systemModstamp",
    "trdAutoCalculateQuantityC",
    "tasks",
    "taxAmountC",
    "technicalContactEmailAddressC",
    "templateRecordIndicatorC",
    "term1ContractAmountC",
    "term2ContractAmountC",
    "term2TotalLicenseFeePerStudentC",
    "term2TotalLicenseFeeC",
    "term3ContractAmountC",
    "term3TotalLicenseFeePerStudentC",
    "term3TotalLicenseFeeC",
    "territory",
    "territoryId",
    "totalOpportunityQuantity",
    "totalRosterUpdateFeeC",
    "totalSetupFeeC",
    "totalCPGratisQtyWOGenericNovelsC",
    "totalContentFees1C",
    "totalContentFees2C",
    "totalContentFees3C",
    "totalContentFees4C",
    "totalContractAmountC",
    "totalCostC",
    "totalErrorsC",
    "totalExtendedPriceC",
    "totalLoadedC",
    "totalPOAmountC",
    "totalSavingsC",
    "totalUserDiscountC",
    "trainingFeeC",
    "trainingDaysAllowedC",
    "trainingDaysPromisedC",
    "trainingDeliveredByC",
    "trainingStatusC",
    "transactionAmountC",
    "transactionSourceC",
    "transactionStatusC",
    "transactionSubtypeC",
    "transactionTypeC",
    "type",
    "uncontrolledCostRatioC",
    "uncontrolledCostC",
    "uncontrolledExtendedPriceC",
    "useOverrideAddressC",
    "userMaxApprovalRatioC",
    "userC",
    "userR",
    "virtualSampleLineItemCountC",
    "winStatusC",
    "westEdTrainingFeesC",
    "westEdTrainingC",
    "whereIsTheSalesProcessC",
    "wonAmountC",
    "wonC",
    "x5SchoolCWETrackingC",
    "errC",
    "errCateg2C",
    "errCateg3C",
    "errCode1C",
    "errCode2C",
    "errCode3C",
    "errMsg1C",
    "errMsg2C",
    "errMsg3C",
    "netTreC",
    "x1StRenewalDateC",
    "x2NdRenewalDateC",
    "x3RdRenewalDateC"
})
public class OpportunityType
    extends SObjectType
{

    @XmlElement(name = "A2K_Classroom_w_TT__c", nillable = true)
    protected Boolean a2KClassroomWTTC;
    @XmlElement(name = "A2K_Math_Reading__c", nillable = true)
    protected Boolean a2KMathReadingC;
    @XmlElement(name = "A2K_Science__c", nillable = true)
    protected Boolean a2KScienceC;
    @XmlElement(name = "A2K_Social_Studies__c", nillable = true)
    protected Boolean a2KSocialStudiesC;
    @XmlElement(name = "ATTN_To__c", nillable = true)
    protected String attnToC;
    @XmlElement(name = "Account", nillable = true)
    protected AccountType account;
    @XmlElement(name = "AccountId", nillable = true)
    protected String accountId;
    @XmlElement(name = "AccountPartners", nillable = true)
    protected QueryResult accountPartners;
    @XmlElement(name = "Account_s_State__c", nillable = true)
    protected String accountSStateC;
    @XmlElement(name = "Acct_Plans__r", nillable = true)
    protected QueryResult acctPlansR;
    @XmlElement(name = "ActivityHistories", nillable = true)
    protected QueryResult activityHistories;
    @XmlElement(name = "Additional_Trainings__c", nillable = true)
    protected String additionalTrainingsC;
    @XmlElement(name = "Address_Validation_Check__c", nillable = true)
    protected String addressValidationCheckC;
    @XmlElement(name = "Adoption_Type__c", nillable = true)
    protected String adoptionTypeC;
    @XmlElement(name = "Allow_Contract_Pricing__c", nillable = true)
    protected Boolean allowContractPricingC;
    @XmlElement(name = "Allow_Substitutions__c", nillable = true)
    protected Boolean allowSubstitutionsC;
    @XmlElement(name = "Alt_Ship_To_Name__c", nillable = true)
    protected String altShipToNameC;
    @XmlElement(name = "Alternate_Email_Address__c", nillable = true)
    protected String alternateEmailAddressC;
    @XmlElement(name = "Alternate_Subtotal_Format__c", nillable = true)
    protected Boolean alternateSubtotalFormatC;
    @XmlElement(name = "Amount", nillable = true)
    protected Double amount;
    @XmlElement(name = "AmountPaid__c", nillable = true)
    protected Double amountPaidC;
    @XmlElement(name = "Announcement_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar announcementDateC;
    @XmlElement(name = "Approval_Audit__c", nillable = true)
    protected String approvalAuditC;
    @XmlElement(name = "Approved_Amount__c", nillable = true)
    protected Double approvedAmountC;
    @XmlElement(name = "Approved_Ratio__c", nillable = true)
    protected Double approvedRatioC;
    @XmlElement(name = "Assess2Know__c", nillable = true)
    protected Boolean assess2KnowC;
    @XmlElement(name = "Assessment_Consultant__c", nillable = true)
    protected String assessmentConsultantC;
    @XmlElement(name = "Assisted_By__c", nillable = true)
    protected String assistedByC;
    @XmlElement(name = "Assisted_By__r", nillable = true)
    protected UserType assistedByR;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "Auto_Coupon_Code_Override__c", nillable = true)
    protected Boolean autoCouponCodeOverrideC;
    @XmlElement(name = "Auto_Coupon_Code__c", nillable = true)
    protected String autoCouponCodeC;
    @XmlElement(name = "Back_Office_Order__c", nillable = true)
    protected String backOfficeOrderC;
    @XmlElement(name = "Back_Text__c", nillable = true)
    protected String backTextC;
    @XmlElement(name = "Backorder_Cancel_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar backorderCancelDateC;
    @XmlElement(name = "Backorder_option__c", nillable = true)
    protected String backorderOptionC;
    @XmlElement(name = "BatchProcessTasks__r", nillable = true)
    protected QueryResult batchProcessTasksR;
    @XmlElement(name = "Beginning_Grade_Level__c", nillable = true)
    protected String beginningGradeLevelC;
    @XmlElement(name = "BoardDate__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar boardDateC;
    @XmlElement(name = "Budget__c", nillable = true)
    protected Double budgetC;
    @XmlElement(name = "COL_Auto_Calculate_Quantity__c", nillable = true)
    protected Boolean colAutoCalculateQuantityC;
    @XmlElement(name = "COL_Sample_Reason__c", nillable = true)
    protected String colSampleReasonC;
    @XmlElement(name = "CPAS_Num_Tests__c", nillable = true)
    protected Double cpasNumTestsC;
    @XmlElement(name = "CPAS_Setup_Fees__c", nillable = true)
    protected Double cpasSetupFeesC;
    @XmlElement(name = "CPAS_Total_Setup_Fee__c", nillable = true)
    protected Double cpasTotalSetupFeeC;
    @XmlElement(name = "CPO_CSR_Notes__c", nillable = true)
    protected String cpoCSRNotesC;
    @XmlElement(name = "CPO_Owner__c", nillable = true)
    protected String cpoOwnerC;
    @XmlElement(name = "CPO_Owner__r", nillable = true)
    protected UserType cpoOwnerR;
    @XmlElement(name = "CPO_Rep_Notes__c", nillable = true)
    protected String cpoRepNotesC;
    @XmlElement(name = "CPO_Rep_Review_Target_Date__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cpoRepReviewTargetDateC;
    @XmlElement(name = "CPO_Status__c", nillable = true)
    protected String cpoStatusC;
    @XmlElement(name = "CP_Cover_Page_Logo_Formula__c", nillable = true)
    protected String cpCoverPageLogoFormulaC;
    @XmlElement(name = "CP_Cover_Page_Logo__c", nillable = true)
    protected String cpCoverPageLogoC;
    @XmlElement(name = "CP_Format__c", nillable = true)
    protected String cpFormatC;
    @XmlElement(name = "CP_Template_Max_Ratio__c", nillable = true)
    protected Double cpTemplateMaxRatioC;
    @XmlElement(name = "CP_Template_Type__c", nillable = true)
    protected String cpTemplateTypeC;
    @XmlElement(name = "CWE_Expiration_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cweExpirationDateC;
    @XmlElement(name = "CWE_Initial_Purchase_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cweInitialPurchaseDateC;
    @XmlElement(name = "CWE_Recent_Purchase_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cweRecentPurchaseDateC;
    @XmlElement(name = "Calc_Value_Skills_Tutor__c", nillable = true)
    protected Double calcValueSkillsTutorC;
    @XmlElement(name = "Calc_Value__c", nillable = true)
    protected Double calcValueC;
    @XmlElement(name = "Campaign", nillable = true)
    protected CampaignType campaign;
    @XmlElement(name = "CampaignId", nillable = true)
    protected String campaignId;
    @XmlElement(name = "Cancelled_Lost_Details__c", nillable = true)
    protected String cancelledLostDetailsC;
    @XmlElement(name = "Cancelled_Lost_Reason__c", nillable = true)
    protected String cancelledLostReasonC;
    @XmlElement(name = "CloseDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar closeDate;
    @XmlElement(name = "Commission_Variance__c", nillable = true)
    protected Boolean commissionVarianceC;
    @XmlElement(name = "Committee__c", nillable = true)
    protected Boolean committeeC;
    @XmlElement(name = "Common_Core__c", nillable = true)
    protected Boolean commonCoreC;
    @XmlElement(name = "Competitor_Notes__c", nillable = true)
    protected String competitorNotesC;
    @XmlElement(name = "Competitor_s__c", nillable = true)
    protected String competitorSC;
    @XmlElement(name = "Completed_Training_Days__c", nillable = true)
    protected Double completedTrainingDaysC;
    @XmlElement(name = "Confidential_Text__c", nillable = true)
    protected String confidentialTextC;
    @XmlElement(name = "ConnectionReceived", nillable = true)
    protected PartnerNetworkConnectionType connectionReceived;
    @XmlElement(name = "ConnectionReceivedId", nillable = true)
    protected String connectionReceivedId;
    @XmlElement(name = "ConnectionSent", nillable = true)
    protected PartnerNetworkConnectionType connectionSent;
    @XmlElement(name = "ConnectionSentId", nillable = true)
    protected String connectionSentId;
    @XmlElement(name = "Consultant_Amount__c", nillable = true)
    protected Double consultantAmountC;
    @XmlElement(name = "Contact_Email__c", nillable = true)
    protected String contactEmailC;
    @XmlElement(name = "Contact_Formula__c", nillable = true)
    protected String contactFormulaC;
    @XmlElement(name = "Contact_Job_Description__c", nillable = true)
    protected String contactJobDescriptionC;
    @XmlElement(name = "Contact_Name__c", nillable = true)
    protected String contactNameC;
    @XmlElement(name = "Contact_Phone__c", nillable = true)
    protected String contactPhoneC;
    @XmlElement(name = "Contact_Title__c", nillable = true)
    protected String contactTitleC;
    @XmlElement(name = "Contact__c", nillable = true)
    protected String contactC;
    @XmlElement(name = "Contact__r", nillable = true)
    protected ContactType contactR;
    @XmlElement(name = "Content_Enrollment_1__c", nillable = true)
    protected Double contentEnrollment1C;
    @XmlElement(name = "Content_Enrollment_2__c", nillable = true)
    protected Double contentEnrollment2C;
    @XmlElement(name = "Content_Enrollment_3__c", nillable = true)
    protected Double contentEnrollment3C;
    @XmlElement(name = "Content_Enrollment_4__c", nillable = true)
    protected Double contentEnrollment4C;
    @XmlElement(name = "Content_Fees_per_Student_2__c", nillable = true)
    protected Double contentFeesPerStudent2C;
    @XmlElement(name = "Content_Fees_per_Student_3__c", nillable = true)
    protected Double contentFeesPerStudent3C;
    @XmlElement(name = "Content_Fees_per_Student_4__c", nillable = true)
    protected Double contentFeesPerStudent4C;
    @XmlElement(name = "Content_Fees_per_Student__c", nillable = true)
    protected Double contentFeesPerStudentC;
    @XmlElement(name = "Content_Grades_2__c", nillable = true)
    protected String contentGrades2C;
    @XmlElement(name = "Content_Grades_3__c", nillable = true)
    protected String contentGrades3C;
    @XmlElement(name = "Content_Grades_4__c", nillable = true)
    protected String contentGrades4C;
    @XmlElement(name = "Content_Grades__c", nillable = true)
    protected String contentGradesC;
    @XmlElement(name = "Content_Products_2__c", nillable = true)
    protected String contentProducts2C;
    @XmlElement(name = "Content_Products_3__c", nillable = true)
    protected String contentProducts3C;
    @XmlElement(name = "Content_Products_4__c", nillable = true)
    protected String contentProducts4C;
    @XmlElement(name = "Content_Products__c", nillable = true)
    protected String contentProductsC;
    @XmlElement(name = "Cost_Ratio__c", nillable = true)
    protected Double costRatioC;
    @XmlElement(name = "Coupon_Code_Name__c", nillable = true)
    protected String couponCodeNameC;
    @XmlElement(name = "Coupon_Code_Name__r", nillable = true)
    protected Coupon_Codes__CType couponCodeNameR;
    @XmlElement(name = "Coupon_Code_PD_Sale_Amt__c", nillable = true)
    protected Double couponCodePDSaleAmtC;
    @XmlElement(name = "Coupon_Code_SE_Sale_Amt__c", nillable = true)
    protected Double couponCodeSESaleAmtC;
    @XmlElement(name = "Create_Opportunity__c", nillable = true)
    protected Boolean createOpportunityC;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Created_From_Account__c", nillable = true)
    protected Boolean createdFromAccountC;
    @XmlElement(name = "Current_Product_Using__c", nillable = true)
    protected String currentProductUsingC;
    @XmlElement(name = "Customer_Care_Default_Status__c", nillable = true)
    protected String customerCareDefaultStatusC;
    @XmlElement(name = "Customer_Care_Preferred_Contact__c", nillable = true)
    protected String customerCarePreferredContactC;
    @XmlElement(name = "Customer_Care_Preferred_PO_Number__c", nillable = true)
    protected String customerCarePreferredPONumberC;
    @XmlElement(name = "Customer_Email_Address__c", nillable = true)
    protected String customerEmailAddressC;
    @XmlElement(name = "Customer_Message__c", nillable = true)
    protected String customerMessageC;
    @XmlElement(name = "Customer_Transaction_Type__c", nillable = true)
    protected String customerTransactionTypeC;
    @XmlElement(name = "Customized_Product_Flag__c", nillable = true)
    protected Boolean customizedProductFlagC;
    @XmlElement(name = "DI_Completed__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar diCompletedC;
    @XmlElement(name = "DI_Status__c", nillable = true)
    protected String diStatusC;
    @XmlElement(name = "DataIntegrationFees__c", nillable = true)
    protected Double dataIntegrationFeesC;
    @XmlElement(name = "Data_Loader_Update__c", nillable = true)
    protected String dataLoaderUpdateC;
    @XmlElement(name = "Data_Source__c", nillable = true)
    protected String dataSourceC;
    @XmlElement(name = "Data_Verification_Call_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataVerificationCallDateC;
    @XmlElement(name = "DateInvoiced__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateInvoicedC;
    @XmlElement(name = "DatePaid__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datePaidC;
    @XmlElement(name = "DateSigned__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateSignedC;
    @XmlElement(name = "Date_Training_Complete__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateTrainingCompleteC;
    @XmlElement(name = "DaysIntegration__c", nillable = true)
    protected Double daysIntegrationC;
    @XmlElement(name = "Deal_Type__c", nillable = true)
    protected String dealTypeC;
    @XmlElement(name = "Decision_Level_Skills_Tutor__c", nillable = true)
    protected String decisionLevelSkillsTutorC;
    @XmlElement(name = "Decision_Level__c", nillable = true)
    protected String decisionLevelC;
    @XmlElement(name = "Default_Line_Item_Type__c", nillable = true)
    protected String defaultLineItemTypeC;
    @XmlElement(name = "Default_Quantity_Calculation_Method__c", nillable = true)
    protected String defaultQuantityCalculationMethodC;
    @XmlElement(name = "Deliver_By_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliverByDateC;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "Discount_Notes__c", nillable = true)
    protected String discountNotesC;
    @XmlElement(name = "Discount__c", nillable = true)
    protected Double discountC;
    @XmlElement(name = "Dispaly_PD_Addendum__c", nillable = true)
    protected Boolean dispalyPDAddendumC;
    @XmlElement(name = "Display_Account_Name__c", nillable = true)
    protected String displayAccountNameC;
    @XmlElement(name = "Display_Program_Name__c", nillable = true)
    protected String displayProgramNameC;
    @XmlElement(name = "District_Partners__c", nillable = true)
    protected String districtPartnersC;
    @XmlElement(name = "Division", nillable = true)
    protected String division;
    @XmlElement(name = "Do_Not_Mix_POs_On_Same_Pallet__c", nillable = true)
    protected Boolean doNotMixPOsOnSamePalletC;
    @XmlElement(name = "Dolphin_Shipping__c", nillable = true)
    protected String dolphinShippingC;
    @XmlElement(name = "Drop_Shipments1__r", nillable = true)
    protected QueryResult dropShipments1R;
    @XmlElement(name = "Drop_Shipments__r", nillable = true)
    protected QueryResult dropShipmentsR;
    @XmlElement(name = "EGood_Fulfillments__r", nillable = true)
    protected QueryResult eGoodFulfillmentsR;
    @XmlElement(name = "EffectiveDate__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDateC;
    @XmlElement(name = "Effective_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar secondEffectiveDateC;
    @XmlElement(name = "Ending_Grade_Level__c", nillable = true)
    protected String endingGradeLevelC;
    @XmlElement(name = "Enrollment__c", nillable = true)
    protected Double enrollmentC;
    @XmlElement(name = "Entry_Division__c", nillable = true)
    protected String entryDivisionC;
    @XmlElement(name = "Err_1_Line_Number__c", nillable = true)
    protected String err1LineNumberC;
    @XmlElement(name = "Err_2_Line_Number__c", nillable = true)
    protected String err2LineNumberC;
    @XmlElement(name = "Err_3_Line_Number__c", nillable = true)
    protected String err3LineNumberC;
    @XmlElement(name = "Estimated_Scanner_Count__c", nillable = true)
    protected Double estimatedScannerCountC;
    @XmlElement(name = "Evaluation_Form__c", nillable = true)
    protected Boolean evaluationFormC;
    @XmlElement(name = "Events", nillable = true)
    protected QueryResult events;
    @XmlElement(name = "ExamView__c", nillable = true)
    protected Boolean examViewC;
    @XmlElement(name = "ExpectedRevenue", nillable = true)
    protected Double expectedRevenue;
    @XmlElement(name = "Expected_Revenue_2__c", nillable = true)
    protected Double expectedRevenue2C;
    @XmlElement(name = "Expected_Revenue__c", nillable = true)
    protected Double expectedRevenueC;
    @XmlElement(name = "Expiration_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDateC;
    @XmlElement(name = "Fax_URL__c", nillable = true)
    protected String faxURLC;
    @XmlElement(name = "Federal_Funding_Support_Email__c", nillable = true)
    protected String federalFundingSupportEmailC;
    @XmlElement(name = "Federal_Funding_Support_Phone__c", nillable = true)
    protected String federalFundingSupportPhoneC;
    @XmlElement(name = "Federal_Funding_Support__c", nillable = true)
    protected String federalFundingSupportC;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "Feeds", nillable = true)
    protected QueryResult feeds;
    @XmlElement(name = "Field1__c", nillable = true)
    protected String field1C;
    @XmlElement(name = "Finance_Notes__c", nillable = true)
    protected String financeNotesC;
    @XmlElement(name = "FirstMeeting__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstMeetingC;
    @XmlElement(name = "FirstYearEnrlNotes__c", nillable = true)
    protected String firstYearEnrlNotesC;
    @XmlElement(name = "FirstYearEnrl__c", nillable = true)
    protected Double firstYearEnrlC;
    @XmlElement(name = "First_Benchmark_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstBenchmarkDateC;
    @XmlElement(name = "First_Referral_Meeting__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstReferralMeetingC;
    @XmlElement(name = "Fiscal", nillable = true)
    protected String fiscal;
    @XmlElement(name = "FiscalQuarter", nillable = true)
    protected Integer fiscalQuarter;
    @XmlElement(name = "FiscalYear", nillable = true)
    protected Integer fiscalYear;
    @XmlElement(name = "Follow_Up_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar followUpDateC;
    @XmlElement(name = "Force_Delivered_Pricing__c", nillable = true)
    protected Boolean forceDeliveredPricingC;
    @XmlElement(name = "ForecastCategory", nillable = true)
    protected String forecastCategory;
    @XmlElement(name = "ForecastCategoryName", nillable = true)
    protected String forecastCategoryName;
    @XmlElement(name = "Forecast_Category__c", nillable = true)
    protected String forecastCategoryC;
    @XmlElement(name = "Formative_Non_RFP_Pricing_Proposal_Sent__c", nillable = true)
    protected Boolean formativeNonRFPPricingProposalSentC;
    @XmlElement(name = "Front_Text__c", nillable = true)
    protected String frontTextC;
    @XmlElement(name = "Fulfillment_Amount__c", nillable = true)
    protected Double fulfillmentAmountC;
    @XmlElement(name = "Fulfillment_End_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fulfillmentEndDateC;
    @XmlElement(name = "Fulfillment_Quantity__c", nillable = true)
    protected Double fulfillmentQuantityC;
    @XmlElement(name = "Fulfillment_Start_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fulfillmentStartDateC;
    @XmlElement(name = "Funding_Allocation_Links__r", nillable = true)
    protected QueryResult fundingAllocationLinksR;
    @XmlElement(name = "Funding_Ext__c", nillable = true)
    protected String fundingExtC;
    @XmlElement(name = "Funding_Likelihood__c", nillable = true)
    protected String fundingLikelihoodC;
    @XmlElement(name = "Funding_Source_Detail__c", nillable = true)
    protected String fundingSourceDetailC;
    @XmlElement(name = "Funding_Source__c", nillable = true)
    protected String fundingSourceC;
    @XmlElement(name = "GRT_Auto_Calculate_Quantity__c", nillable = true)
    protected Boolean grtAutoCalculateQuantityC;
    @XmlElement(name = "GRT_Sample_Reason__c", nillable = true)
    protected String grtSampleReasonC;
    @XmlElement(name = "Get_Price_Comments__c", nillable = true)
    protected String getPriceCommentsC;
    @XmlElement(name = "Get_Price_Date__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar getPriceDateC;
    @XmlElement(name = "Get_Price_User__c", nillable = true)
    protected String getPriceUserC;
    @XmlElement(name = "Get_Price_User__r", nillable = true)
    protected UserType getPriceUserR;
    @XmlElement(name = "Grade_Level__c", nillable = true)
    protected String gradeLevelC;
    @XmlElement(name = "HIT_Auto_Calculate_Quantity__c", nillable = true)
    protected Boolean hitAutoCalculateQuantityC;
    @XmlElement(name = "HMH_Licensing_Account__c", nillable = true)
    protected String hmhLicensingAccountC;
    @XmlElement(name = "HMH_Licensing_Account__r", nillable = true)
    protected HMH_Licensing_Account__CType hmhLicensingAccountR;
    @XmlElement(name = "HMLT_Lost_Reason__c", nillable = true)
    protected String hmltLostReasonC;
    @XmlElement(name = "Hard_Sample_Restriction__c", nillable = true)
    protected Boolean hardSampleRestrictionC;
    @XmlElement(name = "HasOpportunityLineItem", nillable = true)
    protected Boolean hasOpportunityLineItem;
    @XmlElement(name = "Has_Subscription_Item__c", nillable = true)
    protected Boolean hasSubscriptionItemC;
    @XmlElement(name = "Header_CC_Ratio_Indicator__c", nillable = true)
    protected String headerCCRatioIndicatorC;
    @XmlElement(name = "High_Amount__c", nillable = true)
    protected Double highAmountC;
    @XmlElement(name = "Histories", nillable = true)
    protected QueryResult histories;
    @XmlElement(name = "Hold_for_Customer_Review__c", nillable = true)
    protected Boolean holdForCustomerReviewC;
    @XmlElement(name = "INT_Auto_Calculate_Quantity__c", nillable = true)
    protected Boolean intAutoCalculateQuantityC;
    @XmlElement(name = "Incumbent_Publisher_s__c", nillable = true)
    protected String incumbentPublisherSC;
    @XmlElement(name = "Interface_Sort_Order__c", nillable = true)
    protected String interfaceSortOrderC;
    @XmlElement(name = "Internal_Opportunity_ID__c", nillable = true)
    protected String internalOpportunityIDC;
    @XmlElement(name = "InvoiceAmount__c", nillable = true)
    protected String invoiceAmountC;
    @XmlElement(name = "Invoice__c", nillable = true)
    protected String invoiceC;
    @XmlElement(name = "IsClosed", nillable = true)
    protected Boolean isClosed;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "IsPrivate", nillable = true)
    protected Boolean isPrivate;
    @XmlElement(name = "IsWon", nillable = true)
    protected Boolean isWon;
    @XmlElement(name = "Is_CP_Template_Validated__c", nillable = true)
    protected Boolean isCPTemplateValidatedC;
    @XmlElement(name = "Is_SSO_Template__c", nillable = true)
    protected Boolean isSSOTemplateC;
    @XmlElement(name = "Ist_Communication_or_Drop_In__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar istCommunicationOrDropInC;
    @XmlElement(name = "KenTest2Process__r", nillable = true)
    protected QueryResult kenTest2ProcessR;
    @XmlElement(name = "KenTests__r", nillable = true)
    protected QueryResult kenTestsR;
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
    @XmlElement(name = "Last_Imp_Query_Date__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastImpQueryDateC;
    @XmlElement(name = "Last_Print_Preview_Date__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPrintPreviewDateC;
    @XmlElement(name = "LeadNotes__c", nillable = true)
    protected String leadNotesC;
    @XmlElement(name = "LeadSource", nillable = true)
    protected String leadSource;
    @XmlElement(name = "Lead_Source_Comments__c", nillable = true)
    protected String leadSourceCommentsC;
    @XmlElement(name = "Lead_Source_Detail__c", nillable = true)
    protected String leadSourceDetailC;
    @XmlElement(name = "Lead_Source__c", nillable = true)
    protected String leadSourceC;
    @XmlElement(name = "Learning_Series__c", nillable = true)
    protected Boolean learningSeriesC;
    @XmlElement(name = "Lega__c", nillable = true)
    protected String legaC;
    @XmlElement(name = "Legacy_Opportunity_ID__c", nillable = true)
    protected String legacyOpportunityIDC;
    @XmlElement(name = "Legacy_PH_Code__c", nillable = true)
    protected String legacyPHCodeC;
    @XmlElement(name = "LicenseFee__c", nillable = true)
    protected Double licenseFeeC;
    @XmlElement(name = "Likelihood_Expected_Revenue__c", nillable = true)
    protected Double likelihoodExpectedRevenueC;
    @XmlElement(name = "Likelihood__c", nillable = true)
    protected Double likelihoodC;
    @XmlElement(name = "Lock__c", nillable = true)
    protected Boolean lockC;
    @XmlElement(name = "Lost_Amount__c", nillable = true)
    protected Double lostAmountC;
    @XmlElement(name = "Lost_To_Details__c", nillable = true)
    protected String lostToDetailsC;
    @XmlElement(name = "Lost_To__c", nillable = true)
    protected String lostToC;
    @XmlElement(name = "Lost__c", nillable = true)
    protected Double lostC;
    @XmlElement(name = "Low_Amount__c", nillable = true)
    protected Double lowAmountC;
    @XmlElement(name = "MCD_Auto_Calculate_Quantity__c", nillable = true)
    protected Boolean mcdAutoCalculateQuantityC;
    @XmlElement(name = "MCD_Sample_Reason__c", nillable = true)
    protected String mcdSampleReasonC;
    @XmlElement(name = "Manager_Approval_Line_Item_Count__c", nillable = true)
    protected Double managerApprovalLineItemCountC;
    @XmlElement(name = "Market_Comments__r", nillable = true)
    protected QueryResult marketCommentsR;
    @XmlElement(name = "Market_Type__c", nillable = true)
    protected String marketTypeC;
    @XmlElement(name = "Mass_Create_Processing_Status__c", nillable = true)
    protected String massCreateProcessingStatusC;
    @XmlElement(name = "Mass_Create_Sample_Order_Template__c", nillable = true)
    protected Boolean massCreateSampleOrderTemplateC;
    @XmlElement(name = "Mass_Create_Template__c", nillable = true)
    protected Boolean massCreateTemplateC;
    @XmlElement(name = "Max_Ratio__c", nillable = true)
    protected Double maxRatioC;
    @XmlElement(name = "Module_Benchmark__c", nillable = true)
    protected Boolean moduleBenchmarkC;
    @XmlElement(name = "Module_Curriculum_Mgmt__c", nillable = true)
    protected Boolean moduleCurriculumMgmtC;
    @XmlElement(name = "Module_State_Analysis__c", nillable = true)
    protected Boolean moduleStateAnalysisC;
    @XmlElement(name = "Module_Teacher_Tools__c", nillable = true)
    protected Boolean moduleTeacherToolsC;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "New_Form_Scoring_Options__c", nillable = true)
    protected String newFormScoringOptionsC;
    @XmlElement(name = "No_Friday_Delivery__c", nillable = true)
    protected Boolean noFridayDeliveryC;
    @XmlElement(name = "Not_Int__c", nillable = true)
    protected String notIntC;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "Number_of_Consultant_Days__c", nillable = true)
    protected Double numberOfConsultantDaysC;
    @XmlElement(name = "Number_of_Imp_Days_Rate__c", nillable = true)
    protected Double numberOfImpDaysRateC;
    @XmlElement(name = "Number_of_Meetings__c", nillable = true)
    protected Double numberOfMeetingsC;
    @XmlElement(name = "OIRs__r", nillable = true)
    protected QueryResult oiRsR;
    @XmlElement(name = "OpenActivities", nillable = true)
    protected QueryResult openActivities;
    @XmlElement(name = "Open_Amount__c", nillable = true)
    protected Double openAmountC;
    @XmlElement(name = "Open__c", nillable = true)
    protected Double openC;
    @XmlElement(name = "Opp_Owner_s_Manager__c", nillable = true)
    protected String oppOwnerSManagerC;
    @XmlElement(name = "OpportunityCompetitors", nillable = true)
    protected QueryResult opportunityCompetitors;
    @XmlElement(name = "OpportunityContactRoles", nillable = true)
    protected QueryResult opportunityContactRoles;
    @XmlElement(name = "OpportunityHistories", nillable = true)
    protected QueryResult opportunityHistories;
    @XmlElement(name = "OpportunityLineItems", nillable = true)
    protected QueryResult opportunityLineItems;
    @XmlElement(name = "OpportunityPartnersFrom", nillable = true)
    protected QueryResult opportunityPartnersFrom;
    @XmlElement(name = "OpportunityTeamMembers", nillable = true)
    protected QueryResult opportunityTeamMembers;
    @XmlElement(name = "Opportunity_Duration__c", nillable = true)
    protected Double opportunityDurationC;
    @XmlElement(name = "Opportunity_Line_Item_Links1__r", nillable = true)
    protected QueryResult opportunityLineItemLinks1R;
    @XmlElement(name = "Opportunity_Line_Item_Links__r", nillable = true)
    protected QueryResult opportunityLineItemLinksR;
    @XmlElement(name = "Opportunity_Market_Override__c", nillable = true)
    protected Boolean opportunityMarketOverrideC;
    @XmlElement(name = "Opportunity_Market__c", nillable = true)
    protected String opportunityMarketC;
    @XmlElement(name = "Opportunity_Priority__c", nillable = true)
    protected String opportunityPriorityC;
    @XmlElement(name = "Opportunity_School_Type__c", nillable = true)
    protected String opportunitySchoolTypeC;
    @XmlElement(name = "Opportunity_Status__c", nillable = true)
    protected String opportunityStatusC;
    @XmlElement(name = "Opportunity_Type__c", nillable = true)
    protected String opportunityTypeC;
    @XmlElement(name = "OpptyProductID__c", nillable = true)
    protected String opptyProductIDC;
    @XmlElement(name = "Order_Reason_Code__c", nillable = true)
    protected String orderReasonCodeC;
    @XmlElement(name = "Order_Status_Last_Update_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderStatusLastUpdateDateC;
    @XmlElement(name = "Order_Status__c", nillable = true)
    protected String orderStatusC;
    @XmlElement(name = "Ordered_By__c", nillable = true)
    protected String orderedByC;
    @XmlElement(name = "Ordered_By__r", nillable = true)
    protected UserType orderedByR;
    @XmlElement(name = "Original_Amount__c", nillable = true)
    protected Double originalAmountC;
    @XmlElement(name = "Original_Purchase_Order__c", nillable = true)
    protected String originalPurchaseOrderC;
    @XmlElement(name = "Other__c", nillable = true)
    protected Double otherC;
    @XmlElement(name = "Outstanding_Training_Days__c", nillable = true)
    protected Double outstandingTrainingDaysC;
    @XmlElement(name = "Overall_Cost_Ratio__c", nillable = true)
    protected Double overallCostRatioC;
    @XmlElement(name = "Override_Addr_City__c", nillable = true)
    protected String overrideAddrCityC;
    @XmlElement(name = "Override_Addr_Country__c", nillable = true)
    protected String overrideAddrCountryC;
    @XmlElement(name = "Override_Addr_Line1__c", nillable = true)
    protected String overrideAddrLine1C;
    @XmlElement(name = "Override_Addr_Line2__c", nillable = true)
    protected String overrideAddrLine2C;
    @XmlElement(name = "Override_Addr_Line3__c", nillable = true)
    protected String overrideAddrLine3C;
    @XmlElement(name = "Override_Addr_State_Prov__c", nillable = true)
    protected String overrideAddrStateProvC;
    @XmlElement(name = "Override_Addr_Zipcode__c", nillable = true)
    protected String overrideAddrZipcodeC;
    @XmlElement(name = "Override_Sales_Rep_ID__c", nillable = true)
    protected String overrideSalesRepIDC;
    @XmlElement(name = "Override_Sales_Rep_ID_del__c", nillable = true)
    protected String overrideSalesRepIDDelC;
    @XmlElement(name = "Override_Shipping_Amount__c", nillable = true)
    protected Double overrideShippingAmountC;
    @XmlElement(name = "Override_Shipping_Percent__c", nillable = true)
    protected Double overrideShippingPercentC;
    @XmlElement(name = "Owner", nillable = true)
    protected UserType owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "Owner_Email__c", nillable = true)
    protected String ownerEmailC;
    @XmlElement(name = "Owner_Implementation_Approval_Budget_PCT__c", nillable = true)
    protected Double ownerImplementationApprovalBudgetPCTC;
    @XmlElement(name = "Owner_Implementation_Budget__c", nillable = true)
    protected Double ownerImplementationBudgetC;
    @XmlElement(name = "Owner_Market__c", nillable = true)
    protected String ownerMarketC;
    @XmlElement(name = "Owner_Max_Ratio__c", nillable = true)
    protected Double ownerMaxRatioC;
    @XmlElement(name = "Owner_Mobile__c", nillable = true)
    protected String ownerMobileC;
    @XmlElement(name = "Owner_Phone__c", nillable = true)
    protected String ownerPhoneC;
    @XmlElement(name = "Owner_Pilot_Approval_Budget_PCT__c", nillable = true)
    protected Double ownerPilotApprovalBudgetPCTC;
    @XmlElement(name = "Owner_Pilot_Budget__c", nillable = true)
    protected Double ownerPilotBudgetC;
    @XmlElement(name = "Owner_Region__c", nillable = true)
    protected String ownerRegionC;
    @XmlElement(name = "Owner_Sample_Approval_Budget_PCT__c", nillable = true)
    protected Double ownerSampleApprovalBudgetPCTC;
    @XmlElement(name = "Owner_Sample_Budget__c", nillable = true)
    protected Double ownerSampleBudgetC;
    @XmlElement(name = "Owner_s_Manager__c", nillable = true)
    protected String ownerSManagerC;
    @XmlElement(name = "Owner_s_Manager__r", nillable = true)
    protected UserType ownerSManagerR;
    @XmlElement(name = "Owner_s_Manager_s_Manager__c", nillable = true)
    protected String ownerSManagerSManagerC;
    @XmlElement(name = "Owner_s_Manager_s_Manager__r", nillable = true)
    protected UserType ownerSManagerSManagerR;
    @XmlElement(name = "PD_Addendum__c", nillable = true)
    protected Boolean pdAddendumC;
    @XmlElement(name = "PD_Product_Line_Item_Count__c", nillable = true)
    protected Double pdProductLineItemCountC;
    @XmlElement(name = "PHL1_Code__c", nillable = true)
    protected String phl1CodeC;
    @XmlElement(name = "PHL1_Description__c", nillable = true)
    protected String phl1DescriptionC;
    @XmlElement(name = "PHL2_Code__c", nillable = true)
    protected String phl2CodeC;
    @XmlElement(name = "PHL2_Description__c", nillable = true)
    protected String phl2DescriptionC;
    @XmlElement(name = "PHL3_Code__c", nillable = true)
    protected String phl3CodeC;
    @XmlElement(name = "PHL3_Description__c", nillable = true)
    protected String phl3DescriptionC;
    @XmlElement(name = "PHL4_Code__c", nillable = true)
    protected String phl4CodeC;
    @XmlElement(name = "PHL4_Description__c", nillable = true)
    protected String phl4DescriptionC;
    @XmlElement(name = "PHL5_Code__c", nillable = true)
    protected String phl5CodeC;
    @XmlElement(name = "PHL5_Description__c", nillable = true)
    protected String phl5DescriptionC;
    @XmlElement(name = "PH_Full_Code__c", nillable = true)
    protected String phFullCodeC;
    @XmlElement(name = "PID_Customer_Mode__c", nillable = true)
    protected Boolean pidCustomerModeC;
    @XmlElement(name = "PID_based_Ship_to_Customer_ID__c", nillable = true)
    protected String pidBasedShipToCustomerIDC;
    @XmlElement(name = "PID_based_Sold_to_Customer_ID__c", nillable = true)
    protected String pidBasedSoldToCustomerIDC;
    @XmlElement(name = "PLOF__c", nillable = true)
    protected Boolean plofC;
    @XmlElement(name = "PO_Dollar_Amount__c", nillable = true)
    protected Double poDollarAmountC;
    @XmlElement(name = "PO_Expected_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar poExpectedDateC;
    @XmlElement(name = "PO_REQUIRED__c", nillable = true)
    protected String poREQUIREDC;
    @XmlElement(name = "PO_Received__c", nillable = true)
    protected String poReceivedC;
    @XmlElement(name = "PO__c", nillable = true)
    protected String poC;
    @XmlElement(name = "Pack_By__c", nillable = true)
    protected String packByC;
    @XmlElement(name = "Page_Break_by_Grade__c", nillable = true)
    protected Boolean pageBreakByGradeC;
    @XmlElement(name = "ParentView__c", nillable = true)
    protected String parentViewC;
    @XmlElement(name = "Partners", nillable = true)
    protected QueryResult partners;
    @XmlElement(name = "Pending_Order__c", nillable = true)
    protected String pendingOrderC;
    @XmlElement(name = "Pilot_End_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pilotEndDateC;
    @XmlElement(name = "Pilot_Funding_Type_Sale_Gratis__c", nillable = true)
    protected String pilotFundingTypeSaleGratisC;
    @XmlElement(name = "Pilot_Rationale__c", nillable = true)
    protected String pilotRationaleC;
    @XmlElement(name = "Pilot_Start_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pilotStartDateC;
    @XmlElement(name = "PlanningFees__c", nillable = true)
    protected Double planningFeesC;
    @XmlElement(name = "Position__c", nillable = true)
    protected String positionC;
    @XmlElement(name = "Postponed_Cancelled_Amount__c", nillable = true)
    protected Double postponedCancelledAmountC;
    @XmlElement(name = "Presentations__r", nillable = true)
    protected QueryResult presentationsR;
    @XmlElement(name = "PricePerStudent__c", nillable = true)
    protected Double pricePerStudentC;
    @XmlElement(name = "Price_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar priceDateC;
    @XmlElement(name = "Pricebook2", nillable = true)
    protected Pricebook2Type pricebook2;
    @XmlElement(name = "Pricebook2Id", nillable = true)
    protected String pricebook2Id;
    @XmlElement(name = "Print_Owner_Name_Email_on_Cover_Page__c", nillable = true)
    protected Boolean printOwnerNameEmailOnCoverPageC;
    @XmlElement(name = "Print_Shipping__c", nillable = true)
    protected Boolean printShippingC;
    @XmlElement(name = "Print_Signature_Line__c", nillable = true)
    protected Boolean printSignatureLineC;
    @XmlElement(name = "Print_Tax__c", nillable = true)
    protected Boolean printTaxC;
    @XmlElement(name = "Probability", nillable = true)
    protected Double probability;
    @XmlElement(name = "Probability__c", nillable = true)
    protected Double probabilityC;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "Product_Hierarchy_ID__c", nillable = true)
    protected String productHierarchyIDC;
    @XmlElement(name = "Product_Summary__c", nillable = true)
    protected String productSummaryC;
    @XmlElement(name = "Professional_Devmt__c", nillable = true)
    protected String professionalDevmtC;
    @XmlElement(name = "Program_Type_Skills_Tutor__c", nillable = true)
    protected String programTypeSkillsTutorC;
    @XmlElement(name = "Program_Type__c", nillable = true)
    protected String programTypeC;
    @XmlElement(name = "Project_Manager__c", nillable = true)
    protected String projectManagerC;
    @XmlElement(name = "Promo_Code__c", nillable = true)
    protected String promoCodeC;
    @XmlElement(name = "Promotion__c", nillable = true)
    protected String promotionC;
    @XmlElement(name = "Proposal_Customer_PO_Customer_PO__r", nillable = true)
    protected QueryResult proposalCustomerPOCustomerPOR;
    @XmlElement(name = "Proposal_Customer_PO_Links_Proposal_ID__r", nillable = true)
    protected QueryResult proposalCustomerPOLinksProposalIDR;
    @XmlElement(name = "Proposal_Save_Date__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar proposalSaveDateC;
    @XmlElement(name = "Proratedterm__c", nillable = true)
    protected String proratedtermC;
    @XmlElement(name = "Purchase_Order__c", nillable = true)
    protected String purchaseOrderC;
    @XmlElement(name = "Purchase_Year__c", nillable = true)
    protected String purchaseYearC;
    @XmlElement(name = "R00NR0000000V4UwMAK__r", nillable = true)
    protected QueryResult r00NR0000000V4UwMAKR;
    @XmlElement(name = "R00NR0000000V6vVMAS__r", nillable = true)
    protected QueryResult r00NR0000000V6VVMASR;
    @XmlElement(name = "R00NS0000000HI7sMAG__r", nillable = true)
    protected QueryResult r00NS0000000HI7SMAGR;
    @XmlElement(name = "RFI__c", nillable = true)
    protected String rfiC;
    @XmlElement(name = "RFP_Anticipated_Receipt_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rfpAnticipatedReceiptDateC;
    @XmlElement(name = "RFP_Name__c", nillable = true)
    protected String rfpNameC;
    @XmlElement(name = "RFP_Opp_Flag__c", nillable = true)
    protected Boolean rfpOppFlagC;
    @XmlElement(name = "RFP_Status_Comments__c", nillable = true)
    protected String rfpStatusCommentsC;
    @XmlElement(name = "RFP_Status__c", nillable = true)
    protected String rfpStatusC;
    @XmlElement(name = "Rating__c", nillable = true)
    protected String ratingC;
    @XmlElement(name = "Reason_Lost__c", nillable = true)
    protected String reasonLostC;
    @XmlElement(name = "Reason_Won__c", nillable = true)
    protected String reasonWonC;
    @XmlElement(name = "RecordType", nillable = true)
    protected RecordTypeType recordType;
    @XmlElement(name = "RecordTypeId", nillable = true)
    protected String recordTypeId;
    @XmlElement(name = "Refresh_WAUC_Date__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refreshWAUCDateC;
    @XmlElement(name = "Related_Notes__c", nillable = true)
    protected String relatedNotesC;
    @XmlElement(name = "Related_Opp_Subtype__c", nillable = true)
    protected String relatedOppSubtypeC;
    @XmlElement(name = "Related_Opportunity_Amount__c", nillable = true)
    protected Double relatedOpportunityAmountC;
    @XmlElement(name = "Related_Opportunity_CP_Status__c", nillable = true)
    protected String relatedOpportunityCPStatusC;
    @XmlElement(name = "Related_Opportunity_CP_Total_PO_Amount__c", nillable = true)
    protected Double relatedOpportunityCPTotalPOAmountC;
    @XmlElement(name = "Related_Opportunity_Record__c", nillable = true)
    protected String relatedOpportunityRecordC;
    @XmlElement(name = "Related_Opportunity_Records__c", nillable = true)
    protected String relatedOpportunityRecordsC;
    @XmlElement(name = "Related_Opportunity_Records__r", nillable = true)
    protected OpportunityType relatedOpportunityRecordsR;
    @XmlElement(name = "Related_Product_Hierarchy__c", nillable = true)
    protected String relatedProductHierarchyC;
    @XmlElement(name = "Related_Product_Hierarchy__r", nillable = true)
    protected Product_Hierarchy__CType relatedProductHierarchyR;
    @XmlElement(name = "Related_ShipTo_Customer__c", nillable = true)
    protected String relatedShipToCustomerC;
    @XmlElement(name = "Related_ShipTo_Customer__r", nillable = true)
    protected AccountType relatedShipToCustomerR;
    @XmlElement(name = "Related_SoldTo_Customer__c", nillable = true)
    protected String relatedSoldToCustomerC;
    @XmlElement(name = "Related_SoldTo_Customer__r", nillable = true)
    protected AccountType relatedSoldToCustomerR;
    @XmlElement(name = "Related_Template_Opportunity__c", nillable = true)
    protected String relatedTemplateOpportunityC;
    @XmlElement(name = "Related_Template_Opportunity__r", nillable = true)
    protected OpportunityType relatedTemplateOpportunityR;
    @XmlElement(name = "Release_Line_Item_Notifications__r", nillable = true)
    protected QueryResult releaseLineItemNotificationsR;
    @XmlElement(name = "Reorder_Basis_Used__c", nillable = true)
    protected Boolean reorderBasisUsedC;
    @XmlElement(name = "Requested_Del_y_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestedDelYDateC;
    @XmlElement(name = "Research_Status__c", nillable = true)
    protected String researchStatusC;
    @XmlElement(name = "Riverside_PD_Opp_Flag__c", nillable = true)
    protected Boolean riversidePDOppFlagC;
    @XmlElement(name = "RosterUpdateperSchool__c", nillable = true)
    protected Double rosterUpdateperSchoolC;
    @XmlElement(name = "SAP_Delivery_Block__c", nillable = true)
    protected String sapDeliveryBlockC;
    @XmlElement(name = "SAP_Entry_Date__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sapEntryDateC;
    @XmlElement(name = "SAP_Shipping_Amount__c", nillable = true)
    protected Double sapShippingAmountC;
    @XmlElement(name = "SAP_Shipping__c", nillable = true)
    protected Double sapShippingC;
    @XmlElement(name = "SCH_Auto_Calculate_Quantity__c", nillable = true)
    protected Boolean schAutoCalculateQuantityC;
    @XmlElement(name = "SCH_Lost_Reason__c", nillable = true)
    protected String schLostReasonC;
    @XmlElement(name = "SCH_Sample_Reason__c", nillable = true)
    protected String schSampleReasonC;
    @XmlElement(name = "SFDC_Order_Number__c", nillable = true)
    protected String sfdcOrderNumberC;
    @XmlElement(name = "ST_Product__c", nillable = true)
    protected String stProductC;
    @XmlElement(name = "Sales_Notes__c", nillable = true)
    protected String salesNotesC;
    @XmlElement(name = "Sales_Plan__c", nillable = true)
    protected String salesPlanC;
    @XmlElement(name = "Sales_Plan__r", nillable = true)
    protected Sales_Plan__CType salesPlanR;
    @XmlElement(name = "Sales_Type__c", nillable = true)
    protected String salesTypeC;
    @XmlElement(name = "Saxon_Refill_Opp_Current_Owner__c", nillable = true)
    protected String saxonRefillOppCurrentOwnerC;
    @XmlElement(name = "Saxon_Refill_Opp_Flag__c", nillable = true)
    protected Boolean saxonRefillOppFlagC;
    @XmlElement(name = "Saxon_Refill_Opp_Original_Owner__c", nillable = true)
    protected String saxonRefillOppOriginalOwnerC;
    @XmlElement(name = "ScannerModel__c", nillable = true)
    protected String scannerModelC;
    @XmlElement(name = "Scanner_Delivery_Address__c", nillable = true)
    protected String scannerDeliveryAddressC;
    @XmlElement(name = "Scanner_Delivery_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scannerDeliveryDateC;
    @XmlElement(name = "Scanner_Materials_Customer_needs__c", nillable = true)
    protected String scannerMaterialsCustomerNeedsC;
    @XmlElement(name = "Scanner_Qty_per_location__c", nillable = true)
    protected String scannerQtyPerLocationC;
    @XmlElement(name = "Scanner_Ship_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scannerShipDateC;
    @XmlElement(name = "Scanner_Tracking_Info__c", nillable = true)
    protected String scannerTrackingInfoC;
    @XmlElement(name = "Scheduled_Training_Days__c", nillable = true)
    protected Double scheduledTrainingDaysC;
    @XmlElement(name = "Schools__c", nillable = true)
    protected Double schoolsC;
    @XmlElement(name = "Send_Confirmation_Email__c", nillable = true)
    protected Boolean sendConfirmationEmailC;
    @XmlElement(name = "Service_Request_Forms__r", nillable = true)
    protected QueryResult serviceRequestFormsR;
    @XmlElement(name = "SetupFeeperschool__c", nillable = true)
    protected Double setupFeeperschoolC;
    @XmlElement(name = "Shares", nillable = true)
    protected QueryResult shares;
    @XmlElement(name = "Ship_Date_Option_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDateOptionDateC;
    @XmlElement(name = "Ship_Date_Option__c", nillable = true)
    protected String shipDateOptionC;
    @XmlElement(name = "Ship_To_Name__c", nillable = true)
    protected String shipToNameC;
    @XmlElement(name = "Ship_to_Customer_ID__c", nillable = true)
    protected String shipToCustomerIDC;
    @XmlElement(name = "Ship_to_Department__c", nillable = true)
    protected String shipToDepartmentC;
    @XmlElement(name = "Ship_to_Location__c", nillable = true)
    protected String shipToLocationC;
    @XmlElement(name = "Ship_to_SAP_Name__c", nillable = true)
    protected String shipToSAPNameC;
    @XmlElement(name = "Ship_to_SAP_Override__c", nillable = true)
    protected String shipToSAPOverrideC;
    @XmlElement(name = "Shipping__c", nillable = true)
    protected String shippingC;
    @XmlElement(name = "Shipto_Customer_Country__c", nillable = true)
    protected String shiptoCustomerCountryC;
    @XmlElement(name = "Siebel_Account_Name__c", nillable = true)
    protected String siebelAccountNameC;
    @XmlElement(name = "Signed_Contract_on_File__c", nillable = true)
    protected String signedContractOnFileC;
    @XmlElement(name = "Site_Formula__c", nillable = true)
    protected String siteFormulaC;
    @XmlElement(name = "Soft_Sample_Restriction__c", nillable = true)
    protected Boolean softSampleRestrictionC;
    @XmlElement(name = "Sold_to_Customer_ID__c", nillable = true)
    protected String soldToCustomerIDC;
    @XmlElement(name = "Sold_to_SAP_Name__c", nillable = true)
    protected String soldToSAPNameC;
    @XmlElement(name = "Sold_to_SAP_Override__c", nillable = true)
    protected String soldToSAPOverrideC;
    @XmlElement(name = "SpecialInstructions__c", nillable = true)
    protected String specialInstructionsC;
    @XmlElement(name = "Specified_Ship_to_PID__c", nillable = true)
    protected String specifiedShipToPIDC;
    @XmlElement(name = "Specified_Sold_to_PID__c", nillable = true)
    protected String specifiedSoldToPIDC;
    @XmlElement(name = "StageName", nillable = true)
    protected String stageName;
    @XmlElement(name = "State_Adoption_Opp_Flag_Year_2__c", nillable = true)
    protected Boolean stateAdoptionOppFlagYear2C;
    @XmlElement(name = "State_Adoption_Opp_Flag__c", nillable = true)
    protected Boolean stateAdoptionOppFlagC;
    @XmlElement(name = "State_Adoption_Opportunity__c", nillable = true)
    protected Boolean stateAdoptionOpportunityC;
    @XmlElement(name = "Status__c", nillable = true)
    protected String statusC;
    @XmlElement(name = "Strategic_Opportunity_Flag__c", nillable = true)
    protected Boolean strategicOpportunityFlagC;
    @XmlElement(name = "Subject_Code__c", nillable = true)
    protected String subjectCodeC;
    @XmlElement(name = "Submit_for_Manual_Correction__c", nillable = true)
    protected Boolean submitForManualCorrectionC;
    @XmlElement(name = "Subscription_Line_Item_Count__c", nillable = true)
    protected Double subscriptionLineItemCountC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TRD_Auto_Calculate_Quantity__c", nillable = true)
    protected Boolean trdAutoCalculateQuantityC;
    @XmlElement(name = "Tasks", nillable = true)
    protected QueryResult tasks;
    @XmlElement(name = "Tax_Amount__c", nillable = true)
    protected Double taxAmountC;
    @XmlElement(name = "Technical_Contact_Email_Address__c", nillable = true)
    protected String technicalContactEmailAddressC;
    @XmlElement(name = "Template_Record_Indicator__c", nillable = true)
    protected String templateRecordIndicatorC;
    @XmlElement(name = "Term_1_Contract_Amount__c", nillable = true)
    protected Double term1ContractAmountC;
    @XmlElement(name = "Term_2_Contract_Amount__c", nillable = true)
    protected Double term2ContractAmountC;
    @XmlElement(name = "Term_2_Total_License_Fee_Per_Student__c", nillable = true)
    protected Double term2TotalLicenseFeePerStudentC;
    @XmlElement(name = "Term_2_Total_License_Fee__c", nillable = true)
    protected Double term2TotalLicenseFeeC;
    @XmlElement(name = "Term_3_Contract_Amount__c", nillable = true)
    protected Double term3ContractAmountC;
    @XmlElement(name = "Term_3_Total_License_Fee_Per_Student__c", nillable = true)
    protected Double term3TotalLicenseFeePerStudentC;
    @XmlElement(name = "Term_3_Total_License_Fee__c", nillable = true)
    protected Double term3TotalLicenseFeeC;
    @XmlElement(name = "Territory", nillable = true)
    protected TerritoryType territory;
    @XmlElement(name = "TerritoryId", nillable = true)
    protected String territoryId;
    @XmlElement(name = "TotalOpportunityQuantity", nillable = true)
    protected Double totalOpportunityQuantity;
    @XmlElement(name = "TotalRosterUpdateFee__c", nillable = true)
    protected Double totalRosterUpdateFeeC;
    @XmlElement(name = "TotalSetupFee__c", nillable = true)
    protected Double totalSetupFeeC;
    @XmlElement(name = "Total_CP_Gratis_Qty_w_o_Generic_Novels__c", nillable = true)
    protected Double totalCPGratisQtyWOGenericNovelsC;
    @XmlElement(name = "Total_Content_Fees_1__c", nillable = true)
    protected Double totalContentFees1C;
    @XmlElement(name = "Total_Content_Fees_2__c", nillable = true)
    protected Double totalContentFees2C;
    @XmlElement(name = "Total_Content_Fees_3__c", nillable = true)
    protected Double totalContentFees3C;
    @XmlElement(name = "Total_Content_Fees_4__c", nillable = true)
    protected Double totalContentFees4C;
    @XmlElement(name = "Total_Contract_Amount__c", nillable = true)
    protected Double totalContractAmountC;
    @XmlElement(name = "Total_Cost__c", nillable = true)
    protected Double totalCostC;
    @XmlElement(name = "Total_Errors__c", nillable = true)
    protected Double totalErrorsC;
    @XmlElement(name = "Total_Extended_Price__c", nillable = true)
    protected Double totalExtendedPriceC;
    @XmlElement(name = "Total_Loaded__c", nillable = true)
    protected Double totalLoadedC;
    @XmlElement(name = "Total_PO_Amount__c", nillable = true)
    protected Double totalPOAmountC;
    @XmlElement(name = "Total_Savings__c", nillable = true)
    protected Double totalSavingsC;
    @XmlElement(name = "Total_User_Discount__c", nillable = true)
    protected Double totalUserDiscountC;
    @XmlElement(name = "TrainingFee__c", nillable = true)
    protected Double trainingFeeC;
    @XmlElement(name = "Training_Days_Allowed__c", nillable = true)
    protected Double trainingDaysAllowedC;
    @XmlElement(name = "Training_Days_Promised__c", nillable = true)
    protected Double trainingDaysPromisedC;
    @XmlElement(name = "Training_Delivered_By__c", nillable = true)
    protected String trainingDeliveredByC;
    @XmlElement(name = "Training_Status__c", nillable = true)
    protected String trainingStatusC;
    @XmlElement(name = "Transaction_Amount__c", nillable = true)
    protected Double transactionAmountC;
    @XmlElement(name = "Transaction_Source__c", nillable = true)
    protected String transactionSourceC;
    @XmlElement(name = "Transaction_Status__c", nillable = true)
    protected String transactionStatusC;
    @XmlElement(name = "Transaction_Subtype__c", nillable = true)
    protected String transactionSubtypeC;
    @XmlElement(name = "Transaction_Type__c", nillable = true)
    protected String transactionTypeC;
    @XmlElement(name = "Type", nillable = true)
    protected String type;
    @XmlElement(name = "Uncontrolled_Cost_Ratio__c", nillable = true)
    protected Double uncontrolledCostRatioC;
    @XmlElement(name = "Uncontrolled_Cost__c", nillable = true)
    protected Double uncontrolledCostC;
    @XmlElement(name = "Uncontrolled_Extended_Price__c", nillable = true)
    protected Double uncontrolledExtendedPriceC;
    @XmlElement(name = "Use_Override_Address__c", nillable = true)
    protected Boolean useOverrideAddressC;
    @XmlElement(name = "User_Max_Approval_Ratio__c", nillable = true)
    protected Double userMaxApprovalRatioC;
    @XmlElement(name = "User__c", nillable = true)
    protected String userC;
    @XmlElement(name = "User__r", nillable = true)
    protected UserType userR;
    @XmlElement(name = "Virtual_Sample_Line_Item_Count__c", nillable = true)
    protected Double virtualSampleLineItemCountC;
    @XmlElement(name = "WIN_Status__c", nillable = true)
    protected String winStatusC;
    @XmlElement(name = "WestEdTrainingFees__c", nillable = true)
    protected Double westEdTrainingFeesC;
    @XmlElement(name = "WestEdTraining__c", nillable = true)
    protected String westEdTrainingC;
    @XmlElement(name = "Where_is_the_Sales_Process__c", nillable = true)
    protected String whereIsTheSalesProcessC;
    @XmlElement(name = "Won_Amount__c", nillable = true)
    protected Double wonAmountC;
    @XmlElement(name = "Won__c", nillable = true)
    protected Double wonC;
    @XmlElement(name = "X5_School_CWE_Tracking__c", nillable = true)
    protected Boolean x5SchoolCWETrackingC;
    @XmlElement(name = "err__c", nillable = true)
    protected String errC;
    @XmlElement(name = "err_categ_2__c", nillable = true)
    protected String errCateg2C;
    @XmlElement(name = "err_categ_3__c", nillable = true)
    protected String errCateg3C;
    @XmlElement(name = "err_code_1__c", nillable = true)
    protected String errCode1C;
    @XmlElement(name = "err_code_2__c", nillable = true)
    protected String errCode2C;
    @XmlElement(name = "err_code_3__c", nillable = true)
    protected String errCode3C;
    @XmlElement(name = "err_msg_1__c", nillable = true)
    protected String errMsg1C;
    @XmlElement(name = "err_msg_2__c", nillable = true)
    protected String errMsg2C;
    @XmlElement(name = "err_msg_3__c", nillable = true)
    protected String errMsg3C;
    @XmlElement(name = "netTre__c", nillable = true)
    protected Boolean netTreC;
    @XmlElement(name = "x1stRenewalDate__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar x1StRenewalDateC;
    @XmlElement(name = "x2ndRenewalDate__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar x2NdRenewalDateC;
    @XmlElement(name = "x3rdRenewalDate__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar x3RdRenewalDateC;

    /**
     * Gets the value of the a2K_Classroom_W_TT__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isA2K_Classroom_W_TT__C() {
        return a2KClassroomWTTC;
    }

    /**
     * Sets the value of the a2K_Classroom_W_TT__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setA2K_Classroom_W_TT__C(Boolean value) {
        this.a2KClassroomWTTC = value;
    }

    /**
     * Gets the value of the a2K_Math_Reading__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isA2K_Math_Reading__C() {
        return a2KMathReadingC;
    }

    /**
     * Sets the value of the a2K_Math_Reading__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setA2K_Math_Reading__C(Boolean value) {
        this.a2KMathReadingC = value;
    }

    /**
     * Gets the value of the a2K_Science__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isA2K_Science__C() {
        return a2KScienceC;
    }

    /**
     * Sets the value of the a2K_Science__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setA2K_Science__C(Boolean value) {
        this.a2KScienceC = value;
    }

    /**
     * Gets the value of the a2K_Social_Studies__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isA2K_Social_Studies__C() {
        return a2KSocialStudiesC;
    }

    /**
     * Sets the value of the a2K_Social_Studies__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setA2K_Social_Studies__C(Boolean value) {
        this.a2KSocialStudiesC = value;
    }

    /**
     * Gets the value of the attn_To__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATTN_To__C() {
        return attnToC;
    }

    /**
     * Sets the value of the attn_To__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATTN_To__C(String value) {
        this.attnToC = value;
    }

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
     * Gets the value of the accountPartners property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getAccountPartners() {
        return accountPartners;
    }

    /**
     * Sets the value of the accountPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setAccountPartners(QueryResult value) {
        this.accountPartners = value;
    }

    /**
     * Gets the value of the account_S_State__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount_S_State__C() {
        return accountSStateC;
    }

    /**
     * Sets the value of the account_S_State__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount_S_State__C(String value) {
        this.accountSStateC = value;
    }

    /**
     * Gets the value of the acct_Plans__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getAcct_Plans__R() {
        return acctPlansR;
    }

    /**
     * Sets the value of the acct_Plans__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setAcct_Plans__R(QueryResult value) {
        this.acctPlansR = value;
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
     * Gets the value of the additional_Trainings__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditional_Trainings__C() {
        return additionalTrainingsC;
    }

    /**
     * Sets the value of the additional_Trainings__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditional_Trainings__C(String value) {
        this.additionalTrainingsC = value;
    }

    /**
     * Gets the value of the address_Validation_Check__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress_Validation_Check__C() {
        return addressValidationCheckC;
    }

    /**
     * Sets the value of the address_Validation_Check__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress_Validation_Check__C(String value) {
        this.addressValidationCheckC = value;
    }

    /**
     * Gets the value of the adoption_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdoption_Type__C() {
        return adoptionTypeC;
    }

    /**
     * Sets the value of the adoption_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdoption_Type__C(String value) {
        this.adoptionTypeC = value;
    }

    /**
     * Gets the value of the allow_Contract_Pricing__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllow_Contract_Pricing__C() {
        return allowContractPricingC;
    }

    /**
     * Sets the value of the allow_Contract_Pricing__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllow_Contract_Pricing__C(Boolean value) {
        this.allowContractPricingC = value;
    }

    /**
     * Gets the value of the allow_Substitutions__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllow_Substitutions__C() {
        return allowSubstitutionsC;
    }

    /**
     * Sets the value of the allow_Substitutions__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllow_Substitutions__C(Boolean value) {
        this.allowSubstitutionsC = value;
    }

    /**
     * Gets the value of the alt_Ship_To_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlt_Ship_To_Name__C() {
        return altShipToNameC;
    }

    /**
     * Sets the value of the alt_Ship_To_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlt_Ship_To_Name__C(String value) {
        this.altShipToNameC = value;
    }

    /**
     * Gets the value of the alternate_Email_Address__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternate_Email_Address__C() {
        return alternateEmailAddressC;
    }

    /**
     * Sets the value of the alternate_Email_Address__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternate_Email_Address__C(String value) {
        this.alternateEmailAddressC = value;
    }

    /**
     * Gets the value of the alternate_Subtotal_Format__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlternate_Subtotal_Format__C() {
        return alternateSubtotalFormatC;
    }

    /**
     * Sets the value of the alternate_Subtotal_Format__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlternate_Subtotal_Format__C(Boolean value) {
        this.alternateSubtotalFormatC = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the amountPaid__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountPaid__C() {
        return amountPaidC;
    }

    /**
     * Sets the value of the amountPaid__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountPaid__C(Double value) {
        this.amountPaidC = value;
    }

    /**
     * Gets the value of the announcement_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnnouncement_Date__C() {
        return announcementDateC;
    }

    /**
     * Sets the value of the announcement_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnnouncement_Date__C(XMLGregorianCalendar value) {
        this.announcementDateC = value;
    }

    /**
     * Gets the value of the approval_Audit__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproval_Audit__C() {
        return approvalAuditC;
    }

    /**
     * Sets the value of the approval_Audit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproval_Audit__C(String value) {
        this.approvalAuditC = value;
    }

    /**
     * Gets the value of the approved_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getApproved_Amount__C() {
        return approvedAmountC;
    }

    /**
     * Sets the value of the approved_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setApproved_Amount__C(Double value) {
        this.approvedAmountC = value;
    }

    /**
     * Gets the value of the approved_Ratio__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getApproved_Ratio__C() {
        return approvedRatioC;
    }

    /**
     * Sets the value of the approved_Ratio__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setApproved_Ratio__C(Double value) {
        this.approvedRatioC = value;
    }

    /**
     * Gets the value of the assess2Know__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssess2Know__C() {
        return assess2KnowC;
    }

    /**
     * Sets the value of the assess2Know__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssess2Know__C(Boolean value) {
        this.assess2KnowC = value;
    }

    /**
     * Gets the value of the assessment_Consultant__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessment_Consultant__C() {
        return assessmentConsultantC;
    }

    /**
     * Sets the value of the assessment_Consultant__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessment_Consultant__C(String value) {
        this.assessmentConsultantC = value;
    }

    /**
     * Gets the value of the assisted_By__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssisted_By__C() {
        return assistedByC;
    }

    /**
     * Sets the value of the assisted_By__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssisted_By__C(String value) {
        this.assistedByC = value;
    }

    /**
     * Gets the value of the assisted_By__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getAssisted_By__R() {
        return assistedByR;
    }

    /**
     * Sets the value of the assisted_By__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setAssisted_By__R(UserType value) {
        this.assistedByR = value;
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
     * Gets the value of the auto_Coupon_Code_Override__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuto_Coupon_Code_Override__C() {
        return autoCouponCodeOverrideC;
    }

    /**
     * Sets the value of the auto_Coupon_Code_Override__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuto_Coupon_Code_Override__C(Boolean value) {
        this.autoCouponCodeOverrideC = value;
    }

    /**
     * Gets the value of the auto_Coupon_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuto_Coupon_Code__C() {
        return autoCouponCodeC;
    }

    /**
     * Sets the value of the auto_Coupon_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuto_Coupon_Code__C(String value) {
        this.autoCouponCodeC = value;
    }

    /**
     * Gets the value of the back_Office_Order__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBack_Office_Order__C() {
        return backOfficeOrderC;
    }

    /**
     * Sets the value of the back_Office_Order__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBack_Office_Order__C(String value) {
        this.backOfficeOrderC = value;
    }

    /**
     * Gets the value of the back_Text__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBack_Text__C() {
        return backTextC;
    }

    /**
     * Sets the value of the back_Text__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBack_Text__C(String value) {
        this.backTextC = value;
    }

    /**
     * Gets the value of the backorder_Cancel_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBackorder_Cancel_Date__C() {
        return backorderCancelDateC;
    }

    /**
     * Sets the value of the backorder_Cancel_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBackorder_Cancel_Date__C(XMLGregorianCalendar value) {
        this.backorderCancelDateC = value;
    }

    /**
     * Gets the value of the backorder_Option__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackorder_Option__C() {
        return backorderOptionC;
    }

    /**
     * Sets the value of the backorder_Option__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackorder_Option__C(String value) {
        this.backorderOptionC = value;
    }

    /**
     * Gets the value of the batchProcessTasks__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getBatchProcessTasks__R() {
        return batchProcessTasksR;
    }

    /**
     * Sets the value of the batchProcessTasks__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setBatchProcessTasks__R(QueryResult value) {
        this.batchProcessTasksR = value;
    }

    /**
     * Gets the value of the beginning_Grade_Level__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginning_Grade_Level__C() {
        return beginningGradeLevelC;
    }

    /**
     * Sets the value of the beginning_Grade_Level__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginning_Grade_Level__C(String value) {
        this.beginningGradeLevelC = value;
    }

    /**
     * Gets the value of the boardDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBoardDate__C() {
        return boardDateC;
    }

    /**
     * Sets the value of the boardDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBoardDate__C(XMLGregorianCalendar value) {
        this.boardDateC = value;
    }

    /**
     * Gets the value of the budget__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBudget__C() {
        return budgetC;
    }

    /**
     * Sets the value of the budget__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBudget__C(Double value) {
        this.budgetC = value;
    }

    /**
     * Gets the value of the col_Auto_Calculate_Quantity__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCOL_Auto_Calculate_Quantity__C() {
        return colAutoCalculateQuantityC;
    }

    /**
     * Sets the value of the col_Auto_Calculate_Quantity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCOL_Auto_Calculate_Quantity__C(Boolean value) {
        this.colAutoCalculateQuantityC = value;
    }

    /**
     * Gets the value of the col_Sample_Reason__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOL_Sample_Reason__C() {
        return colSampleReasonC;
    }

    /**
     * Sets the value of the col_Sample_Reason__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOL_Sample_Reason__C(String value) {
        this.colSampleReasonC = value;
    }

    /**
     * Gets the value of the cpas_Num_Tests__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCPAS_Num_Tests__C() {
        return cpasNumTestsC;
    }

    /**
     * Sets the value of the cpas_Num_Tests__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCPAS_Num_Tests__C(Double value) {
        this.cpasNumTestsC = value;
    }

    /**
     * Gets the value of the cpas_Setup_Fees__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCPAS_Setup_Fees__C() {
        return cpasSetupFeesC;
    }

    /**
     * Sets the value of the cpas_Setup_Fees__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCPAS_Setup_Fees__C(Double value) {
        this.cpasSetupFeesC = value;
    }

    /**
     * Gets the value of the cpas_Total_Setup_Fee__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCPAS_Total_Setup_Fee__C() {
        return cpasTotalSetupFeeC;
    }

    /**
     * Sets the value of the cpas_Total_Setup_Fee__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCPAS_Total_Setup_Fee__C(Double value) {
        this.cpasTotalSetupFeeC = value;
    }

    /**
     * Gets the value of the cpo_CSR_Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPO_CSR_Notes__C() {
        return cpoCSRNotesC;
    }

    /**
     * Sets the value of the cpo_CSR_Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPO_CSR_Notes__C(String value) {
        this.cpoCSRNotesC = value;
    }

    /**
     * Gets the value of the cpo_Owner__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPO_Owner__C() {
        return cpoOwnerC;
    }

    /**
     * Sets the value of the cpo_Owner__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPO_Owner__C(String value) {
        this.cpoOwnerC = value;
    }

    /**
     * Gets the value of the cpo_Owner__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getCPO_Owner__R() {
        return cpoOwnerR;
    }

    /**
     * Sets the value of the cpo_Owner__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setCPO_Owner__R(UserType value) {
        this.cpoOwnerR = value;
    }

    /**
     * Gets the value of the cpo_Rep_Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPO_Rep_Notes__C() {
        return cpoRepNotesC;
    }

    /**
     * Sets the value of the cpo_Rep_Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPO_Rep_Notes__C(String value) {
        this.cpoRepNotesC = value;
    }

    /**
     * Gets the value of the cpo_Rep_Review_Target_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCPO_Rep_Review_Target_Date__C() {
        return cpoRepReviewTargetDateC;
    }

    /**
     * Sets the value of the cpo_Rep_Review_Target_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCPO_Rep_Review_Target_Date__C(XMLGregorianCalendar value) {
        this.cpoRepReviewTargetDateC = value;
    }

    /**
     * Gets the value of the cpo_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPO_Status__C() {
        return cpoStatusC;
    }

    /**
     * Sets the value of the cpo_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPO_Status__C(String value) {
        this.cpoStatusC = value;
    }

    /**
     * Gets the value of the cp_Cover_Page_Logo_Formula__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCP_Cover_Page_Logo_Formula__C() {
        return cpCoverPageLogoFormulaC;
    }

    /**
     * Sets the value of the cp_Cover_Page_Logo_Formula__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCP_Cover_Page_Logo_Formula__C(String value) {
        this.cpCoverPageLogoFormulaC = value;
    }

    /**
     * Gets the value of the cp_Cover_Page_Logo__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCP_Cover_Page_Logo__C() {
        return cpCoverPageLogoC;
    }

    /**
     * Sets the value of the cp_Cover_Page_Logo__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCP_Cover_Page_Logo__C(String value) {
        this.cpCoverPageLogoC = value;
    }

    /**
     * Gets the value of the cp_Format__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCP_Format__C() {
        return cpFormatC;
    }

    /**
     * Sets the value of the cp_Format__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCP_Format__C(String value) {
        this.cpFormatC = value;
    }

    /**
     * Gets the value of the cp_Template_Max_Ratio__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCP_Template_Max_Ratio__C() {
        return cpTemplateMaxRatioC;
    }

    /**
     * Sets the value of the cp_Template_Max_Ratio__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCP_Template_Max_Ratio__C(Double value) {
        this.cpTemplateMaxRatioC = value;
    }

    /**
     * Gets the value of the cp_Template_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCP_Template_Type__C() {
        return cpTemplateTypeC;
    }

    /**
     * Sets the value of the cp_Template_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCP_Template_Type__C(String value) {
        this.cpTemplateTypeC = value;
    }

    /**
     * Gets the value of the cwe_Expiration_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCWE_Expiration_Date__C() {
        return cweExpirationDateC;
    }

    /**
     * Sets the value of the cwe_Expiration_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCWE_Expiration_Date__C(XMLGregorianCalendar value) {
        this.cweExpirationDateC = value;
    }

    /**
     * Gets the value of the cwe_Initial_Purchase_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCWE_Initial_Purchase_Date__C() {
        return cweInitialPurchaseDateC;
    }

    /**
     * Sets the value of the cwe_Initial_Purchase_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCWE_Initial_Purchase_Date__C(XMLGregorianCalendar value) {
        this.cweInitialPurchaseDateC = value;
    }

    /**
     * Gets the value of the cwe_Recent_Purchase_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCWE_Recent_Purchase_Date__C() {
        return cweRecentPurchaseDateC;
    }

    /**
     * Sets the value of the cwe_Recent_Purchase_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCWE_Recent_Purchase_Date__C(XMLGregorianCalendar value) {
        this.cweRecentPurchaseDateC = value;
    }

    /**
     * Gets the value of the calc_Value_Skills_Tutor__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCalc_Value_Skills_Tutor__C() {
        return calcValueSkillsTutorC;
    }

    /**
     * Sets the value of the calc_Value_Skills_Tutor__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCalc_Value_Skills_Tutor__C(Double value) {
        this.calcValueSkillsTutorC = value;
    }

    /**
     * Gets the value of the calc_Value__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCalc_Value__C() {
        return calcValueC;
    }

    /**
     * Sets the value of the calc_Value__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCalc_Value__C(Double value) {
        this.calcValueC = value;
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
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignId(String value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the cancelled_Lost_Details__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelled_Lost_Details__C() {
        return cancelledLostDetailsC;
    }

    /**
     * Sets the value of the cancelled_Lost_Details__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelled_Lost_Details__C(String value) {
        this.cancelledLostDetailsC = value;
    }

    /**
     * Gets the value of the cancelled_Lost_Reason__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelled_Lost_Reason__C() {
        return cancelledLostReasonC;
    }

    /**
     * Sets the value of the cancelled_Lost_Reason__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelled_Lost_Reason__C(String value) {
        this.cancelledLostReasonC = value;
    }

    /**
     * Gets the value of the closeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseDate() {
        return closeDate;
    }

    /**
     * Sets the value of the closeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseDate(XMLGregorianCalendar value) {
        this.closeDate = value;
    }

    /**
     * Gets the value of the commission_Variance__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommission_Variance__C() {
        return commissionVarianceC;
    }

    /**
     * Sets the value of the commission_Variance__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommission_Variance__C(Boolean value) {
        this.commissionVarianceC = value;
    }

    /**
     * Gets the value of the committee__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommittee__C() {
        return committeeC;
    }

    /**
     * Sets the value of the committee__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommittee__C(Boolean value) {
        this.committeeC = value;
    }

    /**
     * Gets the value of the common_Core__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommon_Core__C() {
        return commonCoreC;
    }

    /**
     * Sets the value of the common_Core__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommon_Core__C(Boolean value) {
        this.commonCoreC = value;
    }

    /**
     * Gets the value of the competitor_Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetitor_Notes__C() {
        return competitorNotesC;
    }

    /**
     * Sets the value of the competitor_Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetitor_Notes__C(String value) {
        this.competitorNotesC = value;
    }

    /**
     * Gets the value of the competitor_S__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetitor_S__C() {
        return competitorSC;
    }

    /**
     * Sets the value of the competitor_S__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetitor_S__C(String value) {
        this.competitorSC = value;
    }

    /**
     * Gets the value of the completed_Training_Days__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCompleted_Training_Days__C() {
        return completedTrainingDaysC;
    }

    /**
     * Sets the value of the completed_Training_Days__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCompleted_Training_Days__C(Double value) {
        this.completedTrainingDaysC = value;
    }

    /**
     * Gets the value of the confidential_Text__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidential_Text__C() {
        return confidentialTextC;
    }

    /**
     * Sets the value of the confidential_Text__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidential_Text__C(String value) {
        this.confidentialTextC = value;
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
     * Gets the value of the consultant_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsultant_Amount__C() {
        return consultantAmountC;
    }

    /**
     * Sets the value of the consultant_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsultant_Amount__C(Double value) {
        this.consultantAmountC = value;
    }

    /**
     * Gets the value of the contact_Email__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact_Email__C() {
        return contactEmailC;
    }

    /**
     * Sets the value of the contact_Email__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact_Email__C(String value) {
        this.contactEmailC = value;
    }

    /**
     * Gets the value of the contact_Formula__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact_Formula__C() {
        return contactFormulaC;
    }

    /**
     * Sets the value of the contact_Formula__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact_Formula__C(String value) {
        this.contactFormulaC = value;
    }

    /**
     * Gets the value of the contact_Job_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact_Job_Description__C() {
        return contactJobDescriptionC;
    }

    /**
     * Sets the value of the contact_Job_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact_Job_Description__C(String value) {
        this.contactJobDescriptionC = value;
    }

    /**
     * Gets the value of the contact_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact_Name__C() {
        return contactNameC;
    }

    /**
     * Sets the value of the contact_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact_Name__C(String value) {
        this.contactNameC = value;
    }

    /**
     * Gets the value of the contact_Phone__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact_Phone__C() {
        return contactPhoneC;
    }

    /**
     * Sets the value of the contact_Phone__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact_Phone__C(String value) {
        this.contactPhoneC = value;
    }

    /**
     * Gets the value of the contact_Title__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact_Title__C() {
        return contactTitleC;
    }

    /**
     * Sets the value of the contact_Title__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact_Title__C(String value) {
        this.contactTitleC = value;
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
     * Gets the value of the content_Enrollment_1__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getContent_Enrollment_1__C() {
        return contentEnrollment1C;
    }

    /**
     * Sets the value of the content_Enrollment_1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setContent_Enrollment_1__C(Double value) {
        this.contentEnrollment1C = value;
    }

    /**
     * Gets the value of the content_Enrollment_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getContent_Enrollment_2__C() {
        return contentEnrollment2C;
    }

    /**
     * Sets the value of the content_Enrollment_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setContent_Enrollment_2__C(Double value) {
        this.contentEnrollment2C = value;
    }

    /**
     * Gets the value of the content_Enrollment_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getContent_Enrollment_3__C() {
        return contentEnrollment3C;
    }

    /**
     * Sets the value of the content_Enrollment_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setContent_Enrollment_3__C(Double value) {
        this.contentEnrollment3C = value;
    }

    /**
     * Gets the value of the content_Enrollment_4__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getContent_Enrollment_4__C() {
        return contentEnrollment4C;
    }

    /**
     * Sets the value of the content_Enrollment_4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setContent_Enrollment_4__C(Double value) {
        this.contentEnrollment4C = value;
    }

    /**
     * Gets the value of the content_Fees_Per_Student_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getContent_Fees_Per_Student_2__C() {
        return contentFeesPerStudent2C;
    }

    /**
     * Sets the value of the content_Fees_Per_Student_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setContent_Fees_Per_Student_2__C(Double value) {
        this.contentFeesPerStudent2C = value;
    }

    /**
     * Gets the value of the content_Fees_Per_Student_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getContent_Fees_Per_Student_3__C() {
        return contentFeesPerStudent3C;
    }

    /**
     * Sets the value of the content_Fees_Per_Student_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setContent_Fees_Per_Student_3__C(Double value) {
        this.contentFeesPerStudent3C = value;
    }

    /**
     * Gets the value of the content_Fees_Per_Student_4__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getContent_Fees_Per_Student_4__C() {
        return contentFeesPerStudent4C;
    }

    /**
     * Sets the value of the content_Fees_Per_Student_4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setContent_Fees_Per_Student_4__C(Double value) {
        this.contentFeesPerStudent4C = value;
    }

    /**
     * Gets the value of the content_Fees_Per_Student__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getContent_Fees_Per_Student__C() {
        return contentFeesPerStudentC;
    }

    /**
     * Sets the value of the content_Fees_Per_Student__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setContent_Fees_Per_Student__C(Double value) {
        this.contentFeesPerStudentC = value;
    }

    /**
     * Gets the value of the content_Grades_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent_Grades_2__C() {
        return contentGrades2C;
    }

    /**
     * Sets the value of the content_Grades_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent_Grades_2__C(String value) {
        this.contentGrades2C = value;
    }

    /**
     * Gets the value of the content_Grades_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent_Grades_3__C() {
        return contentGrades3C;
    }

    /**
     * Sets the value of the content_Grades_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent_Grades_3__C(String value) {
        this.contentGrades3C = value;
    }

    /**
     * Gets the value of the content_Grades_4__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent_Grades_4__C() {
        return contentGrades4C;
    }

    /**
     * Sets the value of the content_Grades_4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent_Grades_4__C(String value) {
        this.contentGrades4C = value;
    }

    /**
     * Gets the value of the content_Grades__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent_Grades__C() {
        return contentGradesC;
    }

    /**
     * Sets the value of the content_Grades__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent_Grades__C(String value) {
        this.contentGradesC = value;
    }

    /**
     * Gets the value of the content_Products_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent_Products_2__C() {
        return contentProducts2C;
    }

    /**
     * Sets the value of the content_Products_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent_Products_2__C(String value) {
        this.contentProducts2C = value;
    }

    /**
     * Gets the value of the content_Products_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent_Products_3__C() {
        return contentProducts3C;
    }

    /**
     * Sets the value of the content_Products_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent_Products_3__C(String value) {
        this.contentProducts3C = value;
    }

    /**
     * Gets the value of the content_Products_4__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent_Products_4__C() {
        return contentProducts4C;
    }

    /**
     * Sets the value of the content_Products_4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent_Products_4__C(String value) {
        this.contentProducts4C = value;
    }

    /**
     * Gets the value of the content_Products__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent_Products__C() {
        return contentProductsC;
    }

    /**
     * Sets the value of the content_Products__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent_Products__C(String value) {
        this.contentProductsC = value;
    }

    /**
     * Gets the value of the cost_Ratio__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCost_Ratio__C() {
        return costRatioC;
    }

    /**
     * Sets the value of the cost_Ratio__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCost_Ratio__C(Double value) {
        this.costRatioC = value;
    }

    /**
     * Gets the value of the coupon_Code_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoupon_Code_Name__C() {
        return couponCodeNameC;
    }

    /**
     * Sets the value of the coupon_Code_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoupon_Code_Name__C(String value) {
        this.couponCodeNameC = value;
    }

    /**
     * Gets the value of the coupon_Code_Name__R property.
     * 
     * @return
     *     possible object is
     *     {@link Coupon_Codes__CType }
     *     
     */
    public Coupon_Codes__CType getCoupon_Code_Name__R() {
        return couponCodeNameR;
    }

    /**
     * Sets the value of the coupon_Code_Name__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coupon_Codes__CType }
     *     
     */
    public void setCoupon_Code_Name__R(Coupon_Codes__CType value) {
        this.couponCodeNameR = value;
    }

    /**
     * Gets the value of the coupon_Code_PD_Sale_Amt__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoupon_Code_PD_Sale_Amt__C() {
        return couponCodePDSaleAmtC;
    }

    /**
     * Sets the value of the coupon_Code_PD_Sale_Amt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoupon_Code_PD_Sale_Amt__C(Double value) {
        this.couponCodePDSaleAmtC = value;
    }

    /**
     * Gets the value of the coupon_Code_SE_Sale_Amt__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoupon_Code_SE_Sale_Amt__C() {
        return couponCodeSESaleAmtC;
    }

    /**
     * Sets the value of the coupon_Code_SE_Sale_Amt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoupon_Code_SE_Sale_Amt__C(Double value) {
        this.couponCodeSESaleAmtC = value;
    }

    /**
     * Gets the value of the create_Opportunity__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreate_Opportunity__C() {
        return createOpportunityC;
    }

    /**
     * Sets the value of the create_Opportunity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreate_Opportunity__C(Boolean value) {
        this.createOpportunityC = value;
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
     * Gets the value of the created_From_Account__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreated_From_Account__C() {
        return createdFromAccountC;
    }

    /**
     * Sets the value of the created_From_Account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreated_From_Account__C(Boolean value) {
        this.createdFromAccountC = value;
    }

    /**
     * Gets the value of the current_Product_Using__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrent_Product_Using__C() {
        return currentProductUsingC;
    }

    /**
     * Sets the value of the current_Product_Using__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrent_Product_Using__C(String value) {
        this.currentProductUsingC = value;
    }

    /**
     * Gets the value of the customer_Care_Default_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Care_Default_Status__C() {
        return customerCareDefaultStatusC;
    }

    /**
     * Sets the value of the customer_Care_Default_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Care_Default_Status__C(String value) {
        this.customerCareDefaultStatusC = value;
    }

    /**
     * Gets the value of the customer_Care_Preferred_Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Care_Preferred_Contact__C() {
        return customerCarePreferredContactC;
    }

    /**
     * Sets the value of the customer_Care_Preferred_Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Care_Preferred_Contact__C(String value) {
        this.customerCarePreferredContactC = value;
    }

    /**
     * Gets the value of the customer_Care_Preferred_PO_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Care_Preferred_PO_Number__C() {
        return customerCarePreferredPONumberC;
    }

    /**
     * Sets the value of the customer_Care_Preferred_PO_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Care_Preferred_PO_Number__C(String value) {
        this.customerCarePreferredPONumberC = value;
    }

    /**
     * Gets the value of the customer_Email_Address__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Email_Address__C() {
        return customerEmailAddressC;
    }

    /**
     * Sets the value of the customer_Email_Address__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Email_Address__C(String value) {
        this.customerEmailAddressC = value;
    }

    /**
     * Gets the value of the customer_Message__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Message__C() {
        return customerMessageC;
    }

    /**
     * Sets the value of the customer_Message__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Message__C(String value) {
        this.customerMessageC = value;
    }

    /**
     * Gets the value of the customer_Transaction_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Transaction_Type__C() {
        return customerTransactionTypeC;
    }

    /**
     * Sets the value of the customer_Transaction_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Transaction_Type__C(String value) {
        this.customerTransactionTypeC = value;
    }

    /**
     * Gets the value of the customized_Product_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomized_Product_Flag__C() {
        return customizedProductFlagC;
    }

    /**
     * Sets the value of the customized_Product_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomized_Product_Flag__C(Boolean value) {
        this.customizedProductFlagC = value;
    }

    /**
     * Gets the value of the di_Completed__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDI_Completed__C() {
        return diCompletedC;
    }

    /**
     * Sets the value of the di_Completed__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDI_Completed__C(XMLGregorianCalendar value) {
        this.diCompletedC = value;
    }

    /**
     * Gets the value of the di_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDI_Status__C() {
        return diStatusC;
    }

    /**
     * Sets the value of the di_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDI_Status__C(String value) {
        this.diStatusC = value;
    }

    /**
     * Gets the value of the dataIntegrationFees__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDataIntegrationFees__C() {
        return dataIntegrationFeesC;
    }

    /**
     * Sets the value of the dataIntegrationFees__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDataIntegrationFees__C(Double value) {
        this.dataIntegrationFeesC = value;
    }

    /**
     * Gets the value of the data_Loader_Update__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData_Loader_Update__C() {
        return dataLoaderUpdateC;
    }

    /**
     * Sets the value of the data_Loader_Update__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData_Loader_Update__C(String value) {
        this.dataLoaderUpdateC = value;
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
     * Gets the value of the data_Verification_Call_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData_Verification_Call_Date__C() {
        return dataVerificationCallDateC;
    }

    /**
     * Sets the value of the data_Verification_Call_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData_Verification_Call_Date__C(XMLGregorianCalendar value) {
        this.dataVerificationCallDateC = value;
    }

    /**
     * Gets the value of the dateInvoiced__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateInvoiced__C() {
        return dateInvoicedC;
    }

    /**
     * Sets the value of the dateInvoiced__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateInvoiced__C(XMLGregorianCalendar value) {
        this.dateInvoicedC = value;
    }

    /**
     * Gets the value of the datePaid__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePaid__C() {
        return datePaidC;
    }

    /**
     * Sets the value of the datePaid__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePaid__C(XMLGregorianCalendar value) {
        this.datePaidC = value;
    }

    /**
     * Gets the value of the dateSigned__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSigned__C() {
        return dateSignedC;
    }

    /**
     * Sets the value of the dateSigned__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSigned__C(XMLGregorianCalendar value) {
        this.dateSignedC = value;
    }

    /**
     * Gets the value of the date_Training_Complete__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate_Training_Complete__C() {
        return dateTrainingCompleteC;
    }

    /**
     * Sets the value of the date_Training_Complete__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate_Training_Complete__C(XMLGregorianCalendar value) {
        this.dateTrainingCompleteC = value;
    }

    /**
     * Gets the value of the daysIntegration__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDaysIntegration__C() {
        return daysIntegrationC;
    }

    /**
     * Sets the value of the daysIntegration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDaysIntegration__C(Double value) {
        this.daysIntegrationC = value;
    }

    /**
     * Gets the value of the deal_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeal_Type__C() {
        return dealTypeC;
    }

    /**
     * Sets the value of the deal_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeal_Type__C(String value) {
        this.dealTypeC = value;
    }

    /**
     * Gets the value of the decision_Level_Skills_Tutor__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecision_Level_Skills_Tutor__C() {
        return decisionLevelSkillsTutorC;
    }

    /**
     * Sets the value of the decision_Level_Skills_Tutor__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecision_Level_Skills_Tutor__C(String value) {
        this.decisionLevelSkillsTutorC = value;
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
     * Gets the value of the default_Line_Item_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault_Line_Item_Type__C() {
        return defaultLineItemTypeC;
    }

    /**
     * Sets the value of the default_Line_Item_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault_Line_Item_Type__C(String value) {
        this.defaultLineItemTypeC = value;
    }

    /**
     * Gets the value of the default_Quantity_Calculation_Method__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault_Quantity_Calculation_Method__C() {
        return defaultQuantityCalculationMethodC;
    }

    /**
     * Sets the value of the default_Quantity_Calculation_Method__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault_Quantity_Calculation_Method__C(String value) {
        this.defaultQuantityCalculationMethodC = value;
    }

    /**
     * Gets the value of the deliver_By_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliver_By_Date__C() {
        return deliverByDateC;
    }

    /**
     * Sets the value of the deliver_By_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliver_By_Date__C(XMLGregorianCalendar value) {
        this.deliverByDateC = value;
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
     * Gets the value of the discount_Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscount_Notes__C() {
        return discountNotesC;
    }

    /**
     * Sets the value of the discount_Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscount_Notes__C(String value) {
        this.discountNotesC = value;
    }

    /**
     * Gets the value of the discount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscount__C() {
        return discountC;
    }

    /**
     * Sets the value of the discount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscount__C(Double value) {
        this.discountC = value;
    }

    /**
     * Gets the value of the dispaly_PD_Addendum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDispaly_PD_Addendum__C() {
        return dispalyPDAddendumC;
    }

    /**
     * Sets the value of the dispaly_PD_Addendum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDispaly_PD_Addendum__C(Boolean value) {
        this.dispalyPDAddendumC = value;
    }

    /**
     * Gets the value of the display_Account_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplay_Account_Name__C() {
        return displayAccountNameC;
    }

    /**
     * Sets the value of the display_Account_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplay_Account_Name__C(String value) {
        this.displayAccountNameC = value;
    }

    /**
     * Gets the value of the display_Program_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplay_Program_Name__C() {
        return displayProgramNameC;
    }

    /**
     * Sets the value of the display_Program_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplay_Program_Name__C(String value) {
        this.displayProgramNameC = value;
    }

    /**
     * Gets the value of the district_Partners__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict_Partners__C() {
        return districtPartnersC;
    }

    /**
     * Sets the value of the district_Partners__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict_Partners__C(String value) {
        this.districtPartnersC = value;
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
     * Gets the value of the do_Not_Mix_POs_On_Same_Pallet__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDo_Not_Mix_POs_On_Same_Pallet__C() {
        return doNotMixPOsOnSamePalletC;
    }

    /**
     * Sets the value of the do_Not_Mix_POs_On_Same_Pallet__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDo_Not_Mix_POs_On_Same_Pallet__C(Boolean value) {
        this.doNotMixPOsOnSamePalletC = value;
    }

    /**
     * Gets the value of the dolphin_Shipping__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDolphin_Shipping__C() {
        return dolphinShippingC;
    }

    /**
     * Sets the value of the dolphin_Shipping__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDolphin_Shipping__C(String value) {
        this.dolphinShippingC = value;
    }

    /**
     * Gets the value of the drop_Shipments1__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getDrop_Shipments1__R() {
        return dropShipments1R;
    }

    /**
     * Sets the value of the drop_Shipments1__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setDrop_Shipments1__R(QueryResult value) {
        this.dropShipments1R = value;
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
     * Gets the value of the effectiveDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate__C() {
        return effectiveDateC;
    }

    /**
     * Sets the value of the effectiveDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate__C(XMLGregorianCalendar value) {
        this.effectiveDateC = value;
    }

    /**
     * Sample variable-level Javadoc comment.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSecondEffective_Date_C() {
        return secondEffectiveDateC;
    }

    /**
     * Sets the value of the secondEffective_Date_C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSecondEffective_Date_C(XMLGregorianCalendar value) {
        this.secondEffectiveDateC = value;
    }

    /**
     * Gets the value of the ending_Grade_Level__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnding_Grade_Level__C() {
        return endingGradeLevelC;
    }

    /**
     * Sets the value of the ending_Grade_Level__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnding_Grade_Level__C(String value) {
        this.endingGradeLevelC = value;
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
     * Gets the value of the entry_Division__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntry_Division__C() {
        return entryDivisionC;
    }

    /**
     * Sets the value of the entry_Division__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntry_Division__C(String value) {
        this.entryDivisionC = value;
    }

    /**
     * Gets the value of the err_1_Line_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErr_1_Line_Number__C() {
        return err1LineNumberC;
    }

    /**
     * Sets the value of the err_1_Line_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErr_1_Line_Number__C(String value) {
        this.err1LineNumberC = value;
    }

    /**
     * Gets the value of the err_2_Line_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErr_2_Line_Number__C() {
        return err2LineNumberC;
    }

    /**
     * Sets the value of the err_2_Line_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErr_2_Line_Number__C(String value) {
        this.err2LineNumberC = value;
    }

    /**
     * Gets the value of the err_3_Line_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErr_3_Line_Number__C() {
        return err3LineNumberC;
    }

    /**
     * Sets the value of the err_3_Line_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErr_3_Line_Number__C(String value) {
        this.err3LineNumberC = value;
    }

    /**
     * Gets the value of the estimated_Scanner_Count__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimated_Scanner_Count__C() {
        return estimatedScannerCountC;
    }

    /**
     * Sets the value of the estimated_Scanner_Count__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimated_Scanner_Count__C(Double value) {
        this.estimatedScannerCountC = value;
    }

    /**
     * Gets the value of the evaluation_Form__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEvaluation_Form__C() {
        return evaluationFormC;
    }

    /**
     * Sets the value of the evaluation_Form__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEvaluation_Form__C(Boolean value) {
        this.evaluationFormC = value;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isExamView__C() {
        return examViewC;
    }

    /**
     * Sets the value of the examView__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExamView__C(Boolean value) {
        this.examViewC = value;
    }

    /**
     * Gets the value of the expectedRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpectedRevenue() {
        return expectedRevenue;
    }

    /**
     * Sets the value of the expectedRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpectedRevenue(Double value) {
        this.expectedRevenue = value;
    }

    /**
     * Gets the value of the expected_Revenue_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpected_Revenue_2__C() {
        return expectedRevenue2C;
    }

    /**
     * Sets the value of the expected_Revenue_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpected_Revenue_2__C(Double value) {
        this.expectedRevenue2C = value;
    }

    /**
     * Gets the value of the expected_Revenue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpected_Revenue__C() {
        return expectedRevenueC;
    }

    /**
     * Sets the value of the expected_Revenue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpected_Revenue__C(Double value) {
        this.expectedRevenueC = value;
    }

    /**
     * Gets the value of the expiration_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiration_Date__C() {
        return expirationDateC;
    }

    /**
     * Sets the value of the expiration_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiration_Date__C(XMLGregorianCalendar value) {
        this.expirationDateC = value;
    }

    /**
     * Gets the value of the fax_URL__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax_URL__C() {
        return faxURLC;
    }

    /**
     * Sets the value of the fax_URL__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax_URL__C(String value) {
        this.faxURLC = value;
    }

    /**
     * Gets the value of the federal_Funding_Support_Email__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederal_Funding_Support_Email__C() {
        return federalFundingSupportEmailC;
    }

    /**
     * Sets the value of the federal_Funding_Support_Email__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederal_Funding_Support_Email__C(String value) {
        this.federalFundingSupportEmailC = value;
    }

    /**
     * Gets the value of the federal_Funding_Support_Phone__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederal_Funding_Support_Phone__C() {
        return federalFundingSupportPhoneC;
    }

    /**
     * Sets the value of the federal_Funding_Support_Phone__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederal_Funding_Support_Phone__C(String value) {
        this.federalFundingSupportPhoneC = value;
    }

    /**
     * Gets the value of the federal_Funding_Support__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederal_Funding_Support__C() {
        return federalFundingSupportC;
    }

    /**
     * Sets the value of the federal_Funding_Support__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederal_Funding_Support__C(String value) {
        this.federalFundingSupportC = value;
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
     * Gets the value of the field1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField1__C() {
        return field1C;
    }

    /**
     * Sets the value of the field1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField1__C(String value) {
        this.field1C = value;
    }

    /**
     * Gets the value of the finance_Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinance_Notes__C() {
        return financeNotesC;
    }

    /**
     * Sets the value of the finance_Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinance_Notes__C(String value) {
        this.financeNotesC = value;
    }

    /**
     * Gets the value of the firstMeeting__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstMeeting__C() {
        return firstMeetingC;
    }

    /**
     * Sets the value of the firstMeeting__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstMeeting__C(XMLGregorianCalendar value) {
        this.firstMeetingC = value;
    }

    /**
     * Gets the value of the firstYearEnrlNotes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstYearEnrlNotes__C() {
        return firstYearEnrlNotesC;
    }

    /**
     * Sets the value of the firstYearEnrlNotes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstYearEnrlNotes__C(String value) {
        this.firstYearEnrlNotesC = value;
    }

    /**
     * Gets the value of the firstYearEnrl__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFirstYearEnrl__C() {
        return firstYearEnrlC;
    }

    /**
     * Sets the value of the firstYearEnrl__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFirstYearEnrl__C(Double value) {
        this.firstYearEnrlC = value;
    }

    /**
     * Gets the value of the first_Benchmark_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirst_Benchmark_Date__C() {
        return firstBenchmarkDateC;
    }

    /**
     * Sets the value of the first_Benchmark_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirst_Benchmark_Date__C(XMLGregorianCalendar value) {
        this.firstBenchmarkDateC = value;
    }

    /**
     * Gets the value of the first_Referral_Meeting__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirst_Referral_Meeting__C() {
        return firstReferralMeetingC;
    }

    /**
     * Sets the value of the first_Referral_Meeting__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirst_Referral_Meeting__C(XMLGregorianCalendar value) {
        this.firstReferralMeetingC = value;
    }

    /**
     * Gets the value of the fiscal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscal() {
        return fiscal;
    }

    /**
     * Sets the value of the fiscal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscal(String value) {
        this.fiscal = value;
    }

    /**
     * Gets the value of the fiscalQuarter property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFiscalQuarter() {
        return fiscalQuarter;
    }

    /**
     * Sets the value of the fiscalQuarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFiscalQuarter(Integer value) {
        this.fiscalQuarter = value;
    }

    /**
     * Gets the value of the fiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFiscalYear() {
        return fiscalYear;
    }

    /**
     * Sets the value of the fiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFiscalYear(Integer value) {
        this.fiscalYear = value;
    }

    /**
     * Gets the value of the follow_Up_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFollow_Up_Date__C() {
        return followUpDateC;
    }

    /**
     * Sets the value of the follow_Up_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFollow_Up_Date__C(XMLGregorianCalendar value) {
        this.followUpDateC = value;
    }

    /**
     * Gets the value of the force_Delivered_Pricing__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForce_Delivered_Pricing__C() {
        return forceDeliveredPricingC;
    }

    /**
     * Sets the value of the force_Delivered_Pricing__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForce_Delivered_Pricing__C(Boolean value) {
        this.forceDeliveredPricingC = value;
    }

    /**
     * Gets the value of the forecastCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecastCategory() {
        return forecastCategory;
    }

    /**
     * Sets the value of the forecastCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecastCategory(String value) {
        this.forecastCategory = value;
    }

    /**
     * Gets the value of the forecastCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecastCategoryName() {
        return forecastCategoryName;
    }

    /**
     * Sets the value of the forecastCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecastCategoryName(String value) {
        this.forecastCategoryName = value;
    }

    /**
     * Gets the value of the forecast_Category__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecast_Category__C() {
        return forecastCategoryC;
    }

    /**
     * Sets the value of the forecast_Category__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecast_Category__C(String value) {
        this.forecastCategoryC = value;
    }

    /**
     * Gets the value of the formative_Non_RFP_Pricing_Proposal_Sent__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFormative_Non_RFP_Pricing_Proposal_Sent__C() {
        return formativeNonRFPPricingProposalSentC;
    }

    /**
     * Sets the value of the formative_Non_RFP_Pricing_Proposal_Sent__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFormative_Non_RFP_Pricing_Proposal_Sent__C(Boolean value) {
        this.formativeNonRFPPricingProposalSentC = value;
    }

    /**
     * Gets the value of the front_Text__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFront_Text__C() {
        return frontTextC;
    }

    /**
     * Sets the value of the front_Text__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFront_Text__C(String value) {
        this.frontTextC = value;
    }

    /**
     * Gets the value of the fulfillment_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFulfillment_Amount__C() {
        return fulfillmentAmountC;
    }

    /**
     * Sets the value of the fulfillment_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFulfillment_Amount__C(Double value) {
        this.fulfillmentAmountC = value;
    }

    /**
     * Gets the value of the fulfillment_End_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFulfillment_End_Date__C() {
        return fulfillmentEndDateC;
    }

    /**
     * Sets the value of the fulfillment_End_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFulfillment_End_Date__C(XMLGregorianCalendar value) {
        this.fulfillmentEndDateC = value;
    }

    /**
     * Gets the value of the fulfillment_Quantity__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFulfillment_Quantity__C() {
        return fulfillmentQuantityC;
    }

    /**
     * Sets the value of the fulfillment_Quantity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFulfillment_Quantity__C(Double value) {
        this.fulfillmentQuantityC = value;
    }

    /**
     * Gets the value of the fulfillment_Start_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFulfillment_Start_Date__C() {
        return fulfillmentStartDateC;
    }

    /**
     * Sets the value of the fulfillment_Start_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFulfillment_Start_Date__C(XMLGregorianCalendar value) {
        this.fulfillmentStartDateC = value;
    }

    /**
     * Gets the value of the funding_Allocation_Links__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getFunding_Allocation_Links__R() {
        return fundingAllocationLinksR;
    }

    /**
     * Sets the value of the funding_Allocation_Links__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setFunding_Allocation_Links__R(QueryResult value) {
        this.fundingAllocationLinksR = value;
    }

    /**
     * Gets the value of the funding_Ext__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunding_Ext__C() {
        return fundingExtC;
    }

    /**
     * Sets the value of the funding_Ext__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunding_Ext__C(String value) {
        this.fundingExtC = value;
    }

    /**
     * Gets the value of the funding_Likelihood__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunding_Likelihood__C() {
        return fundingLikelihoodC;
    }

    /**
     * Sets the value of the funding_Likelihood__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunding_Likelihood__C(String value) {
        this.fundingLikelihoodC = value;
    }

    /**
     * Gets the value of the funding_Source_Detail__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunding_Source_Detail__C() {
        return fundingSourceDetailC;
    }

    /**
     * Sets the value of the funding_Source_Detail__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunding_Source_Detail__C(String value) {
        this.fundingSourceDetailC = value;
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
     * Gets the value of the grt_Auto_Calculate_Quantity__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGRT_Auto_Calculate_Quantity__C() {
        return grtAutoCalculateQuantityC;
    }

    /**
     * Sets the value of the grt_Auto_Calculate_Quantity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGRT_Auto_Calculate_Quantity__C(Boolean value) {
        this.grtAutoCalculateQuantityC = value;
    }

    /**
     * Gets the value of the grt_Sample_Reason__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRT_Sample_Reason__C() {
        return grtSampleReasonC;
    }

    /**
     * Sets the value of the grt_Sample_Reason__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRT_Sample_Reason__C(String value) {
        this.grtSampleReasonC = value;
    }

    /**
     * Gets the value of the get_Price_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGet_Price_Comments__C() {
        return getPriceCommentsC;
    }

    /**
     * Sets the value of the get_Price_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGet_Price_Comments__C(String value) {
        this.getPriceCommentsC = value;
    }

    /**
     * Gets the value of the get_Price_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGet_Price_Date__C() {
        return getPriceDateC;
    }

    /**
     * Sets the value of the get_Price_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGet_Price_Date__C(XMLGregorianCalendar value) {
        this.getPriceDateC = value;
    }

    /**
     * Gets the value of the get_Price_User__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGet_Price_User__C() {
        return getPriceUserC;
    }

    /**
     * Sets the value of the get_Price_User__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGet_Price_User__C(String value) {
        this.getPriceUserC = value;
    }

    /**
     * Gets the value of the get_Price_User__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getGet_Price_User__R() {
        return getPriceUserR;
    }

    /**
     * Sets the value of the get_Price_User__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setGet_Price_User__R(UserType value) {
        this.getPriceUserR = value;
    }

    /**
     * Gets the value of the grade_Level__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade_Level__C() {
        return gradeLevelC;
    }

    /**
     * Sets the value of the grade_Level__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade_Level__C(String value) {
        this.gradeLevelC = value;
    }

    /**
     * Gets the value of the hit_Auto_Calculate_Quantity__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHIT_Auto_Calculate_Quantity__C() {
        return hitAutoCalculateQuantityC;
    }

    /**
     * Sets the value of the hit_Auto_Calculate_Quantity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHIT_Auto_Calculate_Quantity__C(Boolean value) {
        this.hitAutoCalculateQuantityC = value;
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
     * Gets the value of the hmlt_Lost_Reason__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHMLT_Lost_Reason__C() {
        return hmltLostReasonC;
    }

    /**
     * Sets the value of the hmlt_Lost_Reason__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHMLT_Lost_Reason__C(String value) {
        this.hmltLostReasonC = value;
    }

    /**
     * Gets the value of the hard_Sample_Restriction__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHard_Sample_Restriction__C() {
        return hardSampleRestrictionC;
    }

    /**
     * Sets the value of the hard_Sample_Restriction__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHard_Sample_Restriction__C(Boolean value) {
        this.hardSampleRestrictionC = value;
    }

    /**
     * Gets the value of the hasOpportunityLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasOpportunityLineItem() {
        return hasOpportunityLineItem;
    }

    /**
     * Sets the value of the hasOpportunityLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOpportunityLineItem(Boolean value) {
        this.hasOpportunityLineItem = value;
    }

    /**
     * Gets the value of the has_Subscription_Item__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHas_Subscription_Item__C() {
        return hasSubscriptionItemC;
    }

    /**
     * Sets the value of the has_Subscription_Item__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHas_Subscription_Item__C(Boolean value) {
        this.hasSubscriptionItemC = value;
    }

    /**
     * Gets the value of the header_CC_Ratio_Indicator__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader_CC_Ratio_Indicator__C() {
        return headerCCRatioIndicatorC;
    }

    /**
     * Sets the value of the header_CC_Ratio_Indicator__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader_CC_Ratio_Indicator__C(String value) {
        this.headerCCRatioIndicatorC = value;
    }

    /**
     * Gets the value of the high_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHigh_Amount__C() {
        return highAmountC;
    }

    /**
     * Sets the value of the high_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHigh_Amount__C(Double value) {
        this.highAmountC = value;
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
     * Gets the value of the hold_For_Customer_Review__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHold_For_Customer_Review__C() {
        return holdForCustomerReviewC;
    }

    /**
     * Sets the value of the hold_For_Customer_Review__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHold_For_Customer_Review__C(Boolean value) {
        this.holdForCustomerReviewC = value;
    }

    /**
     * Gets the value of the int_Auto_Calculate_Quantity__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINT_Auto_Calculate_Quantity__C() {
        return intAutoCalculateQuantityC;
    }

    /**
     * Sets the value of the int_Auto_Calculate_Quantity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINT_Auto_Calculate_Quantity__C(Boolean value) {
        this.intAutoCalculateQuantityC = value;
    }

    /**
     * Gets the value of the incumbent_Publisher_S__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncumbent_Publisher_S__C() {
        return incumbentPublisherSC;
    }

    /**
     * Sets the value of the incumbent_Publisher_S__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncumbent_Publisher_S__C(String value) {
        this.incumbentPublisherSC = value;
    }

    /**
     * Gets the value of the interface_Sort_Order__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterface_Sort_Order__C() {
        return interfaceSortOrderC;
    }

    /**
     * Sets the value of the interface_Sort_Order__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterface_Sort_Order__C(String value) {
        this.interfaceSortOrderC = value;
    }

    /**
     * Gets the value of the internal_Opportunity_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternal_Opportunity_ID__C() {
        return internalOpportunityIDC;
    }

    /**
     * Sets the value of the internal_Opportunity_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternal_Opportunity_ID__C(String value) {
        this.internalOpportunityIDC = value;
    }

    /**
     * Gets the value of the invoiceAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceAmount__C() {
        return invoiceAmountC;
    }

    /**
     * Sets the value of the invoiceAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceAmount__C(String value) {
        this.invoiceAmountC = value;
    }

    /**
     * Gets the value of the invoice__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoice__C() {
        return invoiceC;
    }

    /**
     * Sets the value of the invoice__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoice__C(String value) {
        this.invoiceC = value;
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
     * Gets the value of the isWon property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWon() {
        return isWon;
    }

    /**
     * Sets the value of the isWon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWon(Boolean value) {
        this.isWon = value;
    }

    /**
     * Gets the value of the is_CP_Template_Validated__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIs_CP_Template_Validated__C() {
        return isCPTemplateValidatedC;
    }

    /**
     * Sets the value of the is_CP_Template_Validated__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIs_CP_Template_Validated__C(Boolean value) {
        this.isCPTemplateValidatedC = value;
    }

    /**
     * Gets the value of the is_SSO_Template__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIs_SSO_Template__C() {
        return isSSOTemplateC;
    }

    /**
     * Sets the value of the is_SSO_Template__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIs_SSO_Template__C(Boolean value) {
        this.isSSOTemplateC = value;
    }

    /**
     * Gets the value of the ist_Communication_Or_Drop_In__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIst_Communication_Or_Drop_In__C() {
        return istCommunicationOrDropInC;
    }

    /**
     * Sets the value of the ist_Communication_Or_Drop_In__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIst_Communication_Or_Drop_In__C(XMLGregorianCalendar value) {
        this.istCommunicationOrDropInC = value;
    }

    /**
     * Gets the value of the kenTest2Process__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getKenTest2Process__R() {
        return kenTest2ProcessR;
    }

    /**
     * Sets the value of the kenTest2Process__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setKenTest2Process__R(QueryResult value) {
        this.kenTest2ProcessR = value;
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
     * Gets the value of the last_Imp_Query_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLast_Imp_Query_Date__C() {
        return lastImpQueryDateC;
    }

    /**
     * Sets the value of the last_Imp_Query_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLast_Imp_Query_Date__C(XMLGregorianCalendar value) {
        this.lastImpQueryDateC = value;
    }

    /**
     * Gets the value of the last_Print_Preview_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLast_Print_Preview_Date__C() {
        return lastPrintPreviewDateC;
    }

    /**
     * Sets the value of the last_Print_Preview_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLast_Print_Preview_Date__C(XMLGregorianCalendar value) {
        this.lastPrintPreviewDateC = value;
    }

    /**
     * Gets the value of the leadNotes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadNotes__C() {
        return leadNotesC;
    }

    /**
     * Sets the value of the leadNotes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadNotes__C(String value) {
        this.leadNotesC = value;
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
     * Gets the value of the lead_Source_Detail__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLead_Source_Detail__C() {
        return leadSourceDetailC;
    }

    /**
     * Sets the value of the lead_Source_Detail__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLead_Source_Detail__C(String value) {
        this.leadSourceDetailC = value;
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
     * Gets the value of the learning_Series__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLearning_Series__C() {
        return learningSeriesC;
    }

    /**
     * Sets the value of the learning_Series__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLearning_Series__C(Boolean value) {
        this.learningSeriesC = value;
    }

    /**
     * Gets the value of the lega__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLega__C() {
        return legaC;
    }

    /**
     * Sets the value of the lega__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLega__C(String value) {
        this.legaC = value;
    }

    /**
     * Gets the value of the legacy_Opportunity_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacy_Opportunity_ID__C() {
        return legacyOpportunityIDC;
    }

    /**
     * Sets the value of the legacy_Opportunity_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacy_Opportunity_ID__C(String value) {
        this.legacyOpportunityIDC = value;
    }

    /**
     * Gets the value of the legacy_PH_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacy_PH_Code__C() {
        return legacyPHCodeC;
    }

    /**
     * Sets the value of the legacy_PH_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacy_PH_Code__C(String value) {
        this.legacyPHCodeC = value;
    }

    /**
     * Gets the value of the licenseFee__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLicenseFee__C() {
        return licenseFeeC;
    }

    /**
     * Sets the value of the licenseFee__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLicenseFee__C(Double value) {
        this.licenseFeeC = value;
    }

    /**
     * Gets the value of the likelihood_Expected_Revenue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLikelihood_Expected_Revenue__C() {
        return likelihoodExpectedRevenueC;
    }

    /**
     * Sets the value of the likelihood_Expected_Revenue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLikelihood_Expected_Revenue__C(Double value) {
        this.likelihoodExpectedRevenueC = value;
    }

    /**
     * Gets the value of the likelihood__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLikelihood__C() {
        return likelihoodC;
    }

    /**
     * Sets the value of the likelihood__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLikelihood__C(Double value) {
        this.likelihoodC = value;
    }

    /**
     * Gets the value of the lock__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLock__C() {
        return lockC;
    }

    /**
     * Sets the value of the lock__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLock__C(Boolean value) {
        this.lockC = value;
    }

    /**
     * Gets the value of the lost_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLost_Amount__C() {
        return lostAmountC;
    }

    /**
     * Sets the value of the lost_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLost_Amount__C(Double value) {
        this.lostAmountC = value;
    }

    /**
     * Gets the value of the lost_To_Details__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLost_To_Details__C() {
        return lostToDetailsC;
    }

    /**
     * Sets the value of the lost_To_Details__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLost_To_Details__C(String value) {
        this.lostToDetailsC = value;
    }

    /**
     * Gets the value of the lost_To__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLost_To__C() {
        return lostToC;
    }

    /**
     * Sets the value of the lost_To__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLost_To__C(String value) {
        this.lostToC = value;
    }

    /**
     * Gets the value of the lost__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLost__C() {
        return lostC;
    }

    /**
     * Sets the value of the lost__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLost__C(Double value) {
        this.lostC = value;
    }

    /**
     * Gets the value of the low_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLow_Amount__C() {
        return lowAmountC;
    }

    /**
     * Sets the value of the low_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLow_Amount__C(Double value) {
        this.lowAmountC = value;
    }

    /**
     * Gets the value of the mcd_Auto_Calculate_Quantity__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMCD_Auto_Calculate_Quantity__C() {
        return mcdAutoCalculateQuantityC;
    }

    /**
     * Sets the value of the mcd_Auto_Calculate_Quantity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMCD_Auto_Calculate_Quantity__C(Boolean value) {
        this.mcdAutoCalculateQuantityC = value;
    }

    /**
     * Gets the value of the mcd_Sample_Reason__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCD_Sample_Reason__C() {
        return mcdSampleReasonC;
    }

    /**
     * Sets the value of the mcd_Sample_Reason__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCD_Sample_Reason__C(String value) {
        this.mcdSampleReasonC = value;
    }

    /**
     * Gets the value of the manager_Approval_Line_Item_Count__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getManager_Approval_Line_Item_Count__C() {
        return managerApprovalLineItemCountC;
    }

    /**
     * Sets the value of the manager_Approval_Line_Item_Count__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setManager_Approval_Line_Item_Count__C(Double value) {
        this.managerApprovalLineItemCountC = value;
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
     * Gets the value of the market_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarket_Type__C() {
        return marketTypeC;
    }

    /**
     * Sets the value of the market_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarket_Type__C(String value) {
        this.marketTypeC = value;
    }

    /**
     * Gets the value of the mass_Create_Processing_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMass_Create_Processing_Status__C() {
        return massCreateProcessingStatusC;
    }

    /**
     * Sets the value of the mass_Create_Processing_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMass_Create_Processing_Status__C(String value) {
        this.massCreateProcessingStatusC = value;
    }

    /**
     * Gets the value of the mass_Create_Sample_Order_Template__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMass_Create_Sample_Order_Template__C() {
        return massCreateSampleOrderTemplateC;
    }

    /**
     * Sets the value of the mass_Create_Sample_Order_Template__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMass_Create_Sample_Order_Template__C(Boolean value) {
        this.massCreateSampleOrderTemplateC = value;
    }

    /**
     * Gets the value of the mass_Create_Template__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMass_Create_Template__C() {
        return massCreateTemplateC;
    }

    /**
     * Sets the value of the mass_Create_Template__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMass_Create_Template__C(Boolean value) {
        this.massCreateTemplateC = value;
    }

    /**
     * Gets the value of the max_Ratio__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMax_Ratio__C() {
        return maxRatioC;
    }

    /**
     * Sets the value of the max_Ratio__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMax_Ratio__C(Double value) {
        this.maxRatioC = value;
    }

    /**
     * Gets the value of the module_Benchmark__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModule_Benchmark__C() {
        return moduleBenchmarkC;
    }

    /**
     * Sets the value of the module_Benchmark__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModule_Benchmark__C(Boolean value) {
        this.moduleBenchmarkC = value;
    }

    /**
     * Gets the value of the module_Curriculum_Mgmt__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModule_Curriculum_Mgmt__C() {
        return moduleCurriculumMgmtC;
    }

    /**
     * Sets the value of the module_Curriculum_Mgmt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModule_Curriculum_Mgmt__C(Boolean value) {
        this.moduleCurriculumMgmtC = value;
    }

    /**
     * Gets the value of the module_State_Analysis__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModule_State_Analysis__C() {
        return moduleStateAnalysisC;
    }

    /**
     * Sets the value of the module_State_Analysis__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModule_State_Analysis__C(Boolean value) {
        this.moduleStateAnalysisC = value;
    }

    /**
     * Gets the value of the module_Teacher_Tools__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModule_Teacher_Tools__C() {
        return moduleTeacherToolsC;
    }

    /**
     * Sets the value of the module_Teacher_Tools__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModule_Teacher_Tools__C(Boolean value) {
        this.moduleTeacherToolsC = value;
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
     * Gets the value of the new_Form_Scoring_Options__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNew_Form_Scoring_Options__C() {
        return newFormScoringOptionsC;
    }

    /**
     * Sets the value of the new_Form_Scoring_Options__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNew_Form_Scoring_Options__C(String value) {
        this.newFormScoringOptionsC = value;
    }

    /**
     * Gets the value of the no_Friday_Delivery__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNo_Friday_Delivery__C() {
        return noFridayDeliveryC;
    }

    /**
     * Sets the value of the no_Friday_Delivery__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNo_Friday_Delivery__C(Boolean value) {
        this.noFridayDeliveryC = value;
    }

    /**
     * Gets the value of the not_Int__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNot_Int__C() {
        return notIntC;
    }

    /**
     * Sets the value of the not_Int__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNot_Int__C(String value) {
        this.notIntC = value;
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
     * Gets the value of the number_Of_Consultant_Days__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumber_Of_Consultant_Days__C() {
        return numberOfConsultantDaysC;
    }

    /**
     * Sets the value of the number_Of_Consultant_Days__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumber_Of_Consultant_Days__C(Double value) {
        this.numberOfConsultantDaysC = value;
    }

    /**
     * Gets the value of the number_Of_Imp_Days_Rate__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumber_Of_Imp_Days_Rate__C() {
        return numberOfImpDaysRateC;
    }

    /**
     * Sets the value of the number_Of_Imp_Days_Rate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumber_Of_Imp_Days_Rate__C(Double value) {
        this.numberOfImpDaysRateC = value;
    }

    /**
     * Gets the value of the number_Of_Meetings__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumber_Of_Meetings__C() {
        return numberOfMeetingsC;
    }

    /**
     * Sets the value of the number_Of_Meetings__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumber_Of_Meetings__C(Double value) {
        this.numberOfMeetingsC = value;
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
     * Gets the value of the open_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpen_Amount__C() {
        return openAmountC;
    }

    /**
     * Sets the value of the open_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpen_Amount__C(Double value) {
        this.openAmountC = value;
    }

    /**
     * Gets the value of the open__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpen__C() {
        return openC;
    }

    /**
     * Sets the value of the open__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpen__C(Double value) {
        this.openC = value;
    }

    /**
     * Gets the value of the opp_Owner_S_Manager__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpp_Owner_S_Manager__C() {
        return oppOwnerSManagerC;
    }

    /**
     * Sets the value of the opp_Owner_S_Manager__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpp_Owner_S_Manager__C(String value) {
        this.oppOwnerSManagerC = value;
    }

    /**
     * Gets the value of the opportunityCompetitors property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpportunityCompetitors() {
        return opportunityCompetitors;
    }

    /**
     * Sets the value of the opportunityCompetitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpportunityCompetitors(QueryResult value) {
        this.opportunityCompetitors = value;
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
     * Gets the value of the opportunityHistories property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpportunityHistories() {
        return opportunityHistories;
    }

    /**
     * Sets the value of the opportunityHistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpportunityHistories(QueryResult value) {
        this.opportunityHistories = value;
    }

    /**
     * Gets the value of the opportunityLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpportunityLineItems() {
        return opportunityLineItems;
    }

    /**
     * Sets the value of the opportunityLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpportunityLineItems(QueryResult value) {
        this.opportunityLineItems = value;
    }

    /**
     * Gets the value of the opportunityPartnersFrom property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpportunityPartnersFrom() {
        return opportunityPartnersFrom;
    }

    /**
     * Sets the value of the opportunityPartnersFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpportunityPartnersFrom(QueryResult value) {
        this.opportunityPartnersFrom = value;
    }

    /**
     * Gets the value of the opportunityTeamMembers property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpportunityTeamMembers() {
        return opportunityTeamMembers;
    }

    /**
     * Sets the value of the opportunityTeamMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpportunityTeamMembers(QueryResult value) {
        this.opportunityTeamMembers = value;
    }

    /**
     * Gets the value of the opportunity_Duration__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpportunity_Duration__C() {
        return opportunityDurationC;
    }

    /**
     * Sets the value of the opportunity_Duration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpportunity_Duration__C(Double value) {
        this.opportunityDurationC = value;
    }

    /**
     * Gets the value of the opportunity_Line_Item_Links1__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpportunity_Line_Item_Links1__R() {
        return opportunityLineItemLinks1R;
    }

    /**
     * Sets the value of the opportunity_Line_Item_Links1__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpportunity_Line_Item_Links1__R(QueryResult value) {
        this.opportunityLineItemLinks1R = value;
    }

    /**
     * Gets the value of the opportunity_Line_Item_Links__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getOpportunity_Line_Item_Links__R() {
        return opportunityLineItemLinksR;
    }

    /**
     * Sets the value of the opportunity_Line_Item_Links__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setOpportunity_Line_Item_Links__R(QueryResult value) {
        this.opportunityLineItemLinksR = value;
    }

    /**
     * Gets the value of the opportunity_Market_Override__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpportunity_Market_Override__C() {
        return opportunityMarketOverrideC;
    }

    /**
     * Sets the value of the opportunity_Market_Override__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpportunity_Market_Override__C(Boolean value) {
        this.opportunityMarketOverrideC = value;
    }

    /**
     * Gets the value of the opportunity_Market__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunity_Market__C() {
        return opportunityMarketC;
    }

    /**
     * Sets the value of the opportunity_Market__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunity_Market__C(String value) {
        this.opportunityMarketC = value;
    }

    /**
     * Gets the value of the opportunity_Priority__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunity_Priority__C() {
        return opportunityPriorityC;
    }

    /**
     * Sets the value of the opportunity_Priority__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunity_Priority__C(String value) {
        this.opportunityPriorityC = value;
    }

    /**
     * Gets the value of the opportunity_School_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunity_School_Type__C() {
        return opportunitySchoolTypeC;
    }

    /**
     * Sets the value of the opportunity_School_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunity_School_Type__C(String value) {
        this.opportunitySchoolTypeC = value;
    }

    /**
     * Gets the value of the opportunity_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunity_Status__C() {
        return opportunityStatusC;
    }

    /**
     * Sets the value of the opportunity_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunity_Status__C(String value) {
        this.opportunityStatusC = value;
    }

    /**
     * Gets the value of the opportunity_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunity_Type__C() {
        return opportunityTypeC;
    }

    /**
     * Sets the value of the opportunity_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunity_Type__C(String value) {
        this.opportunityTypeC = value;
    }

    /**
     * Gets the value of the opptyProductID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpptyProductID__C() {
        return opptyProductIDC;
    }

    /**
     * Sets the value of the opptyProductID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpptyProductID__C(String value) {
        this.opptyProductIDC = value;
    }

    /**
     * Gets the value of the order_Reason_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder_Reason_Code__C() {
        return orderReasonCodeC;
    }

    /**
     * Sets the value of the order_Reason_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder_Reason_Code__C(String value) {
        this.orderReasonCodeC = value;
    }

    /**
     * Gets the value of the order_Status_Last_Update_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrder_Status_Last_Update_Date__C() {
        return orderStatusLastUpdateDateC;
    }

    /**
     * Sets the value of the order_Status_Last_Update_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrder_Status_Last_Update_Date__C(XMLGregorianCalendar value) {
        this.orderStatusLastUpdateDateC = value;
    }

    /**
     * Gets the value of the order_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder_Status__C() {
        return orderStatusC;
    }

    /**
     * Sets the value of the order_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder_Status__C(String value) {
        this.orderStatusC = value;
    }

    /**
     * Gets the value of the ordered_By__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdered_By__C() {
        return orderedByC;
    }

    /**
     * Sets the value of the ordered_By__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdered_By__C(String value) {
        this.orderedByC = value;
    }

    /**
     * Gets the value of the ordered_By__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getOrdered_By__R() {
        return orderedByR;
    }

    /**
     * Sets the value of the ordered_By__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setOrdered_By__R(UserType value) {
        this.orderedByR = value;
    }

    /**
     * Gets the value of the original_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOriginal_Amount__C() {
        return originalAmountC;
    }

    /**
     * Sets the value of the original_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOriginal_Amount__C(Double value) {
        this.originalAmountC = value;
    }

    /**
     * Gets the value of the original_Purchase_Order__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginal_Purchase_Order__C() {
        return originalPurchaseOrderC;
    }

    /**
     * Sets the value of the original_Purchase_Order__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginal_Purchase_Order__C(String value) {
        this.originalPurchaseOrderC = value;
    }

    /**
     * Gets the value of the other__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOther__C() {
        return otherC;
    }

    /**
     * Sets the value of the other__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOther__C(Double value) {
        this.otherC = value;
    }

    /**
     * Gets the value of the outstanding_Training_Days__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOutstanding_Training_Days__C() {
        return outstandingTrainingDaysC;
    }

    /**
     * Sets the value of the outstanding_Training_Days__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOutstanding_Training_Days__C(Double value) {
        this.outstandingTrainingDaysC = value;
    }

    /**
     * Gets the value of the overall_Cost_Ratio__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverall_Cost_Ratio__C() {
        return overallCostRatioC;
    }

    /**
     * Sets the value of the overall_Cost_Ratio__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverall_Cost_Ratio__C(Double value) {
        this.overallCostRatioC = value;
    }

    /**
     * Gets the value of the override_Addr_City__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverride_Addr_City__C() {
        return overrideAddrCityC;
    }

    /**
     * Sets the value of the override_Addr_City__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverride_Addr_City__C(String value) {
        this.overrideAddrCityC = value;
    }

    /**
     * Gets the value of the override_Addr_Country__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverride_Addr_Country__C() {
        return overrideAddrCountryC;
    }

    /**
     * Sets the value of the override_Addr_Country__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverride_Addr_Country__C(String value) {
        this.overrideAddrCountryC = value;
    }

    /**
     * Gets the value of the override_Addr_Line1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverride_Addr_Line1__C() {
        return overrideAddrLine1C;
    }

    /**
     * Sets the value of the override_Addr_Line1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverride_Addr_Line1__C(String value) {
        this.overrideAddrLine1C = value;
    }

    /**
     * Gets the value of the override_Addr_Line2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverride_Addr_Line2__C() {
        return overrideAddrLine2C;
    }

    /**
     * Sets the value of the override_Addr_Line2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverride_Addr_Line2__C(String value) {
        this.overrideAddrLine2C = value;
    }

    /**
     * Gets the value of the override_Addr_Line3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverride_Addr_Line3__C() {
        return overrideAddrLine3C;
    }

    /**
     * Sets the value of the override_Addr_Line3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverride_Addr_Line3__C(String value) {
        this.overrideAddrLine3C = value;
    }

    /**
     * Gets the value of the override_Addr_State_Prov__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverride_Addr_State_Prov__C() {
        return overrideAddrStateProvC;
    }

    /**
     * Sets the value of the override_Addr_State_Prov__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverride_Addr_State_Prov__C(String value) {
        this.overrideAddrStateProvC = value;
    }

    /**
     * Gets the value of the override_Addr_Zipcode__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverride_Addr_Zipcode__C() {
        return overrideAddrZipcodeC;
    }

    /**
     * Sets the value of the override_Addr_Zipcode__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverride_Addr_Zipcode__C(String value) {
        this.overrideAddrZipcodeC = value;
    }

    /**
     * Gets the value of the override_Sales_Rep_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverride_Sales_Rep_ID__C() {
        return overrideSalesRepIDC;
    }

    /**
     * Sets the value of the override_Sales_Rep_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverride_Sales_Rep_ID__C(String value) {
        this.overrideSalesRepIDC = value;
    }

    /**
     * Gets the value of the override_Sales_Rep_ID_Del__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverride_Sales_Rep_ID_Del__C() {
        return overrideSalesRepIDDelC;
    }

    /**
     * Sets the value of the override_Sales_Rep_ID_Del__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverride_Sales_Rep_ID_Del__C(String value) {
        this.overrideSalesRepIDDelC = value;
    }

    /**
     * Gets the value of the override_Shipping_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverride_Shipping_Amount__C() {
        return overrideShippingAmountC;
    }

    /**
     * Sets the value of the override_Shipping_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverride_Shipping_Amount__C(Double value) {
        this.overrideShippingAmountC = value;
    }

    /**
     * Gets the value of the override_Shipping_Percent__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverride_Shipping_Percent__C() {
        return overrideShippingPercentC;
    }

    /**
     * Sets the value of the override_Shipping_Percent__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverride_Shipping_Percent__C(Double value) {
        this.overrideShippingPercentC = value;
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
     * Gets the value of the owner_Email__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner_Email__C() {
        return ownerEmailC;
    }

    /**
     * Sets the value of the owner_Email__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner_Email__C(String value) {
        this.ownerEmailC = value;
    }

    /**
     * Gets the value of the owner_Implementation_Approval_Budget_PCT__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOwner_Implementation_Approval_Budget_PCT__C() {
        return ownerImplementationApprovalBudgetPCTC;
    }

    /**
     * Sets the value of the owner_Implementation_Approval_Budget_PCT__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOwner_Implementation_Approval_Budget_PCT__C(Double value) {
        this.ownerImplementationApprovalBudgetPCTC = value;
    }

    /**
     * Gets the value of the owner_Implementation_Budget__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOwner_Implementation_Budget__C() {
        return ownerImplementationBudgetC;
    }

    /**
     * Sets the value of the owner_Implementation_Budget__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOwner_Implementation_Budget__C(Double value) {
        this.ownerImplementationBudgetC = value;
    }

    /**
     * Gets the value of the owner_Market__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner_Market__C() {
        return ownerMarketC;
    }

    /**
     * Sets the value of the owner_Market__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner_Market__C(String value) {
        this.ownerMarketC = value;
    }

    /**
     * Gets the value of the owner_Max_Ratio__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOwner_Max_Ratio__C() {
        return ownerMaxRatioC;
    }

    /**
     * Sets the value of the owner_Max_Ratio__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOwner_Max_Ratio__C(Double value) {
        this.ownerMaxRatioC = value;
    }

    /**
     * Gets the value of the owner_Mobile__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner_Mobile__C() {
        return ownerMobileC;
    }

    /**
     * Sets the value of the owner_Mobile__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner_Mobile__C(String value) {
        this.ownerMobileC = value;
    }

    /**
     * Gets the value of the owner_Phone__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner_Phone__C() {
        return ownerPhoneC;
    }

    /**
     * Sets the value of the owner_Phone__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner_Phone__C(String value) {
        this.ownerPhoneC = value;
    }

    /**
     * Gets the value of the owner_Pilot_Approval_Budget_PCT__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOwner_Pilot_Approval_Budget_PCT__C() {
        return ownerPilotApprovalBudgetPCTC;
    }

    /**
     * Sets the value of the owner_Pilot_Approval_Budget_PCT__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOwner_Pilot_Approval_Budget_PCT__C(Double value) {
        this.ownerPilotApprovalBudgetPCTC = value;
    }

    /**
     * Gets the value of the owner_Pilot_Budget__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOwner_Pilot_Budget__C() {
        return ownerPilotBudgetC;
    }

    /**
     * Sets the value of the owner_Pilot_Budget__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOwner_Pilot_Budget__C(Double value) {
        this.ownerPilotBudgetC = value;
    }

    /**
     * Gets the value of the owner_Region__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner_Region__C() {
        return ownerRegionC;
    }

    /**
     * Sets the value of the owner_Region__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner_Region__C(String value) {
        this.ownerRegionC = value;
    }

    /**
     * Gets the value of the owner_Sample_Approval_Budget_PCT__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOwner_Sample_Approval_Budget_PCT__C() {
        return ownerSampleApprovalBudgetPCTC;
    }

    /**
     * Sets the value of the owner_Sample_Approval_Budget_PCT__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOwner_Sample_Approval_Budget_PCT__C(Double value) {
        this.ownerSampleApprovalBudgetPCTC = value;
    }

    /**
     * Gets the value of the owner_Sample_Budget__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOwner_Sample_Budget__C() {
        return ownerSampleBudgetC;
    }

    /**
     * Sets the value of the owner_Sample_Budget__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOwner_Sample_Budget__C(Double value) {
        this.ownerSampleBudgetC = value;
    }

    /**
     * Gets the value of the owner_S_Manager__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner_S_Manager__C() {
        return ownerSManagerC;
    }

    /**
     * Sets the value of the owner_S_Manager__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner_S_Manager__C(String value) {
        this.ownerSManagerC = value;
    }

    /**
     * Gets the value of the owner_S_Manager__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getOwner_S_Manager__R() {
        return ownerSManagerR;
    }

    /**
     * Sets the value of the owner_S_Manager__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setOwner_S_Manager__R(UserType value) {
        this.ownerSManagerR = value;
    }

    /**
     * Gets the value of the owner_S_Manager_S_Manager__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner_S_Manager_S_Manager__C() {
        return ownerSManagerSManagerC;
    }

    /**
     * Sets the value of the owner_S_Manager_S_Manager__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner_S_Manager_S_Manager__C(String value) {
        this.ownerSManagerSManagerC = value;
    }

    /**
     * Gets the value of the owner_S_Manager_S_Manager__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getOwner_S_Manager_S_Manager__R() {
        return ownerSManagerSManagerR;
    }

    /**
     * Sets the value of the owner_S_Manager_S_Manager__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setOwner_S_Manager_S_Manager__R(UserType value) {
        this.ownerSManagerSManagerR = value;
    }

    /**
     * Gets the value of the pd_Addendum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPD_Addendum__C() {
        return pdAddendumC;
    }

    /**
     * Sets the value of the pd_Addendum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPD_Addendum__C(Boolean value) {
        this.pdAddendumC = value;
    }

    /**
     * Gets the value of the pd_Product_Line_Item_Count__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPD_Product_Line_Item_Count__C() {
        return pdProductLineItemCountC;
    }

    /**
     * Sets the value of the pd_Product_Line_Item_Count__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPD_Product_Line_Item_Count__C(Double value) {
        this.pdProductLineItemCountC = value;
    }

    /**
     * Gets the value of the phl1_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHL1_Code__C() {
        return phl1CodeC;
    }

    /**
     * Sets the value of the phl1_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHL1_Code__C(String value) {
        this.phl1CodeC = value;
    }

    /**
     * Gets the value of the phl1_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHL1_Description__C() {
        return phl1DescriptionC;
    }

    /**
     * Sets the value of the phl1_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHL1_Description__C(String value) {
        this.phl1DescriptionC = value;
    }

    /**
     * Gets the value of the phl2_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHL2_Code__C() {
        return phl2CodeC;
    }

    /**
     * Sets the value of the phl2_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHL2_Code__C(String value) {
        this.phl2CodeC = value;
    }

    /**
     * Gets the value of the phl2_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHL2_Description__C() {
        return phl2DescriptionC;
    }

    /**
     * Sets the value of the phl2_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHL2_Description__C(String value) {
        this.phl2DescriptionC = value;
    }

    /**
     * Gets the value of the phl3_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHL3_Code__C() {
        return phl3CodeC;
    }

    /**
     * Sets the value of the phl3_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHL3_Code__C(String value) {
        this.phl3CodeC = value;
    }

    /**
     * Gets the value of the phl3_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHL3_Description__C() {
        return phl3DescriptionC;
    }

    /**
     * Sets the value of the phl3_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHL3_Description__C(String value) {
        this.phl3DescriptionC = value;
    }

    /**
     * Gets the value of the phl4_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHL4_Code__C() {
        return phl4CodeC;
    }

    /**
     * Sets the value of the phl4_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHL4_Code__C(String value) {
        this.phl4CodeC = value;
    }

    /**
     * Gets the value of the phl4_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHL4_Description__C() {
        return phl4DescriptionC;
    }

    /**
     * Sets the value of the phl4_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHL4_Description__C(String value) {
        this.phl4DescriptionC = value;
    }

    /**
     * Gets the value of the phl5_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHL5_Code__C() {
        return phl5CodeC;
    }

    /**
     * Sets the value of the phl5_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHL5_Code__C(String value) {
        this.phl5CodeC = value;
    }

    /**
     * Gets the value of the phl5_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHL5_Description__C() {
        return phl5DescriptionC;
    }

    /**
     * Sets the value of the phl5_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHL5_Description__C(String value) {
        this.phl5DescriptionC = value;
    }

    /**
     * Gets the value of the ph_Full_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPH_Full_Code__C() {
        return phFullCodeC;
    }

    /**
     * Sets the value of the ph_Full_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPH_Full_Code__C(String value) {
        this.phFullCodeC = value;
    }

    /**
     * Gets the value of the pid_Customer_Mode__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPID_Customer_Mode__C() {
        return pidCustomerModeC;
    }

    /**
     * Sets the value of the pid_Customer_Mode__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPID_Customer_Mode__C(Boolean value) {
        this.pidCustomerModeC = value;
    }

    /**
     * Gets the value of the pid_Based_Ship_To_Customer_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPID_Based_Ship_To_Customer_ID__C() {
        return pidBasedShipToCustomerIDC;
    }

    /**
     * Sets the value of the pid_Based_Ship_To_Customer_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPID_Based_Ship_To_Customer_ID__C(String value) {
        this.pidBasedShipToCustomerIDC = value;
    }

    /**
     * Gets the value of the pid_Based_Sold_To_Customer_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPID_Based_Sold_To_Customer_ID__C() {
        return pidBasedSoldToCustomerIDC;
    }

    /**
     * Sets the value of the pid_Based_Sold_To_Customer_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPID_Based_Sold_To_Customer_ID__C(String value) {
        this.pidBasedSoldToCustomerIDC = value;
    }

    /**
     * Gets the value of the plof__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPLOF__C() {
        return plofC;
    }

    /**
     * Sets the value of the plof__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPLOF__C(Boolean value) {
        this.plofC = value;
    }

    /**
     * Gets the value of the po_Dollar_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPO_Dollar_Amount__C() {
        return poDollarAmountC;
    }

    /**
     * Sets the value of the po_Dollar_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPO_Dollar_Amount__C(Double value) {
        this.poDollarAmountC = value;
    }

    /**
     * Gets the value of the po_Expected_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPO_Expected_Date__C() {
        return poExpectedDateC;
    }

    /**
     * Sets the value of the po_Expected_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPO_Expected_Date__C(XMLGregorianCalendar value) {
        this.poExpectedDateC = value;
    }

    /**
     * Gets the value of the po_REQUIRED__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPO_REQUIRED__C() {
        return poREQUIREDC;
    }

    /**
     * Sets the value of the po_REQUIRED__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPO_REQUIRED__C(String value) {
        this.poREQUIREDC = value;
    }

    /**
     * Gets the value of the po_Received__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPO_Received__C() {
        return poReceivedC;
    }

    /**
     * Sets the value of the po_Received__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPO_Received__C(String value) {
        this.poReceivedC = value;
    }

    /**
     * Gets the value of the po__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPO__C() {
        return poC;
    }

    /**
     * Sets the value of the po__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPO__C(String value) {
        this.poC = value;
    }

    /**
     * Gets the value of the pack_By__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPack_By__C() {
        return packByC;
    }

    /**
     * Sets the value of the pack_By__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPack_By__C(String value) {
        this.packByC = value;
    }

    /**
     * Gets the value of the page_Break_By_Grade__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPage_Break_By_Grade__C() {
        return pageBreakByGradeC;
    }

    /**
     * Sets the value of the page_Break_By_Grade__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPage_Break_By_Grade__C(Boolean value) {
        this.pageBreakByGradeC = value;
    }

    /**
     * Gets the value of the parentView__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentView__C() {
        return parentViewC;
    }

    /**
     * Sets the value of the parentView__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentView__C(String value) {
        this.parentViewC = value;
    }

    /**
     * Gets the value of the partners property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getPartners() {
        return partners;
    }

    /**
     * Sets the value of the partners property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setPartners(QueryResult value) {
        this.partners = value;
    }

    /**
     * Gets the value of the pending_Order__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPending_Order__C() {
        return pendingOrderC;
    }

    /**
     * Sets the value of the pending_Order__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPending_Order__C(String value) {
        this.pendingOrderC = value;
    }

    /**
     * Gets the value of the pilot_End_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPilot_End_Date__C() {
        return pilotEndDateC;
    }

    /**
     * Sets the value of the pilot_End_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPilot_End_Date__C(XMLGregorianCalendar value) {
        this.pilotEndDateC = value;
    }

    /**
     * Gets the value of the pilot_Funding_Type_Sale_Gratis__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPilot_Funding_Type_Sale_Gratis__C() {
        return pilotFundingTypeSaleGratisC;
    }

    /**
     * Sets the value of the pilot_Funding_Type_Sale_Gratis__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPilot_Funding_Type_Sale_Gratis__C(String value) {
        this.pilotFundingTypeSaleGratisC = value;
    }

    /**
     * Gets the value of the pilot_Rationale__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPilot_Rationale__C() {
        return pilotRationaleC;
    }

    /**
     * Sets the value of the pilot_Rationale__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPilot_Rationale__C(String value) {
        this.pilotRationaleC = value;
    }

    /**
     * Gets the value of the pilot_Start_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPilot_Start_Date__C() {
        return pilotStartDateC;
    }

    /**
     * Sets the value of the pilot_Start_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPilot_Start_Date__C(XMLGregorianCalendar value) {
        this.pilotStartDateC = value;
    }

    /**
     * Gets the value of the planningFees__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPlanningFees__C() {
        return planningFeesC;
    }

    /**
     * Sets the value of the planningFees__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPlanningFees__C(Double value) {
        this.planningFeesC = value;
    }

    /**
     * Gets the value of the position__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition__C() {
        return positionC;
    }

    /**
     * Sets the value of the position__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition__C(String value) {
        this.positionC = value;
    }

    /**
     * Gets the value of the postponed_Cancelled_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPostponed_Cancelled_Amount__C() {
        return postponedCancelledAmountC;
    }

    /**
     * Sets the value of the postponed_Cancelled_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPostponed_Cancelled_Amount__C(Double value) {
        this.postponedCancelledAmountC = value;
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
     * Gets the value of the pricePerStudent__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPricePerStudent__C() {
        return pricePerStudentC;
    }

    /**
     * Sets the value of the pricePerStudent__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPricePerStudent__C(Double value) {
        this.pricePerStudentC = value;
    }

    /**
     * Gets the value of the price_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrice_Date__C() {
        return priceDateC;
    }

    /**
     * Sets the value of the price_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrice_Date__C(XMLGregorianCalendar value) {
        this.priceDateC = value;
    }

    /**
     * Gets the value of the pricebook2 property.
     * 
     * @return
     *     possible object is
     *     {@link Pricebook2Type }
     *     
     */
    public Pricebook2Type getPricebook2() {
        return pricebook2;
    }

    /**
     * Sets the value of the pricebook2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pricebook2Type }
     *     
     */
    public void setPricebook2(Pricebook2Type value) {
        this.pricebook2 = value;
    }

    /**
     * Gets the value of the pricebook2Id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricebook2Id() {
        return pricebook2Id;
    }

    /**
     * Sets the value of the pricebook2Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricebook2Id(String value) {
        this.pricebook2Id = value;
    }

    /**
     * Gets the value of the print_Owner_Name_Email_On_Cover_Page__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrint_Owner_Name_Email_On_Cover_Page__C() {
        return printOwnerNameEmailOnCoverPageC;
    }

    /**
     * Sets the value of the print_Owner_Name_Email_On_Cover_Page__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrint_Owner_Name_Email_On_Cover_Page__C(Boolean value) {
        this.printOwnerNameEmailOnCoverPageC = value;
    }

    /**
     * Gets the value of the print_Shipping__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrint_Shipping__C() {
        return printShippingC;
    }

    /**
     * Sets the value of the print_Shipping__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrint_Shipping__C(Boolean value) {
        this.printShippingC = value;
    }

    /**
     * Gets the value of the print_Signature_Line__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrint_Signature_Line__C() {
        return printSignatureLineC;
    }

    /**
     * Sets the value of the print_Signature_Line__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrint_Signature_Line__C(Boolean value) {
        this.printSignatureLineC = value;
    }

    /**
     * Gets the value of the print_Tax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrint_Tax__C() {
        return printTaxC;
    }

    /**
     * Sets the value of the print_Tax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrint_Tax__C(Boolean value) {
        this.printTaxC = value;
    }

    /**
     * Gets the value of the probability property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProbability() {
        return probability;
    }

    /**
     * Sets the value of the probability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProbability(Double value) {
        this.probability = value;
    }

    /**
     * Gets the value of the probability__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProbability__C() {
        return probabilityC;
    }

    /**
     * Sets the value of the probability__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProbability__C(Double value) {
        this.probabilityC = value;
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
     * Gets the value of the product_Hierarchy_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct_Hierarchy_ID__C() {
        return productHierarchyIDC;
    }

    /**
     * Sets the value of the product_Hierarchy_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct_Hierarchy_ID__C(String value) {
        this.productHierarchyIDC = value;
    }

    /**
     * Gets the value of the product_Summary__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct_Summary__C() {
        return productSummaryC;
    }

    /**
     * Sets the value of the product_Summary__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct_Summary__C(String value) {
        this.productSummaryC = value;
    }

    /**
     * Gets the value of the professional_Devmt__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessional_Devmt__C() {
        return professionalDevmtC;
    }

    /**
     * Sets the value of the professional_Devmt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessional_Devmt__C(String value) {
        this.professionalDevmtC = value;
    }

    /**
     * Gets the value of the program_Type_Skills_Tutor__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgram_Type_Skills_Tutor__C() {
        return programTypeSkillsTutorC;
    }

    /**
     * Sets the value of the program_Type_Skills_Tutor__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgram_Type_Skills_Tutor__C(String value) {
        this.programTypeSkillsTutorC = value;
    }

    /**
     * Gets the value of the program_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgram_Type__C() {
        return programTypeC;
    }

    /**
     * Sets the value of the program_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgram_Type__C(String value) {
        this.programTypeC = value;
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
     * Gets the value of the promo_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromo_Code__C() {
        return promoCodeC;
    }

    /**
     * Sets the value of the promo_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromo_Code__C(String value) {
        this.promoCodeC = value;
    }

    /**
     * Gets the value of the promotion__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotion__C() {
        return promotionC;
    }

    /**
     * Sets the value of the promotion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotion__C(String value) {
        this.promotionC = value;
    }

    /**
     * Gets the value of the proposal_Customer_PO_Customer_PO__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getProposal_Customer_PO_Customer_PO__R() {
        return proposalCustomerPOCustomerPOR;
    }

    /**
     * Sets the value of the proposal_Customer_PO_Customer_PO__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setProposal_Customer_PO_Customer_PO__R(QueryResult value) {
        this.proposalCustomerPOCustomerPOR = value;
    }

    /**
     * Gets the value of the proposal_Customer_PO_Links_Proposal_ID__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getProposal_Customer_PO_Links_Proposal_ID__R() {
        return proposalCustomerPOLinksProposalIDR;
    }

    /**
     * Sets the value of the proposal_Customer_PO_Links_Proposal_ID__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setProposal_Customer_PO_Links_Proposal_ID__R(QueryResult value) {
        this.proposalCustomerPOLinksProposalIDR = value;
    }

    /**
     * Gets the value of the proposal_Save_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProposal_Save_Date__C() {
        return proposalSaveDateC;
    }

    /**
     * Sets the value of the proposal_Save_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProposal_Save_Date__C(XMLGregorianCalendar value) {
        this.proposalSaveDateC = value;
    }

    /**
     * Gets the value of the proratedterm__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProratedterm__C() {
        return proratedtermC;
    }

    /**
     * Sets the value of the proratedterm__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProratedterm__C(String value) {
        this.proratedtermC = value;
    }

    /**
     * Gets the value of the purchase_Order__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchase_Order__C() {
        return purchaseOrderC;
    }

    /**
     * Sets the value of the purchase_Order__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchase_Order__C(String value) {
        this.purchaseOrderC = value;
    }

    /**
     * Gets the value of the purchase_Year__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchase_Year__C() {
        return purchaseYearC;
    }

    /**
     * Sets the value of the purchase_Year__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchase_Year__C(String value) {
        this.purchaseYearC = value;
    }

    /**
     * Gets the value of the r00NR0000000V4UwMAK__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getR00NR0000000V4UwMAK__R() {
        return r00NR0000000V4UwMAKR;
    }

    /**
     * Sets the value of the r00NR0000000V4UwMAK__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setR00NR0000000V4UwMAK__R(QueryResult value) {
        this.r00NR0000000V4UwMAKR = value;
    }

    /**
     * Gets the value of the r00NR0000000V6VVMAS__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getR00NR0000000V6VVMAS__R() {
        return r00NR0000000V6VVMASR;
    }

    /**
     * Sets the value of the r00NR0000000V6VVMAS__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setR00NR0000000V6VVMAS__R(QueryResult value) {
        this.r00NR0000000V6VVMASR = value;
    }

    /**
     * Gets the value of the r00NS0000000HI7SMAG__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getR00NS0000000HI7SMAG__R() {
        return r00NS0000000HI7SMAGR;
    }

    /**
     * Sets the value of the r00NS0000000HI7SMAG__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setR00NS0000000HI7SMAG__R(QueryResult value) {
        this.r00NS0000000HI7SMAGR = value;
    }

    /**
     * Gets the value of the rfi__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFI__C() {
        return rfiC;
    }

    /**
     * Sets the value of the rfi__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFI__C(String value) {
        this.rfiC = value;
    }

    /**
     * Gets the value of the rfp_Anticipated_Receipt_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRFP_Anticipated_Receipt_Date__C() {
        return rfpAnticipatedReceiptDateC;
    }

    /**
     * Sets the value of the rfp_Anticipated_Receipt_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRFP_Anticipated_Receipt_Date__C(XMLGregorianCalendar value) {
        this.rfpAnticipatedReceiptDateC = value;
    }

    /**
     * Gets the value of the rfp_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFP_Name__C() {
        return rfpNameC;
    }

    /**
     * Sets the value of the rfp_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFP_Name__C(String value) {
        this.rfpNameC = value;
    }

    /**
     * Gets the value of the rfp_Opp_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRFP_Opp_Flag__C() {
        return rfpOppFlagC;
    }

    /**
     * Sets the value of the rfp_Opp_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRFP_Opp_Flag__C(Boolean value) {
        this.rfpOppFlagC = value;
    }

    /**
     * Gets the value of the rfp_Status_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFP_Status_Comments__C() {
        return rfpStatusCommentsC;
    }

    /**
     * Sets the value of the rfp_Status_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFP_Status_Comments__C(String value) {
        this.rfpStatusCommentsC = value;
    }

    /**
     * Gets the value of the rfp_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFP_Status__C() {
        return rfpStatusC;
    }

    /**
     * Sets the value of the rfp_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFP_Status__C(String value) {
        this.rfpStatusC = value;
    }

    /**
     * Gets the value of the rating__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRating__C() {
        return ratingC;
    }

    /**
     * Sets the value of the rating__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRating__C(String value) {
        this.ratingC = value;
    }

    /**
     * Gets the value of the reason_Lost__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_Lost__C() {
        return reasonLostC;
    }

    /**
     * Sets the value of the reason_Lost__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_Lost__C(String value) {
        this.reasonLostC = value;
    }

    /**
     * Gets the value of the reason_Won__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_Won__C() {
        return reasonWonC;
    }

    /**
     * Sets the value of the reason_Won__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_Won__C(String value) {
        this.reasonWonC = value;
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
     * Gets the value of the refresh_WAUC_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefresh_WAUC_Date__C() {
        return refreshWAUCDateC;
    }

    /**
     * Sets the value of the refresh_WAUC_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefresh_WAUC_Date__C(XMLGregorianCalendar value) {
        this.refreshWAUCDateC = value;
    }

    /**
     * Gets the value of the related_Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated_Notes__C() {
        return relatedNotesC;
    }

    /**
     * Sets the value of the related_Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated_Notes__C(String value) {
        this.relatedNotesC = value;
    }

    /**
     * Gets the value of the related_Opp_Subtype__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated_Opp_Subtype__C() {
        return relatedOppSubtypeC;
    }

    /**
     * Sets the value of the related_Opp_Subtype__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated_Opp_Subtype__C(String value) {
        this.relatedOppSubtypeC = value;
    }

    /**
     * Gets the value of the related_Opportunity_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRelated_Opportunity_Amount__C() {
        return relatedOpportunityAmountC;
    }

    /**
     * Sets the value of the related_Opportunity_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRelated_Opportunity_Amount__C(Double value) {
        this.relatedOpportunityAmountC = value;
    }

    /**
     * Gets the value of the related_Opportunity_CP_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated_Opportunity_CP_Status__C() {
        return relatedOpportunityCPStatusC;
    }

    /**
     * Sets the value of the related_Opportunity_CP_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated_Opportunity_CP_Status__C(String value) {
        this.relatedOpportunityCPStatusC = value;
    }

    /**
     * Gets the value of the related_Opportunity_CP_Total_PO_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRelated_Opportunity_CP_Total_PO_Amount__C() {
        return relatedOpportunityCPTotalPOAmountC;
    }

    /**
     * Sets the value of the related_Opportunity_CP_Total_PO_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRelated_Opportunity_CP_Total_PO_Amount__C(Double value) {
        this.relatedOpportunityCPTotalPOAmountC = value;
    }

    /**
     * Gets the value of the related_Opportunity_Record__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated_Opportunity_Record__C() {
        return relatedOpportunityRecordC;
    }

    /**
     * Sets the value of the related_Opportunity_Record__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated_Opportunity_Record__C(String value) {
        this.relatedOpportunityRecordC = value;
    }

    /**
     * Gets the value of the related_Opportunity_Records__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated_Opportunity_Records__C() {
        return relatedOpportunityRecordsC;
    }

    /**
     * Sets the value of the related_Opportunity_Records__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated_Opportunity_Records__C(String value) {
        this.relatedOpportunityRecordsC = value;
    }

    /**
     * Gets the value of the related_Opportunity_Records__R property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityType }
     *     
     */
    public OpportunityType getRelated_Opportunity_Records__R() {
        return relatedOpportunityRecordsR;
    }

    /**
     * Sets the value of the related_Opportunity_Records__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityType }
     *     
     */
    public void setRelated_Opportunity_Records__R(OpportunityType value) {
        this.relatedOpportunityRecordsR = value;
    }

    /**
     * Gets the value of the related_Product_Hierarchy__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated_Product_Hierarchy__C() {
        return relatedProductHierarchyC;
    }

    /**
     * Sets the value of the related_Product_Hierarchy__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated_Product_Hierarchy__C(String value) {
        this.relatedProductHierarchyC = value;
    }

    /**
     * Gets the value of the related_Product_Hierarchy__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product_Hierarchy__CType }
     *     
     */
    public Product_Hierarchy__CType getRelated_Product_Hierarchy__R() {
        return relatedProductHierarchyR;
    }

    /**
     * Sets the value of the related_Product_Hierarchy__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product_Hierarchy__CType }
     *     
     */
    public void setRelated_Product_Hierarchy__R(Product_Hierarchy__CType value) {
        this.relatedProductHierarchyR = value;
    }

    /**
     * Gets the value of the related_ShipTo_Customer__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated_ShipTo_Customer__C() {
        return relatedShipToCustomerC;
    }

    /**
     * Sets the value of the related_ShipTo_Customer__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated_ShipTo_Customer__C(String value) {
        this.relatedShipToCustomerC = value;
    }

    /**
     * Gets the value of the related_ShipTo_Customer__R property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getRelated_ShipTo_Customer__R() {
        return relatedShipToCustomerR;
    }

    /**
     * Sets the value of the related_ShipTo_Customer__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setRelated_ShipTo_Customer__R(AccountType value) {
        this.relatedShipToCustomerR = value;
    }

    /**
     * Gets the value of the related_SoldTo_Customer__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated_SoldTo_Customer__C() {
        return relatedSoldToCustomerC;
    }

    /**
     * Sets the value of the related_SoldTo_Customer__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated_SoldTo_Customer__C(String value) {
        this.relatedSoldToCustomerC = value;
    }

    /**
     * Gets the value of the related_SoldTo_Customer__R property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getRelated_SoldTo_Customer__R() {
        return relatedSoldToCustomerR;
    }

    /**
     * Sets the value of the related_SoldTo_Customer__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setRelated_SoldTo_Customer__R(AccountType value) {
        this.relatedSoldToCustomerR = value;
    }

    /**
     * Gets the value of the related_Template_Opportunity__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated_Template_Opportunity__C() {
        return relatedTemplateOpportunityC;
    }

    /**
     * Sets the value of the related_Template_Opportunity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated_Template_Opportunity__C(String value) {
        this.relatedTemplateOpportunityC = value;
    }

    /**
     * Gets the value of the related_Template_Opportunity__R property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityType }
     *     
     */
    public OpportunityType getRelated_Template_Opportunity__R() {
        return relatedTemplateOpportunityR;
    }

    /**
     * Sets the value of the related_Template_Opportunity__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityType }
     *     
     */
    public void setRelated_Template_Opportunity__R(OpportunityType value) {
        this.relatedTemplateOpportunityR = value;
    }

    /**
     * Gets the value of the release_Line_Item_Notifications__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getRelease_Line_Item_Notifications__R() {
        return releaseLineItemNotificationsR;
    }

    /**
     * Sets the value of the release_Line_Item_Notifications__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setRelease_Line_Item_Notifications__R(QueryResult value) {
        this.releaseLineItemNotificationsR = value;
    }

    /**
     * Gets the value of the reorder_Basis_Used__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReorder_Basis_Used__C() {
        return reorderBasisUsedC;
    }

    /**
     * Sets the value of the reorder_Basis_Used__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReorder_Basis_Used__C(Boolean value) {
        this.reorderBasisUsedC = value;
    }

    /**
     * Gets the value of the requested_Del_Y_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequested_Del_Y_Date__C() {
        return requestedDelYDateC;
    }

    /**
     * Sets the value of the requested_Del_Y_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequested_Del_Y_Date__C(XMLGregorianCalendar value) {
        this.requestedDelYDateC = value;
    }

    /**
     * Gets the value of the research_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResearch_Status__C() {
        return researchStatusC;
    }

    /**
     * Sets the value of the research_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResearch_Status__C(String value) {
        this.researchStatusC = value;
    }

    /**
     * Gets the value of the riverside_PD_Opp_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRiverside_PD_Opp_Flag__C() {
        return riversidePDOppFlagC;
    }

    /**
     * Sets the value of the riverside_PD_Opp_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRiverside_PD_Opp_Flag__C(Boolean value) {
        this.riversidePDOppFlagC = value;
    }

    /**
     * Gets the value of the rosterUpdateperSchool__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRosterUpdateperSchool__C() {
        return rosterUpdateperSchoolC;
    }

    /**
     * Sets the value of the rosterUpdateperSchool__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRosterUpdateperSchool__C(Double value) {
        this.rosterUpdateperSchoolC = value;
    }

    /**
     * Gets the value of the sap_Delivery_Block__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Delivery_Block__C() {
        return sapDeliveryBlockC;
    }

    /**
     * Sets the value of the sap_Delivery_Block__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Delivery_Block__C(String value) {
        this.sapDeliveryBlockC = value;
    }

    /**
     * Gets the value of the sap_Entry_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSAP_Entry_Date__C() {
        return sapEntryDateC;
    }

    /**
     * Sets the value of the sap_Entry_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSAP_Entry_Date__C(XMLGregorianCalendar value) {
        this.sapEntryDateC = value;
    }

    /**
     * Gets the value of the sap_Shipping_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSAP_Shipping_Amount__C() {
        return sapShippingAmountC;
    }

    /**
     * Sets the value of the sap_Shipping_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSAP_Shipping_Amount__C(Double value) {
        this.sapShippingAmountC = value;
    }

    /**
     * Gets the value of the sap_Shipping__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSAP_Shipping__C() {
        return sapShippingC;
    }

    /**
     * Sets the value of the sap_Shipping__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSAP_Shipping__C(Double value) {
        this.sapShippingC = value;
    }

    /**
     * Gets the value of the sch_Auto_Calculate_Quantity__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSCH_Auto_Calculate_Quantity__C() {
        return schAutoCalculateQuantityC;
    }

    /**
     * Sets the value of the sch_Auto_Calculate_Quantity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSCH_Auto_Calculate_Quantity__C(Boolean value) {
        this.schAutoCalculateQuantityC = value;
    }

    /**
     * Gets the value of the sch_Lost_Reason__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCH_Lost_Reason__C() {
        return schLostReasonC;
    }

    /**
     * Sets the value of the sch_Lost_Reason__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCH_Lost_Reason__C(String value) {
        this.schLostReasonC = value;
    }

    /**
     * Gets the value of the sch_Sample_Reason__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCH_Sample_Reason__C() {
        return schSampleReasonC;
    }

    /**
     * Sets the value of the sch_Sample_Reason__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCH_Sample_Reason__C(String value) {
        this.schSampleReasonC = value;
    }

    /**
     * Gets the value of the sfdc_Order_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFDC_Order_Number__C() {
        return sfdcOrderNumberC;
    }

    /**
     * Sets the value of the sfdc_Order_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFDC_Order_Number__C(String value) {
        this.sfdcOrderNumberC = value;
    }

    /**
     * Gets the value of the st_Product__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getST_Product__C() {
        return stProductC;
    }

    /**
     * Sets the value of the st_Product__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setST_Product__C(String value) {
        this.stProductC = value;
    }

    /**
     * Gets the value of the sales_Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Notes__C() {
        return salesNotesC;
    }

    /**
     * Sets the value of the sales_Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Notes__C(String value) {
        this.salesNotesC = value;
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
     * Gets the value of the sales_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Type__C() {
        return salesTypeC;
    }

    /**
     * Sets the value of the sales_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Type__C(String value) {
        this.salesTypeC = value;
    }

    /**
     * Gets the value of the saxon_Refill_Opp_Current_Owner__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaxon_Refill_Opp_Current_Owner__C() {
        return saxonRefillOppCurrentOwnerC;
    }

    /**
     * Sets the value of the saxon_Refill_Opp_Current_Owner__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaxon_Refill_Opp_Current_Owner__C(String value) {
        this.saxonRefillOppCurrentOwnerC = value;
    }

    /**
     * Gets the value of the saxon_Refill_Opp_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaxon_Refill_Opp_Flag__C() {
        return saxonRefillOppFlagC;
    }

    /**
     * Sets the value of the saxon_Refill_Opp_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaxon_Refill_Opp_Flag__C(Boolean value) {
        this.saxonRefillOppFlagC = value;
    }

    /**
     * Gets the value of the saxon_Refill_Opp_Original_Owner__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaxon_Refill_Opp_Original_Owner__C() {
        return saxonRefillOppOriginalOwnerC;
    }

    /**
     * Sets the value of the saxon_Refill_Opp_Original_Owner__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaxon_Refill_Opp_Original_Owner__C(String value) {
        this.saxonRefillOppOriginalOwnerC = value;
    }

    /**
     * Gets the value of the scannerModel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScannerModel__C() {
        return scannerModelC;
    }

    /**
     * Sets the value of the scannerModel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScannerModel__C(String value) {
        this.scannerModelC = value;
    }

    /**
     * Gets the value of the scanner_Delivery_Address__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanner_Delivery_Address__C() {
        return scannerDeliveryAddressC;
    }

    /**
     * Sets the value of the scanner_Delivery_Address__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanner_Delivery_Address__C(String value) {
        this.scannerDeliveryAddressC = value;
    }

    /**
     * Gets the value of the scanner_Delivery_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScanner_Delivery_Date__C() {
        return scannerDeliveryDateC;
    }

    /**
     * Sets the value of the scanner_Delivery_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScanner_Delivery_Date__C(XMLGregorianCalendar value) {
        this.scannerDeliveryDateC = value;
    }

    /**
     * Gets the value of the scanner_Materials_Customer_Needs__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanner_Materials_Customer_Needs__C() {
        return scannerMaterialsCustomerNeedsC;
    }

    /**
     * Sets the value of the scanner_Materials_Customer_Needs__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanner_Materials_Customer_Needs__C(String value) {
        this.scannerMaterialsCustomerNeedsC = value;
    }

    /**
     * Gets the value of the scanner_Qty_Per_Location__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanner_Qty_Per_Location__C() {
        return scannerQtyPerLocationC;
    }

    /**
     * Sets the value of the scanner_Qty_Per_Location__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanner_Qty_Per_Location__C(String value) {
        this.scannerQtyPerLocationC = value;
    }

    /**
     * Gets the value of the scanner_Ship_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScanner_Ship_Date__C() {
        return scannerShipDateC;
    }

    /**
     * Sets the value of the scanner_Ship_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScanner_Ship_Date__C(XMLGregorianCalendar value) {
        this.scannerShipDateC = value;
    }

    /**
     * Gets the value of the scanner_Tracking_Info__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanner_Tracking_Info__C() {
        return scannerTrackingInfoC;
    }

    /**
     * Sets the value of the scanner_Tracking_Info__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanner_Tracking_Info__C(String value) {
        this.scannerTrackingInfoC = value;
    }

    /**
     * Gets the value of the scheduled_Training_Days__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScheduled_Training_Days__C() {
        return scheduledTrainingDaysC;
    }

    /**
     * Sets the value of the scheduled_Training_Days__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScheduled_Training_Days__C(Double value) {
        this.scheduledTrainingDaysC = value;
    }

    /**
     * Gets the value of the schools__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSchools__C() {
        return schoolsC;
    }

    /**
     * Sets the value of the schools__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSchools__C(Double value) {
        this.schoolsC = value;
    }

    /**
     * Gets the value of the send_Confirmation_Email__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSend_Confirmation_Email__C() {
        return sendConfirmationEmailC;
    }

    /**
     * Sets the value of the send_Confirmation_Email__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSend_Confirmation_Email__C(Boolean value) {
        this.sendConfirmationEmailC = value;
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
     * Gets the value of the setupFeeperschool__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSetupFeeperschool__C() {
        return setupFeeperschoolC;
    }

    /**
     * Sets the value of the setupFeeperschool__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSetupFeeperschool__C(Double value) {
        this.setupFeeperschoolC = value;
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
     * Gets the value of the ship_Date_Option_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShip_Date_Option_Date__C() {
        return shipDateOptionDateC;
    }

    /**
     * Sets the value of the ship_Date_Option_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShip_Date_Option_Date__C(XMLGregorianCalendar value) {
        this.shipDateOptionDateC = value;
    }

    /**
     * Gets the value of the ship_Date_Option__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_Date_Option__C() {
        return shipDateOptionC;
    }

    /**
     * Sets the value of the ship_Date_Option__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_Date_Option__C(String value) {
        this.shipDateOptionC = value;
    }

    /**
     * Gets the value of the ship_To_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_Name__C() {
        return shipToNameC;
    }

    /**
     * Sets the value of the ship_To_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_Name__C(String value) {
        this.shipToNameC = value;
    }

    /**
     * Gets the value of the ship_To_Customer_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_Customer_ID__C() {
        return shipToCustomerIDC;
    }

    /**
     * Sets the value of the ship_To_Customer_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_Customer_ID__C(String value) {
        this.shipToCustomerIDC = value;
    }

    /**
     * Gets the value of the ship_To_Department__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_Department__C() {
        return shipToDepartmentC;
    }

    /**
     * Sets the value of the ship_To_Department__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_Department__C(String value) {
        this.shipToDepartmentC = value;
    }

    /**
     * Gets the value of the ship_To_Location__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_Location__C() {
        return shipToLocationC;
    }

    /**
     * Sets the value of the ship_To_Location__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_Location__C(String value) {
        this.shipToLocationC = value;
    }

    /**
     * Gets the value of the ship_To_SAP_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_SAP_Name__C() {
        return shipToSAPNameC;
    }

    /**
     * Sets the value of the ship_To_SAP_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_SAP_Name__C(String value) {
        this.shipToSAPNameC = value;
    }

    /**
     * Gets the value of the ship_To_SAP_Override__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip_To_SAP_Override__C() {
        return shipToSAPOverrideC;
    }

    /**
     * Sets the value of the ship_To_SAP_Override__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip_To_SAP_Override__C(String value) {
        this.shipToSAPOverrideC = value;
    }

    /**
     * Gets the value of the shipping__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipping__C() {
        return shippingC;
    }

    /**
     * Sets the value of the shipping__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipping__C(String value) {
        this.shippingC = value;
    }

    /**
     * Gets the value of the shipto_Customer_Country__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipto_Customer_Country__C() {
        return shiptoCustomerCountryC;
    }

    /**
     * Sets the value of the shipto_Customer_Country__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipto_Customer_Country__C(String value) {
        this.shiptoCustomerCountryC = value;
    }

    /**
     * Gets the value of the siebel_Account_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiebel_Account_Name__C() {
        return siebelAccountNameC;
    }

    /**
     * Sets the value of the siebel_Account_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiebel_Account_Name__C(String value) {
        this.siebelAccountNameC = value;
    }

    /**
     * Gets the value of the signed_Contract_On_File__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigned_Contract_On_File__C() {
        return signedContractOnFileC;
    }

    /**
     * Sets the value of the signed_Contract_On_File__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigned_Contract_On_File__C(String value) {
        this.signedContractOnFileC = value;
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
     * Gets the value of the soft_Sample_Restriction__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoft_Sample_Restriction__C() {
        return softSampleRestrictionC;
    }

    /**
     * Sets the value of the soft_Sample_Restriction__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoft_Sample_Restriction__C(Boolean value) {
        this.softSampleRestrictionC = value;
    }

    /**
     * Gets the value of the sold_To_Customer_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSold_To_Customer_ID__C() {
        return soldToCustomerIDC;
    }

    /**
     * Sets the value of the sold_To_Customer_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSold_To_Customer_ID__C(String value) {
        this.soldToCustomerIDC = value;
    }

    /**
     * Gets the value of the sold_To_SAP_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSold_To_SAP_Name__C() {
        return soldToSAPNameC;
    }

    /**
     * Sets the value of the sold_To_SAP_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSold_To_SAP_Name__C(String value) {
        this.soldToSAPNameC = value;
    }

    /**
     * Gets the value of the sold_To_SAP_Override__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSold_To_SAP_Override__C() {
        return soldToSAPOverrideC;
    }

    /**
     * Sets the value of the sold_To_SAP_Override__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSold_To_SAP_Override__C(String value) {
        this.soldToSAPOverrideC = value;
    }

    /**
     * Gets the value of the specialInstructions__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInstructions__C() {
        return specialInstructionsC;
    }

    /**
     * Sets the value of the specialInstructions__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInstructions__C(String value) {
        this.specialInstructionsC = value;
    }

    /**
     * Gets the value of the specified_Ship_To_PID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecified_Ship_To_PID__C() {
        return specifiedShipToPIDC;
    }

    /**
     * Sets the value of the specified_Ship_To_PID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecified_Ship_To_PID__C(String value) {
        this.specifiedShipToPIDC = value;
    }

    /**
     * Gets the value of the specified_Sold_To_PID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecified_Sold_To_PID__C() {
        return specifiedSoldToPIDC;
    }

    /**
     * Sets the value of the specified_Sold_To_PID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecified_Sold_To_PID__C(String value) {
        this.specifiedSoldToPIDC = value;
    }

    /**
     * Gets the value of the stageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStageName() {
        return stageName;
    }

    /**
     * Sets the value of the stageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStageName(String value) {
        this.stageName = value;
    }

    /**
     * Gets the value of the state_Adoption_Opp_Flag_Year_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isState_Adoption_Opp_Flag_Year_2__C() {
        return stateAdoptionOppFlagYear2C;
    }

    /**
     * Sets the value of the state_Adoption_Opp_Flag_Year_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setState_Adoption_Opp_Flag_Year_2__C(Boolean value) {
        this.stateAdoptionOppFlagYear2C = value;
    }

    /**
     * Gets the value of the state_Adoption_Opp_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isState_Adoption_Opp_Flag__C() {
        return stateAdoptionOppFlagC;
    }

    /**
     * Sets the value of the state_Adoption_Opp_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setState_Adoption_Opp_Flag__C(Boolean value) {
        this.stateAdoptionOppFlagC = value;
    }

    /**
     * Gets the value of the state_Adoption_Opportunity__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isState_Adoption_Opportunity__C() {
        return stateAdoptionOpportunityC;
    }

    /**
     * Sets the value of the state_Adoption_Opportunity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setState_Adoption_Opportunity__C(Boolean value) {
        this.stateAdoptionOpportunityC = value;
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
     * Gets the value of the strategic_Opportunity_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStrategic_Opportunity_Flag__C() {
        return strategicOpportunityFlagC;
    }

    /**
     * Sets the value of the strategic_Opportunity_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrategic_Opportunity_Flag__C(Boolean value) {
        this.strategicOpportunityFlagC = value;
    }

    /**
     * Gets the value of the subject_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject_Code__C() {
        return subjectCodeC;
    }

    /**
     * Sets the value of the subject_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject_Code__C(String value) {
        this.subjectCodeC = value;
    }

    /**
     * Gets the value of the submit_For_Manual_Correction__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubmit_For_Manual_Correction__C() {
        return submitForManualCorrectionC;
    }

    /**
     * Sets the value of the submit_For_Manual_Correction__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubmit_For_Manual_Correction__C(Boolean value) {
        this.submitForManualCorrectionC = value;
    }

    /**
     * Gets the value of the subscription_Line_Item_Count__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubscription_Line_Item_Count__C() {
        return subscriptionLineItemCountC;
    }

    /**
     * Sets the value of the subscription_Line_Item_Count__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubscription_Line_Item_Count__C(Double value) {
        this.subscriptionLineItemCountC = value;
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
     * Gets the value of the trd_Auto_Calculate_Quantity__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTRD_Auto_Calculate_Quantity__C() {
        return trdAutoCalculateQuantityC;
    }

    /**
     * Sets the value of the trd_Auto_Calculate_Quantity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTRD_Auto_Calculate_Quantity__C(Boolean value) {
        this.trdAutoCalculateQuantityC = value;
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
     * Gets the value of the tax_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTax_Amount__C() {
        return taxAmountC;
    }

    /**
     * Sets the value of the tax_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTax_Amount__C(Double value) {
        this.taxAmountC = value;
    }

    /**
     * Gets the value of the technical_Contact_Email_Address__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnical_Contact_Email_Address__C() {
        return technicalContactEmailAddressC;
    }

    /**
     * Sets the value of the technical_Contact_Email_Address__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnical_Contact_Email_Address__C(String value) {
        this.technicalContactEmailAddressC = value;
    }

    /**
     * Gets the value of the template_Record_Indicator__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate_Record_Indicator__C() {
        return templateRecordIndicatorC;
    }

    /**
     * Sets the value of the template_Record_Indicator__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplate_Record_Indicator__C(String value) {
        this.templateRecordIndicatorC = value;
    }

    /**
     * Gets the value of the term_1_Contract_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTerm_1_Contract_Amount__C() {
        return term1ContractAmountC;
    }

    /**
     * Sets the value of the term_1_Contract_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTerm_1_Contract_Amount__C(Double value) {
        this.term1ContractAmountC = value;
    }

    /**
     * Gets the value of the term_2_Contract_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTerm_2_Contract_Amount__C() {
        return term2ContractAmountC;
    }

    /**
     * Sets the value of the term_2_Contract_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTerm_2_Contract_Amount__C(Double value) {
        this.term2ContractAmountC = value;
    }

    /**
     * Gets the value of the term_2_Total_License_Fee_Per_Student__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTerm_2_Total_License_Fee_Per_Student__C() {
        return term2TotalLicenseFeePerStudentC;
    }

    /**
     * Sets the value of the term_2_Total_License_Fee_Per_Student__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTerm_2_Total_License_Fee_Per_Student__C(Double value) {
        this.term2TotalLicenseFeePerStudentC = value;
    }

    /**
     * Gets the value of the term_2_Total_License_Fee__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTerm_2_Total_License_Fee__C() {
        return term2TotalLicenseFeeC;
    }

    /**
     * Sets the value of the term_2_Total_License_Fee__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTerm_2_Total_License_Fee__C(Double value) {
        this.term2TotalLicenseFeeC = value;
    }

    /**
     * Gets the value of the term_3_Contract_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTerm_3_Contract_Amount__C() {
        return term3ContractAmountC;
    }

    /**
     * Sets the value of the term_3_Contract_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTerm_3_Contract_Amount__C(Double value) {
        this.term3ContractAmountC = value;
    }

    /**
     * Gets the value of the term_3_Total_License_Fee_Per_Student__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTerm_3_Total_License_Fee_Per_Student__C() {
        return term3TotalLicenseFeePerStudentC;
    }

    /**
     * Sets the value of the term_3_Total_License_Fee_Per_Student__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTerm_3_Total_License_Fee_Per_Student__C(Double value) {
        this.term3TotalLicenseFeePerStudentC = value;
    }

    /**
     * Gets the value of the term_3_Total_License_Fee__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTerm_3_Total_License_Fee__C() {
        return term3TotalLicenseFeeC;
    }

    /**
     * Sets the value of the term_3_Total_License_Fee__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTerm_3_Total_License_Fee__C(Double value) {
        this.term3TotalLicenseFeeC = value;
    }

    /**
     * Gets the value of the territory property.
     * 
     * @return
     *     possible object is
     *     {@link TerritoryType }
     *     
     */
    public TerritoryType getTerritory() {
        return territory;
    }

    /**
     * Sets the value of the territory property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerritoryType }
     *     
     */
    public void setTerritory(TerritoryType value) {
        this.territory = value;
    }

    /**
     * Gets the value of the territoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritoryId() {
        return territoryId;
    }

    /**
     * Sets the value of the territoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritoryId(String value) {
        this.territoryId = value;
    }

    /**
     * Gets the value of the totalOpportunityQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalOpportunityQuantity() {
        return totalOpportunityQuantity;
    }

    /**
     * Sets the value of the totalOpportunityQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalOpportunityQuantity(Double value) {
        this.totalOpportunityQuantity = value;
    }

    /**
     * Gets the value of the totalRosterUpdateFee__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalRosterUpdateFee__C() {
        return totalRosterUpdateFeeC;
    }

    /**
     * Sets the value of the totalRosterUpdateFee__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalRosterUpdateFee__C(Double value) {
        this.totalRosterUpdateFeeC = value;
    }

    /**
     * Gets the value of the totalSetupFee__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalSetupFee__C() {
        return totalSetupFeeC;
    }

    /**
     * Sets the value of the totalSetupFee__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalSetupFee__C(Double value) {
        this.totalSetupFeeC = value;
    }

    /**
     * Gets the value of the total_CP_Gratis_Qty_W_O_Generic_Novels__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal_CP_Gratis_Qty_W_O_Generic_Novels__C() {
        return totalCPGratisQtyWOGenericNovelsC;
    }

    /**
     * Sets the value of the total_CP_Gratis_Qty_W_O_Generic_Novels__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal_CP_Gratis_Qty_W_O_Generic_Novels__C(Double value) {
        this.totalCPGratisQtyWOGenericNovelsC = value;
    }

    /**
     * Gets the value of the total_Content_Fees_1__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal_Content_Fees_1__C() {
        return totalContentFees1C;
    }

    /**
     * Sets the value of the total_Content_Fees_1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal_Content_Fees_1__C(Double value) {
        this.totalContentFees1C = value;
    }

    /**
     * Gets the value of the total_Content_Fees_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal_Content_Fees_2__C() {
        return totalContentFees2C;
    }

    /**
     * Sets the value of the total_Content_Fees_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal_Content_Fees_2__C(Double value) {
        this.totalContentFees2C = value;
    }

    /**
     * Gets the value of the total_Content_Fees_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal_Content_Fees_3__C() {
        return totalContentFees3C;
    }

    /**
     * Sets the value of the total_Content_Fees_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal_Content_Fees_3__C(Double value) {
        this.totalContentFees3C = value;
    }

    /**
     * Gets the value of the total_Content_Fees_4__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal_Content_Fees_4__C() {
        return totalContentFees4C;
    }

    /**
     * Sets the value of the total_Content_Fees_4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal_Content_Fees_4__C(Double value) {
        this.totalContentFees4C = value;
    }

    /**
     * Gets the value of the total_Contract_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal_Contract_Amount__C() {
        return totalContractAmountC;
    }

    /**
     * Sets the value of the total_Contract_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal_Contract_Amount__C(Double value) {
        this.totalContractAmountC = value;
    }

    /**
     * Gets the value of the total_Cost__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal_Cost__C() {
        return totalCostC;
    }

    /**
     * Sets the value of the total_Cost__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal_Cost__C(Double value) {
        this.totalCostC = value;
    }

    /**
     * Gets the value of the total_Errors__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal_Errors__C() {
        return totalErrorsC;
    }

    /**
     * Sets the value of the total_Errors__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal_Errors__C(Double value) {
        this.totalErrorsC = value;
    }

    /**
     * Gets the value of the total_Extended_Price__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal_Extended_Price__C() {
        return totalExtendedPriceC;
    }

    /**
     * Sets the value of the total_Extended_Price__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal_Extended_Price__C(Double value) {
        this.totalExtendedPriceC = value;
    }

    /**
     * Gets the value of the total_Loaded__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal_Loaded__C() {
        return totalLoadedC;
    }

    /**
     * Sets the value of the total_Loaded__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal_Loaded__C(Double value) {
        this.totalLoadedC = value;
    }

    /**
     * Gets the value of the total_PO_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal_PO_Amount__C() {
        return totalPOAmountC;
    }

    /**
     * Sets the value of the total_PO_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal_PO_Amount__C(Double value) {
        this.totalPOAmountC = value;
    }

    /**
     * Gets the value of the total_Savings__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal_Savings__C() {
        return totalSavingsC;
    }

    /**
     * Sets the value of the total_Savings__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal_Savings__C(Double value) {
        this.totalSavingsC = value;
    }

    /**
     * Gets the value of the total_User_Discount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal_User_Discount__C() {
        return totalUserDiscountC;
    }

    /**
     * Sets the value of the total_User_Discount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal_User_Discount__C(Double value) {
        this.totalUserDiscountC = value;
    }

    /**
     * Gets the value of the trainingFee__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTrainingFee__C() {
        return trainingFeeC;
    }

    /**
     * Sets the value of the trainingFee__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTrainingFee__C(Double value) {
        this.trainingFeeC = value;
    }

    /**
     * Gets the value of the training_Days_Allowed__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTraining_Days_Allowed__C() {
        return trainingDaysAllowedC;
    }

    /**
     * Sets the value of the training_Days_Allowed__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTraining_Days_Allowed__C(Double value) {
        this.trainingDaysAllowedC = value;
    }

    /**
     * Gets the value of the training_Days_Promised__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTraining_Days_Promised__C() {
        return trainingDaysPromisedC;
    }

    /**
     * Sets the value of the training_Days_Promised__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTraining_Days_Promised__C(Double value) {
        this.trainingDaysPromisedC = value;
    }

    /**
     * Gets the value of the training_Delivered_By__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraining_Delivered_By__C() {
        return trainingDeliveredByC;
    }

    /**
     * Sets the value of the training_Delivered_By__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraining_Delivered_By__C(String value) {
        this.trainingDeliveredByC = value;
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
     * Gets the value of the transaction_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTransaction_Amount__C() {
        return transactionAmountC;
    }

    /**
     * Sets the value of the transaction_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTransaction_Amount__C(Double value) {
        this.transactionAmountC = value;
    }

    /**
     * Gets the value of the transaction_Source__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransaction_Source__C() {
        return transactionSourceC;
    }

    /**
     * Sets the value of the transaction_Source__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransaction_Source__C(String value) {
        this.transactionSourceC = value;
    }

    /**
     * Gets the value of the transaction_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransaction_Status__C() {
        return transactionStatusC;
    }

    /**
     * Sets the value of the transaction_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransaction_Status__C(String value) {
        this.transactionStatusC = value;
    }

    /**
     * Gets the value of the transaction_Subtype__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransaction_Subtype__C() {
        return transactionSubtypeC;
    }

    /**
     * Sets the value of the transaction_Subtype__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransaction_Subtype__C(String value) {
        this.transactionSubtypeC = value;
    }

    /**
     * Gets the value of the transaction_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransaction_Type__C() {
        return transactionTypeC;
    }

    /**
     * Sets the value of the transaction_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransaction_Type__C(String value) {
        this.transactionTypeC = value;
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
     * Gets the value of the uncontrolled_Cost_Ratio__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUncontrolled_Cost_Ratio__C() {
        return uncontrolledCostRatioC;
    }

    /**
     * Sets the value of the uncontrolled_Cost_Ratio__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUncontrolled_Cost_Ratio__C(Double value) {
        this.uncontrolledCostRatioC = value;
    }

    /**
     * Gets the value of the uncontrolled_Cost__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUncontrolled_Cost__C() {
        return uncontrolledCostC;
    }

    /**
     * Sets the value of the uncontrolled_Cost__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUncontrolled_Cost__C(Double value) {
        this.uncontrolledCostC = value;
    }

    /**
     * Gets the value of the uncontrolled_Extended_Price__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUncontrolled_Extended_Price__C() {
        return uncontrolledExtendedPriceC;
    }

    /**
     * Sets the value of the uncontrolled_Extended_Price__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUncontrolled_Extended_Price__C(Double value) {
        this.uncontrolledExtendedPriceC = value;
    }

    /**
     * Gets the value of the use_Override_Address__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUse_Override_Address__C() {
        return useOverrideAddressC;
    }

    /**
     * Sets the value of the use_Override_Address__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUse_Override_Address__C(Boolean value) {
        this.useOverrideAddressC = value;
    }

    /**
     * Gets the value of the user_Max_Approval_Ratio__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUser_Max_Approval_Ratio__C() {
        return userMaxApprovalRatioC;
    }

    /**
     * Sets the value of the user_Max_Approval_Ratio__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUser_Max_Approval_Ratio__C(Double value) {
        this.userMaxApprovalRatioC = value;
    }

    /**
     * Gets the value of the user__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser__C() {
        return userC;
    }

    /**
     * Sets the value of the user__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser__C(String value) {
        this.userC = value;
    }

    /**
     * Gets the value of the user__R property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUser__R() {
        return userR;
    }

    /**
     * Sets the value of the user__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUser__R(UserType value) {
        this.userR = value;
    }

    /**
     * Gets the value of the virtual_Sample_Line_Item_Count__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVirtual_Sample_Line_Item_Count__C() {
        return virtualSampleLineItemCountC;
    }

    /**
     * Sets the value of the virtual_Sample_Line_Item_Count__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVirtual_Sample_Line_Item_Count__C(Double value) {
        this.virtualSampleLineItemCountC = value;
    }

    /**
     * Gets the value of the win_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWIN_Status__C() {
        return winStatusC;
    }

    /**
     * Sets the value of the win_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWIN_Status__C(String value) {
        this.winStatusC = value;
    }

    /**
     * Gets the value of the westEdTrainingFees__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWestEdTrainingFees__C() {
        return westEdTrainingFeesC;
    }

    /**
     * Sets the value of the westEdTrainingFees__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWestEdTrainingFees__C(Double value) {
        this.westEdTrainingFeesC = value;
    }

    /**
     * Gets the value of the westEdTraining__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWestEdTraining__C() {
        return westEdTrainingC;
    }

    /**
     * Sets the value of the westEdTraining__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWestEdTraining__C(String value) {
        this.westEdTrainingC = value;
    }

    /**
     * Gets the value of the where_Is_The_Sales_Process__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhere_Is_The_Sales_Process__C() {
        return whereIsTheSalesProcessC;
    }

    /**
     * Sets the value of the where_Is_The_Sales_Process__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhere_Is_The_Sales_Process__C(String value) {
        this.whereIsTheSalesProcessC = value;
    }

    /**
     * Gets the value of the won_Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWon_Amount__C() {
        return wonAmountC;
    }

    /**
     * Sets the value of the won_Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWon_Amount__C(Double value) {
        this.wonAmountC = value;
    }

    /**
     * Gets the value of the won__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWon__C() {
        return wonC;
    }

    /**
     * Sets the value of the won__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWon__C(Double value) {
        this.wonC = value;
    }

    /**
     * Gets the value of the x5_School_CWE_Tracking__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isX5_School_CWE_Tracking__C() {
        return x5SchoolCWETrackingC;
    }

    /**
     * Sets the value of the x5_School_CWE_Tracking__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setX5_School_CWE_Tracking__C(Boolean value) {
        this.x5SchoolCWETrackingC = value;
    }

    /**
     * Gets the value of the err__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErr__C() {
        return errC;
    }

    /**
     * Sets the value of the err__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErr__C(String value) {
        this.errC = value;
    }

    /**
     * Gets the value of the err_Categ_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErr_Categ_2__C() {
        return errCateg2C;
    }

    /**
     * Sets the value of the err_Categ_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErr_Categ_2__C(String value) {
        this.errCateg2C = value;
    }

    /**
     * Gets the value of the err_Categ_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErr_Categ_3__C() {
        return errCateg3C;
    }

    /**
     * Sets the value of the err_Categ_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErr_Categ_3__C(String value) {
        this.errCateg3C = value;
    }

    /**
     * Gets the value of the err_Code_1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErr_Code_1__C() {
        return errCode1C;
    }

    /**
     * Sets the value of the err_Code_1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErr_Code_1__C(String value) {
        this.errCode1C = value;
    }

    /**
     * Gets the value of the err_Code_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErr_Code_2__C() {
        return errCode2C;
    }

    /**
     * Sets the value of the err_Code_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErr_Code_2__C(String value) {
        this.errCode2C = value;
    }

    /**
     * Gets the value of the err_Code_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErr_Code_3__C() {
        return errCode3C;
    }

    /**
     * Sets the value of the err_Code_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErr_Code_3__C(String value) {
        this.errCode3C = value;
    }

    /**
     * Gets the value of the err_Msg_1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErr_Msg_1__C() {
        return errMsg1C;
    }

    /**
     * Sets the value of the err_Msg_1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErr_Msg_1__C(String value) {
        this.errMsg1C = value;
    }

    /**
     * Gets the value of the err_Msg_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErr_Msg_2__C() {
        return errMsg2C;
    }

    /**
     * Sets the value of the err_Msg_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErr_Msg_2__C(String value) {
        this.errMsg2C = value;
    }

    /**
     * Gets the value of the err_Msg_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErr_Msg_3__C() {
        return errMsg3C;
    }

    /**
     * Sets the value of the err_Msg_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErr_Msg_3__C(String value) {
        this.errMsg3C = value;
    }

    /**
     * Gets the value of the netTre__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetTre__C() {
        return netTreC;
    }

    /**
     * Sets the value of the netTre__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetTre__C(Boolean value) {
        this.netTreC = value;
    }

    /**
     * Gets the value of the x1StRenewalDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getX1StRenewalDate__C() {
        return x1StRenewalDateC;
    }

    /**
     * Sets the value of the x1StRenewalDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setX1StRenewalDate__C(XMLGregorianCalendar value) {
        this.x1StRenewalDateC = value;
    }

    /**
     * Gets the value of the x2NdRenewalDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getX2NdRenewalDate__C() {
        return x2NdRenewalDateC;
    }

    /**
     * Sets the value of the x2NdRenewalDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setX2NdRenewalDate__C(XMLGregorianCalendar value) {
        this.x2NdRenewalDateC = value;
    }

    /**
     * Gets the value of the x3RdRenewalDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getX3RdRenewalDate__C() {
        return x3RdRenewalDateC;
    }

    /**
     * Sets the value of the x3RdRenewalDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setX3RdRenewalDate__C(XMLGregorianCalendar value) {
        this.x3RdRenewalDateC = value;
    }

}
