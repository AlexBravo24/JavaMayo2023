package com;

import java.util.Scanner;

public class Ejercicio8RMQG {
    public static void main(String[] args) {
		/*
		 * Programa Java que lea dos números y muestre los números desde el menor hasta
		 * el mayor
		 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número desde: ");
        int num1 = scanner.nextInt()+1;
        System.out.print("Ingresa el número hasta: ");
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
