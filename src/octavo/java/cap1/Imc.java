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
    private float estatura;
    private float peso;
    
    public void setpeso(float peso){
        this.peso=peso;
    }
    public void setestatura(float estatura){
        this.estatura=estatura;
    }
    public float calcular(){
        float algo=peso/(estatura*estatura);
        return algo;
        // tambien puede ser: return peso/(estatura*estatura);
        //o solamente mostrar la pura operacion return peso
    }
    
}
