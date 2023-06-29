package com;

public class Arrays5_BCA {

	/*Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
respectivos precios. Muestra en consola la lista de productos y sus precios. 
Por lo menos 5 productos o artículos
	 */
	public static void main(String[] args) {
		
		String[] productos = {"Camiseta", "Pantalón", "Chamarra", "Zapatillas", "Gorra"};

   
        double[] precios = {25.99, 129.99, 89.92, 59.99, 64.99};

        
        System.out.println("Productos:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": $" + precios[i]);
        }

	}

}
