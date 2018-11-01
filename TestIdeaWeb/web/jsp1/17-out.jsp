<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" buffer="1kb" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <%
            out.print("aaa");
            out.print("bbb");
            out.print("ccc");
//            out.print("<br>");
            out.newLine();

            out.flush();
            out.clearBuffer();

            out.println("dddddd");
            out.println("fffff");


            out.print("<br>");
            out.println("获取缓冲区大小" + out.getBufferSize());
            out.print("<br>");
            out.println("获取缓冲区剩余字节数" + out.getRemaining());
        %>

    </body>
</html>
