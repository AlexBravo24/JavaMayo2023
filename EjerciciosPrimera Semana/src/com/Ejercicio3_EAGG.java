package com;

import java.util.Scanner;

public class Ejercicio3_EAGG {

	public static void main(String[] args) {
		// 3. Crea un programa que pida al usuario dos números y muestre
		// el resultado de su división. Si el segundo número es 0, 
		// debe mostrar un mensaje de error.
		
		float num1, num2, resultado;
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer número");
		num1 = entrada.nextInt();
		
		System.out.println("Introduce el segundo número");
		num2 = entrada.nextInt();
		
		if (num2==0) {
			System.out.println("Error");
		} else {
			System.out.println("El resultado de la división de los números 1 y 2 es: " + (num1/num2));
		}
				num2 = entrada.nextInt();
	
	}

}
