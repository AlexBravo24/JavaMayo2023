package com;


/*
 * 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
 * desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
23 x 95 = ???
 */
import java.util.Scanner;
public class Ciclos2_BCA {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		float num1, num2, resultado;
		int d;
		
		do {
			System.out.println("Multiplicacion de dos números");
			
			System.out.println("introduzca el primer número");
			num1 = entrada.nextFloat();
			
			System.out.println("introduzca el segundo número");
			num2 = entrada.nextFloat();
			
			resultado = num1*num2;
			System.out.println("El resultado es: " + resultado);
			
			System.out.println("Oprima 1 para hacer otra multiplicación o 2 para salir");
			d = entrada.nextInt();
			
		} while (d !=2 );
	}

}
