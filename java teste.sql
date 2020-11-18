use javaTeste; 

create table contatos (
id BIGINT NOT NULL AUTO_INCREMENT,
nome VARCHAR(255),
email VARCHAR(255),
endereco VARCHAR(255),
dataNascimento DATE,
primary key (id)
);

select * from contatos;

create table funcionarios(
id INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(255),
senha VARCHAR(255),
primary key (id)
);

drop table funcionarios;