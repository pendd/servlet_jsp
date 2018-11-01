<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <form action="12-doForm.jsp" method="get">

            用户: <input type="text" name="userName"> <br>

            开发技能
            <input type="checkbox" name="skills" value="java">java
            <input type="checkbox" name="skills" value="php">php
            <input type="checkbox" name="skills" value="html">html
            <input type="checkbox" name="skills" value="python">python

            <br>

            <input type="submit" value="提交">

        </form>

    </body>
</html>
