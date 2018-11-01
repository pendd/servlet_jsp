<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <%--使用pageContext获取输出out对象--%>
        <%
            JspWriter myOut = pageContext.getOut();
            myOut.println("jsp打印");

            out.println("常规打印");
            out.print("<br>");
        %>

        <%
            pageContext.setAttribute("name","king123",pageContext.SESSION_SCOPE);
            pageContext.setAttribute("name","king123",pageContext.PAGE_SCOPE);
            pageContext.setAttribute("name","king123",pageContext.REQUEST_SCOPE);
            pageContext.setAttribute("name","king123",pageContext.APPLICATION_SCOPE);

            out.print("session范围找值: " + pageContext.getAttribute("name",pageContext.SESSION_SCOPE));
            out.print("<br>");

            // 在不明确取值范围的时候, 是从page范围查找指定的key
            out.print("无范围查找: " + pageContext.getAttribute("name"));
            out.print("<br>");

            /* page > request > session > application  按照这个顺序去查找key对象的属性值 */

            out.print("自动范围查找: " + pageContext.findAttribute("name"));
        %>

    </body>
</html>
