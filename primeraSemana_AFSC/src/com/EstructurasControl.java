package com;

public class EstructurasControl {

	public static void main(String[] args) {
		// Estructuras de decision IF: valores booleanos
		
////		int x=10;
////		if(x<=10) {
////			System.out.println("Si es menor");
////		}else {
////			System.out.println("No es mayor");
////		}
//
//		// Atajo para comentar o descomentar ctrl+7(donde este la diagonal)
//		
//		String nombre="Programador";
//		
//		System.out.println(nombre.length());
//		
//		//Condiciones compuestas con operadores logicos
//		//OR,NOT,DIFERENTE DE, IGUALDAD
//		
//		//AND: && devuelve true cuando se cumplen todas las condiciones
//		if(nombre.length()<12 && nombre.equals("Programador")){
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		//OR: || (barra a lafo del 1) Devuelve true cuando se cumple una condicion
//		if(nombre.length()<12 || nombre.equalsIgnoreCase("programador")){
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		//NOT:! Niega una condicio o cambia el valor de TRUE a False
//		if(!(nombre.length()<12)){
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		//Igualdad:== Revisa el valor y locompara con otro
//		//Si es igual manda TRUE si no manda FALSE
//		
//		int y=20;
//		if(y==15) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		//Diferente de:!= Compara el valor 
//		//Si es diferente manta TRUE
//		if(y!=15) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//Estructura if-else concatenadoo if anidado
		
		int d=5;
		if (d==1) {
			System.out.println("Lunes");
		}else if (d==2) {
			System.out.println("Martes");
		}else if (d==3) {
			System.out.println("Miercoles");
		}else if (d==4) {
			System.out.println("Jueves");
		}else if (d==5) {
			System.out.println("viernes");
		}else {
 		    System.out.println("Desconocido"); 
	}
		
		//Estructura SWITCH-CASE
		int dia=3;
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
			System.out.println("Lunes");
			break;
		default:
			System.out.println("desconocido");
			break;
		}
	}//cierre de main
	
}//cierre de clase