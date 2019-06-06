package com.sc.wp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author: wp
 * @Title: webController
 * @Description: TODO
 * @date 2019/5/31 9:50
 */
@RestController
public class webController {

    @Value( "${provider.name}" )
    private String providerName;

    @Value( "${form}" )
    private String form;

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() throws InterruptedException {
        String services = "Services: " + discoveryClient.getServices();

        return providerName+"--->"+form+"--->"+services;
    }

}
