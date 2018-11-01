<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <c:set var="salary" scope="session" value="${10000*2}"/>

        <c:choose>
            <c:when test="${salary <= 0}">
                太惨了
            </c:when>
            <c:when test="${salary > 10000}">
                过的很滋润
            </c:when>
            <c:otherwise>
                过的一般
            </c:otherwise>
        </c:choose>

    </body>
</html>
