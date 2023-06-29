package com;

public class EstructurasControl {

	public static void main(String[] args) {
		// Estructuras de decision IF - Valore booleanos
//		int x = 10;
//		
//		if (x<=10) {
//			System.out.println("si es menor ");
//			
//		}else {
//			System.out.println("NO es menor");
//		}
		
		// Atajo para comentar masivamente o descomentar 
		//selecionamos las lineas que queremos comentar o descomentar
		//Ctrl + 7 
		
		
//		String nombre = "Programador";
//		
//		System.out.println(nombre.length());
//		
//		//Condiciones compuestas con operadores logicos AND, OR NOT 
//		//DIFERNTE DE, IGUALDAD
//		
//		//AND - && - Devuelve true cuando se cumple todas las condiciones
//		if (nombre.length()<12 && nombre.equalsIgnoreCase("Programador")) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
//		
//		//OR - || - TE devuekve true cuando se cumple una condicion 
//		
//		if (nombre.length()<12 || nombre.equalsIgnoreCase("diseñador")) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
//		
//		// NOT - ! -Niega una condicion o cambia el valor de TRUE A FALSE
//		
//		if (! (nombre.length()<12)) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
//		
//		
//		// IGUALDAD - == - Revisar el valor y compararlo contra otro 
//		// si lo svalores son iguales entonces maa true, si no, manda False
//		
//		int y = 20;
//		if (y == 15 ) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
//		
//		//DIFERENTE DE - != -  Compara el valor si es diferente manda True 
//		if (y != 15 ) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
//		
		
		
		
		// Estructura if-else concatenado o if anidado
		int d = 5; 
		if (d==1) {
			System.out.println("lunes");
		} else if (d==2) {
			System.out.println("Martes");
		} else if (d==3) {
			System.out.println("Miercoles");
		} else if (d==4) {
			System.out.println("Jueves");
		} else if (d==5) {
			System.out.println("Viernes");
		} else {
			System.out.println("Desconocido");
		}
		
		// estructura SWITCH-CASE
		int dia=9;
		switch (dia) {
		case 1:
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
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
