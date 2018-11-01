package com.king;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pd on 2018/10/24 13:57
 */
@WebServlet(name = "RequestServlet",urlPatterns = "/reqTest")
public class RequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.addDateHeader("Date1",System.currentTimeMillis());

        response.setContentType("text/html;charset=UTF-8");

        // 刷新 5秒 跳转路径   外部跳转
//        response.setHeader("Refresh","5;URL=http://www.baidu.com");
        // 内部跳转
        response.setHeader("Refresh","5;URL=pages/getTest.html");

        PrintWriter out = response.getWriter();
//        out.print("" + request.getPathInfo());
//        out.print("<br>" + request.getPathInfo());

        String temp = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "    <head>\n" +
                "        <meta charset=\"UTF-8\">\n" +
                "        <title>Title</title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <p>servletContext:" +  request.getServletContext() + "</p>\n" +
                "        <p>contextPath:" +  request.getContextPath() + "</p>\n" +
                "        <p>servletPath:" +  request.getServletPath() + "</p>\n" +
                "        <p>requestURI:" +  request.getRequestURI() + "</p>\n" +
                "        <p>requestURL:" +  request.getRequestURL() + "</p>\n" +
                "        <p>remoteUser:" +  request.getRemoteUser() + "</p>\n" +
                "    </body>\n" +
                "</html>";

        out.print(temp);
    }
}
