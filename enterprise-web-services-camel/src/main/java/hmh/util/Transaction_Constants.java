package hmh.util;

public class Transaction_Constants {
	
	public enum TRANSACTION {
		TRAN_ACTION_RELEASE, TRAN_ACTION_HOLD, TRAN_ACTION_PRICE
	}
	
	public static final String TRANSACTION_TYPE = "TRANSACTION_TYPE";
	
	public static final String TRANSACTION_STATUS = "TRANSACTION_STATUS";
	
	public static final String ORDER_SOURCE = "ORDER_SOURCE";
	
	public static final String SUBSCRIPTION_TERM = "SUBSCRIPTION_TERM";
	
	public static final String TRANSACTION_REJECTION_STATUS = "TRANSACTION_REJECTION_STATUS";
	
	public static final String DELIVERY_BLOCK = "DELIVERY_BLOCK";
	
	public static final String LINE_ITEM_STATUS = "LINE_ITEM_STATUS";
	
	public static final String MATERIAL_STATUS = "MATERIAL_STATUS";
	
	public static final String MATERIAL_GROUP = "MATERIAL_GROUP";
	
	public static final String BILLING_BLOCK = "BILLING_BLOCK";
	
	public static final String ITEM_TYPE = "ITEM_TYPE";
	
	public static final String DIVISION = "DIVISION";
	
	public static final String AR_TERMS = "AR_TERMS";
	
	public static final String INVOICE_TYPE = "INVOICE_TYPE";
	
	public static final String INVOICE_REQUEST_TYPE = "INVOICE_REQUEST_TYPE";
	
	public static final String LINE_ITEM_REJECTION_STATUS = "LINE_ITEM_REJECTION_STATUS";
	
	public static final String PARTNER_FUNCTION = "PARTNER_FUNCTION";

	public static final String AG = "AG";
	
	public static final String WE = "WE";
	
	public static final String RE = "RE";
	
	public static final String Y = "Y";
	
	public static final String N = "N";
	
	public static final String X = "X";

	public static final String EMPTY = "";
	
	public static final String COMMA_SEPERATOR = ",";

	public static final String HYPHEN = "-";
	
	public static final String SAP = "SAP";
	public static final String SFDC = "SFDC";	
	public static final String ENTERPRISE = "Enterprise";

	public static final String CUSTOMER_RELATIONSHIP = "CUSTOMER_RELATIONSHIP";

	public static final String CUSTOMER_ROLE = "CUSTOMER_ROLE";

	public static final String CUSTOMER_CLASS = "CUSTOMER_CLASS";

	public static final String CUSTOMER_TYPE = "CUSTOMER_TYPE";

	public static final String CREDIT_STATUS = "7600";

	public static final String MEDIA_TYPE = "MEDIA_TYPE";

	public static final String MATERIAL_RESTRICTION = "MATERIAL_RESTRICTION";

	public static final String EDITION_CATEGORY = "EDITION_CATEGORY";
	public static final String MAT_ID_SUFFIX = "a";

	public static final String ISBN10 = "0002";

	public static final String ISBN13 = "0001";

	public static final String ERROR_CATEGORY = "1";

	public static final String ERROR_CODE = "100";
	
	public static final String REL_ERROR = "relationshipType cannot be whitespace or null.";
	
	public static final String CUS_ID_ERROR = "customerID cannot be whitespace or null.";
	
	public static final String CUS_ID_INVALID = "customerID length must be atmost 3 characters.";
	
	public static final String DIV_ERROR = "division cannot be whitespace or null.";
	
	public static final String COUNTRY_CODE_ERROR = "countrycode cannot be whitespace or null.";
	
	public static final String COUNTRY_CODE_INVALID = "countrycode length must be atmost 3 characters.";
	
	public static final String ZIP_CODE_INVALID = "zipcode length must be atmost 10 characters.";
	
	public static final String ZIP_ERROR = "zipcode cannot be whitespace or null.";
	
	public static final String STATE_ERROR = "state cannot be whitespace or null.";
	
	public static final String STATE_INVALID = "state length must be atmost 3 characters.";
	
	public static final String CITY_ERROR = "city cannot be whitespace or null.";
	
	public static final String CITY_INVALID = "city length must be atmost 35 characters.";
	
	public static final String ADDR_ERROR = "addressLine1 cannot be whitespace or null.";
	
	public static final String ADDR1_INVALID = "addressLine1 length must be atmost 60 characters.";
	
	public static final String ADDR_INVALID = "address length must be atmost 60 characters.";
	
	public static final String STORE_ERROR = "storeID cannot be whitespace or null.";
	
	public static final String STORE_INVALID = "storeID length must be atmost 30 characters.";
	
	public static final String CUS_NAME_ERROR = "customerName cannot be whitespace or null.";
	
	public static final String CUS_NAME_INVALID = "customerName length must be atmost 35 characters.";
	
	public static final String TEL_ERROR = "telephone cannot be whitespace or null.";
	
