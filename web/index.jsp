<%-- 
    Document   : redirect
    Created on : 07/10/2019
    Author     : 2653350, Luís Gustavo Borges de Lima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Redirect to page</title>
    </head>
    <body>
        <h2>Redirecionando para aplicação...</h2>
        <%
            String redirectURL = "pageFirst.jsp";
            response.sendRedirect(redirectURL);
        %>
    </body>
</html>
