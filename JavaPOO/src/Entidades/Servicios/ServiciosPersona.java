/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class ServiciosPersona {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    /**
     *
     * @return
     */
    public Persona crearPersona(){
        
        String opc;
                
        Persona pers = new Persona();
        System.out.println("Ingrese el Nombre");
        pers.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        pers.setEdad(leer.nextInt());
        System.out.println("Ingrese el peso");
        pers.setPeso(leer.nextInt());
        System.out.println("Ingrese la altura (en Cm)");
        pers.setAltura(leer.nextInt());
        
        do { System.out.println("Ingrese el sexo (M-Masculino)(F-Femenino)(O-Otro)");
             opc=leer.next();
        if  (opc.equalsIgnoreCase("O")|| opc.equalsIgnoreCase("F")|| opc.equalsIgnoreCase("M")){
            pers.setSexo(opc);
            break;}
        
        else {System.out.println("El sexo ingresado no es correcto, por favor ingreselo nuevamente");
        }
        }while (opc!="O"||opc!="F"||opc!="M");
        
        
        return pers;    
        
 
    };
    
    public int calcularIMC(Persona per){
        
        double imc;
        double alt;
        alt=((double)per.getAltura()/100)*((double)per.getAltura()/100);
        imc=((double)per.getPeso()/alt);
      
        if(imc<20){
            return -1;}
            else if(imc>=20 && imc<=25){
                    return 0;}
            else return 1;
                    
    }
    
    public boolean esMayorDeEdad(Persona age){
        
        if(age.getEdad()>=18){
            return true;
        }else return false;
        
    }
}
        
        
    
    
    
