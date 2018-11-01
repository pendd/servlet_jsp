package com.king.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

/**
 * Created by pd on 2018/10/25 11:47
 */


@WebServlet(name = "ReadCookieServlet",urlPatterns = "/cookieRead")
public class ReadCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        // 获取cookie
        Cookie[] cookies = request.getCookies();

        String temp1 = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "    <head>\n" +
                "        <meta charset=\"UTF-8\">\n" +
                "        <title>Title</title>\n" +
                "    </head>\n" +
                "    <body>";

        String temp2 = " </body>\n" +
                "</html>";

        PrintWriter out = response.getWriter();

        out.print(temp1);

        if (cookies != null) {

            for (int i = 0; i < cookies.length; i++) {

                System.out.println(cookies[i].getName()+"::::"+cookies[i].getValue());
//                out.print("<p>"+cookies[i].getName()+"::::"+cookies[i].getValue()+"</p>");
                out.print("<p>"+cookies[i].getName()+"::::"+ URLDecoder.decode(cookies[i].getValue(),"UTF-8") +"</p>");
            }

        }

        out.print(temp2);

    }
}
