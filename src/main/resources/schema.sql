drop table Student if exists;
create table Student (
	id INT,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
    CREATED_BY VARCHAR(50),
    CREATED_DATE date,
    LAST_MODIFIED_BY VARCHAR(50),
    LAST_MODIFIED_DATE date
);