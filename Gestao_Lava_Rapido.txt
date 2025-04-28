-- criação do banco de dados
create database if not exists gestao_lava_rapido;

-- utilização do banco de dados
use gestao_lava_rapido;

-- criação da tabela cliente 
create table if not exists cliente(
id int primary key auto_increment,
nome Varchar(50) not null,
cpf varchar(11) not null,
telefone varchar(11) not null,
email varchar(50) not null,
placa_do_veiculo varchar(7) not null);

-- criação da tabela tipo do servico
create table if not exists tipo_servico(
id int primary key auto_increment,
nome varchar(50) not null,
descricao varchar(100) not null,
preco decimal(6, 2) not null);

-- criação da tabela agenda de servico
create table if not exists agenda_servicos(
id int primary key auto_increment,
`data` date not null,
`status` varchar(50) not null,
id_cliente int,
constraint IDClienteAgendamento foreign key (id_cliente) references cliente(id),
id_tipo_servico int,
constraint IDTipoAgendamento foreign key (id_tipo_servico) references tipo_servico(id)
);

-- criação de procedures para facilitar insert, update e delete em cliente.
DELIMITER //
CREATE PROCEDURE novo_cliente(
    IN p_Nome VARCHAR(50),
	IN p_Cpf VARCHAR(11),
	IN p_Telefone varchar(11),
	IN p_Email varchar(50),
	IN p_Placa_do_Veiculo varchar(7)
)
BEGIN
    INSERT INTO cliente (nome, cpf, telefone, email, placa_do_veiculo)
    VALUES (p_Nome, p_Cpf, p_Telefone, p_Email, p_Placa_do_Veiculo);

END;
//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE deletar_cliente(
    IN p_id INT
)
BEGIN
    DELETE FROM cliente WHERE id = p_id;
END;
//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE update_cliente(
	IN p_Id int,
	IN p_Nome VARCHAR(50),
	IN p_Cpf VARCHAR(11),
	IN p_Telefone varchar(11),
	IN p_Email varchar(50),
	IN p_Placa_do_Veiculo varchar(7)
)
BEGIN
    UPDATE cliente
    SET nome = p_Nome,
    cpf = p_Cpf,
    telefone = p_Telefone,
    email = p_Email,
    placa_do_veiculo = p_Placa_do_Veiculo
    WHERE id = p_id;
END;
//
DELIMITER ;

-- criação de procedures para facilitar insert, update e delete em tipo do servico.
DELIMITER //
CREATE PROCEDURE cadastrar_tipo_servico(
    IN p_nome VARCHAR(50),
	IN p_descricao varchar(100),
	IN p_preco decimal(6, 2)
)
BEGIN
    INSERT INTO tipo_servico (nome, descricao, preco)
    VALUES (p_nome, p_descricao, p_preco);
END;
//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE apagar_tipo_servico(
    IN p_id INT
)
BEGIN
    DELETE FROM tipo_servico WHERE id = p_id;
END;
//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE editar_tipo_servico(
	IN p_id int,
	IN p_nome VARCHAR(50),
	IN p_descricao varchar(100),
	IN p_preco decimal(6, 2)
)
BEGIN
    UPDATE tipo_servico
    SET nome = p_nome,
    descricao = p_descricao,
    preco = p_preco
    WHERE id = p_id;
END;
//
DELIMITER ;

-- criação de procedures para facilitar insert, update e delete em agenda de servico.
DELIMITER //
CREATE PROCEDURE agendar_servico(
	IN p_data date,
	IN p_status varchar(100),
	IN p_id_cliente int,
	IN p_id_tipo_servico int
)
BEGIN
    INSERT INTO agenda_servicos (`data`, `status`, id_cliente, id_tipo_servico)
    VALUES (p_data, p_status, p_id_cliente, p_id_tipo_servico);
END;
//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE desmarcar_servico(
    IN p_id INT
)
BEGIN
    DELETE FROM agenda_servicos WHERE id = p_id;
END;
//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE editar_agenda(
	IN p_id int,
	IN p_data date,
	IN p_status varchar(50),
	IN p_id_cliente int,
	IN p_id_tipo_servico int
)
BEGIN
    UPDATE agenda_servicos
    SET `data` = p_data,
    `status` = p_status,
    id_cliente = p_id_cliente,
    id_tipo_servico = p_id_tipo_servico
    WHERE id = p_id;
END;
//
DELIMITER ;

-- comando para insert tipo do servico.
CALL cadastrar_tipo_servico( 'Lavagem Simples', 'Foco na parte externa, rápida, remove sujeira do dia a dia.', 50.00);
CALL cadastrar_tipo_servico('Lavagem Completa','Lava por fora e por dentro: aspiração, painéis, tapetes e vidros.',150.00);
CALL cadastrar_tipo_servico('Lavagem com Cera','Inclui tudo da completa + aplicação de cera para brilho e proteção.',300.00);
CALL cadastrar_tipo_servico('Lavagem Detalhada','Serviço premium: limpeza total, polimento e proteção da pintura.',450.00);