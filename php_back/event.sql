-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Tempo de geração: 23/10/2018 às 18:53
-- Versão do servidor: 10.2.17-MariaDB
-- Versão do PHP: 7.1.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `u221199859_tr`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `event`
--

CREATE TABLE `event` (
  `ID` int(11) NOT NULL,
  `author` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `body` text COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Fazendo dump de dados para tabela `event`
--

INSERT INTO `event` (`ID`, `author`, `body`) VALUES
(20, 'OWNER', 'event 1'),
(21, 'OWNER', 'event 2'),
(22, 'OWNER', 'event 3'),
(23, 'OWNER', 'event 4'),
(24, 'OWNER', 'event5'),
(25, 'OWNER', 'event 6'),
(26, 'OWNER', 'event 7');

--
-- Índices de tabelas apagadas
--

--
-- Índices de tabela `event`
--
ALTER TABLE `event`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de tabelas apagadas
--

--
-- AUTO_INCREMENT de tabela `event`
--
ALTER TABLE `event`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
