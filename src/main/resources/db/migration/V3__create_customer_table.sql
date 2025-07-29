create table if not exists customer (
    id bigint auto_increment primary key,
    name varchar(255) not null,
    email varchar(255) not null ,
    address varchar(255) not null
);