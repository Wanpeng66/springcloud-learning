package com.sc.wp.web;

import com.sc.wp.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wp
 * @Title: webController
 * @Description: TODO
 * @date 2019/6/4 16:42
 */
@RestController
public class webController {
    @Autowired
    private WebService webService;

    @GetMapping("/consumer")
    public String consumer(){
        return webService.consumer();
    }

}
