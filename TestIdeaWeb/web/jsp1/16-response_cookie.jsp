<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <%

            // 服务端获取cookie的值的过程
            request.getCookies();

            // 服务端给客户端 加cookie的动作，下次客户端会把cookie带回服务端
            Cookie cookie = new Cookie("name", "king");
            cookie.setMaxAge(1*60*60);
            response.addCookie(cookie);

        %>

    </body>
</html>
