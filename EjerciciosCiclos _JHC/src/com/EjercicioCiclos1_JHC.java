package com;

public class EjercicioCiclos1_JHC {

	public static void main(String[] args) {
		// 1.- Programa un algoritmo que realice la tabla de multiplicar del 12
		
		
		//Tablas del 1 al 12
//		int multiplicando = 1;
//		int multiplicador = 1;
//		
//		while (multiplicando <= 12) {
//			
//			while (multiplicador <= 12) {
//				int producto = multiplicando * multiplicador;
//				System.out.println(multiplicando + " X " + multiplicador + " = " + producto);
//				multiplicador++;
//			}
//			
//			System.out.println("");
//			multiplicador = 1;
//			multiplicando++;
//		}
		
		    	 	int multiplicando = 12 ;
		                int multiplicador = 1;
		            do {
		                 System.out.println ("El reultado de la multiplicacion es \n" + multiplicando + " X " + multiplicador + " = " + multiplicando * multiplicador);
		                  multiplicador += 1;
		        } while (multiplicador<=10);     
		    }
		    
		
	}


