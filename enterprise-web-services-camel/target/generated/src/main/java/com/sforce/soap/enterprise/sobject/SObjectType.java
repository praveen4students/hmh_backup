
package com.sforce.soap.enterprise.sobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldsToNull" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Id" type="{urn:enterprise.soap.sforce.com}ID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sObject", propOrder = {
    "fieldsToNull",
    "id"
})
@XmlSeeAlso({
    UserType.class,
    BatchProcessTask__HistoryType.class,
    ContentVersionHistoryType.class,
    PD_Notes_Legacy__CType.class,
    EventAttendeeType.class,
    QueueSobjectType.class,
    LeadType.class,
    Ities_Msg__Message__CType.class,
    EWS_Config__CType.class,
    UserProfileFeedType.class,
    CP_Control_Groups__CType.class,
    ProcessInstanceHistoryType.class,
    Market_Comment__CType.class,
    ContentDocumentFeedType.class,
    Snapshot_Opportunity__CType.class,
    RecordTypeType.class,
    KenTestCustomSetting__CType.class,
    Service_Request_Form__CType.class,
    ScontrolType.class,
    EGood_Fulfillment__CType.class,
    DashboardComponentType.class,
    FeedLikeType.class,
    ProfileType.class,
    CaseCommentType.class,
    CaseTeamMemberType.class,
    SolutionFeedType.class,
    CampaignType.class,
    UserFeedType.class,
    Project_Plan__HistoryType.class,
    WebLinkType.class,
    Release_Line_Item_Notification__CType.class,
    DocumentAttachmentMapType.class,
    TaskType.class,
    Competitor_Offering__CType.class,
    ActivityHistoryType.class,
    Per_Diem_Contractor__CType.class,
    EntitySubscriptionType.class,
    Opportunity_Line_Item_Link__CType.class,
    Product_Hierarchy__CType.class,
    PeriodType.class,
    Application_Constants__CType.class,
    CaseHistoryType.class,
    FeedItemType.class,
    Account_Scorecard__HistoryType.class,
    ApexLogType.class,
    ProcessInstanceStepType.class,
    BusinessHoursType.class,
    CustomerQualOrderBlock__CType.class,
    LeadShareType.class,
    Product2FeedType.class,
    CronTriggerType.class,
    OpportunityShareType.class,
    VoteType.class,
    Product_Set__CType.class,
    ApexComponentType.class,
    Ken_Competitor_Program__CType.class,
    AssetFeedType.class,
    Top_Accounts_Perf_Summary__CType.class,
    ProcessInstanceType.class,
    APXT_CMTR__Conga_Merge_Template__CType.class,
    Project_Plan_Resource__CType.class,
    NoteType.class,
    NewsFeedType.class,
    OpportunityLineItemType.class,
    ServiceRequestTentativeAttendee__CType.class,
    CustomerQualMapType__CType.class,
    Product_Set__HistoryType.class,
    Training_Event__HistoryType.class,
    Service_Request_Form__ShareType.class,
    Project_Plan_Resource__HistoryType.class,
    ContractStatusType.class,
    Funding_Alloc_Links__CType.class,
    CampaignMemberType.class,
    Gratis_Tolerance__HistoryType.class,
    UserTeamMemberType.class,
    OpportunityOverrideType.class,
    Product_In_Use_Hierarchy__CType.class,
    IdeaCommentType.class,
    Product_Search_Config__CType.class,
    ContentDocumentHistoryType.class,
    LeadFeedType.class,
    OpportunityCompetitorType.class,
    RSVP__CType.class,
    UserRoleType.class,
    Experianqas__QAS_Config__CType.class,
    CaseTeamTemplateMemberType.class,
    KenTest_Prototype_WIN__CType.class,
    Order_Shipments__CType.class,
    FeedCommentType.class,
    ContractContactRoleType.class,
    AccountTerritoryAssignmentRuleType.class,
    Presentation__CType.class,
    Sales_Plan__CType.class,
    OpportunityContactRoleType.class,
    ContactFeedType.class,
    SiteType.class,
    Product_Sales_Restrictions__HistoryType.class,
    AdditionalNumberType.class,
    BatchProcessTask__CType.class,
    Arrowpointe_IC_Link__CType.class,
    Mass_Create__CType.class,
    OpportunityPartnerType.class,
    CampaignShareType.class,
    LT_Asset__HistoryType.class,
    PartnerNetworkConnectionType.class,
    SiteFeedType.class,
    RevenueForecastType.class,
    EmailTemplateType.class,
    EWS_Config__HistoryType.class,
    Shipment__CType.class,
    CustomerMapClass__CType.class,
    OrgWideEmailAddressType.class,
    Application_Web_Servers__CType.class,
    AssignmentRuleType.class,
    CollaborationGroupMemberType.class,
    PartnerRoleType.class,
    PartnerNetworkRecordConnectionType.class,
    AccountTeamMemberType.class,
    BusinessProcessType.class,
    ProcessInstanceWorkitemType.class,
    ContentDocumentLinkType.class,
    OpportunityHistoryType.class,
    ProductQualMaterialType__CType.class,
    SolutionHistoryType.class,
    EmailServicesAddressType.class,
    ReportType.class,
    OpportunityFeedType.class,
    SolutionStatusType.class,
    CaseTeamTemplateRecordType.class,
    AggregateResultType.class,
    Per_Diem_Forecasting__CType.class,
    UserAccountTeamMemberType.class,
    AccountHistoryType.class,
    Coupon_Codes__CType.class,
    MailmergeTemplateType.class,
    Proposal_Tree_Template__CType.class,
    OpportunityType.class,
    SFDC_Paid_Time_Off__CType.class,
    HMH_Licensing_Account__HistoryType.class,
    TechErrorEmail__CType.class,
    PartnerType.class,
    ServiceRequestSettings__CType.class,
    UserPreferenceType.class,
    SelfServiceUserType.class,
    EventFeedType.class,
    Competitor_Offering__HistoryType.class,
    EmailServicesFunctionType.class,
    Product_In_Use__CType.class,
    AccountFeedType.class,
    Funding_Allocations__CType.class,
    Presentation__HistoryType.class,
    ContractType.class,
    MDR_Job_Code__CType.class,
    LT_Asset__CType.class,
    Related_Product__CType.class,
    DivisionType.class,
    Proposal_Product_Detail_Settings__CType.class,
    KenTest__HistoryType.class,
    CollaborationInvitationType.class,
    CampaignFeedType.class,
    UserLicenseType.class,
    ContentDocumentType.class,
    AttachmentType.class,
    FiscalYearSettingsType.class,
    TerritoryType.class,
    Snapshot_User_Login__CType.class,
    AccountTerritoryAssignmentRuleItemType.class,
    GroupType.class,
    CaseShareType.class,
    Per_Diem_Plan_Form__HistoryType.class,
    FeedTrackedChangeType.class,
    KenTest4__CType.class,
    Sales_Plan_User__CType.class,
    CaseFeedType.class,
    CWE_Order__HistoryType.class,
    Product_Set_Product__CType.class,
    SFDC_Shipment__CType.class,
    ApexPageType.class,
    Drop_Shipment__CType.class,
    LT_Asset__ShareType.class,
    ContentVersionType.class,
    CaseContactRoleType.class,
    DivisionMap__CType.class,
    Project_Plan__CType.class,
    Snapshot_User__HistoryType.class,
    OpportunityStageType.class,
    Territory_Financial_Detail__HistoryType.class,
    DashboardType.class,
    OIR__CType.class,
    CategoryNodeType.class,
    Field_Engineering_Installation__CType.class,
    Product2Type.class,
    Pricebook2Type.class,
    Enhancement_Requests__HistoryType.class,
    Gratis_Tolerance__CType.class,
    Proposal_Tree__CType.class,
    DashboardFeedType.class,
    IdeaType.class,
    Territory_Financial_Detail__CType.class,
    AccountPartnerType.class,
    CustomerQualAccountGroup__CType.class,
    NoteAndAttachmentType.class,
    Arrowpointe_IC_Message__CType.class,
    HMH_Licensing_Account__CType.class,
    CollaborationGroupFeedType.class,
    HolidayType.class,
    Training_Event__CType.class,
    SiteHistoryType.class,
    Sales_Plan__HistoryType.class,
    SolutionType.class,
    ContactHistoryType.class,
    EmailStatusType.class,
    CollaborationGroupType.class,
    PricebookEntryType.class,
    CampaignMemberStatusType.class,
    OpportunityFieldHistoryType.class,
    RevenueForecastHistoryType.class,
    LineitemOverrideType.class,
    Product_Group__CType.class,
    ForecastShareType.class,
    TaskFeedType.class,
    KenTest2A__CType.class,
    AsyncApexJobType.class,
    CaseTeamTemplateType.class,
    ShipToPriority__CType.class,
    ApexTriggerType.class,
    ApprovalType.class,
    Product_Hierarchy_Group__HistoryType.class,
    CallCenterType.class,
    AccountContactRoleType.class,
    Product_Search_Config__HistoryType.class,
    ReportFeedType.class,
    KenTest2__CType.class,
    Proposal_CustomerPO_Link__CType.class,
    CollaborationGroupMemberRequestType.class,
    Order_Entry_Service_CP_Defaults__CType.class,
    Product_State_Substitutions__CType.class,
    Enhancement_Requests__CType.class,
    OrganizationType.class,
    Territory_Financial_Detail__ShareType.class,
    Arrowpointe_IC_FAQ__CType.class,
    Account_Order_History__CType.class,
    CaseStatusType.class,
    AssetType.class,
    CaseType.class,
    TaskStatusType.class,
    Per_Diem_Forecasting__HistoryType.class,
    ContractFeedType.class,
    EventType.class,
    Record_Type_Picklist__CType.class,
    ContactShareType.class,
    CaseSolutionType.class,
    StaticResourceType.class,
    Content_Activation__CType.class,
    CWE_Order__CType.class,
    ContractHistoryType.class,
    DashboardComponentFeedType.class,
    HMH_Contact_Roles__CType.class,
    OpportunityTeamMemberType.class,
    Snapshot_User__CType.class,
    ProductQualTitleStatus__CType.class,
    AccountType.class,
    Unassigned_Sales__CType.class,
    Top_Accounts_Perf_Summary__HistoryType.class,
    BrandTemplateType.class,
    OpenActivityType.class,
    Proposal_Template__CType.class,
    QuantityForecastType.class,
    KenTest3__CType.class,
    CategoryDataType.class,
    ApexClassType.class,
    AccountShareType.class,
    GroupMemberType.class,
    CommunityType.class,
    Account_Scorecard__CType.class,
    Product_Subscription__CType.class,
    DocumentType.class,
    Per_Diem_Plan_Form__CType.class,
    FolderType.class,
    CaseTeamRoleType.class,
    LeadStatusType.class,
    ContactType.class,
    LeadHistoryType.class,
    TaskPriorityType.class,
    Product_Sales_Restrictions__CType.class,
    Admin_Tool__CType.class,
    NameType.class,
    SiteDomainType.class,
    UserTerritoryType.class,
    QuantityForecastHistoryType.class,
    Sales_Plan__ShareType.class,
    ProductQualMapSalesRestriction__CType.class,
    Region_Scheduler_Map__CType.class,
    Product_Hierarchy_Group__CType.class,
    KenTest__CType.class
})
public class SObjectType {

    @XmlElement(nillable = true)
    protected List<String> fieldsToNull;
    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;

    /**
     * Gets the value of the fieldsToNull property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldsToNull property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldsToNull().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFieldsToNull() {
        if (fieldsToNull == null) {
            fieldsToNull = new ArrayList<String>();
        }
        return this.fieldsToNull;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
