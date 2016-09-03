package io.github.akaitsuki.bookstore.gateway.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

/**
 * Created by Jiachi on 9/3/2016.
 */
@Component
public class CustomHeaderZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpSession session = ctx.getRequest().getSession(false);
        if(session != null){
            ctx.addZuulRequestHeader("x-auth-token", session.getId());
        }else {
            ctx.addZuulRequestHeader("x-auth-token", null);
        }
        return null;
    }
}
