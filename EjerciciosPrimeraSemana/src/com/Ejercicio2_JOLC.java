package com;

import java.util.Scanner;

public class Ejercicio2_JOLC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner scanner = new Scanner (System.in);
    int numero;
    
// Solicitud de datos al usuario
    System.out.println("Este programa calcula si un n�mero es par o impar.");
    System.out.print("Introduce el n�mero: ");
    numero = scanner.nextInt();
    
// Realizamos C�lculos y mostramos en pantalla
    if (numero % 2 == 0){
        System.out.println("El n�mero, " +numero + " es par.");
    }else {
        System.out.println("El n�mero " +numero + " es impar.");
    }  
  }
}

