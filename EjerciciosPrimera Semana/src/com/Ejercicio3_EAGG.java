package com;

import java.util.Scanner;

public class Ejercicio3_EAGG {

	public static void main(String[] args) {
		// 3. Crea un programa que pida al usuario dos n�meros y muestre
		// el resultado de su divisi�n. Si el segundo n�mero es 0, 
		// debe mostrar un mensaje de error.
		
		float num1, num2, resultado;
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer n�mero");
		num1 = entrada.nextInt();
		
		System.out.println("Introduce el segundo n�mero");
		num2 = entrada.nextInt();
		
		if (num2==0) {
			System.out.println("Error");
		} else {
			System.out.println("El resultado de la divisi�n de los n�meros 1 y 2 es: " + (num1/num2));
		}
				num2 = entrada.nextInt();
	
	}

}
