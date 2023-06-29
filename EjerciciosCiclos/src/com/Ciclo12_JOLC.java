package com;

import java.util.Scanner;

public class Ciclo12_JOLC {

	public static void main(String[] args) {
		// Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
		//cuando el promedio de las edades sea superior a 25

		   Scanner scanner = new Scanner(System.in);
	        int sumaEdades = 0;
	        int cantidadPersonas = 0;
	        
	        while (true) {
	            System.out.print("Ingrese la edad de una persona (o -1 para salir): ");
	            int edad = scanner.nextInt();
	            
	            if (edad == -1) {
	                break;
	            }
	            
	            sumaEdades += edad;
	            cantidadPersonas++;
	            
	            double promedio = (double) sumaEdades / cantidadPersonas;
	            
	            if (promedio > 25) {
	                System.out.println("El promedio de edades es superior a 25.");
	                break;
	            }
	        }
	        
	        System.out.println("Programa finalizado.");
	        scanner.close();
	    }
	}