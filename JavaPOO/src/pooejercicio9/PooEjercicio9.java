/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio9;

import Entidades.Matematica;
import Entidades.Servicios.ServiciosMatematica;

/**
 *
 * @author Fer
 */
public class PooEjercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServiciosMatematica serv = new ServiciosMatematica();
        Matematica ejercicios = new Matematica();
        ejercicios.setNum1((float)Math.random()*10);
        ejercicios.setNum2((float)Math.random()*10);
        System.out.println(ejercicios.toString());  
        serv.devolverMayor(ejercicios);
        serv.calcularPotencia(ejercicios);
        serv.calculaRaiz(ejercicios);
        
    }
    
}
