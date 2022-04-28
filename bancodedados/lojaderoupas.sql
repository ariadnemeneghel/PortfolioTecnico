-- Criando e inserindo dados em FORNECEDORES --

create table fornecedores(
	cnpj varchar(18) primary key,
	nomeFantasia varchar,
	tipoRoupa varchar,
	local varchar);	
	
insert into fornecedores
(cnpj, nomeFantasia, tipoRoupa, local)
values
('22.333.333/0001-22', 'Joãozinho importações', 'Jeans', 'São Paulo'),
('87.443.443/0001-92', 'Lila importações', 'Vestidos', 'São Paulo'),
('89.993.999/0001-92', 'Kate', 'Shorts', 'São Paulo');

-- Criando e inserindo dados em FUNCIONARIOS --

create table funcionarios(
	numCarteiraTrabalho varchar(14) primary key,
	nome varchar,
	cpf varchar, 
	salario decimal(7,2), 
	cargaHoraria int,
	cargo varchar);
	
insert into funcionarios
(numCarteiraTrabalho, nome, cpf, salario, cargaHoraria, cargo)
values
('33.55555.22-1', 'Sheldon', '255.655.582-45', 1000.00, 5, 'estagiário'),
('55.55555.22-8', 'Jéssica', '869.675.692-68', 2000.00, 8, 'estoquista');

-- Criando e inserindo dados em CLIENTE --

create table cliente(
	cpf varchar(14) primary key,
	nome varchar,
	email varchar,
	telefone varchar,
	endereço varchar);
	
insert into cliente
(cpf, nome, email, telefone, endereço)
values
('775.675.092-79', 'Marina', 'mari79@gmail.com', '(48)99145-2824', 'Rua Alfredo Fagner'),
('989.223.123-78', 'Alisson', 'alisson12@gmail.com','(48)99176-2898', 'Rua das Avencas');

-- Criando e inserindo dados em PRODUTOS --
-- Tabela cotem chave estrangeira --
-- PRODUTO --> FORNECEDOR --

create table produtos(
	codProd bigint primary key,
	tecido varchar,
	tamanho varchar,
	modelo varchar,
	estilo varchar,
	marca varchar,
	preco decimal(5,2), 
	codFornecedor varchar(18),
	foreign key (codFornecedor) references fornecedores(cnpj)
);

insert into produtos
(codProd, tecido, tamanho, modelo, estilo, marca, preco, codFornecedor)
values
(889977, 'jeans', 'M', 'short', 'esporte', 'rolamoça', 54.90, '22.333.333/0001-22'),
(886677, 'Algodão', 'G', 'vestido', 'gala', 'Lança Perfurme', 350.90, '87.443.443/0001-92');

-- Criando e inserindo dados em VENDA --
-- Tabela de relacionamento --

create table venda(
	data date,
	codFuncionario varchar(14)references funcionarios,
	codProduto bigint references produtos,
	CodCliente varchar(14) references cliente);
	
insert into venda
(data, codFuncionario, codProduto, codCliente)
values
('2022-03-14','55.55555.22-8', 889977, '989.223.123-78'),
('2022-03-16','55.55555.22-8', 886677, '775.675.092-79');

select * from venda inner join funcionarios on venda.codFuncionario = funcionarios.numCarteiraTrabalho 
inner join cliente on venda.codCliente = cliente.cpf 
inner join produtos on venda.codProduto = produtos.codProd 
inner join fornecedores on produtos.codFornecedor = fornecedores.cnpj

select f.cargahoraria, f.cargo, f.cpf, f.nome, f.numcarteiratrabalho, f.salario, 
c."endereço", c.cpf, c.email, c.nome, c.telefone, 
p.codfornecedor, p.codprod, p.estilo, p.marca, p.modelo, p.preco, p.tamanho, p.tecido,
v."data", v.codcliente, v.codfuncionario, v.codproduto from venda v
inner join funcionarios f on v.codFuncionario = f.numCarteiraTrabalho 
inner join cliente c on v.codCliente = c.cpf 
inner join produtos p on v.codProduto = p.codProd 
inner join fornecedores on produtos.codFornecedor = fornecedores.cnpj
