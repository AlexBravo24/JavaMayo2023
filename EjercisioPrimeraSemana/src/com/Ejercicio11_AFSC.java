package com;

import java.util.Scanner;

public class Ejercicio11_AFSC {

	public static void main(String[] args) {
		// Una compa��a de transporte internacional tiene servicio 
		//en algunos pa�ses de Am�rica del Norte, Am�rica Central, 
		//Am�rica del Sur, Europa y Asia. 
		//El costo por servicio de transporte se basa en el peso del paquete 
		//y la zona a la que va dirigida.

		
	    int peso;
	    int zona;
	    Scanner entrada = new Scanner(System.in);

	    System.out.println("Zonas de env�o: ");
	    System.out.println("1.- Am�rica del Norte");
	    System.out.println("2.- Am�rica Central");
	    System.out.println("3.- Am�rica del Sur");
	    System.out.println("4.- Europa");
	    System.out.println("5.- Asia");
	    
	    System.out.println("\n Ingresa la Zonas de env�o de tu paquete: ");
	    zona = entrada.nextInt();
	    
	    System.out.println("\nIntroduce el peso del paquete (1-5): ");
	    peso = entrada.nextInt();

	    if (peso > 5){
	      System.out.println("\nTu paquete no se admite por motivos de seguridad, supera el peso limite.");
	    } else {
	      switch (zona) {
	      case 1:
	        System.out.println("Tu paquete de " + peso + " kg enviado a Am�rica del Norte tiene un costo de " +(peso*24) + "  euros.");
	        break;
	      case 2:
	        System.out.println("Tu paquete de " + peso + " kg enviado a Am�rica Central tiene un costo de  " +(peso*20) + "  euros.");
	        break;
	      case 3:
	        System.out.println("Tu paquete de " + peso + " kg enviado a Am�rica del Sur tiene un costo de  " +(peso*21) + "  euros.");
	        break;
	      case 4:
	        System.out.println("Tu paquete de " + peso + " kg enviado a Europa tiene un costo de  " +(peso*10) + "  euros.");
	        break;
	      case 5:
	        System.out.println("El paquete de " + peso + " kg enviado a Asia tiene un costo de  " +(peso*18) + "  euros.");
	        break;
	      default:
	        System.out.println("****ERROR: La zona elegida es incorrecta.****");
	        break;
	      }
	    }
	}

}
