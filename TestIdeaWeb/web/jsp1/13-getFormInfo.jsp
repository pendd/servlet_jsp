<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        信息获取 <br>

        <%
            out.print(request.getAttribute("userName"));
            out.print("<br>");
            out.print(request.getAttribute("skills"));
            out.print("<br>");
        %>

        <%= request.getAttribute("userName") %>
        <%= request.getAttribute("skills") %>

    </body>
</html>
