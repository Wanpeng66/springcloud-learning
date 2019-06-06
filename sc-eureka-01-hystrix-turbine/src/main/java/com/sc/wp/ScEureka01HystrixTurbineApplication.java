package com.sc.wp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbine
public class ScEureka01HystrixTurbineApplication {

    public static void main( String[] args ) {
        SpringApplication.run( ScEureka01HystrixTurbineApplication.class, args );
    }

}
