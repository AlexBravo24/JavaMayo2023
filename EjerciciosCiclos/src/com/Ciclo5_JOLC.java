package com;

public class Ciclo5_JOLC {

	public static void main(String[] args) {
		// Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
		//de un d�a desde las 00:00:00 horas hasta las 23:59:59 horas 
for (int hora = 0; hora < 24; hora++) {
	for (int minuto = 0; minuto < 60; minuto++) {
		for (int segundo = 0; segundo < 60; segundo++) {
			System.out.printf( "%02d:%02d:%02d\n",hora,minuto,segundo);
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
