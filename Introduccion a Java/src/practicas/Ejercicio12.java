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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando 
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del 
segundo, sino informe que no lo son
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner   leer  = new Scanner(System.in); 
        
        System.out.println("Ingrese un numero:"); 
        int  Num1 = leer.nextInt();
                
        System.out.println("Ingrese un segundo numero:"); 
        int  Num2 = leer.nextInt(); 
        Controlador(Num1, Num2);              
    }
    
    public static void Controlador( int A  , int B ) {
        float modulo = A % B ; 
        if (modulo == 0 ) {
            System.out.println("Si son multimplos");
        } else {
            System.out.println("NO son multimplos");
        }
    }
}
    

