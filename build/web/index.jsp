<%-- 
    Document   : index
    Created on : 07/10/2019, 19:56:05
    Author     : 2746071
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1
        <%
    String redirectURL = "newjsp.jsp";
    response.sendRedirect(redirectURL);
%>
    </body>
</html>
