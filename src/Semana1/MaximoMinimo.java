/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana1;

import java.util.Scanner;

public class MaximoMinimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor 1: ");
        int numero = scanner.nextInt();

        int maximo = numero;
        int minimo = numero;

        for (int i = 2; i <= 5; i++) {
            System.out.print("Ingrese el valor " + i + ": ");
            numero = scanner.nextInt();

            if (numero > maximo) {
                maximo = numero;
            }

            if (numero < minimo) {
                minimo = numero;
            }
        }

        System.out.println("El valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);

        scanner.close();
    }
}