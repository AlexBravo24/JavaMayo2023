package com;

import java.util.Scanner;

public class Ciclos2_JAVC {

	public static void main(String[] args) {
		 
		
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		 //      desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
		  //     23 x 95 = ???
				
		Scanner entrada = new Scanner (System.in);
		
		
		int n;
		int incremento;
		
		System.out.println("Ingresa el Numero de Multiplicar ");
		n = entrada.nextInt();
		
		System.out.println("Ingresa hasta donde se desea Multipliocar ");
		incremento = entrada.nextInt();
		
		if (n>0) {
			
			for (int i = 1; i <= incremento; i++)
			System.out.println(n + " x " + i +  " = " + n*i);
			
			
		} else {
		
			System.out.println(" El numero ingresado no es correcto " + " intente denuevo ");
			
		}
	
	}

}
