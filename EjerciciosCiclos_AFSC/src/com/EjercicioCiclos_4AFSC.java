package com;
import java.util.Scanner;
public class EjercicioCiclos_4AFSC {

	public static void main(String[] args) {
		// Programa que reciba una frase y una letra por teclado. 
		//Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase. 
		//Si no existe, imprimir un mensaje “Carácter no encontrado”.
		
		Scanner entrada = new Scanner(System.in);
		String Texto="";
		String caracter="";
		int cont=0;

		System.out.println("Ingresa el texto: ");
		Texto = entrada.nextLine();

		System.out.println("Elige Letra: ");
		caracter = entrada.nextLine();
		for (int i = 0; i < Texto.length(); i++) {
		if(Texto.charAt(i)== caracter.charAt(0) ){
		cont ++;
		}
		}

		if (cont != 0) {
		System.out.println("La letra "+caracter.charAt(0)+ " se repite " + cont + " veces");
		}else{
		System.out.println("La letra no se encuentra en este texto");
		}

		

	}
}

