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
public class probandoThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("probando threads");  
               Facil t1=new Facil();
               Facil t11=new Facil();
               Relojito treloj=new Relojito();
              // t1.setName("saul");
               Regular r1=new Regular();
               Thread t2=new Thread(r1);
               Thread t3 = new Thread(
               new Runnable(){

            @Override
            public void run() {
                System.out.println("soy un thread mucho mejor");    
            }
               });
//2. inicializar
        t1.start();
        t11.start();
        t2.start();
        t3.start();
        treloj.start();
    }
    
}
