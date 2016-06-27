/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Guinness
 * Created: Jun 10, 2016
 */

alter table departments add manager varchar(255);
alter table employees add manager varchar(255);

update departments set manager='';
update employees set manager='';

drop table if exists shifting_types;
create table shifting_types(
id int auto_increment primary key
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,shift_name varchar(255)
,shift_starts varchar(255)
,shift_ends varchar(255)
);

drop table if exists employee_shifting_schedules;
create table employee_shifting_schedules(
id int auto_increment primary key
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,emp_id varchar(255)
,emp_name varchar(255)
,mon_shift varchar(255)
,mon_shift_id varchar(255)
,tue_shift varchar(255)
,tue_shift_id varchar(255)
,wed_shift varchar(255)
,wed_shift_id varchar(255)
,thu_shift varchar(255)
,thu_shfit_id varchar(255)
,fri_shift varchar(255)
,fri_shift_id varchar(255)
,sat_shift varchar(255)
,sat_shift_id varchar(255)
,sun_shift varchar(255)
,sun_shift_id varchar(255)
);