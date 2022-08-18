/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Utilidades;

import Entidades.Paises;
import Entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Fer
 */
public class Comparadores {
    
    public static Comparator<Pelicula> ordenaPorDuracionMa = new Comparator<Pelicula>() {
    @Override
    public int compare(Pelicula t, Pelicula t1) {
        return Integer.compare(t1.getDuracion(),t.getDuracion());
    }
};
    public static Comparator<Pelicula> ordenaPorDuracionMe = new Comparator<Pelicula>() {
    @Override
    public int compare(Pelicula t, Pelicula t1) {
        return Integer.compare(t.getDuracion(),t1.getDuracion());
    }
};
    public static Comparator<Pelicula> ordenaPortiutlo = new Comparator<Pelicula>() {
    @Override
    public int compare(Pelicula t, Pelicula t1) {
        return t.getTitulo().compareTo(t1.getTitulo());
    }
};
    public static Comparator<Pelicula> ordenaPordirector = new Comparator<Pelicula>() {
    @Override
    public int compare(Pelicula t, Pelicula t1) {
        return t.getDirector().compareTo(t1.getDirector());
    }
};
    public static Comparator<Paises> ordenalfabetico = new Comparator<Paises>() {
    @Override
    public int compare(Paises t, Paises t1) {
        return t.getPais().compareTo(t1.getPais());
    }
};
}
