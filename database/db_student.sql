create database db_students;
use db_students;
create table Student(
	id int primary key not null,
    name varchar(255),
    city varchar(255)
);
insert into Student values(1, 'nabil', 'beni mellal'), (2, 'yassine', 'casablanca');