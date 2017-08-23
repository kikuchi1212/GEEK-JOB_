/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
public class BlackJack extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //インスタンスを生成
            //これでDealerクラスとUserクラスを利用することができる
            Dealer d = new Dealer();
            User u = new User();
            //二枚のカードを配る
            d.setCards(d.deal());
            u.setCards(d.deal());
            //手札が17以下ならループする
            while (d.checkSum() == true) {
                d.setCards(d.hit());
                //手札が17を超えたらループを止める
                if (d.checkSum() == false) {
                    break;
                }
            }
            out.println("ディーラーの合計は" + d.open() +"です。<br>");
            //手札が17以下ならループする
            while (u.checkSum() == true) {
                u.setCards(d.hit());
                //手札が17を超えたらループを止める
                if (u.checkSum() == false) {
                    break;
                }
            }
            out.println("プレイヤーの合計は" + u.open() + "です。<br>");

            if (d.open() == u.open()&&d.open()<=21&&u.open()<=21) {
                out.println("引き分けです。<br>");
            }else if(d.open() > 21&&u.open()>21){
                out.print("ディーラーがバストしました。<br>");
                out.print("プレイヤーがバストしました。<br>");
                out.print("引き分けです。<br>");
            } else if (d.open() > 21&&u.open()<=21) {
                out.println("ディーラーがバストしました。<br>");
                out.println("プレイヤーの勝ちです。<br>");
            } else if (u.open() > 21&&d.open()<=21) {
                out.println("プレイヤーがバストしました。<br>");
                out.println("ディーラーの勝ちです。<br>");
            } else if (u.open() < d.open()) {
                out.println("ディーラーの勝ちです。<br>");
            } else if (d.open() < u.open()) {
                out.print("プレイヤーの勝ちです。<br>");
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
