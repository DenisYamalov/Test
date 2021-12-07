begin;

drop schema if exists test cascade;
create schema test;

drop table if exists test.departments;
create table test.departments (
id serial,
name varchar(100) unique not null,

primary key (id)
);

drop table if exists test.employees;
create table test.employees (
id serial,
department_id serial not null references test.departments on delete cascade,
chief_id BIGINT not null,
name varchar(100) unique not null,
salary int not null,


primary key (id)
);

commit;