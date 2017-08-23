/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.util.ArrayList;

/**
 *
 * @author guest1Day
 */
public class User extends Human {
    //cardsというArrayListの変数を用意    
ArrayList <Integer> cards =new ArrayList<>();
//kubaruというArrayListを生成
ArrayList<Integer>kubaru=new ArrayList<>();
//koukanというArrayListを生成
ArrayList<Integer>koukan=new ArrayList<>(); 
 @Override
    public int open(){
        //myCardsの中身を足す
        int sum=0;
        for(int i=0;i<myCards.size();i++){
            sum+=myCards.get(i);
        }
            return sum;    
    }
    @Override
    public void setCards(ArrayList<Integer> list){
         //listを受け取ってvalueに入れる
        //拡張for文はひとつずつ処理していく
        for(int value:list){
            myCards.add(value);
        }
       
    }
     @Override
    public boolean checkSum(){
        //手札が17以下ならtrue
        //それ以外ならfalse
        if(open()<=17){
            return true;
        }else{
            return false;
    }    
    }
}