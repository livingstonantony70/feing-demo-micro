package com.example.feingdemomicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeingDemoMicroApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeingDemoMicroApplication.class, args);
    }

}
