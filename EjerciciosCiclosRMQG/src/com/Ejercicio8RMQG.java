package com;

import java.util.Scanner;

public class Ejercicio8RMQG {
    public static void main(String[] args) {
		/*
		 * Programa Java que lea dos n�meros y muestre los n�meros desde el menor hasta
		 * el mayor
		 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el n�mero desde: ");
        int num1 = scanner.nextInt()+1;
        System.out.print("Ingresa el n�mero hasta: ");
        int num2 = scanner.nextInt()-1;
        scanner.close();
        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = num2; i <= num1; i++) {
                System.out.println(i);
            }
        }
    }//fin main
}//fin class
