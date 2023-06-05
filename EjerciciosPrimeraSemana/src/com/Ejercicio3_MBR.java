package com;

import java.util.Scanner;

public class Ejercicio3_MBR {

	public static void main(String[] args) {
		/* 3.Crea un programa que pida al usuario dos números 
		 * y muestre el resultado de su división. Si el segundo número es 0,
		 * debe mostrar un mensaje de error.
		 */
		int n;
	    int d;
		Scanner scanner = new Scanner (System.in);
	    
	// Se solicitan datos al usuario
	    System.out.println("DIVISION ENTRE DOS NÚMEROS:");
	    System.out.print("Introduce el primer número: ");
	    n = scanner.nextInt();
	    System.out.print("Introduce el segundo número: ");
	    d = scanner.nextInt();
	    
	// Se realiza la division y se manda a imprimir en consola
	    if (d != 0){
	        System.out.println((double)n/(double)d);
	    }else {
	        System.out.println("¡Error! Introduzca un número valido");
	    }  

	}

}
