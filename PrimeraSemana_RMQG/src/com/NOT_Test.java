package com;

public class NOT_Test {

	public static void main(String[] args) {
		//Video 01.02.50
		// NOT - ! - Niega la expresión o la invierte
		String nombre = "Programador";
		System.out.println(nombre.length());
		
		if (!(nombre.length()<12)) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		//IGUAL A == Revisar el valor y compararlo con otro
		// recuerda que un solo = es para asignar valores
		//Si los valores son iguales manda true y si no false.
		int y = 20;
		if (y == 15) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		//DIFERENTE DE - != - Compara el valor y su es diferente manda true
		if (y != 15) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		//FIN SECCION


	}//Fin de main

}//Fin de clase
