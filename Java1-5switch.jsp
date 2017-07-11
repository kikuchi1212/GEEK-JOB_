<%-- 
    Document   : Java1-5switch
    Created on : 2017/07/11, 10:58:43
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
        int type = 5;    
        //値が1なら「one」値が2なら「two」それ以外は「想定外」を表示
        switch(type){
            case 1:
                
              out.print("one");
              
              break;
              
            case 2:
                
              out.print("two");
              
              break;
              
            default:
              
              out.print("想定外");
                
              break;
              
              
            }
           %>
    </body>
</html>
