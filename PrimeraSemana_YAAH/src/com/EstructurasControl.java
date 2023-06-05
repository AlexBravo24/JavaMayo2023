package com;

public class EstructurasControl {

	public static void main(String[] args) {
		// Estructuras de decisión IF - Valore booleanos
		
		int x = 10;
		
		if (x<=10) {
			System.out.println("Si es menor");
		}else {
			System.out.println("No es menor");
		}

		String nombre = "Programer";
		
		System.out.println(nombre.length());
		
		//Condiciones compuestas con operadores logicos AND, OR, NOT diferente de, igualdad
		
		//AND devuelve true cuando se cumplen todas las condiciones
		
		if (nombre.length()<12 && nombre.equals("Programers")) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		// OR - || - Te devuelve True cuando se cumple al menos una condicion
		
		if (nombre.length()<12 || nombre.equals("Programers")) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		
		// NOT - ! - No niega una condicion o cambia el valor TRUE a FALSE
		if (!(nombre.length()<12)) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		
		// IGUALDAD - == - REvisar el valor y comparalo con otro
		// Si los valores son iguales entonces manda true, sí no, manda false
		
		int y = 20;
		if (y == 15) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		// Diferente de - != - Compara el valor y si es diferente manda true 
		
		
		if (y != 15) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		// Estructura  if-else concatenado o if anidado
		
		int d = 5;
		
		if(d==1) {
			System.out.println("Lunes");
		}else if (d==2) {
			
			System.out.println("Martes");
		}else if (d==3) {
			
			System.out.println("Miercoles");
		}else if (d==4) {
			
			System.out.println("Jueves");
		}else if (d==5) {
			
			System.out.println("Viernes");
		}else {
			
			System.out.println("Desconocido");
			
		}

			//Estructura Switch-Case
			int dia = 9; 
			switch (dia) {
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
				System.out.println("jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Viernes");
				break;
			default:
				System.out.println("Desconocido");
				break;

			}
		
		
		
		
		
		
		
	}

}
