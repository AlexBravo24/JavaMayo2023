package com;

import java.util.Scanner;

public class Ciclos9_EAGG {

	public static void main(String[] args) {
		// 9. Programa Java que lea dos n�meros y 
		// muestre los n�meros pares entre ellos

		Scanner entrada = new Scanner(System.in);
		
		int n1, n2;
		
		 do {
	            System.out.print("Introduce un n�mero entero: ");
	            n1 = entrada.nextInt();
	            System.out.print("Introduce otro n�mero entero mayor que el anterior: ");
	            n2 = entrada.nextInt();
	            if (n1 >= n2) {
	                System.out.println("El segundo n�mero debe ser mayor que el primero");                  
	            }
	        } while (n1 >= n2);

	        System.out.println("N�meros pares desde " + n1 + " hasta " + n2 + " : ");
	        for (int i = n1; i <= n2; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i);
	            }
	        }
		
	}

}
