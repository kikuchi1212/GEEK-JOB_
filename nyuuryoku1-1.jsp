<%-- 
    Document   : nyuuryoku
    Created on : 2017/09/02, 12:50:05
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>コントロールサンプル</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="nyuuryoku1-2.jsp" method="post">
        <br>名前<br/> 
        <input type="text" name="txtName">
        <br>性別<br/>
        <input type="radio" name="rdoSample" value="otoko">男
        <input type="radio" name="rdoSample" value="onna">女
        <br>趣味<br/>
        <input type="text" name="text" value="" size="20">
        <input type="text" name="text" value="" size="20">
        <input type="text" name="text" value="" size="20">
        <br><input type="submit" name="btnSubmit"><br/>
        </form>  
    </body>
</html>
