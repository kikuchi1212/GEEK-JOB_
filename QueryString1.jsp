<%-- 
    Document   : QueryString1
    Created on : 2017/09/02, 14:55:24
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="QueryString2.jsp" method="post">
            <br>総額<input type="number" name="total">円
            <br>個数<input type="number" name="count">個
        <br>商品種別
        <br><select name="type">
            <option value="1">１：雑貨</option>
            <option value="2">２：生鮮食品</option>
            <option value="3">３：その他</option>
        </select>
        <br><br><br><input type="submit" name="btnSubmit">
        </form>  
    </body>
</html>
