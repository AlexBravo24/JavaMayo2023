package com;

import java.util.Scanner;

public class Ciclos3_OBA {

	public static void main(String[] args) {   //Palindromo: palabas que se pronuncian igual al derecho y al reves
		
		
		        Scanner scanner = new Scanner(System.in);

		        // Solicitar al usuario que ingrese el String
		        System.out.print("Ingrese una palabra o frase: ");
		        String palabra = scanner.nextLine();

		        // Eliminar espacios y convertir a min�sculas
		        palabra = palabra.replaceAll("\\s", "").toLowerCase();

		        // Verificar si es un pal�ndromo
		        boolean esPalindromo = verificarPalindromo(palabra);

		        // Mostrar el resultado
		        if (esPalindromo) {
		            System.out.println("El String ingresado es un pal�ndromo.");
		        } else {
		            System.out.println("El String ingresado no es un pal�ndromo.");
		        }

		        scanner.close();
		    }

		    // M�todo para verificar si el String es un pal�ndromo
		    public static boolean verificarPalindromo(String palabra) {
		        int longitud = palabra.length();
		        for (int i = 0; i < longitud / 2; i++) {
		            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
		                return false;
		            }
		        }
		        return true;
		    }
		


	}


