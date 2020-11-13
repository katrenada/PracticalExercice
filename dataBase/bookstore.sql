-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Ven 13 Novembre 2020 à 00:05
-- Version du serveur: 5.5.24-log
-- Version de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `bookstore`
--

-- --------------------------------------------------------

--
-- Structure de la table `bill`
--

CREATE TABLE IF NOT EXISTS `bill` (
  `id_bill` int(11) NOT NULL AUTO_INCREMENT,
  `id_book` int(11) NOT NULL,
  `price_book` double NOT NULL,
  `price_CL` double NOT NULL,
  `qte` int(11) NOT NULL,
  PRIMARY KEY (`id_bill`),
  KEY `fk_bill` (`id_book`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Contenu de la table `bill`
--

INSERT INTO `bill` (`id_bill`, `id_book`, `price_book`, `price_CL`, `qte`) VALUES
(5, 1, 250, 1500, 6),
(6, 2, 250, 1250, 5),
(7, 1, 250, 500, 2),
(8, 1, 250, 500, 2);

-- --------------------------------------------------------

--
-- Structure de la table `book`
--

CREATE TABLE IF NOT EXISTS `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `author` varchar(50) NOT NULL,
  `price` double NOT NULL,
  `releaseDate` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `book`
--

INSERT INTO `book` (`id`, `title`, `author`, `price`, `releaseDate`) VALUES
(1, 'mp', 'pm', 250, '1998-02-25'),
(2, 'pm', 'mp', 250, '1998-02-25'),
(3, 'mp', 'ml', 400, '1998-02-25');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `bill`
--
ALTER TABLE `bill`
  ADD CONSTRAINT `fk_bill` FOREIGN KEY (`id_book`) REFERENCES `book` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
