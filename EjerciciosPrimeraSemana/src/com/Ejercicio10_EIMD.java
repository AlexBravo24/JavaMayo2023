package com;

import java.util.Scanner;

public class Ejercicio10_EIMD {

	public static void main(String[] args) {
		/*
		10.Realiza un programa que pida un número entero entre uno y 
		doce e imprima el número de días que tiene el
		mes correspondiente.
*/
		
		int numero;
		Scanner sc= new Scanner(System.in);
		System.out.println("Dime El mes en numero ");
		numero=sc.nextInt();
		if(numero==2) {
	 System.out.println("El mes: " + numero + " tiene 28 días y 29 dias en año biciesto ");
	 System.exit(0);
		}
	if(numero%2==0) {
		System.out.println("El mes: " + numero + " tiene 30 días");
	}else {System.out.println("El mes: " + numero + " tiene 31 días");}


	sc.close();
		
	}

}
