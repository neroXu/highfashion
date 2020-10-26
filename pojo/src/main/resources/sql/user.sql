/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(32) NOT NULL COMMENT '密码，加密存储',
  `phone` varchar(20) DEFAULT NULL COMMENT '注册手机号',
  `email` varchar(50) DEFAULT NULL COMMENT '注册邮箱',
  `created` datetime NOT NULL COMMENT '创建时间',
  `updated` datetime NOT NULL,
  `source_type` varchar(1) DEFAULT NULL COMMENT '会员来源：1:PC，2：H5，3：Android，4：IOS，5：WeChat',
  `nick_name` varchar(50) DEFAULT NULL COMMENT '昵称',
  `name` varchar(50) DEFAULT NULL COMMENT '真实姓名',
  `status` varchar(1) DEFAULT NULL COMMENT '使用状态（Y正常 N非正常）',
  `head_pic` varchar(150) DEFAULT NULL COMMENT '头像地址',
  `qq` varchar(20) DEFAULT NULL COMMENT 'QQ号码',
  `account_balance` decimal(10,0) DEFAULT NULL COMMENT '账户余额',
  `is_mobile_check` varchar(1) DEFAULT '0' COMMENT '手机是否验证 （0否  1是）',
  `is_email_check` varchar(1) DEFAULT '0' COMMENT '邮箱是否检测（0否  1是）',
  `sex` varchar(1) DEFAULT '0' COMMENT '性别，1男，2女',
  `user_level` int(11) DEFAULT NULL COMMENT '会员等级',
  `points` int(11) DEFAULT NULL COMMENT '积分',
  `experience_value` int(11) DEFAULT NULL COMMENT '经验值',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`phone`,`email`,`created`,`updated`,`source_type`,`nick_name`,`name`,`status`,`head_pic`,`qq`,`account_balance`,`is_mobile_check`,`is_email_check`,`sex`,`user_level`,`points`,`experience_value`,`birthday`,`last_login_time`) values (1,'sunwukong','123123','1112221111',NULL,'2017-08-19 20:50:21','2017-08-19 20:50:21',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
insert  into `user`(`id`,`username`,`password`,`phone`,`email`,`created`,`updated`,`source_type`,`nick_name`,`name`,`status`,`head_pic`,`qq`,`account_balance`,`is_mobile_check`,`is_email_check`,`sex`,`user_level`,`points`,`experience_value`,`birthday`,`last_login_time`) values (2,'zhubajie','4297f44b13955235245b2497399d7a93','111122',NULL,'2017-08-19 21:00:23','2017-08-19 21:00:23',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
insert  into `user`(`id`,`username`,`password`,`phone`,`email`,`created`,`updated`,`source_type`,`nick_name`,`name`,`status`,`head_pic`,`qq`,`account_balance`,`is_mobile_check`,`is_email_check`,`sex`,`user_level`,`points`,`experience_value`,`birthday`,`last_login_time`) values (3,'shaheshang','96e79218965eb72c92a549dd5a330112','13900112222',NULL,'2017-08-19 22:37:44','2017-08-19 22:37:44',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
insert  into `user`(`id`,`username`,`password`,`phone`,`email`,`created`,`updated`,`source_type`,`nick_name`,`name`,`status`,`head_pic`,`qq`,`account_balance`,`is_mobile_check`,`is_email_check`,`sex`,`user_level`,`points`,`experience_value`,`birthday`,`last_login_time`) values (4,'zhangsan','00b7691d86d96aebd21dd9e138f90840','17701265258',NULL,'2017-08-19 23:44:45','2017-08-19 23:44:45',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
insert  into `user`(`id`,`username`,`password`,`phone`,`email`,`created`,`updated`,`source_type`,`nick_name`,`name`,`status`,`head_pic`,`qq`,`account_balance`,`is_mobile_check`,`is_email_check`,`sex`,`user_level`,`points`,`experience_value`,`birthday`,`last_login_time`) values (5,'lisi','8fbaad286e993d37b34b41749894b4a7','13401341444',NULL,'2017-08-20 11:08:29','2017-08-20 11:08:29',NULL,NULL,NULL,'1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
insert  into `user`(`id`,`username`,`password`,`phone`,`email`,`created`,`updated`,`source_type`,`nick_name`,`name`,`status`,`head_pic`,`qq`,`account_balance`,`is_mobile_check`,`is_email_check`,`sex`,`user_level`,`points`,`experience_value`,`birthday`,`last_login_time`) values (6,'wangwu','d41d8cd98f00b204e9800998ecf8427e','13601566766',NULL,'2017-08-20 11:09:26','2017-08-20 11:09:26',NULL,NULL,NULL,'1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
insert  into `user`(`id`,`username`,`password`,`phone`,`email`,`created`,`updated`,`source_type`,`nick_name`,`name`,`status`,`head_pic`,`qq`,`account_balance`,`is_mobile_check`,`is_email_check`,`sex`,`user_level`,`points`,`experience_value`,`birthday`,`last_login_time`) values (7,'zhaoliu','f379eaf3c831b04de153469d1bec345e','13669669966',NULL,'2017-08-20 12:09:27','2017-08-20 12:09:27',NULL,NULL,NULL,'1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
insert  into `user`(`id`,`username`,`password`,`phone`,`email`,`created`,`updated`,`source_type`,`nick_name`,`name`,`status`,`head_pic`,`qq`,`account_balance`,`is_mobile_check`,`is_email_check`,`sex`,`user_level`,`points`,`experience_value`,`birthday`,`last_login_time`) values (8,'lijialong','4297f44b13955235245b2497399d7a93','13260006290',NULL,'2017-08-20 12:23:37','2017-08-20 12:23:37',NULL,NULL,NULL,'1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
insert  into `user`(`id`,`username`,`password`,`phone`,`email`,`created`,`updated`,`source_type`,`nick_name`,`name`,`status`,`head_pic`,`qq`,`account_balance`,`is_mobile_check`,`is_email_check`,`sex`,`user_level`,`points`,`experience_value`,`birthday`,`last_login_time`) values (9,'tangseng','4297f44b13955235245b2497399d7a93','13901223232',NULL,'2017-10-07 23:07:42','2017-10-07 23:07:42',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
insert  into `user`(`id`,`username`,`password`,`phone`,`email`,`created`,`updated`,`source_type`,`nick_name`,`name`,`status`,`head_pic`,`qq`,`account_balance`,`is_mobile_check`,`is_email_check`,`sex`,`user_level`,`points`,`experience_value`,`birthday`,`last_login_time`) values (10,'niumowang','4297f44b13955235245b2497399d7a93','13900112222',NULL,'2017-10-07 23:46:53','2017-10-07 23:46:53',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
insert  into `user`(`id`,`username`,`password`,`phone`,`email`,`created`,`updated`,`source_type`,`nick_name`,`name`,`status`,`head_pic`,`qq`,`account_balance`,`is_mobile_check`,`is_email_check`,`sex`,`user_level`,`points`,`experience_value`,`birthday`,`last_login_time`) values (11,'honghaier','f14029217ff5e7a50cdc7e70f686cf29','13919991999',NULL,'2017-10-08 11:23:02','2017-10-08 11:23:02',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
insert  into `user`(`id`,`username`,`password`,`phone`,`email`,`created`,`updated`,`source_type`,`nick_name`,`name`,`status`,`head_pic`,`qq`,`account_balance`,`is_mobile_check`,`is_email_check`,`sex`,`user_level`,`points`,`experience_value`,`birthday`,`last_login_time`) values (12,'tieshanxian','f14029217ff5e7a50cdc7e70f686cf29','13999999999',NULL,'2017-10-08 12:10:26','2017-10-08 12:10:26',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
insert  into `user`(`id`,`username`,`password`,`phone`,`email`,`created`,`updated`,`source_type`,`nick_name`,`name`,`status`,`head_pic`,`qq`,`account_balance`,`is_mobile_check`,`is_email_check`,`sex`,`user_level`,`points`,`experience_value`,`birthday`,`last_login_time`) values (13,'nezha','1a100d2c0dab19c4430e7d73762b3423','17338118923',NULL,'2017-10-08 12:23:27','2017-10-08 12:23:27',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
insert  into `user`(`id`,`username`,`password`,`phone`,`email`,`created`,`updated`,`source_type`,`nick_name`,`name`,`status`,`head_pic`,`qq`,`account_balance`,`is_mobile_check`,`is_email_check`,`sex`,`user_level`,`points`,`experience_value`,`birthday`,`last_login_time`) values (14,'litianwang','b0baee9d279d34fa1dfd71aadb908c3f','17338118923',NULL,'2017-10-08 12:28:25','2017-10-08 12:28:25',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
insert  into `user`(`id`,`username`,`password`,`phone`,`email`,`created`,`updated`,`source_type`,`nick_name`,`name`,`status`,`head_pic`,`qq`,`account_balance`,`is_mobile_check`,`is_email_check`,`sex`,`user_level`,`points`,`experience_value`,`birthday`,`last_login_time`) values (15,'taiba','97d84aa49109e72a54980e79802844be','17338118923',NULL,'2017-10-08 12:34:53','2017-10-08 12:34:53',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
