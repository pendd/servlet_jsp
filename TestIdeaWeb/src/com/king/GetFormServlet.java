package com.king;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pd on 2018/10/23 16:18
 */
@WebServlet("/GetFormServlet")
public class GetFormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 解决乱码问题
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");

        out.print("<!DOCTYPE html>");
        out.print("<html lang=\"en\">");
        out.print("<head>");
        out.print("<meta charset=\"UTF-8\">");
        out.print("<title>Title</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<p>姓名是："+username+"</p>");
        out.print("<p>密码是："+pwd+"</p>");
        out.print("</body>");
        out.print("</html>");
    }
}
