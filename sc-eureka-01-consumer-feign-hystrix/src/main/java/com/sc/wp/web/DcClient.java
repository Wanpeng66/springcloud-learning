package com.sc.wp.web;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: wp
 * @Title: DcClient
 * @Description: TODO
 * @date 2019/5/31 14:49
 */
@FeignClient(name="eureka-client-prvider",fallbackFactory = MyFallBackFactory.class)
public interface DcClient {

    @GetMapping("/dc")
    public String dc();
}
