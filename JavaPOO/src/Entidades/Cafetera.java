/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Fer
 */
public class Cafetera {
    
    int capacidadmaxima=2000;
    int cantidadactual=0;

    public int getCapacidadmaxima() {
        return capacidadmaxima;
    }

    public void setCapacidadmaxima(int capacidadmaxima) {
        this.capacidadmaxima = capacidadmaxima;
    }

    public int getCantidadactual() {
        return cantidadactual;
    }

    public void setCantidadactual(int cantidadactual) {
        this.cantidadactual = cantidadactual;
    }

    public Cafetera(int capacidadmaxima, int cantidadactual) {
        this.capacidadmaxima = capacidadmaxima;
        this.cantidadactual = cantidadactual;
    }

    public Cafetera() {
    }
    
}
