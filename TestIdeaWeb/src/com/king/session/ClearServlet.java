package com.king.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pd on 2018/10/25 16:52
 */
@WebServlet(name = "ClearServlet",urlPatterns = "/clearSession")
public class ClearServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 清理session  方法一
        request.getSession(true).invalidate();

        // 方法二
        request.getSession(true).setMaxInactiveInterval(1);

        // 方法三


    }
}
