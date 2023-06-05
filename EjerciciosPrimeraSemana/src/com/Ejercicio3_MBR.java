package com;

import java.util.Scanner;

public class Ejercicio3_MBR {

	public static void main(String[] args) {
		/* 3.Crea un programa que pida al usuario dos n�meros 
		 * y muestre el resultado de su divisi�n. Si el segundo n�mero es 0,
		 * debe mostrar un mensaje de error.
		 */
		int n;
	    int d;
		Scanner scanner = new Scanner (System.in);
	    
	// Se solicitan datos al usuario
	    System.out.println("DIVISION ENTRE DOS N�MEROS:");
	    System.out.print("Introduce el primer n�mero: ");
	    n = scanner.nextInt();
	    System.out.print("Introduce el segundo n�mero: ");
	    d = scanner.nextInt();
	    
	// Se realiza la division y se manda a imprimir en consola
	    if (d != 0){
	        System.out.println((double)n/(double)d);
	    }else {
	        System.out.println("�Error! Introduzca un n�mero valido");
	    }  

	}

}
