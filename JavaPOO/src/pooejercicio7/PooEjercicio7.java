/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio7;

import Entidades.Persona;
import Entidades.Servicios.ServiciosPersona;

/**
 *
 * @author Fer
 */
public class PooEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Persona [] vector = new Persona[4];
    ServiciosPersona serv = new ServiciosPersona();
    vector[0]=serv.crearPersona();
    vector[1]=serv.crearPersona();
    vector[2]=serv.crearPersona();
    vector[3]=serv.crearPersona();
    boolean age;
    int peso;
    int gordo=0;
    int bien=0;
    int flaco=0;
    int mayor=0;
    int menor=0;
    
    for (int i=0 ; i<4 ; i++){
        peso=serv.calcularIMC(vector[i]);
        if(peso==-1){
            flaco++;}
        else if(peso==0){
            bien++;}
        else gordo++;
        age=serv.esMayorDeEdad(vector[i]);
        if(age==true){
            mayor++;
        }else menor++;
    }
    
        System.out.println("El porcentaje de personas con sobrepeso es " + (gordo*100/4) + " %");
        System.out.println("El porcentaje de personas con peso ideal es " + (bien*100/4) + " %");
        System.out.println("El porcentaje de personas con peso bajo es " + (flaco*100/4) + " %");
        System.out.println("El porcentaje de personas mayores de edad es " + (mayor*100/4) + " %");
        System.out.println("El porcentaje de personas menores de edad es " + (menor*100/4) + " %");
    
    
    }
}