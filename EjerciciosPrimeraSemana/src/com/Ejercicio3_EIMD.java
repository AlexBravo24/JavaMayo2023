package com;

import java.util.Scanner;

public class Ejercicio3_EIMD {
public static void main(String[] args) {
	/*
	 3.Crea un programa que pida al usuario dos n�meros y 
	 muestre el resultado de su divisi�n. Si el
segundo n�mero es 0, debe mostrar un mensaje de error.
	 */
	
	double numero1;
	double numero2;
	Scanner dato=new Scanner(System.in);
	System.out.println("Introduce dos n�meros");
	numero1=dato.nextInt();
	numero2=dato.nextInt();
	
	if (numero2==0) {
		System.err.println("Imag�nate que tienes "+ numero1
				+" galletas y las repartes entre cero amigos.\n �Cu�ntas galletas le tocan a cada amigo? No tiene sentido.\n �Lo ves? As� que el monstruo come galletas est� triste porque no tiene galletas\n y t� est�s triste porque no tienes amigos\n Sintax Error \n R=Indeterminado");
		System.exit(0);
	}else {
	System.out.println("El resultado de su divici�n es= " + (numero1/numero2));
	}
	dato.close();
}
}
