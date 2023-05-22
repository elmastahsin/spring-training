drop table if exists EMPLOYEES;

create table EMPLOYEES
(
    id   bigint not null,
    name varchar(255),
    primary key (id)
);
