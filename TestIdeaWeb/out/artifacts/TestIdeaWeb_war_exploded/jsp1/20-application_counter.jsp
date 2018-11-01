<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <%

            Object obj = application.getAttribute("counter");

            if (obj == null) {
                application.setAttribute("counter",1);
                out.print("页面被访问了1次");
            } else {
                int countValue = Integer.parseInt(obj.toString());
                countValue ++;
                out.print("页面被访问了 " + countValue + "次");
                application.setAttribute("counter",countValue);
            }

        %>

    </body>
</html>
