/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mypackage.sample;
/**
 *
 * @author guest1Day
 */
//だめだこりゃ自分が何をしてるのかわからん
//継承できてんのかこれ
//こんなに短いわけないんだよなぁ
//変数の中身をクリアって空にするってことでいいんすかね？Stringでnullはできるけどintだとできないので適当に-1をいれました
class Human2 extends Human {
    public void clearHuman(){
        this.name=null;
        this.age=-1;
    }
}
        
    

