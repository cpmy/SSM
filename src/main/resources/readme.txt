create table message (
	id int not null auto_increment primary key,
	command varchar(30) NOT NULL,
	description varchar(30) NOT NULL,
	content varchar(30) NOT NULL
);