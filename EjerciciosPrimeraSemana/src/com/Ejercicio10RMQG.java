package com;
import java.util.Scanner;
// Realiza un programa que pida un número entero entre uno y doce para saber el numero de mes e imprima el número de días que tiene el mes correspondiente.
//
public class Ejercicio10RMQG {
    public static void main(String[] args) {
    	
		/*
		 * Realiza un programa que pida un número entero entre uno y doce e imprima el
		 * número de días que tiene el mes correspondiente.
		 */
    	
        Scanner scanner = new Scanner(System.in);
        int mes;
        String dias;

        System.out.print("Ingresa un número entero entre 1 y 12 para saber el número de días del mes correspondiente: ");
        mes = scanner.nextInt();
        scanner.close();
        
        switch (mes) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
          dias = "treinta y un días.";
          break;
        case 4: case 6: case 9: case 11:
          dias = "treinta días.";
          break;
        case 2:			
          dias = "veintiocho días o veintinueve si el año es bisiesto.";
          break;			
        default:
        	System.out.println("ERROR: número incorrecto");
        return;
      }
        	System.out.println("El mes correspondiente al número ingresado tiene " + dias);
    }
}