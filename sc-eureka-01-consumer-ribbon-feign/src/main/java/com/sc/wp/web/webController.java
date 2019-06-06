package com.sc.wp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wp
 * @Title: webController
 * @Description: TODO
 * @date 2019/5/31 14:48
 */
@RestController
public class webController {

    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public String consumer(){
        return dcClient.dc();
    }
}
