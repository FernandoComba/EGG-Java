/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

import Entidades.Almacen;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class ServiciosAlmacen {
    
    HashMap <String,Integer> Listaprecios = new HashMap();
    Scanner leer = new Scanner(System.in);
    
    public void ingresarProducto(){
         Integer precio;
         String producto;
         String opc;
    
        do{
            System.out.println("Ingrese el nombre del producto");
            producto=leer.next().toUpperCase();
            System.out.println("Ingrese el precio del producto");
            precio=leer.nextInt();
            Listaprecios.put(producto, precio);
            
            System.out.println("Desea ingresar un nuevo producto? (s/n)");
            opc=leer.next();
 
        }while (!opc.equalsIgnoreCase("n"));
    }
    
    public void mostrarlista(){
        
        for (Map.Entry<String, Integer> entry : Listaprecios.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("Producto: " + key + " " + "Precio: " + value);
        }
    }
    
    public void modificarPrecio(){
        String opc="";
        Integer precio;
        String articulo;
        do{
            System.out.println("Ingrese el articulo para modificar su precio");
            articulo=leer.next().toUpperCase();
            if (Listaprecios.containsKey(articulo)){
                System.out.println("Ingrese el nuevo precio");
                precio=leer.nextInt();
                Listaprecios.put(articulo, precio);
                System.out.println("Precio modificado");
            }else System.out.println("El articulo ingresado no se encuentra en la lista");
            
            System.out.println("Desea intentarlo nuevamente? (s/n)");
            opc=leer.next();
        }while(!opc.equalsIgnoreCase("n"));
    }
    
    public void eliminarProducto(){
        
        String opc;
        String articulo;
        do{
            System.out.println("Ingrese el articulo que desea eliminar de la lista");
            articulo=leer.next().toUpperCase();
            if (Listaprecios.containsKey(articulo)){
                Listaprecios.remove(articulo);
                System.out.println("Articulo eliminado");
            }else System.out.println("El articulo ingresado no se encuentra en la lista");
            
            System.out.println("Desea intentarlo nuevamente? (s/n)");
            opc=leer.next();
        }while (!opc.equalsIgnoreCase("n"));
    }
}
