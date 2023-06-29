package com;

import java.util.Arrays;

public class Arrays4_BCA {

	/*
	 * Dado un array de números de 5 posiciones con los siguientes valores:
{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
los valores invertidos, es decir, que el segundo array deberá tener los valores 
{5,4,3,2,1}.
	 */
	public static void main(String[] args) {
		
        int[] numerosOriginales = {1, 2, 3, 4, 5};

       
        int[] numerosInversos = new int[5];

        
        int index = 0;
        for (int i = numerosOriginales.length - 1; i >= 0; i--) {
            numerosInversos[index] = numerosOriginales[i];
            index++;
        }

       
        System.out.println("Array original: " + Arrays.toString(numerosOriginales));
        System.out.println("Array inverso: " + Arrays.toString(numerosInversos));

	}

}
