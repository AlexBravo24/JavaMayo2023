package com;

public class Ciclo5_JAVC {

	public static void main(String[] args) {
		
		
		// 5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
		//   de un d�a desde las 00:00:00 horas hasta las 23:59:59 horasTODO Auto-generated method stub

		for (int hora = 0; hora <= 23; hora ++)  {
			
			for (int minuto = 0; minuto <= 59; minuto++) {
				
				for (int segundo = 0; segundo <= 59; segundo++) {
					
					System.out.printf("%02d:%02d\n", hora, minuto, segundo);
					
				}
			}
		}
		    
	}

}
