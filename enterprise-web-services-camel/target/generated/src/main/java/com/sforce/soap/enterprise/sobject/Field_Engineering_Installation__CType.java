
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for Field_Engineering_Installation__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field_Engineering_Installation__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Access_Outside_of_District__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Additional_Comments__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Additional_Content_Notes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_City__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_State__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Zip__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_use_location_of_server__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Application_Web_Servers__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Auto_import_configured__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auto_license_set_up_for_URL__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cert_Available__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Clustered__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Common_Core_Standards_Current__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Compress_and_Move_Backups_MySQL__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Compress_and_Move_IIS_Logs_IIS__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectionReceived" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionReceivedId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ConnectionSent" type="{urn:sobject.enterprise.soap.sforce.com}PartnerNetworkConnection" minOccurs="0"/>
 *         &lt;element name="ConnectionSentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Contact_Email__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact_Phone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Correlations_to_State_Standards_Current__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DLM_Checklist_URL__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DLM_New_Users_Imported__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Database_Backup_Jobs_Created__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Database_Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date_of_install_update__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="District_Name__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Duplicate_Content_Check_Done__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Duplicate_Content_Check__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EOY_Clean_Up__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ER_New_Users_Imported__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ER_Server_time_and_time_zone_set_up__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="HTTPS__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="How_many_users_in_the_DB__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Install_txt_Document_Created__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Installation_Path__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LDAP_Integration__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LT_Asset__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LT_Asset__r" type="{urn:sobject.enterprise.soap.sforce.com}LT_Asset__c" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Load_Balanced__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MIME_Types_Added_IIS__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Migration__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="New_Users_Imported__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Previous_Product_Version__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Product_Version_Installed__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_10__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_11__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_12__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_13__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_14__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_15__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_16__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_17__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_18__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_19__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_20__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_21__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_22__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_23__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_24__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_25__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_4__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_5__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_6__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_7__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_8__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No_9__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_if_No__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remote_Login_info_in_Database__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSO__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Schema_Mapping__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Server_time_and_time_zone_set_up__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="System_tests_exist_for_all_activities__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="System_tests_exist_for_all_courses__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="System_tests_exist_for_all_lesson_plans__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Technical_Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Technical_Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="Tested_Launching_All_Content__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tomcat_Service_Memory_Pool_Settings__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tomcat_Service_Monitor_Installed_Win__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tomcat_Set_As_System_Service__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Training_Users_Available__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Usage_Reports_Added_IIS__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field_Engineering_Installation__c", propOrder = {
    "accessOutsideOfDistrictC",
    "additionalCommentsC",
    "additionalContentNotesC",
    "addressCityC",
    "addressStateC",
    "addressZipC",
    "addressUseLocationOfServerC",
    "applicationWebServersR",
    "attachments",
    "autoImportConfiguredC",
    "autoLicenseSetUpForURLC",
    "certAvailableC",
    "clusteredC",
    "commonCoreStandardsCurrentC",
    "compressAndMoveBackupsMySQLC",
    "compressAndMoveIISLogsIISC",
    "connectionReceived",
    "connectionReceivedId",
    "connectionSent",
    "connectionSentId",
    "contactEmailC",
    "contactPhoneC",
    "contentC",
    "correlationsToStateStandardsCurrentC",
    "createdBy",
    "createdById",
    "createdDate",
    "dlmChecklistURLC",
    "dlmNewUsersImportedC",
    "databaseBackupJobsCreatedC",
    "databaseTypeC",
    "dateOfInstallUpdateC",
    "districtNameC",
    "duplicateContentCheckDoneC",
    "duplicateContentCheckC",
    "eoyCleanUpC",
    "erNewUsersImportedC",
    "erServerTimeAndTimeZoneSetUpC",
    "feedSubscriptionsForEntity",
    "httpsC",
    "howManyUsersInTheDBC",
    "installTxtDocumentCreatedC",
    "installationPathC",
    "isDeleted",
    "ldapIntegrationC",
    "ltAssetC",
    "ltAssetR",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "loadBalancedC",
    "mimeTypesAddedIISC",
    "migrationC",
    "name",
    "newUsersImportedC",
    "notes",
    "notesAndAttachments",
    "previousProductVersionC",
    "processInstances",
    "processSteps",
    "productVersionInstalledC",
    "reasonIfNo10C",
    "reasonIfNo11C",
    "reasonIfNo12C",
    "reasonIfNo13C",
    "reasonIfNo14C",
    "reasonIfNo15C",
    "reasonIfNo16C",
    "reasonIfNo17C",
    "reasonIfNo18C",
    "reasonIfNo19C",
    "reasonIfNo1C",
    "reasonIfNo20C",
    "reasonIfNo21C",
    "reasonIfNo22C",
    "reasonIfNo23C",
    "reasonIfNo24C",
    "reasonIfNo25C",
    "reasonIfNo2C",
    "reasonIfNo3C",
    "reasonIfNo4C",
    "reasonIfNo5C",
    "reasonIfNo6C",
    "reasonIfNo7C",
    "reasonIfNo8C",
    "reasonIfNo9C",
    "reasonIfNoC",
    "remoteLoginInfoInDatabaseC",
    "ssoC",
    "schemaMappingC",
    "serverTimeAndTimeZoneSetUpC",
    "systemModstamp",
    "systemTestsExistForAllActivitiesC",
    "systemTestsExistForAllCoursesC",
    "systemTestsExistForAllLessonPlansC",
    "technicalContactC",
    "technicalContactR",
    "testedLaunchingAllContentC",
    "tomcatServiceMemoryPoolSettingsC",
    "tomcatServiceMonitorInstalledWinC",
    "tomcatSetAsSystemServiceC",
    "trainingUsersAvailableC",
    "typeC",
    "urlC",
    "usageReportsAddedIISC"
})
public class Field_Engineering_Installation__CType
    extends SObjectType
{

    @XmlElement(name = "Access_Outside_of_District__c", nillable = true)
    protected Boolean accessOutsideOfDistrictC;
    @XmlElement(name = "Additional_Comments__c", nillable = true)
    protected String additionalCommentsC;
    @XmlElement(name = "Additional_Content_Notes__c", nillable = true)
    protected String additionalContentNotesC;
    @XmlElement(name = "Address_City__c", nillable = true)
    protected String addressCityC;
    @XmlElement(name = "Address_State__c", nillable = true)
    protected String addressStateC;
    @XmlElement(name = "Address_Zip__c", nillable = true)
    protected String addressZipC;
    @XmlElement(name = "Address_use_location_of_server__c", nillable = true)
    protected String addressUseLocationOfServerC;
    @XmlElement(name = "Application_Web_Servers__r", nillable = true)
    protected QueryResult applicationWebServersR;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResult attachments;
    @XmlElement(name = "Auto_import_configured__c", nillable = true)
    protected String autoImportConfiguredC;
    @XmlElement(name = "Auto_license_set_up_for_URL__c", nillable = true)
    protected String autoLicenseSetUpForURLC;
    @XmlElement(name = "Cert_Available__c", nillable = true)
    protected Boolean certAvailableC;
    @XmlElement(name = "Clustered__c", nillable = true)
    protected Boolean clusteredC;
    @XmlElement(name = "Common_Core_Standards_Current__c", nillable = true)
    protected String commonCoreStandardsCurrentC;
    @XmlElement(name = "Compress_and_Move_Backups_MySQL__c", nillable = true)
    protected String compressAndMoveBackupsMySQLC;
    @XmlElement(name = "Compress_and_Move_IIS_Logs_IIS__c", nillable = true)
    protected String compressAndMoveIISLogsIISC;
    @XmlElement(name = "ConnectionReceived", nillable = true)
    protected PartnerNetworkConnectionType connectionReceived;
    @XmlElement(name = "ConnectionReceivedId", nillable = true)
    protected String connectionReceivedId;
    @XmlElement(name = "ConnectionSent", nillable = true)
    protected PartnerNetworkConnectionType connectionSent;
    @XmlElement(name = "ConnectionSentId", nillable = true)
    protected String connectionSentId;
    @XmlElement(name = "Contact_Email__c", nillable = true)
    protected String contactEmailC;
    @XmlElement(name = "Contact_Phone__c", nillable = true)
    protected String contactPhoneC;
    @XmlElement(name = "Content__c", nillable = true)
    protected String contentC;
    @XmlElement(name = "Correlations_to_State_Standards_Current__c", nillable = true)
    protected String correlationsToStateStandardsCurrentC;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected UserType createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "DLM_Checklist_URL__c", nillable = true)
    protected String dlmChecklistURLC;
    @XmlElement(name = "DLM_New_Users_Imported__c", nillable = true)
    protected String dlmNewUsersImportedC;
    @XmlElement(name = "Database_Backup_Jobs_Created__c", nillable = true)
    protected String databaseBackupJobsCreatedC;
    @XmlElement(name = "Database_Type__c", nillable = true)
    protected String databaseTypeC;
    @XmlElement(name = "Date_of_install_update__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfInstallUpdateC;
    @XmlElement(name = "District_Name__c", nillable = true)
    protected String districtNameC;
    @XmlElement(name = "Duplicate_Content_Check_Done__c", nillable = true)
    protected String duplicateContentCheckDoneC;
    @XmlElement(name = "Duplicate_Content_Check__c", nillable = true)
    protected String duplicateContentCheckC;
    @XmlElement(name = "EOY_Clean_Up__c", nillable = true)
    protected String eoyCleanUpC;
    @XmlElement(name = "ER_New_Users_Imported__c", nillable = true)
    protected String erNewUsersImportedC;
    @XmlElement(name = "ER_Server_time_and_time_zone_set_up__c", nillable = true)
    protected String erServerTimeAndTimeZoneSetUpC;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "HTTPS__c", nillable = true)
    protected Boolean httpsC;
    @XmlElement(name = "How_many_users_in_the_DB__c", nillable = true)
    protected Double howManyUsersInTheDBC;
    @XmlElement(name = "Install_txt_Document_Created__c", nillable = true)
    protected String installTxtDocumentCreatedC;
    @XmlElement(name = "Installation_Path__c", nillable = true)
    protected String installationPathC;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "LDAP_Integration__c", nillable = true)
    protected Boolean ldapIntegrationC;
    @XmlElement(name = "LT_Asset__c", nillable = true)
    protected String ltAssetC;
    @XmlElement(name = "LT_Asset__r", nillable = true)
    protected LT_Asset__CType ltAssetR;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected UserType lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Load_Balanced__c", nillable = true)
    protected Boolean loadBalancedC;
    @XmlElement(name = "MIME_Types_Added_IIS__c", nillable = true)
    protected String mimeTypesAddedIISC;
    @XmlElement(name = "Migration__c", nillable = true)
    protected Boolean migrationC;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "New_Users_Imported__c", nillable = true)
    protected String newUsersImportedC;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResult notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResult notesAndAttachments;
    @XmlElement(name = "Previous_Product_Version__c", nillable = true)
    protected String previousProductVersionC;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResult processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResult processSteps;
    @XmlElement(name = "Product_Version_Installed__c", nillable = true)
    protected String productVersionInstalledC;
    @XmlElement(name = "Reason_if_No_10__c", nillable = true)
    protected String reasonIfNo10C;
    @XmlElement(name = "Reason_if_No_11__c", nillable = true)
    protected String reasonIfNo11C;
    @XmlElement(name = "Reason_if_No_12__c", nillable = true)
    protected String reasonIfNo12C;
    @XmlElement(name = "Reason_if_No_13__c", nillable = true)
    protected String reasonIfNo13C;
    @XmlElement(name = "Reason_if_No_14__c", nillable = true)
    protected String reasonIfNo14C;
    @XmlElement(name = "Reason_if_No_15__c", nillable = true)
    protected String reasonIfNo15C;
    @XmlElement(name = "Reason_if_No_16__c", nillable = true)
    protected String reasonIfNo16C;
    @XmlElement(name = "Reason_if_No_17__c", nillable = true)
    protected String reasonIfNo17C;
    @XmlElement(name = "Reason_if_No_18__c", nillable = true)
    protected String reasonIfNo18C;
    @XmlElement(name = "Reason_if_No_19__c", nillable = true)
    protected String reasonIfNo19C;
    @XmlElement(name = "Reason_if_No_1__c", nillable = true)
    protected String reasonIfNo1C;
    @XmlElement(name = "Reason_if_No_20__c", nillable = true)
    protected String reasonIfNo20C;
    @XmlElement(name = "Reason_if_No_21__c", nillable = true)
    protected String reasonIfNo21C;
    @XmlElement(name = "Reason_if_No_22__c", nillable = true)
    protected String reasonIfNo22C;
    @XmlElement(name = "Reason_if_No_23__c", nillable = true)
    protected String reasonIfNo23C;
    @XmlElement(name = "Reason_if_No_24__c", nillable = true)
    protected String reasonIfNo24C;
    @XmlElement(name = "Reason_if_No_25__c", nillable = true)
    protected String reasonIfNo25C;
    @XmlElement(name = "Reason_if_No_2__c", nillable = true)
    protected String reasonIfNo2C;
    @XmlElement(name = "Reason_if_No_3__c", nillable = true)
    protected String reasonIfNo3C;
    @XmlElement(name = "Reason_if_No_4__c", nillable = true)
    protected String reasonIfNo4C;
    @XmlElement(name = "Reason_if_No_5__c", nillable = true)
    protected String reasonIfNo5C;
    @XmlElement(name = "Reason_if_No_6__c", nillable = true)
    protected String reasonIfNo6C;
    @XmlElement(name = "Reason_if_No_7__c", nillable = true)
    protected String reasonIfNo7C;
    @XmlElement(name = "Reason_if_No_8__c", nillable = true)
    protected String reasonIfNo8C;
    @XmlElement(name = "Reason_if_No_9__c", nillable = true)
    protected String reasonIfNo9C;
    @XmlElement(name = "Reason_if_No__c", nillable = true)
    protected String reasonIfNoC;
    @XmlElement(name = "Remote_Login_info_in_Database__c", nillable = true)
    protected String remoteLoginInfoInDatabaseC;
    @XmlElement(name = "SSO__c", nillable = true)
    protected Boolean ssoC;
    @XmlElement(name = "Schema_Mapping__c", nillable = true)
    protected String schemaMappingC;
    @XmlElement(name = "Server_time_and_time_zone_set_up__c", nillable = true)
    protected String serverTimeAndTimeZoneSetUpC;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "System_tests_exist_for_all_activities__c", nillable = true)
    protected String systemTestsExistForAllActivitiesC;
    @XmlElement(name = "System_tests_exist_for_all_courses__c", nillable = true)
    protected String systemTestsExistForAllCoursesC;
    @XmlElement(name = "System_tests_exist_for_all_lesson_plans__c", nillable = true)
    protected String systemTestsExistForAllLessonPlansC;
    @XmlElement(name = "Technical_Contact__c", nillable = true)
    protected String technicalContactC;
    @XmlElement(name = "Technical_Contact__r", nillable = true)
    protected ContactType technicalContactR;
    @XmlElement(name = "Tested_Launching_All_Content__c", nillable = true)
    protected String testedLaunchingAllContentC;
    @XmlElement(name = "Tomcat_Service_Memory_Pool_Settings__c", nillable = true)
    protected String tomcatServiceMemoryPoolSettingsC;
    @XmlElement(name = "Tomcat_Service_Monitor_Installed_Win__c", nillable = true)
    protected String tomcatServiceMonitorInstalledWinC;
    @XmlElement(name = "Tomcat_Set_As_System_Service__c", nillable = true)
    protected String tomcatSetAsSystemServiceC;
    @XmlElement(name = "Training_Users_Available__c", nillable = true)
    protected String trainingUsersAvailableC;
    @XmlElement(name = "Type__c", nillable = true)
    protected String typeC;
    @XmlElement(name = "URL__c", nillable = true)
    protected String urlC;
    @XmlElement(name = "Usage_Reports_Added_IIS__c", nillable = true)
    protected String usageReportsAddedIISC;

    /**
     * Gets the value of the access_Outside_Of_District__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccess_Outside_Of_District__C() {
        return accessOutsideOfDistrictC;
    }

    /**
     * Sets the value of the access_Outside_Of_District__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccess_Outside_Of_District__C(Boolean value) {
        this.accessOutsideOfDistrictC = value;
    }

    /**
     * Gets the value of the additional_Comments__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditional_Comments__C() {
        return additionalCommentsC;
    }

    /**
     * Sets the value of the additional_Comments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditional_Comments__C(String value) {
        this.additionalCommentsC = value;
    }

    /**
     * Gets the value of the additional_Content_Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditional_Content_Notes__C() {
        return additionalContentNotesC;
    }

    /**
     * Sets the value of the additional_Content_Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditional_Content_Notes__C(String value) {
        this.additionalContentNotesC = value;
    }

    /**
     * Gets the value of the address_City__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress_City__C() {
        return addressCityC;
    }

    /**
     * Sets the value of the address_City__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress_City__C(String value) {
        this.addressCityC = value;
    }

    /**
     * Gets the value of the address_State__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress_State__C() {
        return addressStateC;
    }

    /**
     * Sets the value of the address_State__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress_State__C(String value) {
        this.addressStateC = value;
    }

    /**
     * Gets the value of the address_Zip__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress_Zip__C() {
        return addressZipC;
    }

    /**
     * Sets the value of the address_Zip__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress_Zip__C(String value) {
        this.addressZipC = value;
    }

    /**
     * Gets the value of the address_Use_Location_Of_Server__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress_Use_Location_Of_Server__C() {
        return addressUseLocationOfServerC;
    }

    /**
     * Sets the value of the address_Use_Location_Of_Server__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress_Use_Location_Of_Server__C(String value) {
        this.addressUseLocationOfServerC = value;
    }

    /**
     * Gets the value of the application_Web_Servers__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getApplication_Web_Servers__R() {
        return applicationWebServersR;
    }

    /**
     * Sets the value of the application_Web_Servers__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setApplication_Web_Servers__R(QueryResult value) {
        this.applicationWebServersR = value;
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
     * Gets the value of the auto_Import_Configured__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuto_Import_Configured__C() {
        return autoImportConfiguredC;
    }

    /**
     * Sets the value of the auto_Import_Configured__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuto_Import_Configured__C(String value) {
        this.autoImportConfiguredC = value;
    }

    /**
     * Gets the value of the auto_License_Set_Up_For_URL__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuto_License_Set_Up_For_URL__C() {
        return autoLicenseSetUpForURLC;
    }

    /**
     * Sets the value of the auto_License_Set_Up_For_URL__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuto_License_Set_Up_For_URL__C(String value) {
        this.autoLicenseSetUpForURLC = value;
    }

    /**
     * Gets the value of the cert_Available__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCert_Available__C() {
        return certAvailableC;
    }

    /**
     * Sets the value of the cert_Available__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCert_Available__C(Boolean value) {
        this.certAvailableC = value;
    }

    /**
     * Gets the value of the clustered__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClustered__C() {
        return clusteredC;
    }

    /**
     * Sets the value of the clustered__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClustered__C(Boolean value) {
        this.clusteredC = value;
    }

    /**
     * Gets the value of the common_Core_Standards_Current__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommon_Core_Standards_Current__C() {
        return commonCoreStandardsCurrentC;
    }

    /**
     * Sets the value of the common_Core_Standards_Current__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommon_Core_Standards_Current__C(String value) {
        this.commonCoreStandardsCurrentC = value;
    }

    /**
     * Gets the value of the compress_And_Move_Backups_MySQL__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompress_And_Move_Backups_MySQL__C() {
        return compressAndMoveBackupsMySQLC;
    }

    /**
     * Sets the value of the compress_And_Move_Backups_MySQL__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompress_And_Move_Backups_MySQL__C(String value) {
        this.compressAndMoveBackupsMySQLC = value;
    }

    /**
     * Gets the value of the compress_And_Move_IIS_Logs_IIS__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompress_And_Move_IIS_Logs_IIS__C() {
        return compressAndMoveIISLogsIISC;
    }

    /**
     * Sets the value of the compress_And_Move_IIS_Logs_IIS__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompress_And_Move_IIS_Logs_IIS__C(String value) {
        this.compressAndMoveIISLogsIISC = value;
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
     * Gets the value of the content__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent__C() {
        return contentC;
    }

    /**
     * Sets the value of the content__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent__C(String value) {
        this.contentC = value;
    }

    /**
     * Gets the value of the correlations_To_State_Standards_Current__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelations_To_State_Standards_Current__C() {
        return correlationsToStateStandardsCurrentC;
    }

    /**
     * Sets the value of the correlations_To_State_Standards_Current__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelations_To_State_Standards_Current__C(String value) {
        this.correlationsToStateStandardsCurrentC = value;
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
     * Gets the value of the dlm_Checklist_URL__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDLM_Checklist_URL__C() {
        return dlmChecklistURLC;
    }

    /**
     * Sets the value of the dlm_Checklist_URL__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDLM_Checklist_URL__C(String value) {
        this.dlmChecklistURLC = value;
    }

    /**
     * Gets the value of the dlm_New_Users_Imported__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDLM_New_Users_Imported__C() {
        return dlmNewUsersImportedC;
    }

    /**
     * Sets the value of the dlm_New_Users_Imported__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDLM_New_Users_Imported__C(String value) {
        this.dlmNewUsersImportedC = value;
    }

    /**
     * Gets the value of the database_Backup_Jobs_Created__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabase_Backup_Jobs_Created__C() {
        return databaseBackupJobsCreatedC;
    }

    /**
     * Sets the value of the database_Backup_Jobs_Created__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabase_Backup_Jobs_Created__C(String value) {
        this.databaseBackupJobsCreatedC = value;
    }

    /**
     * Gets the value of the database_Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabase_Type__C() {
        return databaseTypeC;
    }

    /**
     * Sets the value of the database_Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabase_Type__C(String value) {
        this.databaseTypeC = value;
    }

    /**
     * Gets the value of the date_Of_Install_Update__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate_Of_Install_Update__C() {
        return dateOfInstallUpdateC;
    }

    /**
     * Sets the value of the date_Of_Install_Update__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate_Of_Install_Update__C(XMLGregorianCalendar value) {
        this.dateOfInstallUpdateC = value;
    }

    /**
     * Gets the value of the district_Name__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict_Name__C() {
        return districtNameC;
    }

    /**
     * Sets the value of the district_Name__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict_Name__C(String value) {
        this.districtNameC = value;
    }

    /**
     * Gets the value of the duplicate_Content_Check_Done__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicate_Content_Check_Done__C() {
        return duplicateContentCheckDoneC;
    }

    /**
     * Sets the value of the duplicate_Content_Check_Done__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicate_Content_Check_Done__C(String value) {
        this.duplicateContentCheckDoneC = value;
    }

    /**
     * Gets the value of the duplicate_Content_Check__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicate_Content_Check__C() {
        return duplicateContentCheckC;
    }

    /**
     * Sets the value of the duplicate_Content_Check__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicate_Content_Check__C(String value) {
        this.duplicateContentCheckC = value;
    }

    /**
     * Gets the value of the eoy_Clean_Up__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEOY_Clean_Up__C() {
        return eoyCleanUpC;
    }

    /**
     * Sets the value of the eoy_Clean_Up__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEOY_Clean_Up__C(String value) {
        this.eoyCleanUpC = value;
    }

    /**
     * Gets the value of the er_New_Users_Imported__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getER_New_Users_Imported__C() {
        return erNewUsersImportedC;
    }

    /**
     * Sets the value of the er_New_Users_Imported__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setER_New_Users_Imported__C(String value) {
        this.erNewUsersImportedC = value;
    }

    /**
     * Gets the value of the er_Server_Time_And_Time_Zone_Set_Up__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getER_Server_Time_And_Time_Zone_Set_Up__C() {
        return erServerTimeAndTimeZoneSetUpC;
    }

    /**
     * Sets the value of the er_Server_Time_And_Time_Zone_Set_Up__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setER_Server_Time_And_Time_Zone_Set_Up__C(String value) {
        this.erServerTimeAndTimeZoneSetUpC = value;
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
     * Gets the value of the https__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHTTPS__C() {
        return httpsC;
    }

    /**
     * Sets the value of the https__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHTTPS__C(Boolean value) {
        this.httpsC = value;
    }

    /**
     * Gets the value of the how_Many_Users_In_The_DB__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHow_Many_Users_In_The_DB__C() {
        return howManyUsersInTheDBC;
    }

    /**
     * Sets the value of the how_Many_Users_In_The_DB__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHow_Many_Users_In_The_DB__C(Double value) {
        this.howManyUsersInTheDBC = value;
    }

    /**
     * Gets the value of the install_Txt_Document_Created__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstall_Txt_Document_Created__C() {
        return installTxtDocumentCreatedC;
    }

    /**
     * Sets the value of the install_Txt_Document_Created__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstall_Txt_Document_Created__C(String value) {
        this.installTxtDocumentCreatedC = value;
    }

    /**
     * Gets the value of the installation_Path__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallation_Path__C() {
        return installationPathC;
    }

    /**
     * Sets the value of the installation_Path__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallation_Path__C(String value) {
        this.installationPathC = value;
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
     * Gets the value of the ldap_Integration__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLDAP_Integration__C() {
        return ldapIntegrationC;
    }

    /**
     * Sets the value of the ldap_Integration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLDAP_Integration__C(Boolean value) {
        this.ldapIntegrationC = value;
    }

    /**
     * Gets the value of the lt_Asset__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLT_Asset__C() {
        return ltAssetC;
    }

    /**
     * Sets the value of the lt_Asset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLT_Asset__C(String value) {
        this.ltAssetC = value;
    }

    /**
     * Gets the value of the lt_Asset__R property.
     * 
     * @return
     *     possible object is
     *     {@link LT_Asset__CType }
     *     
     */
    public LT_Asset__CType getLT_Asset__R() {
        return ltAssetR;
    }

    /**
     * Sets the value of the lt_Asset__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link LT_Asset__CType }
     *     
     */
    public void setLT_Asset__R(LT_Asset__CType value) {
        this.ltAssetR = value;
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
     * Gets the value of the load_Balanced__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoad_Balanced__C() {
        return loadBalancedC;
    }

    /**
     * Sets the value of the load_Balanced__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoad_Balanced__C(Boolean value) {
        this.loadBalancedC = value;
    }

    /**
     * Gets the value of the mime_Types_Added_IIS__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIME_Types_Added_IIS__C() {
        return mimeTypesAddedIISC;
    }

    /**
     * Sets the value of the mime_Types_Added_IIS__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIME_Types_Added_IIS__C(String value) {
        this.mimeTypesAddedIISC = value;
    }

    /**
     * Gets the value of the migration__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMigration__C() {
        return migrationC;
    }

    /**
     * Sets the value of the migration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMigration__C(Boolean value) {
        this.migrationC = value;
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
     * Gets the value of the new_Users_Imported__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNew_Users_Imported__C() {
        return newUsersImportedC;
    }

    /**
     * Sets the value of the new_Users_Imported__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNew_Users_Imported__C(String value) {
        this.newUsersImportedC = value;
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
     * Gets the value of the previous_Product_Version__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevious_Product_Version__C() {
        return previousProductVersionC;
    }

    /**
     * Sets the value of the previous_Product_Version__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevious_Product_Version__C(String value) {
        this.previousProductVersionC = value;
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
     * Gets the value of the product_Version_Installed__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct_Version_Installed__C() {
        return productVersionInstalledC;
    }

    /**
     * Sets the value of the product_Version_Installed__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct_Version_Installed__C(String value) {
        this.productVersionInstalledC = value;
    }

    /**
     * Gets the value of the reason_If_No_10__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_10__C() {
        return reasonIfNo10C;
    }

    /**
     * Sets the value of the reason_If_No_10__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_10__C(String value) {
        this.reasonIfNo10C = value;
    }

    /**
     * Gets the value of the reason_If_No_11__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_11__C() {
        return reasonIfNo11C;
    }

    /**
     * Sets the value of the reason_If_No_11__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_11__C(String value) {
        this.reasonIfNo11C = value;
    }

    /**
     * Gets the value of the reason_If_No_12__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_12__C() {
        return reasonIfNo12C;
    }

    /**
     * Sets the value of the reason_If_No_12__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_12__C(String value) {
        this.reasonIfNo12C = value;
    }

    /**
     * Gets the value of the reason_If_No_13__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_13__C() {
        return reasonIfNo13C;
    }

    /**
     * Sets the value of the reason_If_No_13__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_13__C(String value) {
        this.reasonIfNo13C = value;
    }

    /**
     * Gets the value of the reason_If_No_14__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_14__C() {
        return reasonIfNo14C;
    }

    /**
     * Sets the value of the reason_If_No_14__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_14__C(String value) {
        this.reasonIfNo14C = value;
    }

    /**
     * Gets the value of the reason_If_No_15__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_15__C() {
        return reasonIfNo15C;
    }

    /**
     * Sets the value of the reason_If_No_15__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_15__C(String value) {
        this.reasonIfNo15C = value;
    }

    /**
     * Gets the value of the reason_If_No_16__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_16__C() {
        return reasonIfNo16C;
    }

    /**
     * Sets the value of the reason_If_No_16__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_16__C(String value) {
        this.reasonIfNo16C = value;
    }

    /**
     * Gets the value of the reason_If_No_17__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_17__C() {
        return reasonIfNo17C;
    }

    /**
     * Sets the value of the reason_If_No_17__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_17__C(String value) {
        this.reasonIfNo17C = value;
    }

    /**
     * Gets the value of the reason_If_No_18__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_18__C() {
        return reasonIfNo18C;
    }

    /**
     * Sets the value of the reason_If_No_18__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_18__C(String value) {
        this.reasonIfNo18C = value;
    }

    /**
     * Gets the value of the reason_If_No_19__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_19__C() {
        return reasonIfNo19C;
    }

    /**
     * Sets the value of the reason_If_No_19__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_19__C(String value) {
        this.reasonIfNo19C = value;
    }

    /**
     * Gets the value of the reason_If_No_1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_1__C() {
        return reasonIfNo1C;
    }

    /**
     * Sets the value of the reason_If_No_1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_1__C(String value) {
        this.reasonIfNo1C = value;
    }

    /**
     * Gets the value of the reason_If_No_20__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_20__C() {
        return reasonIfNo20C;
    }

    /**
     * Sets the value of the reason_If_No_20__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_20__C(String value) {
        this.reasonIfNo20C = value;
    }

    /**
     * Gets the value of the reason_If_No_21__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_21__C() {
        return reasonIfNo21C;
    }

    /**
     * Sets the value of the reason_If_No_21__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_21__C(String value) {
        this.reasonIfNo21C = value;
    }

    /**
     * Gets the value of the reason_If_No_22__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_22__C() {
        return reasonIfNo22C;
    }

    /**
     * Sets the value of the reason_If_No_22__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_22__C(String value) {
        this.reasonIfNo22C = value;
    }

    /**
     * Gets the value of the reason_If_No_23__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_23__C() {
        return reasonIfNo23C;
    }

    /**
     * Sets the value of the reason_If_No_23__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_23__C(String value) {
        this.reasonIfNo23C = value;
    }

    /**
     * Gets the value of the reason_If_No_24__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_24__C() {
        return reasonIfNo24C;
    }

    /**
     * Sets the value of the reason_If_No_24__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_24__C(String value) {
        this.reasonIfNo24C = value;
    }

    /**
     * Gets the value of the reason_If_No_25__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_25__C() {
        return reasonIfNo25C;
    }

    /**
     * Sets the value of the reason_If_No_25__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_25__C(String value) {
        this.reasonIfNo25C = value;
    }

    /**
     * Gets the value of the reason_If_No_2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_2__C() {
        return reasonIfNo2C;
    }

    /**
     * Sets the value of the reason_If_No_2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_2__C(String value) {
        this.reasonIfNo2C = value;
    }

    /**
     * Gets the value of the reason_If_No_3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_3__C() {
        return reasonIfNo3C;
    }

    /**
     * Sets the value of the reason_If_No_3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_3__C(String value) {
        this.reasonIfNo3C = value;
    }

    /**
     * Gets the value of the reason_If_No_4__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_4__C() {
        return reasonIfNo4C;
    }

    /**
     * Sets the value of the reason_If_No_4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_4__C(String value) {
        this.reasonIfNo4C = value;
    }

    /**
     * Gets the value of the reason_If_No_5__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_5__C() {
        return reasonIfNo5C;
    }

    /**
     * Sets the value of the reason_If_No_5__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_5__C(String value) {
        this.reasonIfNo5C = value;
    }

    /**
     * Gets the value of the reason_If_No_6__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_6__C() {
        return reasonIfNo6C;
    }

    /**
     * Sets the value of the reason_If_No_6__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_6__C(String value) {
        this.reasonIfNo6C = value;
    }

    /**
     * Gets the value of the reason_If_No_7__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_7__C() {
        return reasonIfNo7C;
    }

    /**
     * Sets the value of the reason_If_No_7__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_7__C(String value) {
        this.reasonIfNo7C = value;
    }

    /**
     * Gets the value of the reason_If_No_8__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_8__C() {
        return reasonIfNo8C;
    }

    /**
     * Sets the value of the reason_If_No_8__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_8__C(String value) {
        this.reasonIfNo8C = value;
    }

    /**
     * Gets the value of the reason_If_No_9__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No_9__C() {
        return reasonIfNo9C;
    }

    /**
     * Sets the value of the reason_If_No_9__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No_9__C(String value) {
        this.reasonIfNo9C = value;
    }

    /**
     * Gets the value of the reason_If_No__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason_If_No__C() {
        return reasonIfNoC;
    }

    /**
     * Sets the value of the reason_If_No__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason_If_No__C(String value) {
        this.reasonIfNoC = value;
    }

    /**
     * Gets the value of the remote_Login_Info_In_Database__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemote_Login_Info_In_Database__C() {
        return remoteLoginInfoInDatabaseC;
    }

    /**
     * Sets the value of the remote_Login_Info_In_Database__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemote_Login_Info_In_Database__C(String value) {
        this.remoteLoginInfoInDatabaseC = value;
    }

    /**
     * Gets the value of the sso__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSSO__C() {
        return ssoC;
    }

    /**
     * Sets the value of the sso__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSSO__C(Boolean value) {
        this.ssoC = value;
    }

    /**
     * Gets the value of the schema_Mapping__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchema_Mapping__C() {
        return schemaMappingC;
    }

    /**
     * Sets the value of the schema_Mapping__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchema_Mapping__C(String value) {
        this.schemaMappingC = value;
    }

    /**
     * Gets the value of the server_Time_And_Time_Zone_Set_Up__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServer_Time_And_Time_Zone_Set_Up__C() {
        return serverTimeAndTimeZoneSetUpC;
    }

    /**
     * Sets the value of the server_Time_And_Time_Zone_Set_Up__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServer_Time_And_Time_Zone_Set_Up__C(String value) {
        this.serverTimeAndTimeZoneSetUpC = value;
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
     * Gets the value of the system_Tests_Exist_For_All_Activities__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem_Tests_Exist_For_All_Activities__C() {
        return systemTestsExistForAllActivitiesC;
    }

    /**
     * Sets the value of the system_Tests_Exist_For_All_Activities__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem_Tests_Exist_For_All_Activities__C(String value) {
        this.systemTestsExistForAllActivitiesC = value;
    }

    /**
     * Gets the value of the system_Tests_Exist_For_All_Courses__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem_Tests_Exist_For_All_Courses__C() {
        return systemTestsExistForAllCoursesC;
    }

    /**
     * Sets the value of the system_Tests_Exist_For_All_Courses__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem_Tests_Exist_For_All_Courses__C(String value) {
        this.systemTestsExistForAllCoursesC = value;
    }

    /**
     * Gets the value of the system_Tests_Exist_For_All_Lesson_Plans__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem_Tests_Exist_For_All_Lesson_Plans__C() {
        return systemTestsExistForAllLessonPlansC;
    }

    /**
     * Sets the value of the system_Tests_Exist_For_All_Lesson_Plans__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem_Tests_Exist_For_All_Lesson_Plans__C(String value) {
        this.systemTestsExistForAllLessonPlansC = value;
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
     * Gets the value of the tested_Launching_All_Content__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTested_Launching_All_Content__C() {
        return testedLaunchingAllContentC;
    }

    /**
     * Sets the value of the tested_Launching_All_Content__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTested_Launching_All_Content__C(String value) {
        this.testedLaunchingAllContentC = value;
    }

    /**
     * Gets the value of the tomcat_Service_Memory_Pool_Settings__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTomcat_Service_Memory_Pool_Settings__C() {
        return tomcatServiceMemoryPoolSettingsC;
    }

    /**
     * Sets the value of the tomcat_Service_Memory_Pool_Settings__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTomcat_Service_Memory_Pool_Settings__C(String value) {
        this.tomcatServiceMemoryPoolSettingsC = value;
    }

    /**
     * Gets the value of the tomcat_Service_Monitor_Installed_Win__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTomcat_Service_Monitor_Installed_Win__C() {
        return tomcatServiceMonitorInstalledWinC;
    }

    /**
     * Sets the value of the tomcat_Service_Monitor_Installed_Win__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTomcat_Service_Monitor_Installed_Win__C(String value) {
        this.tomcatServiceMonitorInstalledWinC = value;
    }

    /**
     * Gets the value of the tomcat_Set_As_System_Service__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTomcat_Set_As_System_Service__C() {
        return tomcatSetAsSystemServiceC;
    }

    /**
     * Sets the value of the tomcat_Set_As_System_Service__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTomcat_Set_As_System_Service__C(String value) {
        this.tomcatSetAsSystemServiceC = value;
    }

    /**
     * Gets the value of the training_Users_Available__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraining_Users_Available__C() {
        return trainingUsersAvailableC;
    }

    /**
     * Sets the value of the training_Users_Available__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraining_Users_Available__C(String value) {
        this.trainingUsersAvailableC = value;
    }

    /**
     * Gets the value of the type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType__C() {
        return typeC;
    }

    /**
     * Sets the value of the type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType__C(String value) {
        this.typeC = value;
    }

    /**
     * Gets the value of the url__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL__C() {
        return urlC;
    }

    /**
     * Sets the value of the url__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL__C(String value) {
        this.urlC = value;
    }

    /**
     * Gets the value of the usage_Reports_Added_IIS__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage_Reports_Added_IIS__C() {
        return usageReportsAddedIISC;
    }

    /**
     * Sets the value of the usage_Reports_Added_IIS__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage_Reports_Added_IIS__C(String value) {
        this.usageReportsAddedIISC = value;
    }

}
