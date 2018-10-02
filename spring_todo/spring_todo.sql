create table todo_user
(
    id          varchar2(20)        primary key,
    password    varchar2(20)        not null,
    name        varchar2(20)        not null,
    email       varchar2(30)        not null
);

select * from todo_user;

create table todo
(
    id          varchar2(20)        not null,
    todo        varchar2(50)        not null,
    content     varchar2(300)       not null,
    enddate     date                not null,
    endflag     varchar2(10)        not null,
    CONSTRAINT fk_todo  foreign key (id)
    REFERENCES todo_user(id)
);

select * from todo;
drop table todo;