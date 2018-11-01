<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        session唯一标识符 <%= session.getId() %> <br>
        session创建时间   <%= session.getCreationTime() %> <br>
        session最后访问时间 <%= session.getLastAccessedTime() %> <br>
        session失效时间   <%= session.getMaxInactiveInterval() %> <br>

    </body>
</html>
