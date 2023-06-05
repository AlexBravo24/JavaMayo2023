package com;

public class ArrayBidimencional {

	public static void main(String[] args) {
		
		
		// ARRAY BIDIMENCIONAL - ESTRUCTURA QUE CONTIENE MAS DATOS IGUALMENTE DE UN MISMO TIPO
		// PERO SE VUELVE "EXPONENCIAL" Y PASAMOS DE UNA ESTRUCTURA QUE MANEJA DATOS LINEALES ( {1,2,3,4,5} )
		// A TENER DATOS EN FORMA DE TABLA
		
		// DECLARAMOS UN ARRAY DE DOD DIMENCIONES
		
		int [] [] numeros = new int [3][3]; //[Filas][Columnas]
		
		// AL MOMENTO DE ALMACENAR DATOS EN EL AREGLO DE DOD DIMENCIONES
		
		numeros [0] [0] = 1;
		numeros [0] [1] = 2;               // [1] [2] [3]
		numeros [0] [2] = 3;
		
		numeros [1] [0] = 4;
		numeros [1] [1] = 5;              // [4] [5] [6]
		numeros [1] [2] = 6;
		
		numeros [2] [0] = 7;
		numeros [2] [1] = 8;              // [7] [8] [9]
		numeros [2] [2] = 9;
		
		// PODEMOS ASIGNAR VALORES DE UN ARRAY DE DOD DIMENCIONES CON LA DECLARACION POR LLAVES
		
		int [] [] numero2  = {{1,2,3},{4,5,6},{7,8,9}};
		
		// DARLE SALIDA A ESTOS DATOS EN CONSOLA 
		
		System.out.println("Los valores contenidos en NUMEROS son : ");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				System.out.print(numeros [i] [j] + " ");
			}
				              
	     
		}

	}

}
