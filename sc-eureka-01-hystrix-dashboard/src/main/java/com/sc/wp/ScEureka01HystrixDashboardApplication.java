package com.sc.wp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringCloudApplication
@EnableHystrixDashboard
public class ScEureka01HystrixDashboardApplication {

    public static void main( String[] args ) {
        SpringApplication.run( ScEureka01HystrixDashboardApplication.class, args );
    }

}
