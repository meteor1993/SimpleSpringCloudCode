package com.springcloud.book.ch9_7_gateway_dynamic_routing.entity;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by daixueyun on 2019/8/22 0022.
 *
 * 过滤器实体类
 */
public class FilterEntity {

    //过滤器对应的Name
    private String name;

    //路由规则
    private Map<String, String> map = new LinkedHashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
