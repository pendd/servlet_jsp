package com.king.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by pd on 2018/10/26 9:26
 */
public class BFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("B  doFilter被执行-------------");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

        // 获取初始化参数
        String info = config.getInitParameter("info");
        String extra = config.getInitParameter("extra");

        System.out.println("BFilter 过滤器被初始化了"+info+"           "+extra);
    }

}
