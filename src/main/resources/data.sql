drop table registration if exists;
drop sequence if exists registration_sequence;
create sequence registration_sequence start with 1 increment by 1;
create table registration (id bigint not null, user_name varchar(255), first_name varchar(255), last_name varchar(255));
insert into registration values (1,'brown.fox', 'Brown','Fox');