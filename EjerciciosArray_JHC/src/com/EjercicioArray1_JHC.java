package com;

import javax.swing.JOptionPane;

public class EjercicioArray1_JHC {
	
	

	public static void main(String[] args) {
		// 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.

		
		
		
		final int dim = 10; // limite del arreglo
		
		int num [] = new int[dim]; //datos que se van a usar para almacenar en los array
		
		rellenarArray(num); //Rellna los valores de los array
		mostrarArray(num);	//Mostrar el arraw3
		
	}
	    

	

	private static void rellenarArray(int lista[]) {
		// sentencia para rellenar los valores del array
		for (int i = 0; i < lista.length; i++) {
			String texto = JOptionPane.showInputDialog("Introduce 10 Números");	//pedir 10 numeros con joption con caja de texto en pantalla
			lista[i] = Integer.parseInt(texto); //almacenarlos en la variable lista
		}
	}
												
	
		private static void mostrarArray(int lista[]) {
			// sentencia para mostrar los datos contenidos en el array
			for (int i = 0; i < lista.length; i++) {	//ciclo for para mostrar los datos
				System.out.println("En el indice " + i + " esta el valor " + lista[i]); //linea para imprimir los datos en pantalla terminal
			}
		}
		
}	
		


		/*final int tam=10;
		 
        int num[]=new int[tam];
 
        rellenarArray(num);
 
        mostrarArray(num);
    }
 
    public static void rellenarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            String texto=JOptionPane.showInputDialog("Introduce 10 Números");
            lista[i]=Integer.parseInt(texto);
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);*/
		
	




