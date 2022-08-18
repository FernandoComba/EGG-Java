/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class ServiciosRectangulo {
    
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo Rectangulo1(){
    
        Rectangulo R1 = new Rectangulo();
        System.out.println("Ingrese la base del rectangulo");
        R1.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectangulo");
        R1.setAltura(leer.nextInt());
        return R1;
        
    }
    public void calculoSuperficie(Rectangulo sup){
        int superficie;
        superficie = (sup.getBase()*sup.getAltura());
        System.out.println("La superficie es " + superficie);
        
    }
    
    public void calculoPerimetro(Rectangulo per){
        int perimetro;
        perimetro = (per.getBase()+per.getAltura())*2;
        System.out.println("El perimetro es " + perimetro);
    }
    
    public void dibujaRectangulo(Rectangulo dibu){
        
        for(int i=0;i<dibu.getAltura();i++){
        if(i==0 || i==dibu.getAltura()-1){
        for(int j=0;j<dibu.getBase();j++){
          System.out.print(" *");
        }
          System.out.println("");
        }else{for(int j=0;j<dibu.getBase();j++){
            if(j==0){
          System.out.print(" *"); 
            }else if(j==dibu.getBase()-1){
                System.out.println(" *"); 
            }
            else{
                System.out.print("  ");
            }
        }}
            

    }
    }
}
