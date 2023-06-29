package com;

import java.util.Scanner;

public class EjercicioCiclos4_JHC {

	public static void main(String[] args) {
		// 4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado
		//cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
		//“Carácter no encontrado”. 

		
			//variables
		  Scanner reader = new Scanner(System.in);
	        String frase = "";
	        char caracter = ' ';
	        int contador = 0;
	        
	        //Datos del usuario
	        System.out.println("Ingrese una frase");
	        frase = reader.nextLine();
	        System.out.println("Digite un caracter");
	        caracter = reader.nextLine().charAt(0);
	        
	        //Procedimiento
	        for (int i = 0; i < frase.length(); i++) {
	            if(frase.charAt(i) == caracter) contador++;
	        }
	        if(contador == 0) System.out.println("El caracter que usted digito no se encuentra en la frase");
	        else if(contador == 1) System.out.println("Solo hay un caracter en la frase");
	        else System.out.println("El caracter '" + caracter + "' se repite " + contador + " veces");
	    
	}

}
