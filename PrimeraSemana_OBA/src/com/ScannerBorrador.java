package com;

import java.util.Scanner;

public class ScannerBorrador {

	public static void main(String[] args) {//todos los programas hasta ahhora se invoca el main
		// variable Scanner
		Scanner entradadedatosquenosden = new Scanner(System.in);  //nos pocicionamos sobre Scanner y com click derecho lo importamos
		int numero;
		
		System.out.println("escriba un numero: ");
		numero = entradadedatosquenosden.nextInt();//.nextInt para numeros enteros de clase int, pueden ser de diferentes clases: float,cadena,etc
		
		System.out.println("su numero es: "+numero);
		
		/*guardar numeros enteros con int si es uno muy grande con string
		 * tambien los decimales con float agregando el .nextfloat
		 * las cadenas de palabras con .nextLine y asi devemos buscar cual .next??? le corresponde a cada variable
		 * tambien hay de un solo caracter con char y tambien se conjuga con .next().charAt(0)
		 */

	

	}
}
