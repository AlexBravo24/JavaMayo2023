package com;

import java.util.Scanner;

public class Ejercicio6_EIMD {

	public static void main(String[] args) {
		/*
		 6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo
		  de uva, 
		  la cual se
clasifica en tipos 
(A y B), y adem�s en tama�os (1 y 2). 
Cuando se realiza la venta del producto, �sta
es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que
entrega en un embarque considerando lo siguiente:

* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial
*  cuando es de tama�o 1 y 30 c�ntimos si
es de tama�o 2.
* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de
tama�o 2.
Precio inicial se recibe desde teclado



TIPO A Y TAMA�O 1= 20 CENTIMOS
TIPO A Y TAMA�O 2= 30 CENTIMOS
TIPO B Y TAMA�O 1=-30 CENTIMOS
TIPO B Y TAMA�O 2=-50 CENTIMOS
		 */

		String tipo,tama�o,precioI;
		double n;
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Ingresa El precion inicial por kilo [Centimos]");
		precioI=sc.nextLine();
		
		System.out.println("Ingresa el tipo [A/B]");
		tipo=sc.nextLine();
		
		
		System.out.println("Ingresa el  tama�o[1/2]");
		tama�o=sc.nextLine();
		 n =Double.parseDouble(precioI);
		if (tipo.equals("A")&& tama�o.equals("1")) {
			
			
			System.out.println("el precio final es: "+(n+20)+ " Centimos" );
		}else if (tipo.equals("A")&& tama�o.equals("2")) {
			
			
			System.out.println("el precio final es: "+(n+30)+ " Centimos" );
		}else if (tipo.equals("B")&& tama�o.equals("1")) {
			
			
			System.out.println("el precio final es: "+(n-20)+ " Centimos" );
		}else if (tipo.equals("B")&& tama�o.equals("2")) {
			
			
			System.out.println("el precio final es: "+(n-50)+ " Centimos" );
		}
		
		sc.close();
		
	}

}
