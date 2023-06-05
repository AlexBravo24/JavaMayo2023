package com;

import java.util.Scanner;

public class Ejercicio7_BCA {

	public static void main(String[] args) {
		/* El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto 
		debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de 
		cobrar es la siguiente:
		* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
		* De 50 a 99 alumnos, el costo es de 70 euros.
		* De 30 a 49 alumnos, el costo es de 95 euros.
		* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de 
		alumnos.
		Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe 
		pagar cada alumno por el viaje.*/
		
        Scanner entrada=new Scanner(System.in);
		
		int Alumnos, Precio_Total;
		
		System.out.println("Bienvenidos a la agencia de viajes");
		System.out.println("Por favor indique la cantidad de alumnos");
		Alumnos = entrada.nextInt();
		
		if(Alumnos>=100) {
			Precio_Total=Alumnos*65;
			System.out.println("El costo sera de 65 euros por alumno");
			System.out.println("El costo TOTAL sera de: "+Precio_Total);
			
		}
		else if(Alumnos>=50 && Alumnos<=99) {
			Precio_Total=Alumnos*70;
			System.out.println("El costo sera de 70 euros por alumno");
			System.out.println("El costo TOTAL sera de: "+Precio_Total);
			
		}
		else if(Alumnos>=30 && Alumnos<=49) {
			Precio_Total=Alumnos*95;
			System.out.println("El costo sera de 95 euros por alumno");
			System.out.println("El costo TOTAL sera de: "+Precio_Total);
			
		}
		else if(Alumnos<=30) {
			
			System.out.println("El costo sera de 4000 euros por autobus");
			Precio_Total=4000/Alumnos;
			System.out.println("El costo por alumno sera de: "+Precio_Total);
			
		}


	}


}
