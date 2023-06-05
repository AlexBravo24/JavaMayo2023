package com;

import java.util.Arrays;
import java.util.Scanner;

public class Ciclos3_EIMD {
	public static void main(String[] args) {
//		3. Realiza un programa para determinar si un String es palíndromo. 

		// Palabra o expresión que es igual si se lee de izquierda a derecha que de
		// derecha a izquierda.
		String letras;
		Scanner cadena = new Scanner(System.in);
		System.out.println("Introduce una horacion");
		letras = cadena.nextLine();
		String bc = letras.replace(" ", "");
		int a = bc.length() - 1;
		char[] caracteres = bc.toCharArray();
		char[] nuevo = new char[bc.length()];
		int i = 0;
		for (int j = a; j >= 0; j--) {
			if (caracteres[i] == caracteres[j]) {
				nuevo[i] = caracteres[j];
			}
			i++;
		}
		if (Arrays.equals(caracteres, nuevo)) {
			System.out.println("Son palindromos");
		} else {
			System.out.println("No son palindromos");
		}
		cadena.close();
	}
}
