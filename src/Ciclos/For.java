/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

/**
 *
 * @author Moises
 */
public class For {
    
    public static void main(String[] args) {
        
          for(var con = 0 ; con < 20 ; con++){
            
            if(con % 2 != 0){
                  continue;
            }
                  System.out.println("con = " + con);
 
        }
       
//        for(var con = 0 ; con < 20 ; con++){
//            
//            if(con % 2 == 0){
//                  System.out.println("con = " + con);
//                  break;
//            }
// 
//        }
    }
    
}
