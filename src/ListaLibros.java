
import java.util.Scanner;



public class ListaLibros {
    
  
  public static void main(String args[]){
       Scanner consola = new Scanner(System.in);
    
      System.out.println("Proporcione un titulo");
        var Titulo = consola.nextLine();
      
      System.out.println("Proporcione el autor");
        var Autor = consola.nextLine();
       
      System.out.println(Titulo + " " + "Fue escrito por" + Autor);
      
      
      
  }
    
    
    
    
}
