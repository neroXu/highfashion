DROP TABLE IF EXISTS `brand`;

CREATE TABLE `brand` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '品牌名称',
  `first_char` varchar(1) DEFAULT NULL COMMENT '品牌首字母',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

/*Data for the table `brand` */

insert  into `brand`(`id`,`name`,`first_char`) values (1,'联想','L');
insert  into `brand`(`id`,`name`,`first_char`) values (2,'华为','H');
insert  into `brand`(`id`,`name`,`first_char`) values (3,'三星','S');
insert  into `brand`(`id`,`name`,`first_char`) values (4,'小米','X');
insert  into `brand`(`id`,`name`,`first_char`) values (5,'OPPO','O');
insert  into `brand`(`id`,`name`,`first_char`) values (6,'360','S');
insert  into `brand`(`id`,`name`,`first_char`) values (7,'中兴','Z');
insert  into `brand`(`id`,`name`,`first_char`) values (8,'魅族','M');
insert  into `brand`(`id`,`name`,`first_char`) values (9,'苹果','P');
insert  into `brand`(`id`,`name`,`first_char`) values (10,'VIVO','V');
insert  into `brand`(`id`,`name`,`first_char`) values (11,'诺基亚','N');
insert  into `brand`(`id`,`name`,`first_char`) values (12,'锤子','C');
insert  into `brand`(`id`,`name`,`first_char`) values (13,'长虹','C');
insert  into `brand`(`id`,`name`,`first_char`) values (14,'海尔','H');
insert  into `brand`(`id`,`name`,`first_char`) values (15,'飞利浦','F');
insert  into `brand`(`id`,`name`,`first_char`) values (16,'TCL','T');
insert  into `brand`(`id`,`name`,`first_char`) values (17,'海信','H');
insert  into `brand`(`id`,`name`,`first_char`) values (18,'夏普','X');
insert  into `brand`(`id`,`name`,`first_char`) values (19,'创维','C');
insert  into `brand`(`id`,`name`,`first_char`) values (20,'东芝','D');
insert  into `brand`(`id`,`name`,`first_char`) values (21,'康佳','K');
insert  into `brand`(`id`,`name`,`first_char`) values (22,'LG','L');