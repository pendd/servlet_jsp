<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        上下文路径: <%= application.getContextPath() %> <br>

        服务器信息: <%= application.getServerInfo() %> <br>
        上下文名称: <%= application.getServletContextName() %> <br>
        虚拟服务器名称: <%= application.getVirtualServerName() %>

    </body>
</html>
