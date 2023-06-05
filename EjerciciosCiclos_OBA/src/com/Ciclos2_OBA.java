package com;

import java.util.Scanner;

public class Ciclos2_OBA {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        // Solicitar al usuario el n�mero y la iteraci�n deseada
		        System.out.print("Ingrese el n�mero para la tabla de multiplicar: ");
		        int numero = scanner.nextInt();

		        System.out.print("Ingrese el n�mero de iteraciones deseadas: ");
		        int iteraciones = scanner.nextInt();

		        // Generar la tabla de multiplicar
		        System.out.println("Tabla de multiplicar del " + numero + " hasta la iteraci�n " + iteraciones + ":");

		        for (int i = 1; i <= iteraciones; i++) {
		            int resultado = numero * i;
		            System.out.println(numero + " x " + i + " = " + resultado);
		        }

		        scanner.close();// cerrando scanner ya no hay advertencia
		    
	
		

		

	}

}
