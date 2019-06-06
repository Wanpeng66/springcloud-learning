package com.sc.wp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class ScEureka01ConsumerFeignHystrixApplication {

    public static void main( String[] args ) {
        SpringApplication.run( ScEureka01ConsumerFeignHystrixApplication.class, args );
    }

}
