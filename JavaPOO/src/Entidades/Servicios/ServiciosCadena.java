/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class ServiciosCadena {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void mostrarVocales(Cadena c1){
        int vocales=0;
        for (int i=0 ; i<c1.getLongitud() ; i++){
            if (c1.getFrase().substring(i,i+1).equalsIgnoreCase("a")||c1.getFrase().substring(i,i+1).equalsIgnoreCase("e")||c1.getFrase().substring(i,i+1).equalsIgnoreCase("i")||c1.getFrase().substring(i,i+1).equalsIgnoreCase("o")||c1.getFrase().substring(i,i+1).equalsIgnoreCase("u"))
            vocales++;
            
        }
        System.out.println("La cantidad de vocales en la frase es " + vocales);
    }
    
    public void invertirFrase(Cadena c1){
        
        System.out.println("Frase Invertida: ");
        for (int i=c1.getLongitud() ; i>0 ; i--){
            
            System.out.print(c1.getFrase().substring(i-1,i));
            
        }
        System.out.println("");
    }
    
    public void vecesRepetido(Cadena c1){
        
        String letra;
        int repe=0;
        System.out.println("Ingrese la letra a contabilizar");
        letra=leer.next();
        for (int i=0 ; i<c1.getLongitud() ; i++){
            if (c1.getFrase().substring(i,i+1).equalsIgnoreCase(letra))
            repe++;
        
        }
        System.out.println("La letra ingresada se repite " + repe + " veces");
        System.out.println("");
    }
    
    public void compararLongitud(Cadena c1){
        
        String frase;
        System.out.println("Ingrese una frase para comparar");
        frase=leer.next();
        System.out.println("La primera frase tiene una longitud de " + c1.getLongitud() + " caracteres");
        System.out.println("La segunda frase tiene una longitud de " + frase.length() + " caracteres");
        System.out.println("");
    }
    
    public void unirFrases(Cadena cad){
        
        String frase;
        System.out.println("Ingrese una nueva palabra o frase");
        frase=leer.next();
        cad.setFrase(cad.getFrase().concat(frase));
        System.out.println(cad.getFrase());
        System.out.println("");
    }
    
    public void reemplazarLetra(Cadena cad2){
        String letra;
        System.out.println("Ingrese el caracter para reemplazar la letra A");
        letra=leer.next();
        for (int i=0 ; i<cad2.getLongitud() ; i++){
            if (cad2.getFrase().substring(i,i+1).equalsIgnoreCase("a"))
               cad2.setFrase(cad2.getFrase().replace("a", letra));
            }
        System.out.println(cad2.getFrase());
        System.out.println("");
    }
    
    public void contiene(Cadena cad3){
        String letra;
        System.out.println("Ingrese una letra para verificar si se encuentra en la frase");
        letra=leer.next();
            if (cad3.getFrase().contains(letra)){
                System.out.println("Verdadero");
            }else System.out.println("Falso");
     
    }
}
