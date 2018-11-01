<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        异常的描述

        <%
            out.print(exception.getMessage());
            out.print("<br>");
            out.print(exception.toString());
            out.print("<br>");
            exception.printStackTrace();
        %>

    </body>
</html>
