package com;

public class Ciclos5_MAGA {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 5:
		 * Simular el comportamiento de un reloj digital, imprimiendo la hora,
		 *  minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		 * */
		
		int seg, min, horas;
		horas = 0;
		min = 0;
		seg = 0;
		
		while (horas < 24) {
			while(min < 60) {
				while(seg < 60) {
					System.out.println(horas + ":" + min + ":" + seg);
					seg++;
				}
				seg = 0;
				min++;
			}
			min= 0;
			horas++;
		}

	}

}
