/*Table structure for table `specification` */

DROP TABLE IF EXISTS `specification`;

CREATE TABLE `specification` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `spec_name` varchar(255) DEFAULT NULL COMMENT '名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

/*Data for the table `specification` */

insert  into `specification`(`id`,`spec_name`) values (26,'尺码');
insert  into `specification`(`id`,`spec_name`) values (27,'网络');
insert  into `specification`(`id`,`spec_name`) values (28,'手机屏幕尺寸');
insert  into `specification`(`id`,`spec_name`) values (32,'机身内存');
insert  into `specification`(`id`,`spec_name`) values (33,'电视屏幕尺寸');