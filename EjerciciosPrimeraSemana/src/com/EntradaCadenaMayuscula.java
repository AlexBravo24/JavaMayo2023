package com;

import java.util.Scanner;

public class EntradaCadenaMayuscula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner valor=new Scanner(System.in);
		String compara;
		String compara2;
		String cadena;
        System.out.println("Ingresa la letra pasa saber si esta en Mayuscula");
        cadena=valor.next();
        compara=cadena;
        
        //compara2=cadena;
        //compara2.toLowerCase();
        cadena.toUpperCase();
        System.out.println(cadena);
        System.out.println(compara);
//        if(compara == cadena) {
//        	System.out.println(compara+" "+"Fue ingresado en mayusculas");
//        }else if(compara==compara2) {
//        	System.out.println(compara+" "+"Fue ingresado en minusculas");
//        }else {
//        	System.out.println("Tiene valores combinados");
//        }
        
        
	}

}
