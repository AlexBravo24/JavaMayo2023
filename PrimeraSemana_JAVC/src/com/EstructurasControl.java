package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
		// Estructuras de desicion IF - valores booleanos
		
		int x = 10;
		
		if (x<=10) {
//			
//			System.out.println("Si es menor");
//		}else {
//			System.out.println("No es menor");
			
			
		}
		
		// Atajo para comentar masivament o descomentar Ctrl + 7
		
		String nombre = "Programador";
		
		System.out.println(nombre.length());
//		
//		//Condiciones compuestas con operadores logicos AND, OR, NOT, DIFERENTE DE, IGUALDAD
//		
//		// AND - && - Devuelve true cuando se cumplen todas las condiciones
//		
		if (nombre.length()<12 && nombre.equalsIgnoreCase("diseñador")) {
			System.out.println("si");
		}else {
			System.out.println("no");
		}
//		
//		// OR - || - Te devuelve True cuando se cumpla al menos una condicion
//		
		if (nombre.length()<12 || nombre.equalsIgnoreCase("diseñador")) {
			System.out.println("si");
		}else {
			System.out.println("no");
		}
//		
//		// NOT - ! - Niega una condicion o cambia el valor de TRUE a FALCE
//		
//		if (!(nombre.length()<12)) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
//		
//		// IGUALDAD - == - Revisar el valor y compararlo contra otro si los valores son iguales entonces manda True, si no manda Falce
//		
//		int y = 15;
//		
//		if (y==14) {
//			
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//			
//			
//		// DIFERENTE DE - != - Compara el valor y si es diferente manda True
//			
//		if (y!=15) {
//				
//				System.out.println("si");
//		}else {
//				System.out.println("no");
//		}
//				
//	
//		// Estructura if-else concatenado o if ainado
//		
//		int d = 5;
//		
//		if (d==1) {
//			System.out.println("lunes");
//		}else if (d==2) {
//			System.out.println("Martes");
//		}else if (d==3) {
//			System.out.println("Miercoles");
//		}else if (d==4) {
//			System.out.println("Jueves");
//		}else if (d==5) {
//			System.out.println("Viernes");
//		}else {
//			System.out.println("Desconocido");
//		}
//		
//		
//		// Estructura SWITCH-CASE
//		
//		int dia = 4;
//		switch (dia) {
//		case 1:	
//		System.out.println("Lunes");
//		break;
//		case 2:	
//			System.out.println("Martes");
//			break;
//		case 3:	
//			System.out.println("Miercoles");
//			break;
//		case 4:	
//			System.out.println("Jueves");
//			break;
//		case 5:	
//			System.out.println("Viernes");
//			break;
//		default:	
//			System.out.println("Desconocido");
//			break;
//		
//		}
//		
//		}
		
		}

	}

