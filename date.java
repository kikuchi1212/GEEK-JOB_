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
//現在の日時を「年-月-日 時:分:秒」で表示してください。
public class date {
    public static void main(String[] args){
        // 当日の日時で日付情報を作成
        Date d=new Date();
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        // 日付表示 
        System.out.print(sdf.format(d));
    }
}
