/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicioextra2;

import Entidades.Servicios.ServiciosPuntos;

/**
 *
 * @author Fer
 */
public class PooEjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiciosPuntos serv = new ServiciosPuntos();
        serv.crearPuntos();
        serv.calcularDistancia();
        
    }
    
}
