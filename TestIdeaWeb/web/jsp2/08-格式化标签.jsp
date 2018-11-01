<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <c:set var="now" value="<%= new Date() %>" />

        初始状态: <c:out value="${now}"/><br>
        <%--格式化1 : <fmt:formatDate value="${now}"/> <br>--%>
        格式化2 : <fmt:formatDate value="${now}" type="time" /> <br>
        格式化3 : <fmt:formatDate value="${now}" type="date" /> <br>
        格式化4 : <fmt:formatDate value="${now}" type="both" dateStyle="short" timeStyle="short" /> <br>
        格式化5 : <fmt:formatDate value="${now}" type="both" dateStyle="medium" timeStyle="medium" /> <br>
        格式化6 : <fmt:formatDate value="${now}" type="both" dateStyle="long" timeStyle="long" /> <br>


    </body>
</html>
