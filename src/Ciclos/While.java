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
public class While {
    public static void main(String[] args) {
        var contador = 0;
        
        while (contador < 3) {            
            System.out.println("contador " + contador);
            
            contador++;
        }
        
        var contador2 = 0;
        
        do {            
            System.out.println("contador2 = " + contador2);
            contador2++;
        } while (contador2 < 3);
        
        
    }
}
