
public class TiposPrimitivosEnteros {
    
    public static void main(String[] args) {
        /*
        tipos primitivos enteros: byte(8bit), short(16bit), int(32bit), long(64bit)
        */
        
        byte numeroByte = 10;
        System.out.println("valor byte: " + numeroByte);
        System.out.println("valor minimo dl byte: " + Byte.MIN_VALUE);
        System.out.println("valor maximo dl byte: \n\n" + Byte.MAX_VALUE);
        
        short numeroShort = 25012;
        // short numeroShort = (short)250123 forzar inprimir;
        System.out.println("numeroShort MINIMO = " + Short.MIN_VALUE);
        System.out.println("numeroShort MAXIMO= " + Short.MAX_VALUE);
        System.out.println("numero short = \n\n" + numeroShort);
        
        int numeroInt = 1024555524;
        //int numeroInt = (int)1025445555254L; convertir a long
        System.out.println("numeroInt MINIMO =" + Integer.MIN_VALUE);
        System.out.println("numeroInt MAXIMO =" + Integer.MAX_VALUE);
        System.out.println("numero int = \n\n" + numeroInt);
        
        
        long numeroLong = 102455;
        // long numeroLong = 10245555244L; forzar convertir a long
       
        System.out.println("numero Long MINIMO = " + Long.MIN_VALUE);
        System.out.println("numero Long MAXIMO= " + Long.MAX_VALUE);
        System.out.println("numero Long = \n\n" + numeroLong);
        
        
        
    }
}
