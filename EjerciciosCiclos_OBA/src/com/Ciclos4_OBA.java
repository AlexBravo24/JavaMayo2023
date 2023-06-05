package com;

import java.util.Scanner;

public class Ciclos4_OBA {

	public static void main(String[] args) {
	
		
		        Scanner scanner = new Scanner(System.in);

		        // Solicitar al usuario que ingrese la frase y la letra
		        System.out.print("Ingrese una frase: ");
		        String frase = scanner.nextLine();

		        System.out.print("Ingrese una letra: ");
		        char letra = scanner.nextLine().charAt(0);

		        // Contar la cantidad de veces que aparece la letra en la frase
		        int contador = 0;
		        for (int i = 0; i < frase.length(); i++) {
		            if (frase.charAt(i) == letra) {
		                contador++;
		            }
		        }

		        // Mostrar el resultado
		        if (contador > 0) {
		            System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
		        } else {
		            System.out.println("Caracter no encontrado.");
		        }

		        scanner.close();
		    }
		}




	


