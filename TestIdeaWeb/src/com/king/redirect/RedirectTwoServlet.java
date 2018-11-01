package com.king.redirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pd on 2018/10/25 11:19
 */
@WebServlet(name = "RedirectTwoServlet",urlPatterns = "/redirectTwo")
public class RedirectTwoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");


        response.setStatus(response.SC_MOVED_TEMPORARILY);
        response.setHeader("Location","http://www.baidu.com");


    }
}
