package com;
import java.util.Scanner;

public class Ejercicio10RMQG {
    public static void main(String[] args) {
		/*
		 * Programa que lea 20 números e indique si son positivos o negativos y pares o
		 * impares y además muestre la sumatoria de los positivos y sumatoria de los
		 * impares.
		 */
        Scanner scanner = new Scanner(System.in);
        int sumPos = 0;
        int sumImp = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingresa un número: ");
            int num = scanner.nextInt();
            //
            if (num >= 0) {
                System.out.println("El número es positivo.");
                sumPos += num;
            } else {
                System.out.println("El número es negativo.");
            }
            if (num % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número es impar.");
                sumImp += num;
            }
        }
        scanner.close();
        System.out.println("La sumatoria de los números positivos es: " + sumPos);
        System.out.println("La sumatoria de los números impares es: " + sumImp);
    }//fin main
}//fin class
