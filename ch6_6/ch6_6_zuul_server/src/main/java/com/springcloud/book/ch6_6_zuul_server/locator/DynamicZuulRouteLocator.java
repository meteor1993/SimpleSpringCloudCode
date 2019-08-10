package com.springcloud.book.ch6_6_zuul_server.locator;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.springcloud.book.ch6_6_zuul_server.model.ZuulRoutesModel;
import com.springcloud.book.ch6_6_zuul_server.repository.ZuulRoutesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.RefreshableRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.SimpleRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties.ZuulRoute;
import org.springframework.util.StringUtils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2019/8/10
 * @Time: 23:54
 * @email: inwsy@hotmail.com
 * Description:
 */
@Slf4j
public class DynamicZuulRouteLocator extends SimpleRouteLocator implements RefreshableRouteLocator {

    @Autowired
    private ZuulProperties properties;

    @Autowired
    ZuulRoutesRepository zuulRoutesRepository;

    public DynamicZuulRouteLocator(String servletPath, ZuulProperties properties) {
        super(servletPath, properties);
        this.properties = properties;
    }

    @Override
    public void refresh() {
        doRefresh();
    }

    protected Map<String, ZuulRoute> locateRoutes() {
        Map<String, ZuulRoute> routes = Maps.newLinkedHashMap();
        List<ZuulRoutesModel> list = Lists.newArrayList(zuulRoutesRepository.findAll());
        list.forEach(entity -> {
            if (StringUtils.isEmpty(entity.getPath())) return;
            ZuulRoute zuulRoute = new ZuulRoute();
            BeanUtils.copyProperties(entity, zuulRoute);
            routes.put(zuulRoute.getPath(), zuulRoute);
        });

        LinkedHashMap<String, ZuulRoute> routesMap = Maps.newLinkedHashMap();
        routesMap.putAll(super.locateRoutes());
        routesMap.putAll(routes);
        LinkedHashMap<String, ZuulRoute> values = Maps.newLinkedHashMap();

        routesMap.forEach((key, value) -> {
            String path = key;
            if (!path.startsWith("/")) {
                path = "/" + path;
            }
            if (StringUtils.hasText(this.properties.getPrefix())) {
                path = this.properties.getPrefix() + path;
                if (!path.startsWith("/")) {
                    path = "/" + path;
                }
            }
            values.put(path, value);
        });

        return values;
    }
}
