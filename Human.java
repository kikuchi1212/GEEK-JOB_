/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author guest1Day
 */

    //kadaiクラスを宣言                                                
public class Human{
    public String name="";
    public int age=0;
    //メソッドの宣言
    public void Human(String n,int a){
        //引数をフィールドへ設定
        this.name=n;
        this.age=a;
    }
    public void setHuman(String n,int a){
        System.out.print(n);
        System.out.print(a);
    }
    
    public static void main(String[] args){
    Human hito = new Human();
    hito.age=20;
    hito.setHuman("菊地道信",21);
    
    }
}



