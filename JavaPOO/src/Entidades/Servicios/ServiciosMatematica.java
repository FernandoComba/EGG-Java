/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

import Entidades.Matematica;

/**
 *
 * @author Fer
 */
public class ServiciosMatematica {
    
    public void devolverMayor(Matematica ejer){
        
        if(ejer.getNum1()>ejer.getNum2()){
            System.out.println("El primer numero tiene mayor valor");
        }else System.out.println("El segundo numero tiene mayor valor");
    }
    
    public float calcularPotencia(Matematica ejer2){
        float mayor=0;
        float menor=0;
        float potencia=0;
        if(ejer2.getNum1()>ejer2.getNum2()){
           mayor=(float) Math.ceil(ejer2.getNum1());
           menor=(float) Math.ceil(ejer2.getNum2());
           System.out.println("Valor redondeado del primer numero " + mayor);
           System.out.println("Valor redondeado del segundo numero " + menor);
           potencia=(float) Math.pow(mayor, menor);
           
        }else {
           mayor=(float) Math.ceil(ejer2.getNum1());
           menor=(float) Math.ceil(ejer2.getNum2());
           System.out.println("Valor redondeado del primer numero " + mayor);
           System.out.println("Valor redondeado del segundo numero " + menor);
           potencia=(float) Math.pow(menor, mayor);
            
        }
           
        System.out.println("La potencia del numero de mayor valor elevada al numero de menor valor es " + potencia);
        return potencia;
    }
    
    public void calculaRaiz(Matematica ejer3){
        
       int num1;
       int num2;
       num1=(int) Math.abs(ejer3.getNum1());
       num2=(int) Math.abs(ejer3.getNum2());
       System.out.println("El valor absoluto del primer numero es " + num1);
       System.out.println("El valor absoluto del segundo numero es " + num2);
       System.out.println("La raiz cuadrada del primer numero es " + Math.sqrt(num1));
       System.out.println("La raiz cuadrada del segundo numero es " + Math.sqrt(num2));
        
    }
    
    
    
}