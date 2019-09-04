drop table if exists YTUSER;
CREATE TABLE YTUSER
   (	
   "USER_ID" INT,
   "USERNAME" VARCHAR(100), 
   "PASSWORD" VARCHAR(100), 
   "PLAIN_PASSWORD" VARCHAR2(100)
   ); 
   
insert into YTUSER(USER_ID,USERNAME,PASSWORD,PLAIN_PASSWORD) values (1,'santaji','santaji_pwd','santaji_plain_pwd');
insert into YTUSER(USER_ID,USERNAME,PASSWORD,PLAIN_PASSWORD) values (2,'sandeep','sandeep_pwd','sandeep_plain_pwd');

