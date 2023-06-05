package com;

import java.util.Scanner;

public class BorradoeOperaciones {

	public static void main(String[] args) {
		//operaciones basicas: suma, resta, divicion, multiplicacion y residuo de divicion
		Scanner entrada = new Scanner(System.in);
		float numero1,numero2,suma,resta,divicion,multiplicacion,residuo;
							//  +    -      /          *            %
		System.out.println("tecleé dos números:   ");// pedimos los numeros al usuario 
		numero1 = entrada.nextFloat();
		numero2 = entrada.nextFloat();
		System.out.println("la suma es:"+(numero1+numero2));
		System.out.println("la resta es:"+(numero1-numero2));
		System.out.println("la divicion es:"+(numero1/numero2));
		System.out.println("la multiplicacion es: "+(numero1*numero2));
		System.out.println("el residuo es: "+(numero1%numero2));
		
		
	}

}
