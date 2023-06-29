package com;

import java.util.Scanner;

public class Ejercicio5_EIMD {

	public static void main(String[] args) {
		
		/*
		 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
		 
		parámetros: edad, nota y sexo.
		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		* Otros casos -> NO ACEPTADA
		*/
		
		
	String  sexo,edad, nota;
		
		Scanner datos = new Scanner(System.in);
		System.out.println("Introduce la Edad[00], la nota [00] y el Sexo [F/M]");
		
		edad= datos.nextLine();
		nota=datos.nextLine();
		sexo=datos.nextLine();
		
		if(nota.equals("5")&&edad.equals("18")&&sexo.equals("F")) {
			System.out.println("Aceptada");
		}else if(nota.equals("5")&&edad.equals("18")&&sexo.equals("M")){System.out.println("Posible");}
		else {System.out.println("No aceptada");}
		
		datos.close();
	}

}
