/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio8;

import Entidades.Cadena;
import Entidades.Servicios.ServiciosCadena;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class PooEjercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServiciosCadena serv = new ServiciosCadena();
        Scanner leer = new Scanner (System.in);
        Cadena c1 = new Cadena();
        System.out.println("Ingrese una palabra o frase");
        c1.setFrase(leer.nextLine());
        c1.setLongitud(c1.getFrase().length());
        serv.mostrarVocales(c1);
        serv.invertirFrase(c1);
        serv.vecesRepetido(c1);
        serv.compararLongitud(c1);
        serv.unirFrases(c1);
        serv.reemplazarLetra(c1);
        serv.contiene(c1);
    }
    
}
