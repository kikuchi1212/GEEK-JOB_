<%-- 
    Document   : java1-9forbun3
    Created on : 2017/07/12, 16:53:12
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
        //0から100の合計を表示する処理
        int total=0;
        for(int i=0;i<=100;i++){
            total=total+i;
        //初期値は０
        //i以下の場合繰り返す
        //1回ごとにiする
        }
        out.print(total);
        %> 
    </body>
</html>
