/*
SQLyog v10.2 
MySQL - 5.5.37 : Database - difficult
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`difficult` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `difficult`;

/*Table structure for table `bumen` */

DROP TABLE IF EXISTS `bumen`;

CREATE TABLE `bumen` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `bu` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `bumen` */

insert  into `bumen`(`id`,`bu`) values (1,'产品开发'),(2,'项目经理'),(3,'销售业务');

/*Table structure for table `juese` */

DROP TABLE IF EXISTS `juese`;

CREATE TABLE `juese` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `roe` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `juese` */

insert  into `juese`(`id`,`roe`) values (1,'管理员'),(2,'组长'),(3,'员工'),(4,'普通用户');

/*Table structure for table `power` */

DROP TABLE IF EXISTS `power`;

CREATE TABLE `power` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `qxname` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `btn` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fatherid` int(4) DEFAULT NULL,
  `url` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `type` int(4) DEFAULT NULL,
  `function` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `power` */

insert  into `power`(`id`,`qxname`,`btn`,`fatherid`,`url`,`type`,`function`) values (1,'用户管理','<div>用户管理</div>',4,'http://localhost:8080/Worke/Servlet?action=YG',2,'YG.js'),(2,'角色管理','<div>角色管理</div>',4,'http://localhost:8080/Worke/Servlet?action=JS',2,'JS.js'),(3,'权限管理','<div>权限管理</div>',4,'http://localhost:8080/Worke/Servlet?action=QX',2,'QX.js'),(4,'用户','<div>用户</div>',0,NULL,1,NULL),(5,'增加用户','<button TYPE=\"button\" lay-event=\"btn-add\"class=\"layui-btn layui-btn-warm layui-btn-radius\" >增加用户</button>',1,NULL,3,NULL),(6,'删除用户','<button TYPE=\"button\" lay-event=\"btn-delete\"class=\"layui-btn layui-btn-warm layui-btn-radius\" >删除用户</button>',1,NULL,3,NULL),(7,'修改用户','<button TYPE=\"button\" lay-event=\"btn-update\"class=\"layui-btn layui-btn-warm layui-btn-radius\" >修改用户</button>',1,NULL,3,NULL),(8,'分配权限','<button TYPE=\"button\" lay-event=\"fenFunc\"class=\"layui-btn layui-btn-warm layui-btn-radius\" >分配权限</button>',2,NULL,3,NULL);

/*Table structure for table `qxjues` */

DROP TABLE IF EXISTS `qxjues`;

CREATE TABLE `qxjues` (
  `qxid` int(4) NOT NULL AUTO_INCREMENT,
  `jsid` int(4) DEFAULT NULL,
  KEY `qxid` (`qxid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `qxjues` */

insert  into `qxjues`(`qxid`,`jsid`) values (1,1),(2,1),(3,2),(4,1),(5,1),(6,1),(7,1),(8,1);

/*Table structure for table `rank` */

DROP TABLE IF EXISTS `rank`;

CREATE TABLE `rank` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `raname` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userid` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `rank` */

insert  into `rank`(`id`,`raname`,`userid`) values (1,'项目经理',1),(2,'项目组长',2),(3,'项目成员',3);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `pwd` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `jueseid` int(4) DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bmid` int(4) DEFAULT NULL,
  `zcid` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `user` */

insert  into `user`(`id`,`pwd`,`jueseid`,`name`,`bmid`,`zcid`) values (1,'123',1,'admin',1,1),(2,'123',2,'lis',2,2),(3,'123',3,'王五',3,3);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
