/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cielo
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        
        int[] array = new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el nombre del vendedor");
        String nombre =sc.next();
        System.out.println(nombre);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese cantidad");
            int cantidad= sc.nextInt();
            array[i] = cantidad;
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}

