package com.king.jdbc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Created by pd on 2018/10/24 15:39
 */
@WebServlet(name = "ServletContextServlet",urlPatterns = "/testJdbc")
public class JDBCServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 获取上下文对象
        ServletContext context = getServletConfig().getServletContext();


        Connection conn = (Connection)context.getAttribute("DBConn");
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            String sql = "select * from bank";

            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();


            String temp1 = "<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "    <head>\n" +
                    "        <meta charset=\"UTF-8\">\n" +
                    "        <title>Title</title>\n" +
                    "    </head>\n" +
                    "    <body>\n" +
                    "        <table>\n" +
                    "            <thead>\n" +
                    "            <tr>\n" +
                    "                <th>username</th>\n" +
                    "                <th>balance</th>\n" +
                    "            </tr>\n" +
                    "            </thead>\n" +
                    "            <tbody>";

            String temp2 = "      </tbody>\n" +
                    "        </table>\n" +
                    "    </body>\n" +
                    "</html>";

            StringBuilder sb = new StringBuilder();

            while(rs.next()) {
                String username = rs.getString("username");
                double balance = rs.getDouble("balance");

                String tr = "<tr>\n" +
                        "                <td>"+username+"</td>\n" +
                        "                <td>"+balance+"</td>\n" +
                        "            </tr>";

                sb.append(tr);
            }

            response.getWriter().print(temp1 + sb.toString() + temp2);

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

        }

    }
}
