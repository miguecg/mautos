<%-- 
    Document   : error
    Created on : 12-may-2016, 12:38:14
    Author     : miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
          String msg = (String)request.getSession().getAttribute("msg");
        %>
        <%= msg %>
    </body>
</html>
