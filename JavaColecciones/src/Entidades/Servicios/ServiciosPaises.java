/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

import Entidades.Paises;
import Entidades.Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class ServiciosPaises {
    
    HashSet<Paises> listapaises = new HashSet();
    Scanner leer = new Scanner(System.in);
    
    public void ingresarPais(){
        
        String opc;
    
        do{
            Paises lista = new Paises();
            System.out.println("Ingrese el nombre del pais");
            lista.setPais(leer.next().toUpperCase());
            listapaises.add(lista);
            System.out.println("Desea ingresar un nuevo pais? (s/n)");
            opc=leer.next();
 
        }while (!opc.equalsIgnoreCase("n"));
    }
    
    public void mostrarlista(){
        
        for (Paises var : listapaises){
            System.out.println(var);
        }
    }
    
    public void ordenalfabetico(){
        
        ArrayList<Paises> listadopaises = new ArrayList(listapaises);
        Collections.sort(listadopaises, Comparadores.ordenalfabetico);
        for(Paises var : listadopaises){
            System.out.println(var);
        }
    }
    public void eliminarPais(){
        
        Boolean opc=false;
        String eleccion;
        Iterator<Paises> it = listapaises.iterator();
        System.out.println("Ingrese el pais que desea eliminar de la lista");
        eleccion=leer.next();
        while (it.hasNext()){
           if (it.next().getPais().equalsIgnoreCase(eleccion)){
               it.remove();
               opc=true;
            }
        }
        if (!opc){
               System.out.println("El pais no se encuentra en la lista");
        }
    }
}
