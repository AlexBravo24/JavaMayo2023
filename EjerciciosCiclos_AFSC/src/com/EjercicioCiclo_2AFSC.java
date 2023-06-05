package com;
import java.util.Scanner;
public class EjercicioCiclo_2AFSC {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar 
		//de un numero introducido desde teclado, hasta la iteración 
		//deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???

		int x;
		int y;
		int z=1;
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce el numero a multiplicar: ");
		x = entrada.nextInt();
		System.out.println("Hasta que numero quieres multiplicar: ");
		y = entrada.nextInt();
		System.out.println("Tabla de multiplicar del:  "+x);
		while (z<=y) {
			System.out.println(x +"*"+z+"="+(x*z));
		z++;
		}
	}//main

}
