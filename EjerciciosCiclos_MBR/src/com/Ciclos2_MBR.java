package com;

import java.util.Scanner;

public class Ciclos2_MBR {

	public static void main(String[] args) {
		/*2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, 
		 * hasta la iteraci�n deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???*/
		int x,y;
		int z=1;
		Scanner scanner = new Scanner (System.in);
		System.out.println("SE MUESTRA LA TABLA DE MULTIPLICAR DE UN N�MRO DESEADO CON UNA ITERACI�N DESEADA");
		System.out.print("Introduce el primer n�mero: ");
	    x = scanner.nextInt();
	    System.out.print("Introduce el segundo n�mero: ");
	    y = scanner.nextInt();
		while(z<=y) {//miwentras z sea menor o igual a y hasta el numero de veces a multiplicar
			System.out.println(x+"X"+z+"="+x*z);//Multiplicando x, z multiplicador 
			//imprime una operacion
			z++; // Se increementa el multiplicador hasta y veces a multiplicar
			}

	}

}
