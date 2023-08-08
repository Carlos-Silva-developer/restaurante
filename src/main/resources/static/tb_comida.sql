create table comida (
	id SERIAL primary key,
	nome VARCHAR(100) NOT NULL unique,
	imagem_url varchar(255),
	preco decimal(8,2)
)