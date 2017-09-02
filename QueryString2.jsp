<%-- 
    Document   : QueryString2
    Created on : 2017/09/02, 15:08:02
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            //受け取るパラメータの文字コード
            request.setCharacterEncoding("UTF-8");

            int type = Integer.parseInt(request.getParameter("type"));

            switch (type) {
                case 1:
                    out.print("選んだ商品は「雑貨」です。" + "<br>");
                    break;
                case 2:
                    out.print("選んだ商品は「生鮮食品」です。" + "<br>");
                    break;
                case 3:
                    out.print("選んだ商品は「その他」です。" + "<br>");
                    break;
            }
            int total = Integer.parseInt(request.getParameter("total"));
            int count = Integer.parseInt(request.getParameter("count"));

            out.print("総額は" + total + "円です。" + "<br>");
            out.print("個数は" + count + "個です。" + "<br>");
            //一個あたりの値段
            out.print("一個あたり" + total/count + "円です。" + "<br>");

        //総額に応じたポイント
        if(3000<=total&&total<5000){
            out.print("3000円以上お買い上げいただいたので"+total*0.04+"ポイント付与させていただきます。"+"<br>");
            out.print("お買い上げありがとうございました。"+"<br>");
        }else if(5000<=total){
            out.print("5000円以上お買い上げいただいたので"+total*0.05+"ポイント付与させていただきます。"+"<br>");
            out.print("お買い上げありがとうございました。");
        }else{
            out.print("お買い上げありがとうございました。");
        }
        out.print("<br>"+"<br>"+"（お買い上げ総額 3000円以上で、4%　5000円以上で、5%　のポイントを付与させていただきます。）"+"<br>"+"<br>");
        %>
    </body>
</html>


