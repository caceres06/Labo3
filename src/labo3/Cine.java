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
    
    private String nombre= "Cinepolis";
    private String lema="Cinepolis, la capital del cine";
    ArrayList <Funcion> funcion;

    public Cine() {
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
     Funcion fun = new Funcion(diaFuncion,numeFuncion);
     for(int i=0;i<f.size();i++){
         Funcion aux =f.get(i);
         if(fun==aux){
             throw new IllegalStateException("Esta funcion ya existe, por favor ingrese otros datos");
         } else{
             f.add(fun);
         }
         }
     }
public static void EditarFuncion(){
Scanner scan = new Scanner(System.in);
     System.out.println("Ingrese el día de la función");
     String diaFuncion = scan.next();
     System.out.println("Ingrese el número de la función");
     int numeFuncion= scan.nextInt();
     scan.nextLine();
     ArrayList<Funcion> f= new ArrayList<>();
     Funcion fun = new Funcion(diaFuncion,numeFuncion);
     for(int i=0;i<f.size();i++){
         Funcion aux =f.get(i);
         if(fun==aux){
             System.out.println("Ingrese el nuevo día de la función");
             fun.setDia(scan.next());
             System.out.println("Ingrese el nuevo número de función");
             fun.setNumfucion(scan.nextInt());
             scan.nextLine();
         } else{
             throw new IllegalStateException("Esta funcion no existe, por favor ingrese otra función para modificar");
         }
         }
     }
public static void ImprimirCartelera(){
    ArrayList<Funcion> f= new ArrayList<>();
    for(int i=0;i<f.size();i++){
        System.out.println("-----CARTELERA-----");
        System.out.println(f.get(i));
    }
}
public static void InfoCine(){
    Cine cine = new Cine();
    System.out.println("Nombre del cine:"+" "+cine.getNombre());
    System.out.println(cine.getLema());
}
}