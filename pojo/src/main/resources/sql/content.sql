/*Table structure for table `content` */

DROP TABLE IF EXISTS `content`;

CREATE TABLE `content` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_id` bigint(20) NOT NULL COMMENT '内容类目ID',
  `title` varchar(200) DEFAULT NULL COMMENT '内容标题',
  `url` varchar(500) DEFAULT NULL COMMENT '链接',
  `pic` varchar(300) DEFAULT NULL COMMENT '图片绝对路径',
  `status` varchar(1) DEFAULT NULL COMMENT '状态',
  `sort_order` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `content` */

insert  into `content`(`id`,`category_id`,`title`,`url`,`pic`,`status`,`sort_order`) values (5,1,'测试广告','http://www.baidu.com','http://192.168.25.133/group1/M00/00/00/wKgZhVnIhVqAAa0jAActhhatATY291.png','1',3);
insert  into `content`(`id`,`category_id`,`title`,`url`,`pic`,`status`,`sort_order`) values (8,1,'这是一个广告','http://www.baidu.com','http://192.168.25.133/group1/M00/00/00/wKgZhVnJrmSAc6LvAAJLX6bBPuo913.jpg','1',10);
insert  into `content`(`id`,`category_id`,`title`,`url`,`pic`,`status`,`sort_order`) values (9,1,'1元秒月饼','http://www.163.com','http://192.168.25.133/group1/M00/00/00/wKgZhVnJ1pyAFbWqAAFyVK2N7Ig973.jpg','1',6);
