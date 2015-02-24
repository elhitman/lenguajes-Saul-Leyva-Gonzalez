/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficiesMadre;

import com.capitulo5.herencia.Superficie;

/**
 *
 * @author TOSHIBA
 */
public class Circulo implements Superficie {
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }
    
    public float calcularArea(){
     return 3.1416f*radio*radio;   
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
}
