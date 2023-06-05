package com;

public class Array_BCA {

	public static void main(String[] args) {
		// Los arrays o arreglos son una estructura de datos que
		//nos permite almacenar un tipo de datos en comun
		//Una vez declarado su tamaño, este no puede cambiar o crecer
		//en tiempo de ejecucion
		
		//declaracopn de un array con su tamaño declarado igualmente
		
		int [] numeros = new int [10];//Array declarado
		//con su tamaño 
		
		//[1] [2] [3] [4] [5] [6] [7] [8] [9] [10]
		//Por indice, la primera pocicion donde guardamos el primer valor es 
		//en la posicion 0
		
numeros[0]=1;
numeros[1]=2;
numeros[2]=3;
numeros[3]=4;
numeros[4]=5;
numeros[5]=6;
numeros[6]=11;
numeros[7]=12;
numeros[8]=13;
numeros[9]=14;
//Darle salida en consola a una determinada posicion del array
//para obtener un valor determinado


System.out.println(numeros[6]);

//otra manera de declarar e iniciar un array, incliso con
//sus valores

int[] numeros2 = {1,2,3,4,5,6,7,8,9,10};
System.out.println(numeros2[9]);

//Declarar un array de caracteres

char[] letras = {'B','e','n','i','g','n','o'};

String nombre = "Benigno";


//Imprimir todod los valores de u array en consola
System.out.println(letras);

for (int i = 0; i < numeros.length; i++) {
	System.out.println(numeros[i]);
	
	
}

//Funciona tambien con whle

int x = 0; //Tengo una variable que me va a ayodar
//a iterar conforme su valor cambie

while(x<numeros2.length) {//Mientras x sea menor al tamaño 
	//de my array
	System.out.println(numeros[x]);
	x++;//Realizar un incremento para que no tienda al infinito
	//y se impriman los otros valores
}




	}

}
