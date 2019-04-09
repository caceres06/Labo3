/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo3;

/**
 *
 * @author Dismaelectric
 */
public class Funcion {
    private String dia;
    private int numfucion;

    public Funcion(String dia, int numfucion) {
        this.dia = dia;
        this.numfucion = numfucion;
    }

    public Funcion() {
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getNumfucion() {
        return numfucion;
    }

    public void setNumfucion(int numfucion) {
        this.numfucion = numfucion;
    }
    
}
