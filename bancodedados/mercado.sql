CREATE TABLE mercado(
	id int primary key,
	descricao varchar,
	preco decimal (5,2),
	categoria varchar
);

INSERT INTO mercado
(id, descricao, preco, categoria)
values 
(123, 'tomate cereja', 11.90, 'verdura'),
(124, 'alface americana', 5.60, 'verdura'),
(125, 'batata doce', 12.90, 'verdura'),
(126, 'batata inglesa', 7.96, 'verdura'),
(127, 'vinho seco campo largo', 20.20, 'bebidas'),
(128, 'vinho italiano suave de mesa', 11.90, 'bebidas'),
(129, 'whisky jack daniels especial', 200.90, 'bebidas'),
(132, 'whisky passaport', 54.00, 'bebidas'),
(133, 'salmao', 78.76, 'congelados'),
(134, 'carne bovina', 44.65, 'congelados'),
(135, 'bis branco', 4.53, 'doces'),
(136, 'fini dentadura', 6.99, 'doces'),
(137, 'fini banana', 6.99, 'doces'),
(138, 'arroz cinco kilos', 20.90, 'graos'),
(139, 'feijao carioca um kilo', 8.75, 'graos');

CREATE FUNCTION aumento10 (preco decimal (5,2)) returns decimal(5,2) as $$
	DECLARE 
		novopreco decimal (5,2);
	BEGIN
		if preco > 100 then novopreco = preco * 1.2;
		elseif preco < 50 then novopreco = preco * 1.05;
		else novopreco = preco * 1.1;
		end if;
		return novopreco;

	END;
$$ language PLPGSQL;
