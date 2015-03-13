/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author TOSHIBA
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("tarea threads");  
    Robinson robinson=new Robinson();
    TareaThread josue=new TareaThread();
    Charly charly=new Charly();
    
    robinson.start();
    josue.start();
    charly.start();
    }
    
}
