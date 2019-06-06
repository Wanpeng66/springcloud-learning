package com.sc.wp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: wp
 * @Title: webController
 * @Description: TODO
 * @date 2019/5/31 14:28
 */
@RestController
public class webController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String consumer(){
        return restTemplate.getForObject("http://eureka-client-prvider/dc", String.class);
    }
}
