package com.king;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pd on 2018/10/24 15:39
 */
@WebServlet(name = "ServletContextServlet",urlPatterns = "/testServletContext")
public class ServletContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取上下文对象  getServletContext()  或者  getServletConfig().getServletContext()

        // 获取上下文对象
        ServletContext context = getServletConfig().getServletContext();

        String db_url = context.getInitParameter("DB_URL");
        String db_user = context.getInitParameter("DB_USER");
        String db_pwd = context.getInitParameter("DB_PWD");

        PrintWriter out = response.getWriter();
        out.print(db_url+"----"+db_user+"----"+db_pwd);
    }
}
