package com;

import java.util.Scanner;

public class Ejercicio12_EIMD {

	public static void main(String[] args) {
	/*
	 12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara
cuando el promedio de las edades sea superior a 25.
	 */
		int edades,promedio,contador=0,edad=0;
		Scanner sc =new Scanner(System.in);
		do {
			System.out.println("Ingresa una edad");
			edades=sc.nextInt();
			contador++;
			edad=edad+edades;
			promedio=edad/contador;
		} while (promedio<25);	
		System.out.println("Finalizo el programa, El promedio de esas edades es: " +promedio );
		sc.close();
	}

}
