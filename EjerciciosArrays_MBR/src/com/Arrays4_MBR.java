package com;

public class Arrays4_MBR {

	public static void main(String[] args) {
		/*4. Dado un array de números de 5 posiciones con los siguientes 
		 * valores: {1,2,3,4,5}. Guardar los valores de este array 
		 * en otro array distinto pero con los valores invertidos, 
		 * es decir, que el segundo array deberá tener los valores {5,4,3,2,1}. */
int[] array={1,2,3,4,5};
        
        int[] array2=new int[array.length];
        
        for(int i=(array.length-1),j=0;i>=0;i--,j++){
           array2[j]=array[i];
           System.out.println(array2[j]);
        }

	}

}
