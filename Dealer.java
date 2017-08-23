/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author guest1Day
 */
//Humanを継承したクラス
public class Dealer extends Human {
    
//Humanクラスにabstractがついていたのでこちらにも実装
//cardsというArrayListの変数を用意    
ArrayList<Integer> cards =new ArrayList<>();
//cardsにトランプ52枚を入れる
//for文で表す
public Dealer(){
    int num;
//13枚×4のカード    
    for(int i=0;i<4;i++){
        num=0;
        for(int j=0;j<13;j++){
            num++;
            //10以上は強制的に10
            if(j>=10){   
                num=10;
            }
            
        cards.add(num);
        }
    }
}

//乱数クラス生成
Random rand=new Random();
////乱数の取得
//Integer index=rand.nextInt(cards.size());

//dealという公開メソッドを用意
public ArrayList<Integer> deal(){
    //kubaruというArrayListを生成
ArrayList<Integer>kubaru=new ArrayList<>();
    //kubaruに二枚のカードを追加
    int index1=rand.nextInt(cards.size());
    kubaru.add(cards.get(index1));
    int index2=rand.nextInt(cards.size());
    kubaru.add(cards.get(index2));
    return kubaru;
}

//hitという公開メソッドを用意
public ArrayList<Integer>hit(){
    //koukanというArrayListを生成
    ArrayList<Integer>koukan=new ArrayList<>(); 
    int index=rand.nextInt(cards.size());
    //koukanに一枚のカードを追加
    koukan.add(cards.get(index));
    return koukan;
} 
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
        if(this.open()<=17){
            return true;
        }else{
            return false;
        }
        
    }
}
