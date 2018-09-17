/* ---------------------------------------------------- */
/*  Generated by Enterprise Architect Version 13.5 		*/
/*  Created On : 05-9月-2018 17:47:02 				*/
/*  DBMS       : MySql 						*/
/* ---------------------------------------------------- */

SET FOREIGN_KEY_CHECKS=0 
;

/* Drop Tables */

DROP TABLE IF EXISTS `account` CASCADE
;

DROP TABLE IF EXISTS `account_change` CASCADE
;

DROP TABLE IF EXISTS `account_charge` CASCADE
;

DROP TABLE IF EXISTS `account_charge_void` CASCADE
;

DROP TABLE IF EXISTS `account_refund` CASCADE
;

DROP TABLE IF EXISTS `account_sale` CASCADE
;

DROP TABLE IF EXISTS `account_void` CASCADE
;

DROP TABLE IF EXISTS `member` CASCADE
;

DROP TABLE IF EXISTS `member_info` CASCADE
;

DROP TABLE IF EXISTS `member_source` CASCADE
;

DROP TABLE IF EXISTS `value_card` CASCADE
;

DROP TABLE IF EXISTS `gift_card` CASCADE
;

DROP TABLE IF EXISTS `store` CASCADE
;

DROP TABLE IF EXISTS `charge`CASCADE
;

DROP TABLE IF EXISTS `activity` CASCADE
;

DROP TABLE IF EXISTS `admin_user` CASCADE
;

DROP TABLE IF EXISTS `admin_role` CASCADE
;

DROP TABLE IF EXISTS `admin_access` CASCADE
;

DROP TABLE IF EXISTS `admin_role_access` CASCADE
;

DROP TABLE IF EXISTS `admin_user_role` CASCADE
;

DROP TABLE IF EXISTS `advert` CASCADE
;

DROP TABLE IF EXISTS `advert_pos` CASCADE
;

DROP TABLE IF EXISTS `report_charge` CASCADE
;

DROP TABLE IF EXISTS `report_sale` CASCADE
;
/* Create Tables */

