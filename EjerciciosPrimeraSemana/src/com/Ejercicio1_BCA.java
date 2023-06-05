package com;

import java.util.Scanner;

public class Ejercicio1_BCA {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales
		
		int numero1, numero2;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce el primer numéro");
		
		numero1=entrada.nextInt();
		System.out.println("Elprimer numero es " + numero1);
		
		System.out.println("Introduce el segundo número");
		numero2=entrada.nextInt();
		System.out.println("El segundo número es " + numero2);
		
		if (numero1>numero2) {
			
			System.out.println("El número " + numero1 + " es mayor");
		}else if (numero1<numero2) {
				
				System.out.println("El numero " + numero2 + " es mayor");
			
			}else if (numero1==numero2) {
		
		System.out.println("Los numeros son iguales");
		
	}
		
		
		

	}

}
