package com;

import java.util.Scanner;

public class Ejercicio7_MBR {

	public static void main(String[] args) {
		/*7. El director de una escuela está organizando un viaje de estudios y requiere determinar 
		 * cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. 
		 * La forma de cobrar es la siguiente: * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
		 * * De 50 a 99 alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 euros. 
		 * * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. 
		 * Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje. */
		Scanner entrada = new Scanner(System.in);
	    int numeroAlumnos;
	// Se solicitan datos al usuario
	    System.out.println("SE DETERMINA EL PAGO A LA COMPAÑIA DE AUTOBUSES Y LO QUE DEBE PAGAR CADA ALUMNO POR EL VIAJE");
	    System.out.print("Número de alumnos: ");
	    numeroAlumnos = entrada.nextInt();
	// Se realiza las comparaciones y calculos para mostrar en la consola 
	    if (numeroAlumnos >= 100) {
	      System.out.println("El pago a la compañia es de " + numeroAlumnos*65 + " "
	          + "euros y cada alumno debe pagar 65 euros");
	    } else if (numeroAlumnos <100 && numeroAlumnos >= 50) {
	      System.out.println("El pago a la compañia es de " + numeroAlumnos*70 + " "
	          + "euros y cada alumno debe pagar 70 euros");
	    } else if (numeroAlumnos < 50 && numeroAlumnos >= 30) {
	      System.out.println("El pago a la compañia es de " + numeroAlumnos*95 + " "
	          + "euros y cada alumno debe pagar 95 euros");
	    } else {
	      System.out.println("El coste del autobús es de 4000 euros y cada alumno "
	          + "debe pagar " + (4000/numeroAlumnos) + " euros.");
	    } 

	}

}
