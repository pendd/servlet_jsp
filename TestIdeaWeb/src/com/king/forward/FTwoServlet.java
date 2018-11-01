package com.king.forward;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pd on 2018/10/25 9:27
 */
@WebServlet(name = "FTwoServlet",urlPatterns = "/fTwo")
public class FTwoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("post 第二个页面被输出被执行");


        String name = request.getParameter("name");
        String sex = request.getParameter("sex");

        out.println(name+"======="+sex);

        String extra = (String)request.getAttribute("extra");

        out.println("extra:"+extra);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("get 第二个页面被输出被执行");


        String name = request.getParameter("name");
        String sex = request.getParameter("sex");

        out.println(name+"======="+sex);

        String extra = (String)request.getAttribute("extra");

        out.println("extra:"+extra);
    }
}
