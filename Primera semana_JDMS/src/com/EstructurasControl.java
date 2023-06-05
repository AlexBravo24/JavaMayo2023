package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
		// Estructuras de decision IF nos devuelve valores voleanos
		
//		int x=10;
//		
//		if(x<=10) {
//			System.out.println("Si es menor");
//		}else {
//			System.out.println("no es menor");	
//	}
	   String nombre="Programador";
	   
	  // System.out.println(nombre.length());
	   
	   
	   //Condiciones compuestas por operadores logicos, AND, OR, NO DIFERENTE DE, IGUALDAD
	   
//        //AND se escribe && y devuelve TRUE  cuando comple con  las condicciones
//	   
//	   if(nombre.length()<12 && nombre.equalsIgnoreCase("Programador")) {
//		   System.out.println("Si");
//	   }else {
//		   System.out.println("No");
//		   
//	   }
//	   //OR me devuelve TRUE cuando se cumple una instriccion
//	   if(nombre.length()<12 || nombre.equalsIgnoreCase("Programador")) {
//		   System.out.println("Si");
//	   }else {
//		   System.out.println("No");
//		   
//	   }
//	   //NOT ! cambia el valor de TRUE a FALSE
//	   if(!(nombre.length()<12)) {
//		   System.out.println("Si");
//	   }else {
//		   System.out.println("No");
//		   
//	   }
//	   //IGUALDAD == Revisa silos valores son igulaes
//	   int y = 20;
//	   if(y ==15) {
//		   System.out.println("Si es igual");
//	   }else {
//		   System.out.println("No es igual");
//	   }
//	   
//	   //DIFERENTE DE != compara el  valor  y si  es diferente manda true y si no  false
//	  	   if(y != 20) {
//		   System.out.println("Si es difenrete");
//	   }else {
//		   System.out.println("No es diferente");
//	   }
	   int d = 5;
	    
	   if(d==1) {
		   System.out.println("Lunes");
	   }else if(d==2){
		   System.out.println("Martes");
	   }else if(d==3){
		   System.out.println("Mircoles");
	   }else if(d==4){
		   System.out.println("Jueves");
	   }else if(d==5){
		   System.out.println("Viernes");
	   }else{
		   System.out.println("Desconocido");
	   }
	   
	   //SWITCH CASE
	   int dia=5;
	   switch(dia) {
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
	   case 6:
		   System.out.println("Desconocido");
		   break;
	   }
	}// Cierre MAIN

}
