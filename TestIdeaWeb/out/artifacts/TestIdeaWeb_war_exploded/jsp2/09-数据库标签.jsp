<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <sql:setDataSource var="sqlSource" driver="oracle.jdbc.driver.OracleDriver"
                    url="${initParam.DB_URL}" user="${initParam.DB_USER}" password="${initParam.DB_PWD}"/>

        <sql:query var="result" dataSource="${sqlSource}" sql="select * from BANK"/>
        
        <table border="1">

            <tr>
                <td>username</td>
                <td>balance</td>
            </tr>
            <%-- result.rows  获取行对象 --%>
            <c:forEach var="row" items="${result.rows}">
            <tr>
                <td><c:out value="${row.username}" /></td>
                <td><c:out value="${row.balance}" /></td>
            </tr>
            </c:forEach>
            
        </table>
    </body>
</html>
