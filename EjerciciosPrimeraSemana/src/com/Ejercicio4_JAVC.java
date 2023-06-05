package com;

import java.util.Scanner;

public class Ejercicio4_JAVC {

	public static void main(String[] args) {
		
		
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		
		// Se guarda un string donde guardar una cadena, que seria cadena original
		
		
		String original;
		
		String convertido;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto");
		
		original = input.next();
		convertido = original.toLowerCase();
        
        // Evaluamos si la cadena original es igual a la cadena convertida
		// Si la cadena fuera igual entonces imprimos el mensaje
		// 
        
        if (original.equals(convertido)) {
        	System.out.println(" El texto introducido esta en minusculas ");
        }else {
            System.out.println(" El texto introducido contiene mayusculas ");
        
        
        }  

	}

}
