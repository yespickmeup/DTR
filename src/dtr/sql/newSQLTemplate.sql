


drop database if exists db_dtr;
create database db_dtr;

drop table if exists dtr;
create table dtr(
id int primary key auto_increment
,department varchar(255)
,name varchar(255)
,no varchar(255)
,datetime varchar(255)
,location_id varchar(255)
,id_no varchar(255)
,verify_code varchar(255)
,card_no varchar(255)
,date_added datetime
,user_id varchar(255)
,user_screen_name varchar(255)
);


drop table if exists employees;
create table employees(
id int auto_increment primary key
,employee_id varchar(255)
,fname varchar(255)
,mi varchar(255)
,lname varchar(255)
,contact_no varchar(255)
,address varchar(255)
,department varchar(255)
,department_id varchar(255)
,date_added datetime
,user_id varchar(255)
,user_screen_name varchar(255)
);

drop table if exists departments;
create table departments(
id int auto_increment primary key
,department varchar(255)
,date_added datetime
,user_id varchar(255)
,user_screen_name varchar(255)
);


drop table if exists holidays;
create table holidays(
id int auto_increment primary key
,holiday varchar(255)
,date_of_holiday date
,half_day_am int
,half_day_pm int
,date_added datetime
,user_id varchar(255)
,user_screen_name varchar(255)
);


drop table if exists sick_leaves;
create table sick_leaves(
id int auto_increment primary key
,reason varchar(255)
,date_of_leave date
,half_day_am int
,half_day_pm int
,employee_name varchar(255)
,employee_id varchar(255)
,date_added datetime
,user_id varchar(255)
,user_screen_name varchar(255)
);

drop table if exists dtrs;
create table dtrs(
id int auto_increment primary key
,employee_id varchar(255)
,employee_name varchar(255)
,department_id varchar(255)
,department_name varchar(255)
,dtr_date date
,am_arrival datetime
,am_departure datetime
,pm_arrival datetime
,pm_departure datetime
,undertime_hours varchar(255)
,undertime_minutes varchar(255)
,date_added datetime
,user_id varchar(255)
,user_screen_name varchar(255)
);

drop table if exists users;
create table users(
id int auto_increment primary key
,user_name varchar(255)
,user_screen_name varchar(255)
,password varchar(255)
,status int
,date_added datetime
);

drop table if exists user_default_previleges;
create table user_default_previleges(
id int auto_increment primary key
,account varchar(255)
,name varchar(255)
);

drop table if exists user_previleges;
create table user_previleges(
id int auto_increment primary key
,account varchar(255)
,previledge varchar(255)
,status int
,user_id varchar(255)
,user_name varchar(255)
);

drop table if exists shiftings;
create table shiftings(
id int auto_increment primary key
,shift varchar(255)
,am_12 varchar(255)
,am_1 varchar(255)
,am_2 varchar(255)
,am_3 varchar(255)
,am_4 varchar(255)
,am_5 varchar(255)
,am_6 varchar(255)
,am_7 varchar(255)
,am_8 varchar(255)
,am_9 varchar(255)
,am_10 varchar(255)
,am_11 varchar(255)
,pm_12 varchar(255)
,pm_1 varchar(255)
,pm_2 varchar(255)
,pm_3 varchar(255)
,pm4 varchar(255)
,pm_5 varchar(255)
,pm_6 varchar(255)
,pm_7 varchar(255)
,pm_8 varchar(255)
,pm_9 varchar(255)
,pm_10 varchar(255)
,pm_11 varchar(255)
,status int
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
);

alter table employees add shift varchar(255);
alter table employees add shift_id varchar(255);
update employees set shift='Regular';
update employees set shift_id='0';


drop table if exists settings;
create table settings(
id int auto_increment primary key
,supervisor varchar(255)
);

insert into settings(supervisor)values
('MARJORIE R. ROLA, Ph.D.')
;

drop table if exists sick_leave_reasons;
create table sick_leave_reasons(
id int auto_increment primary key
,reason varchar(255)
);
drop table if exists holiday_types;
create table holiday_types(
id int auto_increment primary key
,holiday_type varchar(255)
);
