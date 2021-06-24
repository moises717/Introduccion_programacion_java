import java.util.Scanner;
        
public class GalonesALitros {
   
   public static void main(String[] args) {
       
       // Iniciar clase para introducir numeros por consola
       Scanner console = new Scanner(System.in);
        
       // datos de conversion
        var galonEnLitro = 3.785;
        var totalPipas = 3;
        
        
        // Introducir cantidad de galones a convertir
        System.out.println("Ingresar galones a convertir \n");
        var galones = console.nextLine();
        
        // Total de galones por la cantidad d pipas
        var totalGalonesEnLitros = Integer.parseInt(galones)* galonEnLitro;
        
        // total de litros por la cantidad de pipas
        var totalLitros = totalGalonesEnLitros * totalPipas;
        
        // Imprimir resultado
        System.out.println("Resultado total: " + totalLitros);
       
        
   }
}
