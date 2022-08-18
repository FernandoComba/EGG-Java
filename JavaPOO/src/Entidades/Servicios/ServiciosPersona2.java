/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

import Entidades.Persona2;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class ServiciosPersona2 {
    
    Scanner leer = new Scanner(System.in);
            
    /**
     *
     */
    public Persona2 crearPersona(){
        Persona2 pers = new Persona2();
        System.out.println("Ingrese el nombre de la persona");
        pers.setNombre(leer.next());
        System.out.println("ingrese dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("ingrese mes de nacimiento");
        int mes = leer.nextInt()-1;
        System.out.println("ingrese año de nacimiento");
        int anio = leer.nextInt()-1900;
        Date fecha = new Date(dia,mes,anio);
        fecha.setDate(dia);
        fecha.setMonth(mes);
        fecha.setYear(anio);
        pers.setNacimiento(fecha);
        return pers;
        
    }
    
    public int calcularEdad(Persona2 nue){
        int edad;
        Date actual = new Date();
        edad=actual.getYear()-(nue.getNacimiento().getYear());
        return edad;
    }
    public void menorQue(Persona2 nue2){
        
        Date actual = new Date();
        int edad;
        int edadper;
        System.out.println("Ingrese una edad");
        edad=leer.nextInt();
        edadper = actual.getYear()-nue2.getNacimiento().getYear();
        if (edad<edadper){
           
            System.out.println("true");
        } else System.out.println("false");
            
    }
    
    public void mostrarPersona(Persona2 nue3){
        
        System.out.println(nue3.toString());
    }
}
