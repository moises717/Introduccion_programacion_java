/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operadores;

/**
 *
 * @author Moises
 */
public class OperadorTernario {
    public static void main(String[] args) {
        
        var result = (3 > 2) ? "es verdadero" : "no es verdero";
        System.out.println(result);
        
        
        
        var num = 8;
        
        result = (num % 2 == 0) ? "Es par" : "No es par";
        System.out.println("num = " + result);
        
    }
}
