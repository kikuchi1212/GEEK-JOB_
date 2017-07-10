<%-- 
    Document   : java1-2
    Created on : 2017/07/10, 14:32:30
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    final int BASE = 1000;
    int num = 50;
    
    //足し算
    int tasu = BASE + num ;
  
    //引き算
    int hiku = BASE - num ;
    
    //掛け算
    int kake = BASE * num ;
    
    //割り算
    int wari = BASE / num ;
            
    //剰余算
    int amari =BASE % 3;
    
out.println(tasu);
out.println(hiku);
out.println(kake);
out.println(wari);
out.println(amari);

    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    </body>
</html>
