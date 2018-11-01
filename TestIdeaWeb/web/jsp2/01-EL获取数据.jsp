<%@ page import="com.king.api.Person" %>
<%@ page import="com.king.api.Address" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <%
            session.setAttribute("name","king235");
        %>

        使用原始表达式获取数据

        <%
            out.print("<br>");
            out.print(pageContext.findAttribute("name"));
            out.print("<br>");
            out.print(request.getAttribute("name"));
            out.print("<br>");
        %>

        <%= pageContext.findAttribute("name") %>
        <br>

        等同的el表达式: ${name}
        <br>


        <br>

        <%
            Person p = new Person();
            p.setAge(18);
            request.setAttribute("person",p);
        %>


        使用原始
        <%
            Person p1 = (Person) request.getAttribute("person");
            p1.getAge();
        %>
        <br>
        使用el表达式获取bean属性: ${person.age}


        <br><br><br><br>

        <%
            Person p2 = new Person();
            Address address = new Address();

            address.setAddr("上元");
            p2.setAddress(address);

            request.setAttribute("person",p2);
        %>

        使用el表达式获取bean对象中子对象属性 : ${person.address.addr}


        <br><br><br><br>

        <%
            Person p3 = new Person();
            p3.setName("john");

            Person p4 = new Person();
            p4.setName("tom");

            List<Person> list = new ArrayList<>();
            list.add(p3);
            list.add(p4);

            request.setAttribute("list",list);
        %>

        数组中的第0个 : ${list[0].name}<br>
        数组中的第1个 : ${list[1].name}

        <br><br><br><br>

        迭代list (需要jstl的标签库)
        <br>

        <c:forEach var="pers" items="${list}">
            ${pers.name}
        </c:forEach>



        <br><br><br><br>

        <%
            Map<String,String> map = new HashMap<>();

            map.put("a","aaa");
            map.put("b","bbb");
            map.put("c","ccc");
            map.put("d","ddd");
            map.put("1","eee");

            request.setAttribute("map",map);
        %>

        el表达式去map值 : ${map.c}<br>
        el表达式去map值 : ${map["1"]}

        <br><br><br><br>
        迭代map (需要jstl的标签库)

        <br>
        <c:forEach var="per" items="${map}">
            ${per.key} :: ${per.value} <br>
        </c:forEach>


    </body>
</html>
