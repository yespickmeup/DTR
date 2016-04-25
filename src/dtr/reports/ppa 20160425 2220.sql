-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.15


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema db_dtr
--

CREATE DATABASE IF NOT EXISTS db_dtr;
USE db_dtr;

--
-- Definition of table `departments`
--

DROP TABLE IF EXISTS `departments`;
CREATE TABLE `departments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `department` varchar(255) DEFAULT NULL,
  `date_added` datetime DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `user_screen_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `departments`
--

/*!40000 ALTER TABLE `departments` DISABLE KEYS */;
INSERT INTO `departments` (`id`,`department`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (1,'DUMAGUETE','2015-12-15 21:31:58','',''),
 (2,'TANDAYAG','2015-12-15 21:32:05','',''),
 (3,'LARENA','2015-12-15 21:32:10','',''),
 (4,'GUIHULNGAN','2015-12-15 21:32:14','',''),
 (5,'Department 5','2015-12-15 21:32:19','','');
/*!40000 ALTER TABLE `departments` ENABLE KEYS */;


--
-- Definition of table `dtr`
--

DROP TABLE IF EXISTS `dtr`;
CREATE TABLE `dtr` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `department` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `no` varchar(255) DEFAULT NULL,
  `datetime` varchar(255) DEFAULT NULL,
  `location_id` varchar(255) DEFAULT NULL,
  `id_no` varchar(255) DEFAULT NULL,
  `verify_code` varchar(255) DEFAULT NULL,
  `card_no` varchar(255) DEFAULT NULL,
  `date_added` datetime DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `user_screen_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dtr`
--

/*!40000 ALTER TABLE `dtr` DISABLE KEYS */;
/*!40000 ALTER TABLE `dtr` ENABLE KEYS */;


--
-- Definition of table `dtrs`
--

DROP TABLE IF EXISTS `dtrs`;
CREATE TABLE `dtrs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` varchar(255) DEFAULT NULL,
  `employee_name` varchar(255) DEFAULT NULL,
  `department_id` varchar(255) DEFAULT NULL,
  `department_name` varchar(255) DEFAULT NULL,
  `dtr_date` date DEFAULT NULL,
  `am_arrival` datetime DEFAULT NULL,
  `am_departure` datetime DEFAULT NULL,
  `pm_arrival` datetime DEFAULT NULL,
  `pm_departure` datetime DEFAULT NULL,
  `undertime_hours` varchar(255) DEFAULT NULL,
  `undertime_minutes` varchar(255) DEFAULT NULL,
  `date_added` datetime DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `user_screen_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=396 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dtrs`
--

/*!40000 ALTER TABLE `dtrs` DISABLE KEYS */;
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (77,'1','JUCOM, SUESA O.','1','DUMAGUETE','2016-03-17','2016-03-17 15:53:18','2016-03-17 16:35:05','2016-03-17 17:27:30','2016-03-17 17:35:58','00','00','2016-04-20 15:36:57','',''),
 (78,'1','JUCOM, SUESA O.','1','DUMAGUETE','2016-03-18','2016-03-18 07:53:14','2016-03-18 12:03:18','2016-03-18 12:03:23','2016-03-18 22:59:10','00','00','2016-04-20 15:36:57','',''),
 (79,'1','JUCOM, SUESA O.','1','DUMAGUETE','2016-03-19','2016-03-19 07:59:07','2016-03-19 20:00:20',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (80,'1','JUCOM, SUESA O.','1','DUMAGUETE','2016-03-20','2016-03-20 09:04:33','2016-03-20 18:19:41',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (81,'1','JUCOM, SUESA O.','1','DUMAGUETE','2016-03-21','2016-03-21 07:51:40','2016-03-21 17:17:17',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (82,'1','JUCOM, SUESA O.','1','DUMAGUETE','2016-03-22','2016-03-22 07:52:20','2016-03-22 18:56:38',NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (83,'1','JUCOM, SUESA O.','1','DUMAGUETE','2016-03-23','2016-03-23 07:41:14','2016-03-23 12:30:42',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (84,'1','JUCOM, SUESA O.','1','DUMAGUETE','2016-03-28','2016-03-28 08:19:57','2016-03-28 12:07:41','2016-03-28 12:07:45','2016-03-28 17:34:52','00','00','2016-04-20 15:36:57','',''),
 (85,'1','JUCOM, SUESA O.','1','DUMAGUETE','2016-03-29','2016-03-29 08:20:41','2016-03-29 12:21:56','2016-03-29 12:22:03','2016-03-29 17:26:18','00','00','2016-04-20 15:36:57','',''),
 (86,'1','JUCOM, SUESA O.','1','DUMAGUETE','2016-03-30','2016-03-30 08:14:14','2016-03-30 17:24:19',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (87,'1','JUCOM, SUESA O.','1','DUMAGUETE','2016-03-31','2016-03-31 07:45:11','2016-03-31 18:23:56',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (88,'2','ABADINAS, DOREEN MARIE L.','1','DUMAGUETE','2016-03-17','2016-03-17 17:31:22','2016-03-17 17:31:30','2016-03-17 22:32:54',NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (89,'2','ABADINAS, DOREEN MARIE L.','1','DUMAGUETE','2016-03-18','2016-03-18 08:27:20','2016-03-18 12:05:04','2016-03-18 12:05:21','2016-03-18 22:59:29','00','00','2016-04-20 15:36:57','',''),
 (90,'2','ABADINAS, DOREEN MARIE L.','1','DUMAGUETE','2016-03-19','2016-03-19 12:05:46','2016-03-19 23:17:41',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (91,'2','ABADINAS, DOREEN MARIE L.','1','DUMAGUETE','2016-03-28','2016-03-28 12:46:49',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (92,'2','ABADINAS, DOREEN MARIE L.','1','DUMAGUETE','2016-03-29','2016-03-29 08:36:53','2016-03-29 12:22:12','2016-03-29 12:22:28','2016-03-29 21:01:31','00','00','2016-04-20 15:36:57','',''),
 (93,'2','ABADINAS, DOREEN MARIE L.','1','DUMAGUETE','2016-03-30','2016-03-30 08:47:35','2016-03-30 12:27:39','2016-03-30 12:27:47','2016-03-30 20:42:12','00','00','2016-04-20 15:36:57','',''),
 (94,'2','ABADINAS, DOREEN MARIE L.','1','DUMAGUETE','2016-03-31','2016-03-31 08:25:20','2016-03-31 19:47:22',NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (95,'3','AGUILAR, VIRGINIA S.','1','DUMAGUETE','2016-03-18','2016-03-18 07:59:03','2016-03-18 12:04:15','2016-03-18 12:04:39',NULL,'00','00','2016-04-20 15:36:57','',''),
 (96,'3','AGUILAR, VIRGINIA S.','1','DUMAGUETE','2016-03-21','2016-03-21 07:30:51','2016-03-21 12:28:20','2016-03-21 12:28:40','2016-03-21 17:09:16','00','00','2016-04-20 15:36:57','',''),
 (97,'3','AGUILAR, VIRGINIA S.','1','DUMAGUETE','2016-03-22','2016-03-22 07:33:08','2016-03-22 12:08:04','2016-03-22 12:09:29','2016-03-22 17:35:34','00','00','2016-04-20 15:36:57','',''),
 (98,'3','AGUILAR, VIRGINIA S.','1','DUMAGUETE','2016-03-23','2016-03-23 07:38:35','2016-03-23 12:43:02','2016-03-23 12:43:07',NULL,'00','00','2016-04-20 15:36:57','',''),
 (99,'3','AGUILAR, VIRGINIA S.','1','DUMAGUETE','2016-03-31','2016-03-31 07:34:07','2016-03-31 12:32:54','2016-03-31 12:33:01','2016-03-31 17:14:09','00','00','2016-04-20 15:36:57','',''),
 (100,'4','ALDANESE, DORIS AJNE B.','1','DUMAGUETE','2016-03-17','2016-03-17 17:43:43',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (101,'4','ALDANESE, DORIS AJNE B.','1','DUMAGUETE','2016-03-18','2016-03-18 07:57:16','2016-03-18 12:09:35','2016-03-18 12:09:41','2016-03-18 17:04:46','00','00','2016-04-20 15:36:57','',''),
 (102,'4','ALDANESE, DORIS AJNE B.','1','DUMAGUETE','2016-03-21','2016-03-21 07:34:41','2016-03-21 12:23:15','2016-03-21 12:23:21','2016-03-21 17:06:16','00','00','2016-04-20 15:36:57','',''),
 (103,'4','ALDANESE, DORIS AJNE B.','1','DUMAGUETE','2016-03-22','2016-03-22 07:33:15','2016-03-22 12:54:22','2016-03-22 12:54:27','2016-03-22 17:08:28','00','00','2016-04-20 15:36:57','',''),
 (104,'4','ALDANESE, DORIS AJNE B.','1','DUMAGUETE','2016-03-23','2016-03-23 07:58:41','2016-03-23 12:18:36','2016-03-23 12:18:42',NULL,'00','00','2016-04-20 15:36:57','',''),
 (105,'4','ALDANESE, DORIS AJNE B.','1','DUMAGUETE','2016-03-31','2016-03-31 07:24:05','2016-03-31 12:43:43','2016-03-31 12:43:49','2016-03-31 17:11:24','00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (106,'5','ALFARAZ, TONI LEON B.','1','DUMAGUETE','2016-03-18','2016-03-18 10:16:07','2016-03-18 21:58:20','2016-03-18 21:58:22','2016-03-18 21:58:26','00','00','2016-04-20 15:36:57','',''),
 (107,'5','ALFARAZ, TONI LEON B.','1','DUMAGUETE','2016-03-21','2016-03-21 08:11:06','2016-03-21 12:40:33','2016-03-21 12:40:38',NULL,'00','00','2016-04-20 15:36:57','',''),
 (108,'5','ALFARAZ, TONI LEON B.','1','DUMAGUETE','2016-03-22','2016-03-22 12:34:01','2016-03-22 12:34:13','2016-03-22 17:38:49',NULL,'00','00','2016-04-20 15:36:57','',''),
 (109,'5','ALFARAZ, TONI LEON B.','1','DUMAGUETE','2016-03-23','2016-03-23 08:09:03','2016-03-23 08:09:20','2016-03-23 12:35:57','2016-03-23 12:36:02','00','00','2016-04-20 15:36:57','',''),
 (110,'5','ALFARAZ, TONI LEON B.','1','DUMAGUETE','2016-03-28','2016-03-28 07:44:25','2016-03-28 12:46:17','2016-03-28 12:46:22','2016-03-28 12:46:31','00','00','2016-04-20 15:36:57','',''),
 (111,'5','ALFARAZ, TONI LEON B.','1','DUMAGUETE','2016-03-29','2016-03-29 12:52:52','2016-03-29 12:52:57','2016-03-29 17:20:15',NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (112,'5','ALFARAZ, TONI LEON B.','1','DUMAGUETE','2016-03-30','2016-03-30 08:07:03','2016-03-30 12:45:58','2016-03-30 12:46:04','2016-03-30 17:26:53','00','00','2016-04-20 15:36:57','',''),
 (113,'7','ANFONE, MICHELENE G.','1','DUMAGUETE','2016-03-17','2016-03-17 17:27:22','2016-03-17 17:49:37','2016-03-17 17:49:51','2016-03-17 17:49:57','00','00','2016-04-20 15:36:57','',''),
 (114,'7','ANFONE, MICHELENE G.','1','DUMAGUETE','2016-03-21','2016-03-21 07:51:18','2016-03-21 12:51:33','2016-03-21 12:52:00','2016-03-21 17:01:52','00','00','2016-04-20 15:36:57','',''),
 (115,'7','ANFONE, MICHELENE G.','1','DUMAGUETE','2016-03-22','2016-03-22 08:12:34','2016-03-22 12:15:40','2016-03-22 12:16:23','2016-03-22 17:25:01','00','00','2016-04-20 15:36:57','',''),
 (116,'7','ANFONE, MICHELENE G.','1','DUMAGUETE','2016-03-23','2016-03-23 07:58:55','2016-03-23 12:36:27','2016-03-23 12:36:35','2016-03-23 17:32:55','00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (117,'7','ANFONE, MICHELENE G.','1','DUMAGUETE','2016-03-28','2016-03-28 07:53:03','2016-03-28 12:31:15','2016-03-28 12:31:23','2016-03-28 17:24:05','00','00','2016-04-20 15:36:57','',''),
 (118,'7','ANFONE, MICHELENE G.','1','DUMAGUETE','2016-03-31','2016-03-31 08:03:24','2016-03-31 12:37:23','2016-03-31 12:37:34','2016-03-31 18:07:30','00','00','2016-04-20 15:36:57','',''),
 (119,'11','ARANAS, JULITO M.','1','DUMAGUETE','2016-03-17','2016-03-17 17:35:41',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (120,'11','ARANAS, JULITO M.','1','DUMAGUETE','2016-03-18','2016-03-18 08:41:35','2016-03-18 12:08:55','2016-03-18 12:09:03',NULL,'00','00','2016-04-20 15:36:57','',''),
 (121,'11','ARANAS, JULITO M.','1','DUMAGUETE','2016-03-21','2016-03-21 07:52:20','2016-03-21 12:01:38','2016-03-21 12:03:47','2016-03-21 17:02:56','00','00','2016-04-20 15:36:57','',''),
 (122,'11','ARANAS, JULITO M.','1','DUMAGUETE','2016-03-22','2016-03-22 08:03:25','2016-03-22 12:10:15','2016-03-22 12:10:21','2016-03-22 17:04:17','00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (123,'11','ARANAS, JULITO M.','1','DUMAGUETE','2016-03-23','2016-03-23 08:08:51','2016-03-23 12:11:43','2016-03-23 12:11:49',NULL,'00','00','2016-04-20 15:36:57','',''),
 (124,'11','ARANAS, JULITO M.','1','DUMAGUETE','2016-03-28','2016-03-28 07:41:45','2016-03-28 12:08:09','2016-03-28 12:08:15','2016-03-28 17:02:13','00','00','2016-04-20 15:36:57','',''),
 (125,'11','ARANAS, JULITO M.','1','DUMAGUETE','2016-03-29','2016-03-29 07:57:49','2016-03-29 12:09:34','2016-03-29 17:17:06',NULL,'00','00','2016-04-20 15:36:57','',''),
 (126,'11','ARANAS, JULITO M.','1','DUMAGUETE','2016-03-30','2016-03-30 08:01:29','2016-03-30 12:03:12','2016-03-30 12:03:21','2016-03-30 17:04:16','00','00','2016-04-20 15:36:57','',''),
 (127,'11','ARANAS, JULITO M.','1','DUMAGUETE','2016-03-31','2016-03-31 07:57:39','2016-03-31 12:06:43','2016-03-31 12:06:51','2016-03-31 17:01:11','00','00','2016-04-20 15:36:57','',''),
 (128,'12','ARANAS, RUEL V.','1','DUMAGUETE','2016-03-21','2016-03-21 15:58:23',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (129,'12','ARANAS, RUEL V.','1','DUMAGUETE','2016-03-22','2016-03-22 22:40:40','2016-03-22 22:41:09',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (130,'12','ARANAS, RUEL V.','1','DUMAGUETE','2016-03-23','2016-03-23 07:07:12','2016-03-23 14:47:06','2016-03-23 23:24:56',NULL,'00','00','2016-04-20 15:36:57','',''),
 (131,'12','ARANAS, RUEL V.','1','DUMAGUETE','2016-03-24','2016-03-24 14:51:28','2016-03-24 23:08:23',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (132,'13','ARANAS, VICENTA B.','1','DUMAGUETE','2016-03-18','2016-03-18 10:11:09','2016-03-18 12:41:30','2016-03-18 12:41:44',NULL,'00','00','2016-04-20 15:36:57','',''),
 (133,'13','ARANAS, VICENTA B.','1','DUMAGUETE','2016-03-21','2016-03-21 12:50:39','2016-03-21 12:51:05','2016-03-21 17:39:51',NULL,'00','00','2016-04-20 15:36:57','',''),
 (134,'13','ARANAS, VICENTA B.','1','DUMAGUETE','2016-03-22','2016-03-22 12:33:45','2016-03-22 12:33:52',NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (135,'13','ARANAS, VICENTA B.','1','DUMAGUETE','2016-03-23','2016-03-23 18:38:16',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (136,'13','ARANAS, VICENTA B.','1','DUMAGUETE','2016-03-28','2016-03-28 12:49:13','2016-03-28 12:49:21',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (137,'13','ARANAS, VICENTA B.','1','DUMAGUETE','2016-03-29','2016-03-29 08:20:21','2016-03-29 12:56:43','2016-03-29 12:56:50',NULL,'00','00','2016-04-20 15:36:57','',''),
 (138,'13','ARANAS, VICENTA B.','1','DUMAGUETE','2016-03-30','2016-03-30 08:11:42','2016-03-30 12:58:39','2016-03-30 12:58:55',NULL,'00','00','2016-04-20 15:36:57','',''),
 (139,'15','BAGA, JULIAN S.','1','DUMAGUETE','2016-03-18','2016-03-18 11:36:00','2016-03-18 17:14:47',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (140,'15','BAGA, JULIAN S.','1','DUMAGUETE','2016-03-19','2016-03-19 07:01:36','2016-03-19 15:10:08',NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (141,'15','BAGA, JULIAN S.','1','DUMAGUETE','2016-03-23','2016-03-23 07:32:41','2016-03-23 12:07:18','2016-03-23 12:07:26',NULL,'00','00','2016-04-20 15:36:57','',''),
 (142,'15','BAGA, JULIAN S.','1','DUMAGUETE','2016-03-24','2016-03-24 14:46:14',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (143,'15','BAGA, JULIAN S.','1','DUMAGUETE','2016-03-28','2016-03-28 07:14:26','2016-03-28 12:07:08','2016-03-28 12:07:30','2016-03-28 12:07:36','00','00','2016-04-20 15:36:57','',''),
 (144,'15','BAGA, JULIAN S.','1','DUMAGUETE','2016-03-29','2016-03-29 07:55:32','2016-03-29 12:02:51','2016-03-29 12:03:03','2016-03-29 17:01:24','00','00','2016-04-20 15:36:57','',''),
 (145,'15','BAGA, JULIAN S.','1','DUMAGUETE','2016-03-30','2016-03-30 07:48:28','2016-03-30 12:07:14','2016-03-30 12:07:20','2016-03-30 17:04:00','00','00','2016-04-20 15:36:57','',''),
 (146,'15','BAGA, JULIAN S.','1','DUMAGUETE','2016-03-31','2016-03-31 07:22:13','2016-03-31 12:05:08','2016-03-31 12:05:17','2016-03-31 17:04:49','00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (147,'16','BOHOLANO, JANET C.','1','DUMAGUETE','2016-03-18','2016-03-18 08:00:52','2016-03-18 22:59:20',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (148,'16','BOHOLANO, JANET C.','1','DUMAGUETE','2016-03-19','2016-03-19 07:59:11','2016-03-19 20:00:27',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (149,'16','BOHOLANO, JANET C.','1','DUMAGUETE','2016-03-20','2016-03-20 09:04:44','2016-03-20 18:19:32',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (150,'16','BOHOLANO, JANET C.','1','DUMAGUETE','2016-03-21','2016-03-21 07:51:49','2016-03-21 17:17:33',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (151,'16','BOHOLANO, JANET C.','1','DUMAGUETE','2016-03-22','2016-03-22 07:52:27','2016-03-22 18:57:24',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (152,'16','BOHOLANO, JANET C.','1','DUMAGUETE','2016-03-23','2016-03-23 07:41:33','2016-03-23 12:37:27','2016-03-23 12:37:33',NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (153,'16','BOHOLANO, JANET C.','1','DUMAGUETE','2016-03-31','2016-03-31 07:45:22','2016-03-31 18:23:43',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (154,'17','CALINGACION, PONCIANO JR. A.','1','DUMAGUETE','2016-03-18','2016-03-18 08:13:05','2016-03-18 12:58:53','2016-03-18 12:59:11','2016-03-18 12:59:19','00','00','2016-04-20 15:36:57','',''),
 (155,'17','CALINGACION, PONCIANO JR. A.','1','DUMAGUETE','2016-03-21','2016-03-21 07:03:15','2016-03-21 12:41:40',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (156,'17','CALINGACION, PONCIANO JR. A.','1','DUMAGUETE','2016-03-23','2016-03-23 08:23:27','2016-03-23 12:11:06','2016-03-23 12:11:11','2016-03-23 12:11:30','00','00','2016-04-20 15:36:57','',''),
 (157,'17','CALINGACION, PONCIANO JR. A.','1','DUMAGUETE','2016-03-28','2016-03-28 06:59:34','2016-03-28 12:50:59','2016-03-28 12:51:05','2016-03-28 17:02:07','00','00','2016-04-20 15:36:57','',''),
 (158,'17','CALINGACION, PONCIANO JR. A.','1','DUMAGUETE','2016-03-29','2016-03-29 08:13:10','2016-03-29 12:41:33','2016-03-29 12:41:39','2016-03-29 17:19:27','00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (159,'17','CALINGACION, PONCIANO JR. A.','1','DUMAGUETE','2016-03-30','2016-03-30 07:13:09','2016-03-30 12:45:44','2016-03-30 12:45:51','2016-03-30 17:03:22','00','00','2016-04-20 15:36:57','',''),
 (160,'17','CALINGACION, PONCIANO JR. A.','1','DUMAGUETE','2016-03-31','2016-03-31 08:02:51','2016-03-31 12:41:25','2016-03-31 12:41:30','2016-03-31 17:14:03','00','00','2016-04-20 15:36:57','',''),
 (161,'18','CARAMAT, ROLANDO Y.','1','DUMAGUETE','2016-03-17','2016-03-17 17:38:49',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (162,'18','CARAMAT, ROLANDO Y.','1','DUMAGUETE','2016-03-18','2016-03-18 07:25:49','2016-03-18 17:08:32',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (163,'18','CARAMAT, ROLANDO Y.','1','DUMAGUETE','2016-03-19','2016-03-19 05:56:13','2016-03-19 15:22:46',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (164,'18','CARAMAT, ROLANDO Y.','1','DUMAGUETE','2016-03-21','2016-03-21 07:30:45','2016-03-21 12:10:32','2016-03-21 12:11:12','2016-03-21 17:16:47','00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (165,'18','CARAMAT, ROLANDO Y.','1','DUMAGUETE','2016-03-22','2016-03-22 07:36:24','2016-03-22 12:13:05','2016-03-22 12:13:15','2016-03-22 17:03:16','00','00','2016-04-20 15:36:57','',''),
 (166,'18','CARAMAT, ROLANDO Y.','1','DUMAGUETE','2016-03-23','2016-03-23 07:38:56','2016-03-23 12:09:39','2016-03-23 12:09:46','2016-03-23 12:09:58','00','00','2016-04-20 15:36:57','',''),
 (167,'18','CARAMAT, ROLANDO Y.','1','DUMAGUETE','2016-03-24','2016-03-24 07:23:44','2016-03-24 12:27:25','2016-03-24 12:27:31','2016-03-24 17:07:55','00','00','2016-04-20 15:36:57','',''),
 (168,'18','CARAMAT, ROLANDO Y.','1','DUMAGUETE','2016-03-25','2016-03-25 07:24:44','2016-03-25 12:17:08','2016-03-25 12:17:21','2016-03-25 17:08:13','00','00','2016-04-20 15:36:57','',''),
 (169,'18','CARAMAT, ROLANDO Y.','1','DUMAGUETE','2016-03-26','2016-03-26 07:27:37','2016-03-26 17:04:34',NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (170,'18','CARAMAT, ROLANDO Y.','1','DUMAGUETE','2016-03-28','2016-03-28 07:42:12','2016-03-28 12:10:36','2016-03-28 12:10:41','2016-03-28 17:05:34','00','00','2016-04-20 15:36:57','',''),
 (171,'18','CARAMAT, ROLANDO Y.','1','DUMAGUETE','2016-03-29','2016-03-29 07:36:38','2016-03-29 12:03:58','2016-03-29 12:04:03','2016-03-29 17:03:06','00','00','2016-04-20 15:36:57','',''),
 (172,'18','CARAMAT, ROLANDO Y.','1','DUMAGUETE','2016-03-30','2016-03-30 07:21:50','2016-03-30 12:11:30','2016-03-30 12:11:41','2016-03-30 17:08:00','00','00','2016-04-20 15:36:57','',''),
 (173,'18','CARAMAT, ROLANDO Y.','1','DUMAGUETE','2016-03-31','2016-03-31 07:31:55','2016-03-31 12:05:29','2016-03-31 12:06:19','2016-03-31 17:12:59','00','00','2016-04-20 15:36:57','',''),
 (174,'19','CASIPONG, DEOGRACIAS JR. V.','1','DUMAGUETE','2016-03-18','2016-03-18 08:26:58','2016-03-18 12:02:09','2016-03-18 12:02:16','2016-03-18 12:02:33','00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (175,'19','CASIPONG, DEOGRACIAS JR. V.','1','DUMAGUETE','2016-03-21','2016-03-21 07:31:00','2016-03-21 12:05:27','2016-03-21 12:05:35','2016-03-21 17:01:59','00','00','2016-04-20 15:36:57','',''),
 (176,'19','CASIPONG, DEOGRACIAS JR. V.','1','DUMAGUETE','2016-03-28','2016-03-28 07:26:44','2016-03-28 12:10:07','2016-03-28 12:10:21',NULL,'00','00','2016-04-20 15:36:57','',''),
 (177,'19','CASIPONG, DEOGRACIAS JR. V.','1','DUMAGUETE','2016-03-29','2016-03-29 07:22:35','2016-03-29 12:01:32','2016-03-29 12:01:40','2016-03-29 17:02:09','00','00','2016-04-20 15:36:57','',''),
 (178,'19','CASIPONG, DEOGRACIAS JR. V.','1','DUMAGUETE','2016-03-30','2016-03-30 07:30:12','2016-03-30 12:04:35','2016-03-30 17:01:19',NULL,'00','00','2016-04-20 15:36:57','',''),
 (179,'19','CASIPONG, DEOGRACIAS JR. V.','1','DUMAGUETE','2016-03-31','2016-03-31 07:38:44','2016-03-31 12:19:37',NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (180,'20','CATALAN, CENANDO A.','1','DUMAGUETE','2016-03-17','2016-03-17 18:10:37','2016-03-17 18:10:59',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (181,'20','CATALAN, CENANDO A.','1','DUMAGUETE','2016-03-18','2016-03-18 07:59:15','2016-03-18 12:41:53','2016-03-18 12:42:01','2016-03-18 17:06:38','00','00','2016-04-20 15:36:57','',''),
 (182,'20','CATALAN, CENANDO A.','1','DUMAGUETE','2016-03-19','2016-03-19 12:05:31','2016-03-19 19:25:04',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (183,'20','CATALAN, CENANDO A.','1','DUMAGUETE','2016-03-21','2016-03-21 08:57:34','2016-03-21 12:53:00','2016-03-21 12:53:35','2016-03-21 18:32:10','00','00','2016-04-20 15:36:57','',''),
 (184,'20','CATALAN, CENANDO A.','1','DUMAGUETE','2016-03-22','2016-03-22 08:12:11','2016-03-22 12:17:55','2016-03-22 12:18:17','2016-03-22 12:18:25','00','00','2016-04-20 15:36:57','',''),
 (185,'20','CATALAN, CENANDO A.','1','DUMAGUETE','2016-03-23','2016-03-23 08:24:14','2016-03-23 12:51:23','2016-03-23 12:51:30','2016-03-23 17:39:43','00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (186,'20','CATALAN, CENANDO A.','1','DUMAGUETE','2016-03-24','2016-03-24 10:55:08','2016-03-24 17:05:06',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (187,'20','CATALAN, CENANDO A.','1','DUMAGUETE','2016-03-25','2016-03-25 07:41:11','2016-03-25 17:08:42',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (188,'20','CATALAN, CENANDO A.','1','DUMAGUETE','2016-03-26','2016-03-26 10:58:49','2016-03-26 19:01:02',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (189,'20','CATALAN, CENANDO A.','1','DUMAGUETE','2016-03-27','2016-03-27 09:45:43','2016-03-27 17:03:23',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (190,'20','CATALAN, CENANDO A.','1','DUMAGUETE','2016-03-28','2016-03-28 07:56:59','2016-03-28 12:37:02','2016-03-28 12:40:55',NULL,'00','00','2016-04-20 15:36:57','',''),
 (191,'20','CATALAN, CENANDO A.','1','DUMAGUETE','2016-03-29','2016-03-29 08:36:28','2016-03-29 12:51:46','2016-03-29 12:52:04','2016-03-29 18:44:56','00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (192,'20','CATALAN, CENANDO A.','1','DUMAGUETE','2016-03-30','2016-03-30 08:25:59','2016-03-30 12:42:35','2016-03-30 12:42:43','2016-03-30 18:34:52','00','00','2016-04-20 15:36:57','',''),
 (193,'20','CATALAN, CENANDO A.','1','DUMAGUETE','2016-03-31','2016-03-31 08:24:15','2016-03-31 12:52:38','2016-03-31 12:52:48','2016-03-31 18:50:55','00','00','2016-04-20 15:36:57','',''),
 (194,'22','CORNELIA, GEMELO JR. S.','1','DUMAGUETE','2016-03-22','2016-03-22 15:29:30',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (195,'23','ENTEA, RUEL C.','1','DUMAGUETE','2016-03-18','2016-03-18 07:55:07','2016-03-18 12:05:49','2016-03-18 12:05:55','2016-03-18 17:07:55','00','00','2016-04-20 15:36:57','',''),
 (196,'23','ENTEA, RUEL C.','1','DUMAGUETE','2016-03-19','2016-03-19 08:03:32',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (197,'23','ENTEA, RUEL C.','1','DUMAGUETE','2016-03-21','2016-03-21 07:31:42','2016-03-21 12:20:25','2016-03-21 12:20:32','2016-03-21 17:17:03','00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (198,'23','ENTEA, RUEL C.','1','DUMAGUETE','2016-03-22','2016-03-22 08:23:07','2016-03-22 12:07:35','2016-03-22 12:07:40','2016-03-22 17:10:20','00','00','2016-04-20 15:36:57','',''),
 (199,'23','ENTEA, RUEL C.','1','DUMAGUETE','2016-03-23','2016-03-23 06:24:25',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (200,'23','ENTEA, RUEL C.','1','DUMAGUETE','2016-03-31','2016-03-31 08:03:04','2016-03-31 12:04:29','2016-03-31 12:04:36','2016-03-31 17:11:43','00','00','2016-04-20 15:36:57','',''),
 (201,'24','GARANGAY, SARAH MA. R.','1','DUMAGUETE','2016-03-22','2016-03-22 15:21:32',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (202,'24','GARANGAY, SARAH MA. R.','1','DUMAGUETE','2016-03-24','2016-03-24 06:49:32','2016-03-24 16:40:15',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (203,'24','GARANGAY, SARAH MA. R.','1','DUMAGUETE','2016-03-25','2016-03-25 06:58:18','2016-03-25 15:17:53',NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (204,'24','GARANGAY, SARAH MA. R.','1','DUMAGUETE','2016-03-27','2016-03-27 22:17:18',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (205,'24','GARANGAY, SARAH MA. R.','1','DUMAGUETE','2016-03-28','2016-03-28 08:02:28',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (206,'24','GARANGAY, SARAH MA. R.','1','DUMAGUETE','2016-03-29','2016-03-29 14:35:13','2016-03-29 23:26:33',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (207,'24','GARANGAY, SARAH MA. R.','1','DUMAGUETE','2016-03-30','2016-03-30 06:52:33','2016-03-30 16:43:21',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (208,'24','GARANGAY, SARAH MA. R.','1','DUMAGUETE','2016-03-31','2016-03-31 06:46:12','2016-03-31 20:20:18',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (209,'25','JASMIN, GEORGINA S.','1','DUMAGUETE','2016-03-18','2016-03-18 08:44:51','2016-03-18 12:05:37','2016-03-18 12:05:43','2016-03-18 17:08:01','00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (210,'25','JASMIN, GEORGINA S.','1','DUMAGUETE','2016-03-21','2016-03-21 08:57:10','2016-03-21 12:01:00','2016-03-21 12:03:38','2016-03-21 18:12:43','00','00','2016-04-20 15:36:57','',''),
 (211,'25','JASMIN, GEORGINA S.','1','DUMAGUETE','2016-03-23','2016-03-23 12:09:22','2016-03-23 12:09:28','2016-03-23 12:09:33',NULL,'00','00','2016-04-20 15:36:57','',''),
 (212,'25','JASMIN, GEORGINA S.','1','DUMAGUETE','2016-03-27','2016-03-27 09:42:33',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (213,'25','JASMIN, GEORGINA S.','1','DUMAGUETE','2016-03-28','2016-03-28 12:48:28','2016-03-28 12:48:34','2016-03-28 12:48:39','2016-03-28 17:02:20','00','00','2016-04-20 15:36:57','',''),
 (214,'25','JASMIN, GEORGINA S.','1','DUMAGUETE','2016-03-30','2016-03-30 12:05:22',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (215,'27','LARENA, JOEL S.','1','DUMAGUETE','2016-03-18','2016-03-18 08:20:42','2016-03-18 08:21:22','2016-03-18 08:21:29','2016-03-18 17:02:23','00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (216,'27','LARENA, JOEL S.','1','DUMAGUETE','2016-03-22','2016-03-22 07:46:45','2016-03-22 12:07:29','2016-03-22 12:08:29',NULL,'00','00','2016-04-20 15:36:57','',''),
 (217,'27','LARENA, JOEL S.','1','DUMAGUETE','2016-03-23','2016-03-23 06:24:18',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (218,'27','LARENA, JOEL S.','1','DUMAGUETE','2016-03-28','2016-03-28 07:44:35',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (219,'28','LOPEZ, LUCIL B.','1','DUMAGUETE','2016-03-18','2016-03-18 07:57:04','2016-03-18 22:59:14',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (220,'28','LOPEZ, LUCIL B.','1','DUMAGUETE','2016-03-19','2016-03-19 07:59:20','2016-03-19 20:00:35',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (221,'28','LOPEZ, LUCIL B.','1','DUMAGUETE','2016-03-20','2016-03-20 09:04:36','2016-03-20 18:27:20',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (222,'28','LOPEZ, LUCIL B.','1','DUMAGUETE','2016-03-21','2016-03-21 07:51:54','2016-03-21 12:53:18','2016-03-21 12:53:28','2016-03-21 17:17:42','00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (223,'28','LOPEZ, LUCIL B.','1','DUMAGUETE','2016-03-22','2016-03-22 07:52:34','2016-03-22 18:56:57',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (224,'28','LOPEZ, LUCIL B.','1','DUMAGUETE','2016-03-23','2016-03-23 07:41:41','2016-03-23 12:37:56','2016-03-23 12:38:01',NULL,'00','00','2016-04-20 15:36:57','',''),
 (225,'28','LOPEZ, LUCIL B.','1','DUMAGUETE','2016-03-28','2016-03-28 08:19:50','2016-03-28 12:28:54','2016-03-28 12:29:01',NULL,'00','00','2016-04-20 15:36:57','',''),
 (226,'28','LOPEZ, LUCIL B.','1','DUMAGUETE','2016-03-29','2016-03-29 08:20:31','2016-03-29 12:23:16','2016-03-29 12:23:22','2016-03-29 20:58:54','00','00','2016-04-20 15:36:57','',''),
 (227,'28','LOPEZ, LUCIL B.','1','DUMAGUETE','2016-03-30','2016-03-30 08:14:22','2016-03-30 17:24:29',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (228,'28','LOPEZ, LUCIL B.','1','DUMAGUETE','2016-03-31','2016-03-31 07:45:29','2016-03-31 18:23:49',NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (229,'29','MAGDALAN, EDELYN D.','1','DUMAGUETE','2016-03-17','2016-03-17 17:34:36',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (230,'29','MAGDALAN, EDELYN D.','1','DUMAGUETE','2016-03-18','2016-03-18 07:25:54','2016-03-18 11:17:17','2016-03-18 17:01:27',NULL,'00','00','2016-04-20 15:36:57','',''),
 (231,'29','MAGDALAN, EDELYN D.','1','DUMAGUETE','2016-03-19','2016-03-19 07:28:32',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (232,'29','MAGDALAN, EDELYN D.','1','DUMAGUETE','2016-03-21','2016-03-21 07:51:31','2016-03-21 12:40:55','2016-03-21 12:41:00','2016-03-21 17:06:06','00','00','2016-04-20 15:36:57','',''),
 (233,'29','MAGDALAN, EDELYN D.','1','DUMAGUETE','2016-03-22','2016-03-22 07:54:03','2016-03-22 17:13:25',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (234,'29','MAGDALAN, EDELYN D.','1','DUMAGUETE','2016-03-23','2016-03-23 07:38:49',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (235,'29','MAGDALAN, EDELYN D.','1','DUMAGUETE','2016-03-28','2016-03-28 07:41:55','2016-03-28 12:28:03','2016-03-28 12:28:07',NULL,'00','00','2016-04-20 15:36:57','',''),
 (236,'29','MAGDALAN, EDELYN D.','1','DUMAGUETE','2016-03-29','2016-03-29 17:01:44',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (237,'29','MAGDALAN, EDELYN D.','1','DUMAGUETE','2016-03-30','2016-03-30 07:48:39',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (238,'29','MAGDALAN, EDELYN D.','1','DUMAGUETE','2016-03-31','2016-03-31 07:24:13',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (239,'30','MANLAPAZ, JOSE FERNANDO G.','1','DUMAGUETE','2016-03-18','2016-03-18 08:53:02','2016-03-18 08:53:22','2016-03-18 08:53:28','2016-03-18 08:53:34','00','00','2016-04-20 15:36:57','',''),
 (240,'31','MANTOS, JADE S.','1','DUMAGUETE','2016-03-21','2016-03-21 17:05:52','2016-03-21 22:45:06',NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (241,'31','MANTOS, JADE S.','1','DUMAGUETE','2016-03-22','2016-03-22 07:05:01',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (242,'31','MANTOS, JADE S.','1','DUMAGUETE','2016-03-24','2016-03-24 14:39:36',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (243,'31','MANTOS, JADE S.','1','DUMAGUETE','2016-03-26','2016-03-26 06:47:06','2016-03-26 15:10:46',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (244,'31','MANTOS, JADE S.','1','DUMAGUETE','2016-03-29','2016-03-29 14:39:55','2016-03-29 23:00:54',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (245,'33','MITMIT, HUBERT P.','1','DUMAGUETE','2016-03-18','2016-03-18 09:28:46','2016-03-18 17:08:20',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (246,'33','MITMIT, HUBERT P.','1','DUMAGUETE','2016-03-31','2016-03-31 07:42:21','2016-03-31 17:59:32',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (247,'34','OPINION, NILETO A.','1','DUMAGUETE','2016-03-18','2016-03-18 11:02:12','2016-03-18 15:36:48',NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (248,'34','OPINION, NILETO A.','1','DUMAGUETE','2016-03-19','2016-03-19 14:40:24','2016-03-19 23:10:48',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (249,'34','OPINION, NILETO A.','1','DUMAGUETE','2016-03-21','2016-03-21 21:48:20',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (250,'34','OPINION, NILETO A.','1','DUMAGUETE','2016-03-22','2016-03-22 07:07:15','2016-03-22 22:45:03',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (251,'34','OPINION, NILETO A.','1','DUMAGUETE','2016-03-23','2016-03-23 07:19:40','2016-03-23 14:49:17','2016-03-23 23:34:56',NULL,'00','00','2016-04-20 15:36:57','',''),
 (252,'34','OPINION, NILETO A.','1','DUMAGUETE','2016-03-24','2016-03-24 06:45:07','2016-03-24 15:14:17',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (253,'34','OPINION, NILETO A.','1','DUMAGUETE','2016-03-25','2016-03-25 06:46:07','2016-03-25 15:15:30',NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (254,'34','OPINION, NILETO A.','1','DUMAGUETE','2016-03-26','2016-03-26 14:43:41','2016-03-26 23:12:27',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (255,'34','OPINION, NILETO A.','1','DUMAGUETE','2016-03-27','2016-03-27 06:41:41','2016-03-27 06:41:46','2016-03-27 15:30:44',NULL,'00','00','2016-04-20 15:36:57','',''),
 (256,'34','OPINION, NILETO A.','1','DUMAGUETE','2016-03-28','2016-03-28 06:52:17','2016-03-28 15:27:19',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (257,'34','OPINION, NILETO A.','1','DUMAGUETE','2016-03-29','2016-03-29 22:36:58',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (258,'34','OPINION, NILETO A.','1','DUMAGUETE','2016-03-30','2016-03-30 07:24:47','2016-03-30 14:39:47','2016-03-30 23:17:09',NULL,'00','00','2016-04-20 15:36:57','',''),
 (259,'34','OPINION, NILETO A.','1','DUMAGUETE','2016-03-31','2016-03-31 06:41:45','2016-03-31 06:41:55','2016-03-31 16:43:34',NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (260,'35','QUIAMCO, KAREN S.','1','DUMAGUETE','2016-03-21','2016-03-21 16:15:01','2016-03-21 16:15:25',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (261,'35','QUIAMCO, KAREN S.','1','DUMAGUETE','2016-03-28','2016-03-28 22:56:20',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (262,'35','QUIAMCO, KAREN S.','1','DUMAGUETE','2016-03-29','2016-03-29 07:22:13',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (263,'36','PERATER, ARLAN C.','1','DUMAGUETE','2016-03-22','2016-03-22 16:47:31',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (264,'36','PERATER, ARLAN C.','1','DUMAGUETE','2016-03-23','2016-03-23 17:26:36',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (265,'36','PERATER, ARLAN C.','1','DUMAGUETE','2016-03-30','2016-03-30 06:54:32',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (266,'37','RAMIREZ, JANICE P.','1','DUMAGUETE','2016-03-21','2016-03-21 15:56:47',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (267,'37','RAMIREZ, JANICE P.','1','DUMAGUETE','2016-03-22','2016-03-22 07:53:46',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (268,'37','RAMIREZ, JANICE P.','1','DUMAGUETE','2016-03-31','2016-03-31 08:23:54','2016-03-31 08:24:05',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (269,'38','SIBALA, FLORENCIO B.','1','DUMAGUETE','2016-03-21','2016-03-21 16:55:12','2016-03-21 17:08:01','2016-03-21 17:08:57','2016-03-21 17:09:25','00','00','2016-04-20 15:36:57','',''),
 (270,'38','SIBALA, FLORENCIO B.','1','DUMAGUETE','2016-03-22','2016-03-22 12:12:43',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (271,'38','SIBALA, FLORENCIO B.','1','DUMAGUETE','2016-03-31','2016-03-31 08:46:29','2016-03-31 12:07:19','2016-03-31 12:07:25','2016-03-31 17:06:50','00','00','2016-04-20 15:36:57','',''),
 (272,'39','SORILA, KING HEINRICH B.','1','DUMAGUETE','2016-03-22','2016-03-22 14:36:20','2016-03-22 15:10:22',NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (273,'40','SYTAYCO, CLARICE M.','1','DUMAGUETE','2016-03-17','2016-03-17 17:47:32',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (274,'40','SYTAYCO, CLARICE M.','1','DUMAGUETE','2016-03-18','2016-03-18 08:01:16','2016-03-18 12:08:33','2016-03-18 12:08:39','2016-03-18 17:08:55','00','00','2016-04-20 15:36:57','',''),
 (275,'40','SYTAYCO, CLARICE M.','1','DUMAGUETE','2016-03-21','2016-03-21 07:56:44','2016-03-21 12:52:21','2016-03-21 12:52:27','2016-03-21 17:27:38','00','00','2016-04-20 15:36:57','',''),
 (276,'40','SYTAYCO, CLARICE M.','1','DUMAGUETE','2016-03-22','2016-03-22 07:53:59','2016-03-22 12:17:01','2016-03-22 12:17:07','2016-03-22 17:13:05','00','00','2016-04-20 15:36:57','',''),
 (277,'40','SYTAYCO, CLARICE M.','1','DUMAGUETE','2016-03-23','2016-03-23 08:23:41','2016-03-23 12:52:47',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (278,'40','SYTAYCO, CLARICE M.','1','DUMAGUETE','2016-03-31','2016-03-31 08:23:36','2016-03-31 12:15:35','2016-03-31 12:15:41','2016-03-31 17:12:28','00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (279,'41','TIZO, EDMUND L.','1','DUMAGUETE','2016-03-17','2016-03-17 17:36:59',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (280,'41','TIZO, EDMUND L.','1','DUMAGUETE','2016-03-18','2016-03-18 08:42:01','2016-03-18 12:19:03','2016-03-18 12:19:11',NULL,'00','00','2016-04-20 15:36:57','',''),
 (281,'41','TIZO, EDMUND L.','1','DUMAGUETE','2016-03-19','2016-03-19 08:06:28','2016-03-19 17:02:53',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (282,'41','TIZO, EDMUND L.','1','DUMAGUETE','2016-03-21','2016-03-21 08:11:40','2016-03-21 12:16:58','2016-03-21 12:17:19','2016-03-21 17:00:57','00','00','2016-04-20 15:36:57','',''),
 (283,'41','TIZO, EDMUND L.','1','DUMAGUETE','2016-03-22','2016-03-22 07:29:59','2016-03-22 12:14:36','2016-03-22 12:14:52','2016-03-22 17:02:08','00','00','2016-04-20 15:36:57','',''),
 (284,'41','TIZO, EDMUND L.','1','DUMAGUETE','2016-03-23','2016-03-23 07:27:37','2016-03-23 14:57:07',NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (285,'41','TIZO, EDMUND L.','1','DUMAGUETE','2016-03-24','2016-03-24 07:46:18','2016-03-24 17:06:05',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (286,'41','TIZO, EDMUND L.','1','DUMAGUETE','2016-03-25','2016-03-25 07:21:01','2016-03-25 17:07:13',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (287,'41','TIZO, EDMUND L.','1','DUMAGUETE','2016-03-26','2016-03-26 07:48:47','2016-03-26 13:16:19',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (288,'41','TIZO, EDMUND L.','1','DUMAGUETE','2016-03-28','2016-03-28 07:19:15','2016-03-28 11:58:07','2016-03-28 11:58:13','2016-03-28 16:54:23','00','00','2016-04-20 15:36:57','',''),
 (289,'41','TIZO, EDMUND L.','1','DUMAGUETE','2016-03-29','2016-03-29 07:23:45','2016-03-29 12:37:26','2016-03-29 12:37:34','2016-03-29 17:00:29','00','00','2016-04-20 15:36:57','',''),
 (290,'41','TIZO, EDMUND L.','1','DUMAGUETE','2016-03-30','2016-03-30 07:16:18','2016-03-30 12:45:27','2016-03-30 12:45:38','2016-03-30 17:00:04','00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (291,'41','TIZO, EDMUND L.','1','DUMAGUETE','2016-03-31','2016-03-31 07:45:35','2016-03-31 12:41:46','2016-03-31 12:41:51','2016-03-31 17:01:34','00','00','2016-04-20 15:36:57','',''),
 (292,'42','TOLIN, MR. RIZZA T.','1','DUMAGUETE','2016-03-18','2016-03-18 08:29:05','2016-03-18 12:03:48','2016-03-18 12:04:22','2016-03-18 17:13:06','00','00','2016-04-20 15:36:57','',''),
 (293,'42','TOLIN, MR. RIZZA T.','1','DUMAGUETE','2016-03-21','2016-03-21 07:56:09','2016-03-21 12:01:46','2016-03-21 17:10:07',NULL,'00','00','2016-04-20 15:36:57','',''),
 (294,'42','TOLIN, MR. RIZZA T.','1','DUMAGUETE','2016-03-22','2016-03-22 08:13:42','2016-03-22 12:06:13','2016-03-22 17:13:17',NULL,'00','00','2016-04-20 15:36:57','',''),
 (295,'42','TOLIN, MR. RIZZA T.','1','DUMAGUETE','2016-03-23','2016-03-23 08:18:44','2016-03-23 12:08:23',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (296,'42','TOLIN, MR. RIZZA T.','1','DUMAGUETE','2016-03-28','2016-03-28 07:42:49','2016-03-28 12:10:54','2016-03-28 12:10:56','2016-03-28 17:05:55','00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (297,'42','TOLIN, MR. RIZZA T.','1','DUMAGUETE','2016-03-29','2016-03-29 08:11:28','2016-03-29 12:01:54','2016-03-29 12:01:58','2016-03-29 17:19:41','00','00','2016-04-20 15:36:57','',''),
 (298,'42','TOLIN, MR. RIZZA T.','1','DUMAGUETE','2016-03-30','2016-03-30 08:14:28','2016-03-30 12:00:04','2016-03-30 12:00:07','2016-03-30 17:15:38','00','00','2016-04-20 15:36:57','',''),
 (299,'42','TOLIN, MR. RIZZA T.','1','DUMAGUETE','2016-03-31','2016-03-31 08:19:10','2016-03-31 12:15:50','2016-03-31 12:15:54',NULL,'00','00','2016-04-20 15:36:57','',''),
 (300,'43','TOLIN, RHODORA C.','1','DUMAGUETE','2016-03-18','2016-03-18 08:24:49','2016-03-18 20:16:40',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (301,'43','TOLIN, RHODORA C.','1','DUMAGUETE','2016-03-21','2016-03-21 07:59:25','2016-03-21 17:17:49',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (302,'43','TOLIN, RHODORA C.','1','DUMAGUETE','2016-03-22','2016-03-22 08:22:01','2016-03-22 17:58:00',NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (303,'43','TOLIN, RHODORA C.','1','DUMAGUETE','2016-03-23','2016-03-23 07:47:03','2016-03-23 12:21:59','2016-03-23 12:22:05','2016-03-23 14:44:10','00','00','2016-04-20 15:36:57','',''),
 (304,'43','TOLIN, RHODORA C.','1','DUMAGUETE','2016-03-24','2016-03-24 08:26:41','2016-03-24 17:00:30',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (305,'43','TOLIN, RHODORA C.','1','DUMAGUETE','2016-03-26','2016-03-26 14:45:45',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (306,'43','TOLIN, RHODORA C.','1','DUMAGUETE','2016-03-28','2016-03-28 07:54:25','2016-03-28 12:40:41','2016-03-28 12:40:49','2016-03-28 17:31:49','00','00','2016-04-20 15:36:57','',''),
 (307,'43','TOLIN, RHODORA C.','1','DUMAGUETE','2016-03-30','2016-03-30 05:34:14','2016-03-30 12:23:53','2016-03-30 12:23:57',NULL,'00','00','2016-04-20 15:36:57','',''),
 (308,'45','VILLAHERMOSA, AL VICENTE P.','1','DUMAGUETE','2016-03-17','2016-03-17 17:45:58',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (309,'45','VILLAHERMOSA, AL VICENTE P.','1','DUMAGUETE','2016-03-23','2016-03-23 17:26:48','2016-03-23 17:26:53',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (310,'45','VILLAHERMOSA, AL VICENTE P.','1','DUMAGUETE','2016-03-29','2016-03-29 12:22:22','2016-03-29 12:22:37','2016-03-29 17:20:26',NULL,'00','00','2016-04-20 15:36:57','',''),
 (311,'45','VILLAHERMOSA, AL VICENTE P.','1','DUMAGUETE','2016-03-31','2016-03-31 12:06:15','2016-03-31 12:06:29','2016-03-31 17:14:24',NULL,'00','00','2016-04-20 15:36:57','',''),
 (312,'46','VILLALON, MICHAEL C.','1','DUMAGUETE','2016-03-17','2016-03-17 18:13:09','2016-03-17 18:13:16',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (313,'46','VILLALON, MICHAEL C.','1','DUMAGUETE','2016-03-18','2016-03-18 12:05:15','2016-03-18 12:05:27',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (314,'46','VILLALON, MICHAEL C.','1','DUMAGUETE','2016-03-22','2016-03-22 08:21:55','2016-03-22 12:07:45','2016-03-22 12:07:50',NULL,'00','00','2016-04-20 15:36:57','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (315,'46','VILLALON, MICHAEL C.','1','DUMAGUETE','2016-03-23','2016-03-23 12:23:07','2016-03-23 12:23:11',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (316,'46','VILLALON, MICHAEL C.','1','DUMAGUETE','2016-03-24','2016-03-24 10:20:58',NULL,NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (317,'46','VILLALON, MICHAEL C.','1','DUMAGUETE','2016-03-28','2016-03-28 07:53:18','2016-03-28 12:14:19','2016-03-28 12:14:23',NULL,'00','00','2016-04-20 15:36:57','',''),
 (318,'46','VILLALON, MICHAEL C.','1','DUMAGUETE','2016-03-31','2016-03-31 12:40:40','2016-03-31 12:40:45',NULL,NULL,'00','00','2016-04-20 15:36:57','',''),
 (320,'1','JUCOM, SUESA O.','1','DUMAGUETE','2016-04-04','2016-04-04 07:33:12',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (321,'2','ABADINAS, DOREEN MARIE L.','1','DUMAGUETE','2016-04-01','2016-04-01 08:07:59','2016-04-01 12:04:08','2016-04-01 12:04:13','2016-04-01 23:38:42','00','00','2016-04-25 16:19:33','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (322,'2','ABADINAS, DOREEN MARIE L.','1','DUMAGUETE','2016-04-04','2016-04-04 08:08:01',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (323,'3','AGUILAR, VIRGINIA S.','1','DUMAGUETE','2016-04-01','2016-04-01 07:28:54','2016-04-01 12:49:33','2016-04-01 12:49:39','2016-04-01 17:01:27','00','00','2016-04-25 16:19:33','',''),
 (324,'3','AGUILAR, VIRGINIA S.','1','DUMAGUETE','2016-04-02','2016-04-02 07:41:40','2016-04-02 16:32:18',NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (325,'3','AGUILAR, VIRGINIA S.','1','DUMAGUETE','2016-04-04','2016-04-04 07:49:14',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (326,'4','ALDANESE, DORIS AJNE B.','1','DUMAGUETE','2016-04-01','2016-04-01 11:24:55',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (327,'4','ALDANESE, DORIS AJNE B.','1','DUMAGUETE','2016-04-04','2016-04-04 07:47:28',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (328,'5','ALFARAZ, TONI LEON B.','1','DUMAGUETE','2016-04-01','2016-04-01 08:07:16','2016-04-01 12:46:17','2016-04-01 12:46:22',NULL,'00','00','2016-04-25 16:19:33','',''),
 (329,'5','ALFARAZ, TONI LEON B.','1','DUMAGUETE','2016-04-04','2016-04-04 07:19:24',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (330,'6','AMORES, ROLANDO C.','1','DUMAGUETE','2016-04-01','2016-04-01 15:13:38','2016-04-01 17:01:40',NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (331,'6','AMORES, ROLANDO C.','1','DUMAGUETE','2016-04-04','2016-04-04 07:37:52','2016-04-04 07:37:57','2016-04-04 07:38:07',NULL,'00','00','2016-04-25 16:19:33','',''),
 (332,'7','ANFONE, MICHELENE G.','1','DUMAGUETE','2016-04-01','2016-04-01 08:34:46','2016-04-01 17:37:56',NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (333,'7','ANFONE, MICHELENE G.','1','DUMAGUETE','2016-04-02','2016-04-02 17:17:17',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (334,'7','ANFONE, MICHELENE G.','1','DUMAGUETE','2016-04-04','2016-04-04 07:50:33',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (335,'8','ARAGONES, GREGORIO JR. O.','1','DUMAGUETE','2016-04-01','2016-04-01 15:15:00',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (336,'8','ARAGONES, GREGORIO JR. O.','1','DUMAGUETE','2016-04-04','2016-04-04 07:50:16',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (337,'10','ARANAS, FRANCISCO B.','1','DUMAGUETE','2016-04-01','2016-04-01 15:11:48','2016-04-01 18:48:41',NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (338,'10','ARANAS, FRANCISCO B.','1','DUMAGUETE','2016-04-04','2016-04-04 06:15:21',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (339,'11','ARANAS, JULITO M.','1','DUMAGUETE','2016-04-01','2016-04-01 08:16:55','2016-04-01 12:03:45','2016-04-01 12:03:53','2016-04-01 17:18:16','00','00','2016-04-25 16:19:33','',''),
 (340,'11','ARANAS, JULITO M.','1','DUMAGUETE','2016-04-04','2016-04-04 07:41:04',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (341,'12','ARANAS, RUEL V.','1','DUMAGUETE','2016-04-01','2016-04-01 14:44:49','2016-04-01 23:25:04',NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (342,'12','ARANAS, RUEL V.','1','DUMAGUETE','2016-04-02','2016-04-02 06:37:08','2016-04-02 15:46:05',NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (343,'13','ARANAS, VICENTA B.','1','DUMAGUETE','2016-04-01','2016-04-01 08:00:02','2016-04-01 18:48:46',NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (344,'13','ARANAS, VICENTA B.','1','DUMAGUETE','2016-04-04','2016-04-04 07:47:22',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (345,'15','BAGA, JULIAN S.','1','DUMAGUETE','2016-04-01','2016-04-01 07:45:23','2016-04-01 17:02:13',NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (346,'15','BAGA, JULIAN S.','1','DUMAGUETE','2016-04-04','2016-04-04 07:47:42',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (347,'16','BOHOLANO, JANET C.','1','DUMAGUETE','2016-04-01','2016-04-01 08:08:32','2016-04-01 18:50:21',NULL,NULL,'00','00','2016-04-25 16:19:33','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (348,'16','BOHOLANO, JANET C.','1','DUMAGUETE','2016-04-04','2016-04-04 07:47:57',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (349,'17','CALINGACION, PONCIANO JR. A.','1','DUMAGUETE','2016-04-01','2016-04-01 08:12:03','2016-04-01 17:12:06',NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (350,'17','CALINGACION, PONCIANO JR. A.','1','DUMAGUETE','2016-04-04','2016-04-04 06:50:37',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (351,'18','CARAMAT, ROLANDO Y.','1','DUMAGUETE','2016-04-01','2016-04-01 07:32:42','2016-04-01 17:05:17',NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (352,'18','CARAMAT, ROLANDO Y.','1','DUMAGUETE','2016-04-02','2016-04-02 06:38:41','2016-04-02 15:01:28',NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (353,'19','CASIPONG, DEOGRACIAS JR. V.','1','DUMAGUETE','2016-04-01','2016-04-01 07:41:46','2016-04-01 17:02:11',NULL,NULL,'00','00','2016-04-25 16:19:33','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (354,'19','CASIPONG, DEOGRACIAS JR. V.','1','DUMAGUETE','2016-04-04','2016-04-04 07:34:09',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (355,'20','CATALAN, CENANDO A.','1','DUMAGUETE','2016-04-01','2016-04-01 08:02:10','2016-04-01 12:17:23','2016-04-01 12:17:33','2016-04-01 18:16:33','00','00','2016-04-25 16:19:33','',''),
 (356,'20','CATALAN, CENANDO A.','1','DUMAGUETE','2016-04-04','2016-04-04 07:41:48',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (357,'22','CORNELIA, GEMELO JR. S.','1','DUMAGUETE','2016-04-01','2016-04-01 07:00:19','2016-04-01 16:52:35',NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (358,'23','ENTEA, RUEL C.','1','DUMAGUETE','2016-04-01','2016-04-01 07:41:17','2016-04-01 12:20:46','2016-04-01 12:20:57','2016-04-01 18:02:53','00','00','2016-04-25 16:19:33','',''),
 (359,'23','ENTEA, RUEL C.','1','DUMAGUETE','2016-04-02','2016-04-02 09:04:11','2016-04-02 17:15:20',NULL,NULL,'00','00','2016-04-25 16:19:33','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (360,'23','ENTEA, RUEL C.','1','DUMAGUETE','2016-04-04','2016-04-04 07:31:59',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (361,'24','GARANGAY, SARAH MA. R.','1','DUMAGUETE','2016-04-01','2016-04-01 07:02:22','2016-04-01 17:05:50',NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (362,'24','GARANGAY, SARAH MA. R.','1','DUMAGUETE','2016-04-03','2016-04-03 21:33:38',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (363,'24','GARANGAY, SARAH MA. R.','1','DUMAGUETE','2016-04-04','2016-04-04 07:22:23',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (364,'25','JASMIN, GEORGINA S.','1','DUMAGUETE','2016-04-01','2016-04-01 09:20:28','2016-04-01 12:26:09','2016-04-01 17:01:55',NULL,'00','00','2016-04-25 16:19:33','',''),
 (365,'25','JASMIN, GEORGINA S.','1','DUMAGUETE','2016-04-02','2016-04-02 17:17:35','2016-04-02 17:17:43',NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (366,'25','JASMIN, GEORGINA S.','1','DUMAGUETE','2016-04-03','2016-04-03 13:18:15',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (367,'27','LARENA, JOEL S.','1','DUMAGUETE','2016-04-04','2016-04-04 07:31:55',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (368,'28','LOPEZ, LUCIL B.','1','DUMAGUETE','2016-04-01','2016-04-01 08:07:48','2016-04-01 17:31:25',NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (369,'28','LOPEZ, LUCIL B.','1','DUMAGUETE','2016-04-04','2016-04-04 07:33:17',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (370,'29','MAGDALAN, EDELYN D.','1','DUMAGUETE','2016-04-01','2016-04-01 05:39:03','2016-04-01 12:58:57','2016-04-01 12:59:02',NULL,'00','00','2016-04-25 16:19:33','',''),
 (371,'29','MAGDALAN, EDELYN D.','1','DUMAGUETE','2016-04-04','2016-04-04 07:47:32',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (372,'31','MANTOS, JADE S.','1','DUMAGUETE','2016-04-01','2016-04-01 06:48:20','2016-04-01 15:38:49',NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (373,'33','MITMIT, HUBERT P.','1','DUMAGUETE','2016-04-01','2016-04-01 07:26:38','2016-04-01 17:16:54',NULL,NULL,'00','00','2016-04-25 16:19:33','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (374,'33','MITMIT, HUBERT P.','1','DUMAGUETE','2016-04-04','2016-04-04 07:42:16',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (375,'34','OPINION, NILETO A.','1','DUMAGUETE','2016-04-01','2016-04-01 06:47:55',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (376,'34','OPINION, NILETO A.','1','DUMAGUETE','2016-04-02','2016-04-02 06:41:28','2016-04-02 15:10:20',NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (377,'38','SIBALA, FLORENCIO B.','1','DUMAGUETE','2016-04-01','2016-04-01 17:02:03',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (378,'38','SIBALA, FLORENCIO B.','1','DUMAGUETE','2016-04-04','2016-04-04 07:43:44',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (379,'39','SORILA, KING HEINRICH B.','1','DUMAGUETE','2016-04-02','2016-04-02 07:13:17','2016-04-02 13:59:56','2016-04-02 23:05:53',NULL,'00','00','2016-04-25 16:19:33','',''),
 (380,'39','SORILA, KING HEINRICH B.','1','DUMAGUETE','2016-04-03','2016-04-03 23:11:05',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (381,'39','SORILA, KING HEINRICH B.','1','DUMAGUETE','2016-04-04','2016-04-04 06:40:36',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (382,'40','SYTAYCO, CLARICE M.','1','DUMAGUETE','2016-04-01','2016-04-01 08:00:22','2016-04-01 12:48:26','2016-04-01 12:48:32','2016-04-01 18:08:17','00','00','2016-04-25 16:19:33','',''),
 (383,'40','SYTAYCO, CLARICE M.','1','DUMAGUETE','2016-04-04','2016-04-04 08:08:17',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (384,'41','TIZO, EDMUND L.','1','DUMAGUETE','2016-04-01','2016-04-01 07:24:46','2016-04-01 12:38:50','2016-04-01 12:39:00','2016-04-01 17:01:17','00','00','2016-04-25 16:19:33','',''),
 (385,'41','TIZO, EDMUND L.','1','DUMAGUETE','2016-04-02','2016-04-02 07:37:56','2016-04-02 17:00:20',NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (386,'41','TIZO, EDMUND L.','1','DUMAGUETE','2016-04-04','2016-04-04 07:31:08',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (387,'42','TOLIN, MR. RIZZA T.','1','DUMAGUETE','2016-04-01','2016-04-01 08:23:33','2016-04-01 12:58:47','2016-04-01 12:58:50','2016-04-01 17:49:00','00','00','2016-04-25 16:19:33','',''),
 (388,'42','TOLIN, MR. RIZZA T.','1','DUMAGUETE','2016-04-04','2016-04-04 07:42:55',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (389,'43','TOLIN, RHODORA C.','1','DUMAGUETE','2016-04-04','2016-04-04 07:39:52',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','',''),
 (390,'44','VALENZUELA, RUFINO D.','1','DUMAGUETE','2016-04-01','2016-04-01 09:19:40','2016-04-01 12:56:46','2016-04-01 17:02:20',NULL,'00','00','2016-04-25 16:19:33','',''),
 (391,'44','VALENZUELA, RUFINO D.','1','DUMAGUETE','2016-04-03','2016-04-03 06:35:30','2016-04-03 12:08:04','2016-04-03 12:08:11','2016-04-03 17:06:58','00','00','2016-04-25 16:19:33','',''),
 (392,'44','VALENZUELA, RUFINO D.','1','DUMAGUETE','2016-04-04','2016-04-04 06:15:58',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','','');
INSERT INTO `dtrs` (`id`,`employee_id`,`employee_name`,`department_id`,`department_name`,`dtr_date`,`am_arrival`,`am_departure`,`pm_arrival`,`pm_departure`,`undertime_hours`,`undertime_minutes`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (393,'46','VILLALON, MICHAEL C.','1','DUMAGUETE','2016-04-01','2016-04-01 12:37:19','2016-04-01 12:37:23','2016-04-01 01:05:05',NULL,'01','05','2016-04-25 16:19:33','',''),
 (394,'46','VILLALON, MICHAEL C.','1','DUMAGUETE','2016-04-04','2016-04-04 07:49:21',NULL,'2016-04-04 01:00:00',NULL,'00','00','2016-04-25 16:19:33','',''),
 (395,'46','VILLALON, MICHAEL C.','1','DUMAGUETE','2016-04-26','2016-04-26 07:49:21',NULL,NULL,NULL,'00','00','2016-04-25 16:19:33','','');
/*!40000 ALTER TABLE `dtrs` ENABLE KEYS */;


--
-- Definition of table `employees`
--

DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` varchar(255) DEFAULT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `mi` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `contact_no` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `department_id` varchar(255) DEFAULT NULL,
  `date_added` datetime DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `user_screen_name` varchar(255) DEFAULT NULL,
  `shift` varchar(255) DEFAULT NULL,
  `shift_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employees`
--

/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` (`id`,`employee_id`,`fname`,`mi`,`lname`,`contact_no`,`address`,`department`,`department_id`,`date_added`,`user_id`,`user_screen_name`,`shift`,`shift_id`) VALUES 
 (1,'0046-1996','SUESA','O.','JUCOM','','','DUMAGUETE','1','2016-04-15 10:50:29','','','Shift 2','1'),
 (2,'0051-2010','DOREEN MARIE','L.','ABADINAS','','','DUMAGUETE','1','2016-04-15 10:50:51','','','Regular','0'),
 (3,'0506-1977','VIRGINIA','S.','AGUILAR','','','DUMAGUETE','1','2016-04-15 11:29:37','','','Regular','0'),
 (4,'','DORIS AJNE','B.','ALDANESE','','','DUMAGUETE','1','2016-04-15 11:30:00','','','Regular','0'),
 (5,'0023-2009','TONI LEON','B.','ALFARAZ','','','DUMAGUETE','1','2016-04-15 11:30:35','','','Regular','0'),
 (6,'0022-2003','ROLANDO','C.','AMORES','','','DUMAGUETE','1','2016-04-15 11:31:09','','','Regular','0'),
 (7,'0508-1977','MICHELENE','G.','ANFONE','','','DUMAGUETE','1','2016-04-15 11:31:56','','','Regular','0'),
 (8,'0108-2003','GREGORIO JR.','O.','ARAGONES','','','DUMAGUETE','1','2016-04-15 11:32:49','','','Regular','0'),
 (9,'0065-2010','JANICE','A.','ARAGONES','','','DUMAGUETE','1','2016-04-15 11:33:14','','','Regular','0');
INSERT INTO `employees` (`id`,`employee_id`,`fname`,`mi`,`lname`,`contact_no`,`address`,`department`,`department_id`,`date_added`,`user_id`,`user_screen_name`,`shift`,`shift_id`) VALUES 
 (10,'0050-1996','FRANCISCO','B.','ARANAS','','','DUMAGUETE','1','2016-04-15 11:33:55','','','Regular','0'),
 (11,'0059-1988','JULITO','M.','ARANAS','','','DUMAGUETE','1','2016-04-15 11:34:20','','','Regular','0'),
 (12,'','RUEL','V.','ARANAS','','','DUMAGUETE','1','2016-04-15 11:34:33','','','Regular','0'),
 (13,'0167-2002','VICENTA','B.','ARANAS','','','DUMAGUETE','1','2016-04-15 11:35:09','','','Regular','0'),
 (14,'','JENLYN','M.','ARANASA','','','DUMAGUETE','1','2016-04-15 11:35:55','','','Regular','0'),
 (15,'0218-1978','JULIAN','S.','BAGA','','','DUMAGUETE','1','2016-04-15 11:36:23','','','Regular','0'),
 (16,'0021-1997','JANET','C.','BOHOLANO','','','DUMAGUETE','1','2016-04-15 11:37:35','','','Regular','0'),
 (17,'0731-1997','PONCIANO JR.','A.','CALINGACION','','','DUMAGUETE','1','2016-04-15 11:38:12','','','Regular','0'),
 (18,'0535-1977','ROLANDO','Y.','CARAMAT','','','DUMAGUETE','1','2016-04-15 11:38:40','','','Regular','0');
INSERT INTO `employees` (`id`,`employee_id`,`fname`,`mi`,`lname`,`contact_no`,`address`,`department`,`department_id`,`date_added`,`user_id`,`user_screen_name`,`shift`,`shift_id`) VALUES 
 (19,'0102-1978','DEOGRACIAS JR.','V.','CASIPONG','','','DUMAGUETE','1','2016-04-15 11:41:39','','','Regular','0'),
 (20,'0055-1981','CENANDO','A.','CATALAN','','','DUMAGUETE','1','2016-04-15 11:41:58','','','Regular','0'),
 (21,'','VENERANDO JR.','S.','CERBITO','','','DUMAGUETE','1','2016-04-15 11:42:20','','','Regular','0'),
 (22,'','GEMELO JR.','S.','CORNELIA','','','DUMAGUETE','1','2016-04-15 11:42:39','','','Regular','0'),
 (23,'','RUEL','C.','ENTEA','','','DUMAGUETE','1','2016-04-15 11:42:52','','','Regular','0'),
 (24,'0083-2000','SARAH MA.','R.','GARANGAY','','','DUMAGUETE','1','2016-04-15 11:43:32','','','Regular','0'),
 (25,'0047-1997','GEORGINA','S.','JASMIN','','','DUMAGUETE','1','2016-04-15 11:43:59','','','Regular','0'),
 (26,'0035-1987','ILUMINADO','F.','JOMUAD','','','DUMAGUETE','1','2016-04-15 11:44:25','','','Regular','0'),
 (27,'0240-2002','JOEL','S.','LARENA','','','DUMAGUETE','1','2016-04-15 11:44:42','','','Regular','0');
INSERT INTO `employees` (`id`,`employee_id`,`fname`,`mi`,`lname`,`contact_no`,`address`,`department`,`department_id`,`date_added`,`user_id`,`user_screen_name`,`shift`,`shift_id`) VALUES 
 (28,'0018-1996','LUCIL','B.','LOPEZ','','','DUMAGUETE','1','2016-04-15 11:45:04','','','Regular','0'),
 (29,'0066-2010','EDELYN','D.','MAGDALAN','','','DUMAGUETE','1','2016-04-15 11:45:26','','','Regular','0'),
 (30,'0166-2002','JOSE FERNANDO','G.','MANLAPAZ','','','DUMAGUETE','1','2016-04-15 11:45:59','','','Regular','0'),
 (31,'','JADE','S.','MANTOS','','','DUMAGUETE','1','2016-04-15 11:46:13','','','Regular','0'),
 (32,'0116-1991','MICHAEL','C.','MATE','','','DUMAGUETE','1','2016-04-15 11:46:33','','','Regular','0'),
 (33,'0043-2010','HUBERT','P.','MITMIT','','','DUMAGUETE','1','2016-04-15 11:46:52','','','Regular','0'),
 (34,'0078-1991','NILETO','A.','OPINION','','','DUMAGUETE','1','2016-04-15 11:47:10','','','Regular','0'),
 (35,'0241-2002','KAREN','S.','QUIAMCO','','','DUMAGUETE','1','2016-04-15 11:47:47','','','Regular','0'),
 (36,'0168-2002','ARLAN','C.','PERATER','','','DUMAGUETE','1','2016-04-15 11:47:30','','','Regular','0');
INSERT INTO `employees` (`id`,`employee_id`,`fname`,`mi`,`lname`,`contact_no`,`address`,`department`,`department_id`,`date_added`,`user_id`,`user_screen_name`,`shift`,`shift_id`) VALUES 
 (37,'','JANICE','P.','RAMIREZ','','','DUMAGUETE','1','2016-04-15 11:48:00','','','Regular','0'),
 (38,'0105-2004','FLORENCIO','B.','SIBALA','','','DUMAGUETE','1','2016-04-15 11:48:17','','','Regular','0'),
 (39,'','KING HEINRICH','B.','SORILA','','','DUMAGUETE','1','2016-04-15 11:48:32','','','Regular','0'),
 (40,'','CLARICE','M.','SYTAYCO','','','DUMAGUETE','1','2016-04-15 11:48:48','','','Regular','0'),
 (41,'0076-1991','EDMUND','L.','TIZO','','','DUMAGUETE','1','2016-04-15 11:49:07','','','Regular','0'),
 (42,'0031-1995','MR. RIZZA','T.','TOLIN','','','DUMAGUETE','1','2016-04-15 11:49:35','','','Regular','0'),
 (43,'0008-2003','RHODORA','C.','TOLIN','','','DUMAGUETE','1','2016-04-15 11:50:22','','','Regular','0'),
 (44,'0382-1977','RUFINO','D.','VALENZUELA','','','DUMAGUETE','1','2016-04-15 11:51:01','','','Regular','0'),
 (45,'0605-1977','AL VICENTE','P.','VILLAHERMOSA','','','DUMAGUETE','1','2016-04-15 11:51:19','','','Regular','0');
INSERT INTO `employees` (`id`,`employee_id`,`fname`,`mi`,`lname`,`contact_no`,`address`,`department`,`department_id`,`date_added`,`user_id`,`user_screen_name`,`shift`,`shift_id`) VALUES 
 (46,'0067-2010','MICHAEL','C.','VILLALON','','','DUMAGUETE','1','2016-04-15 11:51:43','','','Shift 2','1'),
 (59,'0496-1977','ELEAZAR','D.','CALINGACION','','','TANDAYAG','2','2016-04-15 11:52:02','','','Regular','0'),
 (60,'0021-19953','RICHARD','V.','QUIAMCO','','','TANDAYAG','2','2016-04-15 11:52:16','','','Regular','0'),
 (61,'0067-2010','ALAIN \"NN\"','N.','VILLAHERMOSA','','','TANDAYAG','2','2016-04-15 11:52:32','','','Regular','0'),
 (62,'0022-2009','MARY CHERYL','M.','BARTE','','','LARENA','3','2016-04-15 11:53:47','','','Regular','0'),
 (63,'0008-2009','MARIA CHARIS','T.','BANTILAN','','','LARENA','3','2016-04-15 11:54:07','','','Regular','0'),
 (64,'0059-2010','RUTH','G.','GUMAHAD','','','LARENA','3','2016-04-15 11:54:22','','','Regular','0'),
 (65,'0102-2005','MARY LOUISE','A.','MACALINO','','','LARENA','3','2016-04-15 11:54:50','','','Regular','0'),
 (66,'','LIEZEL','A.','SORILA','','','LARENA','3','2016-04-15 11:55:14','','','Regular','0');
INSERT INTO `employees` (`id`,`employee_id`,`fname`,`mi`,`lname`,`contact_no`,`address`,`department`,`department_id`,`date_added`,`user_id`,`user_screen_name`,`shift`,`shift_id`) VALUES 
 (67,'0084-2002','DENNIS','C.','LACTUAN','','','GUIHULNGAN','4','2016-04-15 11:55:35','','','Regular','0'),
 (68,'','JOEL','C.','PINILI','','','GUIHULNGAN','4','2016-04-15 11:55:44','','','Regular','0');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;


--
-- Definition of table `holidays`
--

DROP TABLE IF EXISTS `holidays`;
CREATE TABLE `holidays` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `holiday` varchar(255) DEFAULT NULL,
  `date_of_holiday` date DEFAULT NULL,
  `half_day_am` int(11) DEFAULT NULL,
  `half_day_pm` int(11) DEFAULT NULL,
  `date_added` datetime DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `user_screen_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `holidays`
--

/*!40000 ALTER TABLE `holidays` DISABLE KEYS */;
INSERT INTO `holidays` (`id`,`holiday`,`date_of_holiday`,`half_day_am`,`half_day_pm`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (1,'Christmas Day','2015-12-25',1,1,'2015-12-15 22:10:34','',''),
 (2,'New Years Day','2016-01-01',1,1,'2015-12-15 22:12:02','',''),
 (3,'Special Day','2016-03-28',1,0,'2016-04-25 14:53:49','','');
/*!40000 ALTER TABLE `holidays` ENABLE KEYS */;


--
-- Definition of table `shiftings`
--

DROP TABLE IF EXISTS `shiftings`;
CREATE TABLE `shiftings` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `shift` varchar(255) DEFAULT NULL,
  `am_12` varchar(255) DEFAULT NULL,
  `am_1` varchar(255) DEFAULT NULL,
  `am_2` varchar(255) DEFAULT NULL,
  `am_3` varchar(255) DEFAULT NULL,
  `am_4` varchar(255) DEFAULT NULL,
  `am_5` varchar(255) DEFAULT NULL,
  `am_6` varchar(255) DEFAULT NULL,
  `am_7` varchar(255) DEFAULT NULL,
  `am_8` varchar(255) DEFAULT NULL,
  `am_9` varchar(255) DEFAULT NULL,
  `am_10` varchar(255) DEFAULT NULL,
  `am_11` varchar(255) DEFAULT NULL,
  `pm_12` varchar(255) DEFAULT NULL,
  `pm_1` varchar(255) DEFAULT NULL,
  `pm_2` varchar(255) DEFAULT NULL,
  `pm_3` varchar(255) DEFAULT NULL,
  `pm4` varchar(255) DEFAULT NULL,
  `pm_5` varchar(255) DEFAULT NULL,
  `pm_6` varchar(255) DEFAULT NULL,
  `pm_7` varchar(255) DEFAULT NULL,
  `pm_8` varchar(255) DEFAULT NULL,
  `pm_9` varchar(255) DEFAULT NULL,
  `pm_10` varchar(255) DEFAULT NULL,
  `pm_11` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shiftings`
--

/*!40000 ALTER TABLE `shiftings` DISABLE KEYS */;
INSERT INTO `shiftings` (`id`,`shift`,`am_12`,`am_1`,`am_2`,`am_3`,`am_4`,`am_5`,`am_6`,`am_7`,`am_8`,`am_9`,`am_10`,`am_11`,`pm_12`,`pm_1`,`pm_2`,`pm_3`,`pm4`,`pm_5`,`pm_6`,`pm_7`,`pm_8`,`pm_9`,`pm_10`,`pm_11`,`status`,`created_at`,`updated_at`,`created_by`,`updated_by`) VALUES 
 (1,'Shift','00','01','02','03','04','05','06','07','08','09','10','11','00','01','02','03','04','05','06','07','08','09','10','11',1,'2016-04-25 13:29:30','2016-04-25 15:00:55','','1');
/*!40000 ALTER TABLE `shiftings` ENABLE KEYS */;


--
-- Definition of table `sick_leaves`
--

DROP TABLE IF EXISTS `sick_leaves`;
CREATE TABLE `sick_leaves` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `reason` varchar(255) DEFAULT NULL,
  `date_of_leave` date DEFAULT NULL,
  `half_day_am` int(11) DEFAULT NULL,
  `half_day_pm` int(11) DEFAULT NULL,
  `employee_name` varchar(255) DEFAULT NULL,
  `employee_id` varchar(255) DEFAULT NULL,
  `date_added` datetime DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `user_screen_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sick_leaves`
--

/*!40000 ALTER TABLE `sick_leaves` DISABLE KEYS */;
INSERT INTO `sick_leaves` (`id`,`reason`,`date_of_leave`,`half_day_am`,`half_day_pm`,`employee_name`,`employee_id`,`date_added`,`user_id`,`user_screen_name`) VALUES 
 (1,'fever','2016-03-23',1,1,'VILLALON, MICHAEL C.','46','2016-04-25 14:33:24','',''),
 (2,'','2016-03-31',0,1,'VILLALON, MICHAEL C.','46','2016-04-25 14:33:37','','');
/*!40000 ALTER TABLE `sick_leaves` ENABLE KEYS */;


--
-- Definition of table `user_default_previleges`
--

DROP TABLE IF EXISTS `user_default_previleges`;
CREATE TABLE `user_default_previleges` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_default_previleges`
--

/*!40000 ALTER TABLE `user_default_previleges` DISABLE KEYS */;
INSERT INTO `user_default_previleges` (`id`,`account`,`name`) VALUES 
 (1,'Administrator','Departments'),
 (2,'Administrator','DTR'),
 (3,'Administrator','Employees'),
 (4,'Administrator','Holidays'),
 (5,'Administrator','Sick Leaves'),
 (6,'Administrator','Users'),
 (7,'Administrator','Shifting');
/*!40000 ALTER TABLE `user_default_previleges` ENABLE KEYS */;


--
-- Definition of table `user_previleges`
--

DROP TABLE IF EXISTS `user_previleges`;
CREATE TABLE `user_previleges` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `previledge` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_previleges`
--

/*!40000 ALTER TABLE `user_previleges` DISABLE KEYS */;
INSERT INTO `user_previleges` (`id`,`account`,`previledge`,`status`,`user_id`,`user_name`) VALUES 
 (1,'Administrator','Departments',1,'1','admin'),
 (2,'Administrator','DTR',1,'1','admin'),
 (3,'Administrator','Employees',1,'1','admin'),
 (4,'Administrator','Holidays',1,'1','admin'),
 (5,'Administrator','Sick Leaves',1,'1','admin'),
 (6,'Administrator','Users',1,'1','admin'),
 (7,'Administrator','Shifting',1,'1','admin');
/*!40000 ALTER TABLE `user_previleges` ENABLE KEYS */;


--
-- Definition of table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `user_screen_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `date_added` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`,`user_name`,`user_screen_name`,`password`,`status`,`date_added`) VALUES 
 (1,'admin','Administrator','admin',1,'2015-12-17 21:25:09');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
