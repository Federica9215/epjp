--Creazione tabella libri e inserimento 

create table books (
book_id number(7,0) primary key,
title varchar2(100),
publication_date date);

insert into books values(1000,'Tre metri sopra il cielo', '12-MAR-2004');
insert into books values(1001,'Scusa ma ti chiamo amore', '25-GEN-2008');
insert into books values(1002,'Il significato dell''esistenza', '10-GEN-1975');
insert into books values(1003,'Il senso delle cose','23-LUG-1998');
insert into books values(1004,'Origin','03-OTT-2017');
insert into books values(1005,'The game','02-OTT-2018');
insert into books values(1006,'Il commissario Montalbano','13-GEN-2008'); --15 settembre 1986
insert into books values(1007,'It','15-SET-1986');
insert into books values(1008,'Harry Potter e la pietra filosofale','06-DIC-2001');
insert into books values(1009,'Harry Potter e la camera segreta','06-DIC-2002');
insert into books values(1010,'Harry Potter e il prigioniero di Azkaban','04-GIU-2004');
insert into books values(1011,'Harry Potter e il calice di fuoco','25-NOV-2005');
insert into books values(1012,'Harry Potter e l''ordine della Fenice','11-LUG-2007');
insert into books values(1013,'Harry Potter e il principe mezzosangue','15-LUG-2009');
insert into books values(1014,'Harry Potter e i doni della morte','19-NOV-2010');


-- Creazione tabella Autori e inserimento autori

create table authors (
author_id number(7,0) primary key,
first_name varchar2(40),
last_name varchar2(40)
);

insert into authors values(101,'Federico', 'Moccia');
insert into authors values(102,'Dan', 'Brown');
insert into authors values(103,'Joanne', 'Rowling');
insert into authors values(104,'Stephen', 'King');
insert into authors values(105,'Andrea', 'Camilleri');
insert into authors values(106,'Alessandro', 'Baricco');
insert into authors values(107,'Richard', 'Feynman'); --"Il senso delle cose", l autore è un fisico
insert into authors values(108,'Giovanni', 'Lucentini');
insert into authors values(109,'Carlo', 'Fruttero'); --Franco Lucentini e Carlo Fruttero "il significato dell'esistenza"


DROP TABLE authors;

--Creazione tabella intermedia per Many-to-Many

create table books_authors( 
author_id number(7,0) 
constraint author_id_pk primary key(author_id) references authors(author_id) on delete cascade, 
book_id number(7,0)
constraint book_id_pk primary key(book_id) references books(book_id) on delete cascade,
constraint books_authors_uq unique(author_id,book_id)
);

create table books_authors(
book_id number(7,0) not null, 
author_id number(7,0) not null,
foreign key(book_id) references books(book_id),
foreign key(author_id) references authors(author_id),
unique (book_id,author_id));

insert into books_authors values(1000,101);
insert into books_authors values(1001,101);
insert into books_authors values(1002,108);
insert into books_authors values(1002,109);
insert into books_authors values(1003,107);
insert into books_authors values(1004,102);
insert into books_authors values(1005,106);
insert into books_authors values(1006,105);
insert into books_authors values(1007,104);
insert into books_authors values(1008,103);
insert into books_authors values(1009,103);
insert into books_authors values(1010,103);
insert into books_authors values(1011,103);
insert into books_authors values(1012,103);
insert into books_authors values(1013,103);
insert into books_authors values(1014,103);



drop table books_authors;

--Creazione tabella Utenti

create table name_users (
user_id integer primary key,
first_name varchar2(40),
last_name varchar2(40),
phone_number varchar2(13), 
email varchar2(100) 
);

insert into name_users values(10,'Federica','Cosenza','3405030139','federica.cosenza92@gmail.com');
insert into name_users values(11,'Silvia','Di Caro','3405412547','silvia.dicaro@gmail.com');
insert into name_users values(12,'Maurizio','Pilato','3424587528','maurizio.pilato@gmail.com');
insert into name_users values(13,'Michele','Rossi','3457111257','michele.rossi@gmail.com');
insert into name_users values(14,'Emanuele','Bianchi','3487445201','michele.bianchi@gmail.com');
insert into name_users values(15,'Michele','Pulizzi','3457111257','michele.pulizzi@gmail.com');
insert into name_users values(16,'Giacomo','Catania','3487445122','giacomo.catania@gmail.com');
insert into name_users values(17,'Antonio','Biagi','3457111257','antonio.biagi@gmail.com');
insert into name_users values(18,'Alfonso','Contres','3457111257','alfonso.contres@gmail.com');



--Creazione tabella dei Generi e inserimento generi

create table genres (
genr_id number(2,0) primary key,
genre_name varchar2(40)
);

insert into genres values(1,'Romantico');--tre metri sopra il cielo
insert into genres values(2,'Scientifico');--il senso delle cose
insert into genres values(3,'Thriller');--origin
insert into genres values(4,'Filosofico');--the game
insert into genres values(5,'Narrativa'); --il senso dell esistenza
insert into genres values(6,'Fantasy');--harry potter
insert into genres values(7,'Horror');--it
insert into genres values(8,'Poliziesco');--il commissario Montalbano

--Many to many tra generi e libri

create table genres_books(
book_id number(7,0) not null, 
genr_id number(7,0) not null,
foreign key(book_id) references books(book_id),
foreign key(genr_id) references genres(genr_id),
unique (book_id,genr_id));

insert into genres_books values(1000,1);
insert into genres_books values(1000,5);
insert into genres_books values(1001,1);
insert into genres_books values(1001,5);
insert into genres_books values(1002,5);
insert into genres_books values(1003,2);
insert into genres_books values(1004,3);
insert into genres_books values(1004,5);
insert into genres_books values(1005,4);
insert into genres_books values(1006,5);
insert into genres_books values(1006,8);
insert into genres_books values(1007,7);
insert into genres_books values(1007,5);
insert into genres_books values(1008,6);
insert into genres_books values(1009,6);
insert into genres_books values(1010,6);
insert into genres_books values(1011,6);
insert into genres_books values(1012,6);
insert into genres_books values(1013,6);
insert into genres_books values(1014,6);

--Test per vedere se funziona

select b.title,g.genre_name 
from books b join genres_books gb 
on (b.book_id=gb.book_id)
join genres g
on (gb.genr_id=g.genr_id);
