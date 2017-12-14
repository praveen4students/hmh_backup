select * from eai_log
where trans_id = '681329'
and event_id = '21868977899875.29784.10.198.51.19'

where rownum < 10

select distinct MSG_TEXT from eai_log
where MSG_TEXT like 'Log%'


select * from eai_log
--where trans_id = 'Order_ID_NA'
where event_id = '21900588666289.710.172.17.98.22'

where trans_id = '0007097179'
and ebs_nm = 'SAP RFC Call'
and source='MailServices'

event-id 21897946060339.441.172.17.98.149

21898039223747.479.172.17.98.149
--where MSG_TEXT = 'LogError'
where ebs_nm = 'mailServices'
and  rownum < 10