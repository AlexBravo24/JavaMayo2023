package com;

import java.util.Scanner;

public class Ejercicio7_AVG {

	public static void main(String[] args) {
		/*El director de una escuela est� organizando un viaje de estudios 
		 * y requiere determinar cu�nto debe cobrar a cada alumno y cu�nto 
		 * debe pagar a la compa��a de viajes por el servicio. La forma de 
 		  cobrar es la siguiente:
* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
* De 50 a 99 alumnos, el costo es de 70 euros.
* De 30 a 49 alumnos, el costo es de 95 euros.
* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, 
* sin importar el n�mero de alumnos.
Realiza un algoritmo que permita determinar el pago a la compa��a de 
autobuses y lo que debe pagar cada alumno por el viaje.
		 * 
		 * */
		
		Scanner entrada = new Scanner (System.in);
		
		int Alumnos;

		    System.out.println("Este programa calcula el precio a pagar por alumno en "
		        + "el viaje fin de curso, seg�n la cantidad que se apunte.:");
		    System.out.print("N�mero de alumnos: ");
		    Alumnos = entrada.nextInt();
		    
		    if (Alumnos >= 100) {
		    	System.out.println("Cada alumno paga 65 ");
		      System.out.println("El costo total de  " + Alumnos*65 + "Alumnos es de " + (Alumnos*65)+ "euros");
		    } else if (Alumnos >= 50 && Alumnos <100) {
		    	System.out.println("Cada alumno debe de pagar 70");
		    	System.out.println("El costo total de  " + Alumnos*70 + "Alumnos es de " + (Alumnos*70) + "euros");
		    } else if (Alumnos >= 30 && Alumnos < 50) {
		    	System.out.println("Cada alumno de de pagar 95");
		    	System.out.println("El costo total de " + Alumnos*95 + "Alumnos es de "+(Alumnos*95) +"euros");
		    } else if (Alumnos <30){
		    	System.out.println("Cada alumno paga "+ (400/Alumnos));
		    	System.out.println("El costo total de " + (Alumnos)+"alumnos es: " + (4000/Alumnos) + "euros.");
		    } 
		
	}

}
