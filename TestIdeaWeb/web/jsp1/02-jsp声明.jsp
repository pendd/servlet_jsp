<%@ page import="com.king.api.Person" %>
<%@ page import="java.util.Calendar" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <%-- jsp声明 --%>
        <%! int a = 10; %>
        <%! String e = ""; %>
        <%! Person p = new Person(); String test = "";  /*test.substring(1);*/ Calendar c = Calendar.getInstance(); %>

        <%-- 脚本程序 --%>
        <%
            p.setAge(12);
            out.print("年龄" + p.getAge());
        %>

        <p>今天气温是 <span> <%= a %> </span>度</p>

    </body>
</html>
