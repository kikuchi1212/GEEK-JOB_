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
public class DBsousa7 {
    public static void main(String[] args){
        Connection db_con=null;
        PreparedStatement db_ps=null;
        Statement db_st=null;
        ResultSet db_data=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","KIKUCHI1212","12121021");
               
            db_ps=db_con.prepareStatement("UPDATE profiles1 SET name=?,age=?,tel=? WHERE profilesID=1");
            db_ps.setString(1, "松岡　修造");
            db_ps.setInt(2, 48);
            db_ps.setString(3, "1967-11-06");
            int num=db_ps.executeUpdate();
            
            db_st=db_con.createStatement();
            db_data=db_st.executeQuery("SELECT * FROM profiles1");
            
            while(db_data.next()){
                System.out.println("ID:"+db_data.getInt("profilesID"));
                System.out.println("名前:"+db_data.getString("name"));
                System.out.println("電話番号:"+db_data.getString("tel"));
                System.out.println("年齢:"+db_data.getInt("age"));
                System.out.println("誕生日:"+db_data.getString("birthday"));
            }
                db_st.close();
                db_data.close();
                db_con.close();
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
