
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Product2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product2">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="ATP_Stock_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ATP_Stock__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ActivityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Addendum_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assets" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Author__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BOM_Component_s__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BOM_Quantity_s__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BOM_Usage__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Beginning_Grade_Level__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Business_Unit_s__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPSIA_Req_Certificate__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CPSIA_Req_Label__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CP_Override_Price__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="College_Discipline__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="College_Special_Product_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Content_Category__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Copyright_Year__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coupon_Code_PD__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coupon_Code_SE__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Custom_Keys__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custom_Pub_Indicator__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Custom_State__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Title__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRA__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Source__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Decode_of_Content_Category__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Default_Subscription_Term__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Default_Subscription_Term__r" type="{urn:sobject.enterprise.soap.sforce.com}Product_Subscription__c" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Divisional_Readiness__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EGood_Fulfillments__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Edition_Category_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Edition_Category_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Edition_Number__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Egood_Delivery_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Egood_Indicator__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Egood_Mixedkit__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Email_Address_Required__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ending_Grade_Level__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Estimated_Cost__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Events" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Family" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Feeds" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="GRL__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gen_Item_Category_Group__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Get_Price_Failed__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Gross_Weight__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Full_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_1_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_1_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_2_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_2_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_3_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_3_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_4_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_4_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_4__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_5_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_5_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Level_5__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISBN_13__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ignore_SAP_Pricebook_Updates__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Internal_Product_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Is_Time_Based_Material__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LT_Assets__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Legacy_Product_Id__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lexile__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Market_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Marketing_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Material_Group__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Material_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Media_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="National_ISBN__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="National_Material__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Next_Edition_Number__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Next_Publication_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpenActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpportunityLineItems" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Orderable__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PD_Addendum_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PD_Addendum_Group__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Permission_Digital__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Permission_Image__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Permission_Text__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Previous_Edition_Number__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricebookEntries" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_After_Text__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Group__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Hierarchy_Level_1__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product_Hierarchy_Level_1__r" type="{urn:sobject.enterprise.soap.sforce.com}Product_Hierarchy__c" minOccurs="0"/>
 *         &lt;element name="Product_Hierarchy_Level_2__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product_Hierarchy_Level_2__r" type="{urn:sobject.enterprise.soap.sforce.com}Product_Hierarchy__c" minOccurs="0"/>
 *         &lt;element name="Product_Hierarchy_Level_3__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product_Hierarchy_Level_3__r" type="{urn:sobject.enterprise.soap.sforce.com}Product_Hierarchy__c" minOccurs="0"/>
 *         &lt;element name="Product_Hierarchy_Level_4__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product_Hierarchy_Level_4__r" type="{urn:sobject.enterprise.soap.sforce.com}Product_Hierarchy__c" minOccurs="0"/>
 *         &lt;element name="Product_Hierarchy_Level_5__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product_Hierarchy_Level_5__r" type="{urn:sobject.enterprise.soap.sforce.com}Product_Hierarchy__c" minOccurs="0"/>
 *         &lt;element name="Product_Presentation__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Set_Products__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Product_State_Substitutions1__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Product_State_Substitutions__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Product_Subscriptions__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Product_Subtype__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Publication_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Publication_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R00NR0000000V3CcMAK__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="RecordType" type="{urn:sobject.enterprise.soap.sforce.com}RecordType" minOccurs="0"/>
 *         &lt;element name="RecordTypeId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Related_Sales_Restriction_Record__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Related_Sales_Restriction_Record__r" type="{urn:sobject.enterprise.soap.sforce.com}Product_Sales_Restrictions__c" minOccurs="0"/>
 *         &lt;element name="Release_Line_Item_Notifications__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Require_Manager_Sample_Approval__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Require_PD_Approval__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Revenue_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAP_Contract_Only__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SAP_Sales_Restriction__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SFDC_Sales_Restriction__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Hierarchy_Full_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Hierarchy_Level_1_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Hierarchy_Level_1_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Hierarchy_Level_1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Hierarchy_Level_2_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Hierarchy_Level_2_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Hierarchy_Level_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Hierarchy_Level_3_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Hierarchy_Level_3_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Hierarchy_Level_3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Hierarchy_Level_4_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Hierarchy_Level_4_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Hierarchy_Level_4__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Hierarchy_Level_5_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Hierarchy_Level_5_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Hierarchy_Level_5__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Hierarchy_Level_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Short_Product_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Soft_Sample_Restriction__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Standard_WAUC__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="State_Indicator__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subscription_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Term_Duration_s__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Term_List_Price_s__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Term_Unit_s__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title_For_Customer__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title_Status_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPC__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unit__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Units_per_Carton__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Virtual_Sample_URL__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Volume__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WAUC_Adjustment__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="external_product_group__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product2", propOrder = {
    "atpStockDateC",
    "atpStockC",
    "activityHistories",
    "addendumTypeC",
    "assets",
    "attachments",
    "authorC",
    "bomComponentSC",
    "bomQuantitySC",
    "bomUsageC",
    "beginningGradeLevelC",
    "businessUnitSC",
    "cpsiaReqCertificateC",
    "cpsiaReqLabelC",
    "cpOverridePriceC",
    "collegeDisciplineC",
    "collegeSpecialProductCodeC",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "contentCategoryC",
    "copyrightYearC",
    "couponCodePDC",
    "couponCodeSEC",
    "createdBy",
    "createdById",
    "createdDate",
    "customKeysC",
    "customPubIndicatorC",
    "customStateC",
    "customerTitleC",
    "draC",
    "dataSourceC",
    "decodeOfContentCategoryC",
    "defaultSubscriptionTermC",
    "defaultSubscriptionTermR",
    "description",
    "divisionalReadinessC",
    "eGoodFulfillmentsR",
    "editionCategoryCodeC",
    "editionCategoryDescC",
    "editionNumberC",
    "egoodDeliveryDateC",
    "egoodIndicatorC",
    "egoodMixedkitC",
    "emailAddressRequiredC",
    "endingGradeLevelC",
    "estimatedCostC",
    "events",
    "family",
    "feedSubscriptionsForEntity",
    "feeds",
    "grlC",
    "genItemCategoryGroupC",
    "getPriceFailedC",
    "grossWeightC",
    "hierarchyFullCodeC",
    "hierarchyLevel1CodeC",
    "hierarchyLevel1DescC",
    "hierarchyLevel1C",
    "hierarchyLevel2CodeC",
    "hierarchyLevel2DescC",
    "hierarchyLevel2C",
    "hierarchyLevel3CodeC",
    "hierarchyLevel3DescC",
    "hierarchyLevel3C",
    "hierarchyLevel4CodeC",
    "hierarchyLevel4DescC",
    "hierarchyLevel4C",
    "hierarchyLevel5CodeC",
    "hierarchyLevel5DescC",
    "hierarchyLevel5C",
    "isbn13C",
    "ignoreSAPPricebookUpdatesC",
    "internalProductDescriptionC",
    "isActive",
    "isDeleted",
    "isTimeBasedMaterialC",
    "ltAssetsR",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "legacyProductIdC",
    "lexileC",
    "marketNameC",
    "marketingDescriptionC",
    "materialGroupC",
    "materialTypeC",
    "mediaTypeC",
    "name",
    "nationalISBNC",
    "nationalMaterialC",
    "nextEditionNumberC",
    "nextPublicationDateC",
    "notes",
    "notesAndAttachments",
    "openActivities",
    "opportunityLineItems",
    "orderableC",
    "pdAddendumDescriptionC",
    "pdAddendumGroupC",
    "permissionDigitalC",
    "permissionImageC",
    "permissionTextC",
    "previousEditionNumberC",
    "pricebookEntries",
    "processInstances",
    "processSteps",
    "productCode",
    "productAfterTextC",
    "productGroupC",
    "productHierarchyLevel1C",
    "productHierarchyLevel1R",
    "productHierarchyLevel2C",
    "productHierarchyLevel2R",
    "productHierarchyLevel3C",
    "productHierarchyLevel3R",
    "productHierarchyLevel4C",
    "productHierarchyLevel4R",
    "productHierarchyLevel5C",
    "productHierarchyLevel5R",
    "productPresentationC",
    "productSetProductsR",
    "productStateSubstitutions1R",
    "productStateSubstitutionsR",
    "productSubscriptionsR",
    "productSubtypeC",
    "productTypeC",
    "publicationDateC",
    "publicationTypeC",
    "r00NR0000000V3CcMAKR",
    "recordType",
    "recordTypeId",
    "relatedSalesRestrictionRecordC",
    "relatedSalesRestrictionRecordR",
    "releaseLineItemNotificationsR",
    "requireManagerSampleApprovalC",
    "requirePDApprovalC",
    "revenueCodeC",
    "sapContractOnlyC",
    "sapSalesRestrictionC",
    "sfdcSalesRestrictionC",
    "salesHierarchyFullCodeC",
    "salesHierarchyLevel1CodeC",
    "salesHierarchyLevel1DescC",
    "salesHierarchyLevel1C",
    "salesHierarchyLevel2CodeC",
    "salesHierarchyLevel2DescC",
    "salesHierarchyLevel2C",
    "salesHierarchyLevel3CodeC",
    "salesHierarchyLevel3DescC",
    "salesHierarchyLevel3C",
    "salesHierarchyLevel4CodeC",
    "salesHierarchyLevel4DescC",
    "salesHierarchyLevel4C",
    "salesHierarchyLevel5CodeC",
    "salesHierarchyLevel5DescC",
    "salesHierarchyLevel5C",
    "salesHierarchyLevelCodeC",
    "shortProductCodeC",
    "softSampleRestrictionC",
    "standardWAUCC",
    "stateIndicatorC",
    "subscriptionFlagC",
    "systemModstamp",
    "tasks",
    "termDurationSC",
    "termListPriceSC",
    "termUnitSC",
    "titleForCustomerC",
    "titleStatusCodeC",
    "upcC",
    "unitC",
    "unitsPerCartonC",
    "virtualSampleURLC",
    "volumeC",
    "waucAdjustmentC",
    "externalProductGroupC"
})
public class Product2Type
    extends SObjectType
{

    @XmlElement(name = "ATP_Stock_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar atpStockDateC;
    @XmlElement(name = "ATP_Stock__c", nillable = true)
    protected Double atpStockC;
    @XmlElement(name = "ActivityHistories", nillable = true)
    protected QueryResult activityHistories;
    @XmlElement(name = "Addendum_Type__c", nillable = true)
    protected String addendumTypeC;
    @XmlElement(name = "Assets", nillable = true)
    protected QueryResult assets;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "Author__c", nillable = true)
    protected String authorC;
    @XmlElement(name = "BOM_Component_s__c", nillable = true)
    protected String bomComponentSC;
    @XmlElement(name = "BOM_Quantity_s__c", nillable = true)
    protected Double bomQuantitySC;
    @XmlElement(name = "BOM_Usage__c", nillable = true)
    protected String bomUsageC;
    @XmlElement(name = "Beginning_Grade_Level__c", nillable = true)
    protected String beginningGradeLevelC;
    @XmlElement(name = "Business_Unit_s__c", nillable = true)
    protected String businessUnitSC;
    @XmlElement(name = "CPSIA_Req_Certificate__c", nillable = true)
    protected Boolean cpsiaReqCertificateC;
    @XmlElement(name = "CPSIA_Req_Label__c", nillable = true)
    protected Boolean cpsiaReqLabelC;
    @XmlElement(name = "CP_Override_Price__c", nillable = true)
    protected Double cpOverridePriceC;
    @XmlElement(name = "College_Discipline__c", nillable = true)
    protected String collegeDisciplineC;
    @XmlElement(name = "College_Special_Product_Code__c", nillable = true)
    protected String collegeSpecialProductCodeC;
    @XmlElement(name = "ConnectionReceived", nillable = true)
    protected PartnerNetworkConnectionType connectionReceived;
    @XmlElement(name = "ConnectionReceivedId", nillable = true)
    protected String connectionReceivedId;
    @XmlElement(name = "ConnectionSent", nillable = true)
    protected PartnerNetworkConnectionType connectionSent;
    @XmlElement(name = "ConnectionSentId", nillable = true)
    protected String connectionSentId;
    @XmlElement(name = "Content_Category__c", nillable = true)
    protected String contentCategoryC;
    @XmlElement(name = "Copyright_Year__c", nillable = true)
    protected String copyrightYearC;
    @XmlElement(name = "Coupon_Code_PD__c", nillable = true)
    protected String couponCodePDC;
    @XmlElement(name = "Coupon_Code_SE__c", nillable = true)
    protected String couponCodeSEC;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Custom_Keys__c", nillable = true)
    protected String customKeysC;
    @XmlElement(name = "Custom_Pub_Indicator__c", nillable = true)
    protected Boolean customPubIndicatorC;
    @XmlElement(name = "Custom_State__c", nillable = true)
    protected String customStateC;
    @XmlElement(name = "Customer_Title__c", nillable = true)
    protected String customerTitleC;
    @XmlElement(name = "DRA__c", nillable = true)
    protected String draC;
    @XmlElement(name = "Data_Source__c", nillable = true)
    protected String dataSourceC;
    @XmlElement(name = "Decode_of_Content_Category__c", nillable = true)
    protected String decodeOfContentCategoryC;
    @XmlElement(name = "Default_Subscription_Term__c", nillable = true)
    protected String defaultSubscriptionTermC;
    @XmlElement(name = "Default_Subscription_Term__r", nillable = true)
    protected Product_Subscription__CType defaultSubscriptionTermR;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "Divisional_Readiness__c", nillable = true)
    protected Boolean divisionalReadinessC;
    @XmlElement(name = "EGood_Fulfillments__r", nillable = true)
    protected QueryResult eGoodFulfillmentsR;
    @XmlElement(name = "Edition_Category_Code__c", nillable = true)
    protected String editionCategoryCodeC;
    @XmlElement(name = "Edition_Category_Desc__c", nillable = true)
    protected String editionCategoryDescC;
    @XmlElement(name = "Edition_Number__c", nillable = true)
    protected String editionNumberC;
    @XmlElement(name = "Egood_Delivery_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar egoodDeliveryDateC;
    @XmlElement(name = "Egood_Indicator__c", nillable = true)
    protected String egoodIndicatorC;
    @XmlElement(name = "Egood_Mixedkit__c", nillable = true)
    protected Boolean egoodMixedkitC;
    @XmlElement(name = "Email_Address_Required__c", nillable = true)
    protected String emailAddressRequiredC;
    @XmlElement(name = "Ending_Grade_Level__c", nillable = true)
    protected String endingGradeLevelC;
    @XmlElement(name = "Estimated_Cost__c", nillable = true)
    protected Double estimatedCostC;
    @XmlElement(name = "Events", nillable = true)
    protected QueryResult events;
    @XmlElement(name = "Family", nillable = true)
    protected String family;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "Feeds", nillable = true)
    protected QueryResult feeds;
    @XmlElement(name = "GRL__c", nillable = true)
    protected String grlC;
    @XmlElement(name = "Gen_Item_Category_Group__c", nillable = true)
    protected String genItemCategoryGroupC;
    @XmlElement(name = "Get_Price_Failed__c", nillable = true)
    protected Boolean getPriceFailedC;
    @XmlElement(name = "Gross_Weight__c", nillable = true)
    protected Double grossWeightC;
    @XmlElement(name = "Hierarchy_Full_Code__c", nillable = true)
    protected String hierarchyFullCodeC;
    @XmlElement(name = "Hierarchy_Level_1_Code__c", nillable = true)
    protected String hierarchyLevel1CodeC;
    @XmlElement(name = "Hierarchy_Level_1_Desc__c", nillable = true)
    protected String hierarchyLevel1DescC;
    @XmlElement(name = "Hierarchy_Level_1__c", nillable = true)
    protected String hierarchyLevel1C;
    @XmlElement(name = "Hierarchy_Level_2_Code__c", nillable = true)
    protected String hierarchyLevel2CodeC;
    @XmlElement(name = "Hierarchy_Level_2_Desc__c", nillable = true)
    protected String hierarchyLevel2DescC;
    @XmlElement(name = "Hierarchy_Level_2__c", nillable = true)
    protected String hierarchyLevel2C;
    @XmlElement(name = "Hierarchy_Level_3_Code__c", nillable = true)
    protected String hierarchyLevel3CodeC;
    @XmlElement(name = "Hierarchy_Level_3_Desc__c", nillable = true)
    protected String hierarchyLevel3DescC;
    @XmlElement(name = "Hierarchy_Level_3__c", nillable = true)
    protected String hierarchyLevel3C;
    @XmlElement(name = "Hierarchy_Level_4_Code__c", nillable = true)
    protected String hierarchyLevel4CodeC;
    @XmlElement(name = "Hierarchy_Level_4_Desc__c", nillable = true)
    protected String hierarchyLevel4DescC;
    @XmlElement(name = "Hierarchy_Level_4__c", nillable = true)
    protected String hierarchyLevel4C;
    @XmlElement(name = "Hierarchy_Level_5_Code__c", nillable = true)
    protected String hierarchyLevel5CodeC;
    @XmlElement(name = "Hierarchy_Level_5_Desc__c", nillable = true)
    protected String hierarchyLevel5DescC;
    @XmlElement(name = "Hierarchy_Level_5__c", nillable = true)
    protected String hierarchyLevel5C;
    @XmlElement(name = "ISBN_13__c", nillable = true)
    protected String isbn13C;
    @XmlElement(name = "Ignore_SAP_Pricebook_Updates__c", nillable = true)
    protected Boolean ignoreSAPPricebookUpdatesC;
    @XmlElement(name = "Internal_Product_Description__c", nillable = true)
    protected String internalProductDescriptionC;
    @XmlElement(name = "IsActive", nillable = true)
    protected Boolean isActive;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "Is_Time_Based_Material__c", nillable = true)
    protected Boolean isTimeBasedMaterialC;
    @XmlElement(name = "LT_Assets__r", nillable = true)
    protected QueryResult ltAssetsR;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Legacy_Product_Id__c", nillable = true)
    protected String legacyProductIdC;
    @XmlElement(name = "Lexile__c", nillable = true)
    protected String lexileC;
    @XmlElement(name = "Market_Name__c", nillable = true)
    protected String marketNameC;
    @XmlElement(name = "Marketing_Description__c", nillable = true)
    protected String marketingDescriptionC;
    @XmlElement(name = "Material_Group__c", nillable = true)
    protected String materialGroupC;
    @XmlElement(name = "Material_Type__c", nillable = true)
    protected String materialTypeC;
    @XmlElement(name = "Media_Type__c", nillable = true)
    protected String mediaTypeC;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "National_ISBN__c", nillable = true)
    protected String nationalISBNC;
    @XmlElement(name = "National_Material__c", nillable = true)
    protected String nationalMaterialC;
    @XmlElement(name = "Next_Edition_Number__c", nillable = true)
    protected String nextEditionNumberC;
    @XmlElement(name = "Next_Publication_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextPublicationDateC;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "OpenActivities", nillable = true)
    protected QueryResult openActivities;
    @XmlElement(name = "OpportunityLineItems", nillable = true)
    protected QueryResult opportunityLineItems;
    @XmlElement(name = "Orderable__c", nillable = true)
    protected String orderableC;
    @XmlElement(name = "PD_Addendum_Description__c", nillable = true)
    protected String pdAddendumDescriptionC;
    @XmlElement(name = "PD_Addendum_Group__c", nillable = true)
    protected String pdAddendumGroupC;
    @XmlElement(name = "Permission_Digital__c", nillable = true)
    protected Boolean permissionDigitalC;
    @XmlElement(name = "Permission_Image__c", nillable = true)
    protected Boolean permissionImageC;
    @XmlElement(name = "Permission_Text__c", nillable = true)
    protected Boolean permissionTextC;
    @XmlElement(name = "Previous_Edition_Number__c", nillable = true)
    protected String previousEditionNumberC;
    @XmlElement(name = "PricebookEntries", nillable = true)
    protected QueryResult pricebookEntries;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "ProductCode", nillable = true)
    protected String productCode;
    @XmlElement(name = "Product_After_Text__c", nillable = true)
    protected String productAfterTextC;
    @XmlElement(name = "Product_Group__c", nillable = true)
    protected String productGroupC;
    @XmlElement(name = "Product_Hierarchy_Level_1__c", nillable = true)
    protected String productHierarchyLevel1C;
    @XmlElement(name = "Product_Hierarchy_Level_1__r", nillable = true)
    protected Product_Hierarchy__CType productHierarchyLevel1R;
    @XmlElement(name = "Product_Hierarchy_Level_2__c", nillable = true)
    protected String productHierarchyLevel2C;
    @XmlElement(name = "Product_Hierarchy_Level_2__r", nillable = true)
    protected Product_Hierarchy__CType productHierarchyLevel2R;
    @XmlElement(name = "Product_Hierarchy_Level_3__c", nillable = true)
    protected String productHierarchyLevel3C;
    @XmlElement(name = "Product_Hierarchy_Level_3__r", nillable = true)
    protected Product_Hierarchy__CType productHierarchyLevel3R;
    @XmlElement(name = "Product_Hierarchy_Level_4__c", nillable = true)
    protected String productHierarchyLevel4C;
    @XmlElement(name = "Product_Hierarchy_Level_4__r", nillable = true)
    protected Product_Hierarchy__CType productHierarchyLevel4R;
    @XmlElement(name = "Product_Hierarchy_Level_5__c", nillable = true)
    protected String productHierarchyLevel5C;
    @XmlElement(name = "Product_Hierarchy_Level_5__r", nillable = true)
    protected Product_Hierarchy__CType productHierarchyLevel5R;
    @XmlElement(name = "Product_Presentation__c", nillable = true)
    protected String productPresentationC;
    @XmlElement(name = "Product_Set_Products__r", nillable = true)
    protected QueryResult productSetProductsR;
    @XmlElement(name = "Product_State_Substitutions1__r", nillable = true)
    protected QueryResult productStateSubstitutions1R;
    @XmlElement(name = "Product_State_Substitutions__r", nillable = true)
    protected QueryResult productStateSubstitutionsR;
    @XmlElement(name = "Product_Subscriptions__r", nillable = true)
    protected QueryResult productSubscriptionsR;
    @XmlElement(name = "Product_Subtype__c", nillable = true)
    protected String productSubtypeC;
    @XmlElement(name = "Product_Type__c", nillable = true)
    protected String productTypeC;
    @XmlElement(name = "Publication_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publicationDateC;
    @XmlElement(name = "Publication_Type__c", nillable = true)
    protected String publicationTypeC;
    @XmlElement(name = "R00NR0000000V3CcMAK__r", nillable = true)
    protected QueryResult r00NR0000000V3CcMAKR;
    @XmlElement(name = "RecordType", nillable = true)
    protected RecordTypeType recordType;
    @XmlElement(name = "RecordTypeId", nillable = true)
    protected String recordTypeId;
    @XmlElement(name = "Related_Sales_Restriction_Record__c", nillable = true)
    protected String relatedSalesRestrictionRecordC;
    @XmlElement(name = "Related_Sales_Restriction_Record__r", nillable = true)
    protected Product_Sales_Restrictions__CType relatedSalesRestrictionRecordR;
    @XmlElement(name = "Release_Line_Item_Notifications__r", nillable = true)
    protected QueryResult releaseLineItemNotificationsR;
    @XmlElement(name = "Require_Manager_Sample_Approval__c", nillable = true)
    protected Boolean requireManagerSampleApprovalC;
    @XmlElement(name = "Require_PD_Approval__c", nillable = true)
    protected Boolean requirePDApprovalC;
    @XmlElement(name = "Revenue_Code__c", nillable = true)
    protected String revenueCodeC;
    @XmlElement(name = "SAP_Contract_Only__c", nillable = true)
    protected Boolean sapContractOnlyC;
    @XmlElement(name = "SAP_Sales_Restriction__c", nillable = true)
    protected String sapSalesRestrictionC;
    @XmlElement(name = "SFDC_Sales_Restriction__c", nillable = true)
    protected String sfdcSalesRestrictionC;
    @XmlElement(name = "Sales_Hierarchy_Full_Code__c", nillable = true)
    protected String salesHierarchyFullCodeC;
    @XmlElement(name = "Sales_Hierarchy_Level_1_Code__c", nillable = true)
    protected String salesHierarchyLevel1CodeC;
    @XmlElement(name = "Sales_Hierarchy_Level_1_Desc__c", nillable = true)
    protected String salesHierarchyLevel1DescC;
    @XmlElement(name = "Sales_Hierarchy_Level_1__c", nillable = true)
    protected String salesHierarchyLevel1C;
    @XmlElement(name = "Sales_Hierarchy_Level_2_Code__c", nillable = true)
    protected String salesHierarchyLevel2CodeC;
    @XmlElement(name = "Sales_Hierarchy_Level_2_Desc__c", nillable = true)
    protected String salesHierarchyLevel2DescC;
    @XmlElement(name = "Sales_Hierarchy_Level_2__c", nillable = true)
    protected String salesHierarchyLevel2C;
    @XmlElement(name = "Sales_Hierarchy_Level_3_Code__c", nillable = true)
    protected String salesHierarchyLevel3CodeC;
    @XmlElement(name = "Sales_Hierarchy_Level_3_Desc__c", nillable = true)
    protected String salesHierarchyLevel3DescC;
    @XmlElement(name = "Sales_Hierarchy_Level_3__c", nillable = true)
    protected String salesHierarchyLevel3C;
    @XmlElement(name = "Sales_Hierarchy_Level_4_Code__c", nillable = true)
    protected String salesHierarchyLevel4CodeC;
    @XmlElement(name = "Sales_Hierarchy_Level_4_Desc__c", nillable = true)
    protected String salesHierarchyLevel4DescC;
    @XmlElement(name = "Sales_Hierarchy_Level_4__c", nillable = true)
    protected String salesHierarchyLevel4C;
    @XmlElement(name = "Sales_Hierarchy_Level_5_Code__c", nillable = true)
    protected String salesHierarchyLevel5CodeC;
    @XmlElement(name = "Sales_Hierarchy_Level_5_Desc__c", nillable = true)
    protected String salesHierarchyLevel5DescC;
    @XmlElement(name = "Sales_Hierarchy_Level_5__c", nillable = true)
    protected String salesHierarchyLevel5C;
    @XmlElement(name = "Sales_Hierarchy_Level_Code__c", nillable = true)
    protected String salesHierarchyLevelCodeC;
    @XmlElement(name = "Short_Product_Code__c", nillable = true)
    protected String shortProductCodeC;
    @XmlElement(name = "Soft_Sample_Restriction__c", nillable = true)
    protected Boolean softSampleRestrictionC;
    @XmlElement(name = "Standard_WAUC__c", nillable = true)
    protected Double standardWAUCC;
    @XmlElement(name = "State_Indicator__c", nillable = true)
    protected String stateIndicatorC;
    @XmlElement(name = "Subscription_Flag__c", nillable = true)
    protected Boolean subscriptionFlagC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Tasks", nillable = true)
    protected QueryResult tasks;
    @XmlElement(name = "Term_Duration_s__c", nillable = true)
    protected Double termDurationSC;
    @XmlElement(name = "Term_List_Price_s__c", nillable = true)
    protected Double termListPriceSC;
    @XmlElement(name = "Term_Unit_s__c", nillable = true)
    protected String termUnitSC;
    @XmlElement(name = "Title_For_Customer__c", nillable = true)
    protected String titleForCustomerC;
    @XmlElement(name = "Title_Status_Code__c", nillable = true)
    protected String titleStatusCodeC;
    @XmlElement(name = "UPC__c", nillable = true)
    protected String upcC;
    @XmlElement(name = "Unit__c", nillable = true)
    protected String unitC;
    @XmlElement(name = "Units_per_Carton__c", nillable = true)
    protected Double unitsPerCartonC;
    @XmlElement(name = "Virtual_Sample_URL__c", nillable = true)
    protected String virtualSampleURLC;
    @XmlElement(name = "Volume__c", nillable = true)
    protected String volumeC;
    @XmlElement(name = "WAUC_Adjustment__c", nillable = true)
    protected Double waucAdjustmentC;
    @XmlElement(name = "external_product_group__c", nillable = true)
    protected String externalProductGroupC;

    /**
     * Gets the value of the atp_Stock_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getATP_Stock_Date__C() {
        return atpStockDateC;
    }

    /**
     * Sets the value of the atp_Stock_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setATP_Stock_Date__C(XMLGregorianCalendar value) {
        this.atpStockDateC = value;
    }

    /**
     * Gets the value of the atp_Stock__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getATP_Stock__C() {
        return atpStockC;
    }

    /**
     * Sets the value of the atp_Stock__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setATP_Stock__C(Double value) {
        this.atpStockC = value;
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
     * Gets the value of the addendum_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddendum_Type__C() {
        return addendumTypeC;
    }

    /**
     * Sets the value of the addendum_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddendum_Type__C(String value) {
        this.addendumTypeC = value;
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
     * Gets the value of the author__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor__C() {
        return authorC;
    }

    /**
     * Sets the value of the author__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor__C(String value) {
        this.authorC = value;
    }

    /**
     * Gets the value of the bom_Component_S__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOM_Component_S__C() {
        return bomComponentSC;
    }

    /**
     * Sets the value of the bom_Component_S__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOM_Component_S__C(String value) {
        this.bomComponentSC = value;
    }

    /**
     * Gets the value of the bom_Quantity_S__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBOM_Quantity_S__C() {
        return bomQuantitySC;
    }

    /**
     * Sets the value of the bom_Quantity_S__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBOM_Quantity_S__C(Double value) {
        this.bomQuantitySC = value;
    }

    /**
     * Gets the value of the bom_Usage__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOM_Usage__C() {
        return bomUsageC;
    }

    /**
     * Sets the value of the bom_Usage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOM_Usage__C(String value) {
        this.bomUsageC = value;
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
     * Gets the value of the business_Unit_S__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusiness_Unit_S__C() {
        return businessUnitSC;
    }

    /**
     * Sets the value of the business_Unit_S__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusiness_Unit_S__C(String value) {
        this.businessUnitSC = value;
    }

    /**
     * Gets the value of the cpsia_Req_Certificate__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCPSIA_Req_Certificate__C() {
        return cpsiaReqCertificateC;
    }

    /**
     * Sets the value of the cpsia_Req_Certificate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCPSIA_Req_Certificate__C(Boolean value) {
        this.cpsiaReqCertificateC = value;
    }

    /**
     * Gets the value of the cpsia_Req_Label__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCPSIA_Req_Label__C() {
        return cpsiaReqLabelC;
    }

    /**
     * Sets the value of the cpsia_Req_Label__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCPSIA_Req_Label__C(Boolean value) {
        this.cpsiaReqLabelC = value;
    }

    /**
     * Gets the value of the cp_Override_Price__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCP_Override_Price__C() {
        return cpOverridePriceC;
    }

    /**
     * Sets the value of the cp_Override_Price__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCP_Override_Price__C(Double value) {
        this.cpOverridePriceC = value;
    }

    /**
     * Gets the value of the college_Discipline__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollege_Discipline__C() {
        return collegeDisciplineC;
    }

    /**
     * Sets the value of the college_Discipline__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollege_Discipline__C(String value) {
        this.collegeDisciplineC = value;
    }

    /**
     * Gets the value of the college_Special_Product_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollege_Special_Product_Code__C() {
        return collegeSpecialProductCodeC;
    }

    /**
     * Sets the value of the college_Special_Product_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollege_Special_Product_Code__C(String value) {
        this.collegeSpecialProductCodeC = value;
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
     * Gets the value of the content_Category__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent_Category__C() {
        return contentCategoryC;
    }

    /**
     * Sets the value of the content_Category__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent_Category__C(String value) {
        this.contentCategoryC = value;
    }

    /**
     * Gets the value of the copyright_Year__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright_Year__C() {
        return copyrightYearC;
    }

    /**
     * Sets the value of the copyright_Year__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyright_Year__C(String value) {
        this.copyrightYearC = value;
    }

    /**
     * Gets the value of the coupon_Code_PD__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoupon_Code_PD__C() {
        return couponCodePDC;
    }

    /**
     * Sets the value of the coupon_Code_PD__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoupon_Code_PD__C(String value) {
        this.couponCodePDC = value;
    }

    /**
     * Gets the value of the coupon_Code_SE__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoupon_Code_SE__C() {
        return couponCodeSEC;
    }

    /**
     * Sets the value of the coupon_Code_SE__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoupon_Code_SE__C(String value) {
        this.couponCodeSEC = value;
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
     * Gets the value of the custom_Keys__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom_Keys__C() {
        return customKeysC;
    }

    /**
     * Sets the value of the custom_Keys__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom_Keys__C(String value) {
        this.customKeysC = value;
    }

    /**
     * Gets the value of the custom_Pub_Indicator__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustom_Pub_Indicator__C() {
        return customPubIndicatorC;
    }

    /**
     * Sets the value of the custom_Pub_Indicator__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustom_Pub_Indicator__C(Boolean value) {
        this.customPubIndicatorC = value;
    }

    /**
     * Gets the value of the custom_State__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom_State__C() {
        return customStateC;
    }

    /**
     * Sets the value of the custom_State__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom_State__C(String value) {
        this.customStateC = value;
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
     * Gets the value of the dra__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRA__C() {
        return draC;
    }

    /**
     * Sets the value of the dra__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRA__C(String value) {
        this.draC = value;
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
     * Gets the value of the decode_Of_Content_Category__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecode_Of_Content_Category__C() {
        return decodeOfContentCategoryC;
    }

    /**
     * Sets the value of the decode_Of_Content_Category__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecode_Of_Content_Category__C(String value) {
        this.decodeOfContentCategoryC = value;
    }

    /**
     * Gets the value of the default_Subscription_Term__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault_Subscription_Term__C() {
        return defaultSubscriptionTermC;
    }

    /**
     * Sets the value of the default_Subscription_Term__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault_Subscription_Term__C(String value) {
        this.defaultSubscriptionTermC = value;
    }

    /**
     * Gets the value of the default_Subscription_Term__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product_Subscription__CType }
     *     
     */
    public Product_Subscription__CType getDefault_Subscription_Term__R() {
        return defaultSubscriptionTermR;
    }

    /**
     * Sets the value of the default_Subscription_Term__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product_Subscription__CType }
     *     
     */
    public void setDefault_Subscription_Term__R(Product_Subscription__CType value) {
        this.defaultSubscriptionTermR = value;
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
     * Gets the value of the divisional_Readiness__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDivisional_Readiness__C() {
        return divisionalReadinessC;
    }

    /**
     * Sets the value of the divisional_Readiness__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDivisional_Readiness__C(Boolean value) {
        this.divisionalReadinessC = value;
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
     * Gets the value of the edition_Category_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition_Category_Code__C() {
        return editionCategoryCodeC;
    }

    /**
     * Sets the value of the edition_Category_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition_Category_Code__C(String value) {
        this.editionCategoryCodeC = value;
    }

    /**
     * Gets the value of the edition_Category_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition_Category_Desc__C() {
        return editionCategoryDescC;
    }

    /**
     * Sets the value of the edition_Category_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition_Category_Desc__C(String value) {
        this.editionCategoryDescC = value;
    }

    /**
     * Gets the value of the edition_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition_Number__C() {
        return editionNumberC;
    }

    /**
     * Sets the value of the edition_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition_Number__C(String value) {
        this.editionNumberC = value;
    }

    /**
     * Gets the value of the egood_Delivery_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEgood_Delivery_Date__C() {
        return egoodDeliveryDateC;
    }

    /**
     * Sets the value of the egood_Delivery_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEgood_Delivery_Date__C(XMLGregorianCalendar value) {
        this.egoodDeliveryDateC = value;
    }

    /**
     * Gets the value of the egood_Indicator__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgood_Indicator__C() {
        return egoodIndicatorC;
    }

    /**
     * Sets the value of the egood_Indicator__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgood_Indicator__C(String value) {
        this.egoodIndicatorC = value;
    }

    /**
     * Gets the value of the egood_Mixedkit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEgood_Mixedkit__C() {
        return egoodMixedkitC;
    }

    /**
     * Sets the value of the egood_Mixedkit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEgood_Mixedkit__C(Boolean value) {
        this.egoodMixedkitC = value;
    }

    /**
     * Gets the value of the email_Address_Required__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail_Address_Required__C() {
        return emailAddressRequiredC;
    }

    /**
     * Sets the value of the email_Address_Required__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail_Address_Required__C(String value) {
        this.emailAddressRequiredC = value;
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
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamily(String value) {
        this.family = value;
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
     * Gets the value of the grl__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRL__C() {
        return grlC;
    }

    /**
     * Sets the value of the grl__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRL__C(String value) {
        this.grlC = value;
    }

    /**
     * Gets the value of the gen_Item_Category_Group__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGen_Item_Category_Group__C() {
        return genItemCategoryGroupC;
    }

    /**
     * Sets the value of the gen_Item_Category_Group__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGen_Item_Category_Group__C(String value) {
        this.genItemCategoryGroupC = value;
    }

    /**
     * Gets the value of the get_Price_Failed__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGet_Price_Failed__C() {
        return getPriceFailedC;
    }

    /**
     * Sets the value of the get_Price_Failed__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGet_Price_Failed__C(Boolean value) {
        this.getPriceFailedC = value;
    }

    /**
     * Gets the value of the gross_Weight__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGross_Weight__C() {
        return grossWeightC;
    }

    /**
     * Sets the value of the gross_Weight__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGross_Weight__C(Double value) {
        this.grossWeightC = value;
    }

    /**
     * Gets the value of the hierarchy_Full_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Full_Code__C() {
        return hierarchyFullCodeC;
    }

    /**
     * Sets the value of the hierarchy_Full_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Full_Code__C(String value) {
        this.hierarchyFullCodeC = value;
    }

    /**
     * Gets the value of the hierarchy_Level_1_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_1_Code__C() {
        return hierarchyLevel1CodeC;
    }

    /**
     * Sets the value of the hierarchy_Level_1_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_1_Code__C(String value) {
        this.hierarchyLevel1CodeC = value;
    }

    /**
     * Gets the value of the hierarchy_Level_1_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_1_Desc__C() {
        return hierarchyLevel1DescC;
    }

    /**
     * Sets the value of the hierarchy_Level_1_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_1_Desc__C(String value) {
        this.hierarchyLevel1DescC = value;
    }

    /**
     * Gets the value of the hierarchy_Level_1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_1__C() {
        return hierarchyLevel1C;
    }

    /**
     * Sets the value of the hierarchy_Level_1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_1__C(String value) {
        this.hierarchyLevel1C = value;
    }

    /**
     * Gets the value of the hierarchy_Level_2_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_2_Code__C() {
        return hierarchyLevel2CodeC;
    }

    /**
     * Sets the value of the hierarchy_Level_2_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_2_Code__C(String value) {
        this.hierarchyLevel2CodeC = value;
    }

    /**
     * Gets the value of the hierarchy_Level_2_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_2_Desc__C() {
        return hierarchyLevel2DescC;
    }

    /**
     * Sets the value of the hierarchy_Level_2_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_2_Desc__C(String value) {
        this.hierarchyLevel2DescC = value;
    }

    /**
     * Gets the value of the hierarchy_Level_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_2__C() {
        return hierarchyLevel2C;
    }

    /**
     * Sets the value of the hierarchy_Level_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_2__C(String value) {
        this.hierarchyLevel2C = value;
    }

    /**
     * Gets the value of the hierarchy_Level_3_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_3_Code__C() {
        return hierarchyLevel3CodeC;
    }

    /**
     * Sets the value of the hierarchy_Level_3_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_3_Code__C(String value) {
        this.hierarchyLevel3CodeC = value;
    }

    /**
     * Gets the value of the hierarchy_Level_3_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_3_Desc__C() {
        return hierarchyLevel3DescC;
    }

    /**
     * Sets the value of the hierarchy_Level_3_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_3_Desc__C(String value) {
        this.hierarchyLevel3DescC = value;
    }

    /**
     * Gets the value of the hierarchy_Level_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_3__C() {
        return hierarchyLevel3C;
    }

    /**
     * Sets the value of the hierarchy_Level_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_3__C(String value) {
        this.hierarchyLevel3C = value;
    }

    /**
     * Gets the value of the hierarchy_Level_4_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_4_Code__C() {
        return hierarchyLevel4CodeC;
    }

    /**
     * Sets the value of the hierarchy_Level_4_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_4_Code__C(String value) {
        this.hierarchyLevel4CodeC = value;
    }

    /**
     * Gets the value of the hierarchy_Level_4_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_4_Desc__C() {
        return hierarchyLevel4DescC;
    }

    /**
     * Sets the value of the hierarchy_Level_4_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_4_Desc__C(String value) {
        this.hierarchyLevel4DescC = value;
    }

    /**
     * Gets the value of the hierarchy_Level_4__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_4__C() {
        return hierarchyLevel4C;
    }

    /**
     * Sets the value of the hierarchy_Level_4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_4__C(String value) {
        this.hierarchyLevel4C = value;
    }

    /**
     * Gets the value of the hierarchy_Level_5_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_5_Code__C() {
        return hierarchyLevel5CodeC;
    }

    /**
     * Sets the value of the hierarchy_Level_5_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_5_Code__C(String value) {
        this.hierarchyLevel5CodeC = value;
    }

    /**
     * Gets the value of the hierarchy_Level_5_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_5_Desc__C() {
        return hierarchyLevel5DescC;
    }

    /**
     * Sets the value of the hierarchy_Level_5_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_5_Desc__C(String value) {
        this.hierarchyLevel5DescC = value;
    }

    /**
     * Gets the value of the hierarchy_Level_5__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchy_Level_5__C() {
        return hierarchyLevel5C;
    }

    /**
     * Sets the value of the hierarchy_Level_5__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchy_Level_5__C(String value) {
        this.hierarchyLevel5C = value;
    }

    /**
     * Gets the value of the isbn_13__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN_13__C() {
        return isbn13C;
    }

    /**
     * Sets the value of the isbn_13__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN_13__C(String value) {
        this.isbn13C = value;
    }

    /**
     * Gets the value of the ignore_SAP_Pricebook_Updates__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnore_SAP_Pricebook_Updates__C() {
        return ignoreSAPPricebookUpdatesC;
    }

    /**
     * Sets the value of the ignore_SAP_Pricebook_Updates__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnore_SAP_Pricebook_Updates__C(Boolean value) {
        this.ignoreSAPPricebookUpdatesC = value;
    }

    /**
     * Gets the value of the internal_Product_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternal_Product_Description__C() {
        return internalProductDescriptionC;
    }

    /**
     * Sets the value of the internal_Product_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternal_Product_Description__C(String value) {
        this.internalProductDescriptionC = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
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
     * Gets the value of the is_Time_Based_Material__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIs_Time_Based_Material__C() {
        return isTimeBasedMaterialC;
    }

    /**
     * Sets the value of the is_Time_Based_Material__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIs_Time_Based_Material__C(Boolean value) {
        this.isTimeBasedMaterialC = value;
    }

    /**
     * Gets the value of the lt_Assets__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getLT_Assets__R() {
        return ltAssetsR;
    }

    /**
     * Sets the value of the lt_Assets__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setLT_Assets__R(QueryResult value) {
        this.ltAssetsR = value;
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
     * Gets the value of the legacy_Product_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacy_Product_Id__C() {
        return legacyProductIdC;
    }

    /**
     * Sets the value of the legacy_Product_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacy_Product_Id__C(String value) {
        this.legacyProductIdC = value;
    }

    /**
     * Gets the value of the lexile__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLexile__C() {
        return lexileC;
    }

    /**
     * Sets the value of the lexile__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLexile__C(String value) {
        this.lexileC = value;
    }

    /**
     * Gets the value of the market_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarket_Name__C() {
        return marketNameC;
    }

    /**
     * Sets the value of the market_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarket_Name__C(String value) {
        this.marketNameC = value;
    }

    /**
     * Gets the value of the marketing_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketing_Description__C() {
        return marketingDescriptionC;
    }

    /**
     * Sets the value of the marketing_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketing_Description__C(String value) {
        this.marketingDescriptionC = value;
    }

    /**
     * Gets the value of the material_Group__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial_Group__C() {
        return materialGroupC;
    }

    /**
     * Sets the value of the material_Group__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial_Group__C(String value) {
        this.materialGroupC = value;
    }

    /**
     * Gets the value of the material_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial_Type__C() {
        return materialTypeC;
    }

    /**
     * Sets the value of the material_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial_Type__C(String value) {
        this.materialTypeC = value;
    }

    /**
     * Gets the value of the media_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedia_Type__C() {
        return mediaTypeC;
    }

    /**
     * Sets the value of the media_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedia_Type__C(String value) {
        this.mediaTypeC = value;
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
     * Gets the value of the national_ISBN__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNational_ISBN__C() {
        return nationalISBNC;
    }

    /**
     * Sets the value of the national_ISBN__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNational_ISBN__C(String value) {
        this.nationalISBNC = value;
    }

    /**
     * Gets the value of the national_Material__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNational_Material__C() {
        return nationalMaterialC;
    }

    /**
     * Sets the value of the national_Material__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNational_Material__C(String value) {
        this.nationalMaterialC = value;
    }

    /**
     * Gets the value of the next_Edition_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNext_Edition_Number__C() {
        return nextEditionNumberC;
    }

    /**
     * Sets the value of the next_Edition_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNext_Edition_Number__C(String value) {
        this.nextEditionNumberC = value;
    }

    /**
     * Gets the value of the next_Publication_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNext_Publication_Date__C() {
        return nextPublicationDateC;
    }

    /**
     * Sets the value of the next_Publication_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNext_Publication_Date__C(XMLGregorianCalendar value) {
        this.nextPublicationDateC = value;
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
     * Gets the value of the orderable__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderable__C() {
        return orderableC;
    }

    /**
     * Sets the value of the orderable__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderable__C(String value) {
        this.orderableC = value;
    }

    /**
     * Gets the value of the pd_Addendum_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD_Addendum_Description__C() {
        return pdAddendumDescriptionC;
    }

    /**
     * Sets the value of the pd_Addendum_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD_Addendum_Description__C(String value) {
        this.pdAddendumDescriptionC = value;
    }

    /**
     * Gets the value of the pd_Addendum_Group__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPD_Addendum_Group__C() {
        return pdAddendumGroupC;
    }

    /**
     * Sets the value of the pd_Addendum_Group__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPD_Addendum_Group__C(String value) {
        this.pdAddendumGroupC = value;
    }

    /**
     * Gets the value of the permission_Digital__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermission_Digital__C() {
        return permissionDigitalC;
    }

    /**
     * Sets the value of the permission_Digital__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermission_Digital__C(Boolean value) {
        this.permissionDigitalC = value;
    }

    /**
     * Gets the value of the permission_Image__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermission_Image__C() {
        return permissionImageC;
    }

    /**
     * Sets the value of the permission_Image__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermission_Image__C(Boolean value) {
        this.permissionImageC = value;
    }

    /**
     * Gets the value of the permission_Text__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermission_Text__C() {
        return permissionTextC;
    }

    /**
     * Sets the value of the permission_Text__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermission_Text__C(Boolean value) {
        this.permissionTextC = value;
    }

    /**
     * Gets the value of the previous_Edition_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevious_Edition_Number__C() {
        return previousEditionNumberC;
    }

    /**
     * Sets the value of the previous_Edition_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevious_Edition_Number__C(String value) {
        this.previousEditionNumberC = value;
    }

    /**
     * Gets the value of the pricebookEntries property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getPricebookEntries() {
        return pricebookEntries;
    }

    /**
     * Sets the value of the pricebookEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setPricebookEntries(QueryResult value) {
        this.pricebookEntries = value;
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
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the product_After_Text__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct_After_Text__C() {
        return productAfterTextC;
    }

    /**
     * Sets the value of the product_After_Text__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct_After_Text__C(String value) {
        this.productAfterTextC = value;
    }

    /**
     * Gets the value of the product_Group__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct_Group__C() {
        return productGroupC;
    }

    /**
     * Sets the value of the product_Group__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct_Group__C(String value) {
        this.productGroupC = value;
    }

    /**
     * Gets the value of the product_Hierarchy_Level_1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct_Hierarchy_Level_1__C() {
        return productHierarchyLevel1C;
    }

    /**
     * Sets the value of the product_Hierarchy_Level_1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct_Hierarchy_Level_1__C(String value) {
        this.productHierarchyLevel1C = value;
    }

    /**
     * Gets the value of the product_Hierarchy_Level_1__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product_Hierarchy__CType }
     *     
     */
    public Product_Hierarchy__CType getProduct_Hierarchy_Level_1__R() {
        return productHierarchyLevel1R;
    }

    /**
     * Sets the value of the product_Hierarchy_Level_1__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product_Hierarchy__CType }
     *     
     */
    public void setProduct_Hierarchy_Level_1__R(Product_Hierarchy__CType value) {
        this.productHierarchyLevel1R = value;
    }

    /**
     * Gets the value of the product_Hierarchy_Level_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct_Hierarchy_Level_2__C() {
        return productHierarchyLevel2C;
    }

    /**
     * Sets the value of the product_Hierarchy_Level_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct_Hierarchy_Level_2__C(String value) {
        this.productHierarchyLevel2C = value;
    }

    /**
     * Gets the value of the product_Hierarchy_Level_2__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product_Hierarchy__CType }
     *     
     */
    public Product_Hierarchy__CType getProduct_Hierarchy_Level_2__R() {
        return productHierarchyLevel2R;
    }

    /**
     * Sets the value of the product_Hierarchy_Level_2__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product_Hierarchy__CType }
     *     
     */
    public void setProduct_Hierarchy_Level_2__R(Product_Hierarchy__CType value) {
        this.productHierarchyLevel2R = value;
    }

    /**
     * Gets the value of the product_Hierarchy_Level_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct_Hierarchy_Level_3__C() {
        return productHierarchyLevel3C;
    }

    /**
     * Sets the value of the product_Hierarchy_Level_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct_Hierarchy_Level_3__C(String value) {
        this.productHierarchyLevel3C = value;
    }

    /**
     * Gets the value of the product_Hierarchy_Level_3__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product_Hierarchy__CType }
     *     
     */
    public Product_Hierarchy__CType getProduct_Hierarchy_Level_3__R() {
        return productHierarchyLevel3R;
    }

    /**
     * Sets the value of the product_Hierarchy_Level_3__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product_Hierarchy__CType }
     *     
     */
    public void setProduct_Hierarchy_Level_3__R(Product_Hierarchy__CType value) {
        this.productHierarchyLevel3R = value;
    }

    /**
     * Gets the value of the product_Hierarchy_Level_4__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct_Hierarchy_Level_4__C() {
        return productHierarchyLevel4C;
    }

    /**
     * Sets the value of the product_Hierarchy_Level_4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct_Hierarchy_Level_4__C(String value) {
        this.productHierarchyLevel4C = value;
    }

    /**
     * Gets the value of the product_Hierarchy_Level_4__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product_Hierarchy__CType }
     *     
     */
    public Product_Hierarchy__CType getProduct_Hierarchy_Level_4__R() {
        return productHierarchyLevel4R;
    }

    /**
     * Sets the value of the product_Hierarchy_Level_4__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product_Hierarchy__CType }
     *     
     */
    public void setProduct_Hierarchy_Level_4__R(Product_Hierarchy__CType value) {
        this.productHierarchyLevel4R = value;
    }

    /**
     * Gets the value of the product_Hierarchy_Level_5__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct_Hierarchy_Level_5__C() {
        return productHierarchyLevel5C;
    }

    /**
     * Sets the value of the product_Hierarchy_Level_5__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct_Hierarchy_Level_5__C(String value) {
        this.productHierarchyLevel5C = value;
    }

    /**
     * Gets the value of the product_Hierarchy_Level_5__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product_Hierarchy__CType }
     *     
     */
    public Product_Hierarchy__CType getProduct_Hierarchy_Level_5__R() {
        return productHierarchyLevel5R;
    }

    /**
     * Sets the value of the product_Hierarchy_Level_5__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product_Hierarchy__CType }
     *     
     */
    public void setProduct_Hierarchy_Level_5__R(Product_Hierarchy__CType value) {
        this.productHierarchyLevel5R = value;
    }

    /**
     * Gets the value of the product_Presentation__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct_Presentation__C() {
        return productPresentationC;
    }

    /**
     * Sets the value of the product_Presentation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct_Presentation__C(String value) {
        this.productPresentationC = value;
    }

    /**
     * Gets the value of the product_Set_Products__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getProduct_Set_Products__R() {
        return productSetProductsR;
    }

    /**
     * Sets the value of the product_Set_Products__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setProduct_Set_Products__R(QueryResult value) {
        this.productSetProductsR = value;
    }

    /**
     * Gets the value of the product_State_Substitutions1__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getProduct_State_Substitutions1__R() {
        return productStateSubstitutions1R;
    }

    /**
     * Sets the value of the product_State_Substitutions1__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setProduct_State_Substitutions1__R(QueryResult value) {
        this.productStateSubstitutions1R = value;
    }

    /**
     * Gets the value of the product_State_Substitutions__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getProduct_State_Substitutions__R() {
        return productStateSubstitutionsR;
    }

    /**
     * Sets the value of the product_State_Substitutions__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setProduct_State_Substitutions__R(QueryResult value) {
        this.productStateSubstitutionsR = value;
    }

    /**
     * Gets the value of the product_Subscriptions__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getProduct_Subscriptions__R() {
        return productSubscriptionsR;
    }

    /**
     * Sets the value of the product_Subscriptions__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setProduct_Subscriptions__R(QueryResult value) {
        this.productSubscriptionsR = value;
    }

    /**
     * Gets the value of the product_Subtype__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct_Subtype__C() {
        return productSubtypeC;
    }

    /**
     * Sets the value of the product_Subtype__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct_Subtype__C(String value) {
        this.productSubtypeC = value;
    }

    /**
     * Gets the value of the product_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct_Type__C() {
        return productTypeC;
    }

    /**
     * Sets the value of the product_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct_Type__C(String value) {
        this.productTypeC = value;
    }

    /**
     * Gets the value of the publication_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublication_Date__C() {
        return publicationDateC;
    }

    /**
     * Sets the value of the publication_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublication_Date__C(XMLGregorianCalendar value) {
        this.publicationDateC = value;
    }

    /**
     * Gets the value of the publication_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublication_Type__C() {
        return publicationTypeC;
    }

    /**
     * Sets the value of the publication_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublication_Type__C(String value) {
        this.publicationTypeC = value;
    }

    /**
     * Gets the value of the r00NR0000000V3CcMAK__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getR00NR0000000V3CcMAK__R() {
        return r00NR0000000V3CcMAKR;
    }

    /**
     * Sets the value of the r00NR0000000V3CcMAK__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setR00NR0000000V3CcMAK__R(QueryResult value) {
        this.r00NR0000000V3CcMAKR = value;
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
     * Gets the value of the related_Sales_Restriction_Record__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated_Sales_Restriction_Record__C() {
        return relatedSalesRestrictionRecordC;
    }

    /**
     * Sets the value of the related_Sales_Restriction_Record__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated_Sales_Restriction_Record__C(String value) {
        this.relatedSalesRestrictionRecordC = value;
    }

    /**
     * Gets the value of the related_Sales_Restriction_Record__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product_Sales_Restrictions__CType }
     *     
     */
    public Product_Sales_Restrictions__CType getRelated_Sales_Restriction_Record__R() {
        return relatedSalesRestrictionRecordR;
    }

    /**
     * Sets the value of the related_Sales_Restriction_Record__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product_Sales_Restrictions__CType }
     *     
     */
    public void setRelated_Sales_Restriction_Record__R(Product_Sales_Restrictions__CType value) {
        this.relatedSalesRestrictionRecordR = value;
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
     * Gets the value of the require_Manager_Sample_Approval__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequire_Manager_Sample_Approval__C() {
        return requireManagerSampleApprovalC;
    }

    /**
     * Sets the value of the require_Manager_Sample_Approval__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequire_Manager_Sample_Approval__C(Boolean value) {
        this.requireManagerSampleApprovalC = value;
    }

    /**
     * Gets the value of the require_PD_Approval__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequire_PD_Approval__C() {
        return requirePDApprovalC;
    }

    /**
     * Sets the value of the require_PD_Approval__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequire_PD_Approval__C(Boolean value) {
        this.requirePDApprovalC = value;
    }

    /**
     * Gets the value of the revenue_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenue_Code__C() {
        return revenueCodeC;
    }

    /**
     * Sets the value of the revenue_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenue_Code__C(String value) {
        this.revenueCodeC = value;
    }

    /**
     * Gets the value of the sap_Contract_Only__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSAP_Contract_Only__C() {
        return sapContractOnlyC;
    }

    /**
     * Sets the value of the sap_Contract_Only__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSAP_Contract_Only__C(Boolean value) {
        this.sapContractOnlyC = value;
    }

    /**
     * Gets the value of the sap_Sales_Restriction__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAP_Sales_Restriction__C() {
        return sapSalesRestrictionC;
    }

    /**
     * Sets the value of the sap_Sales_Restriction__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAP_Sales_Restriction__C(String value) {
        this.sapSalesRestrictionC = value;
    }

    /**
     * Gets the value of the sfdc_Sales_Restriction__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFDC_Sales_Restriction__C() {
        return sfdcSalesRestrictionC;
    }

    /**
     * Sets the value of the sfdc_Sales_Restriction__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFDC_Sales_Restriction__C(String value) {
        this.sfdcSalesRestrictionC = value;
    }

    /**
     * Gets the value of the sales_Hierarchy_Full_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Hierarchy_Full_Code__C() {
        return salesHierarchyFullCodeC;
    }

    /**
     * Sets the value of the sales_Hierarchy_Full_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Hierarchy_Full_Code__C(String value) {
        this.salesHierarchyFullCodeC = value;
    }

    /**
     * Gets the value of the sales_Hierarchy_Level_1_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Hierarchy_Level_1_Code__C() {
        return salesHierarchyLevel1CodeC;
    }

    /**
     * Sets the value of the sales_Hierarchy_Level_1_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Hierarchy_Level_1_Code__C(String value) {
        this.salesHierarchyLevel1CodeC = value;
    }

    /**
     * Gets the value of the sales_Hierarchy_Level_1_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Hierarchy_Level_1_Desc__C() {
        return salesHierarchyLevel1DescC;
    }

    /**
     * Sets the value of the sales_Hierarchy_Level_1_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Hierarchy_Level_1_Desc__C(String value) {
        this.salesHierarchyLevel1DescC = value;
    }

    /**
     * Gets the value of the sales_Hierarchy_Level_1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Hierarchy_Level_1__C() {
        return salesHierarchyLevel1C;
    }

    /**
     * Sets the value of the sales_Hierarchy_Level_1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Hierarchy_Level_1__C(String value) {
        this.salesHierarchyLevel1C = value;
    }

    /**
     * Gets the value of the sales_Hierarchy_Level_2_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Hierarchy_Level_2_Code__C() {
        return salesHierarchyLevel2CodeC;
    }

    /**
     * Sets the value of the sales_Hierarchy_Level_2_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Hierarchy_Level_2_Code__C(String value) {
        this.salesHierarchyLevel2CodeC = value;
    }

    /**
     * Gets the value of the sales_Hierarchy_Level_2_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Hierarchy_Level_2_Desc__C() {
        return salesHierarchyLevel2DescC;
    }

    /**
     * Sets the value of the sales_Hierarchy_Level_2_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Hierarchy_Level_2_Desc__C(String value) {
        this.salesHierarchyLevel2DescC = value;
    }

    /**
     * Gets the value of the sales_Hierarchy_Level_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Hierarchy_Level_2__C() {
        return salesHierarchyLevel2C;
    }

    /**
     * Sets the value of the sales_Hierarchy_Level_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Hierarchy_Level_2__C(String value) {
        this.salesHierarchyLevel2C = value;
    }

    /**
     * Gets the value of the sales_Hierarchy_Level_3_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Hierarchy_Level_3_Code__C() {
        return salesHierarchyLevel3CodeC;
    }

    /**
     * Sets the value of the sales_Hierarchy_Level_3_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Hierarchy_Level_3_Code__C(String value) {
        this.salesHierarchyLevel3CodeC = value;
    }

    /**
     * Gets the value of the sales_Hierarchy_Level_3_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Hierarchy_Level_3_Desc__C() {
        return salesHierarchyLevel3DescC;
    }

    /**
     * Sets the value of the sales_Hierarchy_Level_3_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Hierarchy_Level_3_Desc__C(String value) {
        this.salesHierarchyLevel3DescC = value;
    }

    /**
     * Gets the value of the sales_Hierarchy_Level_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Hierarchy_Level_3__C() {
        return salesHierarchyLevel3C;
    }

    /**
     * Sets the value of the sales_Hierarchy_Level_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Hierarchy_Level_3__C(String value) {
        this.salesHierarchyLevel3C = value;
    }

    /**
     * Gets the value of the sales_Hierarchy_Level_4_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Hierarchy_Level_4_Code__C() {
        return salesHierarchyLevel4CodeC;
    }

    /**
     * Sets the value of the sales_Hierarchy_Level_4_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Hierarchy_Level_4_Code__C(String value) {
        this.salesHierarchyLevel4CodeC = value;
    }

    /**
     * Gets the value of the sales_Hierarchy_Level_4_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Hierarchy_Level_4_Desc__C() {
        return salesHierarchyLevel4DescC;
    }

    /**
     * Sets the value of the sales_Hierarchy_Level_4_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Hierarchy_Level_4_Desc__C(String value) {
        this.salesHierarchyLevel4DescC = value;
    }

    /**
     * Gets the value of the sales_Hierarchy_Level_4__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Hierarchy_Level_4__C() {
        return salesHierarchyLevel4C;
    }

    /**
     * Sets the value of the sales_Hierarchy_Level_4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Hierarchy_Level_4__C(String value) {
        this.salesHierarchyLevel4C = value;
    }

    /**
     * Gets the value of the sales_Hierarchy_Level_5_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Hierarchy_Level_5_Code__C() {
        return salesHierarchyLevel5CodeC;
    }

    /**
     * Sets the value of the sales_Hierarchy_Level_5_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Hierarchy_Level_5_Code__C(String value) {
        this.salesHierarchyLevel5CodeC = value;
    }

    /**
     * Gets the value of the sales_Hierarchy_Level_5_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Hierarchy_Level_5_Desc__C() {
        return salesHierarchyLevel5DescC;
    }

    /**
     * Sets the value of the sales_Hierarchy_Level_5_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Hierarchy_Level_5_Desc__C(String value) {
        this.salesHierarchyLevel5DescC = value;
    }

    /**
     * Gets the value of the sales_Hierarchy_Level_5__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Hierarchy_Level_5__C() {
        return salesHierarchyLevel5C;
    }

    /**
     * Sets the value of the sales_Hierarchy_Level_5__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Hierarchy_Level_5__C(String value) {
        this.salesHierarchyLevel5C = value;
    }

    /**
     * Gets the value of the sales_Hierarchy_Level_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSales_Hierarchy_Level_Code__C() {
        return salesHierarchyLevelCodeC;
    }

    /**
     * Sets the value of the sales_Hierarchy_Level_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSales_Hierarchy_Level_Code__C(String value) {
        this.salesHierarchyLevelCodeC = value;
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
     * Gets the value of the standard_WAUC__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStandard_WAUC__C() {
        return standardWAUCC;
    }

    /**
     * Sets the value of the standard_WAUC__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStandard_WAUC__C(Double value) {
        this.standardWAUCC = value;
    }

    /**
     * Gets the value of the state_Indicator__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState_Indicator__C() {
        return stateIndicatorC;
    }

    /**
     * Sets the value of the state_Indicator__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState_Indicator__C(String value) {
        this.stateIndicatorC = value;
    }

    /**
     * Gets the value of the subscription_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubscription_Flag__C() {
        return subscriptionFlagC;
    }

    /**
     * Sets the value of the subscription_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscription_Flag__C(Boolean value) {
        this.subscriptionFlagC = value;
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
     * Gets the value of the term_Duration_S__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTerm_Duration_S__C() {
        return termDurationSC;
    }

    /**
     * Sets the value of the term_Duration_S__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTerm_Duration_S__C(Double value) {
        this.termDurationSC = value;
    }

    /**
     * Gets the value of the term_List_Price_S__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTerm_List_Price_S__C() {
        return termListPriceSC;
    }

    /**
     * Sets the value of the term_List_Price_S__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTerm_List_Price_S__C(Double value) {
        this.termListPriceSC = value;
    }

    /**
     * Gets the value of the term_Unit_S__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm_Unit_S__C() {
        return termUnitSC;
    }

    /**
     * Sets the value of the term_Unit_S__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm_Unit_S__C(String value) {
        this.termUnitSC = value;
    }

    /**
     * Gets the value of the title_For_Customer__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle_For_Customer__C() {
        return titleForCustomerC;
    }

    /**
     * Sets the value of the title_For_Customer__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle_For_Customer__C(String value) {
        this.titleForCustomerC = value;
    }

    /**
     * Gets the value of the title_Status_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle_Status_Code__C() {
        return titleStatusCodeC;
    }

    /**
     * Sets the value of the title_Status_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle_Status_Code__C(String value) {
        this.titleStatusCodeC = value;
    }

    /**
     * Gets the value of the upc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPC__C() {
        return upcC;
    }

    /**
     * Sets the value of the upc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPC__C(String value) {
        this.upcC = value;
    }

    /**
     * Gets the value of the unit__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit__C() {
        return unitC;
    }

    /**
     * Sets the value of the unit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit__C(String value) {
        this.unitC = value;
    }

    /**
     * Gets the value of the units_Per_Carton__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnits_Per_Carton__C() {
        return unitsPerCartonC;
    }

    /**
     * Sets the value of the units_Per_Carton__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnits_Per_Carton__C(Double value) {
        this.unitsPerCartonC = value;
    }

    /**
     * Gets the value of the virtual_Sample_URL__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtual_Sample_URL__C() {
        return virtualSampleURLC;
    }

    /**
     * Sets the value of the virtual_Sample_URL__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtual_Sample_URL__C(String value) {
        this.virtualSampleURLC = value;
    }

    /**
     * Gets the value of the volume__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume__C() {
        return volumeC;
    }

    /**
     * Sets the value of the volume__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume__C(String value) {
        this.volumeC = value;
    }

    /**
     * Gets the value of the wauc_Adjustment__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWAUC_Adjustment__C() {
        return waucAdjustmentC;
    }

    /**
     * Sets the value of the wauc_Adjustment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWAUC_Adjustment__C(Double value) {
        this.waucAdjustmentC = value;
    }

    /**
     * Gets the value of the external_Product_Group__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternal_Product_Group__C() {
        return externalProductGroupC;
    }

    /**
     * Sets the value of the external_Product_Group__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternal_Product_Group__C(String value) {
        this.externalProductGroupC = value;
    }

}
