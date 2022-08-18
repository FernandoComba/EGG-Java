/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio12;

import Entidades.Persona2;
import Entidades.Servicios.ServiciosPersona2;

/**
 *
 * @author Fer
 */
public class PooEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona2 per = new Persona2();
        ServiciosPersona2 serv = new ServiciosPersona2();
        per=serv.crearPersona();
        System.out.println(serv.calcularEdad(per));
        serv.menorQue(per);
        serv.mostrarPersona(per);
           
    }
    
}
