<%-- 
    Document   : placeOrder
    Created on : Mar 21, 2019, 3:28:09 PM
    Author     : Chris Skov
--%>

<%@page import="FunctionLayer.house"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is your house</h1>
        <% house house = (house)request.getAttribute("house"); %>
        <p><%=house.getHeight()%></p>
    </body>
</html>
