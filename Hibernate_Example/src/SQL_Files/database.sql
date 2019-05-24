-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Temporary view structure for view `assignedto_view`
--

DROP TABLE IF EXISTS `assignedto_view`;
/*!50001 DROP VIEW IF EXISTS `assignedto_view`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `assignedto_view` AS SELECT 
 1 AS `idstudents`,
 1 AS `FirstName`,
 1 AS `LastName`,
 1 AS `idassignments`,
 1 AS `AssignmentName`,
 1 AS `AssignedTo`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `assignments`
--

DROP TABLE IF EXISTS `assignments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `assignments` (
  `idassignments` int(11) NOT NULL,
  `AssignmentName` varchar(45) DEFAULT NULL,
  `AssignedTo` int(11) DEFAULT NULL,
  PRIMARY KEY (`idassignments`),
  KEY `FK_Students_idx` (`AssignedTo`),
  CONSTRAINT `FK_Students` FOREIGN KEY (`AssignedTo`) REFERENCES `students` (`idstudents`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignments`
--

LOCK TABLES `assignments` WRITE;
/*!40000 ALTER TABLE `assignments` DISABLE KEYS */;
INSERT INTO `assignments` VALUES (1,'Java Collections',2),(2,'Threads, Executor, and Runnables',3),(3,'MVC Architecture',1),(4,'Application Controller Pattern',4),(5,'Hibernate',5),(6,'QCJSON / JSON',1),(7,'Android HttpUrlConnection',4),(8,'Servlets',3),(9,'JUnit Tests',6),(10,'System Level Tests',6),(11,'Use Case Diagrams',2),(12,'Use Case Documents',2),(13,'State Diagrams',4),(14,'Sequence Diagrams',5);
/*!40000 ALTER TABLE `assignments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `students` (
  `idstudents` int(11) NOT NULL,
  `FirstName` varchar(45) DEFAULT NULL,
  `LastName` varchar(45) DEFAULT NULL,
  UNIQUE KEY `idx_students_idstudents` (`idstudents`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Bryce','Blauser'),(2,'Zac','Allen'),(3,'Dan','Crosby'),(4,'John','Sirrine'),(5,'Brett','Yance'),(6,'Bryan','Anderson');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `assignedto_view`
--

/*!50001 DROP VIEW IF EXISTS `assignedto_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `assignedto_view` AS select `students`.`idstudents` AS `idstudents`,`students`.`FirstName` AS `FirstName`,`students`.`LastName` AS `LastName`,`assignments`.`idassignments` AS `idassignments`,`assignments`.`AssignmentName` AS `AssignmentName`,`assignments`.`AssignedTo` AS `AssignedTo` from (`students` join `assignments` on((`assignments`.`AssignedTo` = `students`.`idstudents`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-24  9:34:25
