/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclosfor;

import java.lang.Exception;
public class NumeroNoNegativoException extends Exception{
    
    public NumeroNoNegativoException(){
        super("ll siento no acepto valores negativos");
    }
    
    
}
