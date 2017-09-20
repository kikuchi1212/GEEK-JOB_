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
public class DBsousa4 {
    public static void main(String[] args){
        Connection db_con=null;
        PreparedStatement db_st=null;
        ResultSet db_data=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","KIKUCHI1212","12121021");
               
                
            db_st=db_con.prepareStatement("SELECT * FROM profiles1 WHERE profilesID=?");
            db_st.setInt(1,1);
            
            db_data=db_st.executeQuery();
            
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
