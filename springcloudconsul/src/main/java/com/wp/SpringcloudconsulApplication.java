package com.wp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringcloudconsulApplication {

    @GetMapping("/health")
    public String health( Model model ){
       return "success";
    }

    public static void main( String[] args ) {
        SpringApplication.run( SpringcloudconsulApplication.class, args );
    }

}
