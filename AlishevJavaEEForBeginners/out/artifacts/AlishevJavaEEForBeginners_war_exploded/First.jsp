<%--
  Created by IntelliJ IDEA.
  User: Roman
  Date: 20.07.2020
  Time: 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>Testing JSP</h1>
    <p>
        <%
//            java.util.Date now = new java.util.Date();
//            String someString = "Текущая дата: " + now;

            for (int i = 0; i < 10; i++) {
                out.println("<p>" + "Hello: " + i + "</p>");
            }
        %>

<%--        <%=--%>
<%--            someString--%>
<%--        %>--%>

    </p>
</body>
</html>
