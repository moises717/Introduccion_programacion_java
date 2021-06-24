/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operadores;

import java.util.Scanner;


public class Tarea2 {
    
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
    
            
          System.out.println("Proporciona num 1");
          int num1 = Integer.parseInt(consola.nextLine());
          
          System.out.println("Proporciona num 2");
          int num2 = Integer.parseInt(consola.nextLine());
          
          var result = num1 > num2 ? num1 : num2;
          
          System.out.println("numero mayor es = " + result);
          
    }
    
}
