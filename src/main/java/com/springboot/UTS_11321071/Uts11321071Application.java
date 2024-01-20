package com.springboot.UTS_11321071;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.springboot.UTS_11321071.model")
public class Uts11321071Application {
    public static void main(String[] args) {
        SpringApplication.run(Uts11321071Application.class, args);
    }
}
