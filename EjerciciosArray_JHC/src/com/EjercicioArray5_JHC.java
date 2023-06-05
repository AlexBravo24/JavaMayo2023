package com;

public class EjercicioArray5_JHC {

	public static void main(String[] args) {
		// 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		//respectivos precios. Muestra en consola la lista de productos y sus precios.
		//Por lo menos 5 productos o artículos
		
		System.out.println("Este programa muestra productos con sus respectivos precios");
		
		//productos y precios
		String productos [] = {" celular = ", " tenis = "," laptop = "," teclado = ", " control xbox = "};
		
		 double costo[] = {5.000, 800.00, 17.000, 1.500, 900.00};
		 
		 System.out.println(" Lista de Productos y sus precios ");
		 
		 //ciclo para imprimir la lista
		 
		 for (int p = 0; p < productos.length;p++){
			 
		 System.out.println(costo[p]+ " "+ costo[p]); 
		} 
		 

	}

}
