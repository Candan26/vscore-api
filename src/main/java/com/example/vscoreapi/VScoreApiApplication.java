package com.example.vscoreapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@Slf4j
public class VScoreApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(VScoreApiApplication.class, args);
    }

}
