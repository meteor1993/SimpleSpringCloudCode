package com.springcloud.book.ch14_1_dubbo_api.model;

import lombok.Data;

/**
 * @Date: 2019/9/2 17:32
 * @Version: 1.0
 * @Desc:
 */
@Data
public class UserModel {
    private Long id;

    private String name;

    private Integer age;
}
