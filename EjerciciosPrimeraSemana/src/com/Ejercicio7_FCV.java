package com;

import java.util.Scanner;

public class Ejercicio7_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto
		debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de
		cobrar es la siguiente:
		* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
		* De 50 a 99 alumnos, el costo es de 70 euros.
		* De 30 a 49 alumnos, el costo es de 95 euros.
		* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de
		alumnos.
		Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe
		pagar cada alumno por el viaje.*/
		
		int alumnos;
		int total;
		int precioindividual;
		
		System.out.println("Bienvenidos");
		System.out.println("Por favor introduzca el n�mero alumno que van a viajar");
		
		Scanner entrada = new Scanner (System.in);
		
		alumnos = entrada.nextInt();
		
		
		if (alumnos>100) {
			total=alumnos*65;
		System.out.println("La cantidad total a pagar es:"+total+" euros");
		System.out.println("El costo individual es de 65 euros por alumno");
			
		}
		else if ((alumnos>50) && (alumnos<99)){
			total=alumnos*70;
		System.out.println("La cantidad total a pagar es:"+total+" euros");
		System.out.println("El costo individual es de 70 euros por alumno");
		}
		else if ((alumnos>30) && (alumnos<49)){
			total=alumnos*95;
		System.out.println("La cantidad total a pagar es:"+total+" euros");
		System.out.println("El costo individual es de 95 euros por alumno");
		}
		else if (alumnos<30){
			
			total=4000/alumnos;
		System.out.println("La cantidad total a pagar es: 4000 euros");
		System.out.println("El costo individual es de "+total+" euros");
		}



		
			
		
	}

}
