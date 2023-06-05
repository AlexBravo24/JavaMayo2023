package com;

public class Arrays_JDMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numeros= new int[11]; //Dimensiones de array
//Empieza de 0
//como pedemos guardar datos en cada posicion del  array
	numeros[0]=0;
	numeros[1]=1;
	numeros[2]=2;
	numeros[3]=3;
	numeros[4]=4;
	numeros[5]=5;
	numeros[6]=6;
	numeros[7]=7;
	numeros[8]=8;
	numeros[9]=9;
	numeros[10]=10;
	System.out.println(numeros[7]);
	
	//Otra manera de declarar un Array es mediante el uso de las llaves

	int [] numeros2= {1,2,3,4,5,6,7,8,9,10};
	System.out.println(numeros2[9]);
	//Declarar un array de caracteres
	 char[] letras = {'A','l','e','x'};
	 String nombre;
	 
	 //IMPRIMIR TODOS LOS VALORES DE UN ARREGLO
	 System.out.println(letras);
	 
	 for (int i = 0; i < numeros.length; i++) {
		System.out.println(numeros[i]);
	//FUNCIONA TAMBIEN CON UN WHILE
		int x=0;
		while (x<numeros2.length) {
			System.out.println(numeros2[x]);
			x++;
		}
	 
	 }
	 
	}

}
