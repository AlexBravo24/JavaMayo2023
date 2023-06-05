package com;

import java.util.Scanner;

public class Ejercicio6RMQG {

	// La asociación de vinicultores tiene como política fijar
	// un precio inicial al kilo de uva, la cual se clasifica
	// en tipos (A y B), y además en tamaños (1 y 2). 
	// Cuando se realiza la venta del producto, 
	// ésta es de un sólo tipo y tamaño, se requiere determinar
	// cuánto recibirá un productor por la uva que entrega en un
	//embarque considerando lo siguiente: 
	// * Si es de tipo A, se le cargan 20 céntimos al precio inicial
	// cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.
	// * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1,
	// y 50 céntimos cuando es de tamaño 2.
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
	        System.out.print("Ingresa el tamaño de la uva (1 o 2): ");
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

	        System.out.println("El productor recibirá " + precioFinal + " céntimos por kilo de uva.");
	    }//Fin main
}//Fin class
