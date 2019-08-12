package com.springcloud.book.ch7_1_data_service.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @Date: 2019/8/12 9:35
 * @Version: 1.0
 * @Desc:
 */
@Entity
@Table(name = "user_info")
@Data
public class UserInfoModel {
    @Id
    @GeneratedValue(generator = "paymentableGenerator")
    @GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
    @Column(name ="ID",nullable=false,length=36)
    private String id;

    private String name;

    private String age;

    private String sex;

    private String userLoginId;
}
