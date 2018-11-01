package com.king.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 * Created by pd on 2018/10/26 9:55
 */
/*@WebFilter(filterName = "EncodingFilter",urlPatterns = "/*",
            initParams = @WebInitParam(name = "encoding",value = "UTF-8"))*/
public class EncodingFilter implements Filter {

    String encoding = null;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        if (!encoding.equals(req.getCharacterEncoding())) {
            // 设置编码格式
            req.setCharacterEncoding(encoding);
        }

        resp.setCharacterEncoding(encoding);

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        encoding = config.getInitParameter("encoding");

        if (encoding == null) {
            // 发生异常
            throw new ServletException("encoding设置为空");
        }
    }

}
