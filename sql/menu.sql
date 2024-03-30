/*
 Navicat Premium Data Transfer

 Source Server         : CRM
 Source Server Type    : MySQL
 Source Server Version : 80036
 Source Host           : localhost:3306
 Source Schema         : crm

 Target Server Type    : MySQL
 Target Server Version : 80036
 File Encoding         : 65001

 Date: 28/03/2024 09:08:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `menucode` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `menuname` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `parentid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `level` int NOT NULL,
  `is_delete` int NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '1000', '首页', '0', '/home', 0, 0);
INSERT INTO `menu` VALUES ('2', '1100', '系统管理', '0', '#', 0, 0);
INSERT INTO `menu` VALUES ('3', '1101', '系统日志', '1100', NULL, 1, 0);
INSERT INTO `menu` VALUES ('4', '1102', '菜单管理', '1100', '/system/menulist', 1, 0);
INSERT INTO `menu` VALUES ('5', '1103', '角色管理', '1100', NULL, 1, 0);
INSERT INTO `menu` VALUES ('6', '1104', '用户管理', '1100', NULL, 1, 0);
INSERT INTO `menu` VALUES ('7', '1200', '订单管理', '0', '#', 0, 0);
INSERT INTO `menu` VALUES ('8', '1300', '商品管理', '0', '#', 0, 0);

SET FOREIGN_KEY_CHECKS = 1;
