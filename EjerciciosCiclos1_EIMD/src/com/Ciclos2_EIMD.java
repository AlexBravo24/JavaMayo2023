package com;

import java.util.Scanner;

public class Ciclos2_EIMD {

	public static void main(String[] args) {
	/*
	 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
23 x 95 = ???
	 */
		
	Double numero, hasta;
	Scanner sc =new Scanner(System.in);
	System.out.println("Dime un número");
	numero=sc.nextDouble();
	
	System.out.println("¿Hasta que número?");
	hasta=sc.nextDouble();
	System.out.println("La tabla de multiplicar del numero: " + numero + "es:");
	for (double i = 0; i <=hasta; i++) {
		
		System.out.println(numero + "*"+i+"= " +(i*numero));
		
	}
	sc.close();
	
	}

}
