package com;

import java.util.Scanner;

public class Ejercicio9RMQG {
    public static void main(String[] args) {
		/* Programa Java que lea dos números y
		 *  muestre los números pares entre ellos */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        scanner.close();
        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = num2; i <= num1; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }//fin main
}//fin class
