package com;

public class Array4_RMQG {
    public static void main(String[] args) {
		/*
		 * Dado un array de n�meros de 5 posiciones con los siguientes valores:
		 * {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero
		 * con los valores invertidos, es decir, que el segundo array deber� tener los
		 * valores {5,4,3,2,1}
		 */
        int[] numeros = {1, 2, 3, 4, 5};
        int[] numerosInvertidos = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            numerosInvertidos[i] = numeros[numeros.length - 1 - i];
        }

        for (int numero : numerosInvertidos) {
            System.out.println(numero);
        }
    }
}
