package com;

public class Ciclos5_OBA {

	public static void main(String[] args) {
		
		        // Ciclo para recorrer las horas del día (0 a 23)
		        for (int hora = 0; hora < 24; hora++) {
		            // Ciclo para recorrer los minutos (0 a 59)
		            for (int minuto = 0; minuto < 60; minuto++) {
		                // Ciclo para recorrer los segundos (0 a 59)
		                for (int segundo = 0; segundo < 60; segundo++) {
		                    // Imprimir la hora, minutos y segundos
		                    System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);

		                    // Esperar 1 segundo antes de avanzar al siguiente segundo
		                    try {
		                        Thread.sleep(1000); // Pausa de 1 segundo
		                    } catch (InterruptedException e) {
		                        e.printStackTrace();
		                    }
		                }
		            }
		        }
		    }
		

		

	}


