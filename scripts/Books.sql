create table books (
book_id number(7,0) primary key,
title varchar2(100));


create table authors (
author_id number(7,0) primary key,
first_name varchar2(40),
last_name varchar2(40),
publication_date date
);

create table books_authors ( --utilizzo constraint
constraint author_id_pk primary key (author_id) references authors(author_id),  
constraint book_id_pk primary key (book_id) references books(book_id)

);

create table name_users (
user_id integer primary key,
first_name varchar2(40),
last_name varchar2(40),
phone_number varchar2(13), 
email varchar2(100) 
);

create table genres (
genr_id number(4,0) primary key,
genre_name varchar2(40)
);