<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/29
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String userName = request.getParameter("userName");

    String skillTemp = "";
    String[] skills = request.getParameterValues("skills");

    if (skills != null && skills.length > 0) {

        for (String skill : skills) {
            skillTemp = skillTemp + skill + ",";
        }
    }

    request.setAttribute("userName",userName);
    request.setAttribute("skills",skillTemp);


%>

<jsp:forward page="13-getFormInfo.jsp" />
