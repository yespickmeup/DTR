/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Guinness
 * Created: Nov 9, 2016
 */

alter table dtrs add shift varchar(255);

update dtrs set shift='ROH';
update dtrs d set d.shift = IFNULL((select es.shift from employee_shifts es where d.employee_id=es.emp_id and d.dtr_date=es.shift_date  order by id desc limit 1),'ROH');