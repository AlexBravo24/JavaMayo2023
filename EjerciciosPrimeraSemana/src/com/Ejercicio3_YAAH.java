package com;

import java.util.Scanner;

public class Ejercicio3_YAAH {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos números y 
		// muestre el resultado de su división. Si el 
		// segundo número es 0, debe mostrar un mensaje de error.

		int number1;
		int number2;
		
		Scanner into = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		number1 = into.nextInt();
		
		System.out.println("Introduce un número");
		number2 = into.nextInt();
		
		if (number2==0) {
			System.out.println("Mensaje de error");
		}else {
		System.out.println("El resultado de la divición es: " + (number1/number2));
		
		
		
		
		
		}
		
		
		
	}

}
