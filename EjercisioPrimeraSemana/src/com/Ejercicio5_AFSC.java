package com;

import java.util.Scanner;

public class Ejercicio5_AFSC {

	public static void main(String[] args) {
		// Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		//parámetros: edad, nota y sexo. 
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE * Mínimo: Nota (5), edad (18), 
		//sexo F -> ACEPTADA * Otros casos -> NO ACEPTADA
		Scanner scanner = new Scanner(System.in);
	    int Nota;
	    int Edad;
	    String Sexo;
	    System.out.println("Calculamos tu solicitud");
	    System.out.println("Prporciona tu Edad: ");
	    Edad = scanner.nextInt();
	    System.out.println("Poporciona tus Nota: ");
	    Nota = scanner.nextInt(); scanner.nextLine();
	    System.out.println("Proporciona tu Sexo (M o F): ");
	    Sexo = scanner.nextLine();
	    
	    if ((Nota == 5) && (Edad == 18) && (Sexo.equalsIgnoreCase("M"))) {
		      System.out.println(" \n POSIBLE ");
		    }else if ((Nota == 5) && (Edad == 18) && (Sexo.equalsIgnoreCase("F"))) {
		       System.out.println(" \n ACEPTADA ");
		    }else {
		       System.out.println(" \n NO ACEPTADA ");
		    }

	}

}
