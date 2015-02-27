/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficiesMadre;


/**
 *
 * @author campitos
 * 
 */
public class Cuadrado implements Superficie{
    
private float lado;

/**
 * Este constructor tiene un argumento de tipo flotante
 * @param lado  El parametro que debes ingresar es el valor
 * del lado de tu cuadrado
 */
    public Cuadrado(float lado){
              
 
        this.lado = lado;
    }
    
    public Cuadrado(){
        
    }
   
  
    public float getLado() {
        return lado;
    }

   public void setLado(float lado)  {
       
       
        this.lado = lado;
    }
    
      public float calcularArea() {
          System.out.print("el area del cuadrado es:");
  float area=lado*lado;
  return area;
    }

}
