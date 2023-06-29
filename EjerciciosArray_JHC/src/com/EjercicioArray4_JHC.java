package com;

import java.util.Arrays;
import java.util.Collections;

public class EjercicioArray4_JHC {

	public static void main(String[] args) {
		// 4. Dado un array de números de 5 posiciones con los siguientes valores:
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
		//los valores invertidos, es decir, que el segundo array deberá tener los valores
		//{5,4,3,2,1}.
		
		
			System.out.println("\nPrograma que invierte el primer array \n");
			
		   int[] numeros ={12,13,14,15,16,17};
		   
	        int longitud = numeros.length;
	        
	        //imprimimos el array de partida
	        
	        System.out.println("Array inicial: ");
	        
	        for (int i=0; i<longitud;i++){
	        	
	            System.out.print (numeros[i]+" - ");
	            
	        }
	        System.out.println("\n");
	        
	        //Array invertido: imprimiento el array de atras a adelante
	        
	        System.out.println("Array invertido: ");
	        
	        for (int i=longitud-1; i>=0;i--){
	        	
	            System.out.print (numeros[i]+" - ");
	            
	        }
	        System.out.println("\n");
	        
	    
	}

}

































//test new codigo

//int[] vec1 = {1,2,3,4,5};
//int[] vec2 = new int[5];
//
//for (int i : vec1) {
//    System.out.println(vec1);
//    System.out.println("");
//}
//
//
//
//Arrays.sort([vec1], Collections.reverseOrder());
//
//
//for (int i : vec2) {
//    vec1[i]=vec2[i];
//}
//
//for (int i : vec2) {
//    System.out.println(vec2);
//    System.out.println("");
//}
