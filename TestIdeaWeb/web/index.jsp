<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/23
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <p>今天的日期: <%= new Date()%></p>

    <p>网络状态L: <%= application.getAttribute("hasNet") %></p>

    <p> <%= "hello world" %> </p>

    <%
      out.print("hello world again");
    %>

  </body>
</html>
