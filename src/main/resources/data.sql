drop table if exists USERS;
CREATE TABLE USERS
   (	
   "USER_ID" INT,
   "USERNAME" VARCHAR(100), 
   "PASSWORD" VARCHAR(100),
   "CITY" VARCHAR(100)
   ); 
   
insert into USERS(USER_ID,USERNAME,PASSWORD,CITY) values (1,'Ajay','Ajay_pwd','Pune');
insert into USERS(USER_ID,USERNAME,PASSWORD,CITY) values (2,'Vijay','Vijay_pwd','Solapur');
insert into USERS(USER_ID,USERNAME,PASSWORD,CITY) values (3,'Jay','Jay_pwd','Bangalore');

