/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class ResultData implements Serializable {

    private Date d;
    private String luck;

    public ResultData() {
    }
     /**
     * @return the d
     */
    public Date getD() {
        return d;
    }
    /**
     * @param d the d to set
     */
    public void SetD (Date d){
        this.d = d;
    }

    /**
     * @return the luck
     */
    public String getLuck(){
        return luck;
    }
   
    /**
     * @param luck the luck to Set
     */
     public void setLuck(String luck){
         this.luck = luck ;
     }}
 
     
     
    