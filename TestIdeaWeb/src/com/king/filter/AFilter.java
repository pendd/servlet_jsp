package com.king.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 * Created by pd on 2018/10/26 9:26
 */
/*@WebFilter(filterName = "AFilter",urlPatterns = "/*",
        initParams = {@WebInitParam(name = "name" , value = "king"),
                @WebInitParam(name = "age" , value = "18")})*/
public class AFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("A doFilter被执行");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        String name = config.getInitParameter("name");
        String age = config.getInitParameter("age");
        System.out.println("AFilter----"+name+"    "+age);
    }

}
