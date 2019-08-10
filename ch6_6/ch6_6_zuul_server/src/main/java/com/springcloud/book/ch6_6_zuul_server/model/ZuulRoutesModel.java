package com.springcloud.book.ch6_6_zuul_server.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/10
 * @Time: 23:50
 * @email: inwsy@hotmail.com
 * Description:
 */
@Entity
@Table(name = "zuul_routes")
@Data
public class ZuulRoutesModel {
    @Id
    @GeneratedValue(generator = "paymentableGenerator")
    @GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
    @Column(name ="ID",nullable=false,length=36)
    private String id;

    private Date createDate;

    private String path;

    private String serviceId;

    private String url;

    private boolean stripPrefix = true;

    private Boolean retryable;

    private Boolean enabled;

    private String description;
}
