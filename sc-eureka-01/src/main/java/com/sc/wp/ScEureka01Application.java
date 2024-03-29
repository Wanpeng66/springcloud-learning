package com.sc.wp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ScEureka01Application {

    public static void main( String[] args ) {
        SpringApplication.run( ScEureka01Application.class, args );
    }

}
