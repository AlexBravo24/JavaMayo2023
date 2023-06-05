package com;

import java.util.Scanner;

public class Ciclos3_OBA {

	public static void main(String[] args) {   //Palindromo: palabas que se pronuncian igual al derecho y al reves
		
		
		        Scanner scanner = new Scanner(System.in);

		        // Solicitar al usuario que ingrese el String
		        System.out.print("Ingrese una palabra o frase: ");
		        String palabra = scanner.nextLine();

		        // Eliminar espacios y convertir a minúsculas
		        palabra = palabra.replaceAll("\\s", "").toLowerCase();

		        // Verificar si es un palíndromo
		        boolean esPalindromo = verificarPalindromo(palabra);

		        // Mostrar el resultado
		        if (esPalindromo) {
		            System.out.println("El String ingresado es un palíndromo.");
		        } else {
		            System.out.println("El String ingresado no es un palíndromo.");
		        }

		        scanner.close();
		    }

		    // Método para verificar si el String es un palíndromo
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


