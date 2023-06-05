package com;

public class Ciclos5_YAAH {

	public static void main(String[] args) {
		// 5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
		// de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		
//		int hora = 0;
//		int minuto = 0;
//		int seg = 0;
//		
//		while (hora < 24 ) {
//			while ( minuto < 60 ) {
//				while ( seg < 60 ) {
//					System.out.println("Son las: " + hora + ":" + minuto + ":" + seg);
//					seg++;
//				}
//				seg = 0;
//				minuto++;
//			}
//			minuto = 0;
//					hora ++;
//		}
		
		for (int hora = 0; hora<=23; hora++) {
			for(int minuto = 0; minuto <= 59; minuto++) {
				for (int seg = 0; seg <= 59; seg++) {
					System.out.printf("%02d:%02d:%02d\n" , hora,minuto,seg);
				}
			}
		}
		
		
		

	}

}
