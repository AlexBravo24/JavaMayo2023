package com;

import java.util.Scanner;

public class Ejercicio1_BCA {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales
		
		int numero1, numero2;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce el primer num�ro");
		
		numero1=entrada.nextInt();
		System.out.println("Elprimer numero es " + numero1);
		
		System.out.println("Introduce el segundo n�mero");
		numero2=entrada.nextInt();
		System.out.println("El segundo n�mero es " + numero2);
		
		if (numero1>numero2) {
			
			System.out.println("El n�mero " + numero1 + " es mayor");
		}else if (numero1<numero2) {
				
				System.out.println("El numero " + numero2 + " es mayor");
			
			}else if (numero1==numero2) {
		
		System.out.println("Los numeros son iguales");
		
	}
		
		
		

	}

}
