package com;

public class Ciclos5_EIMD {

	public static void main(String[] args) throws InterruptedException {
		/*
		 5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
de un día desde las 00:00:00 horas hasta las 23:59:59 horas 
		 */
		
		int minutos=0,segundos=0,horas=0;
		
		for (int i = 0; i < (60*60*24); i++) {
			
			
		
			segundos++;
//			Thread.sleep(1);
			if(segundos==60) {
				minutos++;
				segundos=0;
				
				if(minutos==60) {
					horas++;
					minutos=0;
					if(horas==24)
					{
						horas=0;
					}
				}
				
			}
			System.out.println(horas+":"+minutos+":" +segundos
					+".");
			
		}
		
		
	}

}
