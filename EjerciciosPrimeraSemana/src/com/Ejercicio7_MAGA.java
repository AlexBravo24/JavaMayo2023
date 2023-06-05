package com;

import java.util.Scanner;

public class Ejercicio7_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 7: 
		 * El director de una escuela est� organizando un viaje de estudios y requiere determinar 
		 * cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio.
		 *  La forma de cobrar es la siguiente: * Si son 100 alumnos o m�s, el costo por cada alumno 
		 *  es de 65 euros. * De 50 a 99 alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, 
		 *  el costo es de 95 euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros,
		 *   sin importar el n�mero de alumnos. Realiza un algoritmo que permita determinar el pago a 
		 *   la compa��a de autobuses y lo que debe pagar cada alumno por el viaje.
		 * */

		Scanner ent = new Scanner(System.in);
		int alumnos;
		float precio, total;
		
		System.out.println("------------------------------------------------------");
		System.out.println("Programa para determinar cuanto se cobra a cada alumno");
		System.out.println("------------------------------------------------------");

		System.out.println("Introduce el n�mero de alumnos para el viaje: ");
		alumnos = ent.nextInt();
		
		precio = 0;
		
		if (alumnos >= 100) {
			precio = 65;
		}else if( alumnos >= 50 && alumnos < 100 ) {
			precio = 70;
		}else if( alumnos >= 30 && alumnos < 50 ) {
			precio = 95;
		}else if( alumnos < 30 ) {
			precio = 4000;
		}
		
		
		if (alumnos > 30) {
			total = precio * alumnos;
		}else {
			total = precio;
		}
		
		
		
		System.out.println("El pago del viaje por alumno es de: " + precio);
		System.out.println("El total de lo que debe pagar a la compa�ia de viajes: " + total);
		
		ent.close();
	}

}
