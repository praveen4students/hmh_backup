
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OpportunityLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpportunityLineItem">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="After_Text__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alt_Enroll_Calc_Modifier__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BOM_Usage__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackendAddFlag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Before_Text__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Beginning_Grade_Level__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPO_Qty_Calc_Ratio__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CPO_Quantity__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Charge_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Consolidated_PHL_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coupon_Code_PD_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Coupon_Code_PD_Indicator__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coupon_Code_SE_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Coupon_Code_SE_Indicator__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coupon_Code__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Coupon_Code__r" type="{urn:sobject.enterprise.soap.sforce.com}Coupon_Codes__c" minOccurs="0"/>
 *         &lt;element name="Coupon_Discount_Amt__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Custom_Sort_Order__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Customer_Material_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Delete_from_Quote__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Delivered_nondelivered__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Division" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Email_Address_Required_Formula__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email_Address_Required__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ending_Grade_Level__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enroll_Calc_Modifier__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Enterprise_Product__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Error_Text__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ext_Coupon_Discount_Amt__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Ext_Sale_Price_Amt__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Extended_Wauc_Cost__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Full_PHL_2_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Full_PHL_3_Desc__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISBN_13__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISBN_CHK__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISBN__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Imp_Submitted_Qty__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Imp_Unsubmitted_Qty__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Is_Contract_Price__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Is_Implemented__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Is_Subscription_Term_Locked__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Last_Shipped_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Last_Update_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Line_CC_Ratio_Indicator__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line_Item_Block_Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line_Item_Research_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line_Item_Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line_Number__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ListPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Lost_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Lost_to_Program_Id__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Lost_to_Program_Id__r" type="{urn:sobject.enterprise.soap.sforce.com}Competitor_Offering__c" minOccurs="0"/>
 *         &lt;element name="Market_Price__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Market_Quantity__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Market_Total_Price__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Open_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Opportunity" type="{urn:sobject.enterprise.soap.sforce.com}Opportunity" minOccurs="0"/>
 *         &lt;element name="OpportunityId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Opportunity_Line_School_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Option_Allocation_Percent__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Original_SFA_Rep_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Postponed_Cancelled_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Price_Override_Flag__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PricebookEntry" type="{urn:sobject.enterprise.soap.sforce.com}PricebookEntry" minOccurs="0"/>
 *         &lt;element name="PricebookEntryId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Product_Ownership_of_record__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Proposal_Tree_Id__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Proposal_Tree_Id__r" type="{urn:sobject.enterprise.soap.sforce.com}Proposal_Tree__c" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Quantity_Backordered__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Quantity_Calculation_Method__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity_Invoiced__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Quantity_Max__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Quantity_Min__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Quantity_Rejected__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Quantity_Shipped__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Quoted_Discount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Quoted_Ext_Net_Price__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Quoted_Ext_Savings__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Quoted_List_Price__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Quoted_Net_Price__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Quoted_Quantity__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Quoted_Sale_Price__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Realigned_SFA_Rep_ID__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Require_Manager_Sample_Approval__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Require_PD_Approval__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SSO_Approved__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SSO_Control_Group_Id_Work_Around_Copy__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSO_Control_Group_Id__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SSO_Control_Group_Id__r" type="{urn:sobject.enterprise.soap.sforce.com}CP_Control_Groups__c" minOccurs="0"/>
 *         &lt;element name="SSO_Override_Indicator__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Series_Expiration_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ServiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Short_Product_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Show_After_Text__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Show_Before_Text__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Subscription_Term__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Subscription_Term__r" type="{urn:sobject.enterprise.soap.sforce.com}Product_Subscription__c" minOccurs="0"/>
 *         &lt;element name="Substituted_Product__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Term_Duration__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Term_End_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Term_List_Price__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Term_Start_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Term_Unit__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title_Available_Date__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Title_Status_Code__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Tracking_Number__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tree_Sort_Order__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Uncontrolled_Cost__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Uncontrolled_Ext_Net_Price__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="User_Discount_Amt__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Virtual_Sample_URL__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Virtual_Sample__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Winning_Publisher__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Won_Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cs_edits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="order_line_item_type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="order_submitted__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunityLineItem", propOrder = {
    "afterTextC",
    "altEnrollCalcModifierC",
    "bomUsageC",
    "backendAddFlagC",
    "beforeTextC",
    "beginningGradeLevelC",
    "cpoQtyCalcRatioC",
    "cpoQuantityC",
    "chargeStatusC",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "consolidatedPHLDescC",
    "couponCodePDFlagC",
    "couponCodePDIndicatorC",
    "couponCodeSEFlagC",
    "couponCodeSEIndicatorC",
    "couponCodeC",
    "couponCodeR",
    "couponDiscountAmtC",
    "createdBy",
    "createdById",
    "createdDate",
    "customSortOrderC",
    "customerMaterialDescriptionC",
    "deleteFromQuoteC",
    "deliveredNondeliveredC",
    "description",
    "discountC",
    "division",
    "emailAddressRequiredFormulaC",
    "emailAddressRequiredC",
    "endingGradeLevelC",
    "enrollCalcModifierC",
    "enterpriseProductC",
    "errorTextC",
    "extCouponDiscountAmtC",
    "extSalePriceAmtC",
    "extendedWaucCostC",
    "fullPHL2DescC",
    "fullPHL3DescC",
    "isbn13C",
    "isbnCHKC",
    "isbnC",
    "impSubmittedQtyC",
    "impUnsubmittedQtyC",
    "isDeleted",
    "isContractPriceC",
    "isImplementedC",
    "isSubscriptionTermLockedC",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastShippedDateC",
    "lastUpdateDateC",
    "lineCCRatioIndicatorC",
    "lineItemBlockDescriptionC",
    "lineItemResearchStatusC",
    "lineItemStatusC",
    "lineNumberC",
    "listPrice",
    "lostAmountC",
    "lostToProgramIdC",
    "lostToProgramIdR",
    "marketPriceC",
    "marketQuantityC",
    "marketTotalPriceC",
    "openAmountC",
    "opportunity",
    "opportunityId",
    "opportunityLineSchoolTypeC",
    "optionAllocationPercentC",
    "originalSFARepIDC",
    "postponedCancelledAmountC",
    "priceOverrideFlagC",
    "pricebookEntry",
    "pricebookEntryId",
    "productOwnershipOfRecordC",
    "proposalTreeIdC",
    "proposalTreeIdR",
    "quantity",
    "quantityBackorderedC",
    "quantityCalculationMethodC",
    "quantityInvoicedC",
    "quantityMaxC",
    "quantityMinC",
    "quantityRejectedC",
    "quantityShippedC",
    "quotedDiscountC",
    "quotedExtNetPriceC",
    "quotedExtSavingsC",
    "quotedListPriceC",
    "quotedNetPriceC",
    "quotedQuantityC",
    "quotedSalePriceC",
    "realignedSFARepIDC",
    "requireManagerSampleApprovalC",
    "requirePDApprovalC",
    "ssoApprovedC",
    "ssoControlGroupIdWorkAroundCopyC",
    "ssoControlGroupIdC",
    "ssoControlGroupIdR",
    "ssoOverrideIndicatorC",
    "seriesExpirationDateC",
    "serviceDate",
    "shortProductCodeC",
    "showAfterTextC",
    "showBeforeTextC",
    "sortOrder",
    "subscriptionTermC",
    "subscriptionTermR",
    "substitutedProductC",
    "systemModstamp",
    "termDurationC",
    "termEndDateC",
    "termListPriceC",
    "termStartDateC",
    "termUnitC",
    "titleAvailableDateC",
    "titleStatusCodeC",
    "totalPrice",
    "trackingNumberC",
    "treeSortOrderC",
    "uncontrolledCostC",
    "uncontrolledExtNetPriceC",
    "unitPrice",
    "userDiscountAmtC",
    "virtualSampleURLC",
    "virtualSampleC",
    "winningPublisherC",
    "wonAmountC",
    "csEditsC",
    "orderLineItemTypeC",
    "orderSubmittedC"
})
public class OpportunityLineItemType
    extends SObjectType
{

    @XmlElement(name = "After_Text__c", nillable = true)
    protected String afterTextC;
    @XmlElement(name = "Alt_Enroll_Calc_Modifier__c", nillable = true)
    protected Double altEnrollCalcModifierC;
    @XmlElement(name = "BOM_Usage__c", nillable = true)
    protected String bomUsageC;
    @XmlElement(name = "BackendAddFlag__c", nillable = true)
    protected Boolean backendAddFlagC;
    @XmlElement(name = "Before_Text__c", nillable = true)
    protected String beforeTextC;
    @XmlElement(name = "Beginning_Grade_Level__c", nillable = true)
    protected String beginningGradeLevelC;
    @XmlElement(name = "CPO_Qty_Calc_Ratio__c", nillable = true)
    protected Double cpoQtyCalcRatioC;
    @XmlElement(name = "CPO_Quantity__c", nillable = true)
    protected Double cpoQuantityC;
    @XmlElement(name = "Charge_Status__c", nillable = true)
    protected String chargeStatusC;
    @XmlElement(name = "ConnectionReceived", nillable = true)
    protected PartnerNetworkConnectionType connectionReceived;
    @XmlElement(name = "ConnectionReceivedId", nillable = true)
    protected String connectionReceivedId;
    @XmlElement(name = "ConnectionSent", nillable = true)
    protected PartnerNetworkConnectionType connectionSent;
    @XmlElement(name = "ConnectionSentId", nillable = true)
    protected String connectionSentId;
    @XmlElement(name = "Consolidated_PHL_Desc__c", nillable = true)
    protected String consolidatedPHLDescC;
    @XmlElement(name = "Coupon_Code_PD_Flag__c", nillable = true)
    protected Boolean couponCodePDFlagC;
    @XmlElement(name = "Coupon_Code_PD_Indicator__c", nillable = true)
    protected String couponCodePDIndicatorC;
    @XmlElement(name = "Coupon_Code_SE_Flag__c", nillable = true)
    protected Boolean couponCodeSEFlagC;
    @XmlElement(name = "Coupon_Code_SE_Indicator__c", nillable = true)
    protected String couponCodeSEIndicatorC;
    @XmlElement(name = "Coupon_Code__c", nillable = true)
    protected String couponCodeC;
    @XmlElement(name = "Coupon_Code__r", nillable = true)
    protected Coupon_Codes__CType couponCodeR;
    @XmlElement(name = "Coupon_Discount_Amt__c", nillable = true)
    protected Double couponDiscountAmtC;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Custom_Sort_Order__c", nillable = true)
    protected Double customSortOrderC;
    @XmlElement(name = "Customer_Material_Description__c", nillable = true)
    protected String customerMaterialDescriptionC;
    @XmlElement(name = "Delete_from_Quote__c", nillable = true)
    protected Boolean deleteFromQuoteC;
    @XmlElement(name = "Delivered_nondelivered__c", nillable = true)
    protected Boolean deliveredNondeliveredC;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "Discount__c", nillable = true)
    protected Double discountC;
    @XmlElement(name = "Division", nillable = true)
    protected String division;
    @XmlElement(name = "Email_Address_Required_Formula__c", nillable = true)
    protected String emailAddressRequiredFormulaC;
    @XmlElement(name = "Email_Address_Required__c", nillable = true)
    protected String emailAddressRequiredC;
    @XmlElement(name = "Ending_Grade_Level__c", nillable = true)
    protected String endingGradeLevelC;
    @XmlElement(name = "Enroll_Calc_Modifier__c", nillable = true)
    protected Double enrollCalcModifierC;
    @XmlElement(name = "Enterprise_Product__c", nillable = true)
    protected Boolean enterpriseProductC;
    @XmlElement(name = "Error_Text__c", nillable = true)
    protected String errorTextC;
    @XmlElement(name = "Ext_Coupon_Discount_Amt__c", nillable = true)
    protected Double extCouponDiscountAmtC;
    @XmlElement(name = "Ext_Sale_Price_Amt__c", nillable = true)
    protected Double extSalePriceAmtC;
    @XmlElement(name = "Extended_Wauc_Cost__c", nillable = true)
    protected Double extendedWaucCostC;
    @XmlElement(name = "Full_PHL_2_Desc__c", nillable = true)
    protected String fullPHL2DescC;
    @XmlElement(name = "Full_PHL_3_Desc__c", nillable = true)
    protected String fullPHL3DescC;
    @XmlElement(name = "ISBN_13__c", nillable = true)
    protected String isbn13C;
    @XmlElement(name = "ISBN_CHK__c", nillable = true)
    protected String isbnCHKC;
    @XmlElement(name = "ISBN__c", nillable = true)
    protected String isbnC;
    @XmlElement(name = "Imp_Submitted_Qty__c", nillable = true)
    protected Double impSubmittedQtyC;
    @XmlElement(name = "Imp_Unsubmitted_Qty__c", nillable = true)
    protected Double impUnsubmittedQtyC;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "Is_Contract_Price__c", nillable = true)
    protected Boolean isContractPriceC;
    @XmlElement(name = "Is_Implemented__c", nillable = true)
    protected Boolean isImplementedC;
    @XmlElement(name = "Is_Subscription_Term_Locked__c", nillable = true)
    protected Boolean isSubscriptionTermLockedC;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Last_Shipped_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastShippedDateC;
    @XmlElement(name = "Last_Update_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDateC;
    @XmlElement(name = "Line_CC_Ratio_Indicator__c", nillable = true)
    protected String lineCCRatioIndicatorC;
    @XmlElement(name = "Line_Item_Block_Description__c", nillable = true)
    protected String lineItemBlockDescriptionC;
    @XmlElement(name = "Line_Item_Research_Status__c", nillable = true)
    protected String lineItemResearchStatusC;
    @XmlElement(name = "Line_Item_Status__c", nillable = true)
    protected String lineItemStatusC;
    @XmlElement(name = "Line_Number__c", nillable = true)
    protected Double lineNumberC;
    @XmlElement(name = "ListPrice", nillable = true)
    protected Double listPrice;
    @XmlElement(name = "Lost_Amount__c", nillable = true)
    protected Double lostAmountC;
    @XmlElement(name = "Lost_to_Program_Id__c", nillable = true)
    protected String lostToProgramIdC;
    @XmlElement(name = "Lost_to_Program_Id__r", nillable = true)
    protected Competitor_Offering__CType lostToProgramIdR;
    @XmlElement(name = "Market_Price__c", nillable = true)
    protected Double marketPriceC;
    @XmlElement(name = "Market_Quantity__c", nillable = true)
    protected Double marketQuantityC;
    @XmlElement(name = "Market_Total_Price__c", nillable = true)
    protected Double marketTotalPriceC;
    @XmlElement(name = "Open_Amount__c", nillable = true)
    protected Double openAmountC;
    @XmlElement(name = "Opportunity", nillable = true)
    protected OpportunityType opportunity;
    @XmlElement(name = "OpportunityId", nillable = true)
    protected String opportunityId;
    @XmlElement(name = "Opportunity_Line_School_Type__c", nillable = true)
    protected String opportunityLineSchoolTypeC;
    @XmlElement(name = "Option_Allocation_Percent__c", nillable = true)
    protected Double optionAllocationPercentC;
    @XmlElement(name = "Original_SFA_Rep_ID__c", nillable = true)
    protected String originalSFARepIDC;
    @XmlElement(name = "Postponed_Cancelled_Amount__c", nillable = true)
    protected Double postponedCancelledAmountC;
    @XmlElement(name = "Price_Override_Flag__c", nillable = true)
    protected Boolean priceOverrideFlagC;
    @XmlElement(name = "PricebookEntry", nillable = true)
    protected PricebookEntryType pricebookEntry;
    @XmlElement(name = "PricebookEntryId", nillable = true)
    protected String pricebookEntryId;
    @XmlElement(name = "Product_Ownership_of_record__c", nillable = true)
    protected String productOwnershipOfRecordC;
    @XmlElement(name = "Proposal_Tree_Id__c", nillable = true)
    protected String proposalTreeIdC;
    @XmlElement(name = "Proposal_Tree_Id__r", nillable = true)
    protected Proposal_Tree__CType proposalTreeIdR;
    @XmlElement(name = "Quantity", nillable = true)
    protected Double quantity;
    @XmlElement(name = "Quantity_Backordered__c", nillable = true)
    protected Double quantityBackorderedC;
    @XmlElement(name = "Quantity_Calculation_Method__c", nillable = true)
    protected String quantityCalculationMethodC;
    @XmlElement(name = "Quantity_Invoiced__c", nillable = true)
    protected Double quantityInvoicedC;
    @XmlElement(name = "Quantity_Max__c", nillable = true)
    protected Double quantityMaxC;
    @XmlElement(name = "Quantity_Min__c", nillable = true)
    protected Double quantityMinC;
    @XmlElement(name = "Quantity_Rejected__c", nillable = true)
    protected Double quantityRejectedC;
    @XmlElement(name = "Quantity_Shipped__c", nillable = true)
    protected Double quantityShippedC;
    @XmlElement(name = "Quoted_Discount__c", nillable = true)
    protected Double quotedDiscountC;
    @XmlElement(name = "Quoted_Ext_Net_Price__c", nillable = true)
    protected Double quotedExtNetPriceC;
    @XmlElement(name = "Quoted_Ext_Savings__c", nillable = true)
    protected Double quotedExtSavingsC;
    @XmlElement(name = "Quoted_List_Price__c", nillable = true)
    protected Double quotedListPriceC;
    @XmlElement(name = "Quoted_Net_Price__c", nillable = true)
    protected Double quotedNetPriceC;
    @XmlElement(name = "Quoted_Quantity__c", nillable = true)
    protected Double quotedQuantityC;
    @XmlElement(name = "Quoted_Sale_Price__c", nillable = true)
    protected Double quotedSalePriceC;
    @XmlElement(name = "Realigned_SFA_Rep_ID__c", nillable = true)
    protected String realignedSFARepIDC;
    @XmlElement(name = "Require_Manager_Sample_Approval__c", nillable = true)
    protected Boolean requireManagerSampleApprovalC;
    @XmlElement(name = "Require_PD_Approval__c", nillable = true)
    protected Boolean requirePDApprovalC;
    @XmlElement(name = "SSO_Approved__c", nillable = true)
    protected Boolean ssoApprovedC;
    @XmlElement(name = "SSO_Control_Group_Id_Work_Around_Copy__c", nillable = true)
    protected String ssoControlGroupIdWorkAroundCopyC;
    @XmlElement(name = "SSO_Control_Group_Id__c", nillable = true)
    protected String ssoControlGroupIdC;
    @XmlElement(name = "SSO_Control_Group_Id__r", nillable = true)
    protected CP_Control_Groups__CType ssoControlGroupIdR;
    @XmlElement(name = "SSO_Override_Indicator__c", nillable = true)
    protected String ssoOverrideIndicatorC;
    @XmlElement(name = "Series_Expiration_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar seriesExpirationDateC;
    @XmlElement(name = "ServiceDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serviceDate;
    @XmlElement(name = "Short_Product_Code__c", nillable = true)
    protected String shortProductCodeC;
    @XmlElement(name = "Show_After_Text__c", nillable = true)
    protected Boolean showAfterTextC;
    @XmlElement(name = "Show_Before_Text__c", nillable = true)
    protected Boolean showBeforeTextC;
    @XmlElement(name = "SortOrder", nillable = true)
    protected Integer sortOrder;
    @XmlElement(name = "Subscription_Term__c", nillable = true)
    protected String subscriptionTermC;
    @XmlElement(name = "Subscription_Term__r", nillable = true)
    protected Product_Subscription__CType subscriptionTermR;
    @XmlElement(name = "Substituted_Product__c", nillable = true)
    protected String substitutedProductC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Term_Duration__c", nillable = true)
    protected Double termDurationC;
    @XmlElement(name = "Term_End_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termEndDateC;
    @XmlElement(name = "Term_List_Price__c", nillable = true)
    protected Double termListPriceC;
    @XmlElement(name = "Term_Start_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termStartDateC;
    @XmlElement(name = "Term_Unit__c", nillable = true)
    protected String termUnitC;
    @XmlElement(name = "Title_Available_Date__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar titleAvailableDateC;
    @XmlElement(name = "Title_Status_Code__c", nillable = true)
    protected String titleStatusCodeC;
    @XmlElement(name = "TotalPrice", nillable = true)
    protected Double totalPrice;
    @XmlElement(name = "Tracking_Number__c", nillable = true)
    protected String trackingNumberC;
    @XmlElement(name = "Tree_Sort_Order__c", nillable = true)
    protected Double treeSortOrderC;
    @XmlElement(name = "Uncontrolled_Cost__c", nillable = true)
    protected Double uncontrolledCostC;
    @XmlElement(name = "Uncontrolled_Ext_Net_Price__c", nillable = true)
    protected Double uncontrolledExtNetPriceC;
    @XmlElement(name = "UnitPrice", nillable = true)
    protected Double unitPrice;
    @XmlElement(name = "User_Discount_Amt__c", nillable = true)
    protected Double userDiscountAmtC;
    @XmlElement(name = "Virtual_Sample_URL__c", nillable = true)
    protected String virtualSampleURLC;
    @XmlElement(name = "Virtual_Sample__c", nillable = true)
    protected Boolean virtualSampleC;
    @XmlElement(name = "Winning_Publisher__c", nillable = true)
    protected String winningPublisherC;
    @XmlElement(name = "Won_Amount__c", nillable = true)
    protected Double wonAmountC;
    @XmlElement(name = "cs_edits__c", nillable = true)
    protected String csEditsC;
    @XmlElement(name = "order_line_item_type__c", nillable = true)
    protected String orderLineItemTypeC;
    @XmlElement(name = "order_submitted__c", nillable = true)
    protected String orderSubmittedC;

    /**
     * Gets the value of the after_Text__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfter_Text__C() {
        return afterTextC;
    }

    /**
     * Sets the value of the after_Text__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfter_Text__C(String value) {
        this.afterTextC = value;
    }

    /**
     * Gets the value of the alt_Enroll_Calc_Modifier__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAlt_Enroll_Calc_Modifier__C() {
        return altEnrollCalcModifierC;
    }

    /**
     * Sets the value of the alt_Enroll_Calc_Modifier__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAlt_Enroll_Calc_Modifier__C(Double value) {
        this.altEnrollCalcModifierC = value;
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
     * Gets the value of the backendAddFlag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackendAddFlag__C() {
        return backendAddFlagC;
    }

    /**
     * Sets the value of the backendAddFlag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackendAddFlag__C(Boolean value) {
        this.backendAddFlagC = value;
    }

    /**
     * Gets the value of the before_Text__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBefore_Text__C() {
        return beforeTextC;
    }

    /**
     * Sets the value of the before_Text__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBefore_Text__C(String value) {
        this.beforeTextC = value;
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
     * Gets the value of the cpo_Qty_Calc_Ratio__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCPO_Qty_Calc_Ratio__C() {
        return cpoQtyCalcRatioC;
    }

    /**
     * Sets the value of the cpo_Qty_Calc_Ratio__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCPO_Qty_Calc_Ratio__C(Double value) {
        this.cpoQtyCalcRatioC = value;
    }

    /**
     * Gets the value of the cpo_Quantity__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCPO_Quantity__C() {
        return cpoQuantityC;
    }

    /**
     * Sets the value of the cpo_Quantity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCPO_Quantity__C(Double value) {
        this.cpoQuantityC = value;
    }

    /**
     * Gets the value of the charge_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharge_Status__C() {
        return chargeStatusC;
    }

    /**
     * Sets the value of the charge_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharge_Status__C(String value) {
        this.chargeStatusC = value;
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
     * Gets the value of the consolidated_PHL_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsolidated_PHL_Desc__C() {
        return consolidatedPHLDescC;
    }

    /**
     * Sets the value of the consolidated_PHL_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsolidated_PHL_Desc__C(String value) {
        this.consolidatedPHLDescC = value;
    }

    /**
     * Gets the value of the coupon_Code_PD_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoupon_Code_PD_Flag__C() {
        return couponCodePDFlagC;
    }

    /**
     * Sets the value of the coupon_Code_PD_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoupon_Code_PD_Flag__C(Boolean value) {
        this.couponCodePDFlagC = value;
    }

    /**
     * Gets the value of the coupon_Code_PD_Indicator__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoupon_Code_PD_Indicator__C() {
        return couponCodePDIndicatorC;
    }

    /**
     * Sets the value of the coupon_Code_PD_Indicator__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoupon_Code_PD_Indicator__C(String value) {
        this.couponCodePDIndicatorC = value;
    }

    /**
     * Gets the value of the coupon_Code_SE_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoupon_Code_SE_Flag__C() {
        return couponCodeSEFlagC;
    }

    /**
     * Sets the value of the coupon_Code_SE_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoupon_Code_SE_Flag__C(Boolean value) {
        this.couponCodeSEFlagC = value;
    }

    /**
     * Gets the value of the coupon_Code_SE_Indicator__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoupon_Code_SE_Indicator__C() {
        return couponCodeSEIndicatorC;
    }

    /**
     * Sets the value of the coupon_Code_SE_Indicator__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoupon_Code_SE_Indicator__C(String value) {
        this.couponCodeSEIndicatorC = value;
    }

    /**
     * Gets the value of the coupon_Code__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoupon_Code__C() {
        return couponCodeC;
    }

    /**
     * Sets the value of the coupon_Code__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoupon_Code__C(String value) {
        this.couponCodeC = value;
    }

    /**
     * Gets the value of the coupon_Code__R property.
     * 
     * @return
     *     possible object is
     *     {@link Coupon_Codes__CType }
     *     
     */
    public Coupon_Codes__CType getCoupon_Code__R() {
        return couponCodeR;
    }

    /**
     * Sets the value of the coupon_Code__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coupon_Codes__CType }
     *     
     */
    public void setCoupon_Code__R(Coupon_Codes__CType value) {
        this.couponCodeR = value;
    }

    /**
     * Gets the value of the coupon_Discount_Amt__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoupon_Discount_Amt__C() {
        return couponDiscountAmtC;
    }

    /**
     * Sets the value of the coupon_Discount_Amt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoupon_Discount_Amt__C(Double value) {
        this.couponDiscountAmtC = value;
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
     * Gets the value of the custom_Sort_Order__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCustom_Sort_Order__C() {
        return customSortOrderC;
    }

    /**
     * Sets the value of the custom_Sort_Order__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCustom_Sort_Order__C(Double value) {
        this.customSortOrderC = value;
    }

    /**
     * Gets the value of the customer_Material_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer_Material_Description__C() {
        return customerMaterialDescriptionC;
    }

    /**
     * Sets the value of the customer_Material_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer_Material_Description__C(String value) {
        this.customerMaterialDescriptionC = value;
    }

    /**
     * Gets the value of the delete_From_Quote__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete_From_Quote__C() {
        return deleteFromQuoteC;
    }

    /**
     * Sets the value of the delete_From_Quote__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete_From_Quote__C(Boolean value) {
        this.deleteFromQuoteC = value;
    }

    /**
     * Gets the value of the delivered_Nondelivered__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelivered_Nondelivered__C() {
        return deliveredNondeliveredC;
    }

    /**
     * Sets the value of the delivered_Nondelivered__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelivered_Nondelivered__C(Boolean value) {
        this.deliveredNondeliveredC = value;
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
     * Gets the value of the email_Address_Required_Formula__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail_Address_Required_Formula__C() {
        return emailAddressRequiredFormulaC;
    }

    /**
     * Sets the value of the email_Address_Required_Formula__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail_Address_Required_Formula__C(String value) {
        this.emailAddressRequiredFormulaC = value;
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
     * Gets the value of the enroll_Calc_Modifier__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEnroll_Calc_Modifier__C() {
        return enrollCalcModifierC;
    }

    /**
     * Sets the value of the enroll_Calc_Modifier__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEnroll_Calc_Modifier__C(Double value) {
        this.enrollCalcModifierC = value;
    }

    /**
     * Gets the value of the enterprise_Product__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnterprise_Product__C() {
        return enterpriseProductC;
    }

    /**
     * Sets the value of the enterprise_Product__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnterprise_Product__C(Boolean value) {
        this.enterpriseProductC = value;
    }

    /**
     * Gets the value of the error_Text__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError_Text__C() {
        return errorTextC;
    }

    /**
     * Sets the value of the error_Text__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError_Text__C(String value) {
        this.errorTextC = value;
    }

    /**
     * Gets the value of the ext_Coupon_Discount_Amt__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExt_Coupon_Discount_Amt__C() {
        return extCouponDiscountAmtC;
    }

    /**
     * Sets the value of the ext_Coupon_Discount_Amt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExt_Coupon_Discount_Amt__C(Double value) {
        this.extCouponDiscountAmtC = value;
    }

    /**
     * Gets the value of the ext_Sale_Price_Amt__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExt_Sale_Price_Amt__C() {
        return extSalePriceAmtC;
    }

    /**
     * Sets the value of the ext_Sale_Price_Amt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExt_Sale_Price_Amt__C(Double value) {
        this.extSalePriceAmtC = value;
    }

    /**
     * Gets the value of the extended_Wauc_Cost__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExtended_Wauc_Cost__C() {
        return extendedWaucCostC;
    }

    /**
     * Sets the value of the extended_Wauc_Cost__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExtended_Wauc_Cost__C(Double value) {
        this.extendedWaucCostC = value;
    }

    /**
     * Gets the value of the full_PHL_2_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFull_PHL_2_Desc__C() {
        return fullPHL2DescC;
    }

    /**
     * Sets the value of the full_PHL_2_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFull_PHL_2_Desc__C(String value) {
        this.fullPHL2DescC = value;
    }

    /**
     * Gets the value of the full_PHL_3_Desc__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFull_PHL_3_Desc__C() {
        return fullPHL3DescC;
    }

    /**
     * Sets the value of the full_PHL_3_Desc__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFull_PHL_3_Desc__C(String value) {
        this.fullPHL3DescC = value;
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
     * Gets the value of the isbn_CHK__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN_CHK__C() {
        return isbnCHKC;
    }

    /**
     * Sets the value of the isbn_CHK__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN_CHK__C(String value) {
        this.isbnCHKC = value;
    }

    /**
     * Gets the value of the isbn__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN__C() {
        return isbnC;
    }

    /**
     * Sets the value of the isbn__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN__C(String value) {
        this.isbnC = value;
    }

    /**
     * Gets the value of the imp_Submitted_Qty__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImp_Submitted_Qty__C() {
        return impSubmittedQtyC;
    }

    /**
     * Sets the value of the imp_Submitted_Qty__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImp_Submitted_Qty__C(Double value) {
        this.impSubmittedQtyC = value;
    }

    /**
     * Gets the value of the imp_Unsubmitted_Qty__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImp_Unsubmitted_Qty__C() {
        return impUnsubmittedQtyC;
    }

    /**
     * Sets the value of the imp_Unsubmitted_Qty__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImp_Unsubmitted_Qty__C(Double value) {
        this.impUnsubmittedQtyC = value;
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
     * Gets the value of the is_Contract_Price__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIs_Contract_Price__C() {
        return isContractPriceC;
    }

    /**
     * Sets the value of the is_Contract_Price__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIs_Contract_Price__C(Boolean value) {
        this.isContractPriceC = value;
    }

    /**
     * Gets the value of the is_Implemented__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIs_Implemented__C() {
        return isImplementedC;
    }

    /**
     * Sets the value of the is_Implemented__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIs_Implemented__C(Boolean value) {
        this.isImplementedC = value;
    }

    /**
     * Gets the value of the is_Subscription_Term_Locked__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIs_Subscription_Term_Locked__C() {
        return isSubscriptionTermLockedC;
    }

    /**
     * Sets the value of the is_Subscription_Term_Locked__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIs_Subscription_Term_Locked__C(Boolean value) {
        this.isSubscriptionTermLockedC = value;
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
     * Gets the value of the last_Shipped_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLast_Shipped_Date__C() {
        return lastShippedDateC;
    }

    /**
     * Sets the value of the last_Shipped_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLast_Shipped_Date__C(XMLGregorianCalendar value) {
        this.lastShippedDateC = value;
    }

    /**
     * Gets the value of the last_Update_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLast_Update_Date__C() {
        return lastUpdateDateC;
    }

    /**
     * Sets the value of the last_Update_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLast_Update_Date__C(XMLGregorianCalendar value) {
        this.lastUpdateDateC = value;
    }

    /**
     * Gets the value of the line_CC_Ratio_Indicator__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine_CC_Ratio_Indicator__C() {
        return lineCCRatioIndicatorC;
    }

    /**
     * Sets the value of the line_CC_Ratio_Indicator__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine_CC_Ratio_Indicator__C(String value) {
        this.lineCCRatioIndicatorC = value;
    }

    /**
     * Gets the value of the line_Item_Block_Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine_Item_Block_Description__C() {
        return lineItemBlockDescriptionC;
    }

    /**
     * Sets the value of the line_Item_Block_Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine_Item_Block_Description__C(String value) {
        this.lineItemBlockDescriptionC = value;
    }

    /**
     * Gets the value of the line_Item_Research_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine_Item_Research_Status__C() {
        return lineItemResearchStatusC;
    }

    /**
     * Sets the value of the line_Item_Research_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine_Item_Research_Status__C(String value) {
        this.lineItemResearchStatusC = value;
    }

    /**
     * Gets the value of the line_Item_Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine_Item_Status__C() {
        return lineItemStatusC;
    }

    /**
     * Sets the value of the line_Item_Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine_Item_Status__C(String value) {
        this.lineItemStatusC = value;
    }

    /**
     * Gets the value of the line_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLine_Number__C() {
        return lineNumberC;
    }

    /**
     * Sets the value of the line_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLine_Number__C(Double value) {
        this.lineNumberC = value;
    }

    /**
     * Gets the value of the listPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getListPrice() {
        return listPrice;
    }

    /**
     * Sets the value of the listPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setListPrice(Double value) {
        this.listPrice = value;
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
     * Gets the value of the lost_To_Program_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLost_To_Program_Id__C() {
        return lostToProgramIdC;
    }

    /**
     * Sets the value of the lost_To_Program_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLost_To_Program_Id__C(String value) {
        this.lostToProgramIdC = value;
    }

    /**
     * Gets the value of the lost_To_Program_Id__R property.
     * 
     * @return
     *     possible object is
     *     {@link Competitor_Offering__CType }
     *     
     */
    public Competitor_Offering__CType getLost_To_Program_Id__R() {
        return lostToProgramIdR;
    }

    /**
     * Sets the value of the lost_To_Program_Id__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Competitor_Offering__CType }
     *     
     */
    public void setLost_To_Program_Id__R(Competitor_Offering__CType value) {
        this.lostToProgramIdR = value;
    }

    /**
     * Gets the value of the market_Price__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMarket_Price__C() {
        return marketPriceC;
    }

    /**
     * Sets the value of the market_Price__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMarket_Price__C(Double value) {
        this.marketPriceC = value;
    }

    /**
     * Gets the value of the market_Quantity__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMarket_Quantity__C() {
        return marketQuantityC;
    }

    /**
     * Sets the value of the market_Quantity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMarket_Quantity__C(Double value) {
        this.marketQuantityC = value;
    }

    /**
     * Gets the value of the market_Total_Price__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMarket_Total_Price__C() {
        return marketTotalPriceC;
    }

    /**
     * Sets the value of the market_Total_Price__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMarket_Total_Price__C(Double value) {
        this.marketTotalPriceC = value;
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
     * Gets the value of the opportunity property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityType }
     *     
     */
    public OpportunityType getOpportunity() {
        return opportunity;
    }

    /**
     * Sets the value of the opportunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityType }
     *     
     */
    public void setOpportunity(OpportunityType value) {
        this.opportunity = value;
    }

    /**
     * Gets the value of the opportunityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityId() {
        return opportunityId;
    }

    /**
     * Sets the value of the opportunityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityId(String value) {
        this.opportunityId = value;
    }

    /**
     * Gets the value of the opportunity_Line_School_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunity_Line_School_Type__C() {
        return opportunityLineSchoolTypeC;
    }

    /**
     * Sets the value of the opportunity_Line_School_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunity_Line_School_Type__C(String value) {
        this.opportunityLineSchoolTypeC = value;
    }

    /**
     * Gets the value of the option_Allocation_Percent__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOption_Allocation_Percent__C() {
        return optionAllocationPercentC;
    }

    /**
     * Sets the value of the option_Allocation_Percent__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOption_Allocation_Percent__C(Double value) {
        this.optionAllocationPercentC = value;
    }

    /**
     * Gets the value of the original_SFA_Rep_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginal_SFA_Rep_ID__C() {
        return originalSFARepIDC;
    }

    /**
     * Sets the value of the original_SFA_Rep_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginal_SFA_Rep_ID__C(String value) {
        this.originalSFARepIDC = value;
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
     * Gets the value of the price_Override_Flag__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrice_Override_Flag__C() {
        return priceOverrideFlagC;
    }

    /**
     * Sets the value of the price_Override_Flag__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrice_Override_Flag__C(Boolean value) {
        this.priceOverrideFlagC = value;
    }

    /**
     * Gets the value of the pricebookEntry property.
     * 
     * @return
     *     possible object is
     *     {@link PricebookEntryType }
     *     
     */
    public PricebookEntryType getPricebookEntry() {
        return pricebookEntry;
    }

    /**
     * Sets the value of the pricebookEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricebookEntryType }
     *     
     */
    public void setPricebookEntry(PricebookEntryType value) {
        this.pricebookEntry = value;
    }

    /**
     * Gets the value of the pricebookEntryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricebookEntryId() {
        return pricebookEntryId;
    }

    /**
     * Sets the value of the pricebookEntryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricebookEntryId(String value) {
        this.pricebookEntryId = value;
    }

    /**
     * Gets the value of the product_Ownership_Of_Record__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct_Ownership_Of_Record__C() {
        return productOwnershipOfRecordC;
    }

    /**
     * Sets the value of the product_Ownership_Of_Record__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct_Ownership_Of_Record__C(String value) {
        this.productOwnershipOfRecordC = value;
    }

    /**
     * Gets the value of the proposal_Tree_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposal_Tree_Id__C() {
        return proposalTreeIdC;
    }

    /**
     * Sets the value of the proposal_Tree_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposal_Tree_Id__C(String value) {
        this.proposalTreeIdC = value;
    }

    /**
     * Gets the value of the proposal_Tree_Id__R property.
     * 
     * @return
     *     possible object is
     *     {@link Proposal_Tree__CType }
     *     
     */
    public Proposal_Tree__CType getProposal_Tree_Id__R() {
        return proposalTreeIdR;
    }

    /**
     * Sets the value of the proposal_Tree_Id__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proposal_Tree__CType }
     *     
     */
    public void setProposal_Tree_Id__R(Proposal_Tree__CType value) {
        this.proposalTreeIdR = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity(Double value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the quantity_Backordered__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity_Backordered__C() {
        return quantityBackorderedC;
    }

    /**
     * Sets the value of the quantity_Backordered__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity_Backordered__C(Double value) {
        this.quantityBackorderedC = value;
    }

    /**
     * Gets the value of the quantity_Calculation_Method__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity_Calculation_Method__C() {
        return quantityCalculationMethodC;
    }

    /**
     * Sets the value of the quantity_Calculation_Method__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity_Calculation_Method__C(String value) {
        this.quantityCalculationMethodC = value;
    }

    /**
     * Gets the value of the quantity_Invoiced__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity_Invoiced__C() {
        return quantityInvoicedC;
    }

    /**
     * Sets the value of the quantity_Invoiced__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity_Invoiced__C(Double value) {
        this.quantityInvoicedC = value;
    }

    /**
     * Gets the value of the quantity_Max__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity_Max__C() {
        return quantityMaxC;
    }

    /**
     * Sets the value of the quantity_Max__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity_Max__C(Double value) {
        this.quantityMaxC = value;
    }

    /**
     * Gets the value of the quantity_Min__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity_Min__C() {
        return quantityMinC;
    }

    /**
     * Sets the value of the quantity_Min__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity_Min__C(Double value) {
        this.quantityMinC = value;
    }

    /**
     * Gets the value of the quantity_Rejected__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity_Rejected__C() {
        return quantityRejectedC;
    }

    /**
     * Sets the value of the quantity_Rejected__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity_Rejected__C(Double value) {
        this.quantityRejectedC = value;
    }

    /**
     * Gets the value of the quantity_Shipped__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity_Shipped__C() {
        return quantityShippedC;
    }

    /**
     * Sets the value of the quantity_Shipped__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity_Shipped__C(Double value) {
        this.quantityShippedC = value;
    }

    /**
     * Gets the value of the quoted_Discount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuoted_Discount__C() {
        return quotedDiscountC;
    }

    /**
     * Sets the value of the quoted_Discount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuoted_Discount__C(Double value) {
        this.quotedDiscountC = value;
    }

    /**
     * Gets the value of the quoted_Ext_Net_Price__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuoted_Ext_Net_Price__C() {
        return quotedExtNetPriceC;
    }

    /**
     * Sets the value of the quoted_Ext_Net_Price__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuoted_Ext_Net_Price__C(Double value) {
        this.quotedExtNetPriceC = value;
    }

    /**
     * Gets the value of the quoted_Ext_Savings__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuoted_Ext_Savings__C() {
        return quotedExtSavingsC;
    }

    /**
     * Sets the value of the quoted_Ext_Savings__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuoted_Ext_Savings__C(Double value) {
        this.quotedExtSavingsC = value;
    }

    /**
     * Gets the value of the quoted_List_Price__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuoted_List_Price__C() {
        return quotedListPriceC;
    }

    /**
     * Sets the value of the quoted_List_Price__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuoted_List_Price__C(Double value) {
        this.quotedListPriceC = value;
    }

    /**
     * Gets the value of the quoted_Net_Price__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuoted_Net_Price__C() {
        return quotedNetPriceC;
    }

    /**
     * Sets the value of the quoted_Net_Price__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuoted_Net_Price__C(Double value) {
        this.quotedNetPriceC = value;
    }

    /**
     * Gets the value of the quoted_Quantity__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuoted_Quantity__C() {
        return quotedQuantityC;
    }

    /**
     * Sets the value of the quoted_Quantity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuoted_Quantity__C(Double value) {
        this.quotedQuantityC = value;
    }

    /**
     * Gets the value of the quoted_Sale_Price__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuoted_Sale_Price__C() {
        return quotedSalePriceC;
    }

    /**
     * Sets the value of the quoted_Sale_Price__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuoted_Sale_Price__C(Double value) {
        this.quotedSalePriceC = value;
    }

    /**
     * Gets the value of the realigned_SFA_Rep_ID__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealigned_SFA_Rep_ID__C() {
        return realignedSFARepIDC;
    }

    /**
     * Sets the value of the realigned_SFA_Rep_ID__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealigned_SFA_Rep_ID__C(String value) {
        this.realignedSFARepIDC = value;
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
     * Gets the value of the sso_Approved__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSSO_Approved__C() {
        return ssoApprovedC;
    }

    /**
     * Sets the value of the sso_Approved__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSSO_Approved__C(Boolean value) {
        this.ssoApprovedC = value;
    }

    /**
     * Gets the value of the sso_Control_Group_Id_Work_Around_Copy__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSO_Control_Group_Id_Work_Around_Copy__C() {
        return ssoControlGroupIdWorkAroundCopyC;
    }

    /**
     * Sets the value of the sso_Control_Group_Id_Work_Around_Copy__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSO_Control_Group_Id_Work_Around_Copy__C(String value) {
        this.ssoControlGroupIdWorkAroundCopyC = value;
    }

    /**
     * Gets the value of the sso_Control_Group_Id__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSO_Control_Group_Id__C() {
        return ssoControlGroupIdC;
    }

    /**
     * Sets the value of the sso_Control_Group_Id__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSO_Control_Group_Id__C(String value) {
        this.ssoControlGroupIdC = value;
    }

    /**
     * Gets the value of the sso_Control_Group_Id__R property.
     * 
     * @return
     *     possible object is
     *     {@link CP_Control_Groups__CType }
     *     
     */
    public CP_Control_Groups__CType getSSO_Control_Group_Id__R() {
        return ssoControlGroupIdR;
    }

    /**
     * Sets the value of the sso_Control_Group_Id__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link CP_Control_Groups__CType }
     *     
     */
    public void setSSO_Control_Group_Id__R(CP_Control_Groups__CType value) {
        this.ssoControlGroupIdR = value;
    }

    /**
     * Gets the value of the sso_Override_Indicator__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSO_Override_Indicator__C() {
        return ssoOverrideIndicatorC;
    }

    /**
     * Sets the value of the sso_Override_Indicator__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSO_Override_Indicator__C(String value) {
        this.ssoOverrideIndicatorC = value;
    }

    /**
     * Gets the value of the series_Expiration_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeries_Expiration_Date__C() {
        return seriesExpirationDateC;
    }

    /**
     * Sets the value of the series_Expiration_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeries_Expiration_Date__C(XMLGregorianCalendar value) {
        this.seriesExpirationDateC = value;
    }

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceDate(XMLGregorianCalendar value) {
        this.serviceDate = value;
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
     * Gets the value of the show_After_Text__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShow_After_Text__C() {
        return showAfterTextC;
    }

    /**
     * Sets the value of the show_After_Text__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShow_After_Text__C(Boolean value) {
        this.showAfterTextC = value;
    }

    /**
     * Gets the value of the show_Before_Text__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShow_Before_Text__C() {
        return showBeforeTextC;
    }

    /**
     * Sets the value of the show_Before_Text__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShow_Before_Text__C(Boolean value) {
        this.showBeforeTextC = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSortOrder(Integer value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the subscription_Term__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscription_Term__C() {
        return subscriptionTermC;
    }

    /**
     * Sets the value of the subscription_Term__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscription_Term__C(String value) {
        this.subscriptionTermC = value;
    }

    /**
     * Gets the value of the subscription_Term__R property.
     * 
     * @return
     *     possible object is
     *     {@link Product_Subscription__CType }
     *     
     */
    public Product_Subscription__CType getSubscription_Term__R() {
        return subscriptionTermR;
    }

    /**
     * Sets the value of the subscription_Term__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product_Subscription__CType }
     *     
     */
    public void setSubscription_Term__R(Product_Subscription__CType value) {
        this.subscriptionTermR = value;
    }

    /**
     * Gets the value of the substituted_Product__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstituted_Product__C() {
        return substitutedProductC;
    }

    /**
     * Sets the value of the substituted_Product__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstituted_Product__C(String value) {
        this.substitutedProductC = value;
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
     * Gets the value of the term_Duration__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTerm_Duration__C() {
        return termDurationC;
    }

    /**
     * Sets the value of the term_Duration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTerm_Duration__C(Double value) {
        this.termDurationC = value;
    }

    /**
     * Gets the value of the term_End_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerm_End_Date__C() {
        return termEndDateC;
    }

    /**
     * Sets the value of the term_End_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerm_End_Date__C(XMLGregorianCalendar value) {
        this.termEndDateC = value;
    }

    /**
     * Gets the value of the term_List_Price__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTerm_List_Price__C() {
        return termListPriceC;
    }

    /**
     * Sets the value of the term_List_Price__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTerm_List_Price__C(Double value) {
        this.termListPriceC = value;
    }

    /**
     * Gets the value of the term_Start_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerm_Start_Date__C() {
        return termStartDateC;
    }

    /**
     * Sets the value of the term_Start_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerm_Start_Date__C(XMLGregorianCalendar value) {
        this.termStartDateC = value;
    }

    /**
     * Gets the value of the term_Unit__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm_Unit__C() {
        return termUnitC;
    }

    /**
     * Sets the value of the term_Unit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm_Unit__C(String value) {
        this.termUnitC = value;
    }

    /**
     * Gets the value of the title_Available_Date__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTitle_Available_Date__C() {
        return titleAvailableDateC;
    }

    /**
     * Sets the value of the title_Available_Date__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTitle_Available_Date__C(XMLGregorianCalendar value) {
        this.titleAvailableDateC = value;
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
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalPrice(Double value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the tracking_Number__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTracking_Number__C() {
        return trackingNumberC;
    }

    /**
     * Sets the value of the tracking_Number__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTracking_Number__C(String value) {
        this.trackingNumberC = value;
    }

    /**
     * Gets the value of the tree_Sort_Order__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTree_Sort_Order__C() {
        return treeSortOrderC;
    }

    /**
     * Sets the value of the tree_Sort_Order__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTree_Sort_Order__C(Double value) {
        this.treeSortOrderC = value;
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
     * Gets the value of the uncontrolled_Ext_Net_Price__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUncontrolled_Ext_Net_Price__C() {
        return uncontrolledExtNetPriceC;
    }

    /**
     * Sets the value of the uncontrolled_Ext_Net_Price__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUncontrolled_Ext_Net_Price__C(Double value) {
        this.uncontrolledExtNetPriceC = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitPrice(Double value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the user_Discount_Amt__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUser_Discount_Amt__C() {
        return userDiscountAmtC;
    }

    /**
     * Sets the value of the user_Discount_Amt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUser_Discount_Amt__C(Double value) {
        this.userDiscountAmtC = value;
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
     * Gets the value of the virtual_Sample__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVirtual_Sample__C() {
        return virtualSampleC;
    }

    /**
     * Sets the value of the virtual_Sample__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVirtual_Sample__C(Boolean value) {
        this.virtualSampleC = value;
    }

    /**
     * Gets the value of the winning_Publisher__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWinning_Publisher__C() {
        return winningPublisherC;
    }

    /**
     * Sets the value of the winning_Publisher__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWinning_Publisher__C(String value) {
        this.winningPublisherC = value;
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
     * Gets the value of the cs_Edits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCs_Edits__C() {
        return csEditsC;
    }

    /**
     * Sets the value of the cs_Edits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCs_Edits__C(String value) {
        this.csEditsC = value;
    }

    /**
     * Gets the value of the order_Line_Item_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder_Line_Item_Type__C() {
        return orderLineItemTypeC;
    }

    /**
     * Sets the value of the order_Line_Item_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder_Line_Item_Type__C(String value) {
        this.orderLineItemTypeC = value;
    }

    /**
     * Gets the value of the order_Submitted__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder_Submitted__C() {
        return orderSubmittedC;
    }

    /**
     * Sets the value of the order_Submitted__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder_Submitted__C(String value) {
        this.orderSubmittedC = value;
    }

}
