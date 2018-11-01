<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <%
            response.setHeader("Cache-Control","no-cache");
            response.setIntHeader("Refresh",1);
            out.print("Date is " + new Date());

        %>

    </body>
</html>
