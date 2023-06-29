package com;

import java.util.Scanner;

public class Ejercicio6_BCA {

	public static void main(String[] args) {
		/*  La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
		clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
		es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
		entrega en un embarque considerando lo siguiente:
		* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
		es de tamaño 2.
		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
		tamaño 2.
		Precio inicial se recibe desde teclado */
		
		Scanner entrada=new Scanner(System.in);
		
		String Tipo;
		Double Tamaño, Precio, Precio_Final;
		
		System.out.println("Bienvenidos a la asociacion de vinicultores");
		System.out.println("Por favor fije el precio de la uva");
		Precio=entrada.nextDouble();
		 System.out.println("La uva es tipo A o tipo B?");
		    Tipo = entrada.next();
		    
     switch(Tipo) {
	    	
	    	case ("A"):
	    		System.out.println("La uva es de tamaño 1 o 2?");
	    	    Tamaño=entrada.nextDouble();
	    	    if(Tamaño==1) {
	    	    	Precio_Final=Precio+.20;
	    	    	System.out.println("El precio de la uva sera de:"+Precio_Final);
	    	    }else if(Tamaño==2) {
	    	    	Precio_Final=Precio+.30;
	    	    	System.out.println("El precio de la uva sera de:"+Precio_Final);
	    	    }else {
	    	    	System.out.println("Escriba una opcion valida");
	    	    }
	    	
	    	break;
	    	
	    	case ("B"):
	    		System.out.println("La uva es de tamaño 1 o 2?");
    	    Tamaño=entrada.nextDouble();
    	    if(Tamaño==1) {
    	    	Precio_Final=Precio-.20;
    	    	System.out.println("El precio de la uva sera de:"+Precio_Final);
    	    }else if(Tamaño==2) {
    	    	Precio_Final=Precio-.30;
    	    	System.out.println("El precio de la uva sera de:"+Precio_Final);
    	    }else {
    	    	System.out.println("Escriba una opcion valida");
    	    }
				break;
			}
		    
		    

	}

}