create table `report_sale` (
  `id` int not null PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
  `date` varchar(64) not NULL COMMENT '日期',
  `sale_count` int NOT NULL DEFAULT 0 COMMENT '充值笔数',
  `sale_total` int NOT NULL DEFAULT 0 COMMENT '充值总金额',
  `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间'
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '消费报表'
;

create table `report_charge` (
  `id` int not null PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
  `date` varchar(64) not NULL COMMENT '日期',
  `charge_count` int NOT NULL DEFAULT 0 COMMENT '充值笔数',
  `charge_total` int NOT NULL DEFAULT 0 COMMENT '充值总金额',
  `charge_sent` int NOT NULL DEFAULT 0 COMMENT '赠送金额',
  `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间'
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '充值报表'
;

create table `advert_pos` (
  `pos_id` int not null PRIMARY KEY AUTO_INCREMENT COMMENT '广告位id',
  `pos_name` varchar(64) NOT NULL COMMENT '广告位名称',
  `status` int NOT NULL DEFAULT 0 COMMENT '状态 0：使用中 1：空闲',
  `size` varchar (64) NOT NULL DEFAULT '100*200' COMMENT '尺寸',
  `advert_count` int NOT NULL DEFAULT 0 COMMENT '广告个数',
  `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间'
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '广告位表'
;

create table `advert` (
  `advert_id` int not null PRIMARY KEY AUTO_INCREMENT COMMENT '广告id',
  `advert_name` varchar(64) not NUll DEFAULT '' COMMENT '广告名',
  `valid_type` int DEFAULT 0 COMMENT '有效期 0：永不过期 1：有期限',
  `valid_time` varchar(64) default '' COMMENT '有效截止日期',
  `img_url` varchar(255) default '' COMMENT '图片url',
  `notice` varchar(255) default '' COMMENT '备注',
  `status` int NOT NULL DEFAULT 0 COMMENT '状态 0：开启 1：关闭',
  `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间'
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '广告表'
;

create table `admin_access` (
  `access_id` int not null PRIMARY KEY AUTO_INCREMENT COMMENT '权限id',
  `access_name` varchar(64) default '' COMMENT '权限名',
  `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间'
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '权限表'
;

create table `admin_role_access` (
  `role_id` int not null PRIMARY KEY AUTO_INCREMENT COMMENT '角色id',
  `access_id` int not null COMMENT '权限id',
  `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间'
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '角色权限关系表'
;


create table `admin_user_role` (
  `user_id` varchar(64) not null PRIMARY KEY COMMENT '用户id',
  `role_id` int not null COMMENT '角色id',
  `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间'
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '用户权限关系表'
;


create table `admin_role` (
  `role_id` int not null PRIMARY KEY AUTO_INCREMENT COMMENT '角色id',
  `role_name` varchar(64) not null COMMENT '用户角色名',
  `role_count` int not null DEFAULT 0 COMMENT '用户人数',
  `status` int DEFAULT 0 COMMENT '状态 0：关闭 1：开启',
  `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间'
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '管理员账户'
;


create table `admin_user` (
  `user_id` varchar(64) not null COMMENT '用户id',
  `user_name` varchar(64) not null COMMENT '用户名',
  `user_pwd` varchar(64) not null COMMENT '密码',
  `role_id` int not null COMMENT '角色id',
  `store_id` varchar(64) not null COMMENT '门店id',
  `is_access` int not null default 0 COMMENT '是否已配置权限 0：是 1：否',
  `status` int not null default 0 COMMENT '状态 0：开启 1：关闭',
  `level` int not null default 50 COMMENT '权重',
  `type` int not null default 0 COMMENT '类型 0：总部 1：门店',
  `notice` varchar(255) default '' COMMENT '备注',
  `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间',
  CONSTRAINT `PK_admin_user` PRIMARY KEY (`user_id` ASC)
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '管理员账户'
;

create table `activity` (
  `act_id` int not null PRIMARY KEY AUTO_INCREMENT COMMENT '活动id',
  `status` int NOT NULL default 0 COMMENT '活动状态 0:开启 1：关闭',
  `act_type` int NOT NULL DEFAULT 0 COMMENT '活动类型 0：充送活动 1：礼品卡购买活动',
  `cnt_type` int NOT NULL DEFAULT 0 COMMENT '优惠类型 0：送金额 1：会员折扣 2：优惠券（未开发）',
  `cnt_info` varchar(255) NOT NULL DEFAULT 0 COMMENT '优惠内容',
  `act_money` int NOT NULL DEFAULT 0 COMMENT '活动金额',
  `act_count` int NOT NULL DEFAULT 0 COMMENT '活动折扣',
  `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  `start_time` varchar(64) NOT NULL default '' COMMENT '开始时间',
  `end_time` varchar(64) NOT NULL default '' COMMENT '结束时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间'
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '活动'
;

create table `charge` (
  `charge_id` int NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT'充值id',
  `act_id` int NOT NULL COMMENT '活动id',
  `charge_money` int NOT NULL COMMENT '充值金额',
  `valid_type` int DEFAULT 0 COMMENT '有效期 0：永不过期 1：有期限',
  `valid_time` varchar(64) default '' COMMENT '有效期限',
  `is_valid` int DEFAULT 0 COMMENT '0：正常 1：关闭',
  `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间'
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '充值'
;

create table `store` (
  `store_id` varchar(64) NOT NULL COMMENT '门店ID',
  `store_name` varchar(255) DEFAULT '' COMMENT '门店名',
  `store_province` varchar(64) DEFAULT '' COMMENT '所在省',
  `store_city` varchar(64) DEFAULT '' COMMENT '所在城市',
  `store_district` varchar(64) DEFAULT '' COMMENT '所在地区',
  `store_addr` varchar(255) DEFAULT '' COMMENT '详细地址',
  `store_phone` varchar(20) DEFAULT '' COMMENT '联系电话',
  `status` int DEFAULT 0 COMMENT '状态 0：可用 1：不可用',
  `oper` int DEFAULT 0 COMMENT '操作 0：可用 1：不可用',
  `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间',
  CONSTRAINT `PK_store` PRIMARY KEY (`store_id` ASC)
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '门店'

;

create table `value_card` (
  `value_card_id` varchar(64) not null COMMENT '储值卡ID',
  `account_id` varchar(64) NOT NULL COMMENT '账户ID',
  `member_id` varchar(64) NOT NULL COMMENT '会员ID',
  `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间',
  CONSTRAINT `PK_value_card` PRIMARY KEY (`value_card_id` ASC)
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '储值卡'

;

create table `gift_card` (
  `gift_card_id` varchar(64) NOT NULL COMMENT '礼品卡ID',
  `gift_card_pwd` varchar(64) not NULL COMMENT '卡密',
  `account_id` varchar(64) NOT NULL COMMENT '账户ID',
  `member_id` varchar(64) NOT NULL COMMENT '会员ID',
  `value_card_id` varchar(64) NOT NULL COMMENT '储值卡ID',
  `money` int NOT NULL default 0 COMMENT '礼品卡金额',
  `end_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '结束时间',
  `status` int NOT NULL DEFAULT 0 COMMENT '状态 0：正常（未激活） 1：关闭（已激活） 2：已结束（过期）',
  `img_url` varchar(255) NOT NULL DEFAULT '' COMMENT '图片url',
  `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间',
   CONSTRAINT `PK_gift_card` PRIMARY KEY (`gift_card_id` ASC)
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '礼品卡'

;

CREATE TABLE `account`
(
	`account_id` varchar(64) NOT NULL COMMENT '账户ID',
	`open_id` varchar(64) not NULL COMMENT '微信openid',
	`account_no` varchar(64) NULL COMMENT '账户号码',
	`member_id` varchar(64) NULL COMMENT '会员ID',
	`value_card_id` varchar(64) NULL COMMENT '储值卡ID',
	`paypwd_status` int NOT NULL DEFAULT 0 COMMENT '是否要支付密码 1：是 0：否',
	`paypwd` varchar(64) NOT NULL DEFAULT '' COMMENT '账户支付密码',
	`balance` int(11) NOT NULL DEFAULT 0 COMMENT '账户余额',
	`charge_count` int NOT NULL DEFAULT 0 COMMENT '充值次数',
	`charge_money` int(11) NOT NULL DEFAULT 0 COMMENT '充值金额',
	`status` int NOT NULL DEFAULT 0 COMMENT '状态 0:正常 1：冻结',
	`create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间',
	CONSTRAINT `PK_account` PRIMARY KEY (`account_id` ASC)
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '账户'

;

CREATE TABLE `account_change`
(
	`account_change_id` varchar(64) NOT NULL COMMENT '主键',
	`change_memo` varchar(64) NOT NULL COMMENT '变动原因（如实体店消费、在线充值等）',
	`change_type` varchar(1) NULL COMMENT '变动类型：0不变，1增加，2减少',
	`change_value` int(11) NULL COMMENT '变化值',
	`value_card_id` varchar(64) not NULL COMMENT '储值卡id',
	`member_id` varchar(64) NULL COMMENT '会员ID',
	`account_id` varchar(64) NULL COMMENT '账户ID',
	`store_id` varchar(64) NOT NULL COMMENT '门店id',
	`status` int not NULL DEFAULT 0 COMMENT '交易状态 0：成功 1：失败 2：待付款 3：已退款',
	`balance` int(11) NULL COMMENT '变动后余额',
	`create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间',
	CONSTRAINT `PK_account_change` PRIMARY KEY (`account_change_id` ASC)
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '账户变动记录(交易记录)(按用户分表)'

;

CREATE TABLE `account_charge`
(
	`account_charge_id` varchar(64) NOT NULL COMMENT '主键(支付流水号)',
	`account_change_id` varchar(64) not NULL COMMENT '账户变动id',
	`change_value` int(11) NULL COMMENT '充值金额',
	`change_extra` int(11) NULL COMMENT '赠送金额',
	`change_memo` VARCHAR(50) NULL COMMENT '变动原因',
	`charge_order_serial` varchar(64) NULL COMMENT '交易流水号',
	`charge_type` varchar(64) DEFAULT '在线充值' COMMENT '充值类型',
	`member_id` varchar(64) NULL COMMENT '会员ID',
	`account_id` varchar(64) NULL COMMENT '账户ID',
	`charge_way`  varchar(64) DEFAULT '微信' COMMENT '支付渠道',
	`charge_order_id` varchar(64) NULL COMMENT '充值订单号',
	`pay_account` varchar(64) DEFAULT '个人微信支付账号' COMMENT '支付账号',
	`create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间',
	CONSTRAINT `PK_account_charge` PRIMARY KEY (`account_charge_id` ASC)
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '充值记录(按用户分表)'

;

CREATE TABLE `account_charge_void`
(
	`account_charge_void_id` varchar(64) NOT NULL COMMENT '主键',
	`change_value` int(11) NULL COMMENT '变动值',
	`change_memo` VARCHAR(50) NULL COMMENT '变动原因',
	`member_id` varchar(64) NULL COMMENT '会员ID',
	`account_id` varchar(64) NULL COMMENT '账户ID',
	`charge_order_id` varchar(64) NULL COMMENT '原充值订单号',
	`charge_void_order_id` varchar(64) NULL COMMENT '充值撤销订单号',
	`create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间',
	CONSTRAINT `PK_account_charge_void` PRIMARY KEY (`account_charge_void_id` ASC)
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '充值撤销记录(按用户分表)'

;

CREATE TABLE `account_refund`
(
	`account_refund_id` varchar(64) NOT NULL COMMENT '主键',
	`account_change_id` varchar(64) not NULL COMMENT '账户变动id',
	`change_value` int(11) NULL COMMENT '变动值',
	`change_memo` VARCHAR(50) NULL COMMENT '变动原因',
	`member_id` varchar(64) NULL COMMENT '会员ID',
	`account_id` varchar(64) NULL COMMENT '账户ID',
	`sale_order_id` varchar(64) NULL COMMENT '原消费订单号',
	`refund_order_id` varchar(64) NULL COMMENT '退款订单号',
	`create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间',
	CONSTRAINT `PK_account_refund` PRIMARY KEY (`account_refund_id` ASC)
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '退款记录(按用户分表)'

;

CREATE TABLE `account_sale`
(
	`account_sale_id` varchar(64) NOT NULL COMMENT '主键',
	`account_change_id` varchar(64) not NULL COMMENT '账户变动id',
	`change_value` int(11) NULL COMMENT '变动值',
	`change_memo` VARCHAR(50) NULL COMMENT '变动原因',
	`member_id` varchar(64) NULL COMMENT '会员ID',
	`account_id` varchar(64) NULL COMMENT '账户ID',
	`sale_order_id` varchar(64) NULL COMMENT '消费订单号',
	`create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间',
	CONSTRAINT `PK_account_sale` PRIMARY KEY (`account_sale_id` ASC)
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '消费记录(按用户分表)'

;

CREATE TABLE `account_void`
(
	`account_void_id` varchar(64) NOT NULL COMMENT '主键',
	`change_value` int(11) NULL COMMENT '变动值',
	`change_memo` VARCHAR(50) NULL COMMENT '变动原因',
	`member_id` varchar(64) NULL COMMENT '会员ID',
	`account_id` varchar(64) NULL COMMENT '账户ID',
	`sale_order_id` varchar(64) NULL COMMENT '原消费订单号',
	`void_order_id` varchar(64) NULL COMMENT '撤销订单号',
	`create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间',
	CONSTRAINT `PK_account_void` PRIMARY KEY (`account_void_id` ASC)
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '撤销记录(按用户分表)'

;

CREATE TABLE `member`
(
	`member_id` varchar(64) NOT NULL COMMENT '会员ID',
	`member_name` VARCHAR(50) NULL,
	`sex` varchar(1) NULL COMMENT '性别',
	`telephone` VARCHAR(50) NULL COMMENT '手机号码',
	`create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间',
	CONSTRAINT `PK_member` PRIMARY KEY (`member_id` ASC)
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '会员'

;

CREATE TABLE `member_info`
(
	`member_info_id` varchar(64) NOT NULL COMMENT '主键',
	`member_id` varchar(64) NULL COMMENT '会员ID',
	`info_key` VARCHAR(50) NULL COMMENT '会员信息项，如手机、地址、姓名等',
	`info_value` VARCHAR(100) NULL COMMENT '会员信息值',
	`create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
	`update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间',
	CONSTRAINT `PK_member_info` PRIMARY KEY (`member_info_id` ASC)
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '会员信息'

;

CREATE TABLE `member_source`
(
	`member_source_id` varchar(64) NOT NULL COMMENT '主键',
	`member_id` varchar(64) NULL COMMENT '会员ID',
	`source_id` VARCHAR(100) NULL COMMENT '来源ID',
	`source` VARCHAR(50) NULL COMMENT '会员来源,WECHAT、ALIPAY、MERCHANT',
	CONSTRAINT `PK_member_source` PRIMARY KEY (`member_source_id` ASC)
)
ENGINE=InnoDB
DEFAULT CHARSET utf8
COMMENT = '会员来源'

;

-- /* Create Primary Keys, Indexes, Uniques, Checks */
--
-- ALTER TABLE `account`
--  ADD INDEX `IXFK_account_member` (`member_id` ASC)
-- ;
--
-- ALTER TABLE `account_change`
--  ADD INDEX `IXFK_account_change_account` (`account_id` ASC)
-- ;
--
-- ALTER TABLE `account_change`
--  ADD INDEX `IXFK_account_change_member` (`member_id` ASC)
-- ;
--
-- ALTER TABLE `account_charge`
--  ADD INDEX `IXFK_account_charge_account` (`account_id` ASC)
-- ;
--
-- ALTER TABLE `account_charge`
--  ADD INDEX `IXFK_account_charge_member` (`member_id` ASC)
-- ;
--
-- ALTER TABLE `account_charge_void`
--  ADD INDEX `IXFK_account_charge_void_account` (`account_id` ASC)
-- ;
--
-- ALTER TABLE `account_charge_void`
--  ADD INDEX `IXFK_account_charge_void_member` (`member_id` ASC)
-- ;
--
-- ALTER TABLE `account_refund`
--  ADD INDEX `IXFK_account_refund_account` (`account_id` ASC)
-- ;
--
-- ALTER TABLE `account_refund`
--  ADD INDEX `IXFK_account_refund_member` (`member_id` ASC)
-- ;
--
-- ALTER TABLE `account_sale`
--  ADD INDEX `IXFK_account_sale_account` (`account_id` ASC)
-- ;
--
-- ALTER TABLE `account_sale`
--  ADD INDEX `IXFK_account_sale_member` (`member_id` ASC)
-- ;
--
-- ALTER TABLE `account_void`
--  ADD INDEX `IXFK_account_void_account` (`account_id` ASC)
-- ;
--
-- ALTER TABLE `account_void`
--  ADD INDEX `IXFK_account_void_member` (`member_id` ASC)
-- ;
--
-- ALTER TABLE `member_info`
--  ADD INDEX `IXFK_member_info_member` (`member_id` ASC)
-- ;
--
-- ALTER TABLE `member_source`
--  ADD INDEX `IXFK_member_source_member` (`member_id` ASC)
-- ;
--
-- /* Create Foreign Key Constraints */
--
-- ALTER TABLE `account`
--  ADD CONSTRAINT `FK_account_member`
-- 	FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`) ON DELETE Restrict ON UPDATE Restrict
-- ;
--
-- ALTER TABLE `account_change`
--  ADD CONSTRAINT `FK_account_change_account`
-- 	FOREIGN KEY (`account_id`) REFERENCES `account` (`account_id`) ON DELETE Restrict ON UPDATE Restrict
-- ;
--
-- ALTER TABLE `account_change`
--  ADD CONSTRAINT `FK_account_change_member`
-- 	FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`) ON DELETE Restrict ON UPDATE Restrict
-- ;
--
-- ALTER TABLE `account_charge`
--  ADD CONSTRAINT `FK_account_charge_account`
-- 	FOREIGN KEY (`account_id`) REFERENCES `account` (`account_id`) ON DELETE Restrict ON UPDATE Restrict
-- ;
--
-- ALTER TABLE `account_charge`
--  ADD CONSTRAINT `FK_account_charge_member`
-- 	FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`) ON DELETE Restrict ON UPDATE Restrict
-- ;
--
-- ALTER TABLE `account_charge_void`
--  ADD CONSTRAINT `FK_account_charge_void_account`
-- 	FOREIGN KEY (`account_id`) REFERENCES `account` (`account_id`) ON DELETE Restrict ON UPDATE Restrict
-- ;
--
-- ALTER TABLE `account_charge_void`
--  ADD CONSTRAINT `FK_account_charge_void_member`
-- 	FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`) ON DELETE Restrict ON UPDATE Restrict
-- ;
--
-- ALTER TABLE `account_refund`
--  ADD CONSTRAINT `FK_account_refund_account`
-- 	FOREIGN KEY (`account_id`) REFERENCES `account` (`account_id`) ON DELETE Restrict ON UPDATE Restrict
-- ;
--
-- ALTER TABLE `account_refund`
--  ADD CONSTRAINT `FK_account_refund_member`
-- 	FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`) ON DELETE Restrict ON UPDATE Restrict
-- ;
--
-- ALTER TABLE `account_sale`
--  ADD CONSTRAINT `FK_account_sale_account`
-- 	FOREIGN KEY (`account_id`) REFERENCES `account` (`account_id`) ON DELETE Restrict ON UPDATE Restrict
-- ;
--
-- ALTER TABLE `account_sale`
--  ADD CONSTRAINT `FK_account_sale_member`
-- 	FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`) ON DELETE Restrict ON UPDATE Restrict
-- ;
--
-- ALTER TABLE `account_void`
--  ADD CONSTRAINT `FK_account_void_account`
-- 	FOREIGN KEY (`account_id`) REFERENCES `account` (`account_id`) ON DELETE Restrict ON UPDATE Restrict
-- ;
--
-- ALTER TABLE `account_void`
--  ADD CONSTRAINT `FK_account_void_member`
-- 	FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`) ON DELETE Restrict ON UPDATE Restrict
-- ;
--
-- ALTER TABLE `member_info`
--  ADD CONSTRAINT `FK_member_info_member`
-- 	FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`) ON DELETE Restrict ON UPDATE Restrict
-- ;
--
-- ALTER TABLE `member_source`
--  ADD CONSTRAINT `FK_member_source_member`
-- 	FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`) ON DELETE Restrict ON UPDATE Restrict
-- ;

SET FOREIGN_KEY_CHECKS=1 
;
