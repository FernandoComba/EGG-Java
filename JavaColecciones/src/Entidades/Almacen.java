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
public class Almacen {
    
    String nombre;
    Integer precio;

    @Override
    public String toString() {
        return "Almacen{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Almacen(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Almacen() {
    }
    
}
