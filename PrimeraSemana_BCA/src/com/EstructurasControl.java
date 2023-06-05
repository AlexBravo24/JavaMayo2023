package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
		//Estructuras de desicion IF-valores booleanos
		
////		int x=10;
////		
////		if(x<10) {
////			
////			System.out.println("Si es menor");
////		}else {
////			
////		
		System.out.println("No es menor");
////
////		}
//		
//		//ctr+7 para comentar lo seleccionado
//		//porque no queremos que se ejecute apara los ejercicios 
//		//para descomentar se puede aplicar igual
//		
//		//otra forma de comentar multiples lineas= /*codigo*/
//		
//		
//		String nombre="Programador";
//		
//		System.out.println(nombre.length());
//		
////Condiciones compuestas con operadoreslogicos
////AND, OR, NOT, DIFERENTE DE, IGUALDAD
//		
//		//AND = &&= Devuelve true cuando se cumplen todas las condiciones
//		if(nombre.length()<12&& nombre.contentEquals("Programador")) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}//Con este operador se deben cumplir ambas
//		//aqui tambien se puede usar nombre.equalsIgnoreCase
//		//para que no diferencie entre mayusculas y minusculas
//		
//		
//		//OR=||=Te devuelve True cuando se cumpla al menos una condicion 
//		if(nombre.length()<12|| nombre.equalsIgnoreCase("Diseñador")) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		//NOT=!=Niega una condicion o cambia el valor de TRUE a FALSE
//		if(!(nombre.length()<12)) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		//IGUALDAD-==-Revisar el valor y comprarlo con otro
//		//Si los valores son iguales manda, true,si no, manda false
//		
//		int y=20;
//		if(y==15) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		//DIFERENTE DE-!- Compara el valor y si es diferente manda TRUE
//		
//		if(y !=15) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
//Estructura if-else concatenado o if anidado
		
	int d = 5;
	    if (d==1) {  
		System.out.println("Lunes"); 
	    }else if (d == 2) {
	    	System.out.println("Martes"); 
	    }else if (d == 3) {
	    	System.out.println("Miercoles"); 
	    }else if (d == 4) {
	    	System.out.println("Jueves"); 
	    }else if (d == 5) {
	    	System.out.println("Viernes"); 
	    }
	    
	  //Estructura SWITCH-CASE
		
	    int dia = 9;
	  		switch (dia) {
			case 1:
			System.out.println("Lunes");
			case 2:
				System.out.println("Martes");
			case 3:
				System.out.println("Miercoles");
			case 4:
				System.out.println("Jueves");
			case 5:
				System.out.println("Viernes");
				
				break;

			default:
				System.out.println("Desconocido");
				
				break;
			}
		
	}

}
