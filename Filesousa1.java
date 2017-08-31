/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.*;
/**
 *
 * @author guest1Day
 */
public class Filesousa1 {
    public  static void main(String[] args) throws IOException{
        //ファイルオープン
        File fp=new File("test.txt");
        //FileWriter作成
        FileWriter fw=new FileWriter(fp);
        //書き込み
        fw.write("私の名前は菊地道信です。");
        //クローズ
        fw.close();
    }
}
