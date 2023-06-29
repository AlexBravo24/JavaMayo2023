package com;

import java.util.Scanner;

public class Ciclo8_JOLC {

	public static void main(String[] args) {
		// Programa Java que lea dos n�meros y muestre los n�meros desde el menor hasta el mayor

		Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer n�mero: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo n�mero: ");
        int numero2 = sc.nextInt();

        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        System.out.println("Los n�meros desde el menor hasta el mayor son:");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }
}