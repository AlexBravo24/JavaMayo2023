package com;

import java.util.Scanner;

public class Ciclo11_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dibuja un cuadrado, como en la imagen que 
		//acompaña, introducir desde teclado el ancho y el alto.
		
		String relleno="";
		char a='*';
		int filas, columnas;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresar el número de filas");
		filas=entrada.nextInt();
		System.out.println("Ingresar el número de columnas");
		columnas=entrada.nextInt();
		for(int i=0; i<columnas; i++) {
			relleno=relleno+a;
		}
		for(int i=0; i<filas; i++) {
			System.out.println(relleno);
		}

	}

}
