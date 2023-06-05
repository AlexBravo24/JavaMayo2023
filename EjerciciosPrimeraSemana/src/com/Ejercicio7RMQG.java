package com;
import java.util.Scanner;
public class Ejercicio7RMQG {
		    public static void main(String[] args) {
				/*
				 * El director de una escuela est� organizando un viaje de estudios y requiere
				 * determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la compa��a
				 * de viajes por el servicio. La forma de cobrar es la siguiente: Si son 100
				 * alumnos o m�s, el costo por cada alumno es de 65 euros. De 50 a 99 alumnos,
				 * el costo es de 70 euros. De 30 a 49 alumnos, el costo es de 95 euros. Menos
				 * de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin
				 * importar el n�mero de alumnos. Realiza un algoritmo que permita determinar el
				 * pago a la compa��a de autobuses y lo que debe pagar cada alumno por el viaje.
				 */
	        Scanner scanner = new Scanner(System.in);
	        int numAlumnos;
	        double costoAlumno;
	        double costoTotal;

	        System.out.print("Ingresa el n�mero de alumnos que participar�n en el viaje: ");
	        numAlumnos = scanner.nextInt();

	        if (numAlumnos >= 100) {
	            costoAlumno = 65;
	        } else if (numAlumnos >= 50) {
	            costoAlumno = 70;
	        } else if (numAlumnos >= 30) {
	            costoAlumno = 95;
	        } else {
	            costoAlumno = 4000.0 / numAlumnos;
	        }

	        costoTotal = numAlumnos * costoAlumno;
	        scanner.close();
	        System.out.println("El costo por alumno es de " + costoAlumno + " euros.");
	        //No hay par�metro de capacidad de alumnos por bus
	        System.out.println("El pago a la compa��a de autobuses es de " + costoTotal + " euros.");
	        //System.out.println("El pago a la compa��a de autobuses es de 4000 euros");
	   }
	
}
