<%-- 
    Document   : session2b
    Created on : 2017/09/04, 16:52:58
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
        <p><a href="http://localhost:8080/SampleA/session2a.jsp">送信画面に戻る</a></p>
        <%
            request.setCharacterEncoding("UTF-8");
            
            
            //情報を受け取る
            String username=request.getParameter("txtname");
            String usersex=request.getParameter("txtsex");
            String userhobby=request.getParameter("txthobby");
            //入力された情報を表示
            out.print("名前"+"<br>"+username+"<br>");
            out.print("性別"+"<br>"+usersex+"<br>");
            out.print("趣味"+"<br>"+userhobby+"<br>");
            //sessionの取得
            HttpSession hs=request.getSession();
            //sessionへ登録
            hs.setAttribute("Name", username);
            hs.setAttribute("Sex", usersex);
            hs.setAttribute("Hobby", userhobby);

            
        %>
                   
       
    </body>
</html>
