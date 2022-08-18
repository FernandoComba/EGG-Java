/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio10;

import java.util.Arrays;

/**
 *
 * @author Fer
 */
public class PooEjercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        float [] arregloA = new float [50];
        float [] arregloB = new float [20];
        
        for (int i=0 ; i<arregloA.length ; i++){
            arregloA[i]=(float) (Math.random()*10);  
            System.out.println(arregloA[i] + " ");
            }
        System.out.println("--------------------------");
        
        for (int i=0 ; i<arregloA.length ; i++){
            Arrays.sort(arregloA);
        }    
        for (int i=0 ; i<10 ; i++){
            arregloB[i] = arregloA[i];
        }
        for (int i=10 ; i<20 ; i++){
            arregloB[i] =(float) 0.5;
        }
        for (int i=0 ; i<arregloA.length ; i++){
            System.out.println(arregloA[i]);
        }
        System.out.println("-----------------------------");
        for (int i=0 ; i<arregloB.length ; i++){
            System.out.println(arregloB[i]);
        }
    }
    
}
