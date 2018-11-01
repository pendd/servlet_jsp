<%@ page import="com.king.api.Person" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <%
            Person p = new Person("aaa",16);
            request.setAttribute("person",p);
        %>

        <%-- 为空 输出中间文本 --%>
        <c:out value="我是数据输出的文本">我是中间的文本</c:out> <br>
        <c:out value="">我是中间的文本</c:out> <br>
        <c:out value="${null}">我是中间的文本</c:out> <br>
        <c:out value="${null}" default="我是中间的文本"/> <br>
        <c:out value="${person.name}"/>

    </body>
</html>
