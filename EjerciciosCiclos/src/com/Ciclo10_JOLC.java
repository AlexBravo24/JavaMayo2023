package com;

import java.util.Scanner;

public class Ciclo10_JOLC {

	public static void main(String[] args) {
		// Programa que lea 20 números e indique si son positivos o negativos y pares o 
		//impares y además muestre la sumatoria de los positivos y sumatoria de los impares.
		
		   Scanner input = new Scanner(System.in);

	        int[] numeros = new int[20];
	        int sumaPositivos = 0;
	        int sumaImpares = 0;

	        System.out.println("Ingrese 20 números:");

	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = input.nextInt();
	        }

	        for (int numero : numeros) {
	            if (numero > 0) {
	                sumaPositivos += numero;
	                System.out.println(numero + " es positivo");
	            } else if (numero < 0) {
	                System.out.println(numero + " es negativo");
	            } else {
	                System.out.println(numero + " es cero");
	            }

	            if (numero % 2 == 0) {
	                System.out.println(numero + " es par");
	            } else {
	                sumaImpares += numero;
	                System.out.println(numero + " es impar");
	            }
	        }

	        System.out.println("Suma de los números positivos: " + sumaPositivos);
	        System.out.println("Suma de los números impares: " + sumaImpares);
	    }
	}