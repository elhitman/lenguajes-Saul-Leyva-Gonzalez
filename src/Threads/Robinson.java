/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TOSHIBA
 */
public class Robinson extends Thread {
    @Override
    public void run(){
        try{
            Thread.sleep(6000);
            System.out.println("Robinson");
        } catch (InterruptedException e){}
    }
    
}
