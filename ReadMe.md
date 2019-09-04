# Get started with accessing data using REST call
## H2 DB integration
```
http://localhost:8080/hello?userId=1

```
### Alternately for connecting to different to databases - 
## Create table in database -
``` 
CREATE TABLE "C2Y"."YTUSER" 
   (	"USER_ID" NUMBER(10,0), 
	"USERNAME" VARCHAR2(50 BYTE), 
	"PASSWORD" VARCHAR2(100 BYTE), 
	"PLAIN_PASSWORD" VARCHAR2(100 BYTE)
   ); 
```


## Configure application.properties file with database config
``` 	
DB_IP_ADDRESS, DB_PORT , DB_SID or DB_SERVICE_NAME, DB_USERNAME,DB_PASSWORD
```

## Run the application and access it using below url with userId
``` 
http://localhost:8080/hello?userId=1
 
```

