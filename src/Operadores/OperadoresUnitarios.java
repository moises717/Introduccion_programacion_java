
package Operadores;


public class OperadoresUnitarios {
   
    public static void main(String args[]){
        var a = 3;
        var b = -a;
        System.out.println("b = " + b);
        
        
        // solo para tipos booleanos
        var c = true;
        var d = !c;
        System.out.println("d = " + d);
        
        //Incremento
        // preincrmento
        
        var e = 3;
        var f = ++e;   
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        // postincremnet
        var g = 5;
        var h = g++;
        System.out.println("g se incrmeneta primero = " + g);
        System.out.println("h valor actual = " + h);
        
        //decremento 
        var i = 2;
        var j = --i;
        System.out.println("j = " + j);
        
        // postdecremneto 
        
        var k = 4;
        var l = k--;
        System.out.println("l = " + l);
        System.out.println("k = " + k);
    }
  
}
