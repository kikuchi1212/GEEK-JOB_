/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.sql.*;

/**
 *
 * @author guest1Day
 */
public class DBsousa2f {
    public static void main(String[] args){
        
    Connection db_con=null;
    PreparedStatement db_st=null;
    try{ 
        //DBへ接続
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        db_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","KIKUCHI1212","12121021");
        
        //ConnectionのprepareStatementメソッドにSQL文を渡します
        db_st=db_con.prepareStatement("INSERT INTO profiles1(profilesID,name,tel,age,birthday)VALUE(?,?,?,?,?)");
        //?の置き換え　
        //PreparedStatement変数.set○○（何番目の？,？に設定する整数）;
        //今回は（整数、文字列、文字列、整数、文字列）
        db_st.setInt(1,6);
        db_st.setString(2, "ドナルド・トランプ");
        db_st.setString(3,"000-0000-0000");
        db_st.setInt(4, 71);
        db_st.setString(5, "1946-06-14");
        //更新行数を返却します
        int num=db_st.executeUpdate();
        db_st.setInt(1, 7);
        db_st.setString(2, "安倍　晋三");
        db_st.setString(3, "090-0000-0000");
        db_st.setInt(4, 62);
        db_st.setString(5, "1954-09-21");
        //更新行数を返却します
        num=db_st.executeUpdate();
        
        db_con.close();
        db_st.close();
    }catch(SQLException e_sql){
        System.out.println("接続時にエラーが発生しました<SQL>"+e_sql.toString());
    }catch(Exception e){
        System.out.println("接続時にエラーが発生しました"+e.toString());
    }finally{
        if(db_con !=null){
            try{
                db_con.close();
            }catch(SQLException e_con){
                System.out.println(e_con.getMessage());
            }
        }
    }
    }
}