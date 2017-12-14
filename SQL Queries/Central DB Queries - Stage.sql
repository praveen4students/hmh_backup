--=============================
--Product K12
--============================
select * 
--delete 
from X_SCM_K12_PRODUCT 
--where MATERIALNUMBER like '%196521466'
order by update_date_db desc
                       

--===========================================
-- OTS Services
--===========================================
select * from cus_customer where CUSTOMERID = '0000649244'
select * from x_ots_customer where CUSTOMERID = '0000348625'


--===========================================
-- Inventory
--===========================================
select *  from x_scm_inventory where materialnumber ='000000000001184433'
select *  from INV_INVENTORY where idocnumber = '0000000220259134'
materialnumber ='000000000001184433'

select * from inv_inventory
--where rownum < 10
order by update_date_db desc

insert into inv_inventory values('111000000001014853', '0300', '0.000', '2013-03-26', '30', '0000000199561929', 'TEST', sysdate);


--===========================================
-- Vendor
--===========================================
select * from ven_vendor where vendornumber = '1000000663'
select * from ven_vendor_remit where vendornumber = '1000000663'
select * from ven_vendor_email where vendornumber = '1000000663'

select * from X_SCM_VENDORUPDATE  where vendornumber = '1000000663'


--===========================================
-- Mat Pricing
--===========================================

select * from X_SCM_MAT_PRICING

select * from MAT_PRICING
order by update_date_db desc

where rownum<10
and 


--============================
--MAT_MATERIAL Table
--============================
select idocnumber from mat_material where materialnumber = '000000000001411045'

--===========================================
select idocnumber, materialnumber 
from mat_material 
where 
--materialnumber like '%1166568'
materialnumber = '000000000001186261'
--where rownum <10

select update_date_db from mat_material
where materialnumber = '000000000001186261'
idocnumber = '0000000196696750'
--18-JUL-13 04.35.34.000000000 AM
select * 
--delete
from MAT_CLASSIFICATION
where materialnumber = '000000000001411000'
and update_user = 'CAMEL'
--30-MAY-13 09.12.32.000000000 AM

select * 
--delete
from X_SCM_MAT_CLASSIFICATION
where materialnumber = '000000000001411000'
--27-MAY-13
--Idoc 196696750


select *  
from X_SCM_MAT_MATERIAL
--order by update_date_db desc
order by create_date_db desc
where materialnumber = '000000000196521466'


select count(materialnumber) 
from X_SCM_MAT_PARTNERINFO
X_SCM_MAT_KITCOMPONENT
X_SCM_K12_PRODUCT
X_SCM_MAT_PRICING
X_SCM_MAT_MATERIAL
X_SCM_MAT_CLASSIFICATION
--X_SCM_K12_pricing
 

select * from x_mat_classification
where rownum < 5;

select * from X_SCM_MAT_CLASSIFICATION
--where rownum < 5;
where  materialnumber = '000000000001411044'


select distinct idocnumber from decode
where rownum < 500


select * from mat_pricing

select *  
--delete
--from X_SCM_K12_pricing
--from X_SCM_K12_PRODUCT
from X_SCM_MAT_PRICING
where materialnumber ='000000000196521466'

select * from X_OTS_DECODE

--CREATE TABLE "IC_DATASTORE"."X_OTS_DECODE" 
--   (           "IDOCNUMBER" VARCHAR2(4000 BYTE), 
--                "PAYLOAD" CLOB, 
--				"CREATE_DATE_DB" TIMESTAMP (6),
--				"UPDATE_DATE_DB" TIMESTAMP (6),
--				CONSTRAINT "IDOCNUMBER_PRIMARYKEY" PRIMARY KEY ("IDOCNUMBER")
--   ) ;


select value, materialnumber 
from mat_classification 
where classificationtype = 'COVER_INKS' 
and materialnumber ='000000000000111949'

select *
from mat_classification 
where rownum <10


select * from mat_pricing
where materialnumber ='000000000000111949'
rownum < 5

--===============================
-- CUS_CONTACT_PHONE
-- ==============================
select * from CUS_CONTACT_PHONE
where customerid = '0000649244'
where rownum < 20

--=================================
--CUS_CONTACT_EMAIL
--=================================
select * from CUS_CONTACT_EMAIL
--where customerid = '0000649244'
where customerid like '%236855'
where rownum < 2

--================================
--CUS_CUSTOMER
--================================
select * from CUS_CUSTOMER
--where customerid = '0000236855'
--where idocnumber like '%230287322'
--where rownum < 20
order by update_date_db desc
--=============================
--DECODE
--=============================
select * from DECODE
where entityname = 'COUNTRYCODE'
rownum < 20

--============================
-- Vivew CUS_CONTACT_EMAIL_V
--============================

select * from CUS_CONTACT_EMAIL_V
where rownum<10

--==================================
--View CUS_CONTACT_PHONE_V
--==================================

select * from CUS_CONTACT_PHONE_V
where rownum < 10


--==============================
-- View CUS_CUSTOMER_V
--==============================

select * from CUS_CUSTOMER_V
where rownum < 10