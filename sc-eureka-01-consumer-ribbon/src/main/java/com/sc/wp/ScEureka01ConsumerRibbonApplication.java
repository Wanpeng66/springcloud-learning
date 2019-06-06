package com.sc.wp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.naming.Name;

@EnableDiscoveryClient
@SpringBootApplication
public class ScEureka01ConsumerRibbonApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate(  );
    }

    public static void main( String[] args ) {
        SpringApplication.run( ScEureka01ConsumerRibbonApplication.class, args );
    }

}
