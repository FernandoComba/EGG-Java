/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio1;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class PooEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            /**
     * @param args the command line arguments
     * 1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío.
* 
* Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas.
* 
     */
     
       Scanner leer = new Scanner(System.in); 
       Libro tomo1 = new Libro();   
       tomo1.Alta();
        System.out.println(tomo1.toString());
        
       Libro tomo2 = new Libro();   
       System.out.println("Ingres isbm para tomo 2 ");
       tomo2.ISBN = leer.next();
       System.out.println(tomo2.toString());
       
    }
}
    
    

