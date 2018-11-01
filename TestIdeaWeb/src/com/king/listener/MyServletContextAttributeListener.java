package com.king.listener; /**
 * Created by pd on 2018/10/26 13:39
 */

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener()
public class MyServletContextAttributeListener implements ServletContextAttributeListener {

    // Public constructor is required by servlet spec
    public MyServletContextAttributeListener() {
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        ServletContext context = scae.getServletContext();

        String name = scae.getName();
        Object value = scae.getValue();

        System.out.println("属性变化----" + name + "   " + value);
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {

        String name = scae.getName();
        Object value = scae.getValue();

        System.out.println("属性被移除----" + name + "   " + value);
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {

    }
}
