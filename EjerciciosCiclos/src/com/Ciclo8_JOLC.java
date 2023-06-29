package com;

import java.util.Scanner;

public class Ciclo8_JOLC {

	public static void main(String[] args) {
		// Programa Java que lea dos números y muestre los números desde el menor hasta el mayor

		Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();

        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        System.out.println("Los números desde el menor hasta el mayor son:");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }
}