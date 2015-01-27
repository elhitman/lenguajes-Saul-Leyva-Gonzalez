/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octavo.java.cap1;

/**
 *
 * @author T-107
 */
public class AplicacionImc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Imc xxx=new Imc();
       float resultado=xxx.calcular(1.68f, 86);
        System.out.println("tu imc es: "+resultado);
    }
    
}
