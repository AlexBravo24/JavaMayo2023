package com;

import java.util.Scanner;

public class Ejercicio10_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 10: 
		 * Realiza un programa que pida un número entero entre uno y doce e imprima 
		 * el número de días que tiene el mes correspondiente.
		 * */
		
		int mes, dias;
		Scanner e = new Scanner(System.in);
		System.out.println("Programa para mostrar el número de días de un mes");
		System.out.println("Indica el número del mes (1-12): ");
		mes = e.nextInt();
		
		if (mes > 0 && mes < 13) {
			if (mes == 2) {
				dias = 29;
			}else {
				dias = 31;
			}
			
			System.out.println("El mes seleccionado tiene " + dias + " dias");
		}else {
			System.out.println("ERROR: mes incorrecto");
		}
	}

}
