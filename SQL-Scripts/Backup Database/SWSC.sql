-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: db
-- Erstellungszeit: 21. Mrz 2020 um 19:33
-- Server-Version: 8.0.19
-- PHP-Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `SWSC`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `franchise`
--

CREATE TABLE `franchise` (
  `ID` int NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Daten für Tabelle `franchise`
--

INSERT INTO `franchise` (`ID`, `name`) VALUES
(1, 'REWE'),
(2, 'LIDL'),
(3, 'Karstadt'),
(4, 'ALDI'),
(5, 'DM'),
(6, 'Penny'),
(7, 'Rossmann'),
(8, 'Real'),
(9, 'EDEKA'),
(10, 'Alnatura'),
(11, 'Spar'),
(12, 'The English Shop'),
(13, 'Biomarkt 3'),
(14, 'Naturata GmbH'),
(15, 'Obst & Gemüse Lebensmittelladen'),
(16, 'Getränke-Lebensmittelmarkt'),
(17, 'Nahkauf'),
(18, 'Bio-Deli, Dr. Hauschka'),
(19, 'Netto');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Daten für Tabelle `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `history`
--

CREATE TABLE `history` (
  `ID` bigint NOT NULL,
  `market_ID` int NOT NULL,
  `product_ID` int NOT NULL,
  `quantity_ID` bigint NOT NULL,
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `market`
--

CREATE TABLE `market` (
  `ID` int NOT NULL,
  `franchise_ID` int NOT NULL,
  `str_hno` varchar(150) DEFAULT NULL,
  `postcode` char(5) DEFAULT NULL,
  `city` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Daten für Tabelle `market`
--

INSERT INTO `market` (`ID`, `franchise_ID`, `str_hno`, `postcode`, `city`) VALUES
(1, 1, 'Schwertnergasse 1', '50667', 'Köln'),
(2, 1, 'Hohe Str. 30', '50667', 'Köln'),
(3, 2, 'Neumarkt 8-10', '50667', 'Köln'),
(4, 3, 'Breite Str. 103/135', '50667', 'Köln'),
(5, 4, 'Richmodstraße 31', '50667', 'Köln'),
(6, 12, 'An St. Agatha 41', '50667', 'Köln'),
(7, 13, 'Krebsgasse 11', '50667', 'Köln'),
(8, 5, 'Gürzenichstraße 6-16', '50667', 'Köln'),
(9, 1, 'Schwertnergasse 1', '50667', 'Köln'),
(10, 14, 'Krebsgasse 5-11', '50667', 'Köln'),
(11, 5, 'Minoritenstraße 1', '50667', 'Köln'),
(12, 5, 'Neumarkt 35-37', '50667', 'Köln'),
(13, 5, 'Neumarkt 2-4', '50667', 'Köln'),
(14, 5, 'Breite Str. 103-105', '50667', 'Köln'),
(15, 5, 'Hohe Str. 73-75', '50667', 'Köln'),
(16, 2, 'Habsburgerring 2', '50667', 'Köln'),
(17, 1, 'Domstraße 20', '50667', 'Köln'),
(18, 6, 'Eigelstein 51', '50667', 'Köln'),
(19, 1, 'Hohe Str. 63', '50667', 'Köln'),
(20, 1, 'Hohenzollernring 20', '50667', 'Köln'),
(21, 1, 'Severinstraße 93-95', '50667', 'Köln'),
(22, 7, 'Trankgasse 11', '50667', 'Köln'),
(23, 8, 'Weißhausstraße 20-30', '50939', 'Köln'),
(24, 1, 'Nohlstraße 24-26', '50733', 'Köln'),
(25, 1, 'Stammheimer Str. 103-105', '50735', 'Köln'),
(26, 1, 'Invalidenstraße 158', '10115', 'Berlin'),
(27, 1, 'Chausseestraße 118-120', '10115', 'Berlin'),
(28, 9, 'Chausseestraße 43', '10115', 'Berlin'),
(29, 15, 'Brunnenstraße 39', '10115', 'Berlin'),
(30, 9, 'Torstraße 206', '10115', 'Berlin'),
(31, 9, 'Am Nordbahnhof', '10115', 'Berlin'),
(32, 9, 'Große Hamburger Str. 39', '10115', 'Berlin'),
(33, 16, 'Bergstraße 16', '10115', 'Berlin'),
(34, 17, 'Rosenthaler Str. 11', '10119', 'Berlin'),
(35, 1, 'Ackerstraße 22', '10115', 'Berlin'),
(36, 10, 'Chausseestraße 10', '10115', 'Berlin'),
(37, 2, 'Luisenstraße 52', '10117', 'Berlin'),
(38, 5, 'Chausseestraße 40', '10115', 'Berlin'),
(40, 5, 'Invalidenstraße 119', '10115', 'Berlin'),
(41, 1, 'Europaplatz 1', '10557', 'Berlin'),
(42, 9, 'Fürstenberger Str. 8', '10435', 'Berlin'),
(43, 11, 'Europaplatz 1', '10551', 'Berlin'),
(44, 18, 'Invalidenstraße 153', '10115', 'Berlin'),
(45, 1, 'Litfaß-Platz 4', '10178', 'Berlin'),
(46, 9, 'Hilda-Geiringer-Weg 2-8', '10557', 'Berlin'),
(47, 1, 'Friedrichstraße 100', '10117', 'Berlin'),
(48, 9, 'Friedrichstraße 142', '10117', 'Berlin'),
(49, 19, 'Müllerstraße 10-11', '13353', 'Berlin'),
(50, 9, 'Torstraße 206', '10115', 'Berlin');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `product`
--

CREATE TABLE `product` (
  `ID` int NOT NULL,
  `productcategory_ID` int NOT NULL,
  `Name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Daten für Tabelle `product`
--

INSERT INTO `product` (`ID`, `productcategory_ID`, `Name`) VALUES
(1, 1, 'Brot'),
(2, 1, 'Brötchen'),
(3, 1, 'Kuchen'),
(4, 2, 'Schwein'),
(5, 2, 'Geflügel'),
(6, 2, 'Rind'),
(7, 2, 'Fisch'),
(8, 2, 'Aufschnitt'),
(9, 2, 'Sonstiges'),
(10, 3, 'Milch'),
(11, 3, 'Laktosefreie Produkte'),
(12, 3, 'Butter'),
(13, 3, 'Joghurt'),
(14, 3, 'Quark'),
(15, 3, 'Sahne'),
(16, 3, 'Käse'),
(17, 4, 'Äpfel'),
(18, 4, 'Bananen'),
(19, 4, 'Birnen'),
(20, 4, 'Himbeeren'),
(21, 4, 'Johannisbeeren'),
(22, 4, 'Heidelbeeren'),
(23, 4, 'Erdbeeren'),
(24, 4, 'Orangen'),
(25, 4, 'Pflaumen'),
(26, 4, 'Zitronen'),
(27, 4, 'Trauben'),
(28, 4, 'Pfirsiche'),
(29, 4, 'Kirschen'),
(30, 4, 'Marmelade und Konfitüre'),
(31, 5, 'Kartoffeln'),
(32, 5, 'Tomaten'),
(33, 5, 'Paprika'),
(34, 5, 'Pilze'),
(35, 5, 'Zwiebeln'),
(36, 5, 'Knoblauch'),
(37, 5, 'Schnittlauch'),
(38, 5, 'Porree'),
(39, 5, 'Karotten'),
(40, 5, 'Petersilie'),
(41, 5, 'Sellerie'),
(42, 5, 'Rettich'),
(43, 5, 'Radischen'),
(44, 5, 'Gurken'),
(45, 5, 'Zucchinis'),
(46, 5, 'Auberginen'),
(47, 5, 'Spinat'),
(48, 5, 'Kohl'),
(49, 5, 'Blumenkohl'),
(50, 5, 'Rosenkohl'),
(51, 5, 'Brokkoli'),
(52, 5, 'Bohnen'),
(53, 5, 'Konserven'),
(54, 6, 'Salz'),
(55, 6, 'Pfeffer'),
(56, 6, 'Paprikapulver'),
(57, 6, 'Dill'),
(58, 6, 'Kümmel'),
(59, 6, 'Nelken'),
(60, 6, 'Lorbeerblätter'),
(61, 6, 'Basilikum'),
(62, 6, 'Majoran'),
(63, 6, 'Ingwer'),
(64, 6, 'Zucker'),
(65, 6, 'Zimt'),
(66, 6, 'Kakaopulver'),
(67, 6, 'Vanille'),
(68, 6, 'Vanillezucker'),
(69, 6, 'Puderzucker'),
(70, 6, 'Senf'),
(71, 6, 'Majonäse'),
(72, 6, 'Ketschup'),
(73, 7, 'Kaffee'),
(74, 7, 'Tee'),
(75, 7, 'Kakao'),
(76, 7, 'Wasser'),
(77, 7, 'Limonaden'),
(78, 7, 'Säfte'),
(79, 7, 'alkoholhaltige Getränke'),
(80, 8, 'Zahncreme'),
(81, 8, 'Toilettenpapier'),
(82, 8, 'Küchentücher'),
(83, 8, 'Spülmittel'),
(84, 8, 'Schampoo'),
(85, 8, 'Duschgel'),
(86, 8, 'Zahnbürsten'),
(87, 8, 'Seife'),
(88, 8, 'Deo'),
(89, 8, 'Zahnseide'),
(90, 8, 'Disinfektionsmittel'),
(91, 8, 'Taschentücher'),
(92, 8, 'Windeln'),
(93, 8, 'Binden'),
(94, 8, 'Tampons'),
(95, 8, 'Feuchtigkeitstücher'),
(96, 9, 'Weingummi'),
(97, 9, 'Schokolade'),
(98, 9, 'Lakritz'),
(99, 9, 'Chips'),
(100, 9, 'Salzstangen'),
(101, 10, 'Hundenahrung'),
(102, 10, 'Katzennahrung'),
(103, 10, 'Nagernahrung'),
(104, 10, 'Katzenstreu'),
(105, 10, 'Sonstige Tiernahrung'),
(106, 11, 'Waschmittel'),
(107, 11, 'Spülmaschinen Waschmittel'),
(108, 11, 'Weichspüler'),
(109, 12, 'Babynahrung'),
(110, 12, 'Eier'),
(111, 12, 'Nüsse'),
(112, 12, 'Backpulver'),
(113, 12, 'Tiefkühlwaren'),
(114, 12, 'Verhütung');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `productcategory`
--

CREATE TABLE `productcategory` (
  `ID` int NOT NULL,
  `Name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Daten für Tabelle `productcategory`
--

INSERT INTO `productcategory` (`ID`, `Name`) VALUES
(1, 'Backwaren'),
(2, 'Fleischwaren'),
(3, 'Milchprodukte'),
(4, 'Obst'),
(5, 'Gemüse'),
(6, 'Gewürze'),
(7, 'Getränke'),
(8, 'Hygiene'),
(9, 'Süsswaren und Knabberartikel'),
(10, 'Tiernahrung'),
(11, 'Waschen'),
(12, 'Sonstiges');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `quantity`
--

CREATE TABLE `quantity` (
  `ID` bigint NOT NULL,
  `Name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `test`
--

CREATE TABLE `test` (
  `id` int NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `franchise`
--
ALTER TABLE `franchise`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `history`
--
ALTER TABLE `history`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `market_ID` (`market_ID`),
  ADD KEY `product_ID` (`product_ID`),
  ADD KEY `quantity_ID` (`quantity_ID`);

--
-- Indizes für die Tabelle `market`
--
ALTER TABLE `market`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `franchise_ID` (`franchise_ID`);

--
-- Indizes für die Tabelle `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `productcategory_ID` (`productcategory_ID`);

--
-- Indizes für die Tabelle `productcategory`
--
ALTER TABLE `productcategory`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `quantity`
--
ALTER TABLE `quantity`
  ADD PRIMARY KEY (`ID`);

--
-- Indizes für die Tabelle `test`
--
ALTER TABLE `test`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `franchise`
--
ALTER TABLE `franchise`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT für Tabelle `history`
--
ALTER TABLE `history`
  MODIFY `ID` bigint NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT für Tabelle `market`
--
ALTER TABLE `market`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT für Tabelle `product`
--
ALTER TABLE `product`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=115;

--
-- AUTO_INCREMENT für Tabelle `productcategory`
--
ALTER TABLE `productcategory`
  MODIFY `ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT für Tabelle `quantity`
--
ALTER TABLE `quantity`
  MODIFY `ID` bigint NOT NULL AUTO_INCREMENT;

--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `history`
--
ALTER TABLE `history`
  ADD CONSTRAINT `history_ibfk_1` FOREIGN KEY (`market_ID`) REFERENCES `market` (`ID`),
  ADD CONSTRAINT `history_ibfk_2` FOREIGN KEY (`product_ID`) REFERENCES `product` (`ID`),
  ADD CONSTRAINT `history_ibfk_3` FOREIGN KEY (`quantity_ID`) REFERENCES `quantity` (`ID`);

--
-- Constraints der Tabelle `market`
--
ALTER TABLE `market`
  ADD CONSTRAINT `market_ibfk_1` FOREIGN KEY (`franchise_ID`) REFERENCES `franchise` (`ID`);

--
-- Constraints der Tabelle `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `product_ibfk_1` FOREIGN KEY (`productcategory_ID`) REFERENCES `productcategory` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
