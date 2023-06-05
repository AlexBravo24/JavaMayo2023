package com;

import java.util.Scanner;

public class Ciclos9_EAGG {

	public static void main(String[] args) {
		// 9. Programa Java que lea dos números y 
		// muestre los números pares entre ellos

		Scanner entrada = new Scanner(System.in);
		
		int n1, n2;
		
		 do {
	            System.out.print("Introduce un número entero: ");
	            n1 = entrada.nextInt();
	            System.out.print("Introduce otro número entero mayor que el anterior: ");
	            n2 = entrada.nextInt();
	            if (n1 >= n2) {
	                System.out.println("El segundo número debe ser mayor que el primero");                  
	            }
	        } while (n1 >= n2);

	        System.out.println("Números pares desde " + n1 + " hasta " + n2 + " : ");
	        for (int i = n1; i <= n2; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i);
	            }
	        }
		
	}

}
