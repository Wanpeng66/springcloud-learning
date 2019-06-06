package com.sc.wp.filter;

import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: wp
 * @Title: ZuulFilter
 * @Description: TODO
 * @date 2019/6/5 14:08
 */
@Component
public class ZuulFilter extends com.netflix.zuul.ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String accessToken = request.getParameter( "accessToken" );
        if(StringUtils.isBlank( accessToken )){
            currentContext.setSendZuulResponse( false );
            currentContext.setResponseStatusCode( 401 );
            return null;
        }

        return null;
    }
}
