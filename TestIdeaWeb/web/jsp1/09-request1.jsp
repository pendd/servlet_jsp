<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <form action="10-request2.jsp" method="post">
            姓名: <input type="text" name="name">
            <br>

            密码: <input type="password" name="pwd">
            <br>

            <input type="submit" value="提交">
        </form>

        请求的方法 <%= request.getMethod() %> <br>
        请求的资源 <%= request.getRequestURI() %> <br>
        请求的协议 <%= request.getProtocol() %> <br>
        请求的全路径 <%= request.getRequestURL() %> <br>
        请求的服务器名称 <%= request.getServerName() %> <br>
        请求的服务器端口 <%= request.getServerPort() %> <br>
        请求的客户端的ip <%= request.getRemoteAddr() %> <br>
        请求的客户端的用户 <%= request.getRemoteUser() %> <br>

        name:<%= request.getParameter("name") %> <br>
        pwd:<%= request.getParameter("pwd") %> <br>

        <%
            out.print(request.getParameter("name"));
        %>

    </body>
</html>
