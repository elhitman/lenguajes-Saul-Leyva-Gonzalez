/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficiesMadre;

/**
 *
 * @author campitos
 */
public class Rectangulo {
    
    private float ladomayor;
    private float ladomenor;

    public Rectangulo() {
    }

    public Rectangulo(float ladomayor, float ladomenor) {
        this.ladomayor = ladomayor;
        this.ladomenor = ladomenor;
    }
    
public float calcularArea(){
    return ladomayor+ladomenor;
}
    public float getLadomayor() {
        return ladomayor;
    }

    public void setLadomayor(float ladomayor) {
        this.ladomayor = ladomayor;
    }

    public float getLadomenor() {
        return ladomenor;
    }

    public void setLadomenor(float ladomenor) {
        this.ladomenor = ladomenor;
    }
    
    }
    
    
}
