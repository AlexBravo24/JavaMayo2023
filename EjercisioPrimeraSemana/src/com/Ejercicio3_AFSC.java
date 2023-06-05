package com;

import java.util.Scanner;
public class Ejercicio3_AFSC {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números y muestre el resultado de su división. 
		//Si el segundo número es 0, debe mostrar un mensaje de error.

		int divisor;
		int dividendo;
		Scanner entrada1 =new Scanner(System.in);
		System.out.println("Introduce el divisor:  ");
		divisor=entrada1.nextInt();
		Scanner entrada2 =new Scanner(System.in);
		System.out.println("Introduce el dividendo:  ");
		dividendo=entrada2.nextInt();
		if (divisor==0) {
			System.out.println("No se puede dividir por 0");
			}else {
			System.out.println( +dividendo + "/" +divisor + "=" + dividendo/divisor);
			}
		
	}//main

}//clase
