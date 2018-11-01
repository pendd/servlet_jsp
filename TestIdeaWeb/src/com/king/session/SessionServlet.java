package com.king.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by pd on 2018/10/25 16:18
 */
@WebServlet(name = "SessionServlet",urlPatterns = "/sessionTest")
public class SessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        // 如果session不存在 创建session
        HttpSession session = request.getSession(true);

        // session创建时间
        Date createTime = new Date(session.getCreationTime());

        // session最后一次访问时间
        Date lastTime = new Date(session.getLastAccessedTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        // 计数器
        String countKey = "count";
        Integer count = 0;
        String uidKey = "uid";
        String uid = request.getParameter("uid");

        // 检查是否有新的访问者
        if (session.isNew()) {
            // 给session设置属性
            session.setAttribute(uidKey,uid);
        } else {

            count = (Integer) session.getAttribute(countKey);

            count = count + 1;

            uid = (String) session.getAttribute(uidKey);
        }

        session.setAttribute(countKey,count);

        String temp = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "    <head>\n" +
                "        <meta charset=\"UTF-8\">\n" +
                "        <title>Title</title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <p>session id: "+session.getId()+"  </p>\n" +
                "        <p>创建时间: "+sdf.format(createTime)+"  </p>\n" +
                "        <p>最后访问时间:  "+sdf.format(lastTime)+" </p>\n" +
                "        <p>uid:  "+uid+"  </p>\n" +
                "        <p>访问次数:  "+count+"  </p>\n" +
                "    </body>\n" +
                "</html>";


        response.getWriter().write(temp);
    }
}
