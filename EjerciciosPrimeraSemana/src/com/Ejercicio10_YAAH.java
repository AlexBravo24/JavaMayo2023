package com;

import java.util.Scanner;

public class Ejercicio10_YAAH {

	public static void main(String[] args) {
		// 10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
		// mes correspondiente.
		
		int mes;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un número del 1 al 12:   ");
		mes = scan.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("Mes de Enero");
			break;
		case 2:
			System.out.println("Mes de Febrero");
			break;
		case 3:
			System.out.println("Mes de Marzo");
			break;
		case 4:
			System.out.println("Mes de Abril");
			break;
		case 5:
			System.out.println("Mes de Mayo");
			break;
		case 6:
			System.out.println("Mes de Junio");
			break;
		case 7:
			System.out.println("Mes de Julio");
			break;
		case 8:
			System.out.println("Mes de Agosto");
			break;
		case 9:
			System.out.println("Mes de Septiembre");
			break;
		case 10:
			System.out.println("Mes de Octubre");
			break;
		case 11:
			System.out.println("Mes de Noviembre");
			break;
		case 12:
			System.out.println("Mes de Diciembre");
			break;

		default:
			System.out.println("Error: Número invalido");
			break;
		}
		
		
		
		

	}

}