	public static final String TEL_INVALID = "telephone length must be atmost 16 characters.";
	
	public static final String SFA_TERR_ERROR = "SFASalesTerritory cannot be whitespace or null.";
	
	public static final String NAME_ERROR = "name cannot be whitespace or null.";
	
	public static final String NAME_INVALID = "name length must be atmost 35 characters.";

	public static final String SHIPMENT_METHOD = "SHIPMENT_METHOD";

	public static final String SHIP_DATE_OPTION = "SHIP_DATE_OPTION";

	public static final String SHIPPING_TERMS = "SHIPPING_TERMS";

	public static final String BACK_ORDER_OPTION = "BACK_ORDER_OPTION";

	public static final String ORDER_REASON = "ORDER_REASON";

	public static final String CREDIT_CARD_TYPE = "CREDIT_CARD_TYPE";

	public static final String ARRIVE_BY_REASON = "ARRIVE_BY_REASON";

	public static final String PACK_BY_OPTION = "PACK_BY_OPTION";

	public static final String HANDLING_TERMS = "HANDLING_TERMS";

	public static final Object NEW_LINE = "\n";
	
	public static final String EDITION_CATEGORY_UNEXPECTED = "EDITION_CATEGORY_UNEXPECTED";
	
	public static final String ARTERMS_UNEXPECTED = "ARTERMS_UNEXPECTED";
	
	public static final String BILLING_BLOCK_UNEXPECTED = "BILLING_BLOCK_UNEXPECTED";
	
	public static final String CUSTOMER_CLASS_UNEXPECTED = "CUSTOMER_CLASS_UNEXPECTED";
	
	public static final String CUSTOMER_STATUS_UNEXPECTED = "CUSTOMER_STATUS_UNEXPECTED";
	
	public static final String CUSTOMER_ROLE_UNEXPECTED = "CUSTOMER_ROLE_UNEXPECTED";
	
	public static final String CREDIT_STATUS_UNEXPECTED = "CREDIT_STATUS_UNEXPECTED";
	
	public static final String DELIVERY_BLOCK_UNEXPECTED = "DELIVERY_BLOCK_UNEXPECTED";
	
	public static final String DIVISION_CODE_UNEXPECTED = "DIVISION_BUSINESS_UNEXPECTED";
	
	public static final String INVOICE_TYPE_UNEXPECTED = "INVOICE_TYPE_UNEXPECTED";
	
	public static final String ITEM_TYPE_UNEXPECTED = "ITEM_TYPE_UNEXPECTED";
	
	public static final String LINE_ITEM_REJECTION_STATUS_NA = "LINE_ITEM_REJECTION_STATUS_NA";
	
	public static final String LINE_ITEM_STATUS_UNEXPECTED = "LINE_ITEM_STATUS_UNEXPECTED";
	
	public static final String MATERIAL_GROUP_UNEXPECTED = "MATERIAL_GROUP_UNEXPECTED";
	
	public static final String MATERIAL_RESTRICTION_UNEXPECTED = "MATERIAL_RESTRICTION_UNEXPECTED";
	
	public static final String MATERIAL_STATUS_UNEXPECTED = "MATERIAL_STATUS_UNEXPECTED";
	
	public static final String MEDIA_TYPE__UNEXPECTED = "MEDIA_TYPE_UNEXPECTED";
	
	public static final String ORDER_SOURCE_UNEXPECTED = "ORDER_SOURCE_UNEXPECTED";
	
	public static final String RELATIONSHIP_TYPE_UNEXPECTED = "RELATIONSHIP_TYPE_UNEXPECTED";
	
	public static final String SUBSCRIPTION_TERM_UNIT_UNEXPECTED = "SUBSCRIPTION_TERM_UNIT_UNEXPECTED";
	
	public static final String TRANSACTION_REJECTION_STATUS_NA = "TRANSACTION_REJECTION_STATUS_NA";
	
	public static final String TRANSACTION_STATUS_UNEXPECTED = "TRANSACTION_STATUS_UNEXPECTED";
	
	public static final String TRANSACTION_TYPE_UNEXPECTED = "TRANSACTION_TYPE_UNEXPECTED";
	
	public static final String CUSTOMER_TYPE_UNEXPECTED = "CUSTOMER_TYPE_UNEXPECTED";
	
	public static final String ENTERPRISE_ERROR_CODE_SYSTEM = "800";
	
	public static final String CUSTOMER_STATUS = "CUSTOMER_STATUS";
	
	public static final String SPACE = " ";
	
	public static final String S = "S";
	
	public static final String MATID_LENGTH_ERROR = "length must be at most 18 CHARACTERs";

	public static final String ZERO = "0";
	
	public static final String TWO = "2";
	
	public static final String SOLD_TO_ADDRESS = "soldToAddress";
	
	public static final String BILL_TO_ADDRESS = "billToAddress";
	
	public static final String SHIP_TO_ADDRESS = "shipToAddress";
	
