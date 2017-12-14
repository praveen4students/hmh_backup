
package com.sforce.soap.enterprise.fault;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExceptionCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="API_CURRENTLY_DISABLED"/>
 *     &lt;enumeration value="API_DISABLED_FOR_ORG"/>
 *     &lt;enumeration value="CANT_ADD_STANDADRD_PORTAL_USER_TO_TERRITORY"/>
 *     &lt;enumeration value="CANT_ADD_STANDARD_PORTAL_USER_TO_TERRITORY"/>
 *     &lt;enumeration value="CIRCULAR_OBJECT_GRAPH"/>
 *     &lt;enumeration value="CLIENT_NOT_ACCESSIBLE_FOR_USER"/>
 *     &lt;enumeration value="CLIENT_REQUIRE_UPDATE_FOR_USER"/>
 *     &lt;enumeration value="CUSTOM_METADATA_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="DATACLOUD_API_CLIENT_EXCEPTION"/>
 *     &lt;enumeration value="DATACLOUD_API_SERVER_EXCEPTION"/>
 *     &lt;enumeration value="DATACLOUD_API_UNAVAILABLE"/>
 *     &lt;enumeration value="DUPLICATE_VALUE"/>
 *     &lt;enumeration value="EMAIL_BATCH_SIZE_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="EMAIL_TO_CASE_INVALID_ROUTING"/>
 *     &lt;enumeration value="EMAIL_TO_CASE_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="EMAIL_TO_CASE_NOT_ENABLED"/>
 *     &lt;enumeration value="EXCEEDED_ID_LIMIT"/>
 *     &lt;enumeration value="EXCEEDED_LEAD_CONVERT_LIMIT"/>
 *     &lt;enumeration value="EXCEEDED_MAX_SIZE_REQUEST"/>
 *     &lt;enumeration value="EXCEEDED_MAX_TYPES_LIMIT"/>
 *     &lt;enumeration value="EXCEEDED_QUOTA"/>
 *     &lt;enumeration value="FUNCTIONALITY_NOT_ENABLED"/>
 *     &lt;enumeration value="FUNCTIONALITY_TEMPORARILY_UNAVAILABLE"/>
 *     &lt;enumeration value="INACTIVE_OWNER_OR_USER"/>
 *     &lt;enumeration value="INACTIVE_PORTAL"/>
 *     &lt;enumeration value="INSUFFICIENT_ACCESS"/>
 *     &lt;enumeration value="INVALID_ASSIGNMENT_RULE"/>
 *     &lt;enumeration value="INVALID_BATCH_SIZE"/>
 *     &lt;enumeration value="INVALID_CLIENT"/>
 *     &lt;enumeration value="INVALID_CROSS_REFERENCE_KEY"/>
 *     &lt;enumeration value="INVALID_FIELD"/>
 *     &lt;enumeration value="INVALID_FILTER_LANGUAGE"/>
 *     &lt;enumeration value="INVALID_FILTER_VALUE"/>
 *     &lt;enumeration value="INVALID_ID_FIELD"/>
 *     &lt;enumeration value="INVALID_LOCALE_LANGUAGE"/>
 *     &lt;enumeration value="INVALID_LOCATOR"/>
 *     &lt;enumeration value="INVALID_LOGIN"/>
 *     &lt;enumeration value="INVALID_NEW_PASSWORD"/>
 *     &lt;enumeration value="INVALID_OPERATION"/>
 *     &lt;enumeration value="INVALID_OPERATION_WITH_EXPIRED_PASSWORD"/>
 *     &lt;enumeration value="INVALID_QUERY_FILTER_OPERATOR"/>
 *     &lt;enumeration value="INVALID_QUERY_LOCATOR"/>
 *     &lt;enumeration value="INVALID_QUERY_SCOPE"/>
 *     &lt;enumeration value="INVALID_REPLICATION_DATE"/>
 *     &lt;enumeration value="INVALID_SEARCH"/>
 *     &lt;enumeration value="INVALID_SEARCH_SCOPE"/>
 *     &lt;enumeration value="INVALID_SESSION_ID"/>
 *     &lt;enumeration value="INVALID_SOAP_HEADER"/>
 *     &lt;enumeration value="INVALID_SSO_GATEWAY_URL"/>
 *     &lt;enumeration value="INVALID_TYPE"/>
 *     &lt;enumeration value="INVALID_TYPE_FOR_OPERATION"/>
 *     &lt;enumeration value="JIGSAW_IMPORT_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="JIGSAW_REQUEST_NOT_SUPPORTED"/>
 *     &lt;enumeration value="JSON_PARSER_ERROR"/>
 *     &lt;enumeration value="LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="LOGIN_CHALLENGE_ISSUED"/>
 *     &lt;enumeration value="LOGIN_CHALLENGE_PENDING"/>
 *     &lt;enumeration value="LOGIN_DURING_RESTRICTED_DOMAIN"/>
 *     &lt;enumeration value="LOGIN_DURING_RESTRICTED_TIME"/>
 *     &lt;enumeration value="LOGIN_MUST_USE_SECURITY_TOKEN"/>
 *     &lt;enumeration value="MALFORMED_ID"/>
 *     &lt;enumeration value="MALFORMED_QUERY"/>
 *     &lt;enumeration value="MALFORMED_SEARCH"/>
 *     &lt;enumeration value="MISSING_ARGUMENT"/>
 *     &lt;enumeration value="NOT_MODIFIED"/>
 *     &lt;enumeration value="NO_SOFTPHONE_LAYOUT"/>
 *     &lt;enumeration value="NUMBER_OUTSIDE_VALID_RANGE"/>
 *     &lt;enumeration value="OPERATION_TOO_LARGE"/>
 *     &lt;enumeration value="ORG_IN_MAINTENANCE"/>
 *     &lt;enumeration value="ORG_IS_DOT_ORG"/>
 *     &lt;enumeration value="ORG_LOCKED"/>
 *     &lt;enumeration value="ORG_NOT_OWNED_BY_INSTANCE"/>
 *     &lt;enumeration value="PASSWORD_LOCKOUT"/>
 *     &lt;enumeration value="PORTAL_NO_ACCESS"/>
 *     &lt;enumeration value="QUERY_TIMEOUT"/>
 *     &lt;enumeration value="QUERY_TOO_COMPLICATED"/>
 *     &lt;enumeration value="REQUEST_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="REQUEST_RUNNING_TOO_LONG"/>
 *     &lt;enumeration value="SERVER_UNAVAILABLE"/>
 *     &lt;enumeration value="SOCIALCRM_FEEDSERVICE_API_CLIENT_EXCEPTION"/>
 *     &lt;enumeration value="SOCIALCRM_FEEDSERVICE_API_SERVER_EXCEPTION"/>
 *     &lt;enumeration value="SOCIALCRM_FEEDSERVICE_API_UNAVAILABLE"/>
 *     &lt;enumeration value="SSO_SERVICE_DOWN"/>
 *     &lt;enumeration value="TOO_MANY_APEX_REQUESTS"/>
 *     &lt;enumeration value="TRIAL_EXPIRED"/>
 *     &lt;enumeration value="UNKNOWN_EXCEPTION"/>
 *     &lt;enumeration value="UNSUPPORTED_API_VERSION"/>
 *     &lt;enumeration value="UNSUPPORTED_CLIENT"/>
 *     &lt;enumeration value="UNSUPPORTED_MEDIA_TYPE"/>
 *     &lt;enumeration value="XML_PARSER_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExceptionCode")
