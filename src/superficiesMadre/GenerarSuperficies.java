/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficiesMadre;


import java.util.*;
public class GenerarSuperficies {
    public static ArrayList<Superficie>obtenerFiguras(){
        ArrayList<Superficie>figuritas=new ArrayList<Superficie>();
        
//primero creamos cuadrados
Cuadrado cu1=new Cuadrado(12);        
Cuadrado cu2=new Cuadrado(14);
Cuadrado cu3=new Cuadrado(13);
//creamos rectangulos
Rectangulo rec1=new Rectangulo(10,10);

//2 triagulos
Triangulo tri1=new Triangulo(10,10);
Triangulo tri2=new Triangulo(12,10);
//2 circulos
Circulo c1=new Circulo(10);
Circulo c2=new Circulo(12);

//agregar  los array list
figuritas.add(cu1);
figuritas.add(cu2);
figuritas.add(cu3);
figuritas.add(rec1);
figuritas.add(tri1);
figuritas.add(tri2);
figuritas.add(c1);
figuritas.add(c2);
return figuritas;




    }
    
}
