package com;

import java.util.Scanner;

public class Ejercicio1_JHC {

	public static void main(String[] args) {
		/*1.Realiza un programa que reciba dos números por teclado 
		 * e indique cuál es mayor o si son iguales.
		 * 
		 */

		int numero1;
		int numero2;
		
		Scanner entrada = new Scanner(System.in);
		
		//primer numero
		
		System.out.println("Introduce el primer numero");
		
		numero1 = entrada.nextInt();
		
		System.out.println("El primer numero tecleado es: " + numero1);
		
		//segundo numero
		
		System.out.println("Introduce el segundo numero");
		
		numero2 = entrada.nextInt();
		
		System.out.println("Introduce el segundo numero: " + numero2);
		
		//condicion
		
		if(numero1 == numero2) 
			System.out.println("Los numeros son iguales");
		else
			
			{
			if(numero1 > numero2) 
				System.out.println("El primer valor es mayor: " + numero1);
			else 
				System.out.println("El segundo valor es mayor: " + numero2);
		}
	
		}
			
	}


