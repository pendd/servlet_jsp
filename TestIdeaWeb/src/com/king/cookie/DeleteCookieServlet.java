package com.king.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pd on 2018/10/25 14:12
 */
@WebServlet(name = "DeleteCookieServlet",urlPatterns = "/cookieDelete")
public class DeleteCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 获取cookie
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().compareTo("pwd") == 0) {
                    // 设置cookie声明周期为0  即删除cookie
                    cookies[i].setMaxAge(0);

                    // 添加cookie
                    response.addCookie(cookies[i]);
                }
            }
        }
    }
}
