package com;

public class Ciclos6_MBR {

	public static void main(String[] args) {
		/*6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s mensual. 
		 * �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si todo el dinero lo reinvierte?*\*/
		System.out.println("Inverison de dinero a un a�o");
		System.out.println("Dinero inicial $1000.00");
		
		double d = 1000.00;
		int x = 1;
		while (x <= 12) {
			x++;
		}
		System.out.printf("Dinero invertido despues de un a�o: ", d);

	}

}
