package com;

import java.util.Scanner;

public class Ejercicio10_EIMD {

	public static void main(String[] args) {
		/*
		10.Realiza un programa que pida un n�mero entero entre uno y 
		doce e imprima el n�mero de d�as que tiene el
		mes correspondiente.
*/
		
		int numero;
		Scanner sc= new Scanner(System.in);
		System.out.println("Dime El mes en numero ");
		numero=sc.nextInt();
		if(numero==2) {
	 System.out.println("El mes: " + numero + " tiene 28 d�as y 29 dias en a�o biciesto ");
	 System.exit(0);
		}
	if(numero%2==0) {
		System.out.println("El mes: " + numero + " tiene 30 d�as");
	}else {System.out.println("El mes: " + numero + " tiene 31 d�as");}


	sc.close();
		
	}

}
