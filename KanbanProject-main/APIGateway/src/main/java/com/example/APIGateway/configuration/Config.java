package com.example.APIGateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route(p -> p.path("/api/v1/auth/**")
                        .uri("http://auth-service:3033/"))
                .route(p -> p.path("/api/v1/project/**")
                        .uri("http://kanban-service:8007/"))
                .route(p -> p.path("/api/v1/user/**")
                        .uri("http://kanban-service:8007/"))
                .route(p -> p.path("/api/v1/notifications/**")
                        .uri("http://notification-service:8090/"))
                .build();
    }
}
