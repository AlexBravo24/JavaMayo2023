package com;

import java.util.Scanner;

public class Ejercicio6_BCA {

	public static void main(String[] args) {
		/*  La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se 
		clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta 
		es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que 
		entrega en un embarque considerando lo siguiente:
		* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si 
		es de tama�o 2.
		* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
		tama�o 2.
		Precio inicial se recibe desde teclado */
		
		Scanner entrada=new Scanner(System.in);
		
		String Tipo;
		Double Tama�o, Precio, Precio_Final;
		
		System.out.println("Bienvenidos a la asociacion de vinicultores");
		System.out.println("Por favor fije el precio de la uva");
		Precio=entrada.nextDouble();
		 System.out.println("La uva es tipo A o tipo B?");
		    Tipo = entrada.next();
		    
     switch(Tipo) {
	    	
	    	case ("A"):
	    		System.out.println("La uva es de tama�o 1 o 2?");
	    	    Tama�o=entrada.nextDouble();
	    	    if(Tama�o==1) {
	    	    	Precio_Final=Precio+.20;
	    	    	System.out.println("El precio de la uva sera de:"+Precio_Final);
	    	    }else if(Tama�o==2) {
	    	    	Precio_Final=Precio+.30;
	    	    	System.out.println("El precio de la uva sera de:"+Precio_Final);
	    	    }else {
	    	    	System.out.println("Escriba una opcion valida");
	    	    }
	    	
	    	break;
	    	
	    	case ("B"):
	    		System.out.println("La uva es de tama�o 1 o 2?");
    	    Tama�o=entrada.nextDouble();
    	    if(Tama�o==1) {
    	    	Precio_Final=Precio-.20;
    	    	System.out.println("El precio de la uva sera de:"+Precio_Final);
    	    }else if(Tama�o==2) {
    	    	Precio_Final=Precio-.30;
    	    	System.out.println("El precio de la uva sera de:"+Precio_Final);
    	    }else {
    	    	System.out.println("Escriba una opcion valida");
    	    }
				break;
			}
		    
		    

	}

}
