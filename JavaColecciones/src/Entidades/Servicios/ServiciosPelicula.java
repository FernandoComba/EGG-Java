/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

import Entidades.Pelicula;
import Entidades.Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class ServiciosPelicula {
    
    ArrayList<Pelicula> listaPeliculas = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    public void crearPelicula(){
     
        String opc;
        do{
            Pelicula nuevapeli = new Pelicula();
            System.out.println("Ingrese el titulo de la pelicula");
            nuevapeli.setTitulo(leer.next());
            System.out.println("Ingrese el nombre del director");
            nuevapeli.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la pelicula");
            nuevapeli.setDuracion(Integer.parseInt(leer.next()));
            listaPeliculas.add(nuevapeli);
            System.out.println("Desea ingresar una nueva pelicula? (s/n)");
            opc=leer.next();
            
        }while (!opc.equalsIgnoreCase("n"));
        
    }
    public void mostrarPeliculas(){
        System.out.println("LISTA DE PELICULAS");
        for(Pelicula var: listaPeliculas){
            System.out.println(var);
        }
        System.out.println("PELICULAS CON DURACION DE MAS DE UNA HORA");
        System.out.println("-----------------------------------------");
        for(Pelicula var2: listaPeliculas){
            if(var2.getDuracion()>1){
                System.out.println(var2);
            }
        }
    }
    public void ordenporduracionMa(){
        Collections.sort(listaPeliculas, Comparadores.ordenaPorDuracionMa);
        for(Pelicula var: listaPeliculas){
            System.out.println(var);
        }  
    }
     public void ordenporduracionMe(){
        Collections.sort(listaPeliculas, Comparadores.ordenaPorDuracionMe);
        for(Pelicula var: listaPeliculas){
            System.out.println(var);
        }  
    }
     public void ordenportitulo(){
        Collections.sort(listaPeliculas, Comparadores.ordenaPortiutlo);
        for(Pelicula var: listaPeliculas){
            System.out.println(var);
        }  
    }
     public void ordenpordirector(){
        Collections.sort(listaPeliculas, Comparadores.ordenaPordirector);
        for(Pelicula var: listaPeliculas){
            System.out.println(var);
        }  
    }
}
