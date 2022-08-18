/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class ServiciosCuenta {
    
    Scanner leer = new Scanner(System.in);
    
    public Cuenta nuevacuenta(){
        
        Cuenta c1 = new Cuenta();
        System.out.println("Ingrese el numero de cuenta");
        c1.setNumcta(leer.nextInt());
        System.out.println("Ingrese el DNi del usuario");
        c1.setDni(leer.nextLong());
        c1.setSaldoactual(0);
        return c1;
        
        
    }
    
    public void ingresar(Cuenta ing){
        
        double ingreso;
        System.out.println("Ingrese el monto a acreditar en la cuenta");
        ingreso = leer.nextDouble();
        ing.setSaldoactual(ing.getSaldoactual()+ingreso);
        System.out.println("El saldo actual es " + ing.getSaldoactual());
        
    }
    
    public void retirar(Cuenta ret){
        
        double retiro;
        System.out.println("Ingrese el monto que desea retirar");
        retiro = leer.nextDouble();
        
        if (retiro>ret.getSaldoactual()){
            System.out.println("El saldo que desea retirar es mayor al saldo disponible");
            ret.setSaldoactual(0);
            System.out.println("El saldo actual es " + ret.getSaldoactual());
            }
            else ret.setSaldoactual(ret.getSaldoactual()-retiro);
            System.out.println("El saldo actual es " + ret.getSaldoactual());
                              
    }
    
    public void extraccionrapida(Cuenta ext){
        
        ext.setSaldoactual(ext.getSaldoactual()-(ext.getSaldoactual()*0.2));
        System.out.println("El saldo actual es " + ext.getSaldoactual());
        
    }
    
    public void consultarsaldo(Cuenta cons){
        
        System.out.println("El saldo actual es " + cons.getSaldoactual());
    }
    
    public void consultardatos(Cuenta datos){
        
        System.out.println(datos.toString());
                
    }
    
}
