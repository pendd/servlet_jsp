package com.king.listener;

/**
 * Created by pd on 2018/10/26 11:40
 */

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener()
public class MyRequestListener implements ServletRequestListener {

    public MyRequestListener() {

    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        Object count = sre.getServletContext().getAttribute("lineCount");
        System.out.println("request监听中的全局信息"+count);

        String name = sre.getServletRequest().getParameter("name");
        System.out.println("request监听中的name"+count);
    }
}
