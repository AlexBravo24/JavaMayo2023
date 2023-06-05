package com;

import java.util.Scanner;

public class Ejercicio6_JHC {

	public static void main(String[] args) {
//		6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se
//		clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta
//		es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que
//		entrega en un embarque considerando lo siguiente:
//		* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si
//		es de tama�o 2.
//		* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de
//		tama�o 2.
//		Precio inicial se recibe desde teclado

		
		int kilos;
		double precioInicial;
		String tipo;
		int tama�o;
		
		Scanner entrada = new Scanner(System.in);
		
		//Datos del usuario
		
		System.out.println("Este programa calcula la ganancia segun el tipo de uva");
		System.out.print("Introduce los kg de uva entregados: ");
		kilos = entrada.nextInt();
		System.out.print("Precios por kilo inicial: ");
		precioInicial = entrada.nextDouble();
		System.out.print("Uva de valor \"A\" � \"B\": ");
		tipo = entrada.next(); entrada.nextLine();
		System.out.print("Tipo de uva \"1\" � \"2\": ");
	    tama�o = entrada.nextInt();
	    
	// Calculos
	    if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
	        (tama�o == 1 || tama�o == 2))) {
	      System.out.println("Tipo o tama�o incorrecto, vuelva a introducir los valores.");
	    } else {
	      if (tipo.toUpperCase().equals("A") && tama�o == 1) {
	        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
	      } else if (tipo.toUpperCase().equals("A") && tama�o == 2) {
	        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
	      } else if (tipo.toUpperCase().equals("B") && tama�o == 1) {
	        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
	      } else if (tipo.toUpperCase().equals("B") && tama�o == 2) {
	        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
	      }
	      
	      entrada.close();
	    }
		
	}

}
