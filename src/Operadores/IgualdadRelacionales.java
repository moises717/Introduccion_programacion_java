package Operadores;

public class IgualdadRelacionales {

    public static void main(String[] args) {
        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = a != b;
        System.out.println("d = " + d);

        var cadena = "hola";
        var cadena2 = "hola";

        var e = cadena == cadena2;
        System.out.println("e = " + e);

        var f = cadena.equals(cadena2); // comparamos contenido de cadenas
        System.out.println("f = " + f);

        var g = a >= b; // maryor que , mayor o igual
        System.out.println("g = " + g);

        if (a % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("No es par =" + a % 2);
        }
        
        var edad = 30;
        var adulto = 18;
        if(edad >= adulto){
            System.out.println("es adulto");
        }else{
            System.out.println("no es adulto");
        }

    }

}
