/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import Entidades.Servicios.ServiciosPelicula;

/**
 *
 * @author Fer
 */
public class ColeccionesEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ServiciosPelicula peli = new ServiciosPelicula();
        peli.crearPelicula();
        peli.mostrarPeliculas();
        System.out.println("------------------------------------------------");
        System.out.println("PELICULAS ORDENADAS POR DURACION (Mayor a Menor)");
        peli.ordenporduracionMa();
        System.out.println("------------------------------------------------");
        System.out.println("PELICULAS ORDENADAS POR DURACION (Menor a Mayor)");
        peli.ordenporduracionMe();
        System.out.println("----------------------------------------------");
        System.out.println("PELICULAS ORDENADAS ALFABETICAMENTE POR TITULO");
        peli.ordenportitulo();
        System.out.println("----------------------------------------------");
        System.out.println("PELICULAS ORDENADAS ALFABETICAMENTE POR DIRECTOR");
        peli.ordenpordirector();
    }
    
}
