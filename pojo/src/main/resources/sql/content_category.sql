/*Table structure for table `content_category` */

DROP TABLE IF EXISTS `content_category`;

CREATE TABLE `content_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '类目ID',
  `name` varchar(50) DEFAULT NULL COMMENT '分类名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='内容分类';

/*Data for the table `content_category` */

insert  into `content_category`(`id`,`name`) values (1,'首页轮播广告');
insert  into `content_category`(`id`,`name`) values (2,'今日推荐');
insert  into `content_category`(`id`,`name`) values (3,'活动专区');
insert  into `content_category`(`id`,`name`) values (4,'猜你喜欢');
insert  into `content_category`(`id`,`name`) values (5,'服装楼层广告');