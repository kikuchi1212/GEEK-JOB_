<%-- 
    Document   : nyuuryoku1
    Created on : 2017/08/31, 14:36:01
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
// 受け取るパラメータの文字コード
request.setCharacterEncoding("UTF-8");
// テキストボックスの情報
out.print("名前"+request.getParameter("txtName")+"<br>");
// ラジオボタンの情報
out.print("性別"+request.getParameter("rdoSample")+"<br>");
// テキストボックスの情報
out.print("趣味"+request.getParameter("text")+"<br>");

%>
