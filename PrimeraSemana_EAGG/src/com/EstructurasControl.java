package com;

public class EstructurasControl {

	public static void main(String[] args) {
		// Estructuras de decisión IF - valores booleanos
		
//		int x=10;
//				
//		if (x<=10) {
//			System.out.println("Si es menor");
//		} else {
//			System.out.println("No es menor");
//		}
		
		// Atajo para comentar o descomentar masivamente
		//seleccionamos las líneas que queremos y ponemos Ctrl + 7
		
//	String nombre = "Programador";
//	
//	System.out.println(nombre.length());
//	
//	//Condiciones compuestas con operadores lógicos 
//	//AND, OR, NOT, DIFERENTE DE, IGUALDAD
//	
//	//AND = Se caracteriza por && y esto te devuelve TRUE cuando se cumplen
//	//todas las condiciones
//	
//	if (nombre.length()<12 && nombre.equals("Diseñador")) {
//		System.out.println("Si");
//	}else {
//			System.out.println("No");		
//	}	
//	
//	
//	
//	//OR ||= Te devuelve por True cuando se cumpla al menos una condición
//		//todas las condiciones
//		
//		if (nombre.length()<12 || nombre.equalsIgnoreCase("diseñador")) {
//			System.out.println("Si");
//		}else {
//				System.out.println("No");	
//		}	
//		
//	
//	//NOT = ! Niega una condición o cambia el valor de TRUE a FALSE
//		
//
//		if (!(nombre.length()<12)) {
//			System.out.println("Si");
//		}else {
//				System.out.println("No");		
//		}	
//		
//	
//	//Operador de IGUALDAD= == Revisa el valor y lo compara contra otro valor
//	//Si los valores son igaules, entonces manda a True, sino, manda a False
//				
//		int y=20;
//		
//		if (y==15) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//	
//	//DIFERENTE DE = != = Compara el valor y si es diferente
//	//manda a TRUE y sino manda a False
//		
//		if (y!=15) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
	
	//Estructura if-else concatenado o if anidado
	
		int d = 5;
		
		if (d==1) {
			System.out.println("Lunes");
		}else if (d==2) {
			System.out.println("Martes");
		}else if (d==3) {
			System.out.println("Miercoles");
		}else if(d==4) {
			System.out.println("Jueves");
		}else if(d==5) {
			System.out.println("Viernes");
		}else {
			System.out.println("Desconocido");
		}
		
	//Estructura SWITCH-CASE 
		
		int dia = 9;
		switch(dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		default:
			System.out.println("Desconocido");
			break;
		}
		
		
		
		
		
		
		}
	}
	
	
	

