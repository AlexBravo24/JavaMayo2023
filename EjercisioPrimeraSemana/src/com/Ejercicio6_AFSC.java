package com;

import java.util.Scanner;

public class Ejercicio6_AFSC {

	public static void main(String[] args) {
		// La asociación de vinicultores tiene como política fijar 
		//un precio inicial al kilo de uva, la cual se clasifica en 
		//tipos (A y B), y además en tamaños (1 y 2).
		//Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, 
		//se requiere determinar cuánto recibirá un productor por la uva que entrega 
		//en un embarque considerando lo siguiente:
		//* Si es de tipo A, se le cargan 20 céntimos al precio inicial 
		//cuando es de tamaño 1 y 30 céntimos si es de tamaño 2. 
		//* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 
		//50 céntimos cuando es de tamaño 2.
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
		    
		    System.out.println(" Valor de Uva \"A\" ó \"B\": ");
		    tipo = scanner.next(); scanner.nextLine();
		    
		    System.out.println(" Tipo de Uva \"1\" ó \"2\": ");
		    tamano = scanner.nextInt();
		    

		    if (!((tipo.equalsIgnoreCase("A") || tipo.equalsIgnoreCase("B")) &&
		        (tamano == 1 || tamano == 2))) {
		      System.out.println("El valor de tipo de Uva o el tamaño de Uva es incorrecto, Verifica los valores introducidoss.");
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
