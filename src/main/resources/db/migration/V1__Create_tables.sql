create sequence employee_seq start with 100 increment by 1;

create table employee (
    id integer not null primary key,
    name varchar(255) not null,
    age integer not null,
    version integer not null);
