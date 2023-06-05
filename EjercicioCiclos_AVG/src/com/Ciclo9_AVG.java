package com;

import java.util.Scanner;

public class Ciclo9_AVG {

	public static void main(String[] args) {
		// Programa Java que lea dos n�meros y 
		//muestre los n�meros pares entre ellos
		
		
		Scanner entrada = new Scanner(System.in);
        int A, B;


        do {
            System.out.print("Introduce un n�mero entero: ");
            A = entrada.nextInt();
            System.out.print("Introduce otro n�mero entero mayor que el anterior: ");
            B = entrada.nextInt();
            if (A >= B) {
                System.out.println("El segundo n�mero debe ser mayor que el primero");                  
            }
        } while (A >= B);


        System.out.println("\nN�meros pares desde " + A + " hasta " + B + " : ");
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

	}

}
