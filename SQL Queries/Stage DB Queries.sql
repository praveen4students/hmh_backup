--======================================
-- EAI_LOG Table
--======================================

select * from eai_log
where event_id = '22171640845057.108627.10.198.45.11'
order by evnt_acty_tmstp;

select * from eai_log
where trans_id = '0000000221831841'
and ebs_nm = 'SAPProductCatalogK12UpdateCDB'
and msg_text != 'LogExit'
and severity = 'camel-prd';


select * from eai_log
--where trans_id like '109692%'
order by evnt_acty_tmstp desc

and event_id = '2013-05-21T02:26:48.343-04:00483311'
order by ebs_nm;



select * from eai_log
where --source='WebService'
--and msg_text = 'LogError'
--and 
--ebs_nm = 'SAPMaterialMasterClassificationUpdateSFA'
--and trans_id like '2013%'
--and 
trans_id = '2013-05-29T03:45:00.144-04:002877474'
--and 
--cmpt_nm='SAPTRANSACTIONUPDATE.SFA.CAMEL'
--and load_acty_tmstp = '26-APR-13'
--and evnt_acty_tmstp >= '26-APR-13'
--and rownum < 10
order by eai_log_seq_nbr

select * from eai_log 
where 
--load_acty_tmstp >= to_timestamp('2013-05-27', 'YYYY-MM-DD')
--load_acty_tmstp >= to_timestamp('12-01-2012 21:24:00', 'dd-mm-yyyy hh24:mi:ss')
--and 
source='WebService'
and ebs_nm = 'findTransactions'
and msg_text = 'LogEnter'
--and ebs_nm = 'EskerTransaction' 
--and msg_text = 'LogError'
and rownum < 10

select * from eai_log
where --rownum < 10
event_id like '%.10.198.51.19'
and trans_id = '000000000000168620'
order by evnt_acty_tmstp desc


select distinct err_type from eai_log
where source='WebService'
and msg_text = 'LogError'
and rownum < 100

select distinct MSG_TEXT from eai_log
where MSG_TEXT like 'Log%'





select * from eai_log
--where trans_id = 'Order_ID_NA'
where event_id = '22060908924579.781.10.198.45.11'

where trans_id = '0007097179'
and ebs_nm = 'SAP RFC Call'
and source='MailServices'

event-id 21897946060339.441.172.17.98.149

21898039223747.479.172.17.98.149
--where MSG_TEXT = 'LogError'
where ebs_nm = 'mailServices'
and  rownum < 10


select * from eai_log
where severity = 'camel-prd'
and source='SCMServices'
and msg_text = 'LogError'
and ebs_nm = 'SAPMaterialBOMUpdateCDB'
and rownum < 10


select * from eai_log
where severity = 'Tibco'
and msg_text = 'LogEnter'
--and cmpt_nm like '%WebService%'
and rownum < 10


select * from eai_log where cmpt_nm = 'SCM_Legacy_Consumer'
and destination = 'SFA'
and ebs_nm = 'SAPMaterialMasterClassificationUpdateSFA'
and rownum<10

--===============================================================================================================================
-- NOTIFICATIONS Table
--===============================================================================================================================

select * from notifications
where rownum < 5
order by id;

select distinct 
from_addr
--component_name 
from notifications

select distinct component_name, ebs_name from notifications

select distinct EBS_NAME from notifications 
where EBS_NAME like '%Banta%'
order by EBS_NAME


select 
--distinct error_family
--distinct component_name, ebs_name
* 
from notifications
where 
component_name = 'Enterprise_WebService'
component_name = 'WebService'
and ebs_name='findTransactions'

--insert into notifications (COMPONENT_NAME, EBS_NAME, ERROR_FAMILY, TO_ADDR, FROM_ADDR)
--values ('SunriseCentral_Database_Consumer', 'SAPCustomerUpdateCDB', 'Business', 'Rajesh.Maryada@hmhco.com,Vaidyanathan.Ganesan@hmhco.com,Praveen.Dyamappa@hmhco.com,Santosh.Singh@hmhco.com,Vineeth.Attoor@hmhco.com','no-reply-Apache-stg@hmhco.com');
--insert into notifications (COMPONENT_NAME, EBS_NAME, ERROR_FAMILY, TO_ADDR, FROM_ADDR)
--values ('SunriseCentral_Database_Consumer', 'SAPCustomerUpdateCDB', 'System', 'Rajesh.Maryada@hmhco.com,Vaidyanathan.Ganesan@hmhco.com,Praveen.Dyamappa@hmhco.com,Santosh.Singh@hmhco.com,Vineeth.Attoor@hmhco.com','no-reply-Apache-stg@hmhco.com');
--
--update notifications
--set FROM_ADDR = 'no-reply-Apache-stg@hmhco.com'
--where FROM_ADDR = 'no-reply-stg@hmhco.com'

