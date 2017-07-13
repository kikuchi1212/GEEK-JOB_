<%-- 
    Document   : java1-10whilebun
    Created on : 2017/07/12, 17:22:52
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
        <%
        //key＜100まで繰り返す
        //ループ回数を表示する
       int key = 1000;
       int count  = 0;
       while(key>100){
           count++; 
           key=key/2;
       }
       out.print(count +"回ループしました");
        %>
    </body>
</html>
