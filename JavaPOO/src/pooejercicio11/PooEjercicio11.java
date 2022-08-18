/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class PooEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
   
        System.out.println("Ingrese una fecha");
        
        int dia = leer.nextInt();
        int mes = leer.nextInt()-1;
        int anio = leer.nextInt()-1900;
        Date fecha = new Date(dia,mes,anio);
        fecha.setDate(dia);
        fecha.setMonth(mes);
        fecha.setYear(anio);
        fecha.toString();
        
        System.out.println(fecha);
        Date fechactual = new Date();
        System.out.println(fechactual);
        
        System.out.println("La diferencia de años entre las fechas es de " + (fechactual.getYear()-fecha.getYear()) + " años");
 
    }
    
}
