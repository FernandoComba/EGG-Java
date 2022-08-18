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
public class Cuenta {
    
    int numcta;
    long dni;
    double saldoactual;

    public Cuenta() {
    }

    public Cuenta(int numcta, long dni, int saldoactual) {
        this.numcta = numcta;
        this.dni = dni;
        this.saldoactual = saldoactual;
    }

    public int getNumcta() {
        return numcta;
    }

    public void setNumcta(int numcta) {
        this.numcta = numcta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(double saldoactual) {
        this.saldoactual = saldoactual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numcta=" + numcta + ", dni=" + dni + ", saldoactual=" + saldoactual + '}';
    }
    
}
