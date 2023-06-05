package com;
import java.util.Scanner;

public class Ejercicio4RMQG {
	/*
	 * Programa que reciba una frase y una letra por teclado. Deberá retornar como
	 * resultado cuántas veces existe esa letra dentro de la frase. Si no existe,
	 * imprimir un mensaje “Carácter no encontrado”.
	 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la frase a revisar: ");
        String frase = scanner.nextLine();
        System.out.print("Introduce la letra a buscar: ");
        char letra = scanner.next().charAt(0);
        scanner.close();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
        } else {
            System.out.println("La letra ingresada no aparece en la frase.");
        }
    }//fin main
}//fin class
