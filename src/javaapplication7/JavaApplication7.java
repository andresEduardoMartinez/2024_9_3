/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author usuAlu
 */import java.util.Scanner;
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner SC = new Scanner (System.in);
        String alumnos [] = new String [11];
        int asistencias [] = new int [11];
        alumnos [0] = "Guillermo Budez.";
        alumnos [1] = "Tomas Colombo.";
        alumnos [2] = "Sabrina Gómez.";
        alumnos [3] = "Ezequiel González.";
        alumnos [4] = "Franco González.";
        alumnos [5] = "Francisco Gorga.";
        alumnos [6] = "Juan Andrés Hernández.";
        alumnos [7] = "Alonso Ingold.";
        alumnos [8] = "Santiago Margall.";
        alumnos [9] = "Andrés Martínez.";
        alumnos [10] = "Damián Sosa.";
        System.out.println("Ingresa 1. Asistió");
        System.out.println("Ingresa 2. Llegó tarde");
        System.out.println("Ingresa 3. Faltó");
        for (int i = 0; i<11; i++){
            System.out.println(alumnos[i]);
            System.out.println("Presione 1 si el alumno asistió, presione 2 si el alumno llegó tarde o presione 3 si el alumno faltó");
            asistencias [i] = SC.nextInt();
        }
        System.out.println("La lista es;");
        
        for (int i = 0; i<11; i++){
            
            System.out.println(alumnos[i] + " La asistencia es: " + asistencias[i]);
        }
        System.out.println("Por las dudas 1 es que llego, 2 es que llego tarde, y 3 que no vino.");
        
    }
    
}
