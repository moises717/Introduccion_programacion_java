/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

/**
 *
 * @author Moises
 */
public class Etiquetas {
    
    public static void main(String[] args) {
        
        inicio:
          for(var con = 0 ; con < 20 ; con++){
            
            if(con % 2 != 0){
                  continue inicio; // Ir ala linea de codigode la etiqueta inicio
            }
                  System.out.println("con = " + con);
 
        }

    }
    
}
