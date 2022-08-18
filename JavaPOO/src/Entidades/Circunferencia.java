/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class Circunferencia {
       private double radio;
    public Circunferencia() {
    }
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer=new Scanner (System.in);
        System.out.println("ingrese el radio");
        radio=leer.nextDouble();
    }
    /************************/
    
    public double area(){
        
    return radio*radio*3.14;
    }
    public double peri(){
        return radio * (3.14*2);
    }
}

