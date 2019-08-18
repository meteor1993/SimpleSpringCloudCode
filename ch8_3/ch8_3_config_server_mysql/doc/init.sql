SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for properties
-- ----------------------------
DROP TABLE IF EXISTS `properties`;
CREATE TABLE `properties`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `KEY` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `VALUE` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `APPLICATION` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `PROFILE` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `LABLE` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of properties
-- ----------------------------
INSERT INTO `properties` VALUES (1, 'com.springcloud.book', 'Hello, i am dev from mysql.', 'springcloud-config', 'dev', 'master');
INSERT INTO `properties` VALUES (2, 'com.springcloud.book', 'Hello, i am test from mysql.', 'springcloud-config', 'test', 'master');
INSERT INTO `properties` VALUES (3, 'com.springcloud.book', 'Hello, i am prod from mysql.', 'springcloud-config', 'prod', 'master');

SET FOREIGN_KEY_CHECKS = 1;
