package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
//introducir numeros por teclado 
		
		//1 declarar variable donde le asignaremos el valor
		int numero;
		//2 utilizamos clase scaner para leer el dato 
		Scanner entrada = new Scanner(System.in); // plantilla
		
		//       ----- 
		//       Nombre de la variable
		
		System.out.println("Introduce un número");//escribo la instruccion para que haga el usuario
		
		//3 guardamos lo que se teclee en la primer variable 
		numero=entrada.nextInt(); //next int solo guarda enteros
		System.out.println("el numero es: "+numero );
		//mientras no cierre el scaner puedo seguir solicitando numeros
		System.out.println("Dame otro número");
		int numero2 =entrada.nextInt();
		System.out.println("la suma es:  "+ (numero+numero2));
		//cuando ya hayamos terminado de usar la variable de scaner hay que cerrarla
		
		entrada.close();
		
	}

}
