CREATE TYPE forma_pagamento as ENUM('DEBITO', 'CREDITO', 'DINHEIRO', 'PIX');

--ALTER TYPE estado_civil ADD VALUE 'PENDURA';


create table pedido (
	id SERIAL primary key,
	nome_cliente VARCHAR(100) NOT NULL unique,
	valor_conta numeric(6,2) not null,
	pagamento forma_pagamento not null
);