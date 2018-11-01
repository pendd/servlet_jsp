package com.king.api;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pd on 2018/10/30 9:43
 */
@WebServlet(name = "TestGetServlet",urlPatterns = "/testGet")
public class TestGetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        // 最简跨域
        response.setHeader("Access-Control-Allow-Origin","*");

        String name = request.getParameter("name");

        response.getWriter().print("我是一个get请求返回的字符串-----" + name);

    }
}
