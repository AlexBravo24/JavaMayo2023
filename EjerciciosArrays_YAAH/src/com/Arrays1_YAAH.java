package com;
import java.util.Scanner;

public class Arrays1_YAAH {

	public static void main(String[] args) {
		// 1. Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
		// Muestra por consola el �ndice y el valor al que corresponde.

      int cantidad = 10;
      
      int [] numeros = new int[cantidad];
      
      Scanner escanear = new Scanner(System.in);
      
      System.out.println("Introduce " + cantidad + " n�meros");
		
      for (int i = 0; i < cantidad; i++) {
    	  System.out.println("N�mero " + (i+1) + ": ");
    	  numeros[i] = escanear.nextInt();
      }
      
      System.out.println("Los n�meros introducidos son: ");
      	for (int i = 0; i < cantidad; i++) {
      		System.out.println("En el ciclo " + (i+1) + " esta el n�mero: " + numeros[i]);
      	}
		
		
      	
        
 	}

 }
      	
      	
      	
      	
      	
      	
      	
      	
		   // Definir el tama�o del array
//        int tamano = 5;
        
        // Crear el array
//        int[] numeros = new int[tamano];
        
        // Crear un objeto Scanner para leer la entrada del usuario
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Introduce " + tamano + " n�meros:");
        
//        // Leer los n�meros del usuario y guardarlos en el array
//        for (int i = 0; i < tamano; i++) {
//            System.out.print("N�mero " + (i+1) + ": ");
//            numeros[i] = scanner.nextInt();
//        }
        
        // Imprimir los elementos del array
//        System.out.println("Los n�meros introducidos son:");
//        for (int i = 0; i < tamano; i++) {
//            System.out.println(numeros[i]);
//        }
		
 
