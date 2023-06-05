package com;

import java.util.Scanner;

public class Ejercicio10_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realiza un programa que pida un número entero entre uno y 
		//doce e imprima el número de días que tiene el mes correspondiente
		
		int mes;
		
		Scanner entrada = new Scanner (System.in);
		
		
		System.out.println("Bienvenido");
		System.out.println("Favor de introducir un número del 1 al 12");
		mes=entrada.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("Enero con 31 días");
			break;
		case 2:
			System.out.println("Febrero con 28 días");
			break;
		case 3:
			System.out.println("Marzo con 31 días");
			break;
		case 4:
			System.out.println("Abril con 30 días");
			break;
		case 5:
			System.out.println("Mayo con 31 días");
			break;
		case 6:
			System.out.println("Junio con 30 días");
			break;
		case 7:
			System.out.println("Julio con 31 días");
			break;
		case 8:
			System.out.println("Agosto con 31 días");
			break;
		case 9:
			System.out.println("Septiembre con 30 días");
			break;
		case 10:
			System.out.println("Octubre con 31 días");
			break;
		case 11:
			System.out.println("Noviembre con 30 días");
			break;
		case 12:
			System.out.println("Diciembre con 31 días");
			break;

		default:
			System.out.println("Error, número invalido");
			break;
		}

	}

}
