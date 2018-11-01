package com.king.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

/**
 * Created by pd on 2018/10/25 11:47
 */


@WebServlet(name = "CookieServlet",urlPatterns = "/cookieAdd")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        // 创建cookie
//        Cookie name = new Cookie("name","123");
//        Cookie name = new Cookie("name",request.getParameter("name"));
        Cookie name = new Cookie("name", URLEncoder.encode(request.getParameter("name"),"UTF-8"));

        Cookie pwd = new Cookie("pwd",request.getParameter("pwd"));

        // 给cookie设置超时时间
        name.setMaxAge(60 * 60 * 12);
        pwd.setMaxAge(60 * 60 * 24);

        // 添加cookie
        response.addCookie(name);
        response.addCookie(pwd);

        PrintWriter out = response.getWriter();

        out.print("<!DOCTYPE html>");
        out.print("<html lang=\"en\">");
        out.print("<head>");
        out.print("<meta charset=\"UTF-8\">");
        out.print("<title>Title</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<p>姓名是："+request.getParameter("name")+"</p>");
        out.print("<p>密码是："+request.getParameter("pwd")+"</p>");
        out.print("<p>cookie中姓名是："+name+"------ "+name.getValue()+"</p>");
        out.print("<p>cookie中密码是："+pwd+"------ "+pwd.getValue()+"</p>");
        out.print("</body>");
        out.print("</html>");

    }
}
