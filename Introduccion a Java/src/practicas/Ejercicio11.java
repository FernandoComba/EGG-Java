/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class Ejercicio11 {
    
    
   public static void main(String[] args) {
        // EJERCICIO 11  // 
        Scanner   leer = new Scanner(System.in); 
        String texto ;
        String ultimo;
        int   largo=0;
        do {
            System.out.println("Ingrese  un texto  (finalizado en punto)");
            texto  =  leer.nextLine();
          //  System.out.println( texto);
            largo = texto.length();
          //  System.out.println(largo);           
            ultimo = texto.substring(texto.length()-1, texto.length()) ;
          //  System.out.println( "<<" +  ultimo + ">>" );
           } while ( !(ultimo.equals("."))  ) ;       
        
        
       // System.out.println("Salio... ");
        String Salida = "";
        for (int i = 0 ; i < largo-1 ; i++){
           //Salida.concat(cambio( texto.substring(i, i+1) )) ;         
           Salida = Salida.concat( cambio(texto.substring(i, i+1)) );            
         //  System.out.println(Salida);
          // System.out.println(texto.substring(i, i+1) + "-->" + cambio(texto.substring(i, i+1)));
         //  System.out.println(Salida);
        }
        System.out.println(Salida);
    }
    /* -------------------*/ 
    public static String cambio( String pLetra ) {
        String retornar ;
        switch (pLetra) {
            case "a" : retornar = "@";
            break;
             case "e" : retornar = "#";
            break;
             case "i" : retornar = "$";
            break;
             case "o" : retornar = "%";
            break;
             case "u" : retornar = ".";
            break;
            default : {
                      retornar = pLetra;  
                }
        } 
        return   retornar; 
    }
    
}

/*

public class ConcatExample{    
public static void main(String args[]){    
String s1="java string";    
// The string s1 does not get changed, even though it is invoking the method      
// concat(), as it is immutable. Therefore, the explicit assignment is required here.  
s1.concat("is immutable");    
System.out.println(s1);    
s1=s1.concat(" is immutable so assign it explicitly");    
System.out.println(s1);    
}}

*/
    
    

