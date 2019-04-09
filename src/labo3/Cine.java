/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo3;

import java.util.ArrayList;
import java.util.Scanner;

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
    
 public static void AgregarFuncion(){
     Scanner scan = new Scanner(System.in);
     System.out.println("Ingrese el día de la función");
     String diaFuncion = scan.next();
     System.out.println("Ingrese el número de la función");
     int numeFuncion= scan.nextInt();
     scan.nextLine();
     ArrayList<Funcion> f= new ArrayList<>();
     for(int i=0;i<f.size();i++){
         if(!diaFuncion || numeFuncion !=i) {
         } else {
             f.add(new Funcion(diaFuncion,numeFuncion));
         }
     }
    }
}
