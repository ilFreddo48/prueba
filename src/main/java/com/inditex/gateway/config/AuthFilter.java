package com.inditex.gateway.config;

import com.inditex.gateway.exception.ApiKeyException;
import com.inditex.gateway.exception.ApiKeyNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class AuthFilter extends AbstractGatewayFilterFactory<AuthFilter.Config> {

    private final WebClient.Builder webClientBuilder;

    private final String API_KEY_HEADER = "API-KEY";
    @Value("${api.key}")
    private String API_KEY_VALUE;

    public AuthFilter(WebClient.Builder webClientBuilder) {
        super(Config.class);
        this.webClientBuilder = webClientBuilder;
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            if (!exchange.getRequest().getHeaders().containsKey(API_KEY_HEADER)) {
                    throw new IllegalArgumentException("Missing API-KEY information");
            }

            String key = exchange.getRequest().getHeaders().get(API_KEY_HEADER).get(0);

            if (!API_KEY_VALUE.equals(key)) {
                    throw new IllegalArgumentException("Incorrect API-KEY structure");
            }

            return chain.filter(exchange);

        };
    }

    public static class Config {
        // empty class as I don't need any particular configuration
    }
}
