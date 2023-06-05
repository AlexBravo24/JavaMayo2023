package com;

import java.util.Scanner;

public class Ejercicio5_MBR {

	public static void main(String[] args) {
		/*5. Realiza un programa que calcule la aceptaci�n de una solicitud 
		 * en base a los siguientes par�metros: edad, nota y sexo. 
		 * * M�nimo: Nota (5), edad (18), sexo M -> POSIBLE 
		 * * M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		 * * Otros casos -> NO ACEPTADA*/
		 Scanner entrada = new Scanner(System.in);
		    int nota;
		    int edad;
		    String sexo;
		// Solicitud de datos al usuario
		    System.out.println("SE CALCULA LA ACEPTACI�N DE UNA SOLICITUD");
		    System.out.println("Ingrese los datos que se solicitan");
		    System.out.print("Edad [n�mero]: ");
		    edad = entrada.nextInt();
		    System.out.print("Nota[n�mero]: ");
		    nota = entrada.nextInt(); 
		    entrada.nextLine();
		    System.out.print("Sexo [M o F]: ");
		    sexo = entrada.nextLine();
		    
		// Se realizan las comparaciones de datos y se manda a im primir en consola 
		    if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
		      System.out.println("El valor de sexo introducido es incorrecto");
		    } else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
		      System.out.println("POSIBLE");
		    }else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
		       System.out.println("ACEPTADA");
		    }else {
		        System.out.println("NO ACEPTADA");
		    }

	}

}
