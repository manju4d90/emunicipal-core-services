INSERT INTO eg_businesscategory(
          id, name, code, active, tenantid, version, createdby, createddate, 
          lastmodifiedby, lastmodifieddate)
  VALUES (nextval('seq_eg_businesscategory'),'Trade Application Fee','TLAPPLNFEE',true,'default',0,1,
  (select extract ('epoch' from (select * from now()))*1000), 
  1, (select extract ('epoch' from (select * from now()))*1000));

INSERT INTO eg_businessdetails(
          id, name, businessurl, isenabled, code, businesstype, fund, function, 
          fundsource, functionary, department, vouchercreation, businesscategory, 
          isvoucherapproved, vouchercutoffdate, createddate, lastmodifieddate, 
          createdby, lastmodifiedby, ordernumber, version, tenantid, callbackforapportioning)
  VALUES (nextval('seq_eg_businessdetails'), 'Trade Application Fee', '/receipts/receipt-create.action', 
  true, 'TLAPPLNFEE','B','01','101500',null,null,'HD',false,(select id from eg_businesscategory where code='TLAPPLNFEE' 
  and tenantid='default'),false,null,(select extract ('epoch' from (select * from now()))*1000),(select extract ('epoch' from (select * 
  from now()))*1000),1,1,1,0,'default',false);