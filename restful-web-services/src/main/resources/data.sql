insert into user_details(id,birthdate,name)
values(10001, current_date(), 'Tushar');

insert into user_details(id,birthdate,name)
values(10002, current_date(), 'Tush');

insert into user_details(id,birthdate,name)
values(10003, current_date(), 'shar');

insert into post(id,description,user_id)
values(20001,'My name is Tushar',10001);

insert into post(id,description,user_id)
values(20002,'Im learning spring',10001);

insert into post(id,description,user_id)
values(20003,'My name is Tush',10002);

insert into post(id,description,user_id)
values(20004,'I want to learn postgresql',10002);