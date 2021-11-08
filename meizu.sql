/*
Navicat MySQL Data Transfer

Source Server         : sql
Source Server Version : 50625
Source Host           : localhost:3306
Source Database       : meizu

Target Server Type    : MYSQL
Target Server Version : 50625
File Encoding         : 65001

Date: 2021-10-26 15:05:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `crusername` varchar(255) DEFAULT NULL,
  `crpic` varchar(255) DEFAULT NULL,
  `crname` varchar(255) DEFAULT NULL,
  `crprice` varchar(255) DEFAULT NULL,
  `crformat` varchar(255) DEFAULT NULL,
  `isGoods` varchar(255) DEFAULT NULL,
  `crmunder` varchar(255) NOT NULL,
  `createdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cart
-- ----------------------------
INSERT INTO `cart` VALUES ('5', 'cs1', '/img/pddetailsPic/16299664283282021-08-26_155529.png', '魅族 18', '4555', '烦死了打开就傅雷考试到解放浪费', '0', '1', '2021-10-19 22:51:19');
INSERT INTO `cart` VALUES ('38', 'admin', '/img/pddetailsPic/16299667897402021-08-26_155529.png', '魅族 18 pro', '3453', '破IC鞠躬我万评估表科技部你 技能书的科技感IE就好好干', '0', '1', '2021-10-22 21:21:05');
INSERT INTO `cart` VALUES ('39', 'admin', '/img/classifyPic/16299675310192021-08-26_160518.png', 'PANDAER 18 系列', '3545', '东方红Ethan阿尔法狗', '0', '1', '2021-10-22 23:01:02');
INSERT INTO `cart` VALUES ('40', 'cs1', '/img/classifyPic/16299675310192021-08-26_160518.png', 'PANDAER 18 系列', '3545', '东方红Ethan阿尔法狗', '0', '1', '2021-10-22 23:38:53');
INSERT INTO `cart` VALUES ('46', 'admin', '/img/classifyPic/16299672124122021-08-26_160322.png', '魅族18 Pro液态硅胶壳', '3335', '生日歌让人家圣経DD打扰好得很伏特加同一届', '0', '1', '2021-10-26 14:52:17');
INSERT INTO `cart` VALUES ('47', 'admin', '/img/pddetailsPic/16299667516592021-08-26_155651.png', '魅族LIpro LED系列', '4534', '剖if趣味IG看龙珠觉醒的不过开九点半更恐怖', '0', '1', '2021-10-26 14:52:20');

-- ----------------------------
-- Table structure for classify
-- ----------------------------
DROP TABLE IF EXISTS `classify`;
CREATE TABLE `classify` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productname` varchar(255) DEFAULT NULL,
  `productpic` varchar(255) DEFAULT NULL,
  `producttpye` tinyint(1) DEFAULT NULL,
  `productcreate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classify
-- ----------------------------
INSERT INTO `classify` VALUES ('5', '魅族 18', '/img/classifyPic/16299664283282021-08-26_155529.png', '0', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('6', '魅族16', '/img/classifyPic/16299664427822021-08-26_155555.png', '0', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('7', '魅族 18 pro', '/img/classifyPic/16299664577612021-08-26_155601.png', '0', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('8', '魅族 17 plus', '/img/classifyPic/16299664750692021-08-26_155620.png', '0', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('9', '魅族 POP2s 真无线', '/img/classifyPic/16299665575682021-08-26_155626.png', '0', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('11', '魅族 18 液态硅胶壳', '/img/classifyPic/16299667076142021-08-26_155632.png', '0', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('12', '魅族18 Pro液态硅胶壳', '/img/classifyPic/16299667253732021-08-26_155639.png', '0', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('13', 'PANDAER 18 系列', '/img/classifyPic/16299667391152021-08-26_155645.png', '0', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('14', '魅族LIpro LED系列', '/img/classifyPic/16299667516592021-08-26_155651.png', '0', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('15', '魅族 18 pro', '/img/classifyPic/16299667897402021-08-26_155529.png', '1', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('16', '魅族18', '/img/classifyPic/16299668056992021-08-26_155555.png', '1', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('17', '魅族 17', '/img/classifyPic/16299668218942021-08-26_155620.png', '1', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('18', '魅族 17 Pro', '/img/classifyPic/16299668364292021-08-26_155620.png', '1', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('19', '老用户专享', '/img/classifyPic/16299668674602021-08-26_160938.png', '1', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('20', '魅族 17 Pro 晓芳窖艺', '/img/classifyPic/16299669102982021-08-26_160950.png', '1', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('21', '魅族17 航母限定版', '/img/classifyPic/16299669301652021-08-26_160957.png', '1', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('22', '魅族 POP2 真无线', '/img/classifyPic/16299670083122021-08-26_160039.png', '2', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('23', '魅族 POP Pro 主动', '/img/classifyPic/16299670354522021-08-26_160057.png', '2', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('24', '魅族 POP2s 真无线', '/img/classifyPic/16299670654462021-08-26_160103.png', '2', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('25', '魅族HD60 降噪耳机', '/img/classifyPic/16299670938022021-08-26_160111.png', '2', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('26', '魅族 HD60 头戴式蓝牙耳机', '/img/classifyPic/16299671202192021-08-26_160118.png', '2', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('28', '魅族 EP3C 耳机', '/img/classifyPic/16299671560592021-08-26_160140.png', '2', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('29', '魅族 18 液态硅胶壳', '/img/classifyPic/16299671947332021-08-26_160312.png', '3', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('30', '魅族18 Pro液态硅胶壳', '/img/classifyPic/16299672124122021-08-26_160322.png', '3', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('31', '魅族 18 系列', '/img/classifyPic/16299672356852021-08-26_160328.png', '3', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('32', '魅族18 系列', '/img/classifyPic/16299672583802021-08-26_160340.png', '3', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('33', 'PANDAER 侠意保护', '/img/classifyPic/16299673097572021-08-26_160346.png', '3', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('34', '魅族 18 系列手机保护壳', '/img/classifyPic/16299673396582021-08-26_160353.png', '3', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('35', 'Pandaer readnap', '/img/classifyPic/16299673702062021-08-26_160415.png', '4', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('36', 'T FLYME 九周年纪念', '/img/classifyPic/16299673942762021-08-26_160447.png', '4', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('37', '魅族 City Walk双肩包', '/img/classifyPic/16299674425422021-08-26_160458.png', '4', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('38', 'PANDAER [龍] T恤', '/img/classifyPic/16299674796762021-08-26_160505.png', '4', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('39', 'PANDAER 18 系列', '/img/classifyPic/16299675310192021-08-26_160518.png', '4', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('40', '魅族Lipro LED 智能', '/img/classifyPic/16299675740852021-08-26_160543.png', '5', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('41', '魅族Lipro LED 简灯', '/img/classifyPic/16299675980202021-08-26_160556.png', '5', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('42', '魅族Lipro LED 橱柜', '/img/classifyPic/16299676266342021-08-26_160606.png', '5', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('43', '魅族Lipro LED 灯泡', '/img/classifyPic/16299676521792021-08-26_160612.png', '5', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('44', '魅族Lipro LED 地脚', '/img/classifyPic/16299676835322021-08-26_160627.png', '5', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('45', 'Lipro LED 金属球泡', '/img/classifyPic/16299677140762021-08-26_160632.png', '5', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('46', 'Lipro LED 射灯 可控', '/img/classifyPic/16299677488282021-08-26_160647.png', '5', '2021-08-26 00:00:00');
INSERT INTO `classify` VALUES ('47', 'Lipro LED 射灯 标准', '/img/classifyPic/16299677691572021-08-26_160654.png', '5', '2021-08-26 00:00:00');

-- ----------------------------
-- Table structure for find
-- ----------------------------
DROP TABLE IF EXISTS `find`;
CREATE TABLE `find` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `findpic` varchar(255) DEFAULT NULL,
  `findtitle` varchar(255) DEFAULT NULL,
  `findread` varchar(11) DEFAULT NULL,
  `findcreate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of find
-- ----------------------------
INSERT INTO `find` VALUES ('9', '小胖', '/img/findPic/163283653368212.png', '魅族5G新品手机从发首测：120Hz直接屏，真香', '91', '2021-09-28 00:00:00');
INSERT INTO `find` VALUES ('10', '小飞', '/img/findPic/16328365798362021-09-28_213757.png', '梦想再回归，热爱永不变', '26', '2021-09-28 00:00:00');
INSERT INTO `find` VALUES ('11', '小菜', '/img/findPic/16328366242752021-09-28_213824.png', '这是一抹纯粹的美：18 pro 飞雪流光', '20', '2021-09-28 00:00:00');
INSERT INTO `find` VALUES ('12', '小海', '/img/findPic/16328366737692021-09-28_213841.png', '极致舒适的小屏旗舰：魅族 18 杜海', '21', '2021-09-28 00:00:00');
INSERT INTO `find` VALUES ('13', '小梦', '/img/findPic/16328366990762021-09-28_213852.png', '梦想再回归，热爱永不变', '4', '2021-09-28 00:00:00');

-- ----------------------------
-- Table structure for form
-- ----------------------------
DROP TABLE IF EXISTS `form`;
CREATE TABLE `form` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `meform` varchar(255) DEFAULT NULL,
  `clform` varchar(255) DEFAULT NULL,
  `comname` varchar(255) DEFAULT NULL,
  `money` varchar(255) DEFAULT NULL,
  `focreate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of form
-- ----------------------------
INSERT INTO `form` VALUES ('7', 'sh202110271974130704', 'dd202110271974130704', '魅族Lipro LED 橱柜', '1233', '2021-10-26 12:07:55');
INSERT INTO `form` VALUES ('8', 'sh202110279985130944', 'dd202110279985130944', '魅族 18', '4555', '2021-10-26 12:10:22');
INSERT INTO `form` VALUES ('12', 'sh202110279985130944', 'dd202110279985130944', '魅族 18', '4555', '2021-10-26 12:12:20');
INSERT INTO `form` VALUES ('16', 'sh202110278209153034', 'dd202110278209153034', '魅族LIpro LED系列', '4534', '2021-10-26 14:29:54');
INSERT INTO `form` VALUES ('17', 'sh202110277928153804', 'dd202110277928153804', '魅族 17 plus,PANDAER 18 系列', '8699', '2021-10-26 14:38:53');
INSERT INTO `form` VALUES ('18', 'sh202110274124154221', 'dd202110274124154221', 'Pandaer readnap', '3345', '2021-10-26 14:41:56');

-- ----------------------------
-- Table structure for home
-- ----------------------------
DROP TABLE IF EXISTS `home`;
CREATE TABLE `home` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `money` varchar(255) DEFAULT NULL,
  `homepic` varchar(255) DEFAULT NULL,
  `homecreate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of home
-- ----------------------------
INSERT INTO `home` VALUES ('3', '66666', '/img/homePic/16299679589432021-08-26_165108.png', '2021-08-26 00:00:00');
INSERT INTO `home` VALUES ('4', '77777', '/img/homePic/16299679689792021-08-26_165140.png', '2021-08-26 00:00:00');
INSERT INTO `home` VALUES ('5', '88888', '/img/homePic/16299679814372021-08-26_165201.png', '2021-08-26 00:00:00');

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `sex` tinyint(1) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `adderss` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('1', 'admin', '123456', '0', '11111222222', '地址哈哈哈', 'aaa@qq.com');
INSERT INTO `login` VALUES ('2', 'cs1', '123456', '1', '22222222222', '地址顶顶顶', 'bbb@qq.com');
INSERT INTO `login` VALUES ('4', 'cs2', '123456', '0', '33333333333', '地址水水水', 'ccc@qq.com');
INSERT INTO `login` VALUES ('5', 'cs3', '123456', '1', '44444444444', '地址哒哒哒', 'ddd@qq.com');
INSERT INTO `login` VALUES ('6', 'cs5', '123456', '1', '55555555555', '地址嘎嘎嘎', 'eee@qq.com');
INSERT INTO `login` VALUES ('7', 'sss', 'sss', '1', '66666666666', '地址呱呱呱', 'fff@qq.com');
INSERT INTO `login` VALUES ('8', '11', '11', '0', '77777777777', '地址啵啵啵', 'ggg@qq.com');
INSERT INTO `login` VALUES ('10', 'cs6', '123456', '1', '11111111111', '地址得到的', '333@qq.com');
INSERT INTO `login` VALUES ('11', 'cs7', '123456', '0', '11111111111', '地址混合物', '333@qq.com');

-- ----------------------------
-- Table structure for pddetails
-- ----------------------------
DROP TABLE IF EXISTS `pddetails`;
CREATE TABLE `pddetails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pdname` varchar(255) DEFAULT NULL,
  `pdpic` varchar(255) DEFAULT NULL,
  `pdprice` varchar(255) DEFAULT NULL,
  `pdcontext` varchar(255) DEFAULT NULL,
  `pddate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pddetails
-- ----------------------------
INSERT INTO `pddetails` VALUES ('3', '魅族 18', '/img/pddetailsPic/16299664283282021-08-26_155529.png', '4555', '烦死了打开就傅雷考试到解放浪费', '2021-09-28 21:14:55');
INSERT INTO `pddetails` VALUES ('4', '魅族16', '/img/pddetailsPic/16299664427822021-08-26_155555.png', '4444', '老实交代佛我激将法', '2021-09-28 21:21:00');
INSERT INTO `pddetails` VALUES ('5', '魅族 18 pro', '/img/pddetailsPic/16299664577612021-08-26_155601.png', '5555', '法律是嫡女我我把那个小', '2021-09-28 21:22:04');
INSERT INTO `pddetails` VALUES ('6', '魅族 17 plus', '/img/pddetailsPic/16299664750692021-08-26_155620.png', '5154', '卡死都不收到了考高级我国', '2021-09-28 21:22:01');
INSERT INTO `pddetails` VALUES ('7', '魅族 POP2s 真无线', '/img/pddetailsPic/16299665575682021-08-26_155626.png', '6516', '地方士大夫士大夫说过', '2021-09-28 21:46:51');
INSERT INTO `pddetails` VALUES ('8', '魅族 18 液态硅胶壳', '/img/pddetailsPic/16299667076142021-08-26_155632.png', '6541', '司法部破我我去把公路局不倒绒就是百度过来币', '2021-09-28 21:46:55');
INSERT INTO `pddetails` VALUES ('9', '魅族18 Pro液态硅胶壳', '/img/pddetailsPic/16299667253732021-08-26_155639.png', '5378', '地方个我路我不会润肺龙虎榜是是乱丢关闭 科技部高', '2021-09-28 21:46:57');
INSERT INTO `pddetails` VALUES ('10', 'PANDAER 18 系列', '/img/pddetailsPic/16299667391152021-08-26_155645.png', '4354', '布狄卡反驳请批示 看似简单吧列表个会计师报代挂', '2021-09-28 21:46:59');
INSERT INTO `pddetails` VALUES ('11', '魅族LIpro LED系列', '/img/pddetailsPic/16299667516592021-08-26_155651.png', '4534', '剖if趣味IG看龙珠觉醒的不过开九点半更恐怖', '2021-09-28 21:47:01');
INSERT INTO `pddetails` VALUES ('12', '魅族 18 pro', '/img/pddetailsPic/16299667897402021-08-26_155529.png', '3453', '破IC鞠躬我万评估表科技部你 技能书的科技感IE就好好干', '2021-09-28 21:47:04');
INSERT INTO `pddetails` VALUES ('13', '魅族18', '/img/pddetailsPic/16299668056992021-08-26_155555.png', '7868', '客家话VIKI外汇管理局去奇偶哦金币哦尽可能GV', '2021-09-28 21:47:06');
INSERT INTO `pddetails` VALUES ('14', '魅族 17', '/img/pddetailsPic/16299668218942021-08-26_155620.png', '3334', '地方个人同居和让他风格化同一届人', '2021-09-28 21:47:08');
INSERT INTO `pddetails` VALUES ('15', '魅族 17 Pro', '/img/pddetailsPic/16299668364292021-08-26_155620.png', '3733', '东方红让他加房间二哈儿 ', '2021-09-28 21:47:10');
INSERT INTO `pddetails` VALUES ('16', '老用户专享', '/img/pddetailsPic/16299668674602021-08-26_160938.png', '8763', '方大化工让他加犯颜苦谏色违规额', '2021-09-28 21:47:12');
INSERT INTO `pddetails` VALUES ('17', '魅族 17 Pro 晓芳窖艺', '/img/pddetailsPic/16299669102982021-08-26_160950.png', '3873', '东方红发图感觉好ERT 跗骨结核地方和', '2021-09-28 21:47:14');
INSERT INTO `pddetails` VALUES ('18', '魅族17 航母限定版', '/img/pddetailsPic/16299669301652021-08-26_160957.png', '7837', '梵蒂冈东方红rjt6r额的', '2021-09-28 21:47:16');
INSERT INTO `pddetails` VALUES ('19', '魅族 POP2 真无线', '/img/pddetailsPic/16299670083122021-08-26_160039.png', '8737', '电饭锅点击让他加二想更二', '2021-09-28 21:47:18');
INSERT INTO `pddetails` VALUES ('20', '魅族 POP Pro 主动', '/img/classifyPic/16299670354522021-08-26_160057.png', '7373', '地方日记人而且管道符号复肝胶囊', '2021-09-28 21:47:20');
INSERT INTO `pddetails` VALUES ('21', '魅族 POP2s 真无线', '/img/classifyPic/16299670654462021-08-26_160103.png', '8383', '东方红尔特剧啥问题①㐇东方化工发给', '2021-09-28 21:47:25');
INSERT INTO `pddetails` VALUES ('22', '魅族HD60 降噪耳机', '/img/classifyPic/16299670938022021-08-26_160111.png', '8969', '地方ing破IE和脑婆其了可能了看见你十多个大号', '2021-09-28 21:47:26');
INSERT INTO `pddetails` VALUES ('23', '魅族 HD60 头戴式蓝牙耳机', '/img/classifyPic/16299671202192021-08-26_160118.png', '1233', ' 东方红风刀霜剑软件人或者大叫我泽东粉红色', '2021-09-28 21:47:28');
INSERT INTO `pddetails` VALUES ('24', '魅族 EP3C 耳机', '/img/classifyPic/16299671560592021-08-26_160140.png', '3453', '山东人为哈代发货等会大红包二等奖发图见过两个了床头柜都让人当然会', '2021-09-28 21:47:30');
INSERT INTO `pddetails` VALUES ('25', '魅族 18 液态硅胶壳', '/img/classifyPic/16299671947332021-08-26_160312.png', '2434', '的双方各电饭锅和二级放技能S好', '2021-09-28 21:47:32');
INSERT INTO `pddetails` VALUES ('26', '魅族18 Pro液态硅胶壳', '/img/classifyPic/16299672124122021-08-26_160322.png', '3335', '生日歌让人家圣経DD打扰好得很伏特加同一届', '2021-09-28 21:47:34');
INSERT INTO `pddetails` VALUES ('27', '魅族 18 系列', '/img/classifyPic/16299672356852021-08-26_160328.png', '4531', ' 生日蛋糕额大家猴年SR焦点访谈就额阿尔还以为', '2021-09-28 21:47:36');
INSERT INTO `pddetails` VALUES ('28', 'PANDAER 侠意保护', '/img/classifyPic/16299673097572021-08-26_160346.png', '7553', '电饭锅回去啊儿童节和东方货币大热天好的阿上德若谷', '2021-09-28 21:47:38');
INSERT INTO `pddetails` VALUES ('29', '魅族 18 系列手机保护壳', '/img/classifyPic/16299673396582021-08-26_160353.png', '3541', '十多个十多个dahlia天气奥尔加阿如果红包SEt', '2021-09-28 21:47:40');
INSERT INTO `pddetails` VALUES ('30', 'Pandaer readnap', '/img/classifyPic/16299673702062021-08-26_160415.png', '3345', '电饭锅の榕好阿而订货时代光华问发给', '2021-09-28 21:47:42');
INSERT INTO `pddetails` VALUES ('31', 'T FLYME 九周年纪念', '/img/classifyPic/16299673942762021-08-26_160447.png', '7321', '地方哥哥哥我款经典款廉洁奉公叫爸爸 ', '2021-09-28 21:47:44');
INSERT INTO `pddetails` VALUES ('32', '魅族 City Walk双肩包', '/img/classifyPic/16299674425422021-08-26_160458.png', '3335', '东方红让他加双方都华富国际4人', '2021-09-28 21:47:47');
INSERT INTO `pddetails` VALUES ('33', 'PANDAER [龍] T恤', '/img/classifyPic/16299674796762021-08-26_160505.png', '7831', '的师傅规范化收到个人同居s gdasf hasd hdrah e 地方够大', '2021-09-28 21:47:49');
INSERT INTO `pddetails` VALUES ('34', 'PANDAER 18 系列', '/img/classifyPic/16299675310192021-08-26_160518.png', '3545', '东方红Ethan阿尔法狗', '2021-09-28 21:47:50');
INSERT INTO `pddetails` VALUES ('35', '魅族Lipro LED 智能', '/img/classifyPic/16299675740852021-08-26_160543.png', '2111', '东方红3以后非的推介会', '2021-09-28 21:47:52');
INSERT INTO `pddetails` VALUES ('36', '魅族Lipro LED 简灯', '/img/classifyPic/16299675980202021-08-26_160556.png', '5421', '风格化为人烦得很摄入近人社局阮经天', '2021-09-28 21:47:55');
INSERT INTO `pddetails` VALUES ('37', '魅族Lipro LED 橱柜', '/img/classifyPic/16299676266342021-08-26_160606.png', '1233', '东方红4二青会发给很反感很反感', '2021-09-28 21:47:57');
INSERT INTO `pddetails` VALUES ('38', '魅族Lipro LED 灯泡', '/img/classifyPic/16299676521792021-08-26_160612.png', '2423', '风格化导航页房间法规及法规及人', '2021-09-28 21:47:58');
INSERT INTO `pddetails` VALUES ('39', '魅族Lipro LED 地脚', '/img/classifyPic/16299676835322021-08-26_160627.png', '2135', '柔荑花天河 让他让他让他加让他', '2021-09-28 21:48:00');
INSERT INTO `pddetails` VALUES ('40', 'Lipro LED 金属球泡', '/img/classifyPic/16299677140762021-08-26_160632.png', '4532', '电饭锅火热后台3就复肝胶囊房间', '2021-09-28 21:48:02');
INSERT INTO `pddetails` VALUES ('41', 'Lipro LED 射灯 可控', '/img/classifyPic/16299677488282021-08-26_160647.png', '5243', '士大夫大公会爱的很容易', '2021-09-28 21:48:04');
INSERT INTO `pddetails` VALUES ('42', 'Lipro LED 射灯 标准', '/img/classifyPic/16299677691572021-08-26_160654.png', '4531', '是都费事的问 电饭锅听机遇好可怜', '2021-09-28 21:48:05');

-- ----------------------------
-- Table structure for slideshow
-- ----------------------------
DROP TABLE IF EXISTS `slideshow`;
CREATE TABLE `slideshow` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `namepic` varchar(255) DEFAULT NULL,
  `pic` varchar(255) DEFAULT NULL,
  `createdate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of slideshow
-- ----------------------------
INSERT INTO `slideshow` VALUES ('21', '轮播图2', '/img/slideshowPic/163205010382916299661143762021-08-26_161908.png', '2021-09-13 00:00:00');
INSERT INTO `slideshow` VALUES ('22', '轮播图1', '/img/slideshowPic/16299661744872021-08-26_161923.png', '2021-10-26 12:52:54');
