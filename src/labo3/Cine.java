/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo3;

import java.util.ArrayList;

/**
 *
 * @author Dismaelectric
 */
public class Cine {
    
    private String nombre;
    private String lema;
    ArrayList <Funcion> funcion;

    public Cine(String nombre) {
        this.nombre = nombre;
    }

    public Cine(String nombre, String lema) {
        this.nombre = nombre;
        this.lema = lema;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
