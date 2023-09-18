create table cliente (
	id SERIAL primary key,
	nome VARCHAR(100) NOT NULL,
	email varchar(60) not null unique,
	senha varchar(30) not null
)