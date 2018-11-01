<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <%-- 定义方法 --%>
        <%!
            private int initCount = 0;
            private int destroyCount = 0;
            private int serviceCount = 0;

            public void jspInit(){
                initCount++;
                System.out.println("jspInit被执行了" + initCount + "次");
            }

            public void jspDestroy(){
                destroyCount++;
                System.out.println("jspDestroy被执行了" + destroyCount + "次");
            }
        %>

        <%
            serviceCount++;
            System.out.println("jspService被执行了" + serviceCount + "次");
        %>

        <p> 初始化次数<%= initCount %> </p>
        <p> 摧毁次数<%= destroyCount %> </p>
        <p> 执行次数<%= serviceCount %> </p>

    </body>
</html>
