package com.springcloud.book.ch9_7_gateway_dynamic_routing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.event.RefreshRoutesEvent;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionWriter;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * Created by daixueyun on 2019/8/22 0022.
 */
@Service
public class DynamicRoutingService implements ApplicationEventPublisherAware {

    @Autowired
    private RouteDefinitionWriter routeDefinitionWriter;

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    /**
     * 添加路由
     * @param routeDefinition
     * @return
     */
    public String add(RouteDefinition routeDefinition){
        routeDefinitionWriter.save(Mono.just(routeDefinition)).subscribe();
        this.applicationEventPublisher.publishEvent(new RefreshRoutesEvent(this));
        return "success";
    }

    /**
     * 修改路由
     * @param routeDefinition
     * @return
     */
    public String update(RouteDefinition routeDefinition){

        try {
            this.routeDefinitionWriter.delete(Mono.just(routeDefinition.getId()));
        }catch (Exception e){
            return "update route fail, routeId:"+routeDefinition.getId();
        }

        try {
            routeDefinitionWriter.save(Mono.just(routeDefinition)).subscribe();
            this.applicationEventPublisher.publishEvent(new RefreshRoutesEvent(this));
            return "success";
        }catch (Exception e){
            return "update route fail";
        }
    }

    /**
     * 删除路由
     * @param id
     * @return
     */
    public String delete(String id){
        try {
            this.routeDefinitionWriter.delete(Mono.just(id));
            return "delete success";
        } catch (Exception e) {
            e.printStackTrace();
            return "delete fail";
        }
    }
}
