SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `age` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `user_login_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('af321d42-bd0c-11e9-a0d0-00163e0a9c22', '18', 'guest', 'man', 'a2a785da-bd0c-11e9-a0d0-00163e0a9c22');

-- ----------------------------
-- Table structure for user_login
-- ----------------------------
DROP TABLE IF EXISTS `user_login`;
CREATE TABLE `user_login`  (
  `id` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `login_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_login
-- ----------------------------
INSERT INTO `user_login` VALUES ('a2a785da-bd0c-11e9-a0d0-00163e0a9c22', 'guest', 'guest');

SET FOREIGN_KEY_CHECKS = 1;
