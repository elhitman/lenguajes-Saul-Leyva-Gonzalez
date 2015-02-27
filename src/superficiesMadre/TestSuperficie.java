/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficiesMadre;

/**
 *
 * @author TOSHIBA
 */
public class TestSuperficie {
    public static void main(String[] args)throws Exception{
        
        for(Superficie s:GenerarSuperficies.obtenerFiguras()){
            System.out.println(s.calcularArea());
        }
    }
}
