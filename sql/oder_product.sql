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

 Date: 30/03/2024 11:26:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for oder_product
-- ----------------------------
DROP TABLE IF EXISTS `oder_product`;
CREATE TABLE `oder_product`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `ordercode` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '订单号',
  `productcode` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '产品代码',
  `quantity` double NULL DEFAULT NULL COMMENT '数量：桶',
  `weight` double NULL DEFAULT NULL COMMENT '重量',
  `unitprice` decimal(10, 2) NULL DEFAULT NULL COMMENT '单价 \\吨',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of oder_product
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
