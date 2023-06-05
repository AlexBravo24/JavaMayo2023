package com;

import java.util.Scanner;

public class Ciclos10_BCA {

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
	        int num, sumPositivos = 0, sumImpares = 0;

	        for (int i = 1; i <= 20; i++) {
	            System.out.print("Ingrese el número " + i + ": ");
	            num = entrada.nextInt();

	            if (num > 0) {
	                System.out.print(num + " es POSITIVO ");
	                sumPositivos += num;
	            } else if (num < 0) {
	                System.out.print(num + " es NEGATIVO ");
	            } else {
	                System.out.print(num + " es CERO ");
	            }

	            if (num % 2 == 0) {
	                System.out.println("y es PAR");
	            } else {
	                System.out.println("y es IMPAR");
	                sumImpares += num;
	            }
	        }

	        System.out.println("La sumatoria de los números positivos es: " + sumPositivos);
	        System.out.println("La sumatoria de los números impares es: " + sumImpares);

	}

}
