import java.util.Scanner;



public class ScannerExample {
  
    public static void main(String args[]) {
        System.out.println("Escribe tu nombre");
        
        Scanner consola = new Scanner(System.in);
        
        var Usuario = consola.nextLine();
        System.out.println("Usuario = " + Usuario);
        
        System.out.println("Escribe el titlulo");
        var Titulo = consola.nextLine();
        
        System.out.println(Titulo);
               
}
    
}
