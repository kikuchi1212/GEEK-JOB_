/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.util.Calendar;
import java.util.Date;
/**
 * @author guest1Day
 */
//2015年1月1日 0時0分0秒と2015年12月31日 23時59分59秒の差（ミリ秒）を表示してください。
public class TimeStump3 {
    public static void main(String[] args){
        //Calendar変数を作る
        Calendar c1=Calendar.getInstance();
        Calendar c2=Calendar.getInstance();
        //Calendar変数に値を代入
        c1.set(2015,1,1,0,0,0);
        c2.set(2015,12,31,23,59,59);
        //Date型の変数に値を入れたCalendar変数を代入
        Date d1=c1.getTime();
        Date d2=c2.getTime();
        //long型の変数に上のDate型の変数を代入
        long l1=d1.getTime();
        long l2=d2.getTime();
        //差を表示
        System.out.print(l2-l1+"\n");
        //ミリ秒を日数に変換して表示
        System.out.println((l2-l1)/(1000*60*60*24)+"\n");
        
    }
}
