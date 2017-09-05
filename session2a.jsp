<%-- 
    Document   : session2a
    Created on : 2017/09/04, 16:48:00
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
        <%--
        全体のイメージ
        ①セッションから"Name","Sex","Hobby"の読み出し(１回目)
        ②上のデータは最初はnullなので変数n,s,hは空のまま
        ③session2b.jspで情報を受け取り表示する
        ④session2b.jspでセッションに受け取った情報を登録する
        ⑤リンクでsession2a.jspに戻る
        ⑥セッションから"Name","Sex","Hobby"の読み出し(２回目)
        ⑦if文より変数n,s,hに情報が代入され、初期値になる
        --%>
        <%
            //セッションの取得
            HttpSession hs=request.getSession();
            String n="";
            String s="";
            String h="";
            //セッションからデータの読み出し
            //データの中身が空じゃなかったら
            if(hs.getAttribute("Name")!=null){
                n=(String)hs.getAttribute("Name");
            }
            if(hs.getAttribute("Sex")!=null){
                s=(String)hs.getAttribute("Sex");
            }
            if(hs.getAttribute("Hobby")!=null){
                h=(String)hs.getAttribute("Hobby");
            }
            
            
        %>
        <form action="session2b.jsp" method="post">
        <br>名前
        <br><input type="text" name="txtname" value="<%=n%>" >
        <br>性別
        <br><input type="text" name="txtsex" value="<%=s%>">
        <br>趣味
        <br><input type="text" name="txthobby" value="<%=h%>">
        <br><input type="submit" name="btnsubmit" value="送信">
        </form>
    </body>
</html>

