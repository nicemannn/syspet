-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.6.26-log - MySQL Community Server (GPL)
-- OS do Servidor:               Win32
-- HeidiSQL Versão:              9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Copiando estrutura do banco de dados para sispet2
CREATE DATABASE IF NOT EXISTS `sispet2` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `sispet2`;


-- Copiando estrutura para tabela sispet2.administrador
CREATE TABLE IF NOT EXISTS `administrador` (
  `id_administrador` int(11) NOT NULL AUTO_INCREMENT,
  `senhaExtra_administrador` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_administrador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.


-- Copiando estrutura para tabela sispet2.animais
CREATE TABLE IF NOT EXISTS `animais` (
  `id_animal` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_animal` varchar(100) DEFAULT NULL,
  `raca_animal` varchar(50) DEFAULT NULL,
  `tamanho_animal` int(50) DEFAULT NULL,
  `peso_animal` int(11) DEFAULT NULL,
  `idade_animal` int(11) DEFAULT NULL,
  `nome_animal` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_animal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.


-- Copiando estrutura para tabela sispet2.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `id_cliente` int(100) NOT NULL AUTO_INCREMENT,
  `nome_cliente` varchar(100) DEFAULT NULL,
  `telefone_cliente` varchar(20) DEFAULT NULL,
  `endereco_cliente` varchar(100) DEFAULT NULL,
  `cpf_cliente` varchar(14) DEFAULT NULL,
  `senha_cliente` varchar(100) DEFAULT NULL,
  `email_cliente` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.


-- Copiando estrutura para tabela sispet2.compra
CREATE TABLE IF NOT EXISTS `compra` (
  `id_compra` int(11) NOT NULL AUTO_INCREMENT,
  `cpfCliente_compra` varchar(50) DEFAULT NULL,
  `codAnimal_compra` int(100) DEFAULT NULL,
  `desconto_compra` int(100) DEFAULT NULL,
  `total_compra` int(11) DEFAULT NULL,
  `formaPagamento` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_compra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.


-- Copiando estrutura para tabela sispet2.secretaria
CREATE TABLE IF NOT EXISTS `secretaria` (
  `id_secretaria` int(11) NOT NULL AUTO_INCREMENT,
  `endereco_secretaria` varchar(100) DEFAULT NULL,
  `telefone_secretaria` varchar(100) DEFAULT NULL,
  `nome_secretaria` varchar(100) DEFAULT NULL,
  `cpf_secretaria` varchar(9) DEFAULT NULL,
  `rg_secretaria` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_secretaria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.


-- Copiando estrutura para tabela sispet2.servicos
CREATE TABLE IF NOT EXISTS `servicos` (
  `id_servicos` int(11) NOT NULL AUTO_INCREMENT,
  `preco_servicos` int(11) DEFAULT NULL,
  `disponibilidade_servicos` varchar(50) DEFAULT NULL,
  `desconto_servicos` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_servicos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
