/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operadores;

import java.util.Scanner;

/**
 *
 * @author Moises
 */
public class Tarea {
    public static void main(String[] args) {
        
        var consola = new Scanner(System.in);
        
        System.out.println("Proporcionar alto");
      int alto = Integer.parseInt(consola.nextLine());
      
        System.out.println("Proporcionar ancho");
      int ancho = Integer.parseInt(consola.nextLine());
      
      var area = alto * ancho;
      
      var perimetro = (alto + ancho) * 2;
      
        System.out.println("Area: " + area + "\n");
        System.out.println("Perimetro: " + perimetro);
      
              
        
        
        
    }
}
