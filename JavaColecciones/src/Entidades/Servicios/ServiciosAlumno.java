/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class ServiciosAlumno {
    
    ArrayList<Alumno> listaalumnos= new ArrayList();
    Scanner leer = new Scanner(System.in);
    
    public void crearAlumno(){
        ArrayList<Integer> notasal = new ArrayList();
        Alumno nuevo = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            nuevo.setNombre(leer.next());
            for (int i=0 ; i<3 ; i++){
                System.out.println("Ingrese la nota " + (i+1));
                notasal.add(leer.nextInt());
            }
            nuevo.setNotas(notasal);
            listaalumnos.add(nuevo);
    }
    
    public void mostrarLista(){
        
        for (Alumno var : listaalumnos){
            System.out.println(var);
        }
    }
    
    public float notaFinal(){
        boolean existe = false;
        int contador=0;
        float nota=0;
        String al1;
       
        System.out.println("Ingrese el nombre del alumno para calcular la nota final");
        al1=leer.next();
        for (Alumno var : listaalumnos){
            if (var.getNombre().equalsIgnoreCase(al1)){
                existe=true;
                for (int notas : var.getNotas()){
                    contador=contador+notas;
                }
                nota=contador/var.getNotas().size();
            }
        }    
            if (!existe){
                System.out.println("El alumno ingresado no esta en la lista");
            }
        return (nota);
    }
}    
