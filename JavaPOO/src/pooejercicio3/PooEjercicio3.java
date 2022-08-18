/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio3;

import Entidades.Operacion;

/**
 *
 * @author Fer
 */
public class PooEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Operacion numeros=new Operacion(20,10);
      Operacion numeros2=new Operacion();
      Operacion numeros3=new Operacion();
      numeros2.setNum1(40);
      numeros2.setNum2(5);
        System.out.println(numeros.getNum1());
        System.out.println(numeros.getNum2());
        System.out.println(numeros2.getNum1());
        System.out.println(numeros2.getNum2());
     
        numeros3.crearOperacion();
        
        System.out.println("-----------------------------");
        System.out.println(numeros.sumar());
        System.out.println(numeros.restar());
        System.out.println(numeros.mult());
        System.out.println(numeros.div());
        System.out.println("-----------------------------");
        System.out.println(numeros2.sumar());
        System.out.println(numeros2.restar());
        System.out.println(numeros2.mult());
        System.out.println(numeros2.div());
        System.out.println("-----------------------------");
        System.out.println(numeros3.sumar());
        System.out.println(numeros3.restar());
        System.out.println(numeros3.mult());
        System.out.println(numeros3.div());
    }
    
}
    

