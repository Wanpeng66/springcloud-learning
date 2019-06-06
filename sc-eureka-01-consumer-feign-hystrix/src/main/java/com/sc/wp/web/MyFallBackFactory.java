package com.sc.wp.web;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author: wp
 * @Title: MyFallBackFactory
 * @Description: TODO
 * @date 2019/6/5 11:13
 */
@Component
public class MyFallBackFactory implements FallbackFactory<DcClient> {
    @Override
    public DcClient create( Throwable throwable ) {
        return new DcClient() {
            @Override
            public String dc() {
                return "Execute raw fallback: access service fail ,  reason = " + throwable;
            }
        };
    }
}
