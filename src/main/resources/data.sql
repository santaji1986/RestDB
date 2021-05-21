drop table if exists USERS;
CREATE TABLE USERS
   (	
   ID INT,
   USERNAME VARCHAR(100), 
   PASSWORD VARCHAR(100),
   CITY VARCHAR(100),
   CREATED_BY VARCHAR(50),
   CREATED_DATE date,
   LAST_MODIFIED_BY VARCHAR(50),
   LAST_MODIFIED_DATE date
   ); 
   
-- insert into USERS(USER_ID,USERNAME,PASSWORD,CITY) values (1,'Ajay','Ajay_pwd','Pune');
-- insert into USERS(USER_ID,USERNAME,PASSWORD,CITY) values (2,'Vijay','Vijay_pwd','Solapur');
-- insert into USERS(USER_ID,USERNAME,PASSWORD,CITY) values (3,'Jay','Jay_pwd','Bangalore');

