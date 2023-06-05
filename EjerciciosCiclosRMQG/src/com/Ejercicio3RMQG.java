package com;
import java.util.Scanner;

public class Ejercicio3RMQG {
	//Realiza un programa para determinar si un String es palíndromo. 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una palabra o frase: ");
        String texto = scanner.nextLine();
        scanner.close();
        texto = texto.replaceAll("\\s+", "").toLowerCase();
        boolean esPalindromo = true;
        for (int i = 0; i < texto.length() / 2; i++) {
            if (texto.charAt(i) != texto.charAt(texto.length() - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }
        if (esPalindromo) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
    }//fin main
}//fin class