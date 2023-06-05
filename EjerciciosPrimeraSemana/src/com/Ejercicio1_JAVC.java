package com;

import java.util.Scanner;

public class Ejercicio1_JAVC {

	public static void main(String[] args) {
		
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		
		int numero1;
		int numero2;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce el Primer Numero ");
		numero1 = entrada.nextInt();
		
		System.out.println("Introduce el Segundo Numero ");
		numero2 = entrada.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("El primer numero," + numero1 + ", es mayor que el numero2," + numero2);
		}else 
			
			if (numero1 < numero2) {
				System.out.println("El segundo numero," + numero2 + ", es mayor que el primer numero," + numero1);
				
			} else {
				
				System.out.println("Ambos numeros son iguales");
					
				
			
		}
		
		

	}

}
