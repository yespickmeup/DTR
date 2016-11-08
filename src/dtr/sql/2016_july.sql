/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Guinness
 * Created: Jul 13, 2016
 */


drop table if exists employee_shifts;
create table employee_shifts(
id int auto_increment primary key
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,emp_id varchar(255)
,emp_name varchar(255)
,shift varchar(255)
,shift_date date
);


