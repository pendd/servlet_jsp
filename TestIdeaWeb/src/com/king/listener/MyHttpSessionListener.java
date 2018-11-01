package com.king.listener;

/**
 * Created by pd on 2018/10/26 11:12
 */

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener()
public class MyHttpSessionListener implements HttpSessionListener{


    public MyHttpSessionListener() {
    }


    public void sessionCreated(HttpSessionEvent se) {

        System.out.println("session被创建了");

        ServletContext context = se.getSession().getServletContext();

        Integer nums = (Integer) context.getAttribute("numSessions");

        if (nums == null) {
            nums = new Integer(0);
        } else {

            int count = nums.intValue();

            nums = new Integer(count + 1);
        }

        context.setAttribute("numSessions",nums);
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("session被销毁了");

        ServletContext context = se.getSession().getServletContext();

        Integer nums = (Integer) context.getAttribute("numSessions");

        if (nums == null) {
            nums = new Integer(0);
        } else {
            nums -= 1;
        }

        context.setAttribute("numSessions",nums);

    }

}
