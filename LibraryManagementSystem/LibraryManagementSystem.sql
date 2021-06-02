create database libman;
use libman;

create table student (studentID varchar(20),name varchar(50),fatherName varchar(50),courseName varchar(5), branchName varchar(20));
create table newbook (bookID varchar(20),name varchar(50),publisher varchar(50),price varchar(5),publishYear varchar(20));
create table issuebook (bookID varchar(20),studentID varchar(50),issueDate varchar(20),dueDate varchar(20),returnBook varchar(10));