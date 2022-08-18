/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio5;

import Entidades.Cuenta;
import Entidades.Servicios.ServiciosCuenta;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class PooEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int opc;
        
        ServiciosCuenta serv = new ServiciosCuenta();
        Cuenta c1 = new Cuenta();
        c1=serv.nuevacuenta();
        
        do {
            System.out.println("Ingrese la opcion deseada");
            System.out.println("1-Depositar dinero");
            System.out.println("2-Retirar dinero");
            System.out.println("3-Extraccion rapida (retira el 20% del saldo disponible)");
            System.out.println("4-Consultar Saldo");
            System.out.println("5-Consultar Datos");
            System.out.println("9-SALIR");
            opc=leer.nextInt();
            
            switch(opc){
                case 1 : serv.ingresar(c1);
                break;
                case 2 : serv.retirar(c1);
                break;
                case 3 : serv.extraccionrapida(c1);
                break; 
                case 4 : serv.consultarsaldo(c1);
                break;
                case 5 : serv.consultardatos(c1);
                break;
                default: opc=9;
                }
                    
        }while (opc!=9);
            
        
    }
    
}
