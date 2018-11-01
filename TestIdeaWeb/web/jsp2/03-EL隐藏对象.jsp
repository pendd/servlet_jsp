<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        pageContext : ${pageContext} <br>

        <%
            pageContext.setAttribute("name","king");
        %>

        第一种 name值: ${pageScope.name}<br>
        第二种 name值: ${pageContext.getAttribute("name")}<br><br>

        <%
            request.setAttribute("name","encoding");
        %>

        第一种 name值: ${requestScope.name}<br>
        第二种 name值: ${pageContext.request.getAttribute("name")}<br><br>

        <%
        session.setAttribute("name","pendd");
        %>

        第一种 name值: ${sessionScope.name}<br>
        第二种 name值: ${pageContext.session.getAttribute("name")}<br><br>

        <%
            application.setAttribute("name","keep");
        %>

        name值: ${applicationScope.name}<br><br>

        参数值: ${param.name}   <%--地址栏带的参数名为name--%>


        <%--TODO--%>
        <%--<form action="" method="post">

            <input type="text" name="username" value="${param.username}">
            <input type="submit" value="注册"><br>

        </form>--%>

        同名的参数,值的获取 <br>
        参数的第一个值: ${paramValues.like[0]}  <%--http://localhost:8080/jsp2/03-EL隐藏对象.jsp?like=java&like=php--%>
        <br>
        ${header.Accept}<br>
        ${header["User-Agent"]}<br> <br>
        ${cookie.JSESSIONID.value} <br>

        ${initParam.DB_URL}<br>       <%-- 获取全局初始化参数 --%>
        ${initParam.DB_USER}<br>
    </body>
</html>
