package com;

public class Ciclos5_EAGG {

	public static void main(String[] args) {
		// 5. Simular el comportamiento de un reloj digital, 
		// imprimiendo la hora, minutos y segundos de un d�a 
		// desde las 00:00:00 horas hasta las 23:59:59 horas.

		int h=00, m=00, s=00;
		
			for ( h=00; h<=23; h++) {
			for ( m=00; m<=59; m++) {
			for ( s=00; s<=59; s++) {
			
		System.out.println(h+ ":" + m + ":" + s);
			}
			}
			}
	}
}