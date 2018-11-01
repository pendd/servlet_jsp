package com.king.listener;

/**
 * Created by pd on 2018/10/26 10:21
 */

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@WebListener()
public class MyServletContextListener implements ServletContextListener {

    public MyServletContextListener() {
    }

    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();

        String db_url = context.getInitParameter("DB_URL");
        String db_user = context.getInitParameter("DB_USER");
        String db_pwd = context.getInitParameter("DB_PWD");

        String driver = "oracle.jdbc.driver.OracleDriver";

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(db_url,db_user,db_pwd);

            context.setAttribute("DBConn",conn);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void contextDestroyed(ServletContextEvent sce) {
        Connection conn = (Connection) sce.getServletContext().getAttribute("DBConn");

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
