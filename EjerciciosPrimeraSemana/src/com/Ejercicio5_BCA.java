package com;

import java.util.Scanner;

public class Ejercicio5_BCA {

	public static void main(String[] args) {
		/* Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		parámetros: edad, nota y sexo.
		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		* Otros casos -> NO ACEPTADA*/
		
		Scanner entrada=new Scanner(System.in);
        String sexo;
        int edad,nota;
	    
       System.out.println("Nota");
	    nota = entrada.nextInt();
	    
	    System.out.println("Edad");
	    edad = entrada.nextInt();
	    
	     System.out.println("Sexo del aspirante");
	    sexo = entrada.next();
	    
	    if(nota>=5 && edad>=18){
	    	
	    	switch(sexo) {
	    	
	    	case ("M"):
	    		System.out.println("Posible candidato");
	    	break;
	    	
	    	case ("F"):
	    		System.out.println("Aceptado");
	    	break;

			default:
				System.out.println(" ");
				
				break;
			}
	   	
	    }else {
			System.out.println("No aceptado");

	    }

	}

}
