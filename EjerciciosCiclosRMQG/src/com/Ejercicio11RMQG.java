package com;
import java.util.Scanner;

public class Ejercicio11RMQG {
    public static void main(String[] args) {
		/*
		 * Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado
		 * el ancho y el alto. Ejemplo: 8 x 8
		 */    	
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el alto: ");
        int alto = scanner.nextInt();
        System.out.println("Ingresa el ancho: ");
        int ancho = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }//end main
}//end class