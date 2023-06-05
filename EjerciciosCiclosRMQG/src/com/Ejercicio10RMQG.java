package com;
import java.util.Scanner;

public class Ejercicio10RMQG {
    public static void main(String[] args) {
		/*
		 * Programa que lea 20 n�meros e indique si son positivos o negativos y pares o
		 * impares y adem�s muestre la sumatoria de los positivos y sumatoria de los
		 * impares.
		 */
        Scanner scanner = new Scanner(System.in);
        int sumPos = 0;
        int sumImp = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingresa un n�mero: ");
            int num = scanner.nextInt();
            //
            if (num >= 0) {
                System.out.println("El n�mero es positivo.");
                sumPos += num;
            } else {
                System.out.println("El n�mero es negativo.");
            }
            if (num % 2 == 0) {
                System.out.println("El n�mero es par.");
            } else {
                System.out.println("El n�mero es impar.");
                sumImp += num;
            }
        }
        scanner.close();
        System.out.println("La sumatoria de los n�meros positivos es: " + sumPos);
        System.out.println("La sumatoria de los n�meros impares es: " + sumImp);
    }//fin main
}//fin class
