/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.util.Calendar;
/**
 *
 * @author guest1Day
 */
//2016年1月1日 0時0分0秒のタイムスタンプを作成し、表示してください。
public class TimesStamp {
    public static void main(String[] args){
       Calendar c=Calendar.getInstance();
       //2016年1月1日0時0分0秒
       c.set(2016,1,1,0,0,0);
       System.out.print(c.getTime());
    }
}
