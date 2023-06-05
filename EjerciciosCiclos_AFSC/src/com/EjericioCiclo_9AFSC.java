package com;

import java.util.Scanner;


public class EjericioCiclo_9AFSC {

	public static void main(String[] args) {
		// Programa Java que lea dos números y muestre los números pares entre ellos

		Scanner entrada = new Scanner(System.in);
        int A, B;

        do {
            System.out.print("Introduce un número entero: ");
            A = entrada.nextInt();
            System.out.print("Introduce otro número entero mayor que el anterior: ");
            B = entrada.nextInt();
            if (A >= B) {
                System.out.println("El segundo número debe ser mayor que el primero");                  
            }
        } while (A >= B);

        System.out.println("Números pares desde:  " + A + " ---- " + B + " son : ");
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

		
		
	}

}
