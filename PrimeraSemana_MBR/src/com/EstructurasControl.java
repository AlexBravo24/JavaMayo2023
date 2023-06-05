package com;

import java.lang.invoke.SwitchPoint;

public class EstructurasControl {

	public static void main(String[] args) {
		// Estructuras de decision IF-Valores booleanos
//		int x= 10;
//		
//		
//		if(x<=10){
//			System.out.println("Si, es menor");
//		}else{
//			System.out.println("No, es menor");
//			
//		}
		
		//atajo para comentar masivamente o descomentar, seleccionamos las lineas +Ctrl+ 7
		
//		String nombre = "Programador";
//		
//		System.out.println(nombre.length());
//		
//		//condiciones comppuestas con operadores logicos AND,OR, NOT, DIFERENTE DE e IGUALDAD
//		//AND -&&-Devuelve true cuando se cumplen todas las conexiones
////		if(nombre.length()<12 && nombre.equals("Programador")){
////			System.out.println("Si");
////		}else{
////			System.out.println("No");
////		}
//		
//		if(nombre.length()<12 && nombre.equalsIgnoreCase("Programador")){
//			System.out.println("Si");
//		}else{
//			System.out.println("No");
//		}
//		
//		//OR - ||- Te devuelve True cuando se cumpla almenos una condicion
//		if(nombre.length()<12 || nombre.equalsIgnoreCase("diseñador")){
//			System.out.println("Si");
//		}else{
//			System.out.println("No");
//		}
//		
////		//NOT -!-Niega una condicion o cambia el valor de TRUE a FALSE 
//		if(!(nombre.length()<12 )){
//			System.out.println("Si");
//		}else{
//			System.out.println("No");
//		}
////
//	
//	//IGUALDAD - == -Revisa el valor y lo compara contra otro
//	//si los valores son iguales manda True, si no, manda False
//		int y = 20;
//		
//		if(y==15) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
	//DIFERENTE DE -!= - Compara el valor y si es diferente manda true y si fuera igual manda False 
//      
//		
//		if(y!=15) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
	//Estructura if-else concatenando o if anidado
	int d = 5;
	if(d == 1) {
		System.out.println("lunes");
		}else if (d==2){
			System.out.println("Martes");
		}else if (d==3){
			System.out.println("Miercoles");
		}else if (d==4){
			System.out.println("Jueves");
		}else if (d==5){
			System.out.println("Viernes");
		}else {
			System.out.println("Desconocido");
		}
	//Estructura SWICH-CASE
	int dia=10;
	
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



 


