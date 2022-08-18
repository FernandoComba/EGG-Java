/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class ServiciosCafetera {

Scanner leer = new Scanner(System.in);

public void llenarCafetera (Cafetera caf){
    
    caf.setCantidadactual(caf.getCapacidadmaxima());
    System.out.println("Cantidad en la cafetera " + caf.getCantidadactual() + " cm3");
    
}

public void servirTaza (Cafetera taz){
    
    int taza;
    System.out.println("Ingrese el tamañano de la taza a servir (en cm3)");
    taza=leer.nextInt();
    
    if(taz.getCantidadactual()<taza){
        System.out.println("La cantidad actual no es sufiente para llenar la taza");
        System.out.println("Solo se sirvieron " + taz.getCantidadactual() + "cm3");
        taz.setCantidadactual(0);
        
    }
    else{taz.setCantidadactual(taz.getCantidadactual()-taza);
        System.out.println("Se lleno la taza, cantidad disponible " + taz.getCantidadactual() + " cm3");    
}
}
public void vaciarCafetera (Cafetera empty){
    
    empty.setCantidadactual(0);
    System.out.println("la cafetera esta vacia");
    
}

public void agregarCafe (Cafetera ing){
    int agregar;
    System.out.println("Ingrese la cantidad de cafe para agregar en la cafetera (en cm3)");
    agregar=leer.nextInt();
    if((ing.getCantidadactual()+agregar)>ing.getCapacidadmaxima()){
        System.out.println("La cantidad a agregar supera el espacio disponible");
        System.out.println("Capacidad dispobible " + (ing.getCapacidadmaxima()-ing.getCantidadactual()) + " cm3");
        
    }else{  
              System.out.println("Se agrego a la cafetera " + agregar + " cm3");
              ing.setCantidadactual(agregar+ing.getCantidadactual());
              System.out.println("Cantidad actual " + ing.getCantidadactual() + " cm3");  
                
    }    
    }        
}


    

