package com;

public class EstructurasControl {

	public static void main(String[] args) {
		// Estructura de Decision IF - Valores booleanos 
		
//		int x = 10;
//		
//		if (x<=10) {
//			System.out.println("Si es menor");
//		}
//		
//		else
//			
//		{
//			System.out.println("No es menor");
//		}
		
		//Atajo para comentar y descomentar masivamente = ctrl + 7
		
//		String nombre = "Programador";
//		
//		System.out.println(nombre.length());
//		
//		//Condiciones compuestas con operadores logicos AND
//		//OR, NOT DIFERENTE DE, IGUALDAD
//		
//		//Operador AND - && - Devuelve true cuando se cumplen todas las condiciones
//		//Se debe cumplir las dos condiciones
//		
//		if (nombre.length()<12 && nombre.equalsIgnoreCase("Programador")) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		//OR - || - Te devuelve True cuando se cumpla 
//		//Al menos una condicion
//		
//		if (nombre.length()<12 || nombre.equalsIgnoreCase("Diseñador")) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		//NOT - ! - Niega una condicion o cambia el valor de True a False
//		
//		if (!(nombre.length()<12))  {
//			System.out.println("Si");
//		}else {
//			System.out.println("No"); 
//		}
//		
//		//IGUALDAD - == - Revisar el valor y compararlo contra otro valor
//		//Si los valores son iguales entonces manda TRUE, si no, manda FALSE
//		
//		int y = 20;
//		
//		if (y == 15) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		//Diferente de - != - Compara el valor y si es diferente manda True
//		
//		if (y != 15) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//Estructura if-else concatenado o if anidado
		
//		int d = 6; 
		
//		if(d==1) {
//			System.out.println("Lunes");
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
		
		//Estructura Switch-CASE 
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
