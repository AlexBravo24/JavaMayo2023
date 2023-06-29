package com;

public class EstructurasControl {

	public static void main(String[] args) {

//		
//		int x=9;
//		if(x<10) {
//			System.out.println("simon que si es menor");
//		}
//		else {
//			System.out.println("nel prro :V");
//			
//		}
//		
		
		//Ejemplo
		int s1=1;
		int s2=1;
		String nombre= "Programador";
		System.out.println(nombre.length());
		
		//funcion OR
		
		if (s1==1 || s2==1 ) {
			System.out.println("Hay salida Or");
		}
		else {System.out.println("No hay salida OR");}
		//funcion and
		if (s1==1 && s2==1 ) {
			System.out.println("hay salida and");
		}else {System.out.println("no hay saida AND");}
		
		
		//funcion not "!"
		boolean a=true;
		
		
		if (!a==false) {
			 System.out.println("a es false");
			
		}
			 
		
		
		//Funcion XOR
		if ((s1==1&& s2==0)||(s2==1 && s1==0)) {
			
				System.out.println("Hay salida XOr");	
			}else {
				System.out.println("No hay salida XOR");
			}
				
			//IFS ANIDADOS
		
		
		int d =5;
		if (d==1) 
		{
			System.out.println("lunes");
		}
		else if (d==2) {
			System.out.println("martes");
		}else if(d==4) {
			System.out.println("jueves");
		}else if (d==5) {
			System.out.println("viernes");
		}else {System.out.println("desconocido");}
			
		
		//siempre se debe poner else if si es anidado
		System.out.println("aqui la respuesta del porque se debe poner solo else if(){}");
		int e =1;
		if (e==1) 
		{
			System.out.println("lunes");
		}
		if (e==2) {
			System.out.println("martes");
		} if(e==4) {
			System.out.println("jueves");
		} if (e==5) {
			System.out.println("viernes");
		}else {System.out.println("desconocido");}
		}
		
		
		
	}


