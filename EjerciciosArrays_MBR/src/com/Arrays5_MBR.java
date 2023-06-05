package com;

public class Arrays5_MBR {

	public static void main(String[] args) {
		/*5. Crea dos arrays, uno para mostrar n productos y 
		 * otro para mostrar sus respectivos precios. 
		 * Muestra en consola la lista de productos y sus precios. 
		 * Por lo menos 5 productos o artículos.*/
		String utiles []={"mouse $", "teclado $","audifonos $","bocina $"};
		 double precios[]={199.0,400.90,800.00,1000,.00};
		 
		 
		 for (int u=0;u<utiles.length;u++){
		 System.out.println(utiles[u]+ " "+ precios[u]); 
		} 

	}

}
