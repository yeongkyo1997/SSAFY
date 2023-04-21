create database sampledb;
create table user
(
    id       varchar(10),
    password varchar(10),
    name     varchar(30),
    primary key (id)
);

create table board
(
    no      int auto_increment,
    title   varchar(200)  not null,
    content varchar(1000) not null,
    writer  varchar(10)   not null,
    primary key (no),
    foreign key (writer) references user (id)
);

insert into user (id, password, name)
values ('a', 'a', '에이');

insert into user (id, password, name)
values ('b', 'b', '비');

insert into board (title, content, writer)
values ('a', 'a', '에이'),
       ('b', 'b', '비')
