package com;

import java.util.Scanner;

public class Ciclos9_JOLC {

	public static void main(String[] args) {
		// Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer n�mero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo n�mero: ");
        int num2 = sc.nextInt();

        System.out.println("Los n�meros pares entre " + num1 + " y " + num2 + " son:");
        for (int i = num1 + 1; i < num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}