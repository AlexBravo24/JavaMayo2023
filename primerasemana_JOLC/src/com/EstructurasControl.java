package com;

public class EstructurasControl {

	public static void main(String[] args) {
		

		//estructuras de decision IF -valores booleanos
		
//		int x = 10;
//		
//		if (x<=10) {
//			System.out.println("si es menor");
//		}else {
//			System.out.println("no es menor");
//		}
//			
		
		//ATAJO PARA COMENTAR MASIVAMENTE O  DESCOMENTAR CTRL+7
		
		
		String nombre = "programador";
		
		System.out.println(nombre.length());
		
		//CONDICIONES COMPUESTAS CON OPERADORES LOGICOS AND, OR, NOT,
		//DIFERENTE DE, IGUALDAD
		//AND - && - DEVUELVE TRUE CUANDO SE CUMPLEN TODAS LAS CONDICIONES 
		
		if (nombre.length()<12 && nombre.equals("programador")) {
			System.out.println("si");
		}else {
			System.out.println("no");
			
		}
		
		// OR - ||- TE DEVUELVE TRUE CUANSO SE CUMPLA AL MENOS UNA CONDICION
		if (nombre.length()<12 || nombre.equals("diseñador")) {
			System.out.println("si");
		}else {
			System.out.println("no");
			
		}
		
		
		//NOT - ! - NIEGA UNA CONDICION O CAMBIA EL VALOR DE TRUE A FALSE
		if (!(nombre.length()<12))  {
			System.out.println("si");
		}else {
			System.out.println("no");
			
		}
			
		// IGUALDAD - == - REVISA EL VALOR Y COMPARARLO CONTRA OTRO 
		//SI LOS VALORES SON IGUALES MANDA TRUE, SI SON FALSOS MANDA FALSE
		
		int y = 20;
		if(y==20) {
			System.out.println("si");
		}else {
			System.out.println("no");
				
			}
				
		//DIFERENTE DE - != - COMPARA EL VALOR SI ES DIFERENTE MANDA TRUE
		
	
		if(y!=20) {
			System.out.println("si");
		}else {
			System.out.println("no");
				
			}
		}
		
			
		
			
	
		
	
	}
		
	
		
		



