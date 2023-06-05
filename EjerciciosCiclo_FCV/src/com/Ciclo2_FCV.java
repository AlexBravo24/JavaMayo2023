package com;

import java.util.Scanner;

public class Ciclo2_FCV {
	public static void main(String[] args) {
		/*
		Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
		desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
		23 x 95 = ???*/
		
		int tabla;
		int limite;
		int resultado;
		
		System.out.println("Introducir que tabla de multiplicar desea");
		
		Scanner entrada = new Scanner (System.in);
		
		tabla=entrada.nextInt();
		
		System.out.println("Introducir el límite deseao");
		
		limite=entrada.nextInt();
		
		for (int i = 1; i<=limite; i++) {
			resultado=tabla*i;
			System.out.println(resultado);
		}
	}

}
