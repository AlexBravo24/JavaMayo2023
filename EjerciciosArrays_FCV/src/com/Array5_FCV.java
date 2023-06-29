package com;

public class Array5_FCV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Crea dos arrays, uno para mostrar n productos 
		y otro para mostrar sus respectivos precios.
		Muestra en consola la lista de productos y sus precios.
		Por lo menos 5 productos o artículos.*/
		
		double precios []= {13.20,32.50,12.00,66.80,100.00,35.55,10.00};
		int producto[]= {1,2,3,4,5,6,7};
		System.out.println("Lista de productos y precios");
		for(int i=0; i<7; i++) {
			System.out.println("Producto No. "+producto[i]+". Precio $ "+precios[i]);
		}

	}

}
