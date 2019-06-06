package com.sc.wp.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: wp
 * @Title: webService
 * @Description: TODO
 * @date 2019/6/4 16:43
 */
@Service
public class WebService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer() {
        return restTemplate.getForObject( "http://EUREKA-CLIENT-PRVIDER/dc",String.class );
    }

    public String fallback(){
        return "fallback...";
    }
}
