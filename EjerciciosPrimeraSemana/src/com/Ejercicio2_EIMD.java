package com;


import java.util.Scanner;

public class Ejercicio2_EIMD {
public static void main(String[] args) {
	/*
	 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
	 */
	int numero;
	Scanner dato=new Scanner(System.in);
	System.out.println("Introduce un numero");
	numero=dato.nextInt();

	
	if(numero%2==0) {
		
		System.out.println("El número: "+ numero +" Es par");
	}
	else {
		System.out.println("El número: "+ numero+ " es impar");
	}
	
	dato.close();
}
}
