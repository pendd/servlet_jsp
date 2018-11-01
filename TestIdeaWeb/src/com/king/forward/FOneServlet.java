package com.king.forward;

import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "FOneServlet",urlPatterns = "/fOne")
public class FOneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("post 请求被执行");

        String name = request.getParameter("name");
        String sex = request.getParameter("sex");

        out.println(name+"-----"+sex);

        request.setAttribute("extra","我是one的post额外数据");

        RequestDispatcher rd = request.getRequestDispatcher("/fTwo");

        rd.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("get 请求被执行");

        // 不建议使用 会有异常
//        out.flush();

        String name = request.getParameter("name");
        String sex = request.getParameter("sex");

        out.println(name+"-----"+sex);

        request.setAttribute("extra","我是one的额外数据");

        RequestDispatcher rd = request.getRequestDispatcher("/fTwo");

        rd.forward(request,response);

        System.out.println("222222");
    }
}
