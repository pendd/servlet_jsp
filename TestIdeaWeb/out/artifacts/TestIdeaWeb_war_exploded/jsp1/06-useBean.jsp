<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <jsp:useBean id="king" class="com.king.api.Person" />

        <jsp:setProperty name="king" property="name" value="我是一个测试文本" />

        <jsp:getProperty name="king" property="name" />

    </body>
</html>
