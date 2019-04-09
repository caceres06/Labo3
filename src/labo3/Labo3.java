/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo3;

import java.util.Scanner;

/**
 *
 * @author Dismaelectric
 */
public class Labo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean flag = true;
        Scanner key = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("¿Qué desea hacer?");
        System.out.println("1.Ver información del cine");
        System.out.println("3.Editar función");
        System.out.println("4.Imprimir cartelera");
        System.out.println("5. Salir");
        int opc= key.nextInt();
        Menu(opc);
    }
    public static void Menu(int a){
        switch(a){
            case 1:
                Cine.InfoCine();
                break;
            case 2:
                Cine.AgregarFuncion();
                break;
            case 3:
                Cine.EditarFuncion();
                break;
            case 4:
                Cine.ImprimirCartelera();
                break;
            case 5:
                break;
        }
    }
}