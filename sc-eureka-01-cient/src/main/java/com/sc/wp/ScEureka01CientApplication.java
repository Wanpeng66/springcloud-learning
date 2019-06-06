package com.sc.wp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ScEureka01CientApplication {

    public static void main( String[] args ) {
        SpringApplication.run( ScEureka01CientApplication.class, args );
    }

}
