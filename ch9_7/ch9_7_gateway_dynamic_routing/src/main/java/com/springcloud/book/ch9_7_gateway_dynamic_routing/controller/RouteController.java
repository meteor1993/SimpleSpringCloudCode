package com.springcloud.book.ch9_7_gateway_dynamic_routing.controller;

import com.springcloud.book.ch9_7_gateway_dynamic_routing.entity.FilterEntity;
import com.springcloud.book.ch9_7_gateway_dynamic_routing.entity.PredicateEntity;
import com.springcloud.book.ch9_7_gateway_dynamic_routing.entity.RouteEntity;
import com.springcloud.book.ch9_7_gateway_dynamic_routing.service.DynamicRoutingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.FilterDefinition;
import org.springframework.cloud.gateway.handler.predicate.PredicateDefinition;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by daixueyun on 2019/8/22 0022.
 */
@RestController
@RequestMapping("/route")
public class RouteController {

    @Autowired
    private DynamicRoutingService dynamicRoutingService;

    @PostMapping("/add")
    public String add(@RequestBody RouteEntity routeEntity){
        try {
            RouteDefinition definition = assembleRouteDefinition(routeEntity);
            return this.dynamicRoutingService.add(definition);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }

    @PostMapping("/update")
    public String update(@RequestBody RouteEntity routeEntity) {
        RouteDefinition definition = assembleRouteDefinition(routeEntity);
        return this.dynamicRoutingService.update(definition);
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        return this.dynamicRoutingService.delete(id);
    }

    private RouteDefinition assembleRouteDefinition(RouteEntity routeEntity) {

        RouteDefinition definition = new RouteDefinition();

        // ID
        definition.setId(routeEntity.getId());

        // Predicates
        List<PredicateDefinition> pdList = new ArrayList<>();
        for (PredicateEntity predicateEntity: routeEntity.getPredicateEntityList()) {
            PredicateDefinition predicateDefinition = new PredicateDefinition();
            predicateDefinition.setArgs(predicateEntity.getMap());
            predicateDefinition.setName(predicateEntity.getName());
            pdList.add(predicateDefinition);
        }
        definition.setPredicates(pdList);

        // Filters
        List<FilterDefinition> fdList = new ArrayList<>();
        for (FilterEntity filterEntity: routeEntity.getFilterEntityList()) {
            FilterDefinition filterDefinition = new FilterDefinition();
            filterDefinition.setArgs(filterEntity.getMap());
            filterDefinition.setName(filterEntity.getName());
            fdList.add(filterDefinition);
        }
        definition.setFilters(fdList);

        // URI
        URI uri = UriComponentsBuilder.fromUriString(routeEntity.getUri()).build().toUri();
        definition.setUri(uri);

        return definition;
    }
}
