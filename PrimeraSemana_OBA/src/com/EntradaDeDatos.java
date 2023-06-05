package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// introducir numeros por teclado
		//declarar una variable donde almacenar el numero que voy a teclear
		int numero; 
		
		//utilizamos Scanner para poder leer lo qu ese escribe entrada.close() para cerrar
		Scanner entrada = new Scanner(System.in);
		
		//escribir un mensaje con una instruccion
		System.out.println("introduce un numero por teclado");
		
		//guardamos lo que vayamos a teclear en numero
		numero = entrada.nextInt();
		
		System.out.println("el valor tecleado fue " + numero);
		
		//mientras Scanner no se cierre puedo seguir metiendole numeros
		System.out.println("introduce otro numero");
		int numero2 = entrada.nextInt();
		
		System.out.println("la suma de numero1 mas numero2 es:" + (numero+numero2));
		
		
		
		
		

	}

}
