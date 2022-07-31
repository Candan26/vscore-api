package com.example.vscoreapi.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class InfoServiceConfig {
    @Value("${request.customer.id}")
    private String customerId;
    @Value("${request.api.key}")
    private String apiKey;
    @Value("${request.account.life.cycle.event}")
    private String accountLifecycleEvent;
}
