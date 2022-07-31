package com.example.vscoreapi.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "com.example.vscoreapi")
@EntityScan(value = "com.example.vsscoreapi.entity")
@EnableWebMvc
public class CommonConfig {
}
