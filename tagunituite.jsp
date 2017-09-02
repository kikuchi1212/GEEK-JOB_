<%-- 
    Document   : tagunituite
    Created on : 2017/09/02, 13:47:09
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
        <!タイピングをしてくれます>
        <input type="button" value="タイピング" 
               onclick="i=0; msg='隣の客はよく柿食う客だ  隣の客はよく柿食う客だ  隣の客はよく柿食う客だ'; timerID=setInterval('if(i<=msg.length){document.all.div1.innerText=msg.substring(0,i); i++;}if(i>msg.length){clearInterval(timerID);}',100);">
　　　　 <div id=div1></div>
     
     　　<!文字がおっきく成ります>
        <input type="button" value="成長" onClick="p=1; timerID=setInterval('if(p<=10){p++;a.size=p}if(p>10){clearInterval(timerID);a.size=1}',500)">
        <p><font id="a" size="1" style="cursor">(笑)</font></p>
        
        <div style="writing-mode:tb-rl;Height:20;">
        縦書きです
        </div>

        <!顔文字を表示>
        <span style="font-size:50pt;color:カラー名;">
        (・&forall;・)
        </span>
    </body>
</html>
