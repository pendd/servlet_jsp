package com.king;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pd on 2018/10/23 13:45
 */
@WebServlet(name = "HelloServlet",urlPatterns = "/hello",loadOnStartup = 0)   // loadOnStartup根据数值来决定初始化的先后顺序
public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("helloServlet-----初始化");
        super.init();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("hello world");
    }
}
