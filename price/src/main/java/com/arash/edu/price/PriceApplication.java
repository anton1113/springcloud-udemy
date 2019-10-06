package com.arash.edu.price;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@EnableEurekaClient
@SpringBootApplication
public class PriceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PriceApplication.class, args);
    }

}
