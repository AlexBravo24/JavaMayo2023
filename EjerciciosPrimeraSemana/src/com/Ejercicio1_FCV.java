package com;

import java.util.Scanner;

public class Ejercicio1_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		
		int numero1;
		int numero2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bienvenido");
		System.out.println("Por favor introduzca el primer número");
		
		numero1=entrada.nextInt();
		
		System.out.println("Por favor introduzca el segundo número");
		
		numero2=entrada.nextInt();
		
		if (numero1>numero2) {
			System.out.println("El número 1 es mayor al número 2");
		}else if (numero2==numero1) {
			System.out.println("El número 1 es igual al número 2");
		}else {
			System.out.println("El número 2 es mayor al número 1");
		}
		
		

	}

}
