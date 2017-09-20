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
public class DBsousa3f {
    public static void main(String[] args){
        Connection db_con=null;
        Statement db_st=null;
        ResultSet db_data=null;

        try{
        //データベースへの接続    
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        db_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","KIKUCHI1212","12121021");
        
        //SQL 文をデータベースに送るための Statement オブジェクトを生成します。
        //パラメータなしの SQL 文は通常、Statement オブジェクトを使用して実行されます。
        //同じ SQL 文が多数回実行される場合は、PreparedStatement オブジェクトを使用する方が効率的です。 
        db_st=db_con.createStatement();
        //実行結果をResultSetとして返却
        db_data=db_st.executeQuery("SELECT * FROM profiles1");
        //nextメソッドで、データの有無を確認し、while文でデータがある限り取得し続ける
            while(db_data.next()){
                System.out.println("ID:"+db_data.getInt("profilesID"));
                System.out.println("名前:"+db_data.getString("name"));
                System.out.println("電話番号:"+db_data.getString("tel"));
                System.out.println("年齢:"+db_data.getInt("age"));
                System.out.println("誕生日:"+db_data.getString("birthday"));
            }
        db_data.close();
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
