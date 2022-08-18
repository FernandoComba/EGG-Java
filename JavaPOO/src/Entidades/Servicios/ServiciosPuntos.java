/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class ServiciosPuntos {
    
    Scanner leer = new Scanner(System.in);
    Puntos p1 = new Puntos();
    
    public void crearPuntos(){
       
        System.out.println("Ingrese las coordenadas del punto 1");
        p1.setX1(leer.nextDouble());
        p1.setY1(leer.nextDouble());
        System.out.println("Ingrese las coordenadas del punto 2");
        p1.setX2(leer.nextDouble());
        p1.setY2(leer.nextDouble());
    }
    
    public void calcularDistancia(){
        
        double distanciax;
        double distanciay;
        double distancia;
        distanciax=Math.pow((p1.getX2()-p1.getX1()),2);
        distanciay=Math.pow((p1.getY2()-p1.getY1()),2);
        distancia=Math.sqrt(distanciax+distanciay);
        System.out.println("La distancia entre los dos puntos es " + distancia);
       
    }
    
}
