package com;

import java.util.Scanner;

public class Ejercicio6RMQG {

	// La asociaci�n de vinicultores tiene como pol�tica fijar
	// un precio inicial al kilo de uva, la cual se clasifica
	// en tipos (A y B), y adem�s en tama�os (1 y 2). 
	// Cuando se realiza la venta del producto, 
	// �sta es de un s�lo tipo y tama�o, se requiere determinar
	// cu�nto recibir� un productor por la uva que entrega en un
	//embarque considerando lo siguiente: 
	// * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial
	// cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2.
	// * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1,
	// y 50 c�ntimos cuando es de tama�o 2.
	// Precio inicial se ingresa desde teclado.
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double precioInicial;
	        String tipo;
	        int tamano;
	        double precioFinal;

	        System.out.print("Ingresa el precio inicial por kilo de uva: ");
	        precioInicial = scanner.nextDouble();
	        scanner.nextLine();
	        System.out.print("Ingresa el tipo de uva (A o B): ");
	        tipo = scanner.nextLine();
	        System.out.print("Ingresa el tama�o de la uva (1 o 2): ");
	        tamano = scanner.nextInt();
	        scanner.close();

	        if (tipo.equals("A")) {
	            if (tamano == 1) {
	                precioFinal = precioInicial + 0.20;
	            } else {
	                precioFinal = precioInicial + 0.30;
	            }
	        } else {
	            if (tamano == 1) {
	                precioFinal = precioInicial - 0.30;
	            } else {
	                precioFinal = precioInicial - 0.50;
	            }
	        }

	        System.out.println("El productor recibir� " + precioFinal + " c�ntimos por kilo de uva.");
	    }//Fin main
}//Fin class
