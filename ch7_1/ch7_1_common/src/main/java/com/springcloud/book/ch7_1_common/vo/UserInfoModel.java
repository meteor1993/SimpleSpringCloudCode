package com.springcloud.book.ch7_1_common.vo;

import lombok.Data;

/**
 * @Date: 2019/8/12 9:35
 * @Version: 1.0
 * @Desc:
 */
@Data
public class UserInfoModel {
    private String id;

    private String name;

    private String age;

    private String sex;

    private String userLoginId;
}
