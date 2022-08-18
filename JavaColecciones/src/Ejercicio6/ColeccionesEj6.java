/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import Entidades.Servicios.ServiciosAlmacen;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class ColeccionesEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiciosAlmacen serv = new ServiciosAlmacen();
        int opc;
        Scanner leer = new Scanner(System.in);
        System.out.println("ALMACENAPP");
        System.out.println("-----------");
        
        do{
        System.out.println("Ingrese la opcion deseada");
        System.out.println("1 - Ingresar articulos");
        System.out.println("2 - Modificar precio");
        System.out.println("3 - Eliminar articulo");
        System.out.println("4 - Mostrar Listado de precios");
        System.out.println("9 - SALIR");
        opc=leer.nextInt();
            switch (opc){
            
                case 1: serv.ingresarProducto();
                    break;
                case 2: serv.modificarPrecio();
                    break;
                case 3: serv.eliminarProducto();
                    break;
                case 4: serv.mostrarlista();
                    break;
                case 9: opc=9;
            }
        }while (opc!=9);
    }
    
}
