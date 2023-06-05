package com;

import java.util.Scanner;

public class Ejercicio2_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Realiza un programa que pida un número por teclado y nos indique si es par o impar
		
		
		int numero;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bienvenido");
		System.out.println("Introduzca un número por favor");
		numero=entrada.nextInt();
		int residuo;
		residuo=(numero%2);
		if(residuo>0) {
			System.out.println("El número es impar");
		}else {
			System.out.println("El número es par");
		}
		
		
		
	}

}
