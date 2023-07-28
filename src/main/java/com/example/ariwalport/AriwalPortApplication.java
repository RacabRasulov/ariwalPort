package com.example.ariwalport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AriwalPortApplication {

    public static void main(String[] args) {
        SpringApplication.run(AriwalPortApplication.class, args);
    }

}
