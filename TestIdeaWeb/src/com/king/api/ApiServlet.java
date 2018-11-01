package com.king.api;

import com.google.gson.Gson;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pd on 2018/10/24 16:25
 */
@WebServlet(name = "ApiServlet",urlPatterns = "/apiTest")
public class ApiServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 用json把java对象转换成对象输出出来

        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=UTF-8");

        // json字符串
//        String jsObj = "{\"name\":\"123\",\"age\":\"18\"}";

       /* Person p = new Person("king",18);

        String pJson = new Gson().toJson(p);

        // 输出回前端
//        response.getWriter().write(jsObj);
        response.getWriter().write(pJson);*/

        // 获取上下文对象
        ServletContext context = getServletConfig().getServletContext();

        String db_url = context.getInitParameter("DB_URL");
        String db_user = context.getInitParameter("DB_USER");
        String db_pwd = context.getInitParameter("DB_PWD");

        String driver = "oracle.jdbc.driver.OracleDriver";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(db_url,db_user,db_pwd);
            String sql = "select * from bank";

            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();


            Bank bank = null;
            List list = new ArrayList();

            while(rs.next()) {
                String username = rs.getString("username");
                double balance = rs.getDouble("balance");

                bank = new Bank(username,balance);
                list.add(bank);
            }

            String listStr = new Gson().toJson(list);


            response.getWriter().print(listStr);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            try {
                if(conn != null && !conn.isClosed()){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
