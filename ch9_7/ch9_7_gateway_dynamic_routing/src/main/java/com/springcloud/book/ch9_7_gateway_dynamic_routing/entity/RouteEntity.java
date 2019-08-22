package com.springcloud.book.ch9_7_gateway_dynamic_routing.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daixueyun on 2019/8/22 0022.
 *
 * 路由实体类
 */
public class RouteEntity {

    //路由id
    private String id;

    //路由断言集合
    private List<PredicateEntity> predicateEntityList = new ArrayList<>();

    //路由过滤器集合
    private List<FilterEntity> filterEntityList = new ArrayList<>();

    //路由转发的目标uri
    private String uri;

    //路由执行的顺序
    private int order = 0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<PredicateEntity> getPredicateEntityList() {
        return predicateEntityList;
    }

    public void setPredicateEntityList(List<PredicateEntity> predicateEntityList) {
        this.predicateEntityList = predicateEntityList;
    }

    public List<FilterEntity> getFilterEntityList() {
        return filterEntityList;
    }

    public void setFilterEntityList(List<FilterEntity> filterEntityList) {
        this.filterEntityList = filterEntityList;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
