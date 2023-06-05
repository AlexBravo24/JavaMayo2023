package com;

public class Array5_RMQG {
    public static void main(String[] args) {
		/*
		 * Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		 * respectivos precios. Muestra en consola la lista de productos y sus precios.
		 * Por lo menos 5 productos o artículos.
		 */
        String[] productos = {"Papa", "Zanahoria", "Limón", "Acelga", "Plátano"};
        double[] precios = {13.17, 41.55, 17.53, 11.01, 32.15};

        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": $" + precios[i]);
        }
    }
}
