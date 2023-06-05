package com;


public class Array5_JOLC {

	public static void main(String[] args) {
	
		
		/*Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		respectivos precios. Muestra en consola la lista de productos y sus precios. 
		Por lo menos 5 productos o artículos*/
		
		  int[] array1 = {1,2, 3, 4, 5};
	        int[] array2 = new int[array1.length];

	        // Copiar los valores invertidos de array1 a array2
	        for (int i = 0; i < array1.length; i++) {
	            array2[i] = array1[array1.length - 1 - i];
	        }

	        // Mostrar array1
	        System.out.print("array1: ");
	        for (int i = 0; i < array1.length; i++) {
	            System.out.print(array1[i] + " ");
	        }

	        // Mostrar array2
	        System.out.print("\narray2: ");
	        for (int i = 0; i < array2.length; i++) {
	            System.out.print(array2[i] + " ");
	        }
	    }
	}