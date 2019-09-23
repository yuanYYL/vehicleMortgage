package com.louis.kitty.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KittyEruakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(KittyEruakeApplication.class, args);
    }

}
