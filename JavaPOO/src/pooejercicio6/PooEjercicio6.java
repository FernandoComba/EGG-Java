/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio6;

import Entidades.Cafetera;
import Entidades.Servicios.ServiciosCafetera;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class PooEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Cafetera cafe1 = new Cafetera();
        ServiciosCafetera serv = new ServiciosCafetera();
        
        int opc;
        
        do {
            System.out.println("Ingrese la opcion deseada");
            System.out.println("1-Llenar Cafetera");
            System.out.println("2-Servir Taza");
            System.out.println("3-Vaciar Cafetera");
            System.out.println("4-Agregar Cafe");
            System.out.println("9-SALIR");
            opc=leer.nextInt();
            
            switch(opc){
                case 1 : serv.llenarCafetera(cafe1);
                break;
                case 2 : serv.servirTaza(cafe1);
                break;
                case 3 : serv.vaciarCafetera(cafe1);
                break; 
                case 4 : serv.agregarCafe(cafe1);
                break;
                default: opc=9;
                }
                    
        }while (opc!=9);
        
        
        
        
        
        
    }
    
}
