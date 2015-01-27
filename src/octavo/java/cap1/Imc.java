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
public class Imc {
    float estatura;
    float peso;
    
    public float calcular(float estatura,float peso){
        float algo=peso/(estatura*estatura);
        return algo;
        // tambien puede ser: return peso/(estatura*estatura);
        //o solamente mostrar la pura operacion return peso
    }
    
}
