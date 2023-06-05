package com;

import java.util.Scanner;

public class Ejercicio7_YAAH {
	public static void main(String[]args) {
		// 7. El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto 
//		debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de 
//		cobrar es la siguiente:
//		* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
//		* De 50 a 99 alumnos, el costo es de 70 euros.
//		* De 30 a 49 alumnos, el costo es de 95 euros.
//		* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de 
//		alumnos.
//		Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
//		pagar cada alumno por el viaje.
		
		int alumnos;
		
		Scanner enter = new Scanner(System.in);
		
		
		System.out.println("Introduzsca el n�mero de alumnos: ");
		alumnos = enter.nextInt();
		
		if ( alumnos >= 100 ) {
			System.out.println("Lo que debe pagar cada alumno por el vieje es 65 euros");
			System.out.println("El pago a la compa�ia de autobuses es: " + (alumnos * 65 + " euros") );
		
		}else if ( alumnos >= 50 && alumnos < 100 ) {
			System.out.println("Lo que debe pagar cada alumno por el vieje es 70 euros");
			System.out.println("El pago a la compa�ia de autobuses es: " + (alumnos * 70 + " euros") );
		
		}else if ( alumnos >= 30 && alumnos < 50 ) {
			System.out.println("Lo que debe pagar cada alumno por el vieje es 95 euros");
			System.out.println("El pago a la compa�ia de autobuses es: " + (alumnos * 95 + " euros") );
		
		}else if ( alumnos <= 30 ) {
			System.out.println("Lo que debe pagar cada alumno por el vieje es: " + (4000/alumnos) + " euros");
			System.out.println("El pago a la compa�ia de autobuses es 4000 euros " );
		}else {
			System.out.println("Error");
		}
		
		
	}
}
