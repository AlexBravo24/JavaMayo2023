package com;

import java.util.Scanner;

public class Ciclos11_EAGG {
	
	// 11.Dibuja un cuadrado, como en la imagen 
	// que acompaña, introducir desde teclado el 
	// ancho y el alto. Ejemplo: 8 x 8
	
	Scanner entrada = new Scanner(System.in);

	int n;
		
	public void entradato() {
	System.out.print("Ingresa el lado del cuadrado: ");
	n = entrada.nextInt();
	}
	
	public void proceso() {
			
	if (n >=2 && n<=50) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(" *");
				
			}
			System.out.println("");
		}
	
	}
	}
	
	public static void main(String[] args) {
		
	Ciclos11_EAGG fc = new Ciclos11_EAGG ();
	fc.entradato();
	fc.proceso();
	
	}

}
