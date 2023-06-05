package com;

public class Ciclo5_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Simular el comportamiento de un reloj digital, imprimiendo 
		//la hora, minutos y segundos de un día desde las 00:00:00 horas 
		//hasta las 23:59:59 horas
			
		int horas=0, min=0, seg=0;
		
		for(int i=0; i<23; i++) {
			
			min=0;
			horas++;
			for(int o=0; o<59; o++) {
					
				seg=0;
				min++;
				
				for(int l=0; l<59; l++) {
					seg++;
					System.out.println(horas + ":" + min + ":" + seg);
					
				}
			}
		}
	}

}
