<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <c:set var="str1" value="我是一个String" />

        <c:set var="str2" value="${fn:substring(str1, 2, 4)}" />
        输出：${str2}

    </body>
</html>
