/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio4;

import Entidades.Rectangulo;
import Entidades.Servicios.ServiciosRectangulo;

/**
 *
 * @author Fer
 */
public class PooEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServiciosRectangulo Serv = new ServiciosRectangulo();
        Rectangulo Rec1 = new Rectangulo();
        
        Rec1=Serv.Rectangulo1();
        
        Serv.calculoPerimetro(Rec1);
        Serv.calculoSuperficie(Rec1);
        
        System.out.println("-----------------------");
        
        Serv.dibujaRectangulo(Rec1);
        
        
    }
    
}
