package com.example.vscoreapi;

import com.example.vscoreapi.config.CommonConfig;
import com.example.vscoreapi.config.SwaggerConfig;
import com.example.vscoreapi.config.WebConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Slf4j
@Import(value = {CommonConfig.class, WebConfig.class, SwaggerConfig.class})
public class VScoreApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(VScoreApiApplication.class, args);
    }
}
