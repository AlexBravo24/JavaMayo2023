package com;

import java.util.Scanner;

public class Ejercicio7_JAVC {

	public static void main(String[] args) {
		
		
		/*7. El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto 
		debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de 
		cobrar es la siguiente:
		* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
		* De 50 a 99 alumnos, el costo es de 70 euros.
		* De 30 a 49 alumnos, el costo es de 95 euros.
		* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de 
		alumnos.
		Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
		pagar cada alumno por el viaje.
		 * 
		 */
		
		int alumnos;
		Scanner Scanner = new Scanner (System.in);
		System.out.println("Ingrese el numero de alumnos");
		alumnos=Scanner.nextInt();
		
		if (alumnos >= 100) {
			System.out.println("Cada alumno debe pagar 65 Euros");
			System.out.println("El costo total por los " + alumnos + " alumnos es de : " + (alumnos*65)  + " Euros ");
		}else if (alumnos>=50&&alumnos<=99) {
			System.out.println("Cada alumno debe pagar 70 Euros");
			System.out.println("El costo total por los " + alumnos + "alumnos es de : " + (alumnos*70) + " Euros ");
		}else if (alumnos>=30&&alumnos<=49) {
			System.out.println("Cada alumno debe pagar 95 Euros");
			System.out.println("El costo total por los " + alumnos + "alumnos es de : " + (alumnos*95) + "Euros" );
		}else if (alumnos<30) {
			System.out.println("Cada alumno debe pafar :" + (4000/alumnos));
			System.out.println("El costo total por los " + alumnos + " alumnos es de : " + " Euros ");
			
		}
		
		
	


	}

}
