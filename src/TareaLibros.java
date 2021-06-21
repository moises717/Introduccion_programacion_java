
import java.util.Scanner;


public class TareaLibros {
    
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        
        // nombre libro
        System.out.println("Nombre del libro");
        var nombreLibro = consola.nextLine();
        
        // id del libro
        System.out.println("id del libro");
        int idLibro = Integer.parseInt(consola.nextLine());
        
        //precio 
         System.out.println("precio libro");
        double precioLIbro = Integer.parseInt(consola.nextLine());
        
        // envio libro
        System.out.println("Proporciona envio gratuito");
        var envioGratuito = consola.nextLine();
        
        System.out.println("nombre libro: "+ nombreLibro);
        System.out.println("Precio: "+ precioLIbro);
        System.out.println("envio gratuito: "+ envioGratuito);

        
    }
    
}
