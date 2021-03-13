# SWAGGER , TEST URL, H2 DB  

## swagger URL

http://localhost:8080/swagger-ui/index.html

## Test URLs

[Test URL for userId 1 - http://localhost:8080/hello?userId=1](http://localhost:8080/hello?userId=1)

[GetAllData - http://localhost:8080/getAllData](http://localhost:8080/getAllData)

## Managing in-memory H2 Database H2-Console URL

http://localhost:8080/h2-console/

## Create table in database -

```SQL
CREATE TABLE "USERS" 
   ( 
 "USER_ID" NUMBER(10,0), 
 "USERNAME" VARCHAR2(50 BYTE), 
 "PASSWORD" VARCHAR2(100 BYTE), 
 "CITY" VARCHAR2(100 BYTE)
   ); 
```

## Configure application.properties file with database config

``
DB_IP_ADDRESS, DB_PORT , DB_SID or DB_SERVICE_NAME, DB_USERNAME,DB_PASSWORD
``
