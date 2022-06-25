show databases;
create database MyEmployee;
create table employees(
Id int,
Name text,
Age int,
Salary int,
Designation text,
PRIMARY KEY (ID)
);
insert into employees values(1,'akshai',19,50000,'sw'), (1,'Tejas',22,70000,'Manager'), (3,'Akhila',20,60000,'testing');
insert into employees values(1,'akshai',19,50000,'sw'), (2,'Tejas',22,70000,'Manager'), (3,'Akhila',20,60000,'testing');
select * from employees;










drop table employees;
