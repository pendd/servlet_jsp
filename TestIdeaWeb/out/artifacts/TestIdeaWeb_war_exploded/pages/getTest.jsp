
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Title</title>
    </head>
    <body>

        <%--获取上下文路径--%>
        <form action="<%=request.getContextPath() %>/GetFormServlet" method="get">

            用户名: <input type="text" name="username">
            <br>
            密码: <input type="password" name="pwd">
            <br>

            <input type="submit" value="提交">

        </form>

    </body>
</html>