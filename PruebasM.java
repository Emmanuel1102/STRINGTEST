/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasm;

import java.lang.reflect.Array;
import java.util.Vector;

/**
 *
 * @author emman
 */
public class PruebasM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        //PRIMERA FORMA
       String valor ="EL RAP DE FERNAFLO";
        valor = valor.replaceAll("(?=\\s)", "\n");        
        System.out.println(valor);

        //SEGUNDA FORMA
          String foo = "EL RESPETO AL DERECHO AJENO ES LA PAZ";
          String[] bar = foo.split("(?=\\s)");
                for (String foobar : bar ){
                   System.out.println(foobar);
           }

                
        //3ERA FORMA
        String text = "LA MASCARA DEL CAOS";
        String[] vacio = text.split("(?=\\s)");
 
        for (int i = 0; i < vacio.length; i++) {
	System.out.println(vacio[i]);
            }
                
                
}
}
