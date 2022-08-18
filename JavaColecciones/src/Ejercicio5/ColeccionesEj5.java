/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import Entidades.Servicios.ServiciosPaises;

/**
 *
 * @author Fer
 */
public class ColeccionesEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiciosPaises serv = new ServiciosPaises();
        serv.ingresarPais();
        serv.mostrarlista();
        System.out.println("---------------------------");
        System.out.println("PAISES POR ORDEN ALFABETICO");
        serv.ordenalfabetico();
        serv.eliminarPais();
        serv.mostrarlista();
    }
    
}
