/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import Entidades.Servicios.ServiciosAlumno;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class ColeccionesEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        ServiciosAlumno al = new ServiciosAlumno();
        String opc;
        String opc2;
        
        do{
            al.crearAlumno();
            System.out.println("Desea ingresar un nuevo alumno? (s/n)");
            opc=leer.next();
        }while (!opc.equalsIgnoreCase("n"));
        
        al.mostrarLista();
        
        do{
            System.out.println("El promedio del alumno es :" + al.notaFinal());
            System.out.println("Desea realizar un nuevo calculo? (s/n)");
            opc2=leer.next();
        }while (!opc2.equalsIgnoreCase("n"));
      
    }
}
