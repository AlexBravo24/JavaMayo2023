package com;

import java.util.Scanner;

public class Ejercicio6_AFSC {

	public static void main(String[] args) {
		// La asociaci�n de vinicultores tiene como pol�tica fijar 
		//un precio inicial al kilo de uva, la cual se clasifica en 
		//tipos (A y B), y adem�s en tama�os (1 y 2).
		//Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, 
		//se requiere determinar cu�nto recibir� un productor por la uva que entrega 
		//en un embarque considerando lo siguiente:
		//* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial 
		//cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2. 
		//* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 
		//50 c�ntimos cuando es de tama�o 2.
		//Precio inicial se recibe desde teclado
		
		Scanner scanner = new Scanner(System.in);
		 int kilos,
		 	 tamano;
		 double precioInicial;
		 String tipo;

		   
		    System.out.println(" Cuantos Kilos de Uva son: ");
		    kilos = scanner.nextInt();
		    
		    System.out.println(" Precio Inicial por Kilo: ");
		    precioInicial = scanner.nextDouble();
		    
		    System.out.println(" Valor de Uva \"A\" � \"B\": ");
		    tipo = scanner.next(); scanner.nextLine();
		    
		    System.out.println(" Tipo de Uva \"1\" � \"2\": ");
		    tamano = scanner.nextInt();
		    

		    if (!((tipo.equalsIgnoreCase("A") || tipo.equalsIgnoreCase("B")) &&
		        (tamano == 1 || tamano == 2))) {
		      System.out.println("El valor de tipo de Uva o el tama�o de Uva es incorrecto, Verifica los valores introducidoss.");
		    } else {
		      if (tipo.equalsIgnoreCase("A") && tamano == 1) {
		        System.out.println("Recibira una ganancia de: " + ((kilos * precioInicial)+(kilos*0.20)));
		      } else if (tipo.equalsIgnoreCase("A") && tamano == 2) {
		        System.out.println("Recibira una ganancia de: " + ((kilos*precioInicial)+(kilos*0.30)));
		      } else if (tipo.equalsIgnoreCase("B") && tamano == 1) {
		        System.out.println("Recibira una ganancia de: " + ((kilos * precioInicial)-(kilos*0.30)));
		      } else if (tipo.equalsIgnoreCase("B") && tamano == 2) {
		        System.out.println("Recibira una ganancia de: " + ((kilos*precioInicial)-(kilos*0.50)));
		      }
		    }	

	}

}
