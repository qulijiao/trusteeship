/*
Navicat MySQL Data Transfer

Source Server         : sushe
Source Server Version : 50173
Source Host           : localhost:3306
Source Database       : sushe

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2014-07-29 23:25:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `roster`
-- ----------------------------
DROP TABLE IF EXISTS `roster`;
CREATE TABLE `roster` (
  `studentId` int(10) NOT NULL,
  `trusteeshipid` int(10) NOT NULL,
  `studentname` varchar(200) DEFAULT NULL,
  `years` varchar(200) DEFAULT NULL,
  `guardianname1` varchar(200) DEFAULT NULL,
  `guardianPhone1` varchar(200) DEFAULT NULL,
  `relationship1` varchar(200) DEFAULT NULL,
  `guardianname2` varchar(200) DEFAULT NULL,
  `guardianPhone2` varchar(200) DEFAULT NULL,
  `relationship2` varchar(200) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `sex` varchar(200) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`studentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of roster
-- ----------------------------
INSERT INTO `roster` VALUES ('1', '1', 'a', '3', 'b2', '123', '爸爸', 'c3', '4', '妈妈', '1', '', 'd4');
