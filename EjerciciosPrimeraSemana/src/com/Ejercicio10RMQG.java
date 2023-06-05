package com;
import java.util.Scanner;
// Realiza un programa que pida un n�mero entero entre uno y doce para saber el numero de mes e imprima el n�mero de d�as que tiene el mes correspondiente.
//
public class Ejercicio10RMQG {
    public static void main(String[] args) {
    	
		/*
		 * Realiza un programa que pida un n�mero entero entre uno y doce e imprima el
		 * n�mero de d�as que tiene el mes correspondiente.
		 */
    	
        Scanner scanner = new Scanner(System.in);
        int mes;
        String dias;

        System.out.print("Ingresa un n�mero entero entre 1 y 12 para saber el n�mero de d�as del mes correspondiente: ");
        mes = scanner.nextInt();
        scanner.close();
        
        switch (mes) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
          dias = "treinta y un d�as.";
          break;
        case 4: case 6: case 9: case 11:
          dias = "treinta d�as.";
          break;
        case 2:			
          dias = "veintiocho d�as o veintinueve si el a�o es bisiesto.";
          break;			
        default:
        	System.out.println("ERROR: n�mero incorrecto");
        return;
      }
        	System.out.println("El mes correspondiente al n�mero ingresado tiene " + dias);
    }
}