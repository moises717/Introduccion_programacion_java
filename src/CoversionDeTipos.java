
import java.util.Scanner;


public class CoversionDeTipos {
    
    public static void main(String[] args) {
        // convertir tipo string a tipo int
        
        
//        var edad2 = "20";
//        System.out.println("string "+ edad2);
//        
//        var edad = Integer.parseInt("20");
//        System.out.println("edad: " + (edad + 20));
//        
//        var valorPI = Double.parseDouble("3.1416");
//        System.out.println("valor pi" + valorPI);
//        
//        
        var consola = new Scanner(System.in);
//        System.out.println("Propociona tu edad"); 
//        edad = Integer.parseInt(consola.nextLine());
//         
//        System.out.println("tu edad es: " + edad);
         
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        
        var character = "hola".charAt(1); // chartAt abtiene letra por letra segun el indice que se le indice
        System.out.println("character = " + character);
        
        System.out.println("Propociona un caracter: ");
        
        character = consola.nextLine().charAt(1);
        System.out.println("character = " + character);
        
  
    }
    
}
