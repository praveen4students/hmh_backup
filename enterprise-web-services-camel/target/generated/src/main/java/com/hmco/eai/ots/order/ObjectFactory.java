
package com.hmco.eai.ots.order;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hmco.eai.ots.order package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnitSalePrice_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "unitSalePrice");
    private final static QName _FreeGoodsIndicator_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "freeGoodsIndicator");
    private final static QName _BillToAttentionLine_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "billToAttentionLine");
    private final static QName _State_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "state");
    private final static QName _OrderedByRep_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "orderedByRep");
    private final static QName _OriginalPONumber_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "originalPONumber");
    private final static QName _BillOfLading_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "billOfLading");
    private final static QName _AdHocNoteTitle_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "adHocNoteTitle");
    private final static QName _PromoAmount_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "promoAmount");
    private final static QName _Pid_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "pid");
    private final static QName _ShippingAddressLine1_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "shippingAddressLine1");
    private final static QName _FreeGoodIndicator_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "freeGoodIndicator");
    private final static QName _DiscountPercent_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "discountPercent");
    private final static QName _ShippingAddressLine2_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "shippingAddressLine2");
    private final static QName _OrderReasonCode_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "orderReasonCode");
    private final static QName _ShippingTerms_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "shippingTerms");
    private final static QName _ZipCode_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "zipCode");
    private final static QName _UserId_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "userId");
    private final static QName _ShipToPid_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "shipToPid");
    private final static QName _CCName_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "CCName");
    private final static QName _SoldtoCustomerId_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "soldtoCustomerId");
    private final static QName _Status_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "status");
    private final static QName _HeaderCCRatioIndicator_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "headerCCRatioIndicator");
    private final static QName _CpsiaReqLabel_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "cpsiaReqLabel");
    private final static QName _AdHocNote_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "adHocNote");
    private final static QName _TaxAmount_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "taxAmount");
    private final static QName _ShipDateOptionDate_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "shipDateOptionDate");
    private final static QName _FreightCharges_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "freightCharges");
    private final static QName _ShippingCountry_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "shippingCountry");
    private final static QName _EntryYear_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "entryYear");
    private final static QName _EgoodEmail_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "egoodEmail");
    private final static QName _DeliveryNotes_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "deliveryNotes");
    private final static QName _ForceDeliveredPricing_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "forceDeliveredPricing");
    private final static QName _CsHold_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "csHold");
    private final static QName _EndingGradeLevel_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "endingGradeLevel");
    private final static QName _AllowContractPricingFlag_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "allowContractPricingFlag");
    private final static QName _ProductHierarchyLevelDesc2_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "productHierarchyLevelDesc2");
    private final static QName _ProductHierarchyLevelDesc1_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "productHierarchyLevelDesc1");
    private final static QName _ProductHierarchyLevelDesc4_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "productHierarchyLevelDesc4");
    private final static QName _ProductHierarchyLevelDesc3_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "productHierarchyLevelDesc3");
    private final static QName _ProductHierarchyLevelDesc5_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "productHierarchyLevelDesc5");
    private final static QName _RequestId_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "requestId");
    private final static QName _SubmitSaleAsyncRequest2_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "submitSaleAsyncRequest2");
    private final static QName _OrderReason_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "orderReason");
    private final static QName _ClientSystemId_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "clientSystemId");
    private final static QName _ShippingAddressState_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "shippingAddressState");
    private final static QName _EGoodIndicator_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "eGoodIndicator");
    private final static QName _ContractPriceIndicator_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "contractPriceIndicator");
    private final static QName _ShortProductCode_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "shortProductCode");
    private final static QName _SubmitSaleTranAction_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "submitSaleTranAction");
    private final static QName _OrderSubTotal_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "orderSubTotal");
    private final static QName _ArTerms_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "arTerms");
    private final static QName _EndDate_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "endDate");
    private final static QName _SubmitForManualCorrection_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "submitForManualCorrection");
    private final static QName _BasisSfdcInternalOrderId_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "basisSfdcInternalOrderId");
    private final static QName _ChargeStatus_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "chargeStatus");
    private final static QName _DeliveredpriceIndicator_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "deliveredpriceIndicator");
    private final static QName _DeliveredPricing_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "deliveredPricing");
    private final static QName _SortOrder_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "sortOrder");
    private final static QName _PriceDate_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "priceDate");
    private final static QName _SfdcOrderNumber_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "sfdcOrderNumber");
    private final static QName _PoNumber_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "poNumber");
    private final static QName _SendConfirmationEmail_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "sendConfirmationEmail");
    private final static QName _UseOverrideAddress_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "useOverrideAddress");
    private final static QName _BasisOrderUsed_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "basisOrderUsed");
    private final static QName _SfdcInternalOrderId_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "sfdcInternalOrderId");
    private final static QName _TechContactEmail_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "techContactEmail");
    private final static QName _TransactionStatus_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "transactionStatus");
    private final static QName _DeliveredPriceIndicator_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "deliveredPriceIndicator");
    private final static QName _SaleDate_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "saleDate");
    private final static QName _ResultCode_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "resultCode");
    private final static QName _ShipToCustomerName_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "shipToCustomerName");
    private final static QName _ShipDateOption_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "shipDateOption");
    private final static QName _ContactEmail_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "contactEmail");
    private final static QName _SapCustomerNo_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "sapCustomerNo");
    private final static QName _MaterialDescription_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "materialDescription");
    private final static QName _LineCCRatioIndicator_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "lineCCRatioIndicator");
    private final static QName _DistrictPid_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "districtPid");
    private final static QName _NetPrice_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "netPrice");
    private final static QName _CouponCode_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "couponCode");
    private final static QName _ShippingAmount_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "shippingAmount");
    private final static QName _Message_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "message");
    private final static QName _SfdcInternalOrderLineId_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "sfdcInternalOrderLineId");
    private final static QName _ClientTransactionId_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "clientTransactionId");
    private final static QName _PromotionCode_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "promotionCode");
    private final static QName _HeaderCouponCode_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "headerCouponCode");
    private final static QName _IsPriceListOrderForm_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "isPriceListOrderForm");
    private final static QName _ListPrice_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "listPrice");
    private final static QName _Isbn13_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "isbn13");
    private final static QName _CpsiaReqCertificate_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "cpsiaReqCertificate");
    private final static QName _PackBySchoolOrGrade_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "packBySchoolOrGrade");
    private final static QName _TechContactName_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "techContactName");
    private final static QName _AttnTo_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "attnTo");
    private final static QName _BillToCustomerID_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "billToCustomerID");
    private final static QName _BeginningGradeLevel_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "beginningGradeLevel");
    private final static QName _StartDate_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "startDate");
    private final static QName _DiscountAmount_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "discountAmount");
    private final static QName _Isbn_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "isbn");
    private final static QName _OverrideShipping_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "overrideShipping");
    private final static QName _ShippingAddressCity_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "shippingAddressCity");
    private final static QName _SaleTotal_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "saleTotal");
    private final static QName _Division_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "division");
    private final static QName _SubmitSaleRequest2_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "submitSaleRequest2");
    private final static QName _CustomerTitle_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "customerTitle");
    private final static QName _EffectiveDate_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "effectiveDate");
    private final static QName _DeferedPaymentDate_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "deferedPaymentDate");
    private final static QName _Grade_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "grade");
    private final static QName _SfdcAccountId_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "sfdcAccountId");
    private final static QName _MaterialID_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "materialID");
    private final static QName _ContactPhone_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "contactPhone");
    private final static QName _ShipToCustomerPO_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "shipToCustomerPO");
    private final static QName _TransactionName_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "transactionName");
    private final static QName _EntryDivision_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "entryDivision");
    private final static QName _FreeformMessage_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "freeformMessage");
    private final static QName _TransactionType_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "transactionType");
    private final static QName _SubmitSampleTranAction_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "submitSampleTranAction");
    private final static QName _FaxURL_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "faxURL");
    private final static QName _MustArriveByReason_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "mustArriveByReason");
    private final static QName _DoNotMixPOsOnSamePallet_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "doNotMixPOsOnSamePallet");
    private final static QName _ClientTransactionID_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "clientTransactionID");
    private final static QName _MarketCode_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "marketCode");
    private final static QName _CreatedDate_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "createdDate");
    private final static QName _ShiptoCustomerId_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "shiptoCustomerId");
    private final static QName _Quantity_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "quantity");
    private final static QName _ShippingAccountName_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "shippingAccountName");
    private final static QName _ExpirationDate_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "expirationDate");
    private final static QName _DockInstructions_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "dockInstructions");
    private final static QName _HasEGood_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "hasEGood");
    private final static QName _LineItemNote_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "lineItemNote");
    private final static QName _RemoveFreightForwarder_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "removeFreightForwarder");
    private final static QName _ContactName_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "contactName");
    private final static QName _ShipToAttentionLine_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "shipToAttentionLine");
    private final static QName _ShippingZip_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "shippingZip");
    private final static QName _LineCouponCode_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "lineCouponCode");
    private final static QName _CVV_QNAME = new QName("http://www.hmco.com/EAI/OTS/Order", "CVV");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hmco.eai.ots.order
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubmitSaleResponse2 }
     * 
     */
    public SubmitSaleResponse2 createSubmitSaleResponse2() {
        return new SubmitSaleResponse2();
    }

    /**
     * Create an instance of {@link SubmitSampleResponse.Header }
     * 
     */
    public SubmitSampleResponse.Header createSubmitSampleResponseHeader() {
        return new SubmitSampleResponse.Header();
    }

    /**
     * Create an instance of {@link SfdcTransactionLineItem }
     * 
     */
    public SfdcTransactionLineItem createSfdcTransactionLineItem() {
        return new SfdcTransactionLineItem();
    }

    /**
     * Create an instance of {@link SubmitSaleRequest }
     * 
     */
    public SubmitSaleRequest createSubmitSaleRequest() {
        return new SubmitSaleRequest();
    }

    /**
     * Create an instance of {@link SaleHeader2 }
     * 
     */
    public SaleHeader2 createSaleHeader2() {
        return new SaleHeader2();
    }

    /**
     * Create an instance of {@link FindsfdcTransactionResponse }
     * 
     */
    public FindsfdcTransactionResponse createFindsfdcTransactionResponse() {
        return new FindsfdcTransactionResponse();
    }

    /**
     * Create an instance of {@link OrderException }
     * 
     */
    public OrderException createOrderException() {
        return new OrderException();
    }

    /**
     * Create an instance of {@link SubmitSampleResponse }
     * 
     */
    public SubmitSampleResponse createSubmitSampleResponse() {
        return new SubmitSampleResponse();
    }

    /**
     * Create an instance of {@link SubmitSampleResponse.LineItem }
     * 
     */
    public SubmitSampleResponse.LineItem createSubmitSampleResponseLineItem() {
        return new SubmitSampleResponse.LineItem();
    }

    /**
     * Create an instance of {@link SubmitSampleRequest }
     * 
     */
    public SubmitSampleRequest createSubmitSampleRequest() {
        return new SubmitSampleRequest();
    }

    /**
     * Create an instance of {@link FindBasisOrderResponse }
     * 
     */
    public FindBasisOrderResponse createFindBasisOrderResponse() {
        return new FindBasisOrderResponse();
    }

    /**
     * Create an instance of {@link SaleLineItemList }
     * 
     */
    public SaleLineItemList createSaleLineItemList() {
        return new SaleLineItemList();
    }

    /**
     * Create an instance of {@link SubmitSaleResponse.LineItem }
     * 
     */
    public SubmitSaleResponse.LineItem createSubmitSaleResponseLineItem() {
        return new SubmitSaleResponse.LineItem();
    }

    /**
     * Create an instance of {@link OrderNoteList }
     * 
     */
    public OrderNoteList createOrderNoteList() {
        return new OrderNoteList();
    }

    /**
     * Create an instance of {@link SampleHeader }
     * 
     */
    public SampleHeader createSampleHeader() {
        return new SampleHeader();
    }

    /**
     * Create an instance of {@link SaleLineItem }
     * 
     */
    public SaleLineItem createSaleLineItem() {
        return new SaleLineItem();
    }

    /**
     * Create an instance of {@link SubmitOrderResponse }
     * 
     */
    public SubmitOrderResponse createSubmitOrderResponse() {
        return new SubmitOrderResponse();
    }

    /**
     * Create an instance of {@link OrderLineList }
     * 
     */
    public OrderLineList createOrderLineList() {
        return new OrderLineList();
    }

    /**
     * Create an instance of {@link SubmitOrderLIneList }
     * 
     */
    public SubmitOrderLIneList createSubmitOrderLIneList() {
        return new SubmitOrderLIneList();
    }

    /**
     * Create an instance of {@link com.hmco.eai.ots.order.LineItemError }
     * 
     */
    public com.hmco.eai.ots.order.LineItemError createLineItemError() {
        return new com.hmco.eai.ots.order.LineItemError();
    }

    /**
     * Create an instance of {@link SubmitOrderRequest }
     * 
     */
    public SubmitOrderRequest createSubmitOrderRequest() {
        return new SubmitOrderRequest();
    }

    /**
     * Create an instance of {@link UnsubmittedOrders }
     * 
     */
    public UnsubmittedOrders createUnsubmittedOrders() {
        return new UnsubmittedOrders();
    }

    /**
     * Create an instance of {@link SubmitSaleResponse2 .LineItem }
     * 
     */
    public SubmitSaleResponse2 .LineItem createSubmitSaleResponse2LineItem() {
        return new SubmitSaleResponse2 .LineItem();
    }

    /**
     * Create an instance of {@link SubmitSampleResponse.LineItem.LineItemError }
     * 
     */
    public SubmitSampleResponse.LineItem.LineItemError createSubmitSampleResponseLineItemLineItemError() {
        return new SubmitSampleResponse.LineItem.LineItemError();
    }

    /**
     * Create an instance of {@link SubmitSaleResponse.Header }
     * 
     */
    public SubmitSaleResponse.Header createSubmitSaleResponseHeader() {
        return new SubmitSaleResponse.Header();
    }

    /**
     * Create an instance of {@link LineList }
     * 
     */
    public LineList createLineList() {
        return new LineList();
    }

    /**
     * Create an instance of {@link MaterialKey }
     * 
     */
    public MaterialKey createMaterialKey() {
        return new MaterialKey();
    }

    /**
     * Create an instance of {@link FindBasisOrderRequest }
     * 
     */
    public FindBasisOrderRequest createFindBasisOrderRequest() {
        return new FindBasisOrderRequest();
    }

    /**
     * Create an instance of {@link DeliveryInfo }
     * 
     */
    public DeliveryInfo createDeliveryInfo() {
        return new DeliveryInfo();
    }

    /**
     * Create an instance of {@link SampleLineItem }
     * 
     */
    public SampleLineItem createSampleLineItem() {
        return new SampleLineItem();
    }

    /**
     * Create an instance of {@link SubmitSaleRequestStatus }
     * 
     */
    public SubmitSaleRequestStatus createSubmitSaleRequestStatus() {
        return new SubmitSaleRequestStatus();
    }

    /**
     * Create an instance of {@link SubmitSaleRequestId }
     * 
     */
    public SubmitSaleRequestId createSubmitSaleRequestId() {
        return new SubmitSaleRequestId();
    }

    /**
     * Create an instance of {@link SaleHeader }
     * 
     */
    public SaleHeader createSaleHeader() {
        return new SaleHeader();
    }

    /**
     * Create an instance of {@link SampleLineItemList }
     * 
     */
    public SampleLineItemList createSampleLineItemList() {
        return new SampleLineItemList();
    }

    /**
     * Create an instance of {@link SubmitSaleRequest2 }
     * 
     */
    public SubmitSaleRequest2 createSubmitSaleRequest2() {
        return new SubmitSaleRequest2();
    }

    /**
     * Create an instance of {@link FindUnsubmittedOrdersResponse }
     * 
     */
    public FindUnsubmittedOrdersResponse createFindUnsubmittedOrdersResponse() {
        return new FindUnsubmittedOrdersResponse();
    }

    /**
     * Create an instance of {@link BasisOrderList }
     * 
     */
    public BasisOrderList createBasisOrderList() {
        return new BasisOrderList();
    }

    /**
     * Create an instance of {@link SfdcTransactionHeader }
     * 
     */
    public SfdcTransactionHeader createSfdcTransactionHeader() {
        return new SfdcTransactionHeader();
    }

    /**
     * Create an instance of {@link FindsfdcTransactionRequest }
     * 
     */
    public FindsfdcTransactionRequest createFindsfdcTransactionRequest() {
        return new FindsfdcTransactionRequest();
    }

    /**
     * Create an instance of {@link SubmitSaleResponse2 .Header2 }
     * 
     */
    public SubmitSaleResponse2 .Header2 createSubmitSaleResponse2Header2() {
        return new SubmitSaleResponse2 .Header2();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link SubmitSaleResponse }
     * 
     */
    public SubmitSaleResponse createSubmitSaleResponse() {
        return new SubmitSaleResponse();
    }

    /**
     * Create an instance of {@link FindUnsubmittedOrdersRequest }
     * 
     */
    public FindUnsubmittedOrdersRequest createFindUnsubmittedOrdersRequest() {
        return new FindUnsubmittedOrdersRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "unitSalePrice")
    public JAXBElement<BigDecimal> createUnitSalePrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_UnitSalePrice_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "freeGoodsIndicator")
    public JAXBElement<Boolean> createFreeGoodsIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_FreeGoodsIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "billToAttentionLine")
    public JAXBElement<String> createBillToAttentionLine(String value) {
        return new JAXBElement<String>(_BillToAttentionLine_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "state")
    public JAXBElement<String> createState(String value) {
        return new JAXBElement<String>(_State_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "orderedByRep")
    public JAXBElement<String> createOrderedByRep(String value) {
        return new JAXBElement<String>(_OrderedByRep_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "originalPONumber")
    public JAXBElement<String> createOriginalPONumber(String value) {
        return new JAXBElement<String>(_OriginalPONumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "billOfLading")
    public JAXBElement<String> createBillOfLading(String value) {
        return new JAXBElement<String>(_BillOfLading_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "adHocNoteTitle")
    public JAXBElement<String> createAdHocNoteTitle(String value) {
        return new JAXBElement<String>(_AdHocNoteTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "promoAmount")
    public JAXBElement<Double> createPromoAmount(Double value) {
        return new JAXBElement<Double>(_PromoAmount_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "pid")
    public JAXBElement<String> createPid(String value) {
        return new JAXBElement<String>(_Pid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "shippingAddressLine1")
    public JAXBElement<String> createShippingAddressLine1(String value) {
        return new JAXBElement<String>(_ShippingAddressLine1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "freeGoodIndicator")
    public JAXBElement<Boolean> createFreeGoodIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_FreeGoodIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "discountPercent")
    public JAXBElement<Double> createDiscountPercent(Double value) {
        return new JAXBElement<Double>(_DiscountPercent_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "shippingAddressLine2")
    public JAXBElement<String> createShippingAddressLine2(String value) {
        return new JAXBElement<String>(_ShippingAddressLine2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "orderReasonCode")
    public JAXBElement<String> createOrderReasonCode(String value) {
        return new JAXBElement<String>(_OrderReasonCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "shippingTerms")
    public JAXBElement<String> createShippingTerms(String value) {
        return new JAXBElement<String>(_ShippingTerms_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "zipCode")
    public JAXBElement<String> createZipCode(String value) {
        return new JAXBElement<String>(_ZipCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "userId")
    public JAXBElement<String> createUserId(String value) {
        return new JAXBElement<String>(_UserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "shipToPid")
    public JAXBElement<String> createShipToPid(String value) {
        return new JAXBElement<String>(_ShipToPid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "CCName")
    public JAXBElement<String> createCCName(String value) {
        return new JAXBElement<String>(_CCName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "soldtoCustomerId")
    public JAXBElement<String> createSoldtoCustomerId(String value) {
        return new JAXBElement<String>(_SoldtoCustomerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "status")
    public JAXBElement<String> createStatus(String value) {
        return new JAXBElement<String>(_Status_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "headerCCRatioIndicator")
    public JAXBElement<String> createHeaderCCRatioIndicator(String value) {
        return new JAXBElement<String>(_HeaderCCRatioIndicator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "cpsiaReqLabel")
    public JAXBElement<Boolean> createCpsiaReqLabel(Boolean value) {
        return new JAXBElement<Boolean>(_CpsiaReqLabel_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "adHocNote")
    public JAXBElement<String> createAdHocNote(String value) {
        return new JAXBElement<String>(_AdHocNote_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "taxAmount")
    public JAXBElement<Double> createTaxAmount(Double value) {
        return new JAXBElement<Double>(_TaxAmount_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "shipDateOptionDate")
    public JAXBElement<XMLGregorianCalendar> createShipDateOptionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ShipDateOptionDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "freightCharges")
    public JAXBElement<String> createFreightCharges(String value) {
        return new JAXBElement<String>(_FreightCharges_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "shippingCountry")
    public JAXBElement<String> createShippingCountry(String value) {
        return new JAXBElement<String>(_ShippingCountry_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "entryYear")
    public JAXBElement<Integer> createEntryYear(Integer value) {
        return new JAXBElement<Integer>(_EntryYear_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "egoodEmail")
    public JAXBElement<String> createEgoodEmail(String value) {
        return new JAXBElement<String>(_EgoodEmail_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "deliveryNotes")
    public JAXBElement<String> createDeliveryNotes(String value) {
        return new JAXBElement<String>(_DeliveryNotes_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "forceDeliveredPricing")
    public JAXBElement<String> createForceDeliveredPricing(String value) {
        return new JAXBElement<String>(_ForceDeliveredPricing_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "csHold")
    public JAXBElement<String> createCsHold(String value) {
        return new JAXBElement<String>(_CsHold_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "endingGradeLevel")
    public JAXBElement<String> createEndingGradeLevel(String value) {
        return new JAXBElement<String>(_EndingGradeLevel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "allowContractPricingFlag")
    public JAXBElement<Boolean> createAllowContractPricingFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AllowContractPricingFlag_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "productHierarchyLevelDesc2")
    public JAXBElement<String> createProductHierarchyLevelDesc2(String value) {
        return new JAXBElement<String>(_ProductHierarchyLevelDesc2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "productHierarchyLevelDesc1")
    public JAXBElement<String> createProductHierarchyLevelDesc1(String value) {
        return new JAXBElement<String>(_ProductHierarchyLevelDesc1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "productHierarchyLevelDesc4")
    public JAXBElement<String> createProductHierarchyLevelDesc4(String value) {
        return new JAXBElement<String>(_ProductHierarchyLevelDesc4_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "productHierarchyLevelDesc3")
    public JAXBElement<String> createProductHierarchyLevelDesc3(String value) {
        return new JAXBElement<String>(_ProductHierarchyLevelDesc3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "productHierarchyLevelDesc5")
    public JAXBElement<String> createProductHierarchyLevelDesc5(String value) {
        return new JAXBElement<String>(_ProductHierarchyLevelDesc5_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "requestId")
    public JAXBElement<String> createRequestId(String value) {
        return new JAXBElement<String>(_RequestId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitSaleRequest2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "submitSaleAsyncRequest2")
    public JAXBElement<SubmitSaleRequest2> createSubmitSaleAsyncRequest2(SubmitSaleRequest2 value) {
        return new JAXBElement<SubmitSaleRequest2>(_SubmitSaleAsyncRequest2_QNAME, SubmitSaleRequest2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "orderReason")
    public JAXBElement<String> createOrderReason(String value) {
        return new JAXBElement<String>(_OrderReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "clientSystemId")
    public JAXBElement<String> createClientSystemId(String value) {
        return new JAXBElement<String>(_ClientSystemId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "shippingAddressState")
    public JAXBElement<String> createShippingAddressState(String value) {
        return new JAXBElement<String>(_ShippingAddressState_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "eGoodIndicator")
    public JAXBElement<String> createEGoodIndicator(String value) {
        return new JAXBElement<String>(_EGoodIndicator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "contractPriceIndicator")
    public JAXBElement<Boolean> createContractPriceIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_ContractPriceIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "shortProductCode")
    public JAXBElement<String> createShortProductCode(String value) {
        return new JAXBElement<String>(_ShortProductCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "submitSaleTranAction")
    public JAXBElement<String> createSubmitSaleTranAction(String value) {
        return new JAXBElement<String>(_SubmitSaleTranAction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "orderSubTotal")
    public JAXBElement<Double> createOrderSubTotal(Double value) {
        return new JAXBElement<Double>(_OrderSubTotal_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "arTerms")
    public JAXBElement<String> createArTerms(String value) {
        return new JAXBElement<String>(_ArTerms_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "endDate")
    public JAXBElement<String> createEndDate(String value) {
        return new JAXBElement<String>(_EndDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "submitForManualCorrection")
    public JAXBElement<Boolean> createSubmitForManualCorrection(Boolean value) {
        return new JAXBElement<Boolean>(_SubmitForManualCorrection_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "basisSfdcInternalOrderId")
    public JAXBElement<String> createBasisSfdcInternalOrderId(String value) {
        return new JAXBElement<String>(_BasisSfdcInternalOrderId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "chargeStatus")
    public JAXBElement<String> createChargeStatus(String value) {
        return new JAXBElement<String>(_ChargeStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "deliveredpriceIndicator")
    public JAXBElement<String> createDeliveredpriceIndicator(String value) {
        return new JAXBElement<String>(_DeliveredpriceIndicator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "deliveredPricing")
    public JAXBElement<Boolean> createDeliveredPricing(Boolean value) {
        return new JAXBElement<Boolean>(_DeliveredPricing_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "sortOrder")
    public JAXBElement<Integer> createSortOrder(Integer value) {
        return new JAXBElement<Integer>(_SortOrder_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "priceDate")
    public JAXBElement<XMLGregorianCalendar> createPriceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PriceDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "sfdcOrderNumber")
    public JAXBElement<String> createSfdcOrderNumber(String value) {
        return new JAXBElement<String>(_SfdcOrderNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "poNumber")
    public JAXBElement<String> createPoNumber(String value) {
        return new JAXBElement<String>(_PoNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "sendConfirmationEmail")
    public JAXBElement<Boolean> createSendConfirmationEmail(Boolean value) {
        return new JAXBElement<Boolean>(_SendConfirmationEmail_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "useOverrideAddress")
    public JAXBElement<Boolean> createUseOverrideAddress(Boolean value) {
        return new JAXBElement<Boolean>(_UseOverrideAddress_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "basisOrderUsed")
    public JAXBElement<Boolean> createBasisOrderUsed(Boolean value) {
        return new JAXBElement<Boolean>(_BasisOrderUsed_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "sfdcInternalOrderId")
    public JAXBElement<String> createSfdcInternalOrderId(String value) {
        return new JAXBElement<String>(_SfdcInternalOrderId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "techContactEmail")
    public JAXBElement<String> createTechContactEmail(String value) {
        return new JAXBElement<String>(_TechContactEmail_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "transactionStatus")
    public JAXBElement<String> createTransactionStatus(String value) {
        return new JAXBElement<String>(_TransactionStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "deliveredPriceIndicator")
    public JAXBElement<Boolean> createDeliveredPriceIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_DeliveredPriceIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "saleDate")
    public JAXBElement<XMLGregorianCalendar> createSaleDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SaleDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "resultCode")
    public JAXBElement<String> createResultCode(String value) {
        return new JAXBElement<String>(_ResultCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "shipToCustomerName")
    public JAXBElement<String> createShipToCustomerName(String value) {
        return new JAXBElement<String>(_ShipToCustomerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "shipDateOption")
    public JAXBElement<String> createShipDateOption(String value) {
        return new JAXBElement<String>(_ShipDateOption_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "contactEmail")
    public JAXBElement<String> createContactEmail(String value) {
        return new JAXBElement<String>(_ContactEmail_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "sapCustomerNo")
    public JAXBElement<String> createSapCustomerNo(String value) {
        return new JAXBElement<String>(_SapCustomerNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "materialDescription")
    public JAXBElement<String> createMaterialDescription(String value) {
        return new JAXBElement<String>(_MaterialDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "lineCCRatioIndicator")
    public JAXBElement<String> createLineCCRatioIndicator(String value) {
        return new JAXBElement<String>(_LineCCRatioIndicator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "districtPid")
    public JAXBElement<String> createDistrictPid(String value) {
        return new JAXBElement<String>(_DistrictPid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "netPrice")
    public JAXBElement<Double> createNetPrice(Double value) {
        return new JAXBElement<Double>(_NetPrice_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "couponCode")
    public JAXBElement<String> createCouponCode(String value) {
        return new JAXBElement<String>(_CouponCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "shippingAmount")
    public JAXBElement<Double> createShippingAmount(Double value) {
        return new JAXBElement<Double>(_ShippingAmount_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "message")
    public JAXBElement<String> createMessage(String value) {
        return new JAXBElement<String>(_Message_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "sfdcInternalOrderLineId")
    public JAXBElement<String> createSfdcInternalOrderLineId(String value) {
        return new JAXBElement<String>(_SfdcInternalOrderLineId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "clientTransactionId")
    public JAXBElement<String> createClientTransactionId(String value) {
        return new JAXBElement<String>(_ClientTransactionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "promotionCode")
    public JAXBElement<String> createPromotionCode(String value) {
        return new JAXBElement<String>(_PromotionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "headerCouponCode")
    public JAXBElement<String> createHeaderCouponCode(String value) {
        return new JAXBElement<String>(_HeaderCouponCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "isPriceListOrderForm")
    public JAXBElement<Boolean> createIsPriceListOrderForm(Boolean value) {
        return new JAXBElement<Boolean>(_IsPriceListOrderForm_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "listPrice")
    public JAXBElement<Double> createListPrice(Double value) {
        return new JAXBElement<Double>(_ListPrice_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "isbn13")
    public JAXBElement<String> createIsbn13(String value) {
        return new JAXBElement<String>(_Isbn13_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "cpsiaReqCertificate")
    public JAXBElement<Boolean> createCpsiaReqCertificate(Boolean value) {
        return new JAXBElement<Boolean>(_CpsiaReqCertificate_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "packBySchoolOrGrade")
    public JAXBElement<String> createPackBySchoolOrGrade(String value) {
        return new JAXBElement<String>(_PackBySchoolOrGrade_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "techContactName")
    public JAXBElement<String> createTechContactName(String value) {
        return new JAXBElement<String>(_TechContactName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "attnTo")
    public JAXBElement<String> createAttnTo(String value) {
        return new JAXBElement<String>(_AttnTo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "billToCustomerID")
    public JAXBElement<String> createBillToCustomerID(String value) {
        return new JAXBElement<String>(_BillToCustomerID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "beginningGradeLevel")
    public JAXBElement<String> createBeginningGradeLevel(String value) {
        return new JAXBElement<String>(_BeginningGradeLevel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "startDate")
    public JAXBElement<String> createStartDate(String value) {
        return new JAXBElement<String>(_StartDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "discountAmount")
    public JAXBElement<Double> createDiscountAmount(Double value) {
        return new JAXBElement<Double>(_DiscountAmount_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "isbn")
    public JAXBElement<String> createIsbn(String value) {
        return new JAXBElement<String>(_Isbn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "overrideShipping")
    public JAXBElement<BigDecimal> createOverrideShipping(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OverrideShipping_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "shippingAddressCity")
    public JAXBElement<String> createShippingAddressCity(String value) {
        return new JAXBElement<String>(_ShippingAddressCity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "saleTotal")
    public JAXBElement<Double> createSaleTotal(Double value) {
        return new JAXBElement<Double>(_SaleTotal_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "division")
    public JAXBElement<String> createDivision(String value) {
        return new JAXBElement<String>(_Division_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitSaleRequest2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "submitSaleRequest2")
    public JAXBElement<SubmitSaleRequest2> createSubmitSaleRequest2(SubmitSaleRequest2 value) {
        return new JAXBElement<SubmitSaleRequest2>(_SubmitSaleRequest2_QNAME, SubmitSaleRequest2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "customerTitle")
    public JAXBElement<String> createCustomerTitle(String value) {
        return new JAXBElement<String>(_CustomerTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "effectiveDate")
    public JAXBElement<XMLGregorianCalendar> createEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EffectiveDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "deferedPaymentDate")
    public JAXBElement<XMLGregorianCalendar> createDeferedPaymentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DeferedPaymentDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "grade")
    public JAXBElement<String> createGrade(String value) {
        return new JAXBElement<String>(_Grade_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "sfdcAccountId")
    public JAXBElement<String> createSfdcAccountId(String value) {
        return new JAXBElement<String>(_SfdcAccountId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "materialID")
    public JAXBElement<String> createMaterialID(String value) {
        return new JAXBElement<String>(_MaterialID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "contactPhone")
    public JAXBElement<String> createContactPhone(String value) {
        return new JAXBElement<String>(_ContactPhone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "shipToCustomerPO")
    public JAXBElement<String> createShipToCustomerPO(String value) {
        return new JAXBElement<String>(_ShipToCustomerPO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "transactionName")
    public JAXBElement<String> createTransactionName(String value) {
        return new JAXBElement<String>(_TransactionName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "entryDivision")
    public JAXBElement<String> createEntryDivision(String value) {
        return new JAXBElement<String>(_EntryDivision_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "freeformMessage")
    public JAXBElement<String> createFreeformMessage(String value) {
        return new JAXBElement<String>(_FreeformMessage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "transactionType")
    public JAXBElement<String> createTransactionType(String value) {
        return new JAXBElement<String>(_TransactionType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "submitSampleTranAction")
    public JAXBElement<String> createSubmitSampleTranAction(String value) {
        return new JAXBElement<String>(_SubmitSampleTranAction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "faxURL")
    public JAXBElement<String> createFaxURL(String value) {
        return new JAXBElement<String>(_FaxURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "mustArriveByReason")
    public JAXBElement<String> createMustArriveByReason(String value) {
        return new JAXBElement<String>(_MustArriveByReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "doNotMixPOsOnSamePallet")
    public JAXBElement<Boolean> createDoNotMixPOsOnSamePallet(Boolean value) {
        return new JAXBElement<Boolean>(_DoNotMixPOsOnSamePallet_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "clientTransactionID")
    public JAXBElement<String> createClientTransactionID(String value) {
        return new JAXBElement<String>(_ClientTransactionID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "marketCode")
    public JAXBElement<String> createMarketCode(String value) {
        return new JAXBElement<String>(_MarketCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "createdDate")
    public JAXBElement<XMLGregorianCalendar> createCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreatedDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "shiptoCustomerId")
    public JAXBElement<String> createShiptoCustomerId(String value) {
        return new JAXBElement<String>(_ShiptoCustomerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "quantity")
    public JAXBElement<Double> createQuantity(Double value) {
        return new JAXBElement<Double>(_Quantity_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "shippingAccountName")
    public JAXBElement<String> createShippingAccountName(String value) {
        return new JAXBElement<String>(_ShippingAccountName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "expirationDate")
    public JAXBElement<XMLGregorianCalendar> createExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExpirationDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "dockInstructions")
    public JAXBElement<String> createDockInstructions(String value) {
        return new JAXBElement<String>(_DockInstructions_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "hasEGood")
    public JAXBElement<Boolean> createHasEGood(Boolean value) {
        return new JAXBElement<Boolean>(_HasEGood_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "lineItemNote")
    public JAXBElement<String> createLineItemNote(String value) {
        return new JAXBElement<String>(_LineItemNote_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "removeFreightForwarder")
    public JAXBElement<Boolean> createRemoveFreightForwarder(Boolean value) {
        return new JAXBElement<Boolean>(_RemoveFreightForwarder_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "contactName")
    public JAXBElement<String> createContactName(String value) {
        return new JAXBElement<String>(_ContactName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "shipToAttentionLine")
    public JAXBElement<String> createShipToAttentionLine(String value) {
        return new JAXBElement<String>(_ShipToAttentionLine_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "shippingZip")
    public JAXBElement<String> createShippingZip(String value) {
        return new JAXBElement<String>(_ShippingZip_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "lineCouponCode")
    public JAXBElement<String> createLineCouponCode(String value) {
        return new JAXBElement<String>(_LineCouponCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hmco.com/EAI/OTS/Order", name = "CVV")
    public JAXBElement<String> createCVV(String value) {
        return new JAXBElement<String>(_CVV_QNAME, String.class, null, value);
    }

}