	public static final String CUSTOMER_ADDRESS = "customerAddress";

	public static final String PARTNER_FUNCTION_UNEXPECTED = "PARTNER_FUNCTION_UNEXPECTED";

	public static final String INVOICE_REQUEST_TYPE_UNEXPECTED = "INVOICE_REQUEST_TYPE_UNEXPECTED";

	public static final String TRANSACTION_REJECTION_STATUS_UNEXPECTED = "TRANSACTION_REJECTION_STATUS_UNEXPECTED";

	public static final String LINE_ITEM_REJECTION_STATUS_UNEXPECTED = "LINE_ITEM_REJECTION_STATUS_UNEXPECTED";

	public static final String CREDIT_CARD_TYPE_UNEXPECTED = "CREDIT_CARD_TYPE_UNEXPECTED";

	public static final String BACK_ORDER_OPTION_UNEXPECTED = "BACK_ORDER_OPTION_UNEXPECTED";

	public static final String HANDLING_TERMS_UNEXPECTED = "HANDLING_TERMS_UNEXPECTED";

	public static final String ARRIVE_BY_REASON_UNEXPECTED = "ARRIVE_BY_REASON_UNEXPECTED";

	public static final String ORDER_REASON_UNEXPECTED = "ORDER_REASON_UNEXPECTED";

	public static final String SHIP_DATE_OPTION_UNEXPECTED = "SHIP_DATE_OPTION_UNEXPECTED";

	public static final String SHIPMENT_METHOD_UNEXPECTED = "SHIPMENT_METHOD_UNEXPECTED";

	public static final String SHIPPING_TERMS_UNEXPECTED = "SHIPPING_TERMS_UNEXPECTED";

	public static final String PACK_BY_OPTION_UNEXPECTED = "PACK_BY_OPTION_UNEXPECTED";

	public static final String TRUE = "true";

	public static final String FALSE = "false";

	public static final String YEAR = "YEAR";

	public static final String SUBSCRIPTION_TERM_UNIT_YEAR = "SUBSCRIPTION_TERM_UNIT_YEAR";

	public static final String MONTH = "MONTH";

	public static final String SUBSCRIPTION_TERM_UNIT_MONTH = "SUBSCRIPTION_TERM_UNIT_MONTH";

	public static final String WEEK = "WEEK";

	public static final String SUBSCRIPTION_TERM_UNIT_WEEK = "SUBSCRIPTION_TERM_UNIT_WEEK";

	public static final String DAY = "DAY";

	public static final String SUBSCRIPTION_TERM_UNIT_DAY = "SUBSCRIPTION_TERM_UNIT_DAY";

	public static final String ALWAYS = "ALWAYS";

	public static final String NEVER = "NEVER";

	public static final String CUSTOMER_RELATIONSHIP_UNEXPECTED = "CUSTOMER_RELATIONSHIP_UNEXPECTED";

	public static final String ALLOW_SUBSTITUTIONS_ALWAYS = "ALLOW_SUBSTITUTIONS_ALWAYS";

	public static final String ALWAYS_SUBSTITUTE = "Always Substitute";

	public static final String ALLOW_SUBSTITUTIONS_NEVER = "ALLOW_SUBSTITUTIONS_NEVER";

	public static final String NEVER_SUBSTITUTE = "Never Substitute";

	public static final String ALLOW_SUBSTITUTIONS_CUSTOMER_DEFAULT = "ALLOW_SUBSTITUTIONS_CUSTOMER_DEFAULT";

	public static final String CUSTOMER_DEFAULT = "CUSTOMER_DEFAULT";

	public static final String RG = "RG";

	public static final String I = "I";

	public static final String ZAFO = "ZAFO";

	public static final String ZERO_HEADER = "00000";

	public static final String B = "B";

	public static final String R = "R";

	public static final String BUS2032 = "BUS2032";

	public static final String A = "A";

	public static final String E = "E";

	public static final String HMC1 = "HMC1";

	public static final String ZOR = "ZOR";

	public static final String LEADING_ZEROES = "0000";

	public static final String ONE = "1";

	public static final String ZTB_QTY = "ZTB_QTY";

	public static final String ZFIP = "ZFIP";

	public static final String BAPE_VBAK = "BAPE_VBAK";
	
	public static final String BAPE_VBAK_X = "BAPE_VBAKX";

	public static final String ZTB_UNIT = "ZTB_UNIT";

	public static final String ORDER_SIMULATE_DAY = "DAY";

	public static final String ORDER_SIMULATE_WK = "WK";

	public static final String ORDER_SIMULATE_MON = "MON";

	public static final String ORDER_SIMULATE_YR = "YR";

	public static final String ZOVR = "ZOVR";
	
	/*
	 * Added to Handle Line Number in Simulate Order
	 */
	public static final String SALES_KEY_REFOBJECT_ITEM = "ITEM";
	
	public static final String SALES_KEY_STATUS = "S";
	
	public static final String LEADING_ZEROES_5 = "00000";
	
}
