<%-- 
    Document   : Java1-6switch2
    Created on : 2017/07/11, 11:36:52
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
        char type = 'A';
        //値が【A】なら「英語」、値が【あ】なら「日本語」
        switch (type){
            case 'A':
                out.print("英語");
                break;
            case 'あ':
                out.print("日本語");
                break;
            default:
                //それ以外は何も表示しない
                break;
        }
        %>
    </body>
</html>
