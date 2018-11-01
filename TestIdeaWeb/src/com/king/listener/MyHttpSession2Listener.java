package com.king.listener;

/**
 * Created by pd on 2018/10/26 11:33
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener()
public class MyHttpSession2Listener implements HttpSessionListener {

    // Public constructor is required by servlet spec
    public MyHttpSession2Listener() {
    }


    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {

        Object lineCount = se.getSession().getServletContext().getAttribute("lineCount");

        Integer count = null;

        if (lineCount == null) {
            lineCount = "0";
        }

        count = Integer.valueOf(lineCount.toString());
        count++;

        System.out.println("新上线1人,历史人数"+",当前人数:"+count);
        se.getSession().getServletContext().setAttribute("lineCount",count);

    }

    public void sessionDestroyed(HttpSessionEvent se) {
        Object lineCount = se.getSession().getServletContext().getAttribute("lineCount");
        Integer count = Integer.valueOf(lineCount.toString());
        count--;

        System.out.println("新下线1人,历史人数"+",当前人数:"+count);
        se.getSession().getServletContext().setAttribute("lineCount",count);
    }

}
