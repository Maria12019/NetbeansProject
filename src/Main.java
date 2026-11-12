/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 4 filas x 3 columnas - mayor   y  menor
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingresar valor [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Mostrar matriz
        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Buscar mayor y menor
        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        String posicionMayor = null;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    //posicionMayor = String.valueOf(i)+" "+ String.valueOf(j);
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("\nMayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);
        System.out.println(posicionMayor);

        sc.close();
       
    }
}
