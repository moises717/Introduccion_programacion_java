// Mi clase hola mundo en java

public class Variables {
        
    public static void main(String args[]){
        
        // definimos las variables
        int myVariableEntera  = 20;
        String nombre = "Moises";
            
        // modificamos las variables
        myVariableEntera = 10;
       
        System.out.println(myVariableEntera);
        System.out.println(nombre);
       
        // var - interferencia de tipos en Java 
        
        var myVarEntera = 50;
        System.out.println(myVarEntera + " variables");
        
        var strinVar = "Hola mundo con var";
        System.out.println("strinVar = " + strinVar);
        System.out.println(strinVar);
        
        var $myVar = 20;
        var _hola = "hola gente";
        
        // Posible pero se recomienda utizar (letras con acentos)
        var ávar = "hola";

                
    }
    
}
