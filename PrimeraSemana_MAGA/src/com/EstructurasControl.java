package com;

public class EstructurasControl {

	public static void main(String[] args) {
		// Estrucuras de decisión If - valores booleanos
//		int x = 15;
//
//		if (x <= 10) {
//			System.out.println("El valor es menor a 10");
//		}else {
//			System.out.println("El valor es mayor a 10");
//		}
		
		
//		String nombre = "Programador";
//		System.out.println(nombre.length());
//		
//		// Condiciones compuestas con operadores logicos AND, OR, NOT e DIFERENTE E IGUALDAD
//		// AND && - Devuelve true cuando se cumplen todas las condiciones
//		if (nombre.length() < 12 && nombre.equals("Diseñador")) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		// OR || - Devuelve true cuando se cumpla una de todas las condiciones
//		if (nombre.length() < 12 || nombre.equalsIgnoreCase("Diseñador")) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		// NOT - ! - Niega una condicion o cambia el valor de TRUE a FALSE
//		if (!(nombre.length() < 12) ) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		// IGUALDAD - == - Comparar si los dos valores son iguales devuelte true
//		if (!(nombre.length() == 12) ) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		
//		// DIFERENTE DE - != - Mientras que no sea igual al valor
//		if (!(nombre.length() != 12) ) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
		
		// Estructura de control if else anidadas
		
		int d = 5;
//		
//		if (d == 1) {
//			System.out.println("Lunes");
//		}else if (d == 2) {
//			System.out.println("Martes");
//		}else if (d == 3) {
//			System.out.println("Miercoles");
//		}else if (d == 4) {
//			System.out.println("Jueves");
//		}else if (d == 5) {
//			System.out.println("Viernes");
//		}else {
//			System.out.println("Desconocido");
//		}
		
		switch (d) {
			case 1:
				System.out.println("Lunes");
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
