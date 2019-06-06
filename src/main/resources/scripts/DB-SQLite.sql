create if not exists table user(
id INTEGER PRIMARY KEY autoincrement,
name varchar(100) null,
role varchar(10) null,
email varchar(100) null,
password varchar(50) null
);
create table properties(
id int not null primary key,
version varchar(10) not null
);
insert into properties(id,version) values (1,'1.0');