--===============================================================================================================================





select * from EAI_ASYNC_CALL
where rownum<10

--==============================================================
--FIELD_MAP_VIEW
--==============================================================
SELECT SYSTEM1, SYSTEM1FIELD, SYSTEM2, SYSTEM2FIELD, CATEGORY 
FROM FIELD_MAP_VIEW 
where CATEGORY ='DIVISION' 
and SYSTEM1 = 'Enterprise' 
and SYSTEM1FIELD = 'DIVISION_SCHOOL' 
and SYSTEM2 = 'SAP' 

SELECT SYSTEM1, SYSTEM1FIELD, SYSTEM2, SYSTEM2FIELD, CATEGORY 
FROM FIELD_MAP_VIEW 
where CATEGORY ='SUBSCRIPTION_TERM' 
and SYSTEM1 = 'Enterprise' 
and SYSTEM1FIELD = 'SUBSCRIPTION_TERM_UNIT_YEAR' 
and SYSTEM2 = 'SAP' 

select * from field_map

SELECT SYSTEM1, SYSTEM1FIELD, SYSTEM2, SYSTEM2FIELD, CATEGORY 
FROM FIELD_MAP_VIEW 
where CATEGORY ='DIVISION' 
and SYSTEM1 = 'SFDC' 
and SYSTEM1FIELD = 'INT' 
and SYSTEM2 = 'Enterprise' 

--============================================
--eai_async_call
--=============================================
select 
--max(requestid) 
*
from eai_async_call
where requestid = '263521'
--where rownum < 2
--=============================================


select * from eai_log
where trans_id in ('0000000221837068',
'0000000221837067',
'0000000221837066',
'0000000221837065',
'0000000221837064',
'0000000221837063',
'0000000221837062',
'0000000221837061',
'0000000221837060',
'0000000221837059',
'0000000221837058',
'0000000221837057',
'0000000221837056',
'0000000221837055',
'0000000221837054',
'0000000221837053',
'0000000221837052',
'0000000221837051',
'0000000221837050',
'0000000221837049',
'0000000221837048',
'0000000221837047',
'0000000221837046',
'0000000221837045',
'0000000221834044',
'0000000221834043',
'0000000221834042',
'0000000221834041',
'0000000221834040',
'0000000221834039',
'0000000221834038',
'0000000221834037',
'0000000221834036',
'0000000221834035',
'0000000221834034',
'0000000221834033',
'0000000221834032',
'0000000221834031',
'0000000221834030',
'0000000221834029',
'0000000221834028',
'0000000221834027',
'0000000221834026',
'0000000221834025',
'0000000221834024',
'0000000221834023',
'0000000221834022',
'0000000221834021',
'0000000221834020',
'0000000221834019',
'0000000221834018',
'0000000221834017',
'0000000221834016',
'0000000221834015',
'0000000221834014',
'0000000221834013',
'0000000221834012',
'0000000221834011',
'0000000221834010',
'0000000221834009',
'0000000221834008',
'0000000221834007',
'0000000221834006',
'0000000221834005',
'0000000221834004',
'0000000221834003',
'0000000221834002',
'0000000221834001',
'0000000221834000',
'0000000221833999',
'0000000221833998',
'0000000221833997',
'0000000221833996',
'0000000221833995',
'0000000221833994',
'0000000221833993',
'0000000221833992',
'0000000221833991',
'0000000221833990',
'0000000221833989',
'0000000221833988',
'0000000221833987',
'0000000221833986',
'0000000221833985',
'0000000221833984',
'0000000221833983',
'0000000221833982',
'0000000221833981',
'0000000221833980',
'0000000221833979',
'0000000221833978',
'0000000221833977',
'0000000221833976',
'0000000221833975',
'0000000221833974',
'0000000221833973',
'0000000221833972',
'0000000221833971',
'0000000221833970',
'0000000221833969',
'0000000221833968',
'0000000221833967',
'0000000221833966',
'0000000221833965',
'0000000221833964',
'0000000221833963',
'0000000221833962',
'0000000221833961',
'0000000221833960',
'0000000221833959',
'0000000221833958',
'0000000221833957',
'0000000221833956',
'0000000221833955',
'0000000221833954',
'0000000221833953',
'0000000221833952',
'0000000221833951')
and ebs_nm = 'SAPProductCatalogK12UpdateCDB'
order by msg_text