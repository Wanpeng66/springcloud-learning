package com.sc.wp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: wp
 * @Title: webController
 * @Description: TODO
 * @date 2019/5/31 14:05
 */

@RestController
public class webController {

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String consumer(){
        ServiceInstance instance = loadBalancerClient.choose( "eureka-client-prvider" );
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/dc";
        System.out.println(url);
        return "服务提供者返回的结果为："+restTemplate.getForObject(url, String.class);
    }
}
