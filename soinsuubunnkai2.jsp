<%-- 
    Document   : soinsuubunnkai2
    Created on : 2017/09/04, 11:28:35
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
            //受け取る文字のパラメータコード
            request.setCharacterEncoding("UTF-8");
            //文字numを数字にする
            int num=Integer.parseInt(request.getParameter("num"));
            out.print("自然数"+num+"を素因数分解すると");
            //while文を使い、素因数分解を表す
            int i=2;
            while(num !=1){
                if(num%i==0){
                    out.print(i+",");
                        num/=i;
                }else{
                    i++;
                }
            }
            
        %>
    </body>
</html>
