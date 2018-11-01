<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        jsp config <br>

        username <%= config.getInitParameter("username") %>
        pwd <%= config.getInitParameter("pwd") %>

    </body>
</html>
