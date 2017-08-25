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
public class mojiretuhen3 {
    public static void main(String[] args){
        String word="きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        //「I」⇒「い」に、「U」⇒「う」に入れ替える処理
        String word1=(word.replace("I", "い"));
        String word2=(word1.replace("U", "う"));
        System.out.print(word2);
    }
}
