package com.restapi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.example.demo"})
public class RestAPIApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestAPIApplication.class, args);
    }

}
