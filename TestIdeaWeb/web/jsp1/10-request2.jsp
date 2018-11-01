<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <%
            String name = request.getParameter("name");
            String pwd = request.getParameter("pwd");

            out.print(name +":::"+ pwd);
        %>

    </body>
</html>
