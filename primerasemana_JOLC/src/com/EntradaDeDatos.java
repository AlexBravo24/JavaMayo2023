package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		//INTRODUCIR NUMEROS POR TECLADO
		
		//DECLARO UNA VARIABLE DONDE ALMACENAR EL NUMERO QUE VOY 
		//A TECLEAR
		
		int numero; 
		
		//UTILIZAMOS UNA CLASE LLAMDA SCANNER PARA PODER LEER
		//O "ESCUCHAR" LO QUE SE VA A INTRODUCIR POR TECLADO
		
		
		Scanner entrada = new Scanner (System.in);
		
		//ESCRIBO UN MENSAJE CON UNA INSTRUCCION 
		
		System.out.println("introduce un numero por teclado");
		//GUARDAMOS LO QUE VAYAMOS A TECLEAR EN LA VARIABLE NUMERO
		
		numero = entrada.nextInt();
		
		System.out.println("el valor teclado fue" + " "+numero);
		
		//MIENTRAS NO CIERRE EL ESCANER PUEDO SEGUIR INTODUCIENDO 
		//NUMEROS
		
		System.out.println("intoduce otro numero 2");	
		int numero2 =entrada.nextInt();
		
		System.out.println("introduce numero 3");
		int numero3 =entrada.nextInt();
		
		
		
		System.out.println("la suma de numero 1 y numero 2 y numero 3 es  "+ (numero + numero2+numero3));
		
		
		entrada.close();

		
		
	}

}
