CREATE DATABASE ngjava CHARACTER SET utf8 COLLATE utf8_general_ci;

create table ngj_users(
	id int not null auto_increment primary key,
    name varchar(50) not null,
    email varchar(50) not null,
    gender enum('f','m') not null,
    date_created datetime,
    date_updated datetime
)default charset utf8;