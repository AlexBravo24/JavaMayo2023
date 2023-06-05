package com;
/*
 * Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
de un d�a desde las 00:00:00 horas hasta las 23:59:59 horas 
 */
public class Ejercicio5_BCA {

	public static void main(String[] args) {
	for (int h = 0; h < 24; h++) {
		
		for (int m = 0; m <60; m++) {
			for (int s = 0; s < 60; s++) {
				System.out.printf("%02d:%02d:%02d", h, m, s);
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
			
		}
		
	}

	}

}
