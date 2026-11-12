/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana1;

/**
 *
 * @author cielo
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        int n = 52;
        int c = 0;
        int v = 0;
        int s;

        do {
            s = n % 10; // 5  2 
            // obtiene el ultimo digito
            v = v + s;
            c++;
            n = n / 10;
            // elimina el ultimo digito
        } while (n != 0);

        System.out.println(c); // 2
        System.out.println(v); // 7
    }
}