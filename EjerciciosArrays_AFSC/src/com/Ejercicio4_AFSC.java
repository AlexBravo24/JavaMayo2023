package com;

import java.util.Arrays;

public class Ejercicio4_AFSC {

	public static void main(String[] args) {
		// Dado un array de números de 5 posiciones con 
		//los siguientes valores: {1,2,3,4,5}. 
		//Guardar los valores de este array en otro array distinto 
		//pero con los valores invertidos, es decir,
		//que el segundo array deberá tener los valores {5,4,3,2,1}.
		
		
		int[] array1={1,2,3,4,5};   
        int[] array2=new int[array1.length];
        //System.out.println(array1.length);
        for(int x=(array1.length-1),y=0;x>=0;x--,y++){
           array2[y]=array1[x];
         //System.out.println(array1[x]+"--->"+array2[y]);
        }
        System.out.println("Posicion original:  "+ Arrays.toString(array1));
        System.out.println("Posicion actual:  "+ Arrays.toString(array2));

	}

}
