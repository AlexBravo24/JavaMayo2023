package com;

import java.util.Scanner;

public class Ejercicio3_EIMD {
public static void main(String[] args) {
	/*
	 3.Crea un programa que pida al usuario dos números y 
	 muestre el resultado de su división. Si el
segundo número es 0, debe mostrar un mensaje de error.
	 */
	
	double numero1;
	double numero2;
	Scanner dato=new Scanner(System.in);
	System.out.println("Introduce dos números");
	numero1=dato.nextInt();
	numero2=dato.nextInt();
	
	if (numero2==0) {
		System.err.println("Imagínate que tienes "+ numero1
				+" galletas y las repartes entre cero amigos.\n ¿Cuántas galletas le tocan a cada amigo? No tiene sentido.\n ¿Lo ves? Así que el monstruo come galletas está triste porque no tiene galletas\n y tú estás triste porque no tienes amigos\n Sintax Error \n R=Indeterminado");
		System.exit(0);
	}else {
	System.out.println("El resultado de su divición es= " + (numero1/numero2));
	}
	dato.close();
}
}
