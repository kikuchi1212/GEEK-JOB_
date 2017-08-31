/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author guest1Day
 */
public class Filesousa3 {
    public static void main(String[] args){
        System.out.print("開始日時は");
        // 開始日時を出力する
        Date d1=new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        // 日付表示 
        System.out.println(sdf1.format(d1));
        
        //Mathクラスを使いました
        //引数の絶対値を返します
        System.out.println("abs(-50)    → " + Math.abs(-50));
        //引数を2つ受け取り値の高い方を返します
        System.out.println("max(15,30)  → " + Math.max(3,10));
        //引数を2つ受け取り値の低い方を返します
        System.out.println("min(15,30)  → " + Math.min(15,30));
        //引数値の平方根を返します
        System.out.println("sqrt(57.29577951308232)     → " + Math.sqrt(57.29577951308232));
        //角度→ラジアンに変換する
        System.out.println("toRadians(180.0)"+Math.toRadians(180.0));
        //ラジアン→角度に変換する
        System.out.println("toDegrees(1.0)"+Math.toDegrees(1.0));
        
        System.out.print("終了日時は");
        // 終了日時を出力する
        Date d2=new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        // 日付表示 
        System.out.println(sdf2.format(d2));
    }
}
