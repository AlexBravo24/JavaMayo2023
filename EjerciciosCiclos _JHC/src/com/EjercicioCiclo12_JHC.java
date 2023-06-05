package com;

import java.util.Scanner;

public class EjercicioCiclo12_JHC {

	public static void main(String[] args) {
		// 12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara
		//cuando el promedio de las edades sea superior a 25.
		
		int edad;
		int suma = 0;
		int contador = 0;
		int promedio = 0;
		
		Scanner numero = new Scanner(System.in);
		
		
		System.out.println("Se ingresan un conjunto de n edades de personas por teclado");
		
		//Datos solicitados al usuario
		do {
			System.out.println("Ingrese la edad de la persona");
			edad = numero.nextInt();
			suma = suma + edad;
			contador = contador + 1;
			promedio = suma / contador;
			System.out.println("El promedio hasta el momento es: " + promedio); //imprime el promedio hasta el momento
			
			
			//Operaciones 
			if (promedio > 25) { //ciclo
				break;
			}
		} while (edad > 0) ;
		System.out.println("La suma de las edades es : " + suma);  //impresion de la suma de las edades
		System.out.println("El promedio es igual a : " + promedio); //impresion del valor del promedio
		if (promedio > 25) {
			System.out.println("El promedio fue mayor a 25, a finalizado "); //valor de promedio mayor a 25
		}else {
			System.out.println("Reinicia el programa ya que el promedio no fue mayor a 25");	//mensaje para reiniciar el programa por exceder el promedio mayor
		}
	}

}
