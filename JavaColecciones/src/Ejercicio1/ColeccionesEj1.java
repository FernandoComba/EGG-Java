/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class ColeccionesEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razasPerros = new ArrayList();
        String raza;
        String opc;
        String raza2;
        String opc2="";
        do {
            System.out.println("Ingrese una raza de perro");
            raza = leer.next();
            razasPerros.add(raza);
            System.out.println("Desea agregar otra raza? (s/n)");
            opc= leer.next();
        } while (!opc.equalsIgnoreCase("n"));
        
        for ( String var : razasPerros){
            System.out.println(var);
        }
        
        do {
        System.out.println("Ingrese la raza que desea eliminar de la lista");
        raza2= leer.next();
        System.out.println("---------------------------");
        if (razasPerros.contains(raza2)){
            razasPerros.remove(raza2);
            for ( String var : razasPerros){
            System.out.println(var);}
            System.out.println("Desea eliminar otra raza de la lista? (s/n)");
            opc2=leer.next();
            }else{
                System.out.println("La raza ingresada no se encuentra en la lista");
                for ( String var : razasPerros){
                System.out.println(var);
                }
                System.out.println("Desea intentar nuevamente? (s/n)");
                opc2=leer.next();
        }
        } while (!opc2.equalsIgnoreCase("n"));
    }
}     
    

