-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: cbc_gestorexamenes
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tdp_profesor_seccion`
--

DROP TABLE IF EXISTS `tdp_profesor_seccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tdp_profesor_seccion` (
  `idprofesor` int(11) NOT NULL,
  `idseccion` int(11) NOT NULL,
  PRIMARY KEY (`idprofesor`,`idseccion`),
  KEY `fk_tdp_profesor_has_tdp_seccion_tdp_seccion1_idx` (`idseccion`),
  KEY `fk_tdp_profesor_has_tdp_seccion_tdp_profesor1_idx` (`idprofesor`),
  CONSTRAINT `fk_tdp_profesor_has_tdp_seccion_tdp_profesor1` FOREIGN KEY (`idprofesor`) REFERENCES `tdp_profesor` (`idprofesor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tdp_profesor_has_tdp_seccion_tdp_seccion1` FOREIGN KEY (`idseccion`) REFERENCES `tdp_seccion` (`idseccion`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tdp_profesor_seccion`
--

LOCK TABLES `tdp_profesor_seccion` WRITE;
/*!40000 ALTER TABLE `tdp_profesor_seccion` DISABLE KEYS */;
/*!40000 ALTER TABLE `tdp_profesor_seccion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-13 16:04:32
