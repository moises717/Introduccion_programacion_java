package Operadores;

public class OperadoresCondiconales {

    public static void main(String[] args) {

        var a = 10;
        var valorMin = 0;
        var valormax = 10;

        var resultado = a >= 0 && a <= 10;

        if (resultado) {
            System.out.println("dentro del rango");
        } else {
            System.out.println("dentro de rango");
        }

        var vac = false;
        var diaDes = false;

        if (vac || diaDes) {
            System.out.println("Puede salir");
        } else {
            System.out.println("No tiene tiempo");
        }
    }

}
