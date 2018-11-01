<%@ page import="com.king.api.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <%
            int a = 1 + 1;
        %>

        加法运算结果: <%= (1+1) %>
        <br>

        el的运算式: ${1+1}

        <br><br><br><br>

        关系运算:
        空判定: ${user == null} <br>
        空判定2: ${user eq null} <br>

        <br><br><br><br>

        jstl  if 结合 空判定el表达式
        <br>

        <%
            List<String> list = new ArrayList<>();
            list.add("aaa");
            list.add("bbb");
            list.add("ccc");
            request.setAttribute("list",list);
        %>

        <c:if test="${!empty(list)}">
            <c:forEach var="str" items="${list}">
                ${str}
            </c:forEach>
        </c:if>


        <br><br><br><br>

        el表达式使用三元运算符
        <%
            session.setAttribute("person",new Person("king",18));
        %>

        ${person == null ? "没登录" : person.name}

    </body>
</html>
