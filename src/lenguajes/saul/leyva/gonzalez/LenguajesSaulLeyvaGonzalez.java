/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.saul.leyva.gonzalez;
import java.util.Scanner;
/**
 *
 * @author T-107
 */
public class LenguajesSaulLeyvaGonzalez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner dato=new Scanner(System.in);
        double peso,altura,imc;
        System.out.println("mi peso es de 75 kg");
        peso=dato.nextDouble();
        System.out.println("ingrese su altura en cm :");
        altura=dato.nextDouble();
        imc=peso/(altura*altura);
        System.out.println("su indice de masa corporal es : "+imc);
        
    }
    
}