@XmlEnum
public enum ExceptionCode {

    @XmlEnumValue("API_CURRENTLY_DISABLED")
    API___CURRENTLY___DISABLED("API_CURRENTLY_DISABLED"),
    @XmlEnumValue("API_DISABLED_FOR_ORG")
    API___DISABLED___FOR___ORG("API_DISABLED_FOR_ORG"),
    @XmlEnumValue("CANT_ADD_STANDADRD_PORTAL_USER_TO_TERRITORY")
    CANT___ADD___STANDADRD___PORTAL___USER___TO___TERRITORY("CANT_ADD_STANDADRD_PORTAL_USER_TO_TERRITORY"),
    @XmlEnumValue("CANT_ADD_STANDARD_PORTAL_USER_TO_TERRITORY")
    CANT___ADD___STANDARD___PORTAL___USER___TO___TERRITORY("CANT_ADD_STANDARD_PORTAL_USER_TO_TERRITORY"),
    @XmlEnumValue("CIRCULAR_OBJECT_GRAPH")
    CIRCULAR___OBJECT___GRAPH("CIRCULAR_OBJECT_GRAPH"),
    @XmlEnumValue("CLIENT_NOT_ACCESSIBLE_FOR_USER")
    CLIENT___NOT___ACCESSIBLE___FOR___USER("CLIENT_NOT_ACCESSIBLE_FOR_USER"),
    @XmlEnumValue("CLIENT_REQUIRE_UPDATE_FOR_USER")
    CLIENT___REQUIRE___UPDATE___FOR___USER("CLIENT_REQUIRE_UPDATE_FOR_USER"),
    @XmlEnumValue("CUSTOM_METADATA_LIMIT_EXCEEDED")
    CUSTOM___METADATA___LIMIT___EXCEEDED("CUSTOM_METADATA_LIMIT_EXCEEDED"),
    @XmlEnumValue("DATACLOUD_API_CLIENT_EXCEPTION")
    DATACLOUD___API___CLIENT___EXCEPTION("DATACLOUD_API_CLIENT_EXCEPTION"),
    @XmlEnumValue("DATACLOUD_API_SERVER_EXCEPTION")
    DATACLOUD___API___SERVER___EXCEPTION("DATACLOUD_API_SERVER_EXCEPTION"),
    @XmlEnumValue("DATACLOUD_API_UNAVAILABLE")
    DATACLOUD___API___UNAVAILABLE("DATACLOUD_API_UNAVAILABLE"),
    @XmlEnumValue("DUPLICATE_VALUE")
    DUPLICATE___VALUE("DUPLICATE_VALUE"),
    @XmlEnumValue("EMAIL_BATCH_SIZE_LIMIT_EXCEEDED")
    EMAIL___BATCH___SIZE___LIMIT___EXCEEDED("EMAIL_BATCH_SIZE_LIMIT_EXCEEDED"),
    @XmlEnumValue("EMAIL_TO_CASE_INVALID_ROUTING")
    EMAIL___TO___CASE___INVALID___ROUTING("EMAIL_TO_CASE_INVALID_ROUTING"),
    @XmlEnumValue("EMAIL_TO_CASE_LIMIT_EXCEEDED")
    EMAIL___TO___CASE___LIMIT___EXCEEDED("EMAIL_TO_CASE_LIMIT_EXCEEDED"),
    @XmlEnumValue("EMAIL_TO_CASE_NOT_ENABLED")
    EMAIL___TO___CASE___NOT___ENABLED("EMAIL_TO_CASE_NOT_ENABLED"),
    @XmlEnumValue("EXCEEDED_ID_LIMIT")
    EXCEEDED___ID___LIMIT("EXCEEDED_ID_LIMIT"),
    @XmlEnumValue("EXCEEDED_LEAD_CONVERT_LIMIT")
    EXCEEDED___LEAD___CONVERT___LIMIT("EXCEEDED_LEAD_CONVERT_LIMIT"),
    @XmlEnumValue("EXCEEDED_MAX_SIZE_REQUEST")
    EXCEEDED___MAX___SIZE___REQUEST("EXCEEDED_MAX_SIZE_REQUEST"),
    @XmlEnumValue("EXCEEDED_MAX_TYPES_LIMIT")
    EXCEEDED___MAX___TYPES___LIMIT("EXCEEDED_MAX_TYPES_LIMIT"),
    @XmlEnumValue("EXCEEDED_QUOTA")
    EXCEEDED___QUOTA("EXCEEDED_QUOTA"),
    @XmlEnumValue("FUNCTIONALITY_NOT_ENABLED")
    FUNCTIONALITY___NOT___ENABLED("FUNCTIONALITY_NOT_ENABLED"),
    @XmlEnumValue("FUNCTIONALITY_TEMPORARILY_UNAVAILABLE")
    FUNCTIONALITY___TEMPORARILY___UNAVAILABLE("FUNCTIONALITY_TEMPORARILY_UNAVAILABLE"),
    @XmlEnumValue("INACTIVE_OWNER_OR_USER")
    INACTIVE___OWNER___OR___USER("INACTIVE_OWNER_OR_USER"),
    @XmlEnumValue("INACTIVE_PORTAL")
    INACTIVE___PORTAL("INACTIVE_PORTAL"),
    @XmlEnumValue("INSUFFICIENT_ACCESS")
    INSUFFICIENT___ACCESS("INSUFFICIENT_ACCESS"),
    @XmlEnumValue("INVALID_ASSIGNMENT_RULE")
    INVALID___ASSIGNMENT___RULE("INVALID_ASSIGNMENT_RULE"),
    @XmlEnumValue("INVALID_BATCH_SIZE")
    INVALID___BATCH___SIZE("INVALID_BATCH_SIZE"),
    @XmlEnumValue("INVALID_CLIENT")
    INVALID___CLIENT("INVALID_CLIENT"),
    @XmlEnumValue("INVALID_CROSS_REFERENCE_KEY")
    INVALID___CROSS___REFERENCE___KEY("INVALID_CROSS_REFERENCE_KEY"),
    @XmlEnumValue("INVALID_FIELD")
    INVALID___FIELD("INVALID_FIELD"),
    @XmlEnumValue("INVALID_FILTER_LANGUAGE")
    INVALID___FILTER___LANGUAGE("INVALID_FILTER_LANGUAGE"),
    @XmlEnumValue("INVALID_FILTER_VALUE")
    INVALID___FILTER___VALUE("INVALID_FILTER_VALUE"),
    @XmlEnumValue("INVALID_ID_FIELD")
    INVALID___ID___FIELD("INVALID_ID_FIELD"),
    @XmlEnumValue("INVALID_LOCALE_LANGUAGE")
    INVALID___LOCALE___LANGUAGE("INVALID_LOCALE_LANGUAGE"),
    @XmlEnumValue("INVALID_LOCATOR")
    INVALID___LOCATOR("INVALID_LOCATOR"),
    @XmlEnumValue("INVALID_LOGIN")
    INVALID___LOGIN("INVALID_LOGIN"),
    @XmlEnumValue("INVALID_NEW_PASSWORD")
    INVALID___NEW___PASSWORD("INVALID_NEW_PASSWORD"),
    @XmlEnumValue("INVALID_OPERATION")
    INVALID___OPERATION("INVALID_OPERATION"),
    @XmlEnumValue("INVALID_OPERATION_WITH_EXPIRED_PASSWORD")
    INVALID___OPERATION___WITH___EXPIRED___PASSWORD("INVALID_OPERATION_WITH_EXPIRED_PASSWORD"),
    @XmlEnumValue("INVALID_QUERY_FILTER_OPERATOR")
    INVALID___QUERY___FILTER___OPERATOR("INVALID_QUERY_FILTER_OPERATOR"),
    @XmlEnumValue("INVALID_QUERY_LOCATOR")
    INVALID___QUERY___LOCATOR("INVALID_QUERY_LOCATOR"),
    @XmlEnumValue("INVALID_QUERY_SCOPE")
    INVALID___QUERY___SCOPE("INVALID_QUERY_SCOPE"),
    @XmlEnumValue("INVALID_REPLICATION_DATE")
    INVALID___REPLICATION___DATE("INVALID_REPLICATION_DATE"),
    @XmlEnumValue("INVALID_SEARCH")
    INVALID___SEARCH("INVALID_SEARCH"),
    @XmlEnumValue("INVALID_SEARCH_SCOPE")
    INVALID___SEARCH___SCOPE("INVALID_SEARCH_SCOPE"),
    @XmlEnumValue("INVALID_SESSION_ID")
    INVALID___SESSION___ID("INVALID_SESSION_ID"),
    @XmlEnumValue("INVALID_SOAP_HEADER")
    INVALID___SOAP___HEADER("INVALID_SOAP_HEADER"),
    @XmlEnumValue("INVALID_SSO_GATEWAY_URL")
    INVALID___SSO___GATEWAY___URL("INVALID_SSO_GATEWAY_URL"),
    @XmlEnumValue("INVALID_TYPE")
    INVALID___TYPE("INVALID_TYPE"),
    @XmlEnumValue("INVALID_TYPE_FOR_OPERATION")
    INVALID___TYPE___FOR___OPERATION("INVALID_TYPE_FOR_OPERATION"),
    @XmlEnumValue("JIGSAW_IMPORT_LIMIT_EXCEEDED")
    JIGSAW___IMPORT___LIMIT___EXCEEDED("JIGSAW_IMPORT_LIMIT_EXCEEDED"),
    @XmlEnumValue("JIGSAW_REQUEST_NOT_SUPPORTED")
    JIGSAW___REQUEST___NOT___SUPPORTED("JIGSAW_REQUEST_NOT_SUPPORTED"),
    @XmlEnumValue("JSON_PARSER_ERROR")
    JSON___PARSER___ERROR("JSON_PARSER_ERROR"),
    @XmlEnumValue("LIMIT_EXCEEDED")
    LIMIT___EXCEEDED("LIMIT_EXCEEDED"),
    @XmlEnumValue("LOGIN_CHALLENGE_ISSUED")
    LOGIN___CHALLENGE___ISSUED("LOGIN_CHALLENGE_ISSUED"),
    @XmlEnumValue("LOGIN_CHALLENGE_PENDING")
    LOGIN___CHALLENGE___PENDING("LOGIN_CHALLENGE_PENDING"),
    @XmlEnumValue("LOGIN_DURING_RESTRICTED_DOMAIN")
    LOGIN___DURING___RESTRICTED___DOMAIN("LOGIN_DURING_RESTRICTED_DOMAIN"),
    @XmlEnumValue("LOGIN_DURING_RESTRICTED_TIME")
    LOGIN___DURING___RESTRICTED___TIME("LOGIN_DURING_RESTRICTED_TIME"),
    @XmlEnumValue("LOGIN_MUST_USE_SECURITY_TOKEN")
    LOGIN___MUST___USE___SECURITY___TOKEN("LOGIN_MUST_USE_SECURITY_TOKEN"),
    @XmlEnumValue("MALFORMED_ID")
    MALFORMED___ID("MALFORMED_ID"),
    @XmlEnumValue("MALFORMED_QUERY")
    MALFORMED___QUERY("MALFORMED_QUERY"),
    @XmlEnumValue("MALFORMED_SEARCH")
    MALFORMED___SEARCH("MALFORMED_SEARCH"),
    @XmlEnumValue("MISSING_ARGUMENT")
    MISSING___ARGUMENT("MISSING_ARGUMENT"),
    @XmlEnumValue("NOT_MODIFIED")
    NOT___MODIFIED("NOT_MODIFIED"),
    @XmlEnumValue("NO_SOFTPHONE_LAYOUT")
    NO___SOFTPHONE___LAYOUT("NO_SOFTPHONE_LAYOUT"),
    @XmlEnumValue("NUMBER_OUTSIDE_VALID_RANGE")
    NUMBER___OUTSIDE___VALID___RANGE("NUMBER_OUTSIDE_VALID_RANGE"),
    @XmlEnumValue("OPERATION_TOO_LARGE")
    OPERATION___TOO___LARGE("OPERATION_TOO_LARGE"),
    @XmlEnumValue("ORG_IN_MAINTENANCE")
    ORG___IN___MAINTENANCE("ORG_IN_MAINTENANCE"),
    @XmlEnumValue("ORG_IS_DOT_ORG")
    ORG___IS___DOT___ORG("ORG_IS_DOT_ORG"),
    @XmlEnumValue("ORG_LOCKED")
    ORG___LOCKED("ORG_LOCKED"),
    @XmlEnumValue("ORG_NOT_OWNED_BY_INSTANCE")
    ORG___NOT___OWNED___BY___INSTANCE("ORG_NOT_OWNED_BY_INSTANCE"),
    @XmlEnumValue("PASSWORD_LOCKOUT")
    PASSWORD___LOCKOUT("PASSWORD_LOCKOUT"),
    @XmlEnumValue("PORTAL_NO_ACCESS")
    PORTAL___NO___ACCESS("PORTAL_NO_ACCESS"),
    @XmlEnumValue("QUERY_TIMEOUT")
    QUERY___TIMEOUT("QUERY_TIMEOUT"),
    @XmlEnumValue("QUERY_TOO_COMPLICATED")
    QUERY___TOO___COMPLICATED("QUERY_TOO_COMPLICATED"),
    @XmlEnumValue("REQUEST_LIMIT_EXCEEDED")
    REQUEST___LIMIT___EXCEEDED("REQUEST_LIMIT_EXCEEDED"),
    @XmlEnumValue("REQUEST_RUNNING_TOO_LONG")
    REQUEST___RUNNING___TOO___LONG("REQUEST_RUNNING_TOO_LONG"),
    @XmlEnumValue("SERVER_UNAVAILABLE")
    SERVER___UNAVAILABLE("SERVER_UNAVAILABLE"),
    @XmlEnumValue("SOCIALCRM_FEEDSERVICE_API_CLIENT_EXCEPTION")
    SOCIALCRM___FEEDSERVICE___API___CLIENT___EXCEPTION("SOCIALCRM_FEEDSERVICE_API_CLIENT_EXCEPTION"),
    @XmlEnumValue("SOCIALCRM_FEEDSERVICE_API_SERVER_EXCEPTION")
    SOCIALCRM___FEEDSERVICE___API___SERVER___EXCEPTION("SOCIALCRM_FEEDSERVICE_API_SERVER_EXCEPTION"),
    @XmlEnumValue("SOCIALCRM_FEEDSERVICE_API_UNAVAILABLE")
    SOCIALCRM___FEEDSERVICE___API___UNAVAILABLE("SOCIALCRM_FEEDSERVICE_API_UNAVAILABLE"),
    @XmlEnumValue("SSO_SERVICE_DOWN")
    SSO___SERVICE___DOWN("SSO_SERVICE_DOWN"),
    @XmlEnumValue("TOO_MANY_APEX_REQUESTS")
    TOO___MANY___APEX___REQUESTS("TOO_MANY_APEX_REQUESTS"),
    @XmlEnumValue("TRIAL_EXPIRED")
    TRIAL___EXPIRED("TRIAL_EXPIRED"),
    @XmlEnumValue("UNKNOWN_EXCEPTION")
    UNKNOWN___EXCEPTION("UNKNOWN_EXCEPTION"),
    @XmlEnumValue("UNSUPPORTED_API_VERSION")
    UNSUPPORTED___API___VERSION("UNSUPPORTED_API_VERSION"),
    @XmlEnumValue("UNSUPPORTED_CLIENT")
    UNSUPPORTED___CLIENT("UNSUPPORTED_CLIENT"),
    @XmlEnumValue("UNSUPPORTED_MEDIA_TYPE")
    UNSUPPORTED___MEDIA___TYPE("UNSUPPORTED_MEDIA_TYPE"),
    @XmlEnumValue("XML_PARSER_ERROR")
    XML___PARSER___ERROR("XML_PARSER_ERROR");
    private final String value;

    ExceptionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExceptionCode fromValue(String v) {
        for (ExceptionCode c: ExceptionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
