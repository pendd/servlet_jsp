package com.king.listener;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pd on 2018/10/26 11:21
 */
@WebServlet(name = "CheckSessionServlet",urlPatterns = "/sessionCheck")
public class CheckSessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        response.getWriter().print("<p>nums:"+ getServletContext().getAttribute("numSessions") +"</p>");

    }
}
