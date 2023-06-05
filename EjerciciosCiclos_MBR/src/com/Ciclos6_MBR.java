package com;

public class Ciclos6_MBR {

	public static void main(String[] args) {
		/*6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. 
		 * ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?*\*/
		System.out.println("Inverison de dinero a un año");
		System.out.println("Dinero inicial $1000.00");
		
		double d = 1000.00;
		int x = 1;
		while (x <= 12) {
			x++;
		}
		System.out.printf("Dinero invertido despues de un año: ", d);

	}

}
