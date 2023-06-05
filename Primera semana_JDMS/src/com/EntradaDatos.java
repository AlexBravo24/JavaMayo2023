package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// Introducir numeros por teclado
		
		//Declaro variable donde ingresar  el numero que voy a teclear
		int numero;
		int numero2;
		//Utilizamos una clase llamda escaner para poder escuchar o leer lo que se va  a teclear
		Scanner entrada=new Scanner(System.in);
		
		//Escribo un mensaje con una instruccion
		System.out.println("Introduce un numero por el  teclado:");
		numero=entrada.nextInt();
		
        //Mientras no  cierre el Scanner, puedo segir tecleando numero
		System.out.println("Introduce otro numero por el  teclado:");
		numero2=entrada.nextInt();
		System.out.println("La suma es:"+(numero+numero2));
		//entrada.close();
		
	}

}
