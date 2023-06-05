package com;

import java.util.Scanner;

public class Ejercicio9_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 9: 
		 * Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. 
		 * Si introducimos otro número nos da un error.
		 * */

		int dia = 0;
		Scanner e = new Scanner(System.in);
		System.out.println("Escribe el número del día de la semana(1-7): ");
		dia = e.nextInt();
		
		
		if (dia > 0 && dia < 8) {
			switch ( dia ) {
			case 1:
				System.out.println("El día de la semana es Lunes");
				break;
			case 2:
				System.out.println("El día de la semana es Martes");
				break;
			case 3:
				System.out.println("El día de la semana es Miercoles");
				break;
			case 4:
				System.out.println("El día de la semana es Jueves");
				break;
			case 5:
				System.out.println("El día de la semana es Viernes");
				break;
			case 6:
				System.out.println("El día de la semana es Sabado");
				break;
			case 7:
				System.out.println("El día de la semana es Domingo");
				break;
			}
		}else {
			System.out.println("ERROR: día incorrecto");
		}
	}

}
