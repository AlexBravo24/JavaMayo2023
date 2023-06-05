package com;

import javax.swing.JOptionPane;

public class Arrays1_MBR {

	public static void main(String[] args) {
		/*1. Crea un array de 10 posiciones de números con 
		 * valores pedidos por teclado.Muestra por consola el 
		 * índice y el valor al que corresponde.*/
		
				int [] numeros = new int [10];
        
        rellenarArray(numeros);
 
        mostrarArray(numeros);
    }
 
    public static void rellenarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            String texto=JOptionPane.showInputDialog("Ingresa un número");
            lista[i]=Integer.parseInt(texto);
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("El indice "+i+" contiene el valor "+lista[i]);
        }
	}

}
