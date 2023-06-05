package com;

public class EstructurasControl {

	public static void main(String[] args) {
		// Estructuras de descisión IF - valores booleanos
		int x = 15;
		
		if (x<=10) {
			System.out.println("Si es menor");
	}else {
		System.out.println("No es menor");
	}
		
		String nombre = "Programador";
		System.out.println(nombre.length());
		
		//Condiciones compuestas con operadores lógicos AND,
		//OR, NOT, diferente de, igualdad
		
		//AND - && - Devuelve true cuando se cumplen todas las condiciones
		
		if (nombre.length()<12 && nombre.equalsIgnoreCase("programador")) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		//OR - || - Te devuelve true cuando una de las condicones se cumple
		if (nombre.length()<12 || nombre.equalsIgnoreCase("diseñador")) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		//AQUI SE COMENTO EL BLOQUE EN POSIT ##
		
		int d =4;
		if (d==1) {
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
		//Estructura SWITCH-CASE
		int dia=1;
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
		
	} // cierre de main
} // Cierre de la clase
		
