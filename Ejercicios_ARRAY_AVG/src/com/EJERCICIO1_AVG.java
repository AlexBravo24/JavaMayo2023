package com;

import javax.swing.JOptionPane;

public class EJERCICIO1_AVG {

	public static void main(String[] args) {
		/*
		 * Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
		 * Muestra por consola el �ndice y el valor al que corresponde
		 */
		
		final int tama�o=10;
		 
        int num[]=new int[tama�o];
 
        rellenarArray(num);
 
        mostrarArray(num);
    }
 
    public static void rellenarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            String texto=JOptionPane.showInputDialog("Introduce un n�mero");
            lista[i]=Integer.parseInt(texto);
        }
    }
 
    /**
     * @param lista
     */
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
		

	}

}
