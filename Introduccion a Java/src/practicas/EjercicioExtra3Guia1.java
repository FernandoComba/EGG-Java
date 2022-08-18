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
public class EjercicioExtra3Guia1 {
    public static void main(String[] args) {
        
        /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
           Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        String letra= leer.nextLine();
        
        if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U") ){
            
            
        }else System.out.println("La letra ingresada no es una vocal");
            
}
}
