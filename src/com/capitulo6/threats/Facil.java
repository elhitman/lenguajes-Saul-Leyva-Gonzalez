/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo6.threats;

/**
 *
 * @author TOSHIBA
 */
public class Facil extends Thread{
    public void run(){
        try{
            Thread.sleep(3000);
        
        System.out.println("soy un facilote");
        String nombre=Thread.currentThread().getName();
        System.out.println("me llamo"+nombre); 
        }catch(InterruptedException e){ }
        
    }
}
