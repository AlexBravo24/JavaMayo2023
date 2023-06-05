package com;

import java.util.Scanner;

public class Ejercicio4_EAGG {

	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena 
		// por teclado y compruebe si es una letra mayúscula.

	String	cadena_1, cadena_M;
	Scanner entrada = new Scanner(System.in);
	System.out.println("Introduce una cadena");
	
	cadena_1 = entrada.next();
		
	System.out.println("La cadena por tecleado fue " + cadena_1);
	
	cadena_M = cadena_1.toUpperCase();
	
	//System.out.println(cadena_1.equals("cadena_M"));
	
	if (cadena_1==cadena_M) {
	System.out.println("Es mayúscula");
	} else {
	System.out.println("No es mayúscula");
	}
	
		
		}
			
			}

