# MySQL-Front 5.1  (Build 2.7)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;


# Host: localhost    Database: ssm
# ------------------------------------------------------
# Server version 5.0.22-community-nt

DROP DATABASE IF EXISTS `ssm`;
CREATE DATABASE `ssm` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ssm`;

#
# Source for table pk
#

DROP TABLE IF EXISTS `pk`;
CREATE TABLE `pk` (
  `pkId` int(11) NOT NULL auto_increment,
  `singerid1` varchar(255) collate utf8_unicode_ci NOT NULL default '',
  `singerid2` varchar(255) collate utf8_unicode_ci NOT NULL default '',
  `singing` varchar(255) collate utf8_unicode_ci NOT NULL default '',
  PRIMARY KEY  (`pkId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

#
# Dumping data for table pk
#
LOCK TABLES `pk` WRITE;
/*!40000 ALTER TABLE `pk` DISABLE KEYS */;

/*!40000 ALTER TABLE `pk` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table sore
#

DROP TABLE IF EXISTS `sore`;
CREATE TABLE `sore` (
  `Id` int(11) NOT NULL auto_increment,
  `singerid` varchar(255) collate utf8_unicode_ci NOT NULL default '',
  `countcore` varchar(255) collate utf8_unicode_ci NOT NULL default '',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

#
# Dumping data for table sore
#
LOCK TABLES `sore` WRITE;
/*!40000 ALTER TABLE `sore` DISABLE KEYS */;

/*!40000 ALTER TABLE `sore` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table t_user
#

DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `Id` int(11) NOT NULL auto_increment,
  `username` varchar(255) collate utf8_unicode_ci NOT NULL default '',
  `password` varchar(255) collate utf8_unicode_ci default '',
  `age` varchar(255) collate utf8_unicode_ci NOT NULL default '',
  `sex` varchar(255) collate utf8_unicode_ci default '',
  `pictureUrl` varchar(255) collate utf8_unicode_ci NOT NULL default '',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

#
# Dumping data for table t_user
#
LOCK TABLES `t_user` WRITE;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;

INSERT INTO `t_user` VALUES (3,'张三','123','2','1','');
INSERT INTO `t_user` VALUES (4,'李四','555','45','1','');
INSERT INTO `t_user` VALUES (5,'流量','2332','21','1','');
INSERT INTO `t_user` VALUES (6,'的味道','55','53','1','');
INSERT INTO `t_user` VALUES (7,'等等我','14','23','1','');
INSERT INTO `t_user` VALUES (8,'123','32','21','0','');
INSERT INTO `t_user` VALUES (9,'发过的','123','21','0','');
INSERT INTO `t_user` VALUES (10,'似懂非懂','533','11','1','');
INSERT INTO `t_user` VALUES (11,'发达','123','21','0','');
INSERT INTO `t_user` VALUES (12,'萨达','432','12','1','');
INSERT INTO `t_user` VALUES (13,'马带你飞','342','32','1','');
INSERT INTO `t_user` VALUES (14,'地方','32','23','1','');
INSERT INTO `t_user` VALUES (15,'删除','45','23','1','');
INSERT INTO `t_user` VALUES (16,'计算机',NULL,'21','1','/vote/static/account-filling.png');
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table voting
#

DROP TABLE IF EXISTS `voting`;
CREATE TABLE `voting` (
  `Id` int(11) NOT NULL auto_increment,
  `pkid` varchar(255) collate utf8_unicode_ci NOT NULL default '',
  `singerid` varchar(255) collate utf8_unicode_ci NOT NULL default '',
  `core` varchar(255) collate utf8_unicode_ci NOT NULL default '',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

#
# Dumping data for table voting
#
LOCK TABLES `voting` WRITE;
/*!40000 ALTER TABLE `voting` DISABLE KEYS */;

/*!40000 ALTER TABLE `voting` ENABLE KEYS */;
UNLOCK TABLES;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
