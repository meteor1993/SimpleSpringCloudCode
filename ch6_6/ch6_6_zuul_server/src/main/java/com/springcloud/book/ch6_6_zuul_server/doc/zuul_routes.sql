SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for zuul_routes
-- ----------------------------
DROP TABLE IF EXISTS `zuul_routes`;
CREATE TABLE `zuul_routes`  (
  `id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `create_date` datetime(0) NULL DEFAULT NULL,
  `path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `service_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `strip_prefix` tinyint(1) NULL DEFAULT 1,
  `retryable` tinyint(1) NULL DEFAULT 0,
  `enabled` tinyint(1) NOT NULL DEFAULT 1,
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of zuul_routes
-- ----------------------------
INSERT INTO `zuul_routes` VALUES ('baidu', '2019-08-11 00:50:38', '/baidu/**', NULL, 'http://www.baidu.com', 1, 0, 1, 'redirectBaidu');
INSERT INTO `zuul_routes` VALUES ('client', '2019-08-11 00:50:40', '/spring-cloud-client-server/**', 'spring-cloud-client-server', NULL, 1, 0, 1, 'serviceId');
INSERT INTO `zuul_routes` VALUES ('localhost', '2019-08-11 00:50:43', '/client/**', NULL, 'http://localhost:8000', 1, 0, 1, 'url');

SET FOREIGN_KEY_CHECKS = 1;